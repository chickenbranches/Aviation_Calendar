package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;
import com.google.android.gms.internal.C0905ig.C0911d;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.in */
public class C0922in implements Creator<C0911d> {
    /* renamed from: a */
    static void m2825a(C0911d dVar, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        Set fa = dVar.mo5080fa();
        if (fa.contains(Integer.valueOf(1))) {
            C0175b.m350c(parcel, 1, dVar.getVersionCode());
        }
        if (fa.contains(Integer.valueOf(2))) {
            C0175b.m339a(parcel, 2, dVar.getFamilyName(), true);
        }
        if (fa.contains(Integer.valueOf(3))) {
            C0175b.m339a(parcel, 3, dVar.getFormatted(), true);
        }
        if (fa.contains(Integer.valueOf(4))) {
            C0175b.m339a(parcel, 4, dVar.getGivenName(), true);
        }
        if (fa.contains(Integer.valueOf(5))) {
            C0175b.m339a(parcel, 5, dVar.getHonorificPrefix(), true);
        }
        if (fa.contains(Integer.valueOf(6))) {
            C0175b.m339a(parcel, 6, dVar.getHonorificSuffix(), true);
        }
        if (fa.contains(Integer.valueOf(7))) {
            C0175b.m339a(parcel, 7, dVar.getMiddleName(), true);
        }
        C0175b.m329D(parcel, o);
    }

    /* renamed from: aA */
    public C0911d createFromParcel(Parcel parcel) {
        String str = null;
        int n = C0173a.m313n(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            switch (C0173a.m292M(m)) {
                case 1:
                    i = C0173a.m305g(parcel, m);
                    hashSet.add(Integer.valueOf(1));
                    break;
                case 2:
                    str6 = C0173a.m312m(parcel, m);
                    hashSet.add(Integer.valueOf(2));
                    break;
                case 3:
                    str5 = C0173a.m312m(parcel, m);
                    hashSet.add(Integer.valueOf(3));
                    break;
                case 4:
                    str4 = C0173a.m312m(parcel, m);
                    hashSet.add(Integer.valueOf(4));
                    break;
                case 5:
                    str3 = C0173a.m312m(parcel, m);
                    hashSet.add(Integer.valueOf(5));
                    break;
                case 6:
                    str2 = C0173a.m312m(parcel, m);
                    hashSet.add(Integer.valueOf(6));
                    break;
                case 7:
                    str = C0173a.m312m(parcel, m);
                    hashSet.add(Integer.valueOf(7));
                    break;
                default:
                    C0173a.m298b(parcel, m);
                    break;
            }
        }
        if (parcel.dataPosition() == n) {
            return new C0911d(hashSet, i, str6, str5, str4, str3, str2, str);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }

    /* renamed from: bs */
    public C0911d[] newArray(int i) {
        return new C0911d[i];
    }
}
