package sotra.i.chachingdemo.ui;

import java.lang.System;

/**
 * Created by developers@appgain.io on 12/11/2020.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\r"}, d2 = {"Lsotra/i/chachingdemo/ui/DataViewModel;", "Landroidx/lifecycle/ViewModel;", "dataRepo", "Lsotra/io/digistask/repo/DataRepo;", "(Lsotra/io/digistask/repo/DataRepo;)V", "newChild", "Landroidx/lifecycle/MutableLiveData;", "Lsotra/i/chachingdemo/api/ApiResponse;", "Lsotra/io/digistask/DataModels/DataModel;", "getNewChild", "()Landroidx/lifecycle/MutableLiveData;", "fetchNewData", "Lkotlinx/coroutines/Job;", "app_debug"})
public final class DataViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<sotra.i.chachingdemo.api.ApiResponse<sotra.io.digistask.DataModels.DataModel>> newChild = null;
    private final sotra.io.digistask.repo.DataRepo dataRepo = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<sotra.i.chachingdemo.api.ApiResponse<sotra.io.digistask.DataModels.DataModel>> getNewChild() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job fetchNewData() {
        return null;
    }
    
    @javax.inject.Inject()
    public DataViewModel(@org.jetbrains.annotations.NotNull()
    sotra.io.digistask.repo.DataRepo dataRepo) {
        super();
    }
}