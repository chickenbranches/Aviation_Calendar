package com.google.android.gms.internal;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.w */
public class C0963w implements Creator<C0962v> {
    /* renamed from: a */
    static void m3011a(C0962v vVar, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m350c(parcel, 1, vVar.versionCode);
        C0175b.m333a(parcel, 2, vVar.f2415ex);
        C0175b.m334a(parcel, 3, vVar.extras, false);
        C0175b.m350c(parcel, 4, vVar.f2416ey);
        C0175b.m340a(parcel, 5, vVar.f2417ez, false);
        C0175b.m342a(parcel, 6, vVar.f2410eA);
        C0175b.m350c(parcel, 7, vVar.tagForChildDirectedTreatment);
        C0175b.m342a(parcel, 8, vVar.f2411eB);
        C0175b.m339a(parcel, 9, vVar.f2412eC, false);
        C0175b.m337a(parcel, 10, (Parcelable) vVar.f2413eD, i, false);
        C0175b.m337a(parcel, 11, (Parcelable) vVar.f2414eE, i, false);
        C0175b.m329D(parcel, o);
    }

    /* renamed from: a */
    public C0962v createFromParcel(Parcel parcel) {
        int n = C0173a.m313n(parcel);
        int i = 0;
        long j = 0;
        Bundle bundle = null;
        int i2 = 0;
        ArrayList arrayList = null;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        String str = null;
        C0366ai aiVar = null;
        Location location = null;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            switch (C0173a.m292M(m)) {
                case 1:
                    i = C0173a.m305g(parcel, m);
                    break;
                case 2:
                    j = C0173a.m306h(parcel, m);
                    break;
                case 3:
                    bundle = C0173a.m315o(parcel, m);
                    break;
                case 4:
                    i2 = C0173a.m305g(parcel, m);
                    break;
                case 5:
                    arrayList = C0173a.m325y(parcel, m);
                    break;
                case 6:
                    z = C0173a.m301c(parcel, m);
                    break;
                case 7:
                    i3 = C0173a.m305g(parcel, m);
                    break;
                case 8:
                    z2 = C0173a.m301c(parcel, m);
                    break;
                case 9:
                    str = C0173a.m312m(parcel, m);
                    break;
                case 10:
                    aiVar = (C0366ai) C0173a.m294a(parcel, m, (Creator<T>) C0366ai.CREATOR);
                    break;
                case 11:
                    location = (Location) C0173a.m294a(parcel, m, Location.CREATOR);
                    break;
                default:
                    C0173a.m298b(parcel, m);
                    break;
            }
        }
        if (parcel.dataPosition() == n) {
            return new C0962v(i, j, bundle, i2, arrayList, z, i3, z2, str, aiVar, location);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }

    /* renamed from: b */
    public C0962v[] newArray(int i) {
        return new C0962v[i];
    }
}
