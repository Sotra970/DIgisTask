package sotra.io.digistask.repo

import com.android.example.github.api.ApiService
import javax.inject.Inject

/**
 * Created by developers@appgain.io on 12/26/2020.
 */
class DataRepo @Inject constructor(
        private val apiService: ApiService
) {
    suspend fun getData() = apiService.getData()

}