package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.query.Filter;

public class FilterHolder implements SafeParcelable {
    public static final Creator<FilterHolder> CREATOR = new C0256c();

    /* renamed from: kg */
    final int f510kg;

    /* renamed from: rU */
    final ComparisonFilter<?> f511rU;

    /* renamed from: rV */
    final FieldOnlyFilter f512rV;

    /* renamed from: rW */
    final LogicalFilter f513rW;

    /* renamed from: rX */
    final NotFilter f514rX;

    /* renamed from: rY */
    final InFilter<?> f515rY;

    /* renamed from: rZ */
    private final Filter f516rZ;

    FilterHolder(int versionCode, ComparisonFilter<?> comparisonField, FieldOnlyFilter fieldOnlyFilter, LogicalFilter logicalFilter, NotFilter notFilter, InFilter<?> containsFilter) {
        this.f510kg = versionCode;
        this.f511rU = comparisonField;
        this.f512rV = fieldOnlyFilter;
        this.f513rW = logicalFilter;
        this.f514rX = notFilter;
        this.f515rY = containsFilter;
        if (this.f511rU != null) {
            this.f516rZ = this.f511rU;
        } else if (this.f512rV != null) {
            this.f516rZ = this.f512rV;
        } else if (this.f513rW != null) {
            this.f516rZ = this.f513rW;
        } else if (this.f514rX != null) {
            this.f516rZ = this.f514rX;
        } else if (this.f515rY != null) {
            this.f516rZ = this.f515rY;
        } else {
            throw new IllegalArgumentException("At least one filter must be set.");
        }
    }

    public FilterHolder(Filter filter) {
        this.f510kg = 1;
        this.f511rU = filter instanceof ComparisonFilter ? (ComparisonFilter) filter : null;
        this.f512rV = filter instanceof FieldOnlyFilter ? (FieldOnlyFilter) filter : null;
        this.f513rW = filter instanceof LogicalFilter ? (LogicalFilter) filter : null;
        this.f514rX = filter instanceof NotFilter ? (NotFilter) filter : null;
        this.f515rY = filter instanceof InFilter ? (InFilter) filter : null;
        if (this.f511rU == null && this.f512rV == null && this.f513rW == null && this.f514rX == null && this.f515rY == null) {
            throw new IllegalArgumentException("Invalid filter type or null filter.");
        }
        this.f516rZ = filter;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel out, int flags) {
        C0256c.m600a(this, out, flags);
    }
}
