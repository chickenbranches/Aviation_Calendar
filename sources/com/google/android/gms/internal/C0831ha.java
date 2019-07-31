package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;
import com.google.android.gms.internal.C0834hd.C0835a;

/* renamed from: com.google.android.gms.internal.ha */
public class C0831ha implements Creator<C0835a> {
    /* renamed from: a */
    static void m2489a(C0835a aVar, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m339a(parcel, 1, aVar.mo4635eh(), false);
        C0175b.m350c(parcel, 1000, aVar.f2105kg);
        C0175b.m339a(parcel, 2, aVar.getTag(), false);
        C0175b.m339a(parcel, 3, aVar.mo4636ei(), false);
        C0175b.m350c(parcel, 4, aVar.mo4637ej());
        C0175b.m329D(parcel, o);
    }

    /* renamed from: am */
    public C0835a createFromParcel(Parcel parcel) {
        int i = 0;
        String str = null;
        int n = C0173a.m313n(parcel);
        String str2 = null;
        String str3 = null;
        int i2 = 0;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            switch (C0173a.m292M(m)) {
                case 1:
                    str3 = C0173a.m312m(parcel, m);
                    break;
                case 2:
                    str2 = C0173a.m312m(parcel, m);
                    break;
                case 3:
                    str = C0173a.m312m(parcel, m);
                    break;
                case 4:
                    i = C0173a.m305g(parcel, m);
                    break;
                case 1000:
                    i2 = C0173a.m305g(parcel, m);
                    break;
                default:
                    C0173a.m298b(parcel, m);
                    break;
            }
        }
        if (parcel.dataPosition() == n) {
            return new C0835a(i2, str3, str2, str, i);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }

    /* renamed from: bb */
    public C0835a[] newArray(int i) {
        return new C0835a[i];
    }
}
