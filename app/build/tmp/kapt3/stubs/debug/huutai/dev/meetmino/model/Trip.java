package huutai.dev.meetmino.model;

import com.google.android.gms.maps.model.LatLng;
import java.io.Serializable;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\n\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0002\u0010\u0012J\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001fJ\u000b\u0010&\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0005H\u00c6\u0003J\t\u0010(\u001a\u00020\u0005H\u00c6\u0003J\t\u0010)\u001a\u00020\u0005H\u00c6\u0003J\t\u0010*\u001a\u00020\u0005H\u00c6\u0003J\u0011\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\nH\u00c6\u0003J\u0011\u0010,\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\nH\u00c6\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0094\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00c6\u0001\u00a2\u0006\u0002\u00100J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u000104H\u00d6\u0003J\t\u00105\u001a\u00020\u0003H\u00d6\u0001J\t\u00106\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0014\u00a8\u00067"}, d2 = {"Lhuutai/dev/meetmino/model/Trip;", "Ljava/io/Serializable;", "totalDays", "", "typeTrip", "", "startDate", "endDate", "budget", "favorites", "", "days", "Lhuutai/dev/meetmino/model/TripDay;", "id", "thumbnail", "totalSave", "tripDirection", "Lhuutai/dev/meetmino/model/TripDirection;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lhuutai/dev/meetmino/model/TripDirection;)V", "getBudget", "()Ljava/lang/String;", "getDays", "()Ljava/util/List;", "getEndDate", "getFavorites", "getId", "getStartDate", "getThumbnail", "getTotalDays", "()I", "getTotalSave", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTripDirection", "()Lhuutai/dev/meetmino/model/TripDirection;", "getTypeTrip", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lhuutai/dev/meetmino/model/TripDirection;)Lhuutai/dev/meetmino/model/Trip;", "equals", "", "other", "", "hashCode", "toString", "app_debug"})
public final class Trip implements java.io.Serializable {
    private final int totalDays = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String typeTrip = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String startDate = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String endDate = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String budget = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<java.lang.String> favorites = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<huutai.dev.meetmino.model.TripDay> days = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String id = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String thumbnail = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer totalSave = null;
    @org.jetbrains.annotations.Nullable()
    private final huutai.dev.meetmino.model.TripDirection tripDirection = null;
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final huutai.dev.meetmino.model.TripDirection component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<huutai.dev.meetmino.model.TripDay> component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final huutai.dev.meetmino.model.Trip copy(int totalDays, @org.jetbrains.annotations.NotNull()
    java.lang.String typeTrip, @org.jetbrains.annotations.NotNull()
    java.lang.String startDate, @org.jetbrains.annotations.NotNull()
    java.lang.String endDate, @org.jetbrains.annotations.NotNull()
    java.lang.String budget, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> favorites, @org.jetbrains.annotations.Nullable()
    java.util.List<huutai.dev.meetmino.model.TripDay> days, @org.jetbrains.annotations.Nullable()
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    java.lang.String thumbnail, @org.jetbrains.annotations.Nullable()
    java.lang.Integer totalSave, @org.jetbrains.annotations.Nullable()
    huutai.dev.meetmino.model.TripDirection tripDirection) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
    
    public Trip(int totalDays, @org.jetbrains.annotations.NotNull()
    java.lang.String typeTrip, @org.jetbrains.annotations.NotNull()
    java.lang.String startDate, @org.jetbrains.annotations.NotNull()
    java.lang.String endDate, @org.jetbrains.annotations.NotNull()
    java.lang.String budget, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> favorites, @org.jetbrains.annotations.Nullable()
    java.util.List<huutai.dev.meetmino.model.TripDay> days, @org.jetbrains.annotations.Nullable()
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    java.lang.String thumbnail, @org.jetbrains.annotations.Nullable()
    java.lang.Integer totalSave, @org.jetbrains.annotations.Nullable()
    huutai.dev.meetmino.model.TripDirection tripDirection) {
        super();
    }
    
    public final int getTotalDays() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTypeTrip() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStartDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEndDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBudget() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getFavorites() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<huutai.dev.meetmino.model.TripDay> getDays() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getThumbnail() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getTotalSave() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final huutai.dev.meetmino.model.TripDirection getTripDirection() {
        return null;
    }
}