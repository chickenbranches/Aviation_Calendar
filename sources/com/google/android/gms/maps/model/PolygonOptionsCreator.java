package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;
import java.util.ArrayList;
import java.util.List;

public class PolygonOptionsCreator implements Creator<PolygonOptions> {
    public static final int CONTENT_DESCRIPTION = 0;

    /* renamed from: a */
    static void m3164a(PolygonOptions polygonOptions, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m350c(parcel, 1, polygonOptions.getVersionCode());
        C0175b.m349b(parcel, 2, polygonOptions.getPoints(), false);
        C0175b.m351c(parcel, 3, polygonOptions.mo5888eH(), false);
        C0175b.m332a(parcel, 4, polygonOptions.getStrokeWidth());
        C0175b.m350c(parcel, 5, polygonOptions.getStrokeColor());
        C0175b.m350c(parcel, 6, polygonOptions.getFillColor());
        C0175b.m332a(parcel, 7, polygonOptions.getZIndex());
        C0175b.m342a(parcel, 8, polygonOptions.isVisible());
        C0175b.m342a(parcel, 9, polygonOptions.isGeodesic());
        C0175b.m329D(parcel, o);
    }

    public PolygonOptions createFromParcel(Parcel parcel) {
        float f = 0.0f;
        boolean z = false;
        int n = C0173a.m313n(parcel);
        ArrayList arrayList = null;
        ArrayList arrayList2 = new ArrayList();
        boolean z2 = false;
        int i = 0;
        int i2 = 0;
        float f2 = 0.0f;
        int i3 = 0;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            switch (C0173a.m292M(m)) {
                case 1:
                    i3 = C0173a.m305g(parcel, m);
                    break;
                case 2:
                    arrayList = C0173a.m300c(parcel, m, LatLng.CREATOR);
                    break;
                case 3:
                    C0173a.m297a(parcel, m, (List) arrayList2, getClass().getClassLoader());
                    break;
                case 4:
                    f2 = C0173a.m308j(parcel, m);
                    break;
                case 5:
                    i2 = C0173a.m305g(parcel, m);
                    break;
                case 6:
                    i = C0173a.m305g(parcel, m);
                    break;
                case 7:
                    f = C0173a.m308j(parcel, m);
                    break;
                case 8:
                    z2 = C0173a.m301c(parcel, m);
                    break;
                case 9:
                    z = C0173a.m301c(parcel, m);
                    break;
                default:
                    C0173a.m298b(parcel, m);
                    break;
            }
        }
        if (parcel.dataPosition() == n) {
            return new PolygonOptions(i3, arrayList, arrayList2, f2, i2, i, f, z2, z);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }

    public PolygonOptions[] newArray(int size) {
        return new PolygonOptions[size];
    }
}
