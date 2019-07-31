package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;

/* renamed from: com.google.android.gms.internal.cv */
public class C0504cv implements Creator<C0503cu> {
    /* renamed from: a */
    static void m1157a(C0503cu cuVar, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m350c(parcel, 1, cuVar.versionCode);
        C0175b.m339a(parcel, 2, cuVar.f1346iJ, false);
        C0175b.m350c(parcel, 3, cuVar.f1347iK);
        C0175b.m350c(parcel, 4, cuVar.f1348iL);
        C0175b.m342a(parcel, 5, cuVar.f1349iM);
        C0175b.m329D(parcel, o);
    }

    /* renamed from: h */
    public C0503cu createFromParcel(Parcel parcel) {
        boolean z = false;
        int n = C0173a.m313n(parcel);
        String str = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            switch (C0173a.m292M(m)) {
                case 1:
                    i3 = C0173a.m305g(parcel, m);
                    break;
                case 2:
                    str = C0173a.m312m(parcel, m);
                    break;
                case 3:
                    i2 = C0173a.m305g(parcel, m);
                    break;
                case 4:
                    i = C0173a.m305g(parcel, m);
                    break;
                case 5:
                    z = C0173a.m301c(parcel, m);
                    break;
                default:
                    C0173a.m298b(parcel, m);
                    break;
            }
        }
        if (parcel.dataPosition() == n) {
            return new C0503cu(i3, str, i2, i, z);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }

    /* renamed from: o */
    public C0503cu[] newArray(int i) {
        return new C0503cu[i];
    }
}
