package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.internal.C0600eg;

public class CreateFolderRequest implements SafeParcelable {
    public static final Creator<CreateFolderRequest> CREATOR = new C0188f();

    /* renamed from: kg */
    final int f401kg;

    /* renamed from: qZ */
    final MetadataBundle f402qZ;

    /* renamed from: ra */
    final DriveId f403ra;

    CreateFolderRequest(int versionCode, DriveId parentDriveId, MetadataBundle metadata) {
        this.f401kg = versionCode;
        this.f403ra = (DriveId) C0600eg.m1554f(parentDriveId);
        this.f402qZ = (MetadataBundle) C0600eg.m1554f(metadata);
    }

    public CreateFolderRequest(DriveId parentDriveId, MetadataBundle metadata) {
        this(1, parentDriveId, metadata);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        C0188f.m397a(this, dest, flags);
    }
}
