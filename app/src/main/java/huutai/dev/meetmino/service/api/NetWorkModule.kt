package huutai.dev.meetmino.service.api

import Resource
import Resource.Error
import Resource.Loading
import Resource.Success
import com.google.gson.Gson
import com.google.gson.JsonSyntaxException
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException

data class ErrorRes(
    val message: String = "",
    val statusCode: Int? = 0,
    val timestamp: String = "",
    val name: String = ""
)

fun parseJsonError(errorString: String): ErrorRes? {
    return try {
        Gson().fromJson(errorString, ErrorRes::class.java)
    } catch (e: JsonSyntaxException) {
        null
    }
}

/**
 * Generic safe api call
 * Works with:
 * Response<String>
 * Response<Unit>
 * AuthData
 * List<T>
 * Any model
 */
inline fun <reified T> safeApiCall(
    crossinline apiCall: suspend () -> T
): Flow<Resource<T>> = flow {

    emit(Loading())

    try {
        val response = apiCall()
        emit(Success(response))

    } catch (e: HttpException) {

        val errorBody =
            e.response()?.errorBody()?.string().orEmpty()

        emit(
            Error(
                message = errorBody.ifBlank {
                    e.message()
                },
                statusCode = e.code()
            )
        )

    } catch (e: IOException) {

        emit(
            Error(
                message = "Couldn't reach server. Check internet connection."
            )
        )

    } catch (e: Exception) {

        emit(
            Error(
                message = e.message ?: "Unexpected error"
            )
        )
    }
}