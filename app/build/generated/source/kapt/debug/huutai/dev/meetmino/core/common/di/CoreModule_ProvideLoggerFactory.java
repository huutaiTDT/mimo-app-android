package huutai.dev.meetmino.core.common.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import huutai.dev.meetmino.core.logging.Logger;
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
public final class CoreModule_ProvideLoggerFactory implements Factory<Logger> {
  @Override
  public Logger get() {
    return provideLogger();
  }

  public static CoreModule_ProvideLoggerFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static Logger provideLogger() {
    return Preconditions.checkNotNullFromProvides(CoreModule.INSTANCE.provideLogger());
  }

  private static final class InstanceHolder {
    static final CoreModule_ProvideLoggerFactory INSTANCE = new CoreModule_ProvideLoggerFactory();
  }
}
