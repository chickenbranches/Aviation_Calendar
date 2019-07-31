package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;

public class VisibleRegionCreator implements Creator<VisibleRegion> {
    public static final int CONTENT_DESCRIPTION = 0;

    /* renamed from: a */
    static void m3172a(VisibleRegion visibleRegion, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m350c(parcel, 1, visibleRegion.getVersionCode());
        C0175b.m337a(parcel, 2, (Parcelable) visibleRegion.nearLeft, i, false);
        C0175b.m337a(parcel, 3, (Parcelable) visibleRegion.nearRight, i, false);
        C0175b.m337a(parcel, 4, (Parcelable) visibleRegion.farLeft, i, false);
        C0175b.m337a(parcel, 5, (Parcelable) visibleRegion.farRight, i, false);
        C0175b.m337a(parcel, 6, (Parcelable) visibleRegion.latLngBounds, i, false);
        C0175b.m329D(parcel, o);
    }

    public VisibleRegion createFromParcel(Parcel parcel) {
        LatLngBounds latLngBounds = null;
        int n = C0173a.m313n(parcel);
        int i = 0;
        LatLng latLng = null;
        LatLng latLng2 = null;
        LatLng latLng3 = null;
        LatLng latLng4 = null;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            switch (C0173a.m292M(m)) {
                case 1:
                    i = C0173a.m305g(parcel, m);
                    break;
                case 2:
                    latLng4 = (LatLng) C0173a.m294a(parcel, m, (Creator<T>) LatLng.CREATOR);
                    break;
                case 3:
                    latLng3 = (LatLng) C0173a.m294a(parcel, m, (Creator<T>) LatLng.CREATOR);
                    break;
                case 4:
                    latLng2 = (LatLng) C0173a.m294a(parcel, m, (Creator<T>) LatLng.CREATOR);
                    break;
                case 5:
                    latLng = (LatLng) C0173a.m294a(parcel, m, (Creator<T>) LatLng.CREATOR);
                    break;
                case 6:
                    latLngBounds = (LatLngBounds) C0173a.m294a(parcel, m, (Creator<T>) LatLngBounds.CREATOR);
                    break;
                default:
                    C0173a.m298b(parcel, m);
                    break;
            }
        }
        if (parcel.dataPosition() == n) {
            return new VisibleRegion(i, latLng4, latLng3, latLng2, latLng, latLngBounds);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }

    public VisibleRegion[] newArray(int size) {
        return new VisibleRegion[size];
    }
}
