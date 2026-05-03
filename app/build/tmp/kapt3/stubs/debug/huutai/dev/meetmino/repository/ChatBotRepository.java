package huutai.dev.meetmino.repository;

import huutai.dev.meetmino.model.ChatBotResponse;
import huutai.dev.meetmino.model.ChatWithBotBody;
import huutai.dev.meetmino.model.SuggestQuestion;
import huutai.dev.meetmino.service.ChatBotService;
import kotlinx.coroutines.flow.Flow;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\nJ\u0018\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u00070\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lhuutai/dev/meetmino/repository/ChatBotRepository;", "", "service", "Lhuutai/dev/meetmino/service/ChatBotService;", "(Lhuutai/dev/meetmino/service/ChatBotService;)V", "chatBox", "Lkotlinx/coroutines/flow/Flow;", "LResource;", "Lhuutai/dev/meetmino/model/ChatBotResponse;", "body", "Lhuutai/dev/meetmino/model/ChatWithBotBody;", "chatDashboard", "", "Lhuutai/dev/meetmino/model/SuggestQuestion;", "app_debug"})
public final class ChatBotRepository {
    @org.jetbrains.annotations.NotNull()
    private final huutai.dev.meetmino.service.ChatBotService service = null;
    
    @javax.inject.Inject()
    public ChatBotRepository(@org.jetbrains.annotations.NotNull()
    huutai.dev.meetmino.service.ChatBotService service) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<Resource<java.util.List<huutai.dev.meetmino.model.SuggestQuestion>>> chatDashboard() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<Resource<huutai.dev.meetmino.model.ChatBotResponse>> chatBox(@org.jetbrains.annotations.NotNull()
    huutai.dev.meetmino.model.ChatWithBotBody body) {
        return null;
    }
}