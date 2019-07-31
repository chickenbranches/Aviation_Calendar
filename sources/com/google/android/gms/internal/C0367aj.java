package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;

/* renamed from: com.google.android.gms.internal.aj */
public class C0367aj implements Creator<C0366ai> {
    /* renamed from: a */
    static void m882a(C0366ai aiVar, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m350c(parcel, 1, aiVar.versionCode);
        C0175b.m350c(parcel, 2, aiVar.f874eZ);
        C0175b.m350c(parcel, 3, aiVar.backgroundColor);
        C0175b.m350c(parcel, 4, aiVar.f875fa);
        C0175b.m350c(parcel, 5, aiVar.f876fb);
        C0175b.m350c(parcel, 6, aiVar.f877fc);
        C0175b.m350c(parcel, 7, aiVar.f878fd);
        C0175b.m350c(parcel, 8, aiVar.f879fe);
        C0175b.m350c(parcel, 9, aiVar.f880ff);
        C0175b.m339a(parcel, 10, aiVar.f881fg, false);
        C0175b.m350c(parcel, 11, aiVar.f882fh);
        C0175b.m339a(parcel, 12, aiVar.f883fi, false);
        C0175b.m350c(parcel, 13, aiVar.f884fj);
        C0175b.m350c(parcel, 14, aiVar.f885fk);
        C0175b.m339a(parcel, 15, aiVar.f886fl, false);
        C0175b.m329D(parcel, o);
    }

    /* renamed from: c */
    public C0366ai createFromParcel(Parcel parcel) {
        int n = C0173a.m313n(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        String str = null;
        int i10 = 0;
        String str2 = null;
        int i11 = 0;
        int i12 = 0;
        String str3 = null;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            switch (C0173a.m292M(m)) {
                case 1:
                    i = C0173a.m305g(parcel, m);
                    break;
                case 2:
                    i2 = C0173a.m305g(parcel, m);
                    break;
                case 3:
                    i3 = C0173a.m305g(parcel, m);
                    break;
                case 4:
                    i4 = C0173a.m305g(parcel, m);
                    break;
                case 5:
                    i5 = C0173a.m305g(parcel, m);
                    break;
                case 6:
                    i6 = C0173a.m305g(parcel, m);
                    break;
                case 7:
                    i7 = C0173a.m305g(parcel, m);
                    break;
                case 8:
                    i8 = C0173a.m305g(parcel, m);
                    break;
                case 9:
                    i9 = C0173a.m305g(parcel, m);
                    break;
                case 10:
                    str = C0173a.m312m(parcel, m);
                    break;
                case 11:
                    i10 = C0173a.m305g(parcel, m);
                    break;
                case 12:
                    str2 = C0173a.m312m(parcel, m);
                    break;
                case 13:
                    i11 = C0173a.m305g(parcel, m);
                    break;
                case 14:
                    i12 = C0173a.m305g(parcel, m);
                    break;
                case 15:
                    str3 = C0173a.m312m(parcel, m);
                    break;
                default:
                    C0173a.m298b(parcel, m);
                    break;
            }
        }
        if (parcel.dataPosition() == n) {
            return new C0366ai(i, i2, i3, i4, i5, i6, i7, i8, i9, str, i10, str2, i11, i12, str3);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }

    /* renamed from: e */
    public C0366ai[] newArray(int i) {
        return new C0366ai[i];
    }
}
