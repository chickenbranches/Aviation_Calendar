package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class OnListEntriesResponse implements SafeParcelable {
    public static final Creator<OnListEntriesResponse> CREATOR = new C0241u();

    /* renamed from: kg */
    final int f413kg;

    /* renamed from: rz */
    final DataHolder f414rz;

    OnListEntriesResponse(int versionCode, DataHolder entries) {
        this.f413kg = versionCode;
        this.f414rz = entries;
    }

    /* renamed from: cT */
    public DataHolder mo2579cT() {
        return this.f414rz;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        C0241u.m523a(this, dest, flags);
    }
}
