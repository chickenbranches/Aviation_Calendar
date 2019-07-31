package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;

/* renamed from: com.google.android.gms.wallet.e */
public class C1132e implements Creator<FullWalletRequest> {
    /* renamed from: a */
    static void m3290a(FullWalletRequest fullWalletRequest, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m350c(parcel, 1, fullWalletRequest.getVersionCode());
        C0175b.m339a(parcel, 2, fullWalletRequest.f2772Gn, false);
        C0175b.m339a(parcel, 3, fullWalletRequest.f2773Go, false);
        C0175b.m337a(parcel, 4, (Parcelable) fullWalletRequest.f2774Gu, i, false);
        C0175b.m329D(parcel, o);
    }

    /* renamed from: aI */
    public FullWalletRequest createFromParcel(Parcel parcel) {
        Cart cart = null;
        int n = C0173a.m313n(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            switch (C0173a.m292M(m)) {
                case 1:
                    i = C0173a.m305g(parcel, m);
                    break;
                case 2:
                    str2 = C0173a.m312m(parcel, m);
                    break;
                case 3:
                    str = C0173a.m312m(parcel, m);
                    break;
                case 4:
                    cart = (Cart) C0173a.m294a(parcel, m, Cart.CREATOR);
                    break;
                default:
                    C0173a.m298b(parcel, m);
                    break;
            }
        }
        if (parcel.dataPosition() == n) {
            return new FullWalletRequest(i, str2, str, cart);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }

    /* renamed from: bA */
    public FullWalletRequest[] newArray(int i) {
        return new FullWalletRequest[i];
    }
}
