package sotra.i.chachingdemo.di;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import sotra.io.digistask.ui.DataListFragment.DataListFragment;

@Module(
  subcomponents =
      FragmentBuildersModule_ContributeListDataFragment.DataListFragmentSubcomponent.class
)
public abstract class FragmentBuildersModule_ContributeListDataFragment {
  private FragmentBuildersModule_ContributeListDataFragment() {}

  @Binds
  @IntoMap
  @ClassKey(DataListFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      DataListFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface DataListFragmentSubcomponent extends AndroidInjector<DataListFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<DataListFragment> {}
  }
}
