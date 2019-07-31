package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.data.C0161b;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: com.google.android.gms.games.d */
public final class C0324d extends C0161b implements Player {

    /* renamed from: tG */
    private final C0325a f687tG;

    /* renamed from: com.google.android.gms.games.d$a */
    private static final class C0325a {

        /* renamed from: tH */
        public final String f688tH;

        /* renamed from: tI */
        public final String f689tI;

        /* renamed from: tJ */
        public final String f690tJ;

        /* renamed from: tK */
        public final String f691tK;

        /* renamed from: tL */
        public final String f692tL;

        /* renamed from: tM */
        public final String f693tM;

        /* renamed from: tN */
        public final String f694tN;

        public C0325a(String str) {
            if (TextUtils.isEmpty(str)) {
                this.f688tH = "external_player_id";
                this.f689tI = "profile_name";
                this.f690tJ = "profile_icon_image_uri";
                this.f691tK = "profile_hi_res_image_uri";
                this.f692tL = "last_updated";
                this.f693tM = "is_in_circles";
                this.f694tN = "played_with_timestamp";
                return;
            }
            this.f688tH = str + "external_player_id";
            this.f689tI = str + "profile_name";
            this.f690tJ = str + "profile_icon_image_uri";
            this.f691tK = str + "profile_hi_res_image_uri";
            this.f692tL = str + "last_updated";
            this.f693tM = str + "is_in_circles";
            this.f694tN = str + "played_with_timestamp";
        }
    }

    public C0324d(DataHolder dataHolder, int i) {
        this(dataHolder, i, null);
    }

    public C0324d(DataHolder dataHolder, int i, String str) {
        super(dataHolder, i);
        this.f687tG = new C0325a(str);
    }

    /* renamed from: db */
    public int mo3014db() {
        return getInteger(this.f687tG.f693tM);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return PlayerEntity.m726a(this, obj);
    }

    public Player freeze() {
        return new PlayerEntity(this);
    }

    public String getDisplayName() {
        return getString(this.f687tG.f689tI);
    }

    public void getDisplayName(CharArrayBuffer dataOut) {
        mo2412a(this.f687tG.f689tI, dataOut);
    }

    public Uri getHiResImageUri() {
        return mo2410L(this.f687tG.f691tK);
    }

    public Uri getIconImageUri() {
        return mo2410L(this.f687tG.f690tJ);
    }

    public long getLastPlayedWithTimestamp() {
        if (!hasColumn(this.f687tG.f694tN)) {
            return -1;
        }
        return getLong(this.f687tG.f694tN);
    }

    public String getPlayerId() {
        return getString(this.f687tG.f688tH);
    }

    public long getRetrievedTimestamp() {
        return getLong(this.f687tG.f692tL);
    }

    public boolean hasHiResImage() {
        return getHiResImageUri() != null;
    }

    public boolean hasIconImage() {
        return getIconImageUri() != null;
    }

    public int hashCode() {
        return PlayerEntity.m725a(this);
    }

    public String toString() {
        return PlayerEntity.m728b((Player) this);
    }

    public void writeToParcel(Parcel dest, int flags) {
        ((PlayerEntity) freeze()).writeToParcel(dest, flags);
    }
}
