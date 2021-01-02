package sotra.i.chachingdemo.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import sotra.i.chachingdemo.api.ApiResponse
import sotra.io.digistask.DataModels.DataModel
import sotra.io.digistask.repo.DataRepo
import javax.inject.Inject


/**
 * Created by developers@appgain.io on 12/11/2020.
 */
class DataViewModel @Inject constructor(
        private val dataRepo: DataRepo
) : ViewModel() {
    // single ApiResponse<DataModel> for network callbacks like loading and internet error
    val newChild: MutableLiveData<ApiResponse<DataModel>> = MutableLiveData()
    fun fetchNewData() = viewModelScope.launch {
        newChild.postValue(ApiResponse.Loading)
        newChild.postValue(dataRepo.getData())
    }


}