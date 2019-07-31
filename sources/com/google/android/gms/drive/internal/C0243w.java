package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;
import com.google.android.gms.drive.DriveId;

/* renamed from: com.google.android.gms.drive.internal.w */
public class C0243w implements Creator<OpenContentsRequest> {
    /* renamed from: a */
    static void m529a(OpenContentsRequest openContentsRequest, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m350c(parcel, 1, openContentsRequest.f417kg);
        C0175b.m337a(parcel, 2, (Parcelable) openContentsRequest.f419rr, i, false);
        C0175b.m350c(parcel, 3, openContentsRequest.f418qF);
        C0175b.m329D(parcel, o);
    }

    /* renamed from: L */
    public OpenContentsRequest createFromParcel(Parcel parcel) {
        int g;
        DriveId driveId;
        int i;
        int i2 = 0;
        int n = C0173a.m313n(parcel);
        DriveId driveId2 = null;
        int i3 = 0;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            switch (C0173a.m292M(m)) {
                case 1:
                    int i4 = i2;
                    driveId = driveId2;
                    i = C0173a.m305g(parcel, m);
                    g = i4;
                    break;
                case 2:
                    i = i3;
                    DriveId driveId3 = (DriveId) C0173a.m294a(parcel, m, DriveId.CREATOR);
                    g = i2;
                    driveId = driveId3;
                    break;
                case 3:
                    g = C0173a.m305g(parcel, m);
                    driveId = driveId2;
                    i = i3;
                    break;
                default:
                    C0173a.m298b(parcel, m);
                    g = i2;
                    driveId = driveId2;
                    i = i3;
                    break;
            }
            i3 = i;
            driveId2 = driveId;
            i2 = g;
        }
        if (parcel.dataPosition() == n) {
            return new OpenContentsRequest(i3, driveId2, i2);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }

    /* renamed from: al */
    public OpenContentsRequest[] newArray(int i) {
        return new OpenContentsRequest[i];
    }
}
