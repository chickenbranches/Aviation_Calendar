package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0175b;

/* renamed from: com.google.android.gms.maps.model.c */
public class C1061c {
    /* renamed from: a */
    static void m3175a(GroundOverlayOptions groundOverlayOptions, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m350c(parcel, 1, groundOverlayOptions.getVersionCode());
        C0175b.m335a(parcel, 2, groundOverlayOptions.mo5763eF(), false);
        C0175b.m337a(parcel, 3, (Parcelable) groundOverlayOptions.getLocation(), i, false);
        C0175b.m332a(parcel, 4, groundOverlayOptions.getWidth());
        C0175b.m332a(parcel, 5, groundOverlayOptions.getHeight());
        C0175b.m337a(parcel, 6, (Parcelable) groundOverlayOptions.getBounds(), i, false);
        C0175b.m332a(parcel, 7, groundOverlayOptions.getBearing());
        C0175b.m332a(parcel, 8, groundOverlayOptions.getZIndex());
        C0175b.m342a(parcel, 9, groundOverlayOptions.isVisible());
        C0175b.m332a(parcel, 10, groundOverlayOptions.getTransparency());
        C0175b.m332a(parcel, 11, groundOverlayOptions.getAnchorU());
        C0175b.m332a(parcel, 12, groundOverlayOptions.getAnchorV());
        C0175b.m329D(parcel, o);
    }
}
