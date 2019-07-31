package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

/* renamed from: com.google.android.gms.drive.internal.aa */
public class C0183aa implements Creator<UpdateMetadataRequest> {
    /* renamed from: a */
    static void m382a(UpdateMetadataRequest updateMetadataRequest, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m350c(parcel, 1, updateMetadataRequest.f426kg);
        C0175b.m337a(parcel, 2, (Parcelable) updateMetadataRequest.f428rr, i, false);
        C0175b.m337a(parcel, 3, (Parcelable) updateMetadataRequest.f427rB, i, false);
        C0175b.m329D(parcel, o);
    }

    /* renamed from: O */
    public UpdateMetadataRequest createFromParcel(Parcel parcel) {
        MetadataBundle metadataBundle;
        DriveId driveId;
        int i;
        MetadataBundle metadataBundle2 = null;
        int n = C0173a.m313n(parcel);
        int i2 = 0;
        DriveId driveId2 = null;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            switch (C0173a.m292M(m)) {
                case 1:
                    MetadataBundle metadataBundle3 = metadataBundle2;
                    driveId = driveId2;
                    i = C0173a.m305g(parcel, m);
                    metadataBundle = metadataBundle3;
                    break;
                case 2:
                    i = i2;
                    DriveId driveId3 = (DriveId) C0173a.m294a(parcel, m, DriveId.CREATOR);
                    metadataBundle = metadataBundle2;
                    driveId = driveId3;
                    break;
                case 3:
                    metadataBundle = (MetadataBundle) C0173a.m294a(parcel, m, MetadataBundle.CREATOR);
                    driveId = driveId2;
                    i = i2;
                    break;
                default:
                    C0173a.m298b(parcel, m);
                    metadataBundle = metadataBundle2;
                    driveId = driveId2;
                    i = i2;
                    break;
            }
            i2 = i;
            driveId2 = driveId;
            metadataBundle2 = metadataBundle;
        }
        if (parcel.dataPosition() == n) {
            return new UpdateMetadataRequest(i2, driveId2, metadataBundle2);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }

    /* renamed from: ao */
    public UpdateMetadataRequest[] newArray(int i) {
        return new UpdateMetadataRequest[i];
    }
}
