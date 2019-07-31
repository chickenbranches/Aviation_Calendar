package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.query.Query;

public class QueryRequest implements SafeParcelable {
    public static final Creator<QueryRequest> CREATOR = new C0245y();

    /* renamed from: kg */
    final int f424kg;

    /* renamed from: rA */
    final Query f425rA;

    QueryRequest(int versionCode, Query query) {
        this.f424kg = versionCode;
        this.f425rA = query;
    }

    public QueryRequest(Query query) {
        this(1, query);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        C0245y.m535a(this, dest, flags);
    }
}
