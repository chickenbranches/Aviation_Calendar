package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.C0175b;

/* renamed from: com.google.android.gms.maps.model.e */
public class C1063e {
    /* renamed from: a */
    static void m3177a(LatLng latLng, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m350c(parcel, 1, latLng.getVersionCode());
        C0175b.m331a(parcel, 2, latLng.latitude);
        C0175b.m331a(parcel, 3, latLng.longitude);
        C0175b.m329D(parcel, o);
    }
}
