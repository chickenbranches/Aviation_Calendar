package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;

public class GroundOverlayOptionsCreator implements Creator<GroundOverlayOptions> {
    public static final int CONTENT_DESCRIPTION = 0;

    /* renamed from: a */
    static void m3151a(GroundOverlayOptions groundOverlayOptions, Parcel parcel, int i) {
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

    public GroundOverlayOptions createFromParcel(Parcel parcel) {
        int n = C0173a.m313n(parcel);
        int i = 0;
        IBinder iBinder = null;
        LatLng latLng = null;
        float f = 0.0f;
        float f2 = 0.0f;
        LatLngBounds latLngBounds = null;
        float f3 = 0.0f;
        float f4 = 0.0f;
        boolean z = false;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
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
                    latLng = (LatLng) C0173a.m294a(parcel, m, (Creator<T>) LatLng.CREATOR);
                    break;
                case 4:
                    f = C0173a.m308j(parcel, m);
                    break;
                case 5:
                    f2 = C0173a.m308j(parcel, m);
                    break;
                case 6:
                    latLngBounds = (LatLngBounds) C0173a.m294a(parcel, m, (Creator<T>) LatLngBounds.CREATOR);
                    break;
                case 7:
                    f3 = C0173a.m308j(parcel, m);
                    break;
                case 8:
                    f4 = C0173a.m308j(parcel, m);
                    break;
                case 9:
                    z = C0173a.m301c(parcel, m);
                    break;
                case 10:
                    f5 = C0173a.m308j(parcel, m);
                    break;
                case 11:
                    f6 = C0173a.m308j(parcel, m);
                    break;
                case 12:
                    f7 = C0173a.m308j(parcel, m);
                    break;
                default:
                    C0173a.m298b(parcel, m);
                    break;
            }
        }
        if (parcel.dataPosition() == n) {
            return new GroundOverlayOptions(i, iBinder, latLng, f, f2, latLngBounds, f3, f4, z, f5, f6, f7);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }

    public GroundOverlayOptions[] newArray(int size) {
        return new GroundOverlayOptions[size];
    }
}
