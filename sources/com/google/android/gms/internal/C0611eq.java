package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;
import com.google.android.gms.internal.C0609ep.C0610a;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.eq */
public class C0611eq implements Creator<C0609ep> {
    /* renamed from: a */
    static void m1590a(C0609ep epVar, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m350c(parcel, 1, epVar.getVersionCode());
        C0175b.m349b(parcel, 2, epVar.mo4016cg(), false);
        C0175b.m329D(parcel, o);
    }

    /* renamed from: P */
    public C0609ep[] newArray(int i) {
        return new C0609ep[i];
    }

    /* renamed from: r */
    public C0609ep createFromParcel(Parcel parcel) {
        int n = C0173a.m313n(parcel);
        int i = 0;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            switch (C0173a.m292M(m)) {
                case 1:
                    i = C0173a.m305g(parcel, m);
                    break;
                case 2:
                    arrayList = C0173a.m300c(parcel, m, C0610a.CREATOR);
                    break;
                default:
                    C0173a.m298b(parcel, m);
                    break;
            }
        }
        if (parcel.dataPosition() == n) {
            return new C0609ep(i, arrayList);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }
}
