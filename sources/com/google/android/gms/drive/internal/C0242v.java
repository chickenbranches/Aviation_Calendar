package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

/* renamed from: com.google.android.gms.drive.internal.v */
public class C0242v implements Creator<OnMetadataResponse> {
    /* renamed from: a */
    static void m526a(OnMetadataResponse onMetadataResponse, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m350c(parcel, 1, onMetadataResponse.f415kg);
        C0175b.m337a(parcel, 2, (Parcelable) onMetadataResponse.f416qZ, i, false);
        C0175b.m329D(parcel, o);
    }

    /* renamed from: K */
    public OnMetadataResponse createFromParcel(Parcel parcel) {
        int n = C0173a.m313n(parcel);
        int i = 0;
        MetadataBundle metadataBundle = null;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            switch (C0173a.m292M(m)) {
                case 1:
                    i = C0173a.m305g(parcel, m);
                    break;
                case 2:
                    metadataBundle = (MetadataBundle) C0173a.m294a(parcel, m, MetadataBundle.CREATOR);
                    break;
                default:
                    C0173a.m298b(parcel, m);
                    break;
            }
        }
        if (parcel.dataPosition() == n) {
            return new OnMetadataResponse(i, metadataBundle);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }

    /* renamed from: ak */
    public OnMetadataResponse[] newArray(int i) {
        return new OnMetadataResponse[i];
    }
}
