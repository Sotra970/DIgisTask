package sotra.i.chachingdemo.di;

import java.lang.System;

@kotlin.Suppress(names = {"unused"})
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\'\u00a8\u0006\u0005"}, d2 = {"Lsotra/i/chachingdemo/di/MainActivityModule;", "", "()V", "contributeMainActivity", "Lsotra/i/chachingdemo/MainActivity;", "app_debug"})
@dagger.Module()
public abstract class MainActivityModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {sotra.i.chachingdemo.di.FragmentBuildersModule.class})
    public abstract sotra.i.chachingdemo.MainActivity contributeMainActivity();
    
    public MainActivityModule() {
        super();
    }
}