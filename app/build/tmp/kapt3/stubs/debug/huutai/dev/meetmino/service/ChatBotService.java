package huutai.dev.meetmino.service;

import huutai.dev.meetmino.model.ChatBotResponse;
import huutai.dev.meetmino.model.ChatWithBotBody;
import huutai.dev.meetmino.model.SuggestQuestion;
import retrofit2.http.Body;
import retrofit2.http.POST;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u00a7@\u00a2\u0006\u0002\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lhuutai/dev/meetmino/service/ChatBotService;", "", "chatBox", "Lhuutai/dev/meetmino/model/ChatBotResponse;", "body", "Lhuutai/dev/meetmino/model/ChatWithBotBody;", "(Lhuutai/dev/meetmino/model/ChatWithBotBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "chatDashboard", "", "Lhuutai/dev/meetmino/model/SuggestQuestion;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface ChatBotService {
    
    @retrofit2.http.POST(value = "ai/chat-dashboard")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object chatDashboard(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<huutai.dev.meetmino.model.SuggestQuestion>> $completion);
    
    @retrofit2.http.POST(value = "ai/chat-box")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object chatBox(@retrofit2.http.Body()
    @org.jetbrains.annotations.NotNull()
    huutai.dev.meetmino.model.ChatWithBotBody body, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super huutai.dev.meetmino.model.ChatBotResponse> $completion);
}