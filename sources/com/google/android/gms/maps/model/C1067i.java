package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.C0175b;

/* renamed from: com.google.android.gms.maps.model.i */
public class C1067i {
    /* renamed from: a */
    static void m3181a(Tile tile, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m350c(parcel, 1, tile.getVersionCode());
        C0175b.m350c(parcel, 2, tile.width);
        C0175b.m350c(parcel, 3, tile.height);
        C0175b.m343a(parcel, 4, tile.data, false);
        C0175b.m329D(parcel, o);
    }
}
