package huutai.dev.meetmino.service;

import huutai.dev.meetmino.model.AuthData;
import huutai.dev.meetmino.model.GetUserInfoModel;
import huutai.dev.meetmino.model.LoginModel;
import huutai.dev.meetmino.model.RegisterModel;
import huutai.dev.meetmino.model.ResendCodeModel;
import huutai.dev.meetmino.model.Response;
import huutai.dev.meetmino.model.VerifyModel;
import retrofit2.http.Body;
import retrofit2.http.POST;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0004\u001a\u00020\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0004\u001a\u00020\rH\u00a7@\u00a2\u0006\u0002\u0010\u000eJ\u0018\u0010\u000f\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0010H\u00a7@\u00a2\u0006\u0002\u0010\u0011J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0004\u001a\u00020\u0013H\u00a7@\u00a2\u0006\u0002\u0010\u0014\u00a8\u0006\u0015"}, d2 = {"Lhuutai/dev/meetmino/service/AuthService;", "", "login", "Lhuutai/dev/meetmino/model/AuthData;", "body", "Lhuutai/dev/meetmino/model/LoginModel;", "(Lhuutai/dev/meetmino/model/LoginModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resendVerCode", "Lhuutai/dev/meetmino/model/Response;", "", "Lhuutai/dev/meetmino/model/ResendCodeModel;", "(Lhuutai/dev/meetmino/model/ResendCodeModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signUp", "Lhuutai/dev/meetmino/model/RegisterModel;", "(Lhuutai/dev/meetmino/model/RegisterModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "userDetail", "Lhuutai/dev/meetmino/model/GetUserInfoModel;", "(Lhuutai/dev/meetmino/model/GetUserInfoModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "verify", "Lhuutai/dev/meetmino/model/VerifyModel;", "(Lhuutai/dev/meetmino/model/VerifyModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface AuthService {
    
    @retrofit2.http.POST(value = "auth/sign-up")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object signUp(@retrofit2.http.Body()
    @org.jetbrains.annotations.NotNull()
    huutai.dev.meetmino.model.RegisterModel body, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super huutai.dev.meetmino.model.Response<java.lang.String>> $completion);
    
    @retrofit2.http.POST(value = "auth/sign-in")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object login(@retrofit2.http.Body()
    @org.jetbrains.annotations.NotNull()
    huutai.dev.meetmino.model.LoginModel body, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super huutai.dev.meetmino.model.AuthData> $completion);
    
    @retrofit2.http.POST(value = "auth/resend-verification-code")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object resendVerCode(@retrofit2.http.Body()
    @org.jetbrains.annotations.NotNull()
    huutai.dev.meetmino.model.ResendCodeModel body, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super huutai.dev.meetmino.model.Response<java.lang.String>> $completion);
    
    @retrofit2.http.POST(value = "auth/verify")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object verify(@retrofit2.http.Body()
    @org.jetbrains.annotations.NotNull()
    huutai.dev.meetmino.model.VerifyModel body, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super huutai.dev.meetmino.model.Response<java.lang.String>> $completion);
    
    @retrofit2.http.POST(value = "user/detail")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object userDetail(@retrofit2.http.Body()
    @org.jetbrains.annotations.NotNull()
    huutai.dev.meetmino.model.GetUserInfoModel body, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super huutai.dev.meetmino.model.AuthData> $completion);
}