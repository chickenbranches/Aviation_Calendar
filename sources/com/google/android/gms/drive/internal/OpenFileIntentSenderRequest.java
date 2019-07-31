package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

public class OpenFileIntentSenderRequest implements SafeParcelable {
    public static final Creator<OpenFileIntentSenderRequest> CREATOR = new C0244x();

    /* renamed from: kg */
    final int f420kg;

    /* renamed from: qL */
    final String f421qL;

    /* renamed from: qM */
    final DriveId f422qM;

    /* renamed from: qW */
    final String[] f423qW;

    OpenFileIntentSenderRequest(int versionCode, String title, String[] mimeTypes, DriveId startFolder) {
        this.f420kg = versionCode;
        this.f421qL = title;
        this.f423qW = mimeTypes;
        this.f422qM = startFolder;
    }

    public OpenFileIntentSenderRequest(String title, String[] mimeTypes, DriveId startFolder) {
        this(1, title, mimeTypes, startFolder);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        C0244x.m532a(this, dest, flags);
    }
}
