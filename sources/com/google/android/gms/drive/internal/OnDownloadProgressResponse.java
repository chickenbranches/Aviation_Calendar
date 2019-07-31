package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class OnDownloadProgressResponse implements SafeParcelable {
    public static final Creator<OnDownloadProgressResponse> CREATOR = new C0239s();

    /* renamed from: kg */
    final int f408kg;

    /* renamed from: rx */
    final long f409rx;

    /* renamed from: ry */
    final long f410ry;

    OnDownloadProgressResponse(int versionCode, long bytesLoaded, long bytesExpected) {
        this.f408kg = versionCode;
        this.f409rx = bytesLoaded;
        this.f410ry = bytesExpected;
    }

    /* renamed from: cR */
    public long mo2572cR() {
        return this.f409rx;
    }

    /* renamed from: cS */
    public long mo2573cS() {
        return this.f410ry;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        C0239s.m517a(this, dest, flags);
    }
}
