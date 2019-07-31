package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;
import com.google.android.gms.maps.model.CameraPosition;

public class GoogleMapOptionsCreator implements Creator<GoogleMapOptions> {
    public static final int CONTENT_DESCRIPTION = 0;

    /* renamed from: a */
    static void m3065a(GoogleMapOptions googleMapOptions, Parcel parcel, int i) {
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

    public GoogleMapOptions createFromParcel(Parcel parcel) {
        byte b = 0;
        int n = C0173a.m313n(parcel);
        CameraPosition cameraPosition = null;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        byte b5 = 0;
        byte b6 = 0;
        int i = 0;
        byte b7 = 0;
        byte b8 = 0;
        int i2 = 0;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            switch (C0173a.m292M(m)) {
                case 1:
                    i2 = C0173a.m305g(parcel, m);
                    break;
                case 2:
                    b8 = C0173a.m303e(parcel, m);
                    break;
                case 3:
                    b7 = C0173a.m303e(parcel, m);
                    break;
                case 4:
                    i = C0173a.m305g(parcel, m);
                    break;
                case 5:
                    cameraPosition = (CameraPosition) C0173a.m294a(parcel, m, (Creator<T>) CameraPosition.CREATOR);
                    break;
                case 6:
                    b6 = C0173a.m303e(parcel, m);
                    break;
                case 7:
                    b5 = C0173a.m303e(parcel, m);
                    break;
                case 8:
                    b4 = C0173a.m303e(parcel, m);
                    break;
                case 9:
                    b3 = C0173a.m303e(parcel, m);
                    break;
                case 10:
                    b2 = C0173a.m303e(parcel, m);
                    break;
                case 11:
                    b = C0173a.m303e(parcel, m);
                    break;
                default:
                    C0173a.m298b(parcel, m);
                    break;
            }
        }
        if (parcel.dataPosition() == n) {
            return new GoogleMapOptions(i2, b8, b7, i, cameraPosition, b6, b5, b4, b3, b2, b);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }

    public GoogleMapOptions[] newArray(int size) {
        return new GoogleMapOptions[size];
    }
}
