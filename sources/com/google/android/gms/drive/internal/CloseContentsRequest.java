package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.Contents;

public class CloseContentsRequest implements SafeParcelable {
    public static final Creator<CloseContentsRequest> CREATOR = new C0184b();

    /* renamed from: kg */
    final int f388kg;

    /* renamed from: qX */
    final Contents f389qX;

    /* renamed from: qY */
    final Boolean f390qY;

    CloseContentsRequest(int versionCode, Contents contentsReference, Boolean saveResults) {
        this.f388kg = versionCode;
        this.f389qX = contentsReference;
        this.f390qY = saveResults;
    }

    public CloseContentsRequest(Contents contentsReference, boolean saveResults) {
        this(1, contentsReference, Boolean.valueOf(saveResults));
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        C0184b.m385a(this, dest, flags);
    }
}
