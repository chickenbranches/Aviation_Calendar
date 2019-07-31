package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;

/* renamed from: com.google.android.gms.drive.query.internal.g */
public class C0260g implements Creator<NotFilter> {
    /* renamed from: a */
    static void m610a(NotFilter notFilter, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m350c(parcel, 1000, notFilter.f524kg);
        C0175b.m337a(parcel, 1, (Parcelable) notFilter.f525sc, i, false);
        C0175b.m329D(parcel, o);
    }

    /* renamed from: W */
    public NotFilter createFromParcel(Parcel parcel) {
        int n = C0173a.m313n(parcel);
        int i = 0;
        FilterHolder filterHolder = null;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            switch (C0173a.m292M(m)) {
                case 1:
                    filterHolder = (FilterHolder) C0173a.m294a(parcel, m, FilterHolder.CREATOR);
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
            return new NotFilter(i, filterHolder);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }

    /* renamed from: aw */
    public NotFilter[] newArray(int i) {
        return new NotFilter[i];
    }
}
