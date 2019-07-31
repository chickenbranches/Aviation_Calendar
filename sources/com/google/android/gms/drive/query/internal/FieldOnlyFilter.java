package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.drive.query.Filter;

public class FieldOnlyFilter implements SafeParcelable, Filter {
    public static final Creator<FieldOnlyFilter> CREATOR = new C0255b();

    /* renamed from: kg */
    final int f507kg;

    /* renamed from: rS */
    final MetadataBundle f508rS;

    /* renamed from: rT */
    private final MetadataField<?> f509rT;

    FieldOnlyFilter(int versionCode, MetadataBundle value) {
        this.f507kg = versionCode;
        this.f508rS = value;
        this.f509rT = C0257d.m603b(value);
    }

    public FieldOnlyFilter(MetadataField<?> field) {
        this(1, MetadataBundle.m555a(field, null));
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel out, int flags) {
        C0255b.m597a(this, out, flags);
    }
}
