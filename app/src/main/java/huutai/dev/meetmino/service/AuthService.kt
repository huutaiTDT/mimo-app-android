package huutai.dev.meetmino.service


import huutai.dev.meetmino.model.AuthData
import huutai.dev.meetmino.model.GetUserInfoModel
import huutai.dev.meetmino.model.LoginModel
import huutai.dev.meetmino.model.RegisterModel
import huutai.dev.meetmino.model.ResendCodeModel
import huutai.dev.meetmino.model.Response
import huutai.dev.meetmino.model.VerifyModel
import retrofit2.http.Body
import retrofit2.http.POST


interface AuthService {
    @POST("auth/sign-up")
    suspend fun signUp(@Body() body: RegisterModel): Response<String>


    @POST("auth/sign-in")
    suspend fun login(@Body() body: LoginModel): AuthData

    @POST("auth/resend-verification-code")
    suspend fun resendVerCode(@Body() body: ResendCodeModel): Response<String>

    @POST("auth/verify")
    suspend fun verify(@Body() body: VerifyModel): Response<String>

    @POST("user/detail")
    suspend fun userDetail(@Body() body: GetUserInfoModel): AuthData
}

