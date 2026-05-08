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

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0007\b\t\n\u000b\fB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0006\r\u000e\u000f\u0010\u0011\u0012\u00a8\u0006\u0013"}, d2 = {"Lhuutai/dev/meetmino/Screen;", "", "route", "", "(Ljava/lang/String;)V", "getRoute", "()Ljava/lang/String;", "Home", "JourneyMap", "Login", "Main", "Profile", "QuickCheckIn", "Lhuutai/dev/meetmino/Screen$Home;", "Lhuutai/dev/meetmino/Screen$JourneyMap;", "Lhuutai/dev/meetmino/Screen$Login;", "Lhuutai/dev/meetmino/Screen$Main;", "Lhuutai/dev/meetmino/Screen$Profile;", "Lhuutai/dev/meetmino/Screen$QuickCheckIn;", "app_debug"})
public abstract class Screen {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String route = null;
    
    private Screen(java.lang.String route) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRoute() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lhuutai/dev/meetmino/Screen$Home;", "Lhuutai/dev/meetmino/Screen;", "()V", "app_debug"})
    public static final class Home extends huutai.dev.meetmino.Screen {
        @org.jetbrains.annotations.NotNull()
        public static final huutai.dev.meetmino.Screen.Home INSTANCE = null;
        
        private Home() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lhuutai/dev/meetmino/Screen$JourneyMap;", "Lhuutai/dev/meetmino/Screen;", "()V", "app_debug"})
    public static final class JourneyMap extends huutai.dev.meetmino.Screen {
        @org.jetbrains.annotations.NotNull()
        public static final huutai.dev.meetmino.Screen.JourneyMap INSTANCE = null;
        
        private JourneyMap() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lhuutai/dev/meetmino/Screen$Login;", "Lhuutai/dev/meetmino/Screen;", "()V", "app_debug"})
    public static final class Login extends huutai.dev.meetmino.Screen {
        @org.jetbrains.annotations.NotNull()
        public static final huutai.dev.meetmino.Screen.Login INSTANCE = null;
        
        private Login() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lhuutai/dev/meetmino/Screen$Main;", "Lhuutai/dev/meetmino/Screen;", "()V", "app_debug"})
    public static final class Main extends huutai.dev.meetmino.Screen {
        @org.jetbrains.annotations.NotNull()
        public static final huutai.dev.meetmino.Screen.Main INSTANCE = null;
        
        private Main() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lhuutai/dev/meetmino/Screen$Profile;", "Lhuutai/dev/meetmino/Screen;", "()V", "app_debug"})
    public static final class Profile extends huutai.dev.meetmino.Screen {
        @org.jetbrains.annotations.NotNull()
        public static final huutai.dev.meetmino.Screen.Profile INSTANCE = null;
        
        private Profile() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lhuutai/dev/meetmino/Screen$QuickCheckIn;", "Lhuutai/dev/meetmino/Screen;", "()V", "app_debug"})
    public static final class QuickCheckIn extends huutai.dev.meetmino.Screen {
        @org.jetbrains.annotations.NotNull()
        public static final huutai.dev.meetmino.Screen.QuickCheckIn INSTANCE = null;
        
        private QuickCheckIn() {
        }
    }
}