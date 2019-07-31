package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

/* renamed from: com.google.android.gms.drive.query.internal.a */
public class C0254a implements Creator<ComparisonFilter> {
    /* renamed from: a */
    static void m594a(ComparisonFilter comparisonFilter, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m350c(parcel, 1000, comparisonFilter.f503kg);
        C0175b.m337a(parcel, 1, (Parcelable) comparisonFilter.f504rR, i, false);
        C0175b.m337a(parcel, 2, (Parcelable) comparisonFilter.f505rS, i, false);
        C0175b.m329D(parcel, o);
    }

    /* renamed from: R */
    public ComparisonFilter createFromParcel(Parcel parcel) {
        MetadataBundle metadataBundle;
        Operator operator;
        int i;
        MetadataBundle metadataBundle2 = null;
        int n = C0173a.m313n(parcel);
        int i2 = 0;
        Operator operator2 = null;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            switch (C0173a.m292M(m)) {
                case 1:
                    i = i2;
                    Operator operator3 = (Operator) C0173a.m294a(parcel, m, Operator.CREATOR);
                    metadataBundle = metadataBundle2;
                    operator = operator3;
                    break;
                case 2:
                    metadataBundle = (MetadataBundle) C0173a.m294a(parcel, m, MetadataBundle.CREATOR);
                    operator = operator2;
                    i = i2;
                    break;
                case 1000:
                    MetadataBundle metadataBundle3 = metadataBundle2;
                    operator = operator2;
                    i = C0173a.m305g(parcel, m);
                    metadataBundle = metadataBundle3;
                    break;
                default:
                    C0173a.m298b(parcel, m);
                    metadataBundle = metadataBundle2;
                    operator = operator2;
                    i = i2;
                    break;
            }
            i2 = i;
            operator2 = operator;
            metadataBundle2 = metadataBundle;
        }
        if (parcel.dataPosition() == n) {
            return new ComparisonFilter(i2, operator2, metadataBundle2);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }

    /* renamed from: ar */
    public ComparisonFilter[] newArray(int i) {
        return new ComparisonFilter[i];
    }
}
