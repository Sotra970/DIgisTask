package sotra.io.digistask.api.NetworkResponseFactory


import okhttp3.Request
import okio.Timeout
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import sotra.i.chachingdemo.api.ApiResponse
import java.io.IOException

internal class NetworkResponseCall<S>(
        private val delegate: Call<S>
) : Call<ApiResponse<S>> {

    override fun enqueue(callback: Callback<ApiResponse<S>>) {
        return delegate.enqueue(object : Callback<S> {
            override fun onResponse(call: Call<S>, response: Response<S>) {
                val body = response.body()
                val code = response.code()
                val error = response.errorBody()

                if (response.isSuccessful) {
                    if (body != null) {
                        callback.onResponse(
                                this@NetworkResponseCall,
                                Response.success(ApiResponse.Success(body))
                        )
                    } else {
                        // Response is successful but the body is null
                        callback.onResponse(
                                this@NetworkResponseCall,
                                Response.success(ApiResponse.UnknownError(null))
                        )
                    }
                } else {
                    if (error != null) {
                        callback.onResponse(
                                this@NetworkResponseCall,
                                Response.success(ApiResponse.ApiError(error.toString(), code))
                        )
                    } else {
                        callback.onResponse(
                                this@NetworkResponseCall,
                                Response.success(ApiResponse.UnknownError(null))
                        )
                    }
                }
            }

            override fun onFailure(call: Call<S>, throwable: Throwable) {
                val networkResponse = when (throwable) {
                    is IOException -> ApiResponse.NetworkError(throwable)
                    else -> ApiResponse.UnknownError(throwable)
                }
                callback.onResponse(this@NetworkResponseCall, Response.success(networkResponse))
            }
        })
    }

    override fun isExecuted() = delegate.isExecuted

    override fun clone() = NetworkResponseCall(delegate.clone())

    override fun isCanceled() = delegate.isCanceled

    override fun cancel() = delegate.cancel()

    override fun execute(): Response<ApiResponse<S>> {
        throw UnsupportedOperationException("NetworkResponseCall doesn't support execute")
    }

    override fun request(): Request = delegate.request()

    override fun timeout(): Timeout = delegate.timeout()
}