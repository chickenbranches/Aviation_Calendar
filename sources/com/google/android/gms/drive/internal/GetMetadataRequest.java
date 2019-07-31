package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

public class GetMetadataRequest implements SafeParcelable {
    public static final Creator<GetMetadataRequest> CREATOR = new C0230n();

    /* renamed from: kg */
    final int f404kg;

    /* renamed from: rr */
    final DriveId f405rr;

    GetMetadataRequest(int versionCode, DriveId id) {
        this.f404kg = versionCode;
        this.f405rr = id;
    }

    public GetMetadataRequest(DriveId id) {
        this(1, id);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        C0230n.m470a(this, dest, flags);
    }
}
