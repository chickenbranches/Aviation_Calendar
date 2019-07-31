package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;
import java.util.ArrayList;

public class PolylineOptionsCreator implements Creator<PolylineOptions> {
    public static final int CONTENT_DESCRIPTION = 0;

    /* renamed from: a */
    static void m3165a(PolylineOptions polylineOptions, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m350c(parcel, 1, polylineOptions.getVersionCode());
        C0175b.m349b(parcel, 2, polylineOptions.getPoints(), false);
        C0175b.m332a(parcel, 3, polylineOptions.getWidth());
        C0175b.m350c(parcel, 4, polylineOptions.getColor());
        C0175b.m332a(parcel, 5, polylineOptions.getZIndex());
        C0175b.m342a(parcel, 6, polylineOptions.isVisible());
        C0175b.m342a(parcel, 7, polylineOptions.isGeodesic());
        C0175b.m329D(parcel, o);
    }

    public PolylineOptions createFromParcel(Parcel parcel) {
        float f = 0.0f;
        boolean z = false;
        int n = C0173a.m313n(parcel);
        ArrayList arrayList = null;
        boolean z2 = false;
        int i = 0;
        float f2 = 0.0f;
        int i2 = 0;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            switch (C0173a.m292M(m)) {
                case 1:
                    i2 = C0173a.m305g(parcel, m);
                    break;
                case 2:
                    arrayList = C0173a.m300c(parcel, m, LatLng.CREATOR);
                    break;
                case 3:
                    f2 = C0173a.m308j(parcel, m);
                    break;
                case 4:
                    i = C0173a.m305g(parcel, m);
                    break;
                case 5:
                    f = C0173a.m308j(parcel, m);
                    break;
                case 6:
                    z2 = C0173a.m301c(parcel, m);
                    break;
                case 7:
                    z = C0173a.m301c(parcel, m);
                    break;
                default:
                    C0173a.m298b(parcel, m);
                    break;
            }
        }
        if (parcel.dataPosition() == n) {
            return new PolylineOptions(i2, arrayList, f2, i, f, z2, z);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }

    public PolylineOptions[] newArray(int size) {
        return new PolylineOptions[size];
    }
}
