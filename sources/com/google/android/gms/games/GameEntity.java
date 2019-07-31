package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.C0596ee;
import com.google.android.gms.internal.C0629fc;
import com.google.android.gms.internal.C0703fm;

public final class GameEntity extends C0703fm implements Game {
    public static final Creator<GameEntity> CREATOR = new C0277a();

    /* renamed from: kg */
    private final int f566kg;

    /* renamed from: kh */
    private final String f567kh;

    /* renamed from: qa */
    private final String f568qa;

    /* renamed from: sH */
    private final String f569sH;

    /* renamed from: sI */
    private final String f570sI;

    /* renamed from: sJ */
    private final String f571sJ;

    /* renamed from: sK */
    private final String f572sK;

    /* renamed from: sL */
    private final Uri f573sL;

    /* renamed from: sM */
    private final Uri f574sM;

    /* renamed from: sN */
    private final Uri f575sN;

    /* renamed from: sO */
    private final boolean f576sO;

    /* renamed from: sP */
    private final boolean f577sP;

    /* renamed from: sQ */
    private final String f578sQ;

    /* renamed from: sR */
    private final int f579sR;

    /* renamed from: sS */
    private final int f580sS;

    /* renamed from: sT */
    private final int f581sT;

    /* renamed from: sU */
    private final boolean f582sU;

    /* renamed from: sV */
    private final boolean f583sV;

    /* renamed from: com.google.android.gms.games.GameEntity$a */
    static final class C0277a extends C0320a {
        C0277a() {
        }

