package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;
import java.util.List;

/* renamed from: com.google.android.gms.internal.gu */
public class C0822gu implements Creator<C0821gt> {
    /* renamed from: a */
    static void m2468a(C0821gt gtVar, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m350c(parcel, 1, gtVar.mo4559dO());
        C0175b.m350c(parcel, 1000, gtVar.f1936kg);
        C0175b.m349b(parcel, 2, gtVar.f1938yg, false);
        C0175b.m339a(parcel, 3, gtVar.mo4560dP(), false);
        C0175b.m339a(parcel, 4, gtVar.mo4561dQ(), false);
        C0175b.m342a(parcel, 5, gtVar.mo4562dR());
        C0175b.m329D(parcel, o);
    }

    /* renamed from: aY */
    public C0821gt[] newArray(int i) {
        return new C0821gt[i];
    }

    /* renamed from: aj */
    public C0821gt createFromParcel(Parcel parcel) {
        String str = null;
        boolean z = false;
        int n = C0173a.m313n(parcel);
        String str2 = null;
        List list = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            switch (C0173a.m292M(m)) {
                case 1:
                    i = C0173a.m305g(parcel, m);
                    break;
                case 2:
                    list = C0173a.m300c(parcel, m, C0825gx.CREATOR);
                    break;
                case 3:
                    str2 = C0173a.m312m(parcel, m);
                    break;
                case 4:
                    str = C0173a.m312m(parcel, m);
                    break;
                case 5:
                    z = C0173a.m301c(parcel, m);
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
            return new C0821gt(i2, i, list, str2, str, z);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }
}
