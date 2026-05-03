package huutai.dev.meetmino.view_model

import huutai.dev.meetmino.model.Response
import huutai.dev.meetmino.service.api.ErrorRes

data class ResponseState(
    val error: ErrorRes? = null,
    val response: Response? = null,
    val isLoading: Boolean = false,
)

data class  ResponseDataState<T>(
    val error: ErrorRes? = null,
    val data: T? = null,
    val isLoading: Boolean = false,
)


