package sotra.i.chachingdemo.api;

import java.lang.System;

/**
 * Common class used by API responses.
 * @param <T> the type of the response object
 * </T>
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0006\u0004\u0005\u0006\u0007\b\tB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f\u00a8\u0006\u0010"}, d2 = {"Lsotra/i/chachingdemo/api/ApiResponse;", "T", "", "()V", "ApiError", "EmptyResponse", "Loading", "NetworkError", "Success", "UnknownError", "Lsotra/i/chachingdemo/api/ApiResponse$Success;", "Lsotra/i/chachingdemo/api/ApiResponse$ApiError;", "Lsotra/i/chachingdemo/api/ApiResponse$NetworkError;", "Lsotra/i/chachingdemo/api/ApiResponse$UnknownError;", "Lsotra/i/chachingdemo/api/ApiResponse$EmptyResponse;", "Lsotra/i/chachingdemo/api/ApiResponse$Loading;", "app_debug"})
public abstract class ApiResponse<T extends java.lang.Object> {
    
    private ApiResponse() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u00a2\u0006\u0002\u0010\u0004R\u0013\u0010\u0003\u001a\u00028\u0001\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\b"}, d2 = {"Lsotra/i/chachingdemo/api/ApiResponse$Success;", "T", "Lsotra/i/chachingdemo/api/ApiResponse;", "body", "(Ljava/lang/Object;)V", "getBody", "()Ljava/lang/Object;", "Ljava/lang/Object;", "app_debug"})
    public static final class Success<T extends java.lang.Object> extends sotra.i.chachingdemo.api.ApiResponse<T> {
        private final T body = null;
        
        public final T getBody() {
            return null;
        }
        
        public Success(T body) {
            super();
        }
    }
    
    /**
     * Failure response with body
     */
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lsotra/i/chachingdemo/api/ApiResponse$ApiError;", "Lsotra/i/chachingdemo/api/ApiResponse;", "", "errorMsg", "", "code", "", "(Ljava/lang/String;I)V", "getCode", "()I", "getErrorMsg", "()Ljava/lang/String;", "app_debug"})
    public static final class ApiError extends sotra.i.chachingdemo.api.ApiResponse {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String errorMsg = null;
        private final int code = 0;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getErrorMsg() {
            return null;
        }
        
        public final int getCode() {
            return 0;
        }
        
        public ApiError(@org.jetbrains.annotations.NotNull()
        java.lang.String errorMsg, int code) {
            super();
        }
    }
    
    /**
     * Network error
     */
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lsotra/i/chachingdemo/api/ApiResponse$NetworkError;", "Lsotra/i/chachingdemo/api/ApiResponse;", "", "error", "Ljava/io/IOException;", "(Ljava/io/IOException;)V", "getError", "()Ljava/io/IOException;", "app_debug"})
    public static final class NetworkError extends sotra.i.chachingdemo.api.ApiResponse {
        @org.jetbrains.annotations.NotNull()
        private final java.io.IOException error = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.io.IOException getError() {
            return null;
        }
        
        public NetworkError(@org.jetbrains.annotations.NotNull()
        java.io.IOException error) {
            super();
        }
    }
    
    /**
     * For example, json parsing error
     */
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0005R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lsotra/i/chachingdemo/api/ApiResponse$UnknownError;", "Lsotra/i/chachingdemo/api/ApiResponse;", "", "error", "", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "app_debug"})
    public static final class UnknownError extends sotra.i.chachingdemo.api.ApiResponse {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Throwable error = null;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Throwable getError() {
            return null;
        }
        
        public UnknownError(@org.jetbrains.annotations.Nullable()
        java.lang.Throwable error) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lsotra/i/chachingdemo/api/ApiResponse$EmptyResponse;", "Lsotra/i/chachingdemo/api/ApiResponse;", "", "()V", "app_debug"})
    public static final class EmptyResponse extends sotra.i.chachingdemo.api.ApiResponse {
        public static final sotra.i.chachingdemo.api.ApiResponse.EmptyResponse INSTANCE = null;
        
        private EmptyResponse() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lsotra/i/chachingdemo/api/ApiResponse$Loading;", "Lsotra/i/chachingdemo/api/ApiResponse;", "", "()V", "app_debug"})
    public static final class Loading extends sotra.i.chachingdemo.api.ApiResponse {
        public static final sotra.i.chachingdemo.api.ApiResponse.Loading INSTANCE = null;
        
        private Loading() {
            super();
        }
    }
}