package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;

/* renamed from: com.google.android.gms.wallet.g */
public class C1134g implements Creator<LoyaltyWalletObject> {
    /* renamed from: a */
    static void m3296a(LoyaltyWalletObject loyaltyWalletObject, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m350c(parcel, 1, loyaltyWalletObject.getVersionCode());
        C0175b.m339a(parcel, 2, loyaltyWalletObject.f2784GA, false);
        C0175b.m339a(parcel, 3, loyaltyWalletObject.f2785GB, false);
        C0175b.m339a(parcel, 4, loyaltyWalletObject.f2786GC, false);
        C0175b.m339a(parcel, 5, loyaltyWalletObject.f2787GD, false);
        C0175b.m339a(parcel, 6, loyaltyWalletObject.f2788GE, false);
        C0175b.m339a(parcel, 7, loyaltyWalletObject.f2789GF, false);
        C0175b.m339a(parcel, 8, loyaltyWalletObject.f2790GG, false);
        C0175b.m339a(parcel, 9, loyaltyWalletObject.f2791GH, false);
        C0175b.m329D(parcel, o);
    }

    /* renamed from: aK */
    public LoyaltyWalletObject createFromParcel(Parcel parcel) {
        String str = null;
        int n = C0173a.m313n(parcel);
        int i = 0;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            switch (C0173a.m292M(m)) {
                case 1:
                    i = C0173a.m305g(parcel, m);
                    break;
                case 2:
                    str8 = C0173a.m312m(parcel, m);
                    break;
                case 3:
                    str7 = C0173a.m312m(parcel, m);
                    break;
                case 4:
                    str6 = C0173a.m312m(parcel, m);
                    break;
                case 5:
                    str5 = C0173a.m312m(parcel, m);
                    break;
                case 6:
                    str4 = C0173a.m312m(parcel, m);
                    break;
                case 7:
                    str3 = C0173a.m312m(parcel, m);
                    break;
                case 8:
                    str2 = C0173a.m312m(parcel, m);
                    break;
                case 9:
                    str = C0173a.m312m(parcel, m);
                    break;
                default:
                    C0173a.m298b(parcel, m);
                    break;
            }
        }
        if (parcel.dataPosition() == n) {
            return new LoyaltyWalletObject(i, str8, str7, str6, str5, str4, str3, str2, str);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }

    /* renamed from: bC */
    public LoyaltyWalletObject[] newArray(int i) {
        return new LoyaltyWalletObject[i];
    }
}
