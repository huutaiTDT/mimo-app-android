package huutai.dev.meetmino.service


import huutai.dev.meetmino.model.Pagination
import huutai.dev.meetmino.model.PaginationResponse
import huutai.dev.meetmino.model.Post
import huutai.dev.meetmino.model.Response
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.http.Body
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.Part


interface PostService {
    @Multipart
    @POST("mobile/post/create")
    suspend fun createPost(
        @Part("content") caption: RequestBody,
        @Part imgs: List<MultipartBody.Part>?
    ): Response

    @POST("mobile/post/pagination")
    suspend fun pagination(@Body() pagination: Pagination<Any>): PaginationResponse<Post>

}

