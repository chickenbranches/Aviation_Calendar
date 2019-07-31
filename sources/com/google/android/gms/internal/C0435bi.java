package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;

/* renamed from: com.google.android.gms.internal.bi */
public class C0435bi implements Creator<C0436bj> {
    /* renamed from: a */
    static void m970a(C0436bj bjVar, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m350c(parcel, 1, bjVar.versionCode);
        C0175b.m339a(parcel, 2, bjVar.f1167gn, false);
        C0175b.m339a(parcel, 3, bjVar.f1168go, false);
        C0175b.m339a(parcel, 4, bjVar.mimeType, false);
        C0175b.m339a(parcel, 5, bjVar.packageName, false);
        C0175b.m339a(parcel, 6, bjVar.f1169gp, false);
        C0175b.m339a(parcel, 7, bjVar.f1170gq, false);
        C0175b.m339a(parcel, 8, bjVar.f1171gr, false);
        C0175b.m329D(parcel, o);
    }

    /* renamed from: d */
    public C0436bj createFromParcel(Parcel parcel) {
        String str = null;
        int n = C0173a.m313n(parcel);
        int i = 0;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            switch (C0173a.m292M(m)) {
                case 1:
                    i = C0173a.m305g(parcel, m);
                    break;
                case 2:
                    str7 = C0173a.m312m(parcel, m);
                    break;
                case 3:
                    str6 = C0173a.m312m(parcel, m);
                    break;
                case 4:
                    str5 = C0173a.m312m(parcel, m);
                    break;
                case 5:
                    str4 = C0173a.m312m(parcel, m);
                    break;
                case 6:
                    str3 = C0173a.m312m(parcel, m);
                    break;
                case 7:
                    str2 = C0173a.m312m(parcel, m);
                    break;
                case 8:
                    str = C0173a.m312m(parcel, m);
                    break;
                default:
                    C0173a.m298b(parcel, m);
                    break;
            }
        }
        if (parcel.dataPosition() == n) {
            return new C0436bj(i, str7, str6, str5, str4, str3, str2, str);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }

    /* renamed from: i */
    public C0436bj[] newArray(int i) {
        return new C0436bj[i];
    }
}
