package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;
import com.google.android.gms.internal.C0613es.C0614a;
import com.google.android.gms.internal.C0618ev.C0620b;

/* renamed from: com.google.android.gms.internal.eu */
public class C0617eu implements Creator<C0620b> {
    /* renamed from: a */
    static void m1637a(C0620b bVar, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m350c(parcel, 1, bVar.versionCode);
        C0175b.m339a(parcel, 2, bVar.f1599qw, false);
        C0175b.m337a(parcel, 3, (Parcelable) bVar.f1600qx, i, false);
        C0175b.m329D(parcel, o);
    }

    /* renamed from: S */
    public C0620b[] newArray(int i) {
        return new C0620b[i];
    }

    /* renamed from: u */
    public C0620b createFromParcel(Parcel parcel) {
        C0614a aVar = null;
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
                    aVar = (C0614a) C0173a.m294a(parcel, m, (Creator<T>) C0614a.CREATOR);
                    break;
                default:
                    C0173a.m298b(parcel, m);
                    break;
            }
        }
        if (parcel.dataPosition() == n) {
            return new C0620b(i, str, aVar);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }
}
