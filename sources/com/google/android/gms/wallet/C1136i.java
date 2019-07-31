package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;

/* renamed from: com.google.android.gms.wallet.i */
public class C1136i implements Creator<MaskedWalletRequest> {
    /* renamed from: a */
    static void m3302a(MaskedWalletRequest maskedWalletRequest, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m350c(parcel, 1, maskedWalletRequest.getVersionCode());
        C0175b.m339a(parcel, 2, maskedWalletRequest.f2813Go, false);
        C0175b.m342a(parcel, 3, maskedWalletRequest.f2802GK);
        C0175b.m342a(parcel, 4, maskedWalletRequest.f2803GL);
        C0175b.m342a(parcel, 5, maskedWalletRequest.f2804GM);
        C0175b.m339a(parcel, 6, maskedWalletRequest.f2805GN, false);
        C0175b.m339a(parcel, 7, maskedWalletRequest.f2812Gk, false);
        C0175b.m339a(parcel, 8, maskedWalletRequest.f2806GO, false);
        C0175b.m337a(parcel, 9, (Parcelable) maskedWalletRequest.f2814Gu, i, false);
        C0175b.m342a(parcel, 10, maskedWalletRequest.f2807GP);
        C0175b.m342a(parcel, 11, maskedWalletRequest.f2808GQ);
        C0175b.m345a(parcel, 12, (T[]) maskedWalletRequest.f2809GR, i, false);
        C0175b.m342a(parcel, 13, maskedWalletRequest.f2810GS);
        C0175b.m342a(parcel, 14, maskedWalletRequest.f2811GT);
        C0175b.m329D(parcel, o);
    }

    /* renamed from: aM */
    public MaskedWalletRequest createFromParcel(Parcel parcel) {
        int n = C0173a.m313n(parcel);
        int i = 0;
        String str = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Cart cart = null;
        boolean z4 = false;
        boolean z5 = false;
        CountrySpecification[] countrySpecificationArr = null;
        boolean z6 = true;
        boolean z7 = true;
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
                    z = C0173a.m301c(parcel, m);
                    break;
                case 4:
                    z2 = C0173a.m301c(parcel, m);
                    break;
                case 5:
                    z3 = C0173a.m301c(parcel, m);
                    break;
                case 6:
                    str2 = C0173a.m312m(parcel, m);
                    break;
                case 7:
                    str3 = C0173a.m312m(parcel, m);
                    break;
                case 8:
                    str4 = C0173a.m312m(parcel, m);
                    break;
                case 9:
                    cart = (Cart) C0173a.m294a(parcel, m, Cart.CREATOR);
                    break;
                case 10:
                    z4 = C0173a.m301c(parcel, m);
                    break;
                case 11:
                    z5 = C0173a.m301c(parcel, m);
                    break;
                case 12:
                    countrySpecificationArr = (CountrySpecification[]) C0173a.m299b(parcel, m, CountrySpecification.CREATOR);
                    break;
                case 13:
                    z6 = C0173a.m301c(parcel, m);
                    break;
                case 14:
                    z7 = C0173a.m301c(parcel, m);
                    break;
                default:
                    C0173a.m298b(parcel, m);
                    break;
            }
        }
        if (parcel.dataPosition() == n) {
            return new MaskedWalletRequest(i, str, z, z2, z3, str2, str3, str4, cart, z4, z5, countrySpecificationArr, z6, z7);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }

    /* renamed from: bE */
    public MaskedWalletRequest[] newArray(int i) {
        return new MaskedWalletRequest[i];
    }
}
