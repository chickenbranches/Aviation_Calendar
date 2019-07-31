package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.C0564ds;
import com.google.android.gms.internal.C0596ee;
import com.google.android.gms.internal.C0629fc;
import com.google.android.gms.internal.C0703fm;

public final class PlayerEntity extends C0703fm implements Player {
    public static final Creator<PlayerEntity> CREATOR = new C0319a();

    /* renamed from: kg */
    private final int f679kg;

    /* renamed from: qa */
    private final String f680qa;

    /* renamed from: sL */
    private final Uri f681sL;

    /* renamed from: sM */
    private final Uri f682sM;

    /* renamed from: tC */
    private final String f683tC;

    /* renamed from: tD */
    private final long f684tD;

    /* renamed from: tE */
    private final int f685tE;

    /* renamed from: tF */
    private final long f686tF;

    /* renamed from: com.google.android.gms.games.PlayerEntity$a */
    static final class C0319a extends C0323c {
        C0319a() {
        }

        /* renamed from: Z */
        public PlayerEntity createFromParcel(Parcel parcel) {
            Uri uri = null;
            if (PlayerEntity.m1917c(PlayerEntity.m1411bM()) || PlayerEntity.m1408P(PlayerEntity.class.getCanonicalName())) {
                return super.createFromParcel(parcel);
            }
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            Uri parse = readString3 == null ? null : Uri.parse(readString3);
            if (readString4 != null) {
                uri = Uri.parse(readString4);
            }
            return new PlayerEntity(3, readString, readString2, parse, uri, parcel.readLong(), -1, -1);
        }
    }

    PlayerEntity(int versionCode, String playerId, String displayName, Uri iconImageUri, Uri hiResImageUri, long retrievedTimestamp, int isInCircles, long lastPlayedWithTimestamp) {
        this.f679kg = versionCode;
        this.f683tC = playerId;
        this.f680qa = displayName;
        this.f681sL = iconImageUri;
        this.f682sM = hiResImageUri;
        this.f684tD = retrievedTimestamp;
        this.f685tE = isInCircles;
        this.f686tF = lastPlayedWithTimestamp;
    }

    public PlayerEntity(Player player) {
        this.f679kg = 3;
        this.f683tC = player.getPlayerId();
        this.f680qa = player.getDisplayName();
        this.f681sL = player.getIconImageUri();
        this.f682sM = player.getHiResImageUri();
        this.f684tD = player.getRetrievedTimestamp();
        this.f685tE = player.mo3014db();
        this.f686tF = player.getLastPlayedWithTimestamp();
        C0564ds.m1396d(this.f683tC);
        C0564ds.m1396d(this.f680qa);
        C0564ds.m1397p(this.f684tD > 0);
    }

    /* renamed from: a */
    static int m725a(Player player) {
        return C0596ee.hashCode(player.getPlayerId(), player.getDisplayName(), player.getIconImageUri(), player.getHiResImageUri(), Long.valueOf(player.getRetrievedTimestamp()));
    }

    /* renamed from: a */
    static boolean m726a(Player player, Object obj) {
        if (!(obj instanceof Player)) {
            return false;
        }
        if (player == obj) {
            return true;
        }
        Player player2 = (Player) obj;
        return C0596ee.equal(player2.getPlayerId(), player.getPlayerId()) && C0596ee.equal(player2.getDisplayName(), player.getDisplayName()) && C0596ee.equal(player2.getIconImageUri(), player.getIconImageUri()) && C0596ee.equal(player2.getHiResImageUri(), player.getHiResImageUri()) && C0596ee.equal(Long.valueOf(player2.getRetrievedTimestamp()), Long.valueOf(player.getRetrievedTimestamp()));
    }

    /* renamed from: b */
    static String m728b(Player player) {
        return C0596ee.m1542e(player).mo3971a("PlayerId", player.getPlayerId()).mo3971a("DisplayName", player.getDisplayName()).mo3971a("IconImageUri", player.getIconImageUri()).mo3971a("HiResImageUri", player.getHiResImageUri()).mo3971a("RetrievedTimestamp", Long.valueOf(player.getRetrievedTimestamp())).toString();
    }

    /* renamed from: db */
    public int mo3014db() {
        return this.f685tE;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return m726a(this, obj);
    }

    public Player freeze() {
        return this;
    }

    public String getDisplayName() {
        return this.f680qa;
    }

    public void getDisplayName(CharArrayBuffer dataOut) {
        C0629fc.m1697b(this.f680qa, dataOut);
    }

    public Uri getHiResImageUri() {
        return this.f682sM;
    }

    public Uri getIconImageUri() {
        return this.f681sL;
    }

    public long getLastPlayedWithTimestamp() {
        return this.f686tF;
    }

    public String getPlayerId() {
        return this.f683tC;
    }

    public long getRetrievedTimestamp() {
        return this.f684tD;
    }

    public int getVersionCode() {
        return this.f679kg;
    }

    public boolean hasHiResImage() {
        return getHiResImageUri() != null;
    }

    public boolean hasIconImage() {
        return getIconImageUri() != null;
    }

    public int hashCode() {
        return m725a(this);
    }

    public boolean isDataValid() {
        return true;
    }

    public String toString() {
        return m728b((Player) this);
    }

    public void writeToParcel(Parcel dest, int flags) {
        String str = null;
        if (!mo3885bN()) {
            C0323c.m736a(this, dest, flags);
            return;
        }
        dest.writeString(this.f683tC);
        dest.writeString(this.f680qa);
        dest.writeString(this.f681sL == null ? null : this.f681sL.toString());
        if (this.f682sM != null) {
            str = this.f682sM.toString();
        }
        dest.writeString(str);
        dest.writeLong(this.f684tD);
    }
}
