package huutai.dev.meetmino.model;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u00a2\u0006\u0002\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\tH\u00c6\u0003J\t\u0010 \u001a\u00020\u0007H\u00c6\u0003J\t\u0010!\u001a\u00020\tH\u00c6\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u00c6\u0003JU\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\t2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u00c6\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\'\u001a\u00020(H\u00d6\u0001J\t\u0010)\u001a\u00020\u0007H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b\u00a8\u0006*"}, d2 = {"Lhuutai/dev/meetmino/model/Leg;", "", "distance", "Lhuutai/dev/meetmino/model/Distance;", "duration", "Lhuutai/dev/meetmino/model/Duration;", "end_address", "", "end_location", "Lhuutai/dev/meetmino/model/LocationRoute;", "start_address", "start_location", "steps", "", "Lhuutai/dev/meetmino/model/Step;", "(Lhuutai/dev/meetmino/model/Distance;Lhuutai/dev/meetmino/model/Duration;Ljava/lang/String;Lhuutai/dev/meetmino/model/LocationRoute;Ljava/lang/String;Lhuutai/dev/meetmino/model/LocationRoute;Ljava/util/List;)V", "getDistance", "()Lhuutai/dev/meetmino/model/Distance;", "getDuration", "()Lhuutai/dev/meetmino/model/Duration;", "getEnd_address", "()Ljava/lang/String;", "getEnd_location", "()Lhuutai/dev/meetmino/model/LocationRoute;", "getStart_address", "getStart_location", "getSteps", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
public final class Leg {
    @org.jetbrains.annotations.NotNull()
    private final huutai.dev.meetmino.model.Distance distance = null;
    @org.jetbrains.annotations.NotNull()
    private final huutai.dev.meetmino.model.Duration duration = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String end_address = null;
    @org.jetbrains.annotations.NotNull()
    private final huutai.dev.meetmino.model.LocationRoute end_location = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String start_address = null;
    @org.jetbrains.annotations.NotNull()
    private final huutai.dev.meetmino.model.LocationRoute start_location = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<huutai.dev.meetmino.model.Step> steps = null;
    
    @org.jetbrains.annotations.NotNull()
    public final huutai.dev.meetmino.model.Distance component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final huutai.dev.meetmino.model.Duration component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final huutai.dev.meetmino.model.LocationRoute component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final huutai.dev.meetmino.model.LocationRoute component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<huutai.dev.meetmino.model.Step> component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final huutai.dev.meetmino.model.Leg copy(@org.jetbrains.annotations.NotNull()
    huutai.dev.meetmino.model.Distance distance, @org.jetbrains.annotations.NotNull()
    huutai.dev.meetmino.model.Duration duration, @org.jetbrains.annotations.NotNull()
    java.lang.String end_address, @org.jetbrains.annotations.NotNull()
    huutai.dev.meetmino.model.LocationRoute end_location, @org.jetbrains.annotations.NotNull()
    java.lang.String start_address, @org.jetbrains.annotations.NotNull()
    huutai.dev.meetmino.model.LocationRoute start_location, @org.jetbrains.annotations.NotNull()
    java.util.List<huutai.dev.meetmino.model.Step> steps) {
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
    
    public Leg(@org.jetbrains.annotations.NotNull()
    huutai.dev.meetmino.model.Distance distance, @org.jetbrains.annotations.NotNull()
    huutai.dev.meetmino.model.Duration duration, @org.jetbrains.annotations.NotNull()
    java.lang.String end_address, @org.jetbrains.annotations.NotNull()
    huutai.dev.meetmino.model.LocationRoute end_location, @org.jetbrains.annotations.NotNull()
    java.lang.String start_address, @org.jetbrains.annotations.NotNull()
    huutai.dev.meetmino.model.LocationRoute start_location, @org.jetbrains.annotations.NotNull()
    java.util.List<huutai.dev.meetmino.model.Step> steps) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final huutai.dev.meetmino.model.Distance getDistance() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final huutai.dev.meetmino.model.Duration getDuration() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEnd_address() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final huutai.dev.meetmino.model.LocationRoute getEnd_location() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStart_address() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final huutai.dev.meetmino.model.LocationRoute getStart_location() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<huutai.dev.meetmino.model.Step> getSteps() {
        return null;
    }
}