package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;
import com.google.android.gms.internal.C0905ig.C0907b.C0908a;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ik */
public class C0919ik implements Creator<C0908a> {
    /* renamed from: a */
    static void m2816a(C0908a aVar, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        Set fa = aVar.mo5047fa();
        if (fa.contains(Integer.valueOf(1))) {
            C0175b.m350c(parcel, 1, aVar.getVersionCode());
        }
        if (fa.contains(Integer.valueOf(2))) {
            C0175b.m350c(parcel, 2, aVar.getLeftImageOffset());
        }
        if (fa.contains(Integer.valueOf(3))) {
            C0175b.m350c(parcel, 3, aVar.getTopImageOffset());
        }
        C0175b.m329D(parcel, o);
    }

    /* renamed from: ax */
    public C0908a createFromParcel(Parcel parcel) {
        int i = 0;
        int n = C0173a.m313n(parcel);
        HashSet hashSet = new HashSet();
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            switch (C0173a.m292M(m)) {
                case 1:
                    i3 = C0173a.m305g(parcel, m);
                    hashSet.add(Integer.valueOf(1));
                    break;
                case 2:
                    i2 = C0173a.m305g(parcel, m);
                    hashSet.add(Integer.valueOf(2));
                    break;
                case 3:
                    i = C0173a.m305g(parcel, m);
                    hashSet.add(Integer.valueOf(3));
                    break;
                default:
                    C0173a.m298b(parcel, m);
                    break;
            }
        }
        if (parcel.dataPosition() == n) {
            return new C0908a(hashSet, i3, i2, i);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }

    /* renamed from: bp */
    public C0908a[] newArray(int i) {
        return new C0908a[i];
    }
}
