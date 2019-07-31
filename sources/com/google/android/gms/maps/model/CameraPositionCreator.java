package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;

public class CameraPositionCreator implements Creator<CameraPosition> {
    public static final int CONTENT_DESCRIPTION = 0;

    /* renamed from: a */
    static void m3147a(CameraPosition cameraPosition, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m350c(parcel, 1, cameraPosition.getVersionCode());
        C0175b.m337a(parcel, 2, (Parcelable) cameraPosition.target, i, false);
        C0175b.m332a(parcel, 3, cameraPosition.zoom);
        C0175b.m332a(parcel, 4, cameraPosition.tilt);
        C0175b.m332a(parcel, 5, cameraPosition.bearing);
        C0175b.m329D(parcel, o);
    }

    public CameraPosition createFromParcel(Parcel parcel) {
        float f = 0.0f;
        int n = C0173a.m313n(parcel);
        int i = 0;
        LatLng latLng = null;
        float f2 = 0.0f;
        float f3 = 0.0f;
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
                    f3 = C0173a.m308j(parcel, m);
                    break;
                case 4:
                    f2 = C0173a.m308j(parcel, m);
                    break;
                case 5:
                    f = C0173a.m308j(parcel, m);
                    break;
                default:
                    C0173a.m298b(parcel, m);
                    break;
            }
        }
        if (parcel.dataPosition() == n) {
            return new CameraPosition(i, latLng, f3, f2, f);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }

    public CameraPosition[] newArray(int size) {
        return new CameraPosition[size];
    }
}
