package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class CreateFileIntentSenderRequest implements SafeParcelable {
    public static final Creator<CreateFileIntentSenderRequest> CREATOR = new C0186d();

    /* renamed from: kg */
    final int f392kg;

    /* renamed from: qE */
    final int f393qE;

    /* renamed from: qL */
    final String f394qL;

    /* renamed from: qM */
    final DriveId f395qM;

    /* renamed from: qZ */
    final MetadataBundle f396qZ;

    CreateFileIntentSenderRequest(int versionCode, MetadataBundle metadata, int requestId, String title, DriveId startFolder) {
        this.f392kg = versionCode;
        this.f396qZ = metadata;
        this.f393qE = requestId;
        this.f394qL = title;
        this.f395qM = startFolder;
    }

    public CreateFileIntentSenderRequest(MetadataBundle metadata, int requestId, String title, DriveId startFolder) {
        this(1, metadata, requestId, title, startFolder);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        C0186d.m391a(this, dest, flags);
    }
}
