package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.C0175b;

/* renamed from: com.google.android.gms.maps.model.h */
public class C1066h {
    /* renamed from: a */
    static void m3180a(PolylineOptions polylineOptions, Parcel parcel, int i) {
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
}
