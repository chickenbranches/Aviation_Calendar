package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;

/* renamed from: com.google.android.gms.drive.query.internal.c */
public class C0256c implements Creator<FilterHolder> {
    /* renamed from: a */
    static void m600a(FilterHolder filterHolder, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m337a(parcel, 1, (Parcelable) filterHolder.f511rU, i, false);
        C0175b.m350c(parcel, 1000, filterHolder.f510kg);
        C0175b.m337a(parcel, 2, (Parcelable) filterHolder.f512rV, i, false);
        C0175b.m337a(parcel, 3, (Parcelable) filterHolder.f513rW, i, false);
        C0175b.m337a(parcel, 4, (Parcelable) filterHolder.f514rX, i, false);
        C0175b.m337a(parcel, 5, (Parcelable) filterHolder.f515rY, i, false);
        C0175b.m329D(parcel, o);
    }

    /* renamed from: T */
    public FilterHolder createFromParcel(Parcel parcel) {
        InFilter inFilter = null;
        int n = C0173a.m313n(parcel);
        int i = 0;
        NotFilter notFilter = null;
        LogicalFilter logicalFilter = null;
        FieldOnlyFilter fieldOnlyFilter = null;
        ComparisonFilter comparisonFilter = null;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            switch (C0173a.m292M(m)) {
                case 1:
                    comparisonFilter = (ComparisonFilter) C0173a.m294a(parcel, m, (Creator<T>) ComparisonFilter.CREATOR);
                    break;
                case 2:
                    fieldOnlyFilter = (FieldOnlyFilter) C0173a.m294a(parcel, m, FieldOnlyFilter.CREATOR);
                    break;
                case 3:
                    logicalFilter = (LogicalFilter) C0173a.m294a(parcel, m, LogicalFilter.CREATOR);
                    break;
                case 4:
                    notFilter = (NotFilter) C0173a.m294a(parcel, m, NotFilter.CREATOR);
                    break;
                case 5:
                    inFilter = (InFilter) C0173a.m294a(parcel, m, (Creator<T>) InFilter.CREATOR);
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
            return new FilterHolder(i, comparisonFilter, fieldOnlyFilter, logicalFilter, notFilter, inFilter);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }

    /* renamed from: at */
    public FilterHolder[] newArray(int i) {
        return new FilterHolder[i];
    }
}
