package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.he */
public class C0837he implements Creator<C0834hd> {
    /* renamed from: a */
    static void m2515a(C0834hd hdVar, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m339a(parcel, 1, hdVar.getId(), false);
        C0175b.m334a(parcel, 2, hdVar.mo4625ee(), false);
        C0175b.m337a(parcel, 3, (Parcelable) hdVar.mo4626ef(), i, false);
        C0175b.m337a(parcel, 4, (Parcelable) hdVar.mo4617dX(), i, false);
        C0175b.m332a(parcel, 5, hdVar.mo4618dY());
        C0175b.m337a(parcel, 6, (Parcelable) hdVar.mo4619dZ(), i, false);
        C0175b.m339a(parcel, 7, hdVar.mo4627eg(), false);
        C0175b.m337a(parcel, 8, (Parcelable) hdVar.mo4621ea(), i, false);
        C0175b.m342a(parcel, 9, hdVar.mo4622eb());
        C0175b.m332a(parcel, 10, hdVar.getRating());
        C0175b.m350c(parcel, 11, hdVar.mo4623ec());
        C0175b.m333a(parcel, 12, hdVar.mo4624ed());
        C0175b.m349b(parcel, 13, hdVar.mo4616dW(), false);
        C0175b.m350c(parcel, 1000, hdVar.f2100kg);
        C0175b.m329D(parcel, o);
    }

    /* renamed from: ao */
    public C0834hd createFromParcel(Parcel parcel) {
        int n = C0173a.m313n(parcel);
        int i = 0;
        String str = null;
        ArrayList arrayList = null;
        Bundle bundle = null;
        C0838hf hfVar = null;
        LatLng latLng = null;
        float f = 0.0f;
        LatLngBounds latLngBounds = null;
        String str2 = null;
        Uri uri = null;
        boolean z = false;
        float f2 = 0.0f;
        int i2 = 0;
        long j = 0;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            switch (C0173a.m292M(m)) {
                case 1:
                    str = C0173a.m312m(parcel, m);
                    break;
                case 2:
                    bundle = C0173a.m315o(parcel, m);
                    break;
                case 3:
                    hfVar = (C0838hf) C0173a.m294a(parcel, m, (Creator<T>) C0838hf.CREATOR);
                    break;
                case 4:
                    latLng = (LatLng) C0173a.m294a(parcel, m, (Creator<T>) LatLng.CREATOR);
                    break;
                case 5:
                    f = C0173a.m308j(parcel, m);
                    break;
                case 6:
                    latLngBounds = (LatLngBounds) C0173a.m294a(parcel, m, (Creator<T>) LatLngBounds.CREATOR);
                    break;
                case 7:
                    str2 = C0173a.m312m(parcel, m);
                    break;
                case 8:
                    uri = (Uri) C0173a.m294a(parcel, m, Uri.CREATOR);
                    break;
                case 9:
                    z = C0173a.m301c(parcel, m);
                    break;
                case 10:
                    f2 = C0173a.m308j(parcel, m);
                    break;
                case 11:
                    i2 = C0173a.m305g(parcel, m);
                    break;
                case 12:
                    j = C0173a.m306h(parcel, m);
                    break;
                case 13:
                    arrayList = C0173a.m300c(parcel, m, C0825gx.CREATOR);
                    break;
                case 1000:
                    i = C0173a.m305g(parcel, m);
                    break;
                default:
                    C0173a.m298b(parcel, m);
                    break;
            }
        }
        if (parcel.dataPosition() == n) {
            return new C0834hd(i, str, arrayList, bundle, hfVar, latLng, f, latLngBounds, str2, uri, z, f2, i2, j);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }

    /* renamed from: be */
    public C0834hd[] newArray(int i) {
        return new C0834hd[i];
    }
}
