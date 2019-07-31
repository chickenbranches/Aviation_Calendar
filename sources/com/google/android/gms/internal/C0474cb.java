package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.cb */
public final class C0474cb implements SafeParcelable {
    public static final C0475cc CREATOR = new C0475cc();
    public final int errorCode;

    /* renamed from: fK */
    public final List<String> f1253fK;

    /* renamed from: fL */
    public final List<String> f1254fL;

    /* renamed from: fO */
    public final long f1255fO;

    /* renamed from: gL */
    public final String f1256gL;

    /* renamed from: hA */
    public final List<String> f1257hA;

    /* renamed from: hB */
    public final String f1258hB;

    /* renamed from: hw */
    public final String f1259hw;

    /* renamed from: hx */
    public final long f1260hx;

    /* renamed from: hy */
    public final boolean f1261hy;

    /* renamed from: hz */
    public final long f1262hz;
    public final int orientation;
    public final int versionCode;

    public C0474cb(int i) {
        this(2, null, null, null, i, null, -1, false, -1, null, -1, -1, null);
    }

    C0474cb(int i, String str, String str2, List<String> list, int i2, List<String> list2, long j, boolean z, long j2, List<String> list3, long j3, int i3, String str3) {
        this.versionCode = i;
        this.f1256gL = str;
        this.f1259hw = str2;
        this.f1253fK = list != null ? Collections.unmodifiableList(list) : null;
        this.errorCode = i2;
        this.f1254fL = list2 != null ? Collections.unmodifiableList(list2) : null;
        this.f1260hx = j;
        this.f1261hy = z;
        this.f1262hz = j2;
        this.f1257hA = list3 != null ? Collections.unmodifiableList(list3) : null;
        this.f1255fO = j3;
        this.orientation = i3;
        this.f1258hB = str3;
    }

    public C0474cb(String str, String str2, List<String> list, List<String> list2, long j, boolean z, long j2, List<String> list3, long j3, int i, String str3) {
        this(2, str, str2, list, -2, list2, j, z, j2, list3, j3, i, str3);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel out, int flags) {
        C0475cc.m1057a(this, out, flags);
    }
}
