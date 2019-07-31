package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;
import com.google.android.gms.internal.C0609ep.C0610a;

/* renamed from: com.google.android.gms.internal.er */
public class C0612er implements Creator<C0610a> {
    /* renamed from: a */
    static void m1593a(C0610a aVar, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m350c(parcel, 1, aVar.versionCode);
        C0175b.m339a(parcel, 2, aVar.f1581qg, false);
        C0175b.m350c(parcel, 3, aVar.f1582qh);
        C0175b.m329D(parcel, o);
    }

    /* renamed from: Q */
    public C0610a[] newArray(int i) {
        return new C0610a[i];
    }

    /* renamed from: s */
    public C0610a createFromParcel(Parcel parcel) {
        int i = 0;
        int n = C0173a.m313n(parcel);
        String str = null;
        int i2 = 0;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            switch (C0173a.m292M(m)) {
                case 1:
                    i2 = C0173a.m305g(parcel, m);
                    break;
                case 2:
                    str = C0173a.m312m(parcel, m);
                    break;
                case 3:
                    i = C0173a.m305g(parcel, m);
                    break;
                default:
                    C0173a.m298b(parcel, m);
                    break;
            }
        }
        if (parcel.dataPosition() == n) {
            return new C0610a(i2, str, i);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }
}
