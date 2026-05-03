package huutai.dev.meetmino.repository



import Resource
import huutai.dev.meetmino.model.DashboardModel
import huutai.dev.meetmino.service.CommonService
import huutai.dev.meetmino.service.api.safeApiCall
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class CommonRepository @Inject constructor(
    private val service: CommonService
) {
    fun dashboard(): Flow<Resource<DashboardModel>> =
        safeApiCall { service.dashboard() }
}
