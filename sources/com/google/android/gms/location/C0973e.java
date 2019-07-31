package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;

/* renamed from: com.google.android.gms.location.e */
public class C0973e implements Creator<C0972d> {
    /* renamed from: a */
    static void m3036a(C0972d dVar, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m350c(parcel, 1, dVar.f2451xG);
        C0175b.m350c(parcel, 1000, dVar.getVersionCode());
        C0175b.m350c(parcel, 2, dVar.f2452xH);
        C0175b.m333a(parcel, 3, dVar.f2453xI);
        C0175b.m329D(parcel, o);
    }

    /* renamed from: aS */
    public C0972d[] newArray(int i) {
        return new C0972d[i];
    }

    /* renamed from: af */
    public C0972d createFromParcel(Parcel parcel) {
        int i = 1;
        int n = C0173a.m313n(parcel);
        int i2 = 0;
        long j = 0;
        int i3 = 1;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            switch (C0173a.m292M(m)) {
                case 1:
                    i3 = C0173a.m305g(parcel, m);
                    break;
                case 2:
                    i = C0173a.m305g(parcel, m);
                    break;
                case 3:
                    j = C0173a.m306h(parcel, m);
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
            return new C0972d(i2, i3, i, j);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }
}
