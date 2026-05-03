package huutai.dev.meetmino.service


import huutai.dev.meetmino.model.DashboardModel
import retrofit2.http.GET


interface CommonService {
    @GET("common/dashboard")
    suspend fun dashboard(): DashboardModel
}

