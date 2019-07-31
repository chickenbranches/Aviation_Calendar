package com.google.android.gms.drive.query;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.query.internal.LogicalFilter;
import com.google.android.gms.drive.query.internal.Operator;
import java.util.ArrayList;
import java.util.List;

public class Query implements SafeParcelable {
    public static final Creator<Query> CREATOR = new C0253a();

    /* renamed from: kg */
    final int f497kg;

    /* renamed from: rO */
    LogicalFilter f498rO;

    /* renamed from: rP */
    String f499rP;

    public static class Builder {

        /* renamed from: rP */
        private String f500rP;

        /* renamed from: rQ */
        private final List<Filter> f501rQ = new ArrayList();

        public Builder addFilter(Filter filter) {
            this.f501rQ.add(filter);
            return this;
        }

        public Query build() {
            return new Query(new LogicalFilter(Operator.f531si, this.f501rQ), this.f500rP);
        }

        public Builder setPageToken(String token) {
            this.f500rP = token;
            return this;
        }
    }

    Query(int versionCode, LogicalFilter clause, String pageToken) {
        this.f497kg = versionCode;
        this.f498rO = clause;
        this.f499rP = pageToken;
    }

    Query(LogicalFilter clause, String pageToken) {
        this(1, clause, pageToken);
    }

    public int describeContents() {
        return 0;
    }

    public Filter getFilter() {
        return this.f498rO;
    }

    public String getPageToken() {
        return this.f499rP;
    }

    public void writeToParcel(Parcel out, int flags) {
        C0253a.m591a(this, out, flags);
    }
}
