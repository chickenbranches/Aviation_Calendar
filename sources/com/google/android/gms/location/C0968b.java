package com.google.android.gms.location;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;

/* renamed from: com.google.android.gms.location.b */
public class C0968b implements Creator<C0967a> {
    /* renamed from: a */
    static void m3031a(C0967a aVar, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m337a(parcel, 1, (Parcelable) aVar.mo5342dB(), i, false);
        C0175b.m350c(parcel, 1000, aVar.getVersionCode());
        C0175b.m329D(parcel, o);
    }

    /* renamed from: aN */
    public C0967a[] newArray(int i) {
        return new C0967a[i];
    }

    /* renamed from: ae */
    public C0967a createFromParcel(Parcel parcel) {
        int n = C0173a.m313n(parcel);
        int i = 0;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            switch (C0173a.m292M(m)) {
                case 1:
                    pendingIntent = (PendingIntent) C0173a.m294a(parcel, m, PendingIntent.CREATOR);
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
            return new C0967a(i, pendingIntent);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }
}
