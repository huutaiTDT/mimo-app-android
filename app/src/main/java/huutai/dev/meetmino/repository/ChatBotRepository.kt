package huutai.dev.meetmino.repository



import Resource
import huutai.dev.meetmino.model.ChatBotResponse
import huutai.dev.meetmino.model.ChatWithBotBody
import huutai.dev.meetmino.model.SuggestQuestion
import huutai.dev.meetmino.service.ChatBotService
import huutai.dev.meetmino.service.api.safeApiCall
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class ChatBotRepository @Inject constructor(
    private val service: ChatBotService
) {
    fun chatDashboard(): Flow<Resource<List<SuggestQuestion>>> =
        safeApiCall { service.chatDashboard() }

    fun chatBox(body: ChatWithBotBody): Flow<Resource<ChatBotResponse>> =
        safeApiCall { service.chatBox(body) }
}
