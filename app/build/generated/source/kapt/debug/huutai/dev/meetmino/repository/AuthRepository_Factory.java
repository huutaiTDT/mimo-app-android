package huutai.dev.meetmino.repository;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import huutai.dev.meetmino.service.AuthService;
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
public final class AuthRepository_Factory implements Factory<AuthRepository> {
  private final Provider<AuthService> serviceProvider;

  public AuthRepository_Factory(Provider<AuthService> serviceProvider) {
    this.serviceProvider = serviceProvider;
  }

  @Override
  public AuthRepository get() {
    return newInstance(serviceProvider.get());
  }

  public static AuthRepository_Factory create(Provider<AuthService> serviceProvider) {
    return new AuthRepository_Factory(serviceProvider);
  }

  public static AuthRepository newInstance(AuthService service) {
    return new AuthRepository(service);
  }
}
