package sotra.io.digistask.api.NetworkResponseFactory;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u0002B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0016\u0010\b\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00018\u00008\u00000\u0000H\u0016J\u001c\u0010\n\u001a\u00020\u00072\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\fH\u0016J\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lsotra/io/digistask/api/NetworkResponseFactory/NetworkResponseCall;", "S", "Lretrofit2/Call;", "Lsotra/i/chachingdemo/api/ApiResponse;", "delegate", "(Lretrofit2/Call;)V", "cancel", "", "clone", "kotlin.jvm.PlatformType", "enqueue", "callback", "Lretrofit2/Callback;", "execute", "Lretrofit2/Response;", "isCanceled", "", "isExecuted", "request", "Lokhttp3/Request;", "timeout", "Lokio/Timeout;", "app_debug"})
public final class NetworkResponseCall<S extends java.lang.Object> implements retrofit2.Call<sotra.i.chachingdemo.api.ApiResponse<? extends S>> {
    private final retrofit2.Call<S> delegate = null;
    
    @java.lang.Override()
    public void enqueue(@org.jetbrains.annotations.NotNull()
    retrofit2.Callback<sotra.i.chachingdemo.api.ApiResponse<S>> callback) {
    }
    
    @java.lang.Override()
    public boolean isExecuted() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public sotra.io.digistask.api.NetworkResponseFactory.NetworkResponseCall<S> clone() {
        return null;
    }
    
    @java.lang.Override()
    public boolean isCanceled() {
        return false;
    }
    
    @java.lang.Override()
    public void cancel() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public retrofit2.Response<sotra.i.chachingdemo.api.ApiResponse<S>> execute() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public okhttp3.Request request() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public okio.Timeout timeout() {
        return null;
    }
    
    public NetworkResponseCall(@org.jetbrains.annotations.NotNull()
    retrofit2.Call<S> delegate) {
        super();
    }
}