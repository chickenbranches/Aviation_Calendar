package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class OfferWalletObject implements SafeParcelable {
    public static final Creator<OfferWalletObject> CREATOR = new C1138k();

    /* renamed from: GA */
    String f2821GA;

    /* renamed from: GX */
    String f2822GX;

    /* renamed from: kg */
    private final int f2823kg;

    OfferWalletObject() {
        this.f2823kg = 2;
    }

    OfferWalletObject(int versionCode, String id, String redemptionCode) {
        this.f2823kg = versionCode;
        this.f2821GA = id;
        this.f2822GX = redemptionCode;
    }

    public int describeContents() {
        return 0;
    }

    public String getId() {
        return this.f2821GA;
    }

    public String getRedemptionCode() {
        return this.f2822GX;
    }

    public int getVersionCode() {
        return this.f2823kg;
    }

    public void writeToParcel(Parcel dest, int flags) {
        C1138k.m3308a(this, dest, flags);
    }
}
