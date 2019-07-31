package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;

/* renamed from: com.google.android.gms.wallet.k */
public class C1138k implements Creator<OfferWalletObject> {
    /* renamed from: a */
    static void m3308a(OfferWalletObject offerWalletObject, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m350c(parcel, 1, offerWalletObject.getVersionCode());
        C0175b.m339a(parcel, 2, offerWalletObject.f2821GA, false);
        C0175b.m339a(parcel, 3, offerWalletObject.f2822GX, false);
        C0175b.m329D(parcel, o);
    }

    /* renamed from: aO */
    public OfferWalletObject createFromParcel(Parcel parcel) {
        String str = null;
        int n = C0173a.m313n(parcel);
        int i = 0;
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
                default:
                    C0173a.m298b(parcel, m);
                    break;
            }
        }
        if (parcel.dataPosition() == n) {
            return new OfferWalletObject(i, str2, str);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }

    /* renamed from: bG */
    public OfferWalletObject[] newArray(int i) {
        return new OfferWalletObject[i];
    }
}
