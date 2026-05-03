package huutai.dev.meetmino.repository



import Resource
import android.util.Log
import huutai.dev.meetmino.model.Location
import huutai.dev.meetmino.model.Pagination
import huutai.dev.meetmino.model.PaginationLocation
import huutai.dev.meetmino.model.PaginationResponse
import huutai.dev.meetmino.service.LocationService
import huutai.dev.meetmino.service.api.safeApiCall
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class LocationRepository @Inject constructor(
    private val service: LocationService
) {
    fun locationTop10(): Flow<Resource<List<Location>>> =
        safeApiCall { service.locationTop10() }

    fun findByLabel(label: String) : Flow<Resource<Location>> =
        safeApiCall {
            service.findByLabel(label)
        }

    fun pagination(body: Pagination<PaginationLocation>) : Flow<Resource<PaginationResponse<Location>>> =
        safeApiCall {
            service.pagination(body)
        }

    fun detail(id: String) : Flow<Resource<Location>> =
        safeApiCall {
            service.detail(id)
        }


    fun find(): Flow<Resource<List<Location>>> =
        safeApiCall {
            val result = service.find()
            Log.d("API_RESPONSE", result.toString())
            result
        }
}
