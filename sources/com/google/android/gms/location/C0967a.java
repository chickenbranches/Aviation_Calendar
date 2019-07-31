package com.google.android.gms.location;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* renamed from: com.google.android.gms.location.a */
public class C0967a implements SafeParcelable {
    public static final C0968b CREATOR = new C0968b();

    /* renamed from: kg */
    private final int f2447kg;

    /* renamed from: xr */
    private final PendingIntent f2448xr;

    public C0967a(int i, PendingIntent pendingIntent) {
        this.f2447kg = i;
        this.f2448xr = pendingIntent;
    }

    /* renamed from: dB */
    public PendingIntent mo5342dB() {
        return this.f2448xr;
    }

    public int describeContents() {
        C0968b bVar = CREATOR;
        return 0;
    }

    public int getVersionCode() {
        return this.f2447kg;
    }

    public void writeToParcel(Parcel dest, int flags) {
        C0968b bVar = CREATOR;
        C0968b.m3031a(this, dest, flags);
    }
}
