package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;
import com.google.android.gms.internal.C0618ev.C0619a;
import com.google.android.gms.internal.C0618ev.C0620b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ex */
public class C0622ex implements Creator<C0619a> {
    /* renamed from: a */
    static void m1653a(C0619a aVar, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m350c(parcel, 1, aVar.versionCode);
        C0175b.m339a(parcel, 2, aVar.className, false);
        C0175b.m349b(parcel, 3, aVar.f1598qv, false);
        C0175b.m329D(parcel, o);
    }

    /* renamed from: U */
    public C0619a[] newArray(int i) {
        return new C0619a[i];
    }

    /* renamed from: w */
    public C0619a createFromParcel(Parcel parcel) {
        ArrayList arrayList = null;
        int n = C0173a.m313n(parcel);
        int i = 0;
        String str = null;
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
                    arrayList = C0173a.m300c(parcel, m, C0620b.CREATOR);
                    break;
                default:
                    C0173a.m298b(parcel, m);
                    break;
            }
        }
        if (parcel.dataPosition() == n) {
            return new C0619a(i, str, arrayList);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }
}
