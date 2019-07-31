package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;

/* renamed from: com.google.android.gms.drive.metadata.internal.d */
public class C0250d implements Creator<MetadataBundle> {
    /* renamed from: a */
    static void m576a(MetadataBundle metadataBundle, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m350c(parcel, 1, metadataBundle.f494kg);
        C0175b.m334a(parcel, 2, metadataBundle.f495rF, false);
        C0175b.m329D(parcel, o);
    }

    /* renamed from: P */
    public MetadataBundle createFromParcel(Parcel parcel) {
        int n = C0173a.m313n(parcel);
        int i = 0;
        Bundle bundle = null;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            switch (C0173a.m292M(m)) {
                case 1:
                    i = C0173a.m305g(parcel, m);
                    break;
                case 2:
                    bundle = C0173a.m315o(parcel, m);
                    break;
                default:
                    C0173a.m298b(parcel, m);
                    break;
            }
        }
        if (parcel.dataPosition() == n) {
            return new MetadataBundle(i, bundle);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }

    /* renamed from: ap */
    public MetadataBundle[] newArray(int i) {
        return new MetadataBundle[i];
    }
}
