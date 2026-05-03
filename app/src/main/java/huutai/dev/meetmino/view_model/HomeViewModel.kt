package huutai.dev.meetmino.view_model

import Resource
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import huutai.dev.meetmino.model.DashboardModel
import huutai.dev.meetmino.repository.CommonRepository
import huutai.dev.meetmino.service.api.parseJsonError
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class HomeViewModel @Inject constructor(
    private val repository: CommonRepository
) : ViewModel() {

    private val _homeState = MutableStateFlow(ResponseDataState<DashboardModel>(isLoading = true))
    val homeState: StateFlow<ResponseDataState<DashboardModel>> = _homeState

    fun fetchTop10Locations() {
        repository.dashboard()
            .onEach { result ->
                _homeState.value = when (result) {
                    is Resource.Success -> {
                        // Removed artificial delay(1000) - let API response speed drive UX
                        ResponseDataState(data = result.data)
                    }
                    is Resource.Error -> {
                        result.message?.let { Log.i("API", it) }
                        val error = result.message?.let { parseJsonError(it) }
                        ResponseDataState(error = error)
                    }
                    is Resource.Loading -> ResponseDataState(isLoading = true)
                    else -> {
                        ResponseDataState()
                    }
                }
            }
            .launchIn(viewModelScope)
    }
}
