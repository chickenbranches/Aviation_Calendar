package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0175b;

/* renamed from: com.google.android.gms.maps.model.d */
public class C1062d {
    /* renamed from: a */
    static void m3176a(LatLngBounds latLngBounds, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m350c(parcel, 1, latLngBounds.getVersionCode());
        C0175b.m337a(parcel, 2, (Parcelable) latLngBounds.southwest, i, false);
        C0175b.m337a(parcel, 3, (Parcelable) latLngBounds.northeast, i, false);
        C0175b.m329D(parcel, o);
    }
}
