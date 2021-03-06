// Generated by Dagger (https://google.github.io/dagger).
package sotra.io.digistask.ui;

import androidx.lifecycle.ViewModelProvider;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class ChartsFragment_MembersInjector implements MembersInjector<ChartsFragment> {
  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  public ChartsFragment_MembersInjector(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<ChartsFragment> create(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    return new ChartsFragment_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(ChartsFragment instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectViewModelFactory(
      ChartsFragment instance, ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
