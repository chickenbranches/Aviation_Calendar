package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0175b;

/* renamed from: com.google.android.gms.maps.model.a */
public class C1059a {
    /* renamed from: a */
    static void m3173a(CameraPosition cameraPosition, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m350c(parcel, 1, cameraPosition.getVersionCode());
        C0175b.m337a(parcel, 2, (Parcelable) cameraPosition.target, i, false);
        C0175b.m332a(parcel, 3, cameraPosition.zoom);
        C0175b.m332a(parcel, 4, cameraPosition.tilt);
        C0175b.m332a(parcel, 5, cameraPosition.bearing);
        C0175b.m329D(parcel, o);
    }
}
