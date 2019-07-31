package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

public class OpenContentsRequest implements SafeParcelable {
    public static final Creator<OpenContentsRequest> CREATOR = new C0243w();

    /* renamed from: kg */
    final int f417kg;

    /* renamed from: qF */
    final int f418qF;

    /* renamed from: rr */
    final DriveId f419rr;

    OpenContentsRequest(int versionCode, DriveId id, int mode) {
        this.f417kg = versionCode;
        this.f419rr = id;
        this.f418qF = mode;
    }

    public OpenContentsRequest(DriveId id, int mode) {
        this(1, id, mode);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        C0243w.m529a(this, dest, flags);
    }
}
