package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;
import com.google.android.gms.drive.query.Query;

/* renamed from: com.google.android.gms.drive.internal.y */
public class C0245y implements Creator<QueryRequest> {
    /* renamed from: a */
    static void m535a(QueryRequest queryRequest, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m350c(parcel, 1, queryRequest.f424kg);
        C0175b.m337a(parcel, 2, (Parcelable) queryRequest.f425rA, i, false);
        C0175b.m329D(parcel, o);
    }

    /* renamed from: N */
    public QueryRequest createFromParcel(Parcel parcel) {
        int n = C0173a.m313n(parcel);
        int i = 0;
        Query query = null;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            switch (C0173a.m292M(m)) {
                case 1:
                    i = C0173a.m305g(parcel, m);
                    break;
                case 2:
                    query = (Query) C0173a.m294a(parcel, m, Query.CREATOR);
                    break;
                default:
                    C0173a.m298b(parcel, m);
                    break;
            }
        }
        if (parcel.dataPosition() == n) {
            return new QueryRequest(i, query);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }

    /* renamed from: an */
    public QueryRequest[] newArray(int i) {
        return new QueryRequest[i];
    }
}
