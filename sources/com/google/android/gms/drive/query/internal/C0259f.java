package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;
import java.util.List;

/* renamed from: com.google.android.gms.drive.query.internal.f */
public class C0259f implements Creator<LogicalFilter> {
    /* renamed from: a */
    static void m607a(LogicalFilter logicalFilter, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m350c(parcel, 1000, logicalFilter.f520kg);
        C0175b.m337a(parcel, 1, (Parcelable) logicalFilter.f522rR, i, false);
        C0175b.m349b(parcel, 2, logicalFilter.f523sb, false);
        C0175b.m329D(parcel, o);
    }

    /* renamed from: V */
    public LogicalFilter createFromParcel(Parcel parcel) {
        List c;
        Operator operator;
        int i;
        List list = null;
        int n = C0173a.m313n(parcel);
        int i2 = 0;
        Operator operator2 = null;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            switch (C0173a.m292M(m)) {
                case 1:
                    i = i2;
                    Operator operator3 = (Operator) C0173a.m294a(parcel, m, Operator.CREATOR);
                    c = list;
                    operator = operator3;
                    break;
                case 2:
                    c = C0173a.m300c(parcel, m, FilterHolder.CREATOR);
                    operator = operator2;
                    i = i2;
                    break;
                case 1000:
                    List list2 = list;
                    operator = operator2;
                    i = C0173a.m305g(parcel, m);
                    c = list2;
                    break;
                default:
                    C0173a.m298b(parcel, m);
                    c = list;
                    operator = operator2;
                    i = i2;
                    break;
            }
            i2 = i;
            operator2 = operator;
            list = c;
        }
        if (parcel.dataPosition() == n) {
            return new LogicalFilter(i2, operator2, list);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }

    /* renamed from: av */
    public LogicalFilter[] newArray(int i) {
        return new LogicalFilter[i];
    }
}
