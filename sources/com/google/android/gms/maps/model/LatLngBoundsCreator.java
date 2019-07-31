package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;

public class LatLngBoundsCreator implements Creator<LatLngBounds> {
    public static final int CONTENT_DESCRIPTION = 0;

    /* renamed from: a */
    static void m3159a(LatLngBounds latLngBounds, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m350c(parcel, 1, latLngBounds.getVersionCode());
        C0175b.m337a(parcel, 2, (Parcelable) latLngBounds.southwest, i, false);
        C0175b.m337a(parcel, 3, (Parcelable) latLngBounds.northeast, i, false);
        C0175b.m329D(parcel, o);
    }

    public LatLngBounds createFromParcel(Parcel parcel) {
        LatLng latLng;
        LatLng latLng2;
        int i;
        LatLng latLng3 = null;
        int n = C0173a.m313n(parcel);
        int i2 = 0;
        LatLng latLng4 = null;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            switch (C0173a.m292M(m)) {
                case 1:
                    LatLng latLng5 = latLng3;
                    latLng2 = latLng4;
                    i = C0173a.m305g(parcel, m);
                    latLng = latLng5;
                    break;
                case 2:
                    i = i2;
                    LatLng latLng6 = (LatLng) C0173a.m294a(parcel, m, (Creator<T>) LatLng.CREATOR);
                    latLng = latLng3;
                    latLng2 = latLng6;
                    break;
                case 3:
                    latLng = (LatLng) C0173a.m294a(parcel, m, (Creator<T>) LatLng.CREATOR);
                    latLng2 = latLng4;
                    i = i2;
                    break;
                default:
                    C0173a.m298b(parcel, m);
                    latLng = latLng3;
                    latLng2 = latLng4;
                    i = i2;
                    break;
            }
            i2 = i;
            latLng4 = latLng2;
            latLng3 = latLng;
        }
        if (parcel.dataPosition() == n) {
            return new LatLngBounds(i2, latLng4, latLng3);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }

    public LatLngBounds[] newArray(int size) {
        return new LatLngBounds[size];
    }
}
