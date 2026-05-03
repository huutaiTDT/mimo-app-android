package huutai.dev.meetmino.screen;

import androidx.compose.runtime.Composable;
import androidx.compose.ui.Modifier;
import androidx.navigation.NavHostController;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0007\b\t\n\u000bB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0005\f\r\u000e\u000f\u0010\u00a8\u0006\u0011"}, d2 = {"Lhuutai/dev/meetmino/screen/BottomBarRoute;", "", "route", "", "(Ljava/lang/String;)V", "getRoute", "()Ljava/lang/String;", "Event", "Home", "Post", "Profile", "Trip", "Lhuutai/dev/meetmino/screen/BottomBarRoute$Event;", "Lhuutai/dev/meetmino/screen/BottomBarRoute$Home;", "Lhuutai/dev/meetmino/screen/BottomBarRoute$Post;", "Lhuutai/dev/meetmino/screen/BottomBarRoute$Profile;", "Lhuutai/dev/meetmino/screen/BottomBarRoute$Trip;", "app_debug"})
public abstract class BottomBarRoute {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String route = null;
    
    private BottomBarRoute(java.lang.String route) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRoute() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lhuutai/dev/meetmino/screen/BottomBarRoute$Event;", "Lhuutai/dev/meetmino/screen/BottomBarRoute;", "()V", "app_debug"})
    public static final class Event extends huutai.dev.meetmino.screen.BottomBarRoute {
        @org.jetbrains.annotations.NotNull()
        public static final huutai.dev.meetmino.screen.BottomBarRoute.Event INSTANCE = null;
        
        private Event() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lhuutai/dev/meetmino/screen/BottomBarRoute$Home;", "Lhuutai/dev/meetmino/screen/BottomBarRoute;", "()V", "app_debug"})
    public static final class Home extends huutai.dev.meetmino.screen.BottomBarRoute {
        @org.jetbrains.annotations.NotNull()
        public static final huutai.dev.meetmino.screen.BottomBarRoute.Home INSTANCE = null;
        
        private Home() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lhuutai/dev/meetmino/screen/BottomBarRoute$Post;", "Lhuutai/dev/meetmino/screen/BottomBarRoute;", "()V", "app_debug"})
    public static final class Post extends huutai.dev.meetmino.screen.BottomBarRoute {
        @org.jetbrains.annotations.NotNull()
        public static final huutai.dev.meetmino.screen.BottomBarRoute.Post INSTANCE = null;
        
        private Post() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lhuutai/dev/meetmino/screen/BottomBarRoute$Profile;", "Lhuutai/dev/meetmino/screen/BottomBarRoute;", "()V", "app_debug"})
    public static final class Profile extends huutai.dev.meetmino.screen.BottomBarRoute {
        @org.jetbrains.annotations.NotNull()
        public static final huutai.dev.meetmino.screen.BottomBarRoute.Profile INSTANCE = null;
        
        private Profile() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lhuutai/dev/meetmino/screen/BottomBarRoute$Trip;", "Lhuutai/dev/meetmino/screen/BottomBarRoute;", "()V", "app_debug"})
    public static final class Trip extends huutai.dev.meetmino.screen.BottomBarRoute {
        @org.jetbrains.annotations.NotNull()
        public static final huutai.dev.meetmino.screen.BottomBarRoute.Trip INSTANCE = null;
        
        private Trip() {
        }
    }
}