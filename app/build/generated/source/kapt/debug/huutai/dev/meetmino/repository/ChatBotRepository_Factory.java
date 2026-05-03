package huutai.dev.meetmino.repository;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import huutai.dev.meetmino.service.ChatBotService;
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
public final class ChatBotRepository_Factory implements Factory<ChatBotRepository> {
  private final Provider<ChatBotService> serviceProvider;

  public ChatBotRepository_Factory(Provider<ChatBotService> serviceProvider) {
    this.serviceProvider = serviceProvider;
  }

  @Override
  public ChatBotRepository get() {
    return newInstance(serviceProvider.get());
  }

  public static ChatBotRepository_Factory create(Provider<ChatBotService> serviceProvider) {
    return new ChatBotRepository_Factory(serviceProvider);
  }

  public static ChatBotRepository newInstance(ChatBotService service) {
    return new ChatBotRepository(service);
  }
}
