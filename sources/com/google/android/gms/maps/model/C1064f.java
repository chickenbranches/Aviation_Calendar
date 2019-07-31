package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0175b;

/* renamed from: com.google.android.gms.maps.model.f */
public class C1064f {
    /* renamed from: a */
    static void m3178a(MarkerOptions markerOptions, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m350c(parcel, 1, markerOptions.getVersionCode());
        C0175b.m337a(parcel, 2, (Parcelable) markerOptions.getPosition(), i, false);
        C0175b.m339a(parcel, 3, markerOptions.getTitle(), false);
        C0175b.m339a(parcel, 4, markerOptions.getSnippet(), false);
        C0175b.m335a(parcel, 5, markerOptions.mo5837eG(), false);
        C0175b.m332a(parcel, 6, markerOptions.getAnchorU());
        C0175b.m332a(parcel, 7, markerOptions.getAnchorV());
        C0175b.m342a(parcel, 8, markerOptions.isDraggable());
        C0175b.m342a(parcel, 9, markerOptions.isVisible());
        C0175b.m329D(parcel, o);
    }
}
