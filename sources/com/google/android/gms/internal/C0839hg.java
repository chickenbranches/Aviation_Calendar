package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.hg */
public class C0839hg implements Creator<C0838hf> {
    /* renamed from: a */
    static void m2518a(C0838hf hfVar, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m339a(parcel, 1, hfVar.name, false);
        C0175b.m350c(parcel, 1000, hfVar.versionCode);
        C0175b.m339a(parcel, 2, hfVar.f2109Bf, false);
        C0175b.m339a(parcel, 3, hfVar.f2110Bg, false);
        C0175b.m339a(parcel, 4, hfVar.f2111Bh, false);
        C0175b.m340a(parcel, 5, hfVar.f2112Bi, false);
        C0175b.m329D(parcel, o);
    }

    /* renamed from: ap */
    public C0838hf createFromParcel(Parcel parcel) {
        ArrayList arrayList = null;
        int n = C0173a.m313n(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            switch (C0173a.m292M(m)) {
                case 1:
                    str4 = C0173a.m312m(parcel, m);
                    break;
                case 2:
                    str3 = C0173a.m312m(parcel, m);
                    break;
                case 3:
                    str2 = C0173a.m312m(parcel, m);
                    break;
                case 4:
                    str = C0173a.m312m(parcel, m);
                    break;
                case 5:
                    arrayList = C0173a.m325y(parcel, m);
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
            return new C0838hf(i, str4, str3, str2, str, arrayList);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }

    /* renamed from: bf */
    public C0838hf[] newArray(int i) {
        return new C0838hf[i];
    }
}
