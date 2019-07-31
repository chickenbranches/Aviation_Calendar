package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;

/* renamed from: com.google.android.gms.drive.query.internal.h */
public class C0261h implements Creator<Operator> {
    /* renamed from: a */
    static void m613a(Operator operator, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m350c(parcel, 1000, operator.f535kg);
        C0175b.m339a(parcel, 1, operator.mTag, false);
        C0175b.m329D(parcel, o);
    }

    /* renamed from: X */
    public Operator createFromParcel(Parcel parcel) {
        int n = C0173a.m313n(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            switch (C0173a.m292M(m)) {
                case 1:
                    str = C0173a.m312m(parcel, m);
                    break;
                case 1000:
                    i = C0173a.m305g(parcel, m);
                    break;
                default:
                    C0173a.m298b(parcel, m);
                    break;
            }
        }
        if (parcel.dataPosition() == n) {
            return new Operator(i, str);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }

    /* renamed from: ax */
    public Operator[] newArray(int i) {
        return new Operator[i];
    }
}
