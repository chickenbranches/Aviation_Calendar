package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;
import com.google.android.gms.internal.C0565dt.C0566a;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ef */
public class C0599ef implements Creator<C0566a> {
    /* renamed from: a */
    static void m1544a(C0566a aVar, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m339a(parcel, 1, aVar.getAccountName(), false);
        C0175b.m350c(parcel, 1000, aVar.getVersionCode());
        C0175b.m340a(parcel, 2, aVar.mo3878bH(), false);
        C0175b.m350c(parcel, 3, aVar.mo3877bG());
        C0175b.m339a(parcel, 4, aVar.mo3879bJ(), false);
        C0175b.m329D(parcel, o);
    }

    /* renamed from: L */
    public C0566a[] newArray(int i) {
        return new C0566a[i];
    }

    /* renamed from: l */
    public C0566a createFromParcel(Parcel parcel) {
        int i = 0;
        String str = null;
        int n = C0173a.m313n(parcel);
        List list = null;
        String str2 = null;
        int i2 = 0;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            switch (C0173a.m292M(m)) {
                case 1:
                    str2 = C0173a.m312m(parcel, m);
                    break;
                case 2:
                    list = C0173a.m325y(parcel, m);
                    break;
                case 3:
                    i = C0173a.m305g(parcel, m);
                    break;
                case 4:
                    str = C0173a.m312m(parcel, m);
                    break;
                case 1000:
                    i2 = C0173a.m305g(parcel, m);
                    break;
                default:
                    C0173a.m298b(parcel, m);
                    break;
            }
        }
        if (parcel.dataPosition() == n) {
            return new C0566a(i2, str2, list, i, str);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }
}
