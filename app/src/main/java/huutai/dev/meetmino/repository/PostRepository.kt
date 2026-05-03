package huutai.dev.meetmino.repository



import Resource
import huutai.dev.meetmino.model.Pagination
import huutai.dev.meetmino.model.PaginationResponse
import huutai.dev.meetmino.model.Post
import huutai.dev.meetmino.model.Response
import huutai.dev.meetmino.service.PostService
import huutai.dev.meetmino.service.api.safeApiCall
import kotlinx.coroutines.flow.Flow
import okhttp3.MultipartBody
import okhttp3.RequestBody
import javax.inject.Inject

class PostRepository @Inject constructor(
    private val service: PostService
) {
    fun createPost(caption: RequestBody, imgs: List<MultipartBody.Part>?): Flow<Resource<Response>> =
        safeApiCall { service.createPost(caption, imgs) }

    fun pagination(body: Pagination<Any>) : Flow<Resource<PaginationResponse<Post>>> =
        safeApiCall {
            service.pagination(body)
        }

}

