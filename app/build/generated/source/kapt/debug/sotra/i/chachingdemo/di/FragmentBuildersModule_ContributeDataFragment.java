package sotra.i.chachingdemo.di;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import sotra.io.digistask.ui.ChartsFragment;

@Module(
  subcomponents = FragmentBuildersModule_ContributeDataFragment.ChartsFragmentSubcomponent.class
)
public abstract class FragmentBuildersModule_ContributeDataFragment {
  private FragmentBuildersModule_ContributeDataFragment() {}

  @Binds
  @IntoMap
  @ClassKey(ChartsFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ChartsFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface ChartsFragmentSubcomponent extends AndroidInjector<ChartsFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ChartsFragment> {}
  }
}
