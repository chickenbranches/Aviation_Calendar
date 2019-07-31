package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0175b;

/* renamed from: com.google.android.gms.maps.model.k */
public class C1092k {
    /* renamed from: a */
    static void m3221a(VisibleRegion visibleRegion, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m350c(parcel, 1, visibleRegion.getVersionCode());
        C0175b.m337a(parcel, 2, (Parcelable) visibleRegion.nearLeft, i, false);
        C0175b.m337a(parcel, 3, (Parcelable) visibleRegion.nearRight, i, false);
        C0175b.m337a(parcel, 4, (Parcelable) visibleRegion.farLeft, i, false);
        C0175b.m337a(parcel, 5, (Parcelable) visibleRegion.farRight, i, false);
        C0175b.m337a(parcel, 6, (Parcelable) visibleRegion.latLngBounds, i, false);
        C0175b.m329D(parcel, o);
    }
}
