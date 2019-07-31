package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;

public class LocationRequestCreator implements Creator<LocationRequest> {
    public static final int CONTENT_DESCRIPTION = 0;

    /* renamed from: a */
    static void m3028a(LocationRequest locationRequest, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m350c(parcel, 1, locationRequest.mPriority);
        C0175b.m350c(parcel, 1000, locationRequest.getVersionCode());
        C0175b.m333a(parcel, 2, locationRequest.f2441xB);
        C0175b.m333a(parcel, 3, locationRequest.f2442xC);
        C0175b.m342a(parcel, 4, locationRequest.f2443xD);
        C0175b.m333a(parcel, 5, locationRequest.f2446xu);
        C0175b.m350c(parcel, 6, locationRequest.f2444xE);
        C0175b.m332a(parcel, 7, locationRequest.f2445xF);
        C0175b.m329D(parcel, o);
    }

    public LocationRequest createFromParcel(Parcel parcel) {
        boolean z = false;
        int n = C0173a.m313n(parcel);
        int i = LocationRequest.PRIORITY_BALANCED_POWER_ACCURACY;
        long j = 3600000;
        long j2 = 600000;
        long j3 = Long.MAX_VALUE;
        int i2 = Integer.MAX_VALUE;
        float f = 0.0f;
        int i3 = 0;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            switch (C0173a.m292M(m)) {
                case 1:
                    i = C0173a.m305g(parcel, m);
                    break;
                case 2:
                    j = C0173a.m306h(parcel, m);
                    break;
                case 3:
                    j2 = C0173a.m306h(parcel, m);
                    break;
                case 4:
                    z = C0173a.m301c(parcel, m);
                    break;
                case 5:
                    j3 = C0173a.m306h(parcel, m);
                    break;
                case 6:
                    i2 = C0173a.m305g(parcel, m);
                    break;
                case 7:
                    f = C0173a.m308j(parcel, m);
                    break;
                case 1000:
                    i3 = C0173a.m305g(parcel, m);
                    break;
                default:
                    C0173a.m298b(parcel, m);
                    break;
            }
        }
        if (parcel.dataPosition() == n) {
            return new LocationRequest(i3, i, j, j2, z, j3, i2, f);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }

    public LocationRequest[] newArray(int size) {
        return new LocationRequest[size];
    }
}
