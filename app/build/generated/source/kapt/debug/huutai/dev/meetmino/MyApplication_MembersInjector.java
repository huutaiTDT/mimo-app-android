package huutai.dev.meetmino;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import huutai.dev.meetmino.core.logging.Logger;
import javax.annotation.processing.Generated;

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
public final class MyApplication_MembersInjector implements MembersInjector<MyApplication> {
  private final Provider<Logger> loggerProvider;

  public MyApplication_MembersInjector(Provider<Logger> loggerProvider) {
    this.loggerProvider = loggerProvider;
  }

  public static MembersInjector<MyApplication> create(Provider<Logger> loggerProvider) {
    return new MyApplication_MembersInjector(loggerProvider);
  }

  @Override
  public void injectMembers(MyApplication instance) {
    injectLogger(instance, loggerProvider.get());
  }

  @InjectedFieldSignature("huutai.dev.meetmino.MyApplication.logger")
  public static void injectLogger(MyApplication instance, Logger logger) {
    instance.logger = logger;
  }
}
