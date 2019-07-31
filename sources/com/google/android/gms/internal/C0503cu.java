package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* renamed from: com.google.android.gms.internal.cu */
public final class C0503cu implements SafeParcelable {
    public static final C0504cv CREATOR = new C0504cv();

    /* renamed from: iJ */
    public String f1346iJ;

    /* renamed from: iK */
    public int f1347iK;

    /* renamed from: iL */
    public int f1348iL;

    /* renamed from: iM */
    public boolean f1349iM;
    public final int versionCode;

    public C0503cu(int i, int i2, boolean z) {
        String str = "afma-sdk-a-v" + i + "." + i2 + "." + (z ? "0" : "1");
        this(1, str, i, i2, z);
    }

    C0503cu(int i, String str, int i2, int i3, boolean z) {
        this.versionCode = i;
        this.f1346iJ = str;
        this.f1347iK = i2;
        this.f1348iL = i3;
        this.f1349iM = z;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel out, int flags) {
        C0504cv.m1157a(this, out, flags);
    }
}
