package com.google.android.gms.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* renamed from: com.google.android.gms.internal.bz */
public final class C0470bz implements SafeParcelable {
    public static final C0473ca CREATOR = new C0473ca();
    public final String adUnitId;
    public final ApplicationInfo applicationInfo;

    /* renamed from: ej */
    public final C0503cu f1238ej;

    /* renamed from: em */
    public final C0964x f1239em;

    /* renamed from: hq */
    public final Bundle f1240hq;

    /* renamed from: hr */
    public final C0962v f1241hr;

    /* renamed from: hs */
    public final PackageInfo f1242hs;

    /* renamed from: ht */
    public final String f1243ht;

    /* renamed from: hu */
    public final String f1244hu;

    /* renamed from: hv */
    public final String f1245hv;
    public final int versionCode;

    /* renamed from: com.google.android.gms.internal.bz$a */
    public static final class C0471a {
        public final String adUnitId;
        public final ApplicationInfo applicationInfo;

        /* renamed from: ej */
        public final C0503cu f1246ej;

        /* renamed from: em */
        public final C0964x f1247em;

        /* renamed from: hq */
        public final Bundle f1248hq;

        /* renamed from: hr */
        public final C0962v f1249hr;

        /* renamed from: hs */
        public final PackageInfo f1250hs;

        /* renamed from: hu */
        public final String f1251hu;

        /* renamed from: hv */
        public final String f1252hv;

        public C0471a(Bundle bundle, C0962v vVar, C0964x xVar, String str, ApplicationInfo applicationInfo2, PackageInfo packageInfo, String str2, String str3, C0503cu cuVar) {
            this.f1248hq = bundle;
            this.f1249hr = vVar;
            this.f1247em = xVar;
            this.adUnitId = str;
            this.applicationInfo = applicationInfo2;
            this.f1250hs = packageInfo;
            this.f1251hu = str2;
            this.f1252hv = str3;
            this.f1246ej = cuVar;
        }
    }

    C0470bz(int i, Bundle bundle, C0962v vVar, C0964x xVar, String str, ApplicationInfo applicationInfo2, PackageInfo packageInfo, String str2, String str3, String str4, C0503cu cuVar) {
        this.versionCode = i;
        this.f1240hq = bundle;
        this.f1241hr = vVar;
        this.f1239em = xVar;
        this.adUnitId = str;
        this.applicationInfo = applicationInfo2;
        this.f1242hs = packageInfo;
        this.f1243ht = str2;
        this.f1244hu = str3;
        this.f1245hv = str4;
        this.f1238ej = cuVar;
    }

    public C0470bz(Bundle bundle, C0962v vVar, C0964x xVar, String str, ApplicationInfo applicationInfo2, PackageInfo packageInfo, String str2, String str3, String str4, C0503cu cuVar) {
        this(1, bundle, vVar, xVar, str, applicationInfo2, packageInfo, str2, str3, str4, cuVar);
    }

    public C0470bz(C0471a aVar, String str) {
        this(aVar.f1248hq, aVar.f1249hr, aVar.f1247em, aVar.adUnitId, aVar.applicationInfo, aVar.f1250hs, str, aVar.f1251hu, aVar.f1252hv, aVar.f1246ej);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel out, int flags) {
        C0473ca.m1054a(this, out, flags);
    }
}
