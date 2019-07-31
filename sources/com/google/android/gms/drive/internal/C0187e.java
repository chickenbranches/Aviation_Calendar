package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

/* renamed from: com.google.android.gms.drive.internal.e */
public class C0187e implements Creator<CreateFileRequest> {
    /* renamed from: a */
    static void m394a(CreateFileRequest createFileRequest, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m350c(parcel, 1, createFileRequest.f397kg);
        C0175b.m337a(parcel, 2, (Parcelable) createFileRequest.f400ra, i, false);
        C0175b.m337a(parcel, 3, (Parcelable) createFileRequest.f399qZ, i, false);
        C0175b.m337a(parcel, 4, (Parcelable) createFileRequest.f398qX, i, false);
        C0175b.m329D(parcel, o);
    }

    /* renamed from: D */
    public CreateFileRequest createFromParcel(Parcel parcel) {
        Contents contents;
        MetadataBundle metadataBundle;
        DriveId driveId;
        int i;
        Contents contents2 = null;
        int n = C0173a.m313n(parcel);
        int i2 = 0;
        MetadataBundle metadataBundle2 = null;
        DriveId driveId2 = null;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            switch (C0173a.m292M(m)) {
                case 1:
                    Contents contents3 = contents2;
                    metadataBundle = metadataBundle2;
                    driveId = driveId2;
                    i = C0173a.m305g(parcel, m);
                    contents = contents3;
                    break;
                case 2:
                    i = i2;
                    MetadataBundle metadataBundle3 = metadataBundle2;
                    driveId = (DriveId) C0173a.m294a(parcel, m, DriveId.CREATOR);
                    contents = contents2;
                    metadataBundle = metadataBundle3;
                    break;
                case 3:
                    driveId = driveId2;
                    i = i2;
                    Contents contents4 = contents2;
                    metadataBundle = (MetadataBundle) C0173a.m294a(parcel, m, MetadataBundle.CREATOR);
                    contents = contents4;
                    break;
                case 4:
                    contents = (Contents) C0173a.m294a(parcel, m, Contents.CREATOR);
                    metadataBundle = metadataBundle2;
                    driveId = driveId2;
                    i = i2;
                    break;
                default:
                    C0173a.m298b(parcel, m);
                    contents = contents2;
                    metadataBundle = metadataBundle2;
                    driveId = driveId2;
                    i = i2;
                    break;
            }
            i2 = i;
            driveId2 = driveId;
            metadataBundle2 = metadataBundle;
            contents2 = contents;
        }
        if (parcel.dataPosition() == n) {
            return new CreateFileRequest(i2, driveId2, metadataBundle2, contents2);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }

    /* renamed from: ad */
    public CreateFileRequest[] newArray(int i) {
        return new CreateFileRequest[i];
    }
}
