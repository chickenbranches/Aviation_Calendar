package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class OnMetadataResponse implements SafeParcelable {
    public static final Creator<OnMetadataResponse> CREATOR = new C0242v();

    /* renamed from: kg */
    final int f415kg;

    /* renamed from: qZ */
    final MetadataBundle f416qZ;

    OnMetadataResponse(int versionCode, MetadataBundle metadata) {
        this.f415kg = versionCode;
        this.f416qZ = metadata;
    }

    /* renamed from: cU */
    public MetadataBundle mo2582cU() {
        return this.f416qZ;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        C0242v.m526a(this, dest, flags);
    }
}
