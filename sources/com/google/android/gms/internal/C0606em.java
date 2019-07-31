package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;

/* renamed from: com.google.android.gms.internal.em */
public class C0606em implements Creator<C0605el> {
    /* renamed from: a */
    static void m1574a(C0605el elVar, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m350c(parcel, 1, elVar.getType());
        C0175b.m350c(parcel, 1000, elVar.getVersionCode());
        C0175b.m350c(parcel, 2, elVar.mo3986bY());
        C0175b.m339a(parcel, 3, elVar.mo3987bZ(), false);
        C0175b.m339a(parcel, 4, elVar.mo3988ca(), false);
        C0175b.m339a(parcel, 5, elVar.getDisplayName(), false);
        C0175b.m339a(parcel, 6, elVar.mo3989cb(), false);
        C0175b.m334a(parcel, 7, elVar.getMetadata(), false);
        C0175b.m329D(parcel, o);
    }

    /* renamed from: N */
    public C0605el[] newArray(int i) {
        return new C0605el[i];
    }

    /* renamed from: p */
    public C0605el createFromParcel(Parcel parcel) {
        int i = 0;
        Bundle bundle = null;
        int n = C0173a.m313n(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            switch (C0173a.m292M(m)) {
                case 1:
                    i2 = C0173a.m305g(parcel, m);
                    break;
                case 2:
                    i = C0173a.m305g(parcel, m);
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
                    str = C0173a.m312m(parcel, m);
                    break;
                case 7:
                    bundle = C0173a.m315o(parcel, m);
                    break;
                case 1000:
                    i3 = C0173a.m305g(parcel, m);
                    break;
                default:
                    C0173a.m298b(parcel, m);
                    break;
            }
        }
        if (parcel.dataPosition() == n) {
            return new C0605el(i3, i2, i, str4, str3, str2, str, bundle);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }
}
