package huutai.dev.meetmino;

import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.ExperimentalAnimationApi;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Modifier;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u00c2\u0001\u0010\u0004\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072!\b\u0002\u0010\b\u001a\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t\u00a2\u0006\u0002\b\r2!\b\u0002\u0010\u000e\u001a\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\t\u00a2\u0006\u0002\b\r2!\b\u0002\u0010\u0010\u001a\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t\u00a2\u0006\u0002\b\r2!\b\u0002\u0010\u0011\u001a\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\t\u00a2\u0006\u0002\b\r2\"\u0010\u0012\u001a\u001e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\u0013\u00a2\u0006\u0002\b\u0015\u00a2\u0006\u0002\b\r\u001a\u0012\u0010\u0016\u001a\u00020\u0001*\u00020\u00172\u0006\u0010\u0006\u001a\u00020\u0007\u00a8\u0006\u0018"}, d2 = {"AppNavHost", "", "navController", "Landroidx/navigation/NavHostController;", "animatedComposable", "Landroidx/navigation/NavGraphBuilder;", "route", "", "enterTransition", "Lkotlin/Function1;", "Landroidx/compose/animation/AnimatedContentTransitionScope;", "Landroidx/navigation/NavBackStackEntry;", "Landroidx/compose/animation/EnterTransition;", "Lkotlin/ExtensionFunctionType;", "exitTransition", "Landroidx/compose/animation/ExitTransition;", "popEnterTransition", "popExitTransition", "content", "Lkotlin/Function2;", "Landroidx/compose/animation/AnimatedContentScope;", "Landroidx/compose/runtime/Composable;", "navigateWithAnimation", "Landroidx/navigation/NavController;", "app_debug"})
public final class NavHostKt {
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    @kotlin.OptIn(markerClass = {androidx.compose.animation.ExperimentalAnimationApi.class})
    @androidx.compose.runtime.Composable()
    public static final void AppNavHost(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavHostController navController) {
    }
    
    public static final void animatedComposable(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavGraphBuilder $this$animatedComposable, @org.jetbrains.annotations.NotNull()
    java.lang.String route, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation.NavBackStackEntry>, ? extends androidx.compose.animation.EnterTransition> enterTransition, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation.NavBackStackEntry>, ? extends androidx.compose.animation.ExitTransition> exitTransition, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation.NavBackStackEntry>, ? extends androidx.compose.animation.EnterTransition> popEnterTransition, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation.NavBackStackEntry>, ? extends androidx.compose.animation.ExitTransition> popExitTransition, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super androidx.compose.animation.AnimatedContentScope, ? super androidx.navigation.NavBackStackEntry, kotlin.Unit> content) {
    }
    
    public static final void navigateWithAnimation(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavController $this$navigateWithAnimation, @org.jetbrains.annotations.NotNull()
    java.lang.String route) {
    }
}