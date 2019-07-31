package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;

/* renamed from: com.google.android.gms.internal.hj */
public class C0842hj implements Creator<C0841hi> {
    /* renamed from: a */
    static void m2522a(C0841hi hiVar, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m339a(parcel, 1, hiVar.f2118Bn, false);
        C0175b.m350c(parcel, 1000, hiVar.versionCode);
        C0175b.m339a(parcel, 2, hiVar.f2119Bo, false);
        C0175b.m329D(parcel, o);
    }

    /* renamed from: aq */
    public C0841hi createFromParcel(Parcel parcel) {
        String str = null;
        int n = C0173a.m313n(parcel);
        int i = 0;
        String str2 = null;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            switch (C0173a.m292M(m)) {
                case 1:
                    str2 = C0173a.m312m(parcel, m);
                    break;
                case 2:
                    str = C0173a.m312m(parcel, m);
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
            return new C0841hi(i, str2, str);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }

    /* renamed from: bg */
    public C0841hi[] newArray(int i) {
        return new C0841hi[i];
    }
}
