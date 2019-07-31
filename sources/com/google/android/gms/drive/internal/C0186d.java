package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

/* renamed from: com.google.android.gms.drive.internal.d */
public class C0186d implements Creator<CreateFileIntentSenderRequest> {
    /* renamed from: a */
    static void m391a(CreateFileIntentSenderRequest createFileIntentSenderRequest, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m350c(parcel, 1, createFileIntentSenderRequest.f392kg);
        C0175b.m337a(parcel, 2, (Parcelable) createFileIntentSenderRequest.f396qZ, i, false);
        C0175b.m350c(parcel, 3, createFileIntentSenderRequest.f393qE);
        C0175b.m339a(parcel, 4, createFileIntentSenderRequest.f394qL, false);
        C0175b.m337a(parcel, 5, (Parcelable) createFileIntentSenderRequest.f395qM, i, false);
        C0175b.m329D(parcel, o);
    }

    /* renamed from: C */
    public CreateFileIntentSenderRequest createFromParcel(Parcel parcel) {
        int i = 0;
        DriveId driveId = null;
        int n = C0173a.m313n(parcel);
        String str = null;
        MetadataBundle metadataBundle = null;
        int i2 = 0;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            switch (C0173a.m292M(m)) {
                case 1:
                    i2 = C0173a.m305g(parcel, m);
                    break;
                case 2:
                    metadataBundle = (MetadataBundle) C0173a.m294a(parcel, m, MetadataBundle.CREATOR);
                    break;
                case 3:
                    i = C0173a.m305g(parcel, m);
                    break;
                case 4:
                    str = C0173a.m312m(parcel, m);
                    break;
                case 5:
                    driveId = (DriveId) C0173a.m294a(parcel, m, DriveId.CREATOR);
                    break;
                default:
                    C0173a.m298b(parcel, m);
                    break;
            }
        }
        if (parcel.dataPosition() == n) {
            return new CreateFileIntentSenderRequest(i2, metadataBundle, i, str, driveId);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }

    /* renamed from: ac */
    public CreateFileIntentSenderRequest[] newArray(int i) {
        return new CreateFileIntentSenderRequest[i];
    }
}
