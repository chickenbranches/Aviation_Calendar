package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;
import com.google.android.gms.internal.C0613es.C0614a;

/* renamed from: com.google.android.gms.internal.et */
public class C0616et implements Creator<C0614a> {
    /* renamed from: a */
    static void m1634a(C0614a aVar, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m350c(parcel, 1, aVar.getVersionCode());
        C0175b.m350c(parcel, 2, aVar.mo4045ch());
        C0175b.m342a(parcel, 3, aVar.mo4048cn());
        C0175b.m350c(parcel, 4, aVar.mo4046ci());
        C0175b.m342a(parcel, 5, aVar.mo4049co());
        C0175b.m339a(parcel, 6, aVar.mo4050cp(), false);
        C0175b.m350c(parcel, 7, aVar.mo4051cq());
        C0175b.m339a(parcel, 8, aVar.mo4053cs(), false);
        C0175b.m337a(parcel, 9, (Parcelable) aVar.mo4055cu(), i, false);
        C0175b.m329D(parcel, o);
    }

    /* renamed from: R */
    public C0614a[] newArray(int i) {
        return new C0614a[i];
    }

    /* renamed from: t */
    public C0614a createFromParcel(Parcel parcel) {
        C0607en enVar = null;
        int i = 0;
        int n = C0173a.m313n(parcel);
        String str = null;
        String str2 = null;
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        int i4 = 0;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            switch (C0173a.m292M(m)) {
                case 1:
                    i4 = C0173a.m305g(parcel, m);
                    break;
                case 2:
                    i3 = C0173a.m305g(parcel, m);
                    break;
                case 3:
                    z2 = C0173a.m301c(parcel, m);
                    break;
                case 4:
                    i2 = C0173a.m305g(parcel, m);
                    break;
                case 5:
                    z = C0173a.m301c(parcel, m);
                    break;
                case 6:
                    str2 = C0173a.m312m(parcel, m);
                    break;
                case 7:
                    i = C0173a.m305g(parcel, m);
                    break;
                case 8:
                    str = C0173a.m312m(parcel, m);
                    break;
                case 9:
                    enVar = (C0607en) C0173a.m294a(parcel, m, (Creator<T>) C0607en.CREATOR);
                    break;
                default:
                    C0173a.m298b(parcel, m);
                    break;
            }
        }
        if (parcel.dataPosition() == n) {
            return new C0614a(i4, i3, z2, i2, z, str2, i, str, enVar);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }
}
