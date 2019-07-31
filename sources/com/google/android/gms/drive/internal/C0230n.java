package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;
import com.google.android.gms.drive.DriveId;

/* renamed from: com.google.android.gms.drive.internal.n */
public class C0230n implements Creator<GetMetadataRequest> {
    /* renamed from: a */
    static void m470a(GetMetadataRequest getMetadataRequest, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m350c(parcel, 1, getMetadataRequest.f404kg);
        C0175b.m337a(parcel, 2, (Parcelable) getMetadataRequest.f405rr, i, false);
        C0175b.m329D(parcel, o);
    }

    /* renamed from: F */
    public GetMetadataRequest createFromParcel(Parcel parcel) {
        int n = C0173a.m313n(parcel);
        int i = 0;
        DriveId driveId = null;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            switch (C0173a.m292M(m)) {
                case 1:
                    i = C0173a.m305g(parcel, m);
                    break;
                case 2:
                    driveId = (DriveId) C0173a.m294a(parcel, m, DriveId.CREATOR);
                    break;
                default:
                    C0173a.m298b(parcel, m);
                    break;
            }
        }
        if (parcel.dataPosition() == n) {
            return new GetMetadataRequest(i, driveId);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }

    /* renamed from: af */
    public GetMetadataRequest[] newArray(int i) {
        return new GetMetadataRequest[i];
    }
}
