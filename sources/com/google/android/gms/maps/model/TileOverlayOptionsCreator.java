package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;

public class TileOverlayOptionsCreator implements Creator<TileOverlayOptions> {
    public static final int CONTENT_DESCRIPTION = 0;

    /* renamed from: a */
    static void m3169a(TileOverlayOptions tileOverlayOptions, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m350c(parcel, 1, tileOverlayOptions.getVersionCode());
        C0175b.m335a(parcel, 2, tileOverlayOptions.mo5959eI(), false);
        C0175b.m342a(parcel, 3, tileOverlayOptions.isVisible());
        C0175b.m332a(parcel, 4, tileOverlayOptions.getZIndex());
        C0175b.m342a(parcel, 5, tileOverlayOptions.getFadeIn());
        C0175b.m329D(parcel, o);
    }

    public TileOverlayOptions createFromParcel(Parcel parcel) {
        boolean z = false;
        int n = C0173a.m313n(parcel);
        IBinder iBinder = null;
        float f = 0.0f;
        boolean z2 = true;
        int i = 0;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            switch (C0173a.m292M(m)) {
                case 1:
                    i = C0173a.m305g(parcel, m);
                    break;
                case 2:
                    iBinder = C0173a.m314n(parcel, m);
                    break;
                case 3:
                    z = C0173a.m301c(parcel, m);
                    break;
                case 4:
                    f = C0173a.m308j(parcel, m);
                    break;
                case 5:
                    z2 = C0173a.m301c(parcel, m);
                    break;
                default:
                    C0173a.m298b(parcel, m);
                    break;
            }
        }
        if (parcel.dataPosition() == n) {
            return new TileOverlayOptions(i, iBinder, z, f, z2);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }

    public TileOverlayOptions[] newArray(int size) {
        return new TileOverlayOptions[size];
    }
}
