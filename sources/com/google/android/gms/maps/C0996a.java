package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0175b;

/* renamed from: com.google.android.gms.maps.a */
public class C0996a {
    /* renamed from: a */
    static void m3079a(GoogleMapOptions googleMapOptions, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m350c(parcel, 1, googleMapOptions.getVersionCode());
        C0175b.m330a(parcel, 2, googleMapOptions.mo5457eo());
        C0175b.m330a(parcel, 3, googleMapOptions.mo5458ep());
        C0175b.m350c(parcel, 4, googleMapOptions.getMapType());
        C0175b.m337a(parcel, 5, (Parcelable) googleMapOptions.getCamera(), i, false);
        C0175b.m330a(parcel, 6, googleMapOptions.mo5459eq());
        C0175b.m330a(parcel, 7, googleMapOptions.mo5460er());
        C0175b.m330a(parcel, 8, googleMapOptions.mo5461es());
        C0175b.m330a(parcel, 9, googleMapOptions.mo5462et());
        C0175b.m330a(parcel, 10, googleMapOptions.mo5463eu());
        C0175b.m330a(parcel, 11, googleMapOptions.mo5464ev());
        C0175b.m329D(parcel, o);
    }
}
