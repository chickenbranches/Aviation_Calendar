package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;

public class DetectedActivityCreator implements Creator<DetectedActivity> {
    public static final int CONTENT_DESCRIPTION = 0;

    /* renamed from: a */
    static void m3023a(DetectedActivity detectedActivity, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m350c(parcel, 1, detectedActivity.f2428xp);
        C0175b.m350c(parcel, 1000, detectedActivity.getVersionCode());
        C0175b.m350c(parcel, 2, detectedActivity.f2429xq);
        C0175b.m329D(parcel, o);
    }

    public DetectedActivity createFromParcel(Parcel parcel) {
        int i = 0;
        int n = C0173a.m313n(parcel);
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            switch (C0173a.m292M(m)) {
                case 1:
                    i2 = C0173a.m305g(parcel, m);
                    break;
                case 2:
                    i = C0173a.m305g(parcel, m);
                    break;
                case 1000:
                    i3 = C0173a.m305g(parcel, m);
                    break;
                default:
                    C0173a.m298b(parcel, m);
                    break;
            }
        }
        if (parcel.dataPosition() == n) {
            return new DetectedActivity(i3, i2, i);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }

    public DetectedActivity[] newArray(int size) {
        return new DetectedActivity[size];
    }
}
