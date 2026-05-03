package huutai.dev.meetmino.service


import huutai.dev.meetmino.model.Pagination
import huutai.dev.meetmino.model.PaginationResponse
import huutai.dev.meetmino.model.PlanTripQuestionResponse
import huutai.dev.meetmino.model.PlanTripRes
import huutai.dev.meetmino.model.SaveTripResponse
import huutai.dev.meetmino.model.Trip
import huutai.dev.meetmino.model.TripDirection
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path


interface PlanTripService {
    @GET("plan-trip/load-question-to-collect")
    suspend fun loadQuestionToCollect(): List<PlanTripQuestionResponse>


    @POST("plan-trip/plan-trip")
    suspend fun planTrip(@Body()body: Any): PlanTripRes

    @POST("plan-trip/save-trip")
    suspend fun saveTrip(@Body()body: Any): SaveTripResponse

    @POST("plan-trip/pagination-trip-user")
    suspend fun paginationTripUser(@Body()pagination: Pagination<Any>): PaginationResponse<Trip>

    @GET("plan-trip/{id}")
    suspend fun detail(@Path("id") id: String): Trip

    @POST("plan-trip/trip-direction")
    suspend fun tripDirection(@Body()body: Any): TripDirection

}

