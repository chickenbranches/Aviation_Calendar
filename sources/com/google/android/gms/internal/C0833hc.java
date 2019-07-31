package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;

/* renamed from: com.google.android.gms.internal.hc */
public class C0833hc implements Creator<C0832hb> {
    /* renamed from: a */
    static void m2494a(C0832hb hbVar, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m345a(parcel, 1, (T[]) hbVar.mo4604dU(), i, false);
        C0175b.m350c(parcel, 1000, hbVar.f2082kg);
        C0175b.m344a(parcel, 2, hbVar.mo4605dV(), false);
        C0175b.m333a(parcel, 3, hbVar.getTimestampMillis());
        C0175b.m329D(parcel, o);
    }

    /* renamed from: an */
    public C0832hb createFromParcel(Parcel parcel) {
        float[] fArr = null;
        int n = C0173a.m313n(parcel);
        int i = 0;
        long j = 0;
        C0834hd[] hdVarArr = null;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            switch (C0173a.m292M(m)) {
                case 1:
                    hdVarArr = (C0834hd[]) C0173a.m299b(parcel, m, C0834hd.CREATOR);
                    break;
                case 2:
                    fArr = C0173a.m321u(parcel, m);
                    break;
                case 3:
                    j = C0173a.m306h(parcel, m);
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
            return new C0832hb(i, hdVarArr, fArr, j);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }

    /* renamed from: bc */
    public C0832hb[] newArray(int i) {
        return new C0832hb[i];
    }
}
