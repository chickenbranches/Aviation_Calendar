package com.google.android.gms.drive.query;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;
import com.google.android.gms.drive.query.internal.LogicalFilter;

/* renamed from: com.google.android.gms.drive.query.a */
public class C0253a implements Creator<Query> {
    /* renamed from: a */
    static void m591a(Query query, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m350c(parcel, 1000, query.f497kg);
        C0175b.m337a(parcel, 1, (Parcelable) query.f498rO, i, false);
        C0175b.m339a(parcel, 3, query.f499rP, false);
        C0175b.m329D(parcel, o);
    }

    /* renamed from: Q */
    public Query createFromParcel(Parcel parcel) {
        String m;
        LogicalFilter logicalFilter;
        int i;
        String str = null;
        int n = C0173a.m313n(parcel);
        int i2 = 0;
        LogicalFilter logicalFilter2 = null;
        while (parcel.dataPosition() < n) {
            int m2 = C0173a.m311m(parcel);
            switch (C0173a.m292M(m2)) {
                case 1:
                    i = i2;
                    LogicalFilter logicalFilter3 = (LogicalFilter) C0173a.m294a(parcel, m2, LogicalFilter.CREATOR);
                    m = str;
                    logicalFilter = logicalFilter3;
                    break;
                case 3:
                    m = C0173a.m312m(parcel, m2);
                    logicalFilter = logicalFilter2;
                    i = i2;
                    break;
                case 1000:
                    String str2 = str;
                    logicalFilter = logicalFilter2;
                    i = C0173a.m305g(parcel, m2);
                    m = str2;
                    break;
                default:
                    C0173a.m298b(parcel, m2);
                    m = str;
                    logicalFilter = logicalFilter2;
                    i = i2;
                    break;
            }
            i2 = i;
            logicalFilter2 = logicalFilter;
            str = m;
        }
        if (parcel.dataPosition() == n) {
            return new Query(i2, logicalFilter2, str);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }

    /* renamed from: aq */
    public Query[] newArray(int i) {
        return new Query[i];
    }
}
