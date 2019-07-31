package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0175b;

/* renamed from: com.google.android.gms.maps.model.b */
public class C1060b {
    /* renamed from: a */
    static void m3174a(CircleOptions circleOptions, Parcel parcel, int i) {
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
}
