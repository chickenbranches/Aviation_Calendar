package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C0596ee;

/* renamed from: com.google.android.gms.location.d */
public class C0972d implements SafeParcelable {
    public static final C0973e CREATOR = new C0973e();

    /* renamed from: kg */
    private final int f2450kg;

    /* renamed from: xG */
    int f2451xG;

    /* renamed from: xH */
    int f2452xH;

    /* renamed from: xI */
    long f2453xI;

    C0972d(int i, int i2, int i3, long j) {
        this.f2450kg = i;
        this.f2451xG = i2;
        this.f2452xH = i3;
        this.f2453xI = j;
    }

    /* renamed from: aQ */
    private String m3035aQ(int i) {
        switch (i) {
            case 0:
                return "STATUS_SUCCESSFUL";
            case 2:
                return "STATUS_TIMED_OUT_ON_SCAN";
            case 3:
                return "STATUS_NO_INFO_IN_DATABASE";
            case 4:
                return "STATUS_INVALID_SCAN";
            case 5:
                return "STATUS_UNABLE_TO_QUERY_DATABASE";
            case 6:
                return "STATUS_SCANS_DISABLED_IN_SETTINGS";
            case 7:
                return "STATUS_LOCATION_DISABLED_IN_SETTINGS";
            case 8:
                return "STATUS_IN_PROGRESS";
            default:
                return "STATUS_UNKNOWN";
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (!(other instanceof C0972d)) {
            return false;
        }
        C0972d dVar = (C0972d) other;
        return this.f2451xG == dVar.f2451xG && this.f2452xH == dVar.f2452xH && this.f2453xI == dVar.f2453xI;
    }

    /* access modifiers changed from: 0000 */
    public int getVersionCode() {
        return this.f2450kg;
    }

    public int hashCode() {
        return C0596ee.hashCode(Integer.valueOf(this.f2451xG), Integer.valueOf(this.f2452xH), Long.valueOf(this.f2453xI));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LocationStatus[cell status: ").append(m3035aQ(this.f2451xG));
        sb.append(", wifi status: ").append(m3035aQ(this.f2452xH));
        sb.append(", elapsed realtime ns: ").append(this.f2453xI);
        sb.append(']');
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int flags) {
        C0973e.m3036a(this, parcel, flags);
    }
}
