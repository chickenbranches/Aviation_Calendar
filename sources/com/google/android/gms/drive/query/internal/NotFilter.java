package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.query.Filter;

public class NotFilter implements SafeParcelable, Filter {
    public static final Creator<NotFilter> CREATOR = new C0260g();

    /* renamed from: kg */
    final int f524kg;

    /* renamed from: sc */
    final FilterHolder f525sc;

    NotFilter(int versionCode, FilterHolder toNegate) {
        this.f524kg = versionCode;
        this.f525sc = toNegate;
    }

    public NotFilter(Filter toNegate) {
        this(1, new FilterHolder(toNegate));
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel out, int flags) {
        C0260g.m610a(this, out, flags);
    }
}
