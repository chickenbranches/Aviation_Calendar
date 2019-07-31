package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;

public class CircleOptionsCreator implements Creator<CircleOptions> {
    public static final int CONTENT_DESCRIPTION = 0;

    /* renamed from: a */
    static void m3148a(CircleOptions circleOptions, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m350c(parcel, 1, circleOptions.getVersionCode());
        C0175b.m337a(parcel, 2, (Parcelable) circleOptions.getCenter(), i, false);
        C0175b.m331a(parcel, 3, circleOptions.getRadius());
        C0175b.m332a(parcel, 4, circleOptions.getStrokeWidth());
        C0175b.m350c(parcel, 5, circleOptions.getStrokeColor());
        C0175b.m350c(parcel, 6, circleOptions.getFillColor());
        C0175b.m332a(parcel, 7, circleOptions.getZIndex());
        C0175b.m342a(parcel, 8, circleOptions.isVisible());
        C0175b.m329D(parcel, o);
    }

    public CircleOptions createFromParcel(Parcel parcel) {
        float f = 0.0f;
        boolean z = false;
        int n = C0173a.m313n(parcel);
        LatLng latLng = null;
        double d = 0.0d;
        int i = 0;
        int i2 = 0;
        float f2 = 0.0f;
        int i3 = 0;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            switch (C0173a.m292M(m)) {
                case 1:
                    i3 = C0173a.m305g(parcel, m);
                    break;
                case 2:
                    latLng = (LatLng) C0173a.m294a(parcel, m, (Creator<T>) LatLng.CREATOR);
                    break;
                case 3:
                    d = C0173a.m309k(parcel, m);
                    break;
                case 4:
                    f2 = C0173a.m308j(parcel, m);
                    break;
                case 5:
                    i2 = C0173a.m305g(parcel, m);
                    break;
                case 6:
                    i = C0173a.m305g(parcel, m);
                    break;
                case 7:
                    f = C0173a.m308j(parcel, m);
                    break;
                case 8:
                    z = C0173a.m301c(parcel, m);
                    break;
                default:
                    C0173a.m298b(parcel, m);
                    break;
            }
        }
        if (parcel.dataPosition() == n) {
            return new CircleOptions(i3, latLng, d, f2, i2, i, f, z);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }

    public CircleOptions[] newArray(int size) {
        return new CircleOptions[size];
    }
}
