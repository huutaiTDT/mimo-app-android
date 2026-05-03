package huutai.dev.meetmino.view_model;

import android.util.Log;
import androidx.lifecycle.ViewModel;
import huutai.dev.meetmino.model.ChatBotResponse;
import huutai.dev.meetmino.model.ChatWithBotBody;
import huutai.dev.meetmino.model.SuggestQuestion;
import huutai.dev.meetmino.repository.ChatBotRepository;
import kotlinx.coroutines.flow.StateFlow;
import javax.inject.Inject;
import javax.inject.Singleton;

@javax.inject.Singleton()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0013J\u0006\u0010\u0017\u001a\u00020\u0013R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00070\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f\u00a8\u0006\u0018"}, d2 = {"Lhuutai/dev/meetmino/view_model/ChatViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lhuutai/dev/meetmino/repository/ChatBotRepository;", "(Lhuutai/dev/meetmino/repository/ChatBotRepository;)V", "_chatState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lhuutai/dev/meetmino/view_model/ResponseDataState;", "Lhuutai/dev/meetmino/model/ChatBotResponse;", "_suggestQuestionState", "", "Lhuutai/dev/meetmino/model/SuggestQuestion;", "chatState", "Lkotlinx/coroutines/flow/StateFlow;", "getChatState", "()Lkotlinx/coroutines/flow/StateFlow;", "suggestQuestionState", "getSuggestQuestionState", "chatBox", "", "body", "Lhuutai/dev/meetmino/model/ChatWithBotBody;", "chatDashboard", "clearState", "app_debug"})
public final class ChatViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final huutai.dev.meetmino.repository.ChatBotRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<huutai.dev.meetmino.view_model.ResponseDataState<huutai.dev.meetmino.model.ChatBotResponse>> _chatState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<huutai.dev.meetmino.view_model.ResponseDataState<huutai.dev.meetmino.model.ChatBotResponse>> chatState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<huutai.dev.meetmino.view_model.ResponseDataState<java.util.List<huutai.dev.meetmino.model.SuggestQuestion>>> _suggestQuestionState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<huutai.dev.meetmino.view_model.ResponseDataState<java.util.List<huutai.dev.meetmino.model.SuggestQuestion>>> suggestQuestionState = null;
    
    @javax.inject.Inject()
    public ChatViewModel(@org.jetbrains.annotations.NotNull()
    huutai.dev.meetmino.repository.ChatBotRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<huutai.dev.meetmino.view_model.ResponseDataState<huutai.dev.meetmino.model.ChatBotResponse>> getChatState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<huutai.dev.meetmino.view_model.ResponseDataState<java.util.List<huutai.dev.meetmino.model.SuggestQuestion>>> getSuggestQuestionState() {
        return null;
    }
    
    public final void chatDashboard() {
    }
    
    public final void chatBox(@org.jetbrains.annotations.NotNull()
    huutai.dev.meetmino.model.ChatWithBotBody body) {
    }
    
    public final void clearState() {
    }
}