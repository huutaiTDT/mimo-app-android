package huutai.dev.meetmino.service.api

import Resource
import Resource.Error
import Resource.Loading
import Resource.Success
import android.content.Context
import android.content.SharedPreferences
import huutai.dev.meetmino.BuildConfig
import huutai.dev.meetmino.core.logging.Logger
import huutai.dev.meetmino.core.network.config.NetworkConfig
import huutai.dev.meetmino.helper.TokenManager
import huutai.dev.meetmino.service.AuthService
import huutai.dev.meetmino.service.ChatBotService
import huutai.dev.meetmino.service.CommonService
import huutai.dev.meetmino.service.LocationService
import huutai.dev.meetmino.service.PlanTripService
import huutai.dev.meetmino.service.PostService
import huutai.dev.meetmino.service.UserSubscriptionService
import com.google.gson.Gson
import com.google.gson.JsonSyntaxException
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import okhttp3.logging.HttpLoggingInterceptor
import okio.Buffer
import retrofit2.HttpException
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.io.IOException
import java.util.concurrent.TimeUnit
import javax.inject.Inject
import javax.inject.Singleton

class TokenProvider @Inject constructor(
    private val sharedPreferences: SharedPreferences
) {
    fun getToken(): String? {
        return TokenManager.getInstance().getAccessToken()
    }
}

class TokenInterceptor(
    private val tokenProvider: TokenProvider,
    private val logger: Logger
) : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val token = tokenProvider.getToken()
        val requestBuilder = chain.request().newBuilder()

        token?.let {
            requestBuilder.addHeader("Authorization", "Bearer $it")
            logger.d("TokenInterceptor", "Token added to request")
        } ?: run {
            logger.i("TokenInterceptor", "No token available")
        }

        return chain.proceed(requestBuilder.build())
    }
}

class ApiLoggerInterceptor(private val logger: Logger) : Interceptor {
    @Throws(IOException::class)
    override fun intercept(chain: Interceptor.Chain): Response {
        val request: Request = chain.request()

        if (BuildConfig.ENABLE_LOGGING) {
            val requestBody = request.body
            val bodyString = requestBody?.let {
                val buffer = Buffer()
                it.writeTo(buffer)
                buffer.readUtf8()
            } ?: "No Body"

            logger.d("API_REQUEST", "➡️ ${request.method} ${request.url}")
            logger.v("API_REQUEST", "Body: $bodyString")

            val response = chain.proceed(request)
            val responseBody = response.body
            val responseBodyString = responseBody?.string() ?: "No Body"

            logger.d("API_RESPONSE", "⬅️ ${response.code} ${response.message}")
            logger.v("API_RESPONSE", "Body: $responseBodyString")

            // Clone response body
            val newResponseBody = responseBodyString.toByteArray().let {
                okhttp3.ResponseBody.create(responseBody?.contentType(), it)
            }

            return response.newBuilder().body(newResponseBody).build()
        } else {
            return chain.proceed(request)
        }
    }
}

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Provides
    @Singleton
    fun provideSharedPreferences(@ApplicationContext context: Context): SharedPreferences {
        TokenManager.init(context)
        return context.getSharedPreferences("app_prefs", Context.MODE_PRIVATE)
    }

    @Provides
    @Singleton
    fun provideTokenProvider(sharedPreferences: SharedPreferences): TokenProvider {
        return TokenProvider(sharedPreferences)
    }

    @Provides
    @Singleton
    fun provideHttpLoggingInterceptor(): HttpLoggingInterceptor {
        return HttpLoggingInterceptor().apply {
            level = if (BuildConfig.DEBUG) HttpLoggingInterceptor.Level.BODY
            else HttpLoggingInterceptor.Level.NONE
        }
    }

    @Provides
    @Singleton
    fun provideOkHttpClient(
        loggingInterceptor: HttpLoggingInterceptor,
        tokenProvider: TokenProvider,
        logger: Logger
    ): OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor(loggingInterceptor)
            .addInterceptor(ApiLoggerInterceptor(logger))
            .addInterceptor(TokenInterceptor(tokenProvider, logger))
            .connectTimeout(NetworkConfig.CONNECT_TIMEOUT_SECONDS, TimeUnit.SECONDS)
            .readTimeout(NetworkConfig.READ_TIMEOUT_SECONDS, TimeUnit.SECONDS)
            .writeTimeout(NetworkConfig.WRITE_TIMEOUT_SECONDS, TimeUnit.SECONDS)
            .build()
    }

    @Provides
    @Singleton
    fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder()
            .baseUrl(NetworkConfig.BASE_URL)
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    @Singleton
    fun provideAuthService(retrofit: Retrofit): AuthService {
        return retrofit.create(AuthService::class.java)
    }
    
    @Provides
    @Singleton
    fun provideLocationService(retrofit: Retrofit): LocationService {
        return retrofit.create(LocationService::class.java)
    }
    
    @Provides
    @Singleton
    fun provideCommonService(retrofit: Retrofit): CommonService {
        return retrofit.create(CommonService::class.java)
    }

    @Provides
    @Singleton
    fun provideChatBotService(retrofit: Retrofit): ChatBotService {
        return retrofit.create(ChatBotService::class.java)
    }

    @Provides
    @Singleton
    fun providePlanTripService(retrofit: Retrofit): PlanTripService {
        return retrofit.create(PlanTripService::class.java)
    }

    @Provides
    @Singleton
    fun providePostService(retrofit: Retrofit): PostService {
        return retrofit.create(PostService::class.java)
    }

    @Provides
    @Singleton
    fun provideUserSubscriptionService(retrofit: Retrofit): UserSubscriptionService {
        return retrofit.create(UserSubscriptionService::class.java)
    }
}

data class ErrorRes(
    val message: String,
    val statusCode: Int? = 0,
    val timestamp: String= "",
    val name: String = ""
)

fun parseJsonError(errorString: String): ErrorRes? {
    val jsonPart = errorString.substringAfter("Error: ").trim()
    return try {
        Gson().fromJson(jsonPart, ErrorRes::class.java)
    } catch (e: JsonSyntaxException) {
        return null
    }

}

inline fun <T> safeApiCall(
    crossinline apiCall: suspend () -> T
): Flow<Resource<T>> = flow {
    emit(Loading())

    try {
        val response = apiCall()
        emit(Success(response))
    } catch (e: HttpException) {
        val errorBody = e.response()?.errorBody()?.string()
        val statusCode = e.code()
        val message = errorBody ?: e.message()

        emit(Error(message = "Error: $message", statusCode = statusCode))
    } catch (e: IOException) {
        emit(Error(message = "Couldn't reach server. Check your internet connection."))
    } catch (e: Exception) {
        emit(Error(message = "An unexpected error occurred: ${e.message}"))
    }
}
