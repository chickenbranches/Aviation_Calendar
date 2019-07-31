package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;

public class StatusCreator implements Creator<Status> {
    public static final int CONTENT_DESCRIPTION = 0;

    /* renamed from: a */
    static void m217a(Status status, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m350c(parcel, 1, status.getStatusCode());
        C0175b.m350c(parcel, 1000, status.getVersionCode());
        C0175b.m339a(parcel, 2, status.mo2343bt(), false);
        C0175b.m337a(parcel, 3, (Parcelable) status.mo2342bs(), i, false);
        C0175b.m329D(parcel, o);
    }

    public Status createFromParcel(Parcel parcel) {
        PendingIntent pendingIntent = null;
        int i = 0;
        int n = C0173a.m313n(parcel);
        String str = null;
        int i2 = 0;
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
                    pendingIntent = (PendingIntent) C0173a.m294a(parcel, m, PendingIntent.CREATOR);
                    break;
                case 1000:
                    i2 = C0173a.m305g(parcel, m);
                    break;
                default:
                    C0173a.m298b(parcel, m);
                    break;
            }
        }
        if (parcel.dataPosition() == n) {
            return new Status(i2, i, str, pendingIntent);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }

    public Status[] newArray(int size) {
        return new Status[size];
    }
}
