package huutai.dev.meetmino.repository

import Resource
import huutai.dev.meetmino.model.AuthData
import huutai.dev.meetmino.model.GetUserInfoModel
import huutai.dev.meetmino.model.LoginModel
import huutai.dev.meetmino.model.RegisterModel
import huutai.dev.meetmino.model.ResendCodeModel
import huutai.dev.meetmino.model.Response
import huutai.dev.meetmino.model.VerifyModel
import huutai.dev.meetmino.service.AuthService
import huutai.dev.meetmino.service.api.safeApiCall
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class AuthRepository @Inject constructor(
    private val service: AuthService
) {

    fun signUp(
        body: RegisterModel
    ): Flow<Resource<Response<String>>> =
        safeApiCall {
            service.signUp(body)
        }

    fun verify(
        body: VerifyModel
    ): Flow<Resource<Response<String>>> =
        safeApiCall {
            service.verify(body)
        }

    fun resendVerifyCode(
        body: ResendCodeModel
    ): Flow<Resource<Response<String>>> =
        safeApiCall {
            service.resendVerCode(body)
        }

    fun login(
        body: LoginModel
    ): Flow<Resource<AuthData>> =
        safeApiCall {
            service.login(body)
        }

    fun userInfo(
        body: GetUserInfoModel
    ): Flow<Resource<AuthData>> =
        safeApiCall {
            service.userDetail(body)
        }
}