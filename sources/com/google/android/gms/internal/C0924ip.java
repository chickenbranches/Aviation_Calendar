package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;
import com.google.android.gms.internal.C0905ig.C0914g;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ip */
public class C0924ip implements Creator<C0914g> {
    /* renamed from: a */
    static void m2831a(C0914g gVar, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        Set fa = gVar.mo5124fa();
        if (fa.contains(Integer.valueOf(1))) {
            C0175b.m350c(parcel, 1, gVar.getVersionCode());
        }
        if (fa.contains(Integer.valueOf(2))) {
            C0175b.m342a(parcel, 2, gVar.isPrimary());
        }
        if (fa.contains(Integer.valueOf(3))) {
            C0175b.m339a(parcel, 3, gVar.getValue(), true);
        }
        C0175b.m329D(parcel, o);
    }

    /* renamed from: aC */
    public C0914g createFromParcel(Parcel parcel) {
        boolean z = false;
        int n = C0173a.m313n(parcel);
        HashSet hashSet = new HashSet();
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            switch (C0173a.m292M(m)) {
                case 1:
                    i = C0173a.m305g(parcel, m);
                    hashSet.add(Integer.valueOf(1));
                    break;
                case 2:
                    z = C0173a.m301c(parcel, m);
                    hashSet.add(Integer.valueOf(2));
                    break;
                case 3:
                    str = C0173a.m312m(parcel, m);
                    hashSet.add(Integer.valueOf(3));
                    break;
                default:
                    C0173a.m298b(parcel, m);
                    break;
            }
        }
        if (parcel.dataPosition() == n) {
            return new C0914g(hashSet, i, z, str);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }

    /* renamed from: bu */
    public C0914g[] newArray(int i) {
        return new C0914g[i];
    }
}
