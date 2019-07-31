package com.google.android.gms.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;

/* renamed from: com.google.android.gms.internal.ca */
public class C0473ca implements Creator<C0470bz> {
    /* renamed from: a */
    static void m1054a(C0470bz bzVar, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m350c(parcel, 1, bzVar.versionCode);
        C0175b.m334a(parcel, 2, bzVar.f1240hq, false);
        C0175b.m337a(parcel, 3, (Parcelable) bzVar.f1241hr, i, false);
        C0175b.m337a(parcel, 4, (Parcelable) bzVar.f1239em, i, false);
        C0175b.m339a(parcel, 5, bzVar.adUnitId, false);
        C0175b.m337a(parcel, 6, (Parcelable) bzVar.applicationInfo, i, false);
        C0175b.m337a(parcel, 7, (Parcelable) bzVar.f1242hs, i, false);
        C0175b.m339a(parcel, 8, bzVar.f1243ht, false);
        C0175b.m339a(parcel, 9, bzVar.f1244hu, false);
        C0175b.m339a(parcel, 10, bzVar.f1245hv, false);
        C0175b.m337a(parcel, 11, (Parcelable) bzVar.f1238ej, i, false);
        C0175b.m329D(parcel, o);
    }

    /* renamed from: f */
    public C0470bz createFromParcel(Parcel parcel) {
        C0503cu cuVar = null;
        int n = C0173a.m313n(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        PackageInfo packageInfo = null;
        ApplicationInfo applicationInfo = null;
        String str4 = null;
        C0964x xVar = null;
        C0962v vVar = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            switch (C0173a.m292M(m)) {
                case 1:
                    i = C0173a.m305g(parcel, m);
                    break;
                case 2:
                    bundle = C0173a.m315o(parcel, m);
                    break;
                case 3:
                    vVar = (C0962v) C0173a.m294a(parcel, m, (Creator<T>) C0962v.CREATOR);
                    break;
                case 4:
                    xVar = (C0964x) C0173a.m294a(parcel, m, (Creator<T>) C0964x.CREATOR);
                    break;
                case 5:
                    str4 = C0173a.m312m(parcel, m);
                    break;
                case 6:
                    applicationInfo = (ApplicationInfo) C0173a.m294a(parcel, m, ApplicationInfo.CREATOR);
                    break;
                case 7:
                    packageInfo = (PackageInfo) C0173a.m294a(parcel, m, PackageInfo.CREATOR);
                    break;
                case 8:
                    str3 = C0173a.m312m(parcel, m);
                    break;
                case 9:
                    str2 = C0173a.m312m(parcel, m);
                    break;
                case 10:
                    str = C0173a.m312m(parcel, m);
                    break;
                case 11:
                    cuVar = (C0503cu) C0173a.m294a(parcel, m, (Creator<T>) C0503cu.CREATOR);
                    break;
                default:
                    C0173a.m298b(parcel, m);
                    break;
            }
        }
        if (parcel.dataPosition() == n) {
            return new C0470bz(i, bundle, vVar, xVar, str4, applicationInfo, packageInfo, str3, str2, str, cuVar);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }

    /* renamed from: k */
    public C0470bz[] newArray(int i) {
        return new C0470bz[i];
    }
}
