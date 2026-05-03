package huutai.dev.meetmino.model;

import java.util.Date;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b7\b\u0087\b\u0018\u00002\u00020\u0001B\u00d3\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0014\u001a\u00020\u000b\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u00a2\u0006\u0002\u0010\u001eJ\t\u00108\u001a\u00020\u0003H\u00c6\u0003J\t\u00109\u001a\u00020\u0003H\u00c6\u0003J\t\u0010:\u001a\u00020\u0003H\u00c6\u0003J\t\u0010;\u001a\u00020\u0003H\u00c6\u0003J\t\u0010<\u001a\u00020\u0003H\u00c6\u0003J\t\u0010=\u001a\u00020\u000bH\u00c6\u0003J\t\u0010>\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\t\u0010@\u001a\u00020\u000bH\u00c6\u0003J\t\u0010A\u001a\u00020\u0016H\u00c6\u0003J\t\u0010B\u001a\u00020\u0016H\u00c6\u0003J\t\u0010C\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0019H\u00c6\u0003J\t\u0010E\u001a\u00020\u000bH\u00c6\u0003J\t\u0010F\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u001dH\u00c6\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010J\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010M\u001a\u00020\u000bH\u00c6\u0003J\t\u0010N\u001a\u00020\u0003H\u00c6\u0003J\u00fd\u0001\u0010O\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u00c6\u0001J\u0013\u0010P\u001a\u00020\u000b2\b\u0010Q\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010R\u001a\u00020\u0016H\u00d6\u0001J\t\u0010S\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0017\u001a\u00020\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010 R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010 R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010 R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010 R\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010 R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010 R\u0011\u0010\u0011\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010)R\u0011\u0010\u001a\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010)R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010)R\u0011\u0010\u0014\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010)R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\u001b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010 R\u0011\u0010\u0015\u001a\u00020\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010\"R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010 R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010 R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010 R\u0011\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010 R\u0011\u0010\u0010\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010 R\u0011\u0010\u0012\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010 \u00a8\u0006T"}, d2 = {"Lhuutai/dev/meetmino/model/User;", "", "id", "", "createdAt", "createdBy", "createdByName", "updatedAt", "updatedBy", "deleteBy", "isDeleted", "", "username", "email", "avatar", "verifyAt", "verifyCode", "isActive", "verifyExpiredTime", "userDetail", "isPremium", "tripsThisMonth", "", "collaboratorsUsed", "subscriptionEndDate", "Ljava/util/Date;", "isAutoRenew", "subscriptionStatus", "pricingPlanSuggest", "Lhuutai/dev/meetmino/model/PricingPlanModel;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Object;ZIILjava/util/Date;ZLjava/lang/String;Lhuutai/dev/meetmino/model/PricingPlanModel;)V", "getAvatar", "()Ljava/lang/String;", "getCollaboratorsUsed", "()I", "getCreatedAt", "getCreatedBy", "getCreatedByName", "getDeleteBy", "getEmail", "getId", "()Z", "getPricingPlanSuggest", "()Lhuutai/dev/meetmino/model/PricingPlanModel;", "getSubscriptionEndDate", "()Ljava/util/Date;", "getSubscriptionStatus", "getTripsThisMonth", "getUpdatedAt", "getUpdatedBy", "getUserDetail", "()Ljava/lang/Object;", "getUsername", "getVerifyAt", "getVerifyCode", "getVerifyExpiredTime", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_debug"})
public final class User {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String id = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String createdAt = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String createdBy = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String createdByName = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String updatedAt = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String updatedBy = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String deleteBy = null;
    private final boolean isDeleted = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String username = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String email = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String avatar = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String verifyAt = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String verifyCode = null;
    private final boolean isActive = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String verifyExpiredTime = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Object userDetail = null;
    private final boolean isPremium = false;
    private final int tripsThisMonth = 0;
    private final int collaboratorsUsed = 0;
    @org.jetbrains.annotations.Nullable()
    private final java.util.Date subscriptionEndDate = null;
    private final boolean isAutoRenew = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String subscriptionStatus = null;
    @org.jetbrains.annotations.Nullable()
    private final huutai.dev.meetmino.model.PricingPlanModel pricingPlanSuggest = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component13() {
        return null;
    }
    
    public final boolean component14() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component16() {
        return null;
    }
    
    public final boolean component17() {
        return false;
    }
    
    public final int component18() {
        return 0;
    }
    
    public final int component19() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date component20() {
        return null;
    }
    
    public final boolean component21() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component22() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final huutai.dev.meetmino.model.PricingPlanModel component23() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    public final boolean component8() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final huutai.dev.meetmino.model.User copy(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String createdAt, @org.jetbrains.annotations.Nullable()
    java.lang.String createdBy, @org.jetbrains.annotations.Nullable()
    java.lang.String createdByName, @org.jetbrains.annotations.NotNull()
    java.lang.String updatedAt, @org.jetbrains.annotations.Nullable()
    java.lang.String updatedBy, @org.jetbrains.annotations.Nullable()
    java.lang.String deleteBy, boolean isDeleted, @org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String avatar, @org.jetbrains.annotations.NotNull()
    java.lang.String verifyAt, @org.jetbrains.annotations.NotNull()
    java.lang.String verifyCode, boolean isActive, @org.jetbrains.annotations.NotNull()
    java.lang.String verifyExpiredTime, @org.jetbrains.annotations.Nullable()
    java.lang.Object userDetail, boolean isPremium, int tripsThisMonth, int collaboratorsUsed, @org.jetbrains.annotations.Nullable()
    java.util.Date subscriptionEndDate, boolean isAutoRenew, @org.jetbrains.annotations.NotNull()
    java.lang.String subscriptionStatus, @org.jetbrains.annotations.Nullable()
    huutai.dev.meetmino.model.PricingPlanModel pricingPlanSuggest) {
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
    
    public User(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String createdAt, @org.jetbrains.annotations.Nullable()
    java.lang.String createdBy, @org.jetbrains.annotations.Nullable()
    java.lang.String createdByName, @org.jetbrains.annotations.NotNull()
    java.lang.String updatedAt, @org.jetbrains.annotations.Nullable()
    java.lang.String updatedBy, @org.jetbrains.annotations.Nullable()
    java.lang.String deleteBy, boolean isDeleted, @org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String avatar, @org.jetbrains.annotations.NotNull()
    java.lang.String verifyAt, @org.jetbrains.annotations.NotNull()
    java.lang.String verifyCode, boolean isActive, @org.jetbrains.annotations.NotNull()
    java.lang.String verifyExpiredTime, @org.jetbrains.annotations.Nullable()
    java.lang.Object userDetail, boolean isPremium, int tripsThisMonth, int collaboratorsUsed, @org.jetbrains.annotations.Nullable()
    java.util.Date subscriptionEndDate, boolean isAutoRenew, @org.jetbrains.annotations.NotNull()
    java.lang.String subscriptionStatus, @org.jetbrains.annotations.Nullable()
    huutai.dev.meetmino.model.PricingPlanModel pricingPlanSuggest) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCreatedAt() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCreatedBy() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCreatedByName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUpdatedAt() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUpdatedBy() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDeleteBy() {
        return null;
    }
    
    public final boolean isDeleted() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUsername() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEmail() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAvatar() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getVerifyAt() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getVerifyCode() {
        return null;
    }
    
    public final boolean isActive() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getVerifyExpiredTime() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getUserDetail() {
        return null;
    }
    
    public final boolean isPremium() {
        return false;
    }
    
    public final int getTripsThisMonth() {
        return 0;
    }
    
    public final int getCollaboratorsUsed() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date getSubscriptionEndDate() {
        return null;
    }
    
    public final boolean isAutoRenew() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSubscriptionStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final huutai.dev.meetmino.model.PricingPlanModel getPricingPlanSuggest() {
        return null;
    }
}