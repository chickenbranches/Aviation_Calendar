package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;

/* renamed from: com.google.android.gms.internal.gp */
public class C0817gp implements Creator<C0816go> {
    /* renamed from: a */
    static void m2459a(C0816go goVar, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m339a(parcel, 1, goVar.getRequestId(), false);
        C0175b.m350c(parcel, 1000, goVar.getVersionCode());
        C0175b.m333a(parcel, 2, goVar.getExpirationTime());
        C0175b.m341a(parcel, 3, goVar.mo4540dK());
        C0175b.m331a(parcel, 4, goVar.getLatitude());
        C0175b.m331a(parcel, 5, goVar.getLongitude());
        C0175b.m332a(parcel, 6, goVar.mo4541dL());
        C0175b.m350c(parcel, 7, goVar.mo4542dM());
        C0175b.m350c(parcel, 8, goVar.getNotificationResponsiveness());
        C0175b.m350c(parcel, 9, goVar.mo4543dN());
        C0175b.m329D(parcel, o);
    }

    /* renamed from: aX */
    public C0816go[] newArray(int i) {
        return new C0816go[i];
    }

    /* renamed from: ai */
    public C0816go createFromParcel(Parcel parcel) {
        int n = C0173a.m313n(parcel);
        int i = 0;
        String str = null;
        int i2 = 0;
        short s = 0;
        double d = 0.0d;
        double d2 = 0.0d;
        float f = 0.0f;
        long j = 0;
        int i3 = 0;
        int i4 = -1;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            switch (C0173a.m292M(m)) {
                case 1:
                    str = C0173a.m312m(parcel, m);
                    break;
                case 2:
                    j = C0173a.m306h(parcel, m);
                    break;
                case 3:
                    s = C0173a.m304f(parcel, m);
                    break;
                case 4:
                    d = C0173a.m309k(parcel, m);
                    break;
                case 5:
                    d2 = C0173a.m309k(parcel, m);
                    break;
                case 6:
                    f = C0173a.m308j(parcel, m);
                    break;
                case 7:
                    i2 = C0173a.m305g(parcel, m);
                    break;
                case 8:
                    i3 = C0173a.m305g(parcel, m);
                    break;
                case 9:
                    i4 = C0173a.m305g(parcel, m);
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
            return new C0816go(i, str, i2, s, d, d2, f, j, i3, i4);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }
}
