package com.google.android.gms.location;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;

/* renamed from: com.google.android.gms.location.g */
public class C0975g implements Creator<C0974f> {
    /* renamed from: a */
    static void m3041a(C0974f fVar, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m337a(parcel, 1, (Parcelable) fVar.mo5363dB(), i, false);
        C0175b.m350c(parcel, 1000, fVar.getVersionCode());
        C0175b.m339a(parcel, 2, fVar.mo5364dC(), false);
        C0175b.m329D(parcel, o);
    }

    /* renamed from: aT */
    public C0974f[] newArray(int i) {
        return new C0974f[i];
    }

    /* renamed from: ag */
    public C0974f createFromParcel(Parcel parcel) {
        String m;
        PendingIntent pendingIntent;
        int i;
        String str = null;
        int n = C0173a.m313n(parcel);
        int i2 = 0;
        PendingIntent pendingIntent2 = null;
        while (parcel.dataPosition() < n) {
            int m2 = C0173a.m311m(parcel);
            switch (C0173a.m292M(m2)) {
                case 1:
                    i = i2;
                    PendingIntent pendingIntent3 = (PendingIntent) C0173a.m294a(parcel, m2, PendingIntent.CREATOR);
                    m = str;
                    pendingIntent = pendingIntent3;
                    break;
                case 2:
                    m = C0173a.m312m(parcel, m2);
                    pendingIntent = pendingIntent2;
                    i = i2;
                    break;
                case 1000:
                    String str2 = str;
                    pendingIntent = pendingIntent2;
                    i = C0173a.m305g(parcel, m2);
                    m = str2;
                    break;
                default:
                    C0173a.m298b(parcel, m2);
                    m = str;
                    pendingIntent = pendingIntent2;
                    i = i2;
                    break;
            }
            i2 = i;
            pendingIntent2 = pendingIntent;
            str = m;
        }
        if (parcel.dataPosition() == n) {
            return new C0974f(i2, pendingIntent2, str);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }
}
