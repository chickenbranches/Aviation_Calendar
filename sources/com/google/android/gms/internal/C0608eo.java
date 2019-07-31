package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;

/* renamed from: com.google.android.gms.internal.eo */
public class C0608eo implements Creator<C0607en> {
    /* renamed from: a */
    static void m1580a(C0607en enVar, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m350c(parcel, 1, enVar.getVersionCode());
        C0175b.m337a(parcel, 2, (Parcelable) enVar.mo4005ce(), i, false);
        C0175b.m329D(parcel, o);
    }

    /* renamed from: O */
    public C0607en[] newArray(int i) {
        return new C0607en[i];
    }

    /* renamed from: q */
    public C0607en createFromParcel(Parcel parcel) {
        int n = C0173a.m313n(parcel);
        int i = 0;
        C0609ep epVar = null;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            switch (C0173a.m292M(m)) {
                case 1:
                    i = C0173a.m305g(parcel, m);
                    break;
                case 2:
                    epVar = (C0609ep) C0173a.m294a(parcel, m, (Creator<T>) C0609ep.CREATOR);
                    break;
                default:
                    C0173a.m298b(parcel, m);
                    break;
            }
        }
        if (parcel.dataPosition() == n) {
            return new C0607en(i, epVar);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }
}
