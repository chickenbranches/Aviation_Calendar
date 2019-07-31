package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class LoyaltyWalletObject implements SafeParcelable {
    public static final Creator<LoyaltyWalletObject> CREATOR = new C1134g();

    /* renamed from: GA */
    String f2784GA;

    /* renamed from: GB */
    String f2785GB;

    /* renamed from: GC */
    String f2786GC;

    /* renamed from: GD */
    String f2787GD;

    /* renamed from: GE */
    String f2788GE;

    /* renamed from: GF */
    String f2789GF;

    /* renamed from: GG */
    String f2790GG;

    /* renamed from: GH */
    String f2791GH;

    /* renamed from: kg */
    private final int f2792kg;

    LoyaltyWalletObject() {
        this.f2792kg = 3;
    }

    LoyaltyWalletObject(int versionCode, String id, String accountId, String issuerName, String programName, String accountName, String barcodeAlternateText, String barcodeType, String barcodeValue) {
        this.f2792kg = versionCode;
        this.f2784GA = id;
        this.f2785GB = accountId;
        this.f2786GC = issuerName;
        this.f2787GD = programName;
        this.f2788GE = accountName;
        this.f2789GF = barcodeAlternateText;
        this.f2790GG = barcodeType;
        this.f2791GH = barcodeValue;
    }

    public int describeContents() {
        return 0;
    }

    public String getAccountId() {
        return this.f2785GB;
    }

    public String getAccountName() {
        return this.f2788GE;
    }

    public String getBarcodeAlternateText() {
        return this.f2789GF;
    }

    public String getBarcodeType() {
        return this.f2790GG;
    }

    public String getBarcodeValue() {
        return this.f2791GH;
    }

    public String getId() {
        return this.f2784GA;
    }

    public String getIssuerName() {
        return this.f2786GC;
    }

    public String getProgramName() {
        return this.f2787GD;
    }

    public int getVersionCode() {
        return this.f2792kg;
    }

    public void writeToParcel(Parcel dest, int flags) {
        C1134g.m3296a(this, dest, flags);
    }
}
