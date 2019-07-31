package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.wallet.b */
public class C1129b implements Creator<Cart> {
    /* renamed from: a */
    static void m3281a(Cart cart, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m350c(parcel, 1, cart.getVersionCode());
        C0175b.m339a(parcel, 2, cart.f2757Gj, false);
        C0175b.m339a(parcel, 3, cart.f2758Gk, false);
        C0175b.m349b(parcel, 4, cart.f2759Gl, false);
        C0175b.m329D(parcel, o);
    }

    /* renamed from: aF */
    public Cart createFromParcel(Parcel parcel) {
        String str = null;
        int n = C0173a.m313n(parcel);
        int i = 0;
        ArrayList arrayList = new ArrayList();
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
                    arrayList = C0173a.m300c(parcel, m, LineItem.CREATOR);
                    break;
                default:
                    C0173a.m298b(parcel, m);
                    break;
            }
        }
        if (parcel.dataPosition() == n) {
            return new Cart(i, str2, str, arrayList);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }

    /* renamed from: bx */
    public Cart[] newArray(int i) {
        return new Cart[i];
    }
}