        /* renamed from: Y */
        public GameEntity createFromParcel(Parcel parcel) {
            if (GameEntity.m1917c(GameEntity.m1411bM()) || GameEntity.m1408P(GameEntity.class.getCanonicalName())) {
                return super.createFromParcel(parcel);
            }
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            Uri parse = readString7 == null ? null : Uri.parse(readString7);
            String readString8 = parcel.readString();
            Uri parse2 = readString8 == null ? null : Uri.parse(readString8);
            String readString9 = parcel.readString();
            return new GameEntity(2, readString, readString2, readString3, readString4, readString5, readString6, parse, parse2, readString9 == null ? null : Uri.parse(readString9), parcel.readInt() > 0, parcel.readInt() > 0, parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), false, false);
        }
    }

    GameEntity(int versionCode, String applicationId, String displayName, String primaryCategory, String secondaryCategory, String description, String developerName, Uri iconImageUri, Uri hiResImageUri, Uri featuredImageUri, boolean playEnabledGame, boolean instanceInstalled, String instancePackageName, int gameplayAclStatus, int achievementTotalCount, int leaderboardCount, boolean realTimeEnabled, boolean turnBasedEnabled) {
        this.f566kg = versionCode;
        this.f567kh = applicationId;
        this.f568qa = displayName;
        this.f569sH = primaryCategory;
        this.f570sI = secondaryCategory;
        this.f571sJ = description;
        this.f572sK = developerName;
        this.f573sL = iconImageUri;
        this.f574sM = hiResImageUri;
        this.f575sN = featuredImageUri;
        this.f576sO = playEnabledGame;
        this.f577sP = instanceInstalled;
        this.f578sQ = instancePackageName;
        this.f579sR = gameplayAclStatus;
        this.f580sS = achievementTotalCount;
        this.f581sT = leaderboardCount;
        this.f582sU = realTimeEnabled;
        this.f583sV = turnBasedEnabled;
    }

    public GameEntity(Game game) {
        this.f566kg = 2;
        this.f567kh = game.getApplicationId();
        this.f569sH = game.getPrimaryCategory();
        this.f570sI = game.getSecondaryCategory();
        this.f571sJ = game.getDescription();
        this.f572sK = game.getDeveloperName();
        this.f568qa = game.getDisplayName();
        this.f573sL = game.getIconImageUri();
        this.f574sM = game.getHiResImageUri();
        this.f575sN = game.getFeaturedImageUri();
        this.f576sO = game.isPlayEnabledGame();
        this.f577sP = game.isInstanceInstalled();
        this.f578sQ = game.getInstancePackageName();
        this.f579sR = game.getGameplayAclStatus();
        this.f580sS = game.getAchievementTotalCount();
        this.f581sT = game.getLeaderboardCount();
        this.f582sU = game.isRealTimeMultiplayerEnabled();
        this.f583sV = game.isTurnBasedMultiplayerEnabled();
    }

    /* renamed from: a */
    static int m638a(Game game) {
        return C0596ee.hashCode(game.getApplicationId(), game.getDisplayName(), game.getPrimaryCategory(), game.getSecondaryCategory(), game.getDescription(), game.getDeveloperName(), game.getIconImageUri(), game.getHiResImageUri(), game.getFeaturedImageUri(), Boolean.valueOf(game.isPlayEnabledGame()), Boolean.valueOf(game.isInstanceInstalled()), game.getInstancePackageName(), Integer.valueOf(game.getGameplayAclStatus()), Integer.valueOf(game.getAchievementTotalCount()), Integer.valueOf(game.getLeaderboardCount()), Boolean.valueOf(game.isRealTimeMultiplayerEnabled()), Boolean.valueOf(game.isTurnBasedMultiplayerEnabled()));
    }

    /* renamed from: a */
    static boolean m639a(Game game, Object obj) {
        if (!(obj instanceof Game)) {
            return false;
        }
        if (game == obj) {
            return true;
        }
        Game game2 = (Game) obj;
        return C0596ee.equal(game2.getApplicationId(), game.getApplicationId()) && C0596ee.equal(game2.getDisplayName(), game.getDisplayName()) && C0596ee.equal(game2.getPrimaryCategory(), game.getPrimaryCategory()) && C0596ee.equal(game2.getSecondaryCategory(), game.getSecondaryCategory()) && C0596ee.equal(game2.getDescription(), game.getDescription()) && C0596ee.equal(game2.getDeveloperName(), game.getDeveloperName()) && C0596ee.equal(game2.getIconImageUri(), game.getIconImageUri()) && C0596ee.equal(game2.getHiResImageUri(), game.getHiResImageUri()) && C0596ee.equal(game2.getFeaturedImageUri(), game.getFeaturedImageUri()) && C0596ee.equal(Boolean.valueOf(game2.isPlayEnabledGame()), Boolean.valueOf(game.isPlayEnabledGame())) && C0596ee.equal(Boolean.valueOf(game2.isInstanceInstalled()), Boolean.valueOf(game.isInstanceInstalled())) && C0596ee.equal(game2.getInstancePackageName(), game.getInstancePackageName()) && C0596ee.equal(Integer.valueOf(game2.getGameplayAclStatus()), Integer.valueOf(game.getGameplayAclStatus())) && C0596ee.equal(Integer.valueOf(game2.getAchievementTotalCount()), Integer.valueOf(game.getAchievementTotalCount())) && C0596ee.equal(Integer.valueOf(game2.getLeaderboardCount()), Integer.valueOf(game.getLeaderboardCount())) && C0596ee.equal(Boolean.valueOf(game2.isRealTimeMultiplayerEnabled()), Boolean.valueOf(game.isRealTimeMultiplayerEnabled())) && C0596ee.equal(Boolean.valueOf(game2.isTurnBasedMultiplayerEnabled()), Boolean.valueOf(game.isTurnBasedMultiplayerEnabled()));
    }

    /* renamed from: b */
    static String m641b(Game game) {
        return C0596ee.m1542e(game).mo3971a("ApplicationId", game.getApplicationId()).mo3971a("DisplayName", game.getDisplayName()).mo3971a("PrimaryCategory", game.getPrimaryCategory()).mo3971a("SecondaryCategory", game.getSecondaryCategory()).mo3971a("Description", game.getDescription()).mo3971a("DeveloperName", game.getDeveloperName()).mo3971a("IconImageUri", game.getIconImageUri()).mo3971a("HiResImageUri", game.getHiResImageUri()).mo3971a("FeaturedImageUri", game.getFeaturedImageUri()).mo3971a("PlayEnabledGame", Boolean.valueOf(game.isPlayEnabledGame())).mo3971a("InstanceInstalled", Boolean.valueOf(game.isInstanceInstalled())).mo3971a("InstancePackageName", game.getInstancePackageName()).mo3971a("GameplayAclStatus", Integer.valueOf(game.getGameplayAclStatus())).mo3971a("AchievementTotalCount", Integer.valueOf(game.getAchievementTotalCount())).mo3971a("LeaderboardCount", Integer.valueOf(game.getLeaderboardCount())).mo3971a("RealTimeMultiplayerEnabled", Boolean.valueOf(game.isRealTimeMultiplayerEnabled())).mo3971a("TurnBasedMultiplayerEnabled", Boolean.valueOf(game.isTurnBasedMultiplayerEnabled())).toString();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return m639a(this, obj);
    }

    public Game freeze() {
        return this;
    }

    public int getAchievementTotalCount() {
        return this.f580sS;
    }

    public String getApplicationId() {
        return this.f567kh;
    }

    public String getDescription() {
        return this.f571sJ;
    }

    public void getDescription(CharArrayBuffer dataOut) {
        C0629fc.m1697b(this.f571sJ, dataOut);
    }

    public String getDeveloperName() {
        return this.f572sK;
    }

    public void getDeveloperName(CharArrayBuffer dataOut) {
        C0629fc.m1697b(this.f572sK, dataOut);
    }

    public String getDisplayName() {
        return this.f568qa;
    }

    public void getDisplayName(CharArrayBuffer dataOut) {
        C0629fc.m1697b(this.f568qa, dataOut);
    }

    public Uri getFeaturedImageUri() {
        return this.f575sN;
    }

    public int getGameplayAclStatus() {
        return this.f579sR;
    }

    public Uri getHiResImageUri() {
        return this.f574sM;
    }

    public Uri getIconImageUri() {
        return this.f573sL;
    }

    public String getInstancePackageName() {
        return this.f578sQ;
    }

    public int getLeaderboardCount() {
        return this.f581sT;
    }

    public String getPrimaryCategory() {
        return this.f569sH;
    }

    public String getSecondaryCategory() {
        return this.f570sI;
    }

    public int getVersionCode() {
        return this.f566kg;
    }

    public int hashCode() {
        return m638a(this);
    }

    public boolean isDataValid() {
        return true;
    }

    public boolean isInstanceInstalled() {
        return this.f577sP;
    }

    public boolean isPlayEnabledGame() {
        return this.f576sO;
    }

    public boolean isRealTimeMultiplayerEnabled() {
        return this.f582sU;
    }

    public boolean isTurnBasedMultiplayerEnabled() {
        return this.f583sV;
    }

    public String toString() {
        return m641b((Game) this);
    }

    public void writeToParcel(Parcel dest, int flags) {
        int i = 1;
        String str = null;
        if (!mo3885bN()) {
            C0320a.m733a(this, dest, flags);
            return;
        }
        dest.writeString(this.f567kh);
        dest.writeString(this.f568qa);
        dest.writeString(this.f569sH);
        dest.writeString(this.f570sI);
        dest.writeString(this.f571sJ);
        dest.writeString(this.f572sK);
        dest.writeString(this.f573sL == null ? null : this.f573sL.toString());
        dest.writeString(this.f574sM == null ? null : this.f574sM.toString());
        if (this.f575sN != null) {
            str = this.f575sN.toString();
        }
        dest.writeString(str);
        dest.writeInt(this.f576sO ? 1 : 0);
        if (!this.f577sP) {
            i = 0;
        }
        dest.writeInt(i);
        dest.writeString(this.f578sQ);
        dest.writeInt(this.f579sR);
        dest.writeInt(this.f580sS);
        dest.writeInt(this.f581sT);
    }
}
