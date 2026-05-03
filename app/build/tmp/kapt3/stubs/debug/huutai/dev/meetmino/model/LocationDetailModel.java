package huutai.dev.meetmino.model;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\b\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\b\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\b\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\b\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u00a2\u0006\u0002\u0010\u0019J\t\u0010,\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00140\bH\u00c6\u0003J\u000f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00160\bH\u00c6\u0003J\t\u0010/\u001a\u00020\u0018H\u00c6\u0003J\t\u00100\u001a\u00020\u0005H\u00c6\u0003J\t\u00101\u001a\u00020\u0005H\u00c6\u0003J\u000f\u00102\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u00c6\u0003J\t\u00103\u001a\u00020\tH\u00c6\u0003J\u000f\u00104\u001a\b\u0012\u0004\u0012\u00020\f0\bH\u00c6\u0003J\u000f\u00105\u001a\b\u0012\u0004\u0012\u00020\u000e0\bH\u00c6\u0003J\t\u00106\u001a\u00020\u0010H\u00c6\u0003J\u000f\u00107\u001a\b\u0012\u0004\u0012\u00020\u00120\bH\u00c6\u0003J\u00a5\u0001\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\b2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\b2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\b2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\b2\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u00c6\u0001J\u0013\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010<\u001a\u00020\u0005H\u00d6\u0001J\t\u0010=\u001a\u00020\tH\u00d6\u0001R\u0011\u0010\n\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001dR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\b\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001dR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\b\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001dR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\'R\u0011\u0010\u0017\u001a\u00020\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010+\u00a8\u0006>"}, d2 = {"Lhuutai/dev/meetmino/model/LocationDetailModel;", "", "rating", "", "totalReview", "", "visitors", "images", "", "", "about", "highLights", "Lhuutai/dev/meetmino/model/HighLight;", "activities", "Lhuutai/dev/meetmino/model/Activity;", "detail", "Lhuutai/dev/meetmino/model/Detail;", "reviews", "Lhuutai/dev/meetmino/model/Review;", "nearbyAttractions", "Lhuutai/dev/meetmino/model/NearbyAttraction;", "transportations", "Lhuutai/dev/meetmino/model/Transportation;", "weather", "Lhuutai/dev/meetmino/model/Weather;", "(FIILjava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lhuutai/dev/meetmino/model/Detail;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lhuutai/dev/meetmino/model/Weather;)V", "getAbout", "()Ljava/lang/String;", "getActivities", "()Ljava/util/List;", "getDetail", "()Lhuutai/dev/meetmino/model/Detail;", "getHighLights", "getImages", "getNearbyAttractions", "getRating", "()F", "getReviews", "getTotalReview", "()I", "getTransportations", "getVisitors", "getWeather", "()Lhuutai/dev/meetmino/model/Weather;", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class LocationDetailModel {
    private final float rating = 0.0F;
    private final int totalReview = 0;
    private final int visitors = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> images = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String about = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<huutai.dev.meetmino.model.HighLight> highLights = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<huutai.dev.meetmino.model.Activity> activities = null;
    @org.jetbrains.annotations.NotNull()
    private final huutai.dev.meetmino.model.Detail detail = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<huutai.dev.meetmino.model.Review> reviews = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<huutai.dev.meetmino.model.NearbyAttraction> nearbyAttractions = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<huutai.dev.meetmino.model.Transportation> transportations = null;
    @org.jetbrains.annotations.NotNull()
    private final huutai.dev.meetmino.model.Weather weather = null;
    
    public final float component1() {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<huutai.dev.meetmino.model.NearbyAttraction> component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<huutai.dev.meetmino.model.Transportation> component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final huutai.dev.meetmino.model.Weather component12() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int component3() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<huutai.dev.meetmino.model.HighLight> component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<huutai.dev.meetmino.model.Activity> component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final huutai.dev.meetmino.model.Detail component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<huutai.dev.meetmino.model.Review> component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final huutai.dev.meetmino.model.LocationDetailModel copy(float rating, int totalReview, int visitors, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> images, @org.jetbrains.annotations.NotNull()
    java.lang.String about, @org.jetbrains.annotations.NotNull()
    java.util.List<huutai.dev.meetmino.model.HighLight> highLights, @org.jetbrains.annotations.NotNull()
    java.util.List<huutai.dev.meetmino.model.Activity> activities, @org.jetbrains.annotations.NotNull()
    huutai.dev.meetmino.model.Detail detail, @org.jetbrains.annotations.NotNull()
    java.util.List<huutai.dev.meetmino.model.Review> reviews, @org.jetbrains.annotations.NotNull()
    java.util.List<huutai.dev.meetmino.model.NearbyAttraction> nearbyAttractions, @org.jetbrains.annotations.NotNull()
    java.util.List<huutai.dev.meetmino.model.Transportation> transportations, @org.jetbrains.annotations.NotNull()
    huutai.dev.meetmino.model.Weather weather) {
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
    
    public LocationDetailModel(float rating, int totalReview, int visitors, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> images, @org.jetbrains.annotations.NotNull()
    java.lang.String about, @org.jetbrains.annotations.NotNull()
    java.util.List<huutai.dev.meetmino.model.HighLight> highLights, @org.jetbrains.annotations.NotNull()
    java.util.List<huutai.dev.meetmino.model.Activity> activities, @org.jetbrains.annotations.NotNull()
    huutai.dev.meetmino.model.Detail detail, @org.jetbrains.annotations.NotNull()
    java.util.List<huutai.dev.meetmino.model.Review> reviews, @org.jetbrains.annotations.NotNull()
    java.util.List<huutai.dev.meetmino.model.NearbyAttraction> nearbyAttractions, @org.jetbrains.annotations.NotNull()
    java.util.List<huutai.dev.meetmino.model.Transportation> transportations, @org.jetbrains.annotations.NotNull()
    huutai.dev.meetmino.model.Weather weather) {
        super();
    }
    
    public final float getRating() {
        return 0.0F;
    }
    
    public final int getTotalReview() {
        return 0;
    }
    
    public final int getVisitors() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getImages() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAbout() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<huutai.dev.meetmino.model.HighLight> getHighLights() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<huutai.dev.meetmino.model.Activity> getActivities() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final huutai.dev.meetmino.model.Detail getDetail() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<huutai.dev.meetmino.model.Review> getReviews() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<huutai.dev.meetmino.model.NearbyAttraction> getNearbyAttractions() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<huutai.dev.meetmino.model.Transportation> getTransportations() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final huutai.dev.meetmino.model.Weather getWeather() {
        return null;
    }
}