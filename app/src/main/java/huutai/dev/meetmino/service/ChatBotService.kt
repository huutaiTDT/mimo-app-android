package huutai.dev.meetmino.service


import huutai.dev.meetmino.model.ChatBotResponse
import huutai.dev.meetmino.model.ChatWithBotBody
import huutai.dev.meetmino.model.SuggestQuestion
import retrofit2.http.Body
import retrofit2.http.POST


interface ChatBotService {
    @POST("ai/chat-dashboard")
    suspend fun chatDashboard(): List<SuggestQuestion>


    @POST("ai/chat-box")
    suspend fun chatBox(@Body() body: ChatWithBotBody): ChatBotResponse
}

