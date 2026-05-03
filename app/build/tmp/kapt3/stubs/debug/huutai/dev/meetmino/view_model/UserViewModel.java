package huutai.dev.meetmino.view_model;

import androidx.lifecycle.ViewModel;
import huutai.dev.meetmino.helper.TokenManager;
import huutai.dev.meetmino.model.AuthData;
import huutai.dev.meetmino.model.PricingPlanModel;
import huutai.dev.meetmino.model.User;
import javax.inject.Inject;
import javax.inject.Singleton;

@javax.inject.Singleton()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u0004\u0018\u00010\nJ\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0005R\u0016\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0013"}, d2 = {"Lhuutai/dev/meetmino/view_model/UserViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_authState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lhuutai/dev/meetmino/model/AuthData;", "authState", "getAuthState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "getAccessToken", "", "getSuggestPricingPlan", "Lhuutai/dev/meetmino/model/PricingPlanModel;", "getUser", "Lhuutai/dev/meetmino/model/User;", "logout", "", "updateAuthData", "authData", "app_debug"})
public final class UserViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<huutai.dev.meetmino.model.AuthData> _authState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<huutai.dev.meetmino.model.AuthData> authState = null;
    
    @javax.inject.Inject()
    public UserViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableStateFlow<huutai.dev.meetmino.model.AuthData> getAuthState() {
        return null;
    }
    
    public final void updateAuthData(@org.jetbrains.annotations.NotNull()
    huutai.dev.meetmino.model.AuthData authData) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final huutai.dev.meetmino.model.User getUser() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final huutai.dev.meetmino.model.PricingPlanModel getSuggestPricingPlan() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAccessToken() {
        return null;
    }
    
    public final void logout() {
    }
}