package huutai.dev.meetmino.view_model;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import huutai.dev.meetmino.repository.ChatBotRepository;
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
public final class ChatViewModel_Factory implements Factory<ChatViewModel> {
  private final Provider<ChatBotRepository> repositoryProvider;

  public ChatViewModel_Factory(Provider<ChatBotRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public ChatViewModel get() {
    return newInstance(repositoryProvider.get());
  }

  public static ChatViewModel_Factory create(Provider<ChatBotRepository> repositoryProvider) {
    return new ChatViewModel_Factory(repositoryProvider);
  }

  public static ChatViewModel newInstance(ChatBotRepository repository) {
    return new ChatViewModel(repository);
  }
}
