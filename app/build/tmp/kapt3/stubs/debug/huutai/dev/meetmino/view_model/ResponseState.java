package huutai.dev.meetmino.view_model;

import huutai.dev.meetmino.model.Response;
import huutai.dev.meetmino.service.api.ErrorRes;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\bH\u00c6\u0003J1\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0006H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\fR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0018"}, d2 = {"Lhuutai/dev/meetmino/view_model/ResponseState;", "", "error", "Lhuutai/dev/meetmino/service/api/ErrorRes;", "response", "Lhuutai/dev/meetmino/model/Response;", "", "isLoading", "", "(Lhuutai/dev/meetmino/service/api/ErrorRes;Lhuutai/dev/meetmino/model/Response;Z)V", "getError", "()Lhuutai/dev/meetmino/service/api/ErrorRes;", "()Z", "getResponse", "()Lhuutai/dev/meetmino/model/Response;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"})
public final class ResponseState {
    @org.jetbrains.annotations.Nullable()
    private final huutai.dev.meetmino.service.api.ErrorRes error = null;
    @org.jetbrains.annotations.Nullable()
    private final huutai.dev.meetmino.model.Response<java.lang.String> response = null;
    private final boolean isLoading = false;
    
    @org.jetbrains.annotations.Nullable()
    public final huutai.dev.meetmino.service.api.ErrorRes component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final huutai.dev.meetmino.model.Response<java.lang.String> component2() {
        return null;
    }
    
    public final boolean component3() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final huutai.dev.meetmino.view_model.ResponseState copy(@org.jetbrains.annotations.Nullable()
    huutai.dev.meetmino.service.api.ErrorRes error, @org.jetbrains.annotations.Nullable()
    huutai.dev.meetmino.model.Response<java.lang.String> response, boolean isLoading) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
    
    public ResponseState(@org.jetbrains.annotations.Nullable()
    huutai.dev.meetmino.service.api.ErrorRes error, @org.jetbrains.annotations.Nullable()
    huutai.dev.meetmino.model.Response<java.lang.String> response, boolean isLoading) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final huutai.dev.meetmino.service.api.ErrorRes getError() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final huutai.dev.meetmino.model.Response<java.lang.String> getResponse() {
        return null;
    }
    
    public final boolean isLoading() {
        return false;
    }
    
    public ResponseState() {
        super();
    }
}