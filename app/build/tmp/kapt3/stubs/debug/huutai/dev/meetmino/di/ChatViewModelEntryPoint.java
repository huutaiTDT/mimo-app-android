package huutai.dev.meetmino.di;

import huutai.dev.meetmino.view_model.ChatViewModel;
import huutai.dev.meetmino.view_model.UserViewModel;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lhuutai/dev/meetmino/di/ChatViewModelEntryPoint;", "", "chatViewModel", "Lhuutai/dev/meetmino/view_model/ChatViewModel;", "app_debug"})
@dagger.hilt.EntryPoint()
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public abstract interface ChatViewModelEntryPoint {
    
    @org.jetbrains.annotations.NotNull()
    public abstract huutai.dev.meetmino.view_model.ChatViewModel chatViewModel();
}