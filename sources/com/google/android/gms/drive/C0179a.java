package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;

/* renamed from: com.google.android.gms.drive.a */
public class C0179a implements Creator<Contents> {
    /* renamed from: a */
    static void m363a(Contents contents, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m350c(parcel, 1, contents.f360kg);
        C0175b.m337a(parcel, 2, (Parcelable) contents.f361om, i, false);
        C0175b.m350c(parcel, 3, contents.f362qE);
        C0175b.m350c(parcel, 4, contents.f363qF);
        C0175b.m337a(parcel, 5, (Parcelable) contents.f364qG, i, false);
        C0175b.m329D(parcel, o);
    }

    /* renamed from: Y */
    public Contents[] newArray(int i) {
        return new Contents[i];
    }

    /* renamed from: y */
    public Contents createFromParcel(Parcel parcel) {
        DriveId driveId = null;
        int i = 0;
        int n = C0173a.m313n(parcel);
        int i2 = 0;
        ParcelFileDescriptor parcelFileDescriptor = null;
        int i3 = 0;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            switch (C0173a.m292M(m)) {
                case 1:
                    i3 = C0173a.m305g(parcel, m);
                    break;
                case 2:
                    parcelFileDescriptor = (ParcelFileDescriptor) C0173a.m294a(parcel, m, ParcelFileDescriptor.CREATOR);
                    break;
                case 3:
                    i2 = C0173a.m305g(parcel, m);
                    break;
                case 4:
                    i = C0173a.m305g(parcel, m);
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
            return new Contents(i3, parcelFileDescriptor, i2, i, driveId);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }
}
