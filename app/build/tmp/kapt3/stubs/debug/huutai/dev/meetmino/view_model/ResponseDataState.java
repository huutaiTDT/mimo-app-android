package huutai.dev.meetmino.view_model;

import huutai.dev.meetmino.model.Response;
import huutai.dev.meetmino.service.api.ErrorRes;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00018\u0000H\u00c6\u0003\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0011\u001a\u00020\u0007H\u00c6\u0003J6\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001R\u0015\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e\u00a8\u0006\u001a"}, d2 = {"Lhuutai/dev/meetmino/view_model/ResponseDataState;", "T", "", "error", "Lhuutai/dev/meetmino/service/api/ErrorRes;", "data", "isLoading", "", "(Lhuutai/dev/meetmino/service/api/ErrorRes;Ljava/lang/Object;Z)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getError", "()Lhuutai/dev/meetmino/service/api/ErrorRes;", "()Z", "component1", "component2", "component3", "copy", "(Lhuutai/dev/meetmino/service/api/ErrorRes;Ljava/lang/Object;Z)Lhuutai/dev/meetmino/view_model/ResponseDataState;", "equals", "other", "hashCode", "", "toString", "", "app_debug"})
public final class ResponseDataState<T extends java.lang.Object> {
    @org.jetbrains.annotations.Nullable()
    private final huutai.dev.meetmino.service.api.ErrorRes error = null;
    @org.jetbrains.annotations.Nullable()
    private final T data = null;
    private final boolean isLoading = false;
    
    @org.jetbrains.annotations.Nullable()
    public final huutai.dev.meetmino.service.api.ErrorRes component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final T component2() {
        return null;
    }
    
    public final boolean component3() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final huutai.dev.meetmino.view_model.ResponseDataState<T> copy(@org.jetbrains.annotations.Nullable()
    huutai.dev.meetmino.service.api.ErrorRes error, @org.jetbrains.annotations.Nullable()
    T data, boolean isLoading) {
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
    
    public ResponseDataState(@org.jetbrains.annotations.Nullable()
    huutai.dev.meetmino.service.api.ErrorRes error, @org.jetbrains.annotations.Nullable()
    T data, boolean isLoading) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final huutai.dev.meetmino.service.api.ErrorRes getError() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final T getData() {
        return null;
    }
    
    public final boolean isLoading() {
        return false;
    }
    
    public ResponseDataState() {
        super();
    }
}