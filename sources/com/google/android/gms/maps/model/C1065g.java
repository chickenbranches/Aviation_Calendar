package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.C0175b;

/* renamed from: com.google.android.gms.maps.model.g */
public class C1065g {
    /* renamed from: a */
    static void m3179a(PolygonOptions polygonOptions, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m350c(parcel, 1, polygonOptions.getVersionCode());
        C0175b.m349b(parcel, 2, polygonOptions.getPoints(), false);
        C0175b.m351c(parcel, 3, polygonOptions.mo5888eH(), false);
        C0175b.m332a(parcel, 4, polygonOptions.getStrokeWidth());
        C0175b.m350c(parcel, 5, polygonOptions.getStrokeColor());
        C0175b.m350c(parcel, 6, polygonOptions.getFillColor());
        C0175b.m332a(parcel, 7, polygonOptions.getZIndex());
        C0175b.m342a(parcel, 8, polygonOptions.isVisible());
        C0175b.m342a(parcel, 9, polygonOptions.isGeodesic());
        C0175b.m329D(parcel, o);
    }
}
