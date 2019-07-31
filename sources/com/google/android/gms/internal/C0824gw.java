package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;
import com.google.android.gms.location.LocationRequest;

/* renamed from: com.google.android.gms.internal.gw */
public class C0824gw implements Creator<C0823gv> {
    /* renamed from: a */
    static void m2473a(C0823gv gvVar, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m337a(parcel, 1, (Parcelable) gvVar.mo4572dS(), i, false);
        C0175b.m350c(parcel, 1000, gvVar.f1943kg);
        C0175b.m337a(parcel, 2, (Parcelable) gvVar.mo4573dT(), i, false);
        C0175b.m329D(parcel, o);
    }

    /* renamed from: aZ */
    public C0823gv[] newArray(int i) {
        return new C0823gv[i];
    }

    /* renamed from: ak */
    public C0823gv createFromParcel(Parcel parcel) {
        C0821gt gtVar;
        LocationRequest locationRequest;
        int i;
        C0821gt gtVar2 = null;
        int n = C0173a.m313n(parcel);
        int i2 = 0;
        LocationRequest locationRequest2 = null;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            switch (C0173a.m292M(m)) {
                case 1:
                    i = i2;
                    LocationRequest locationRequest3 = (LocationRequest) C0173a.m294a(parcel, m, (Creator<T>) LocationRequest.CREATOR);
                    gtVar = gtVar2;
                    locationRequest = locationRequest3;
                    break;
                case 2:
                    gtVar = (C0821gt) C0173a.m294a(parcel, m, (Creator<T>) C0821gt.CREATOR);
                    locationRequest = locationRequest2;
                    i = i2;
                    break;
                case 1000:
                    C0821gt gtVar3 = gtVar2;
                    locationRequest = locationRequest2;
                    i = C0173a.m305g(parcel, m);
                    gtVar = gtVar3;
                    break;
                default:
                    C0173a.m298b(parcel, m);
                    gtVar = gtVar2;
                    locationRequest = locationRequest2;
                    i = i2;
                    break;
            }
            i2 = i;
            locationRequest2 = locationRequest;
            gtVar2 = gtVar;
        }
        if (parcel.dataPosition() == n) {
            return new C0823gv(i2, locationRequest2, gtVar2);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }
}
