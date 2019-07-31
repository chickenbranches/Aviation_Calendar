package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;

/* renamed from: com.google.android.gms.wallet.a */
public class C1128a implements Creator<Address> {
    /* renamed from: a */
    static void m3278a(Address address, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m350c(parcel, 1, address.getVersionCode());
        C0175b.m339a(parcel, 2, address.name, false);
        C0175b.m339a(parcel, 3, address.f2746Ga, false);
        C0175b.m339a(parcel, 4, address.f2747Gb, false);
        C0175b.m339a(parcel, 5, address.f2748Gc, false);
        C0175b.m339a(parcel, 6, address.f2755id, false);
        C0175b.m339a(parcel, 7, address.f2749Gd, false);
        C0175b.m339a(parcel, 8, address.f2750Ge, false);
        C0175b.m339a(parcel, 9, address.f2751Gf, false);
        C0175b.m339a(parcel, 10, address.f2752Gg, false);
        C0175b.m342a(parcel, 11, address.f2753Gh);
        C0175b.m339a(parcel, 12, address.f2754Gi, false);
        C0175b.m329D(parcel, o);
    }

    /* renamed from: aE */
    public Address createFromParcel(Parcel parcel) {
        int n = C0173a.m313n(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        boolean z = false;
        String str10 = null;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            switch (C0173a.m292M(m)) {
                case 1:
                    i = C0173a.m305g(parcel, m);
                    break;
                case 2:
                    str = C0173a.m312m(parcel, m);
                    break;
                case 3:
                    str2 = C0173a.m312m(parcel, m);
                    break;
                case 4:
                    str3 = C0173a.m312m(parcel, m);
                    break;
                case 5:
                    str4 = C0173a.m312m(parcel, m);
                    break;
                case 6:
                    str5 = C0173a.m312m(parcel, m);
                    break;
                case 7:
                    str6 = C0173a.m312m(parcel, m);
                    break;
                case 8:
                    str7 = C0173a.m312m(parcel, m);
                    break;
                case 9:
                    str8 = C0173a.m312m(parcel, m);
                    break;
                case 10:
                    str9 = C0173a.m312m(parcel, m);
                    break;
                case 11:
                    z = C0173a.m301c(parcel, m);
                    break;
                case 12:
                    str10 = C0173a.m312m(parcel, m);
                    break;
                default:
                    C0173a.m298b(parcel, m);
                    break;
            }
        }
        if (parcel.dataPosition() == n) {
            return new Address(i, str, str2, str3, str4, str5, str6, str7, str8, str9, z, str10);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }

    /* renamed from: bw */
    public Address[] newArray(int i) {
        return new Address[i];
    }
}
