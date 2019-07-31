package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.gi */
public class C0797gi implements Creator<C0796gh> {
    /* renamed from: a */
    static void m2360a(C0796gh ghVar, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m350c(parcel, 1000, ghVar.getVersionCode());
        C0175b.m342a(parcel, 2, ghVar.isEnabled());
        C0175b.m342a(parcel, 3, ghVar.mo4447dD());
        C0175b.m342a(parcel, 4, ghVar.mo4448dE());
        C0175b.m342a(parcel, 5, ghVar.mo4449dF());
        C0175b.m349b(parcel, 6, ghVar.mo4450dG(), false);
        C0175b.m329D(parcel, o);
    }

    /* renamed from: aU */
    public C0796gh[] newArray(int i) {
        return new C0796gh[i];
    }

    /* renamed from: ah */
    public C0796gh createFromParcel(Parcel parcel) {
        boolean z = false;
        int n = C0173a.m313n(parcel);
        ArrayList arrayList = null;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        int i = 0;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            switch (C0173a.m292M(m)) {
                case 2:
                    z4 = C0173a.m301c(parcel, m);
                    break;
                case 3:
                    z3 = C0173a.m301c(parcel, m);
                    break;
                case 4:
                    z2 = C0173a.m301c(parcel, m);
                    break;
                case 5:
                    z = C0173a.m301c(parcel, m);
                    break;
                case 6:
                    arrayList = C0173a.m300c(parcel, m, C0605el.CREATOR);
                    break;
                case 1000:
                    i = C0173a.m305g(parcel, m);
                    break;
                default:
                    C0173a.m298b(parcel, m);
                    break;
            }
        }
        if (parcel.dataPosition() == n) {
            return new C0796gh(i, z4, z3, z2, z, arrayList);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }
}
