package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;
import com.google.android.gms.drive.DriveId;

/* renamed from: com.google.android.gms.drive.internal.t */
public class C0240t implements Creator<OnDriveIdResponse> {
    /* renamed from: a */
    static void m520a(OnDriveIdResponse onDriveIdResponse, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m350c(parcel, 1, onDriveIdResponse.f411kg);
        C0175b.m337a(parcel, 2, (Parcelable) onDriveIdResponse.f412rr, i, false);
        C0175b.m329D(parcel, o);
    }

    /* renamed from: I */
    public OnDriveIdResponse createFromParcel(Parcel parcel) {
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
            return new OnDriveIdResponse(i, driveId);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }

    /* renamed from: ai */
    public OnDriveIdResponse[] newArray(int i) {
        return new OnDriveIdResponse[i];
    }
}
