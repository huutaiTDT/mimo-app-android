package huutai.dev.meetmino.core.common.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import huutai.dev.meetmino.core.analytics.Analytics;
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
public final class CoreModule_ProvideAnalyticsFactory implements Factory<Analytics> {
  @Override
  public Analytics get() {
    return provideAnalytics();
  }

  public static CoreModule_ProvideAnalyticsFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static Analytics provideAnalytics() {
    return Preconditions.checkNotNullFromProvides(CoreModule.INSTANCE.provideAnalytics());
  }

  private static final class InstanceHolder {
    static final CoreModule_ProvideAnalyticsFactory INSTANCE = new CoreModule_ProvideAnalyticsFactory();
  }
}
