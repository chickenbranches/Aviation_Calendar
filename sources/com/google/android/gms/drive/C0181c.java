package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;

/* renamed from: com.google.android.gms.drive.c */
public class C0181c implements Creator<DriveId> {
    /* renamed from: a */
    static void m368a(DriveId driveId, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m350c(parcel, 1, driveId.f372kg);
        C0175b.m339a(parcel, 2, driveId.f373qO, false);
        C0175b.m333a(parcel, 3, driveId.f374qP);
        C0175b.m333a(parcel, 4, driveId.f375qQ);
        C0175b.m329D(parcel, o);
    }

    /* renamed from: Z */
    public DriveId[] newArray(int i) {
        return new DriveId[i];
    }

    /* renamed from: z */
    public DriveId createFromParcel(Parcel parcel) {
        long j = 0;
        int n = C0173a.m313n(parcel);
        int i = 0;
        String str = null;
        long j2 = 0;
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
                    j2 = C0173a.m306h(parcel, m);
                    break;
                case 4:
                    j = C0173a.m306h(parcel, m);
                    break;
                default:
                    C0173a.m298b(parcel, m);
                    break;
            }
        }
        if (parcel.dataPosition() == n) {
            return new DriveId(i, str, j2, j);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }
}
