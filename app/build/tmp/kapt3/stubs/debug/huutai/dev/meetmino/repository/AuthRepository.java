package huutai.dev.meetmino.repository;

import huutai.dev.meetmino.model.AuthData;
import huutai.dev.meetmino.model.GetUserInfoModel;
import huutai.dev.meetmino.model.LoginModel;
import huutai.dev.meetmino.model.RegisterModel;
import huutai.dev.meetmino.model.ResendCodeModel;
import huutai.dev.meetmino.model.Response;
import huutai.dev.meetmino.model.VerifyModel;
import huutai.dev.meetmino.service.AuthService;
import kotlinx.coroutines.flow.Flow;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\nJ \u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u00070\u00062\u0006\u0010\t\u001a\u00020\u000eJ \u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u00070\u00062\u0006\u0010\t\u001a\u00020\u0010J\u001a\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\u0012J \u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u00070\u00062\u0006\u0010\t\u001a\u00020\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lhuutai/dev/meetmino/repository/AuthRepository;", "", "service", "Lhuutai/dev/meetmino/service/AuthService;", "(Lhuutai/dev/meetmino/service/AuthService;)V", "login", "Lkotlinx/coroutines/flow/Flow;", "LResource;", "Lhuutai/dev/meetmino/model/AuthData;", "body", "Lhuutai/dev/meetmino/model/LoginModel;", "resendVerifyCode", "Lhuutai/dev/meetmino/model/Response;", "", "Lhuutai/dev/meetmino/model/ResendCodeModel;", "signUp", "Lhuutai/dev/meetmino/model/RegisterModel;", "userInfo", "Lhuutai/dev/meetmino/model/GetUserInfoModel;", "verify", "Lhuutai/dev/meetmino/model/VerifyModel;", "app_debug"})
public final class AuthRepository {
    @org.jetbrains.annotations.NotNull()
    private final huutai.dev.meetmino.service.AuthService service = null;
    
    @javax.inject.Inject()
    public AuthRepository(@org.jetbrains.annotations.NotNull()
    huutai.dev.meetmino.service.AuthService service) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<Resource<huutai.dev.meetmino.model.Response<java.lang.String>>> signUp(@org.jetbrains.annotations.NotNull()
    huutai.dev.meetmino.model.RegisterModel body) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<Resource<huutai.dev.meetmino.model.Response<java.lang.String>>> verify(@org.jetbrains.annotations.NotNull()
    huutai.dev.meetmino.model.VerifyModel body) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<Resource<huutai.dev.meetmino.model.Response<java.lang.String>>> resendVerifyCode(@org.jetbrains.annotations.NotNull()
    huutai.dev.meetmino.model.ResendCodeModel body) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<Resource<huutai.dev.meetmino.model.AuthData>> login(@org.jetbrains.annotations.NotNull()
    huutai.dev.meetmino.model.LoginModel body) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<Resource<huutai.dev.meetmino.model.AuthData>> userInfo(@org.jetbrains.annotations.NotNull()
    huutai.dev.meetmino.model.GetUserInfoModel body) {
        return null;
    }
}