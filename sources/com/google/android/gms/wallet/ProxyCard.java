package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class ProxyCard implements SafeParcelable {
    public static final Creator<ProxyCard> CREATOR = new C1139l();

    /* renamed from: GY */
    String f2824GY;

    /* renamed from: GZ */
    String f2825GZ;

    /* renamed from: Ha */
    int f2826Ha;

    /* renamed from: Hb */
    int f2827Hb;

    /* renamed from: kg */
    private final int f2828kg;

    ProxyCard(int versionCode, String pan, String cvn, int expirationMonth, int expirationYear) {
        this.f2828kg = versionCode;
        this.f2824GY = pan;
        this.f2825GZ = cvn;
        this.f2826Ha = expirationMonth;
        this.f2827Hb = expirationYear;
    }

    public int describeContents() {
        return 0;
    }

    public String getCvn() {
        return this.f2825GZ;
    }

    public int getExpirationMonth() {
        return this.f2826Ha;
    }

    public int getExpirationYear() {
        return this.f2827Hb;
    }

    public String getPan() {
        return this.f2824GY;
    }

    public int getVersionCode() {
        return this.f2828kg;
    }

    public void writeToParcel(Parcel out, int flags) {
        C1139l.m3311a(this, out, flags);
    }
}
