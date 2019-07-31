package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;

/* renamed from: com.google.android.gms.internal.y */
public class C0965y implements Creator<C0964x> {
    /* renamed from: a */
    static void m3018a(C0964x xVar, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m350c(parcel, 1, xVar.versionCode);
        C0175b.m339a(parcel, 2, xVar.f2418eF, false);
        C0175b.m350c(parcel, 3, xVar.height);
        C0175b.m350c(parcel, 4, xVar.heightPixels);
        C0175b.m342a(parcel, 5, xVar.f2419eG);
        C0175b.m350c(parcel, 6, xVar.width);
        C0175b.m350c(parcel, 7, xVar.widthPixels);
        C0175b.m345a(parcel, 8, (T[]) xVar.f2420eH, i, false);
        C0175b.m329D(parcel, o);
    }

    /* renamed from: b */
    public C0964x createFromParcel(Parcel parcel) {
        C0964x[] xVarArr = null;
        int i = 0;
        int n = C0173a.m313n(parcel);
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        int i4 = 0;
        String str = null;
        int i5 = 0;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            switch (C0173a.m292M(m)) {
                case 1:
                    i5 = C0173a.m305g(parcel, m);
                    break;
                case 2:
                    str = C0173a.m312m(parcel, m);
                    break;
                case 3:
                    i4 = C0173a.m305g(parcel, m);
                    break;
                case 4:
                    i3 = C0173a.m305g(parcel, m);
                    break;
                case 5:
                    z = C0173a.m301c(parcel, m);
                    break;
                case 6:
                    i2 = C0173a.m305g(parcel, m);
                    break;
                case 7:
                    i = C0173a.m305g(parcel, m);
                    break;
                case 8:
                    xVarArr = (C0964x[]) C0173a.m299b(parcel, m, C0964x.CREATOR);
                    break;
                default:
                    C0173a.m298b(parcel, m);
                    break;
            }
        }
        if (parcel.dataPosition() == n) {
            return new C0964x(i5, str, i4, i3, z, i2, i, xVarArr);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }

    /* renamed from: c */
    public C0964x[] newArray(int i) {
        return new C0964x[i];
    }
}
