package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;

/* renamed from: com.google.android.gms.internal.hw */
public class C0877hw implements Creator<C0875hu> {
    /* renamed from: a */
    static void m2652a(C0875hu huVar, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m339a(parcel, 1, huVar.getAccountName(), false);
        C0175b.m350c(parcel, 1000, huVar.getVersionCode());
        C0175b.m346a(parcel, 2, huVar.mo4748eR(), false);
        C0175b.m346a(parcel, 3, huVar.mo4749eS(), false);
        C0175b.m346a(parcel, 4, huVar.mo4750eT(), false);
        C0175b.m339a(parcel, 5, huVar.mo4751eU(), false);
        C0175b.m339a(parcel, 6, huVar.mo4752eV(), false);
        C0175b.m339a(parcel, 7, huVar.mo4753eW(), false);
        C0175b.m339a(parcel, 8, huVar.mo4754eX(), false);
        C0175b.m329D(parcel, o);
    }

    /* renamed from: ar */
    public C0875hu createFromParcel(Parcel parcel) {
        String str = null;
        int n = C0173a.m313n(parcel);
        int i = 0;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String[] strArr = null;
        String[] strArr2 = null;
        String[] strArr3 = null;
        String str5 = null;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            switch (C0173a.m292M(m)) {
                case 1:
                    str5 = C0173a.m312m(parcel, m);
                    break;
                case 2:
                    strArr3 = C0173a.m324x(parcel, m);
                    break;
                case 3:
                    strArr2 = C0173a.m324x(parcel, m);
                    break;
                case 4:
                    strArr = C0173a.m324x(parcel, m);
                    break;
                case 5:
                    str4 = C0173a.m312m(parcel, m);
                    break;
                case 6:
                    str3 = C0173a.m312m(parcel, m);
                    break;
                case 7:
                    str2 = C0173a.m312m(parcel, m);
                    break;
                case 8:
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
            return new C0875hu(i, str5, strArr3, strArr2, strArr, str4, str3, str2, str);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }

    /* renamed from: bj */
    public C0875hu[] newArray(int i) {
        return new C0875hu[i];
    }
}
