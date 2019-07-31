package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.C0175b;

/* renamed from: com.google.android.gms.maps.model.j */
public class C1091j {
    /* renamed from: a */
    static void m3220a(TileOverlayOptions tileOverlayOptions, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m350c(parcel, 1, tileOverlayOptions.getVersionCode());
        C0175b.m335a(parcel, 2, tileOverlayOptions.mo5959eI(), false);
        C0175b.m342a(parcel, 3, tileOverlayOptions.isVisible());
        C0175b.m332a(parcel, 4, tileOverlayOptions.getZIndex());
        C0175b.m329D(parcel, o);
    }
}
