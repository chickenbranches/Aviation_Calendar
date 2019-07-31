package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class CreateContentsRequest implements SafeParcelable {
    public static final Creator<CreateContentsRequest> CREATOR = new C0185c();

    /* renamed from: kg */
    final int f391kg;

    public CreateContentsRequest() {
        this(1);
    }

    CreateContentsRequest(int versionCode) {
        this.f391kg = versionCode;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        C0185c.m388a(this, dest, flags);
    }
}
