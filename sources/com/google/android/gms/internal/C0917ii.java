package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;
import com.google.android.gms.internal.C0905ig.C0906a;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ii */
public class C0917ii implements Creator<C0906a> {
    /* renamed from: a */
    static void m2810a(C0906a aVar, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        Set fa = aVar.mo5021fa();
        if (fa.contains(Integer.valueOf(1))) {
            C0175b.m350c(parcel, 1, aVar.getVersionCode());
        }
        if (fa.contains(Integer.valueOf(2))) {
            C0175b.m350c(parcel, 2, aVar.getMax());
        }
        if (fa.contains(Integer.valueOf(3))) {
            C0175b.m350c(parcel, 3, aVar.getMin());
        }
        C0175b.m329D(parcel, o);
    }

    /* renamed from: av */
    public C0906a createFromParcel(Parcel parcel) {
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
            return new C0906a(hashSet, i3, i2, i);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }

    /* renamed from: bn */
    public C0906a[] newArray(int i) {
        return new C0906a[i];
    }
}
