package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;
import com.google.android.gms.drive.DriveId;

/* renamed from: com.google.android.gms.drive.internal.x */
public class C0244x implements Creator<OpenFileIntentSenderRequest> {
    /* renamed from: a */
    static void m532a(OpenFileIntentSenderRequest openFileIntentSenderRequest, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m350c(parcel, 1, openFileIntentSenderRequest.f420kg);
        C0175b.m339a(parcel, 2, openFileIntentSenderRequest.f421qL, false);
        C0175b.m346a(parcel, 3, openFileIntentSenderRequest.f423qW, false);
        C0175b.m337a(parcel, 4, (Parcelable) openFileIntentSenderRequest.f422qM, i, false);
        C0175b.m329D(parcel, o);
    }

    /* renamed from: M */
    public OpenFileIntentSenderRequest createFromParcel(Parcel parcel) {
        DriveId driveId = null;
        int n = C0173a.m313n(parcel);
        int i = 0;
        String[] strArr = null;
        String str = null;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            switch (C0173a.m292M(m)) {
                case 1:
                    i = C0173a.m305g(parcel, m);
                    break;
                case 2:
                    str = C0173a.m312m(parcel, m);
                    break;
                case 3:
                    strArr = C0173a.m324x(parcel, m);
                    break;
                case 4:
                    driveId = (DriveId) C0173a.m294a(parcel, m, DriveId.CREATOR);
                    break;
                default:
                    C0173a.m298b(parcel, m);
                    break;
            }
        }
        if (parcel.dataPosition() == n) {
            return new OpenFileIntentSenderRequest(i, str, strArr, driveId);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }

    /* renamed from: am */
    public OpenFileIntentSenderRequest[] newArray(int i) {
        return new OpenFileIntentSenderRequest[i];
    }
}
