package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;

/* renamed from: com.google.android.gms.wallet.d */
public class C1131d implements Creator<FullWallet> {
    /* renamed from: a */
    static void m3287a(FullWallet fullWallet, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m350c(parcel, 1, fullWallet.getVersionCode());
        C0175b.m339a(parcel, 2, fullWallet.f2764Gn, false);
        C0175b.m339a(parcel, 3, fullWallet.f2765Go, false);
        C0175b.m337a(parcel, 4, (Parcelable) fullWallet.f2766Gp, i, false);
        C0175b.m339a(parcel, 5, fullWallet.f2767Gq, false);
        C0175b.m337a(parcel, 6, (Parcelable) fullWallet.f2768Gr, i, false);
        C0175b.m337a(parcel, 7, (Parcelable) fullWallet.f2769Gs, i, false);
        C0175b.m346a(parcel, 8, fullWallet.f2770Gt, false);
        C0175b.m329D(parcel, o);
    }

    /* renamed from: aH */
    public FullWallet createFromParcel(Parcel parcel) {
        String[] strArr = null;
        int n = C0173a.m313n(parcel);
        int i = 0;
        Address address = null;
        Address address2 = null;
        String str = null;
        ProxyCard proxyCard = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            switch (C0173a.m292M(m)) {
                case 1:
                    i = C0173a.m305g(parcel, m);
                    break;
                case 2:
                    str3 = C0173a.m312m(parcel, m);
                    break;
                case 3:
                    str2 = C0173a.m312m(parcel, m);
                    break;
                case 4:
                    proxyCard = (ProxyCard) C0173a.m294a(parcel, m, ProxyCard.CREATOR);
                    break;
                case 5:
                    str = C0173a.m312m(parcel, m);
                    break;
                case 6:
                    address2 = (Address) C0173a.m294a(parcel, m, Address.CREATOR);
                    break;
                case 7:
                    address = (Address) C0173a.m294a(parcel, m, Address.CREATOR);
                    break;
                case 8:
                    strArr = C0173a.m324x(parcel, m);
                    break;
                default:
                    C0173a.m298b(parcel, m);
                    break;
            }
        }
        if (parcel.dataPosition() == n) {
            return new FullWallet(i, str3, str2, proxyCard, str, address2, address, strArr);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }

    /* renamed from: bz */
    public FullWallet[] newArray(int i) {
        return new FullWallet[i];
    }
}
