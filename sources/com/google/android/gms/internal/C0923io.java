package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;
import com.google.android.gms.internal.C0905ig.C0913f;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.io */
public class C0923io implements Creator<C0913f> {
    /* renamed from: a */
    static void m2828a(C0913f fVar, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        Set fa = fVar.mo5099fa();
        if (fa.contains(Integer.valueOf(1))) {
            C0175b.m350c(parcel, 1, fVar.getVersionCode());
        }
        if (fa.contains(Integer.valueOf(2))) {
            C0175b.m339a(parcel, 2, fVar.getDepartment(), true);
        }
        if (fa.contains(Integer.valueOf(3))) {
            C0175b.m339a(parcel, 3, fVar.getDescription(), true);
        }
        if (fa.contains(Integer.valueOf(4))) {
            C0175b.m339a(parcel, 4, fVar.getEndDate(), true);
        }
        if (fa.contains(Integer.valueOf(5))) {
            C0175b.m339a(parcel, 5, fVar.getLocation(), true);
        }
        if (fa.contains(Integer.valueOf(6))) {
            C0175b.m339a(parcel, 6, fVar.getName(), true);
        }
        if (fa.contains(Integer.valueOf(7))) {
            C0175b.m342a(parcel, 7, fVar.isPrimary());
        }
        if (fa.contains(Integer.valueOf(8))) {
            C0175b.m339a(parcel, 8, fVar.getStartDate(), true);
        }
        if (fa.contains(Integer.valueOf(9))) {
            C0175b.m339a(parcel, 9, fVar.getTitle(), true);
        }
        if (fa.contains(Integer.valueOf(10))) {
            C0175b.m350c(parcel, 10, fVar.getType());
        }
        C0175b.m329D(parcel, o);
    }

    /* renamed from: aB */
    public C0913f createFromParcel(Parcel parcel) {
        int i = 0;
        String str = null;
        int n = C0173a.m313n(parcel);
        HashSet hashSet = new HashSet();
        String str2 = null;
        boolean z = false;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        int i2 = 0;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            switch (C0173a.m292M(m)) {
                case 1:
                    i2 = C0173a.m305g(parcel, m);
                    hashSet.add(Integer.valueOf(1));
                    break;
                case 2:
                    str7 = C0173a.m312m(parcel, m);
                    hashSet.add(Integer.valueOf(2));
                    break;
                case 3:
                    str6 = C0173a.m312m(parcel, m);
                    hashSet.add(Integer.valueOf(3));
                    break;
                case 4:
                    str5 = C0173a.m312m(parcel, m);
                    hashSet.add(Integer.valueOf(4));
                    break;
                case 5:
                    str4 = C0173a.m312m(parcel, m);
                    hashSet.add(Integer.valueOf(5));
                    break;
                case 6:
                    str3 = C0173a.m312m(parcel, m);
                    hashSet.add(Integer.valueOf(6));
                    break;
                case 7:
                    z = C0173a.m301c(parcel, m);
                    hashSet.add(Integer.valueOf(7));
                    break;
                case 8:
                    str2 = C0173a.m312m(parcel, m);
                    hashSet.add(Integer.valueOf(8));
                    break;
                case 9:
                    str = C0173a.m312m(parcel, m);
                    hashSet.add(Integer.valueOf(9));
                    break;
                case 10:
                    i = C0173a.m305g(parcel, m);
                    hashSet.add(Integer.valueOf(10));
                    break;
                default:
                    C0173a.m298b(parcel, m);
                    break;
            }
        }
        if (parcel.dataPosition() == n) {
            return new C0913f(hashSet, i2, str7, str6, str5, str4, str3, z, str2, str, i);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }

    /* renamed from: bt */
    public C0913f[] newArray(int i) {
        return new C0913f[i];
    }
}
