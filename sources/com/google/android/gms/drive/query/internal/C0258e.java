package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

/* renamed from: com.google.android.gms.drive.query.internal.e */
public class C0258e implements Creator<InFilter> {
    /* renamed from: a */
    static void m604a(InFilter inFilter, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m350c(parcel, 1000, inFilter.f517kg);
        C0175b.m337a(parcel, 1, (Parcelable) inFilter.f518rS, i, false);
        C0175b.m329D(parcel, o);
    }

    /* renamed from: U */
    public InFilter createFromParcel(Parcel parcel) {
        int n = C0173a.m313n(parcel);
        int i = 0;
        MetadataBundle metadataBundle = null;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            switch (C0173a.m292M(m)) {
                case 1:
                    metadataBundle = (MetadataBundle) C0173a.m294a(parcel, m, MetadataBundle.CREATOR);
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
            return new InFilter(i, metadataBundle);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }

    /* renamed from: au */
    public InFilter[] newArray(int i) {
        return new InFilter[i];
    }
}
