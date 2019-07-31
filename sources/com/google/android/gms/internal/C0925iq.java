package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;
import com.google.android.gms.internal.C0905ig.C0915h;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.iq */
public class C0925iq implements Creator<C0915h> {
    /* renamed from: a */
    static void m2834a(C0915h hVar, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        Set fa = hVar.mo5136fa();
        if (fa.contains(Integer.valueOf(1))) {
            C0175b.m350c(parcel, 1, hVar.getVersionCode());
        }
        if (fa.contains(Integer.valueOf(3))) {
            C0175b.m350c(parcel, 3, hVar.mo5134fN());
        }
        if (fa.contains(Integer.valueOf(4))) {
            C0175b.m339a(parcel, 4, hVar.getValue(), true);
        }
        if (fa.contains(Integer.valueOf(5))) {
            C0175b.m339a(parcel, 5, hVar.getLabel(), true);
        }
        if (fa.contains(Integer.valueOf(6))) {
            C0175b.m350c(parcel, 6, hVar.getType());
        }
        C0175b.m329D(parcel, o);
    }

    /* renamed from: aD */
    public C0915h createFromParcel(Parcel parcel) {
        String str = null;
        int i = 0;
        int n = C0173a.m313n(parcel);
        HashSet hashSet = new HashSet();
        int i2 = 0;
        String str2 = null;
        int i3 = 0;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            switch (C0173a.m292M(m)) {
                case 1:
                    i3 = C0173a.m305g(parcel, m);
                    hashSet.add(Integer.valueOf(1));
                    break;
                case 3:
                    i = C0173a.m305g(parcel, m);
                    hashSet.add(Integer.valueOf(3));
                    break;
                case 4:
                    str = C0173a.m312m(parcel, m);
                    hashSet.add(Integer.valueOf(4));
                    break;
                case 5:
                    str2 = C0173a.m312m(parcel, m);
                    hashSet.add(Integer.valueOf(5));
                    break;
                case 6:
                    i2 = C0173a.m305g(parcel, m);
                    hashSet.add(Integer.valueOf(6));
                    break;
                default:
                    C0173a.m298b(parcel, m);
                    break;
            }
        }
        if (parcel.dataPosition() == n) {
            return new C0915h(hashSet, i3, str2, i2, str, i);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }

    /* renamed from: bv */
    public C0915h[] newArray(int i) {
        return new C0915h[i];
    }
}
