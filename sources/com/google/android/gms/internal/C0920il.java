package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;
import com.google.android.gms.internal.C0905ig.C0907b.C0909b;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.il */
public class C0920il implements Creator<C0909b> {
    /* renamed from: a */
    static void m2819a(C0909b bVar, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        Set fa = bVar.mo5058fa();
        if (fa.contains(Integer.valueOf(1))) {
            C0175b.m350c(parcel, 1, bVar.getVersionCode());
        }
        if (fa.contains(Integer.valueOf(2))) {
            C0175b.m350c(parcel, 2, bVar.getHeight());
        }
        if (fa.contains(Integer.valueOf(3))) {
            C0175b.m339a(parcel, 3, bVar.getUrl(), true);
        }
        if (fa.contains(Integer.valueOf(4))) {
            C0175b.m350c(parcel, 4, bVar.getWidth());
        }
        C0175b.m329D(parcel, o);
    }

    /* renamed from: ay */
    public C0909b createFromParcel(Parcel parcel) {
        int i = 0;
        int n = C0173a.m313n(parcel);
        HashSet hashSet = new HashSet();
        String str = null;
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
                    str = C0173a.m312m(parcel, m);
                    hashSet.add(Integer.valueOf(3));
                    break;
                case 4:
                    i = C0173a.m305g(parcel, m);
                    hashSet.add(Integer.valueOf(4));
                    break;
                default:
                    C0173a.m298b(parcel, m);
                    break;
            }
        }
        if (parcel.dataPosition() == n) {
            return new C0909b(hashSet, i3, i2, str, i);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }

    /* renamed from: bq */
    public C0909b[] newArray(int i) {
        return new C0909b[i];
    }
}
