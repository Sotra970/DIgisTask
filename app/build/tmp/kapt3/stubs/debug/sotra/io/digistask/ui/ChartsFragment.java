package sotra.io.digistask.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J&\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u001a\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020 2\b\u0010%\u001a\u0004\u0018\u00010&H\u0017J\b\u0010*\u001a\u00020(H\u0002J\b\u0010+\u001a\u00020(H\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001a\u0010\u0013\u001a\u00020\u0014X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0019\u001a\u00020\u001a8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e\u00a8\u0006,"}, d2 = {"Lsotra/io/digistask/ui/ChartsFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/android/example/github/di/Injectable;", "()V", "dynamicLineChartManager1", "Lsotra/io/digistask/util/DynamicLineChartManager;", "getDynamicLineChartManager1", "()Lsotra/io/digistask/util/DynamicLineChartManager;", "setDynamicLineChartManager1", "(Lsotra/io/digistask/util/DynamicLineChartManager;)V", "dynamicLineChartManager2", "getDynamicLineChartManager2", "setDynamicLineChartManager2", "dynamicLineChartManager3", "getDynamicLineChartManager3", "setDynamicLineChartManager3", "dynamicLineChartManager4", "getDynamicLineChartManager4", "setDynamicLineChartManager4", "viewModel", "Lsotra/i/chachingdemo/ui/DataViewModel;", "getViewModel", "()Lsotra/i/chachingdemo/ui/DataViewModel;", "setViewModel", "(Lsotra/i/chachingdemo/ui/DataViewModel;)V", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getViewModelFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setViewModelFactory", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "setupChart", "startDataObserving", "app_debug"})
public final class ChartsFragment extends androidx.fragment.app.Fragment implements com.android.example.github.di.Injectable {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public androidx.lifecycle.ViewModelProvider.Factory viewModelFactory;
    @org.jetbrains.annotations.NotNull()
    public sotra.i.chachingdemo.ui.DataViewModel viewModel;
    @org.jetbrains.annotations.Nullable()
    private sotra.io.digistask.util.DynamicLineChartManager dynamicLineChartManager1;
    @org.jetbrains.annotations.Nullable()
    private sotra.io.digistask.util.DynamicLineChartManager dynamicLineChartManager2;
    @org.jetbrains.annotations.Nullable()
    private sotra.io.digistask.util.DynamicLineChartManager dynamicLineChartManager3;
    @org.jetbrains.annotations.Nullable()
    private sotra.io.digistask.util.DynamicLineChartManager dynamicLineChartManager4;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.ViewModelProvider.Factory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.ViewModelProvider.Factory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final sotra.i.chachingdemo.ui.DataViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    sotra.i.chachingdemo.ui.DataViewModel p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final sotra.io.digistask.util.DynamicLineChartManager getDynamicLineChartManager1() {
        return null;
    }
    
    public final void setDynamicLineChartManager1(@org.jetbrains.annotations.Nullable()
    sotra.io.digistask.util.DynamicLineChartManager p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final sotra.io.digistask.util.DynamicLineChartManager getDynamicLineChartManager2() {
        return null;
    }
    
    public final void setDynamicLineChartManager2(@org.jetbrains.annotations.Nullable()
    sotra.io.digistask.util.DynamicLineChartManager p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final sotra.io.digistask.util.DynamicLineChartManager getDynamicLineChartManager3() {
        return null;
    }
    
    public final void setDynamicLineChartManager3(@org.jetbrains.annotations.Nullable()
    sotra.io.digistask.util.DynamicLineChartManager p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final sotra.io.digistask.util.DynamicLineChartManager getDynamicLineChartManager4() {
        return null;
    }
    
    public final void setDynamicLineChartManager4(@org.jetbrains.annotations.Nullable()
    sotra.io.digistask.util.DynamicLineChartManager p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupChart() {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    private final void startDataObserving() {
    }
    
    public ChartsFragment() {
        super();
    }
}