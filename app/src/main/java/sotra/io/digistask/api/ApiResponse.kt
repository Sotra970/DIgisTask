/*
 * Copyright (C) 2017 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package sotra.i.chachingdemo.api

import java.io.IOException

/**
 * Common class used by API responses.
 * @param <T> the type of the response object
</T> */
sealed class ApiResponse<out T> {


    class Success<out T>(val body: T) : ApiResponse<T>()

    /**
     * Failure response with body
     */
    class ApiError(val errorMsg: String, val code: Int) : ApiResponse<Nothing>()

    /**
     * Network error
     */
    class NetworkError(val error: IOException) : ApiResponse<Nothing>()

    /**
     * For example, json parsing error
     */
    class UnknownError(val error: Throwable?) : ApiResponse<Nothing>()
    object EmptyResponse : ApiResponse<Nothing>()
    object Loading : ApiResponse<Nothing>()

}

