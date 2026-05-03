package huutai.dev.meetmino.view_model


import androidx.lifecycle.ViewModel
import huutai.dev.meetmino.helper.TokenManager
import huutai.dev.meetmino.model.AuthData
import huutai.dev.meetmino.model.PricingPlanModel
import huutai.dev.meetmino.model.User
import kotlinx.coroutines.flow.MutableStateFlow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UserViewModel @Inject constructor() : ViewModel() {

    private val _authState = MutableStateFlow<AuthData?>(null)
    val authState: MutableStateFlow<AuthData?> = _authState

    fun updateAuthData(authData: AuthData) {
        _authState.value = AuthData(
            accessToken = authData.accessToken,
            refreshToken = authData.refreshToken,
            enumData = authData.enumData,
            user = authData.user
        )
        android.util.Log.d("UserViewModel", "✅ Auth updated: $authData")
        android.util.Log.d("UserViewModel", "✅ Access token: ${authData.accessToken}")
        /// save token
        TokenManager.getInstance().saveTokens(
            refreshToken = authData.refreshToken,
            accessToken = authData.accessToken
        )

    }

    fun getUser() : User? {
        return _authState.value?.user
    }

    fun getSuggestPricingPlan() : PricingPlanModel? {
        return this.getUser()?.pricingPlanSuggest
    }
    fun getAccessToken(): String? {
        return _authState.value?.accessToken
    }

    fun logout() {
        _authState.value = null
        TokenManager.getInstance().clearTokens()
    }

}
