package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* renamed from: com.google.android.gms.internal.bj */
public final class C0436bj implements SafeParcelable {
    public static final C0435bi CREATOR = new C0435bi();

    /* renamed from: gn */
    public final String f1167gn;

    /* renamed from: go */
    public final String f1168go;

    /* renamed from: gp */
    public final String f1169gp;

    /* renamed from: gq */
    public final String f1170gq;

    /* renamed from: gr */
    public final String f1171gr;
    public final String mimeType;
    public final String packageName;
    public final int versionCode;

    public C0436bj(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.versionCode = i;
        this.f1167gn = str;
        this.f1168go = str2;
        this.mimeType = str3;
        this.packageName = str4;
        this.f1169gp = str5;
        this.f1170gq = str6;
        this.f1171gr = str7;
    }

    public C0436bj(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this(1, str, str2, str3, str4, str5, str6, str7);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel out, int flags) {
        C0435bi.m970a(this, out, flags);
    }
}
