package huutai.dev.meetmino.view_model;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import huutai.dev.meetmino.repository.AuthRepository;
import javax.annotation.processing.Generated;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast",
    "deprecation",
    "nullness:initialization.field.uninitialized"
})
public final class AuthViewModel_Factory implements Factory<AuthViewModel> {
  private final Provider<AuthRepository> authRepositoryProvider;

  private final Provider<UserViewModel> userViewModelProvider;

  public AuthViewModel_Factory(Provider<AuthRepository> authRepositoryProvider,
      Provider<UserViewModel> userViewModelProvider) {
    this.authRepositoryProvider = authRepositoryProvider;
    this.userViewModelProvider = userViewModelProvider;
  }

  @Override
  public AuthViewModel get() {
    return newInstance(authRepositoryProvider.get(), userViewModelProvider.get());
  }

  public static AuthViewModel_Factory create(Provider<AuthRepository> authRepositoryProvider,
      Provider<UserViewModel> userViewModelProvider) {
    return new AuthViewModel_Factory(authRepositoryProvider, userViewModelProvider);
  }

  public static AuthViewModel newInstance(AuthRepository authRepository,
      UserViewModel userViewModel) {
    return new AuthViewModel(authRepository, userViewModel);
  }
}
