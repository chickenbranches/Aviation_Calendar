package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

public class OnDriveIdResponse implements SafeParcelable {
    public static final Creator<OnDriveIdResponse> CREATOR = new C0240t();

    /* renamed from: kg */
    final int f411kg;

    /* renamed from: rr */
    DriveId f412rr;

    OnDriveIdResponse(int versionCode, DriveId driveId) {
        this.f411kg = versionCode;
        this.f412rr = driveId;
    }

    public int describeContents() {
        return 0;
    }

    public DriveId getDriveId() {
        return this.f412rr;
    }

    public void writeToParcel(Parcel dest, int flags) {
        C0240t.m520a(this, dest, flags);
    }
}
