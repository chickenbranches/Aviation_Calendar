package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;
import java.util.ArrayList;

public class ActivityRecognitionResultCreator implements Creator<ActivityRecognitionResult> {
    public static final int CONTENT_DESCRIPTION = 0;

    /* renamed from: a */
    static void m3021a(ActivityRecognitionResult activityRecognitionResult, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m349b(parcel, 1, activityRecognitionResult.f2424xm, false);
        C0175b.m350c(parcel, 1000, activityRecognitionResult.getVersionCode());
        C0175b.m333a(parcel, 2, activityRecognitionResult.f2425xn);
        C0175b.m333a(parcel, 3, activityRecognitionResult.f2426xo);
        C0175b.m329D(parcel, o);
    }

    public ActivityRecognitionResult createFromParcel(Parcel parcel) {
        long j = 0;
        int n = C0173a.m313n(parcel);
        int i = 0;
        ArrayList arrayList = null;
        long j2 = 0;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            switch (C0173a.m292M(m)) {
                case 1:
                    arrayList = C0173a.m300c(parcel, m, DetectedActivity.CREATOR);
                    break;
                case 2:
                    j2 = C0173a.m306h(parcel, m);
                    break;
                case 3:
                    j = C0173a.m306h(parcel, m);
                    break;
                case 1000:
                    i = C0173a.m305g(parcel, m);
                    break;
                default:
                    C0173a.m298b(parcel, m);
                    break;
            }
        }
        if (parcel.dataPosition() == n) {
            return new ActivityRecognitionResult(i, arrayList, j2, j);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }

    public ActivityRecognitionResult[] newArray(int size) {
        return new ActivityRecognitionResult[size];
    }
}
