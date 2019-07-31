package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;

/* renamed from: com.google.android.gms.wallet.h */
public class C1135h implements Creator<MaskedWallet> {
    /* renamed from: a */
    static void m3299a(MaskedWallet maskedWallet, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m350c(parcel, 1, maskedWallet.getVersionCode());
        C0175b.m339a(parcel, 2, maskedWallet.f2795Gn, false);
        C0175b.m339a(parcel, 3, maskedWallet.f2796Go, false);
        C0175b.m346a(parcel, 4, maskedWallet.f2800Gt, false);
        C0175b.m339a(parcel, 5, maskedWallet.f2797Gq, false);
        C0175b.m337a(parcel, 6, (Parcelable) maskedWallet.f2798Gr, i, false);
        C0175b.m337a(parcel, 7, (Parcelable) maskedWallet.f2799Gs, i, false);
        C0175b.m345a(parcel, 8, (T[]) maskedWallet.f2793GI, i, false);
        C0175b.m345a(parcel, 9, (T[]) maskedWallet.f2794GJ, i, false);
        C0175b.m329D(parcel, o);
    }

    /* renamed from: aL */
    public MaskedWallet createFromParcel(Parcel parcel) {
        OfferWalletObject[] offerWalletObjectArr = null;
        int n = C0173a.m313n(parcel);
        int i = 0;
        LoyaltyWalletObject[] loyaltyWalletObjectArr = null;
        Address address = null;
        Address address2 = null;
        String str = null;
        String[] strArr = null;
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
                    strArr = C0173a.m324x(parcel, m);
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
                    loyaltyWalletObjectArr = (LoyaltyWalletObject[]) C0173a.m299b(parcel, m, LoyaltyWalletObject.CREATOR);
                    break;
                case 9:
                    offerWalletObjectArr = (OfferWalletObject[]) C0173a.m299b(parcel, m, OfferWalletObject.CREATOR);
                    break;
                default:
                    C0173a.m298b(parcel, m);
                    break;
            }
        }
        if (parcel.dataPosition() == n) {
            return new MaskedWallet(i, str3, str2, strArr, str, address2, address, loyaltyWalletObjectArr, offerWalletObjectArr);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }

    /* renamed from: bD */
    public MaskedWallet[] newArray(int i) {
        return new MaskedWallet[i];
    }
}
