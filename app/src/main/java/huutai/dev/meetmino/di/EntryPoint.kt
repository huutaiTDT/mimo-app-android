package huutai.dev.meetmino.di
import huutai.dev.meetmino.view_model.AppViewViewModel
import huutai.dev.meetmino.view_model.ChatViewModel
import huutai.dev.meetmino.view_model.HomeViewModel
import huutai.dev.meetmino.view_model.PlanTripViewModel
import huutai.dev.meetmino.view_model.PostViewModel
import huutai.dev.meetmino.view_model.UserSubscriptionModel
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

@EntryPoint
@InstallIn(SingletonComponent::class)
interface PlanTripModelEntryPoint {
    fun planTripModel(): PlanTripViewModel
}

@EntryPoint
@InstallIn(SingletonComponent::class)
interface HomeViewModelEntryPoint {
    fun homeViewModel(): HomeViewModel
}

@EntryPoint
@InstallIn(SingletonComponent::class)
interface AppStateViewEntryPoint {
    fun appStateViewModel(): AppViewViewModel
}

@EntryPoint
@InstallIn(SingletonComponent::class)
interface PostViewModelEntryPoint {
    fun postViewModel(): PostViewModel
}

@EntryPoint
@InstallIn(SingletonComponent::class)
interface UserSubscriptionEntryPoint {
    fun userSubscriptionModel(): UserSubscriptionModel
}