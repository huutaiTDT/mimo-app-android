package huutai.dev.meetmino.di
import huutai.dev.meetmino.view_model.ChatViewModel
import huutai.dev.meetmino.view_model.UserViewModel
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@EntryPoint
@InstallIn(SingletonComponent::class)
interface UserViewModelEntryPoint {
    fun userViewModel(): UserViewModel
}

@EntryPoint
@InstallIn(SingletonComponent::class)
interface ChatViewModelEntryPoint {
    fun chatViewModel(): ChatViewModel
}

