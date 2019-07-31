package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.hu */
public class C0875hu implements SafeParcelable {
    public static final C0877hw CREATOR = new C0877hw();

    /* renamed from: DR */
    private final String[] f2157DR;

    /* renamed from: DS */
    private final String[] f2158DS;

    /* renamed from: DT */
    private final String[] f2159DT;

    /* renamed from: DU */
    private final String f2160DU;

    /* renamed from: DV */
    private final String f2161DV;

    /* renamed from: DW */
    private final String f2162DW;

    /* renamed from: DX */
    private final String f2163DX;

    /* renamed from: jG */
    private final String f2164jG;

    /* renamed from: kg */
    private final int f2165kg;

    C0875hu(int i, String str, String[] strArr, String[] strArr2, String[] strArr3, String str2, String str3, String str4, String str5) {
        this.f2165kg = i;
        this.f2164jG = str;
        this.f2157DR = strArr;
        this.f2158DS = strArr2;
        this.f2159DT = strArr3;
        this.f2160DU = str2;
        this.f2161DV = str3;
        this.f2162DW = str4;
        this.f2163DX = str5;
    }

    public C0875hu(String str, String[] strArr, String[] strArr2, String[] strArr3, String str2, String str3, String str4) {
        this.f2165kg = 1;
        this.f2164jG = str;
        this.f2157DR = strArr;
        this.f2158DS = strArr2;
        this.f2159DT = strArr3;
        this.f2160DU = str2;
        this.f2161DV = str3;
        this.f2162DW = str4;
        this.f2163DX = null;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: eR */
    public String[] mo4748eR() {
        return this.f2157DR;
    }

    /* renamed from: eS */
    public String[] mo4749eS() {
        return this.f2158DS;
    }

    /* renamed from: eT */
    public String[] mo4750eT() {
        return this.f2159DT;
    }

    /* renamed from: eU */
    public String mo4751eU() {
        return this.f2160DU;
    }

    /* renamed from: eV */
    public String mo4752eV() {
        return this.f2161DV;
    }

    /* renamed from: eW */
    public String mo4753eW() {
        return this.f2162DW;
    }

    /* renamed from: eX */
    public String mo4754eX() {
        return this.f2163DX;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0875hu)) {
            return false;
        }
        C0875hu huVar = (C0875hu) obj;
        return this.f2165kg == huVar.f2165kg && C0596ee.equal(this.f2164jG, huVar.f2164jG) && Arrays.equals(this.f2157DR, huVar.f2157DR) && Arrays.equals(this.f2158DS, huVar.f2158DS) && Arrays.equals(this.f2159DT, huVar.f2159DT) && C0596ee.equal(this.f2160DU, huVar.f2160DU) && C0596ee.equal(this.f2161DV, huVar.f2161DV) && C0596ee.equal(this.f2162DW, huVar.f2162DW) && C0596ee.equal(this.f2163DX, huVar.f2163DX);
    }

    public String getAccountName() {
        return this.f2164jG;
    }

    public int getVersionCode() {
        return this.f2165kg;
    }

    public int hashCode() {
        return C0596ee.hashCode(Integer.valueOf(this.f2165kg), this.f2164jG, this.f2157DR, this.f2158DS, this.f2159DT, this.f2160DU, this.f2161DV, this.f2162DW, this.f2163DX);
    }

    public String toString() {
        return C0596ee.m1542e(this).mo3971a("versionCode", Integer.valueOf(this.f2165kg)).mo3971a("accountName", this.f2164jG).mo3971a("requestedScopes", this.f2157DR).mo3971a("visibleActivities", this.f2158DS).mo3971a("requiredFeatures", this.f2159DT).mo3971a("packageNameForAuth", this.f2160DU).mo3971a("callingPackageName", this.f2161DV).mo3971a("applicationName", this.f2162DW).toString();
    }

    public void writeToParcel(Parcel out, int flags) {
        C0877hw.m2652a(this, out, flags);
    }
}
