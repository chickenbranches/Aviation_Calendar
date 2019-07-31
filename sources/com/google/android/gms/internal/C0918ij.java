package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;
import com.google.android.gms.internal.C0905ig.C0907b;
import com.google.android.gms.internal.C0905ig.C0907b.C0908a;
import com.google.android.gms.internal.C0905ig.C0907b.C0909b;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ij */
public class C0918ij implements Creator<C0907b> {
    /* renamed from: a */
    static void m2813a(C0907b bVar, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        Set fa = bVar.mo5034fa();
        if (fa.contains(Integer.valueOf(1))) {
            C0175b.m350c(parcel, 1, bVar.getVersionCode());
        }
        if (fa.contains(Integer.valueOf(2))) {
            C0175b.m337a(parcel, 2, (Parcelable) bVar.mo5031fE(), i, true);
        }
        if (fa.contains(Integer.valueOf(3))) {
            C0175b.m337a(parcel, 3, (Parcelable) bVar.mo5032fF(), i, true);
        }
        if (fa.contains(Integer.valueOf(4))) {
            C0175b.m350c(parcel, 4, bVar.getLayout());
        }
        C0175b.m329D(parcel, o);
    }

    /* renamed from: aw */
    public C0907b createFromParcel(Parcel parcel) {
        C0909b bVar = null;
        int i = 0;
        int n = C0173a.m313n(parcel);
        HashSet hashSet = new HashSet();
        C0908a aVar = null;
        int i2 = 0;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            switch (C0173a.m292M(m)) {
                case 1:
                    i2 = C0173a.m305g(parcel, m);
                    hashSet.add(Integer.valueOf(1));
                    break;
                case 2:
                    C0908a aVar2 = (C0908a) C0173a.m294a(parcel, m, (Creator<T>) C0908a.CREATOR);
                    hashSet.add(Integer.valueOf(2));
                    aVar = aVar2;
                    break;
                case 3:
                    C0909b bVar2 = (C0909b) C0173a.m294a(parcel, m, (Creator<T>) C0909b.CREATOR);
                    hashSet.add(Integer.valueOf(3));
                    bVar = bVar2;
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
            return new C0907b(hashSet, i2, aVar, bVar, i);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }

    /* renamed from: bo */
    public C0907b[] newArray(int i) {
        return new C0907b[i];
    }
}
