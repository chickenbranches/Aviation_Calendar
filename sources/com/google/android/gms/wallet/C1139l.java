package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;

/* renamed from: com.google.android.gms.wallet.l */
public class C1139l implements Creator<ProxyCard> {
    /* renamed from: a */
    static void m3311a(ProxyCard proxyCard, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m350c(parcel, 1, proxyCard.getVersionCode());
        C0175b.m339a(parcel, 2, proxyCard.f2824GY, false);
        C0175b.m339a(parcel, 3, proxyCard.f2825GZ, false);
        C0175b.m350c(parcel, 4, proxyCard.f2826Ha);
        C0175b.m350c(parcel, 5, proxyCard.f2827Hb);
        C0175b.m329D(parcel, o);
    }

    /* renamed from: aP */
    public ProxyCard createFromParcel(Parcel parcel) {
        String str = null;
        int i = 0;
        int n = C0173a.m313n(parcel);
        int i2 = 0;
        String str2 = null;
        int i3 = 0;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            switch (C0173a.m292M(m)) {
                case 1:
                    i3 = C0173a.m305g(parcel, m);
                    break;
                case 2:
                    str2 = C0173a.m312m(parcel, m);
                    break;
                case 3:
                    str = C0173a.m312m(parcel, m);
                    break;
                case 4:
                    i2 = C0173a.m305g(parcel, m);
                    break;
                case 5:
                    i = C0173a.m305g(parcel, m);
                    break;
                default:
                    C0173a.m298b(parcel, m);
                    break;
            }
        }
        if (parcel.dataPosition() == n) {
            return new ProxyCard(i3, str2, str, i2, i);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }

    /* renamed from: bH */
    public ProxyCard[] newArray(int i) {
        return new ProxyCard[i];
    }
}
