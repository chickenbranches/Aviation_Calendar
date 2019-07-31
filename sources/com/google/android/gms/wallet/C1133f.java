package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;

/* renamed from: com.google.android.gms.wallet.f */
public class C1133f implements Creator<LineItem> {
    /* renamed from: a */
    static void m3293a(LineItem lineItem, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m350c(parcel, 1, lineItem.getVersionCode());
        C0175b.m339a(parcel, 2, lineItem.description, false);
        C0175b.m339a(parcel, 3, lineItem.f2779Gw, false);
        C0175b.m339a(parcel, 4, lineItem.f2780Gx, false);
        C0175b.m339a(parcel, 5, lineItem.f2777Gj, false);
        C0175b.m350c(parcel, 6, lineItem.f2781Gy);
        C0175b.m339a(parcel, 7, lineItem.f2778Gk, false);
        C0175b.m329D(parcel, o);
    }

    /* renamed from: aJ */
    public LineItem createFromParcel(Parcel parcel) {
        int i = 0;
        String str = null;
        int n = C0173a.m313n(parcel);
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        int i2 = 0;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            switch (C0173a.m292M(m)) {
                case 1:
                    i2 = C0173a.m305g(parcel, m);
                    break;
                case 2:
                    str5 = C0173a.m312m(parcel, m);
                    break;
                case 3:
                    str4 = C0173a.m312m(parcel, m);
                    break;
                case 4:
                    str3 = C0173a.m312m(parcel, m);
                    break;
                case 5:
                    str2 = C0173a.m312m(parcel, m);
                    break;
                case 6:
                    i = C0173a.m305g(parcel, m);
                    break;
                case 7:
                    str = C0173a.m312m(parcel, m);
                    break;
                default:
                    C0173a.m298b(parcel, m);
                    break;
            }
        }
        if (parcel.dataPosition() == n) {
            return new LineItem(i2, str5, str4, str3, str2, i, str);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }

    /* renamed from: bB */
    public LineItem[] newArray(int i) {
        return new LineItem[i];
    }
}
