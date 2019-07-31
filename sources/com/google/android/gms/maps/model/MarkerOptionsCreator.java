package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;

public class MarkerOptionsCreator implements Creator<MarkerOptions> {
    public static final int CONTENT_DESCRIPTION = 0;

    /* renamed from: a */
    static void m3162a(MarkerOptions markerOptions, Parcel parcel, int i) {
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
        C0175b.m342a(parcel, 10, markerOptions.isFlat());
        C0175b.m332a(parcel, 11, markerOptions.getRotation());
        C0175b.m332a(parcel, 12, markerOptions.getInfoWindowAnchorU());
        C0175b.m332a(parcel, 13, markerOptions.getInfoWindowAnchorV());
        C0175b.m332a(parcel, 14, markerOptions.getAlpha());
        C0175b.m329D(parcel, o);
    }

    public MarkerOptions createFromParcel(Parcel parcel) {
        int n = C0173a.m313n(parcel);
        int i = 0;
        LatLng latLng = null;
        String str = null;
        String str2 = null;
        IBinder iBinder = null;
        float f = 0.0f;
        float f2 = 0.0f;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        float f3 = 0.0f;
        float f4 = 0.5f;
        float f5 = 0.0f;
        float f6 = 1.0f;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            switch (C0173a.m292M(m)) {
                case 1:
                    i = C0173a.m305g(parcel, m);
                    break;
                case 2:
                    latLng = (LatLng) C0173a.m294a(parcel, m, (Creator<T>) LatLng.CREATOR);
                    break;
                case 3:
                    str = C0173a.m312m(parcel, m);
                    break;
                case 4:
                    str2 = C0173a.m312m(parcel, m);
                    break;
                case 5:
                    iBinder = C0173a.m314n(parcel, m);
                    break;
                case 6:
                    f = C0173a.m308j(parcel, m);
                    break;
                case 7:
                    f2 = C0173a.m308j(parcel, m);
                    break;
                case 8:
                    z = C0173a.m301c(parcel, m);
                    break;
                case 9:
                    z2 = C0173a.m301c(parcel, m);
                    break;
                case 10:
                    z3 = C0173a.m301c(parcel, m);
                    break;
                case 11:
                    f3 = C0173a.m308j(parcel, m);
                    break;
                case 12:
                    f4 = C0173a.m308j(parcel, m);
                    break;
                case 13:
                    f5 = C0173a.m308j(parcel, m);
                    break;
                case 14:
                    f6 = C0173a.m308j(parcel, m);
                    break;
                default:
                    C0173a.m298b(parcel, m);
                    break;
            }
        }
        if (parcel.dataPosition() == n) {
            return new MarkerOptions(i, latLng, str, str2, iBinder, f, f2, z, z2, z3, f3, f4, f5, f6);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }

    public MarkerOptions[] newArray(int size) {
        return new MarkerOptions[size];
    }
}
