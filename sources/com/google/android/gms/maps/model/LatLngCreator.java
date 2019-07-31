package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;

public class LatLngCreator implements Creator<LatLng> {
    public static final int CONTENT_DESCRIPTION = 0;

    /* renamed from: a */
    static void m3160a(LatLng latLng, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m350c(parcel, 1, latLng.getVersionCode());
        C0175b.m331a(parcel, 2, latLng.latitude);
        C0175b.m331a(parcel, 3, latLng.longitude);
        C0175b.m329D(parcel, o);
    }

    public LatLng createFromParcel(Parcel parcel) {
        double d = 0.0d;
        int n = C0173a.m313n(parcel);
        int i = 0;
        double d2 = 0.0d;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            switch (C0173a.m292M(m)) {
                case 1:
                    i = C0173a.m305g(parcel, m);
                    break;
                case 2:
                    d2 = C0173a.m309k(parcel, m);
                    break;
                case 3:
                    d = C0173a.m309k(parcel, m);
                    break;
                default:
                    C0173a.m298b(parcel, m);
                    break;
            }
        }
        if (parcel.dataPosition() == n) {
            return new LatLng(i, d2, d);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }

    public LatLng[] newArray(int size) {
        return new LatLng[size];
    }
}
