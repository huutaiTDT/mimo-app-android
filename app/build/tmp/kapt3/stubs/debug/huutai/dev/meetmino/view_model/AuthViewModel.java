package huutai.dev.meetmino.view_model;

import android.util.Log;
import androidx.lifecycle.ViewModel;
import huutai.dev.meetmino.model.AuthData;
import huutai.dev.meetmino.model.GetUserInfoModel;
import huutai.dev.meetmino.model.LoginModel;
import huutai.dev.meetmino.model.RegisterModel;
import huutai.dev.meetmino.model.ResendCodeModel;
import huutai.dev.meetmino.model.VerifyModel;
import huutai.dev.meetmino.repository.AuthRepository;
import huutai.dev.meetmino.service.api.ErrorRes;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.flow.StateFlow;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020#J&\u0010$\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020&2\u0006\u0010(\u001a\u00020&2\u0006\u0010)\u001a\u00020&J\u000e\u0010*\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020+J\u000e\u0010,\u001a\u00020\u001d2\u0006\u0010-\u001a\u00020.R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u001d\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013\u00a8\u0006/"}, d2 = {"Lhuutai/dev/meetmino/view_model/AuthViewModel;", "Landroidx/lifecycle/ViewModel;", "authRepository", "Lhuutai/dev/meetmino/repository/AuthRepository;", "userViewModel", "Lhuutai/dev/meetmino/view_model/UserViewModel;", "(Lhuutai/dev/meetmino/repository/AuthRepository;Lhuutai/dev/meetmino/view_model/UserViewModel;)V", "_loginState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lhuutai/dev/meetmino/view_model/ResponseDataState;", "Lhuutai/dev/meetmino/model/AuthData;", "_resendCodeState", "Lhuutai/dev/meetmino/view_model/ResponseState;", "_signUpState", "_userInfoSate", "_verifyState", "loginState", "Lkotlinx/coroutines/flow/StateFlow;", "getLoginState", "()Lkotlinx/coroutines/flow/StateFlow;", "resendCodeState", "getResendCodeState", "signUpState", "getSignUpState", "userInfoSate", "getUserInfoSate", "verifyState", "getVerifyState", "clear", "", "login", "body", "Lhuutai/dev/meetmino/model/LoginModel;", "resendVerificationCode", "resendCodeModel", "Lhuutai/dev/meetmino/model/ResendCodeModel;", "signUp", "email", "", "password", "username", "confirmPassword", "userInfo", "Lhuutai/dev/meetmino/model/GetUserInfoModel;", "verify", "verifyModel", "Lhuutai/dev/meetmino/model/VerifyModel;", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class AuthViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final huutai.dev.meetmino.repository.AuthRepository authRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final huutai.dev.meetmino.view_model.UserViewModel userViewModel = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<huutai.dev.meetmino.view_model.ResponseState> _signUpState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<huutai.dev.meetmino.view_model.ResponseState> signUpState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<huutai.dev.meetmino.view_model.ResponseState> _verifyState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<huutai.dev.meetmino.view_model.ResponseState> verifyState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<huutai.dev.meetmino.view_model.ResponseState> _resendCodeState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<huutai.dev.meetmino.view_model.ResponseState> resendCodeState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<huutai.dev.meetmino.view_model.ResponseDataState<huutai.dev.meetmino.model.AuthData>> _loginState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<huutai.dev.meetmino.view_model.ResponseDataState<huutai.dev.meetmino.model.AuthData>> loginState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<huutai.dev.meetmino.view_model.ResponseDataState<huutai.dev.meetmino.model.AuthData>> _userInfoSate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<huutai.dev.meetmino.view_model.ResponseDataState<huutai.dev.meetmino.model.AuthData>> userInfoSate = null;
    
    @javax.inject.Inject()
    public AuthViewModel(@org.jetbrains.annotations.NotNull()
    huutai.dev.meetmino.repository.AuthRepository authRepository, @org.jetbrains.annotations.NotNull()
    huutai.dev.meetmino.view_model.UserViewModel userViewModel) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<huutai.dev.meetmino.view_model.ResponseState> getSignUpState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<huutai.dev.meetmino.view_model.ResponseState> getVerifyState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<huutai.dev.meetmino.view_model.ResponseState> getResendCodeState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<huutai.dev.meetmino.view_model.ResponseDataState<huutai.dev.meetmino.model.AuthData>> getLoginState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<huutai.dev.meetmino.view_model.ResponseDataState<huutai.dev.meetmino.model.AuthData>> getUserInfoSate() {
        return null;
    }
    
    public final void clear() {
    }
    
    public final void signUp(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String confirmPassword) {
    }
    
    public final void verify(@org.jetbrains.annotations.NotNull()
    huutai.dev.meetmino.model.VerifyModel verifyModel) {
    }
    
    public final void resendVerificationCode(@org.jetbrains.annotations.NotNull()
    huutai.dev.meetmino.model.ResendCodeModel resendCodeModel) {
    }
    
    public final void login(@org.jetbrains.annotations.NotNull()
    huutai.dev.meetmino.model.LoginModel body) {
    }
    
    public final void userInfo(@org.jetbrains.annotations.NotNull()
    huutai.dev.meetmino.model.GetUserInfoModel body) {
    }
}