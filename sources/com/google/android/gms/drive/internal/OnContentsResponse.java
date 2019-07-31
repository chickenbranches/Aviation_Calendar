package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.Contents;

public class OnContentsResponse implements SafeParcelable {
    public static final Creator<OnContentsResponse> CREATOR = new C0238r();

    /* renamed from: kg */
    final int f406kg;

    /* renamed from: qK */
    final Contents f407qK;

    OnContentsResponse(int versionCode, Contents contents) {
        this.f406kg = versionCode;
        this.f407qK = contents;
    }

    /* renamed from: cQ */
    public Contents mo2569cQ() {
        return this.f407qK;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        C0238r.m514a(this, dest, flags);
    }
}
