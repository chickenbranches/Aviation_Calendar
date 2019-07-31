package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.internal.C0600eg;

public class CreateFileRequest implements SafeParcelable {
    public static final Creator<CreateFileRequest> CREATOR = new C0187e();

    /* renamed from: kg */
    final int f397kg;

    /* renamed from: qX */
    final Contents f398qX;

    /* renamed from: qZ */
    final MetadataBundle f399qZ;

    /* renamed from: ra */
    final DriveId f400ra;

    CreateFileRequest(int versionCode, DriveId parentDriveId, MetadataBundle metadata, Contents contentsReference) {
        this.f397kg = versionCode;
        this.f400ra = (DriveId) C0600eg.m1554f(parentDriveId);
        this.f399qZ = (MetadataBundle) C0600eg.m1554f(metadata);
        this.f398qX = (Contents) C0600eg.m1554f(contentsReference);
    }

    public CreateFileRequest(DriveId parentDriveId, MetadataBundle metadata, Contents contentsReference) {
        this(1, parentDriveId, metadata, contentsReference);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        C0187e.m394a(this, dest, flags);
    }
}
