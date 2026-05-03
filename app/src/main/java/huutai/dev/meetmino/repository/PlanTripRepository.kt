package huutai.dev.meetmino.repository



import Resource
import huutai.dev.meetmino.model.Pagination
import huutai.dev.meetmino.model.PaginationResponse
import huutai.dev.meetmino.model.PlanTripQuestionResponse
import huutai.dev.meetmino.model.PlanTripRes
import huutai.dev.meetmino.model.SaveTripResponse
import huutai.dev.meetmino.model.Trip
import huutai.dev.meetmino.model.TripDirection
import huutai.dev.meetmino.service.PlanTripService
import huutai.dev.meetmino.service.api.safeApiCall
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class PlanTripRepository @Inject constructor(
    private val service: PlanTripService
) {
    fun loadQuestionToCollect(): Flow<Resource<List<PlanTripQuestionResponse>>> =
        safeApiCall { service.loadQuestionToCollect() }


    fun planTrip(body: Any): Flow<Resource<PlanTripRes>> =
        safeApiCall { service.planTrip(body) }


    fun saveTrip(body: Any): Flow<Resource<SaveTripResponse>> =
        safeApiCall { service.saveTrip(body) }

    fun tripDirection(body: Any): Flow<Resource<TripDirection>> =
        safeApiCall { service.tripDirection(body) }

    fun paginationTripUser(body: Pagination<Any>): Flow<Resource<PaginationResponse<Trip>>> =
        safeApiCall { service.paginationTripUser(body) }



    fun detail(id: String): Flow<Resource<Trip>> =
        safeApiCall { service.detail(id) }


}
