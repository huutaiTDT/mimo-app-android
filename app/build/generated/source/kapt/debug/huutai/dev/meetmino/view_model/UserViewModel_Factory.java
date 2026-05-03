package huutai.dev.meetmino.view_model;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata("javax.inject.Singleton")
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
public final class UserViewModel_Factory implements Factory<UserViewModel> {
  @Override
  public UserViewModel get() {
    return newInstance();
  }

  public static UserViewModel_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static UserViewModel newInstance() {
    return new UserViewModel();
  }

  private static final class InstanceHolder {
    static final UserViewModel_Factory INSTANCE = new UserViewModel_Factory();
  }
}
