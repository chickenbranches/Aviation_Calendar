package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.drive.query.Filter;

public class ComparisonFilter<T> implements SafeParcelable, Filter {
    public static final C0254a CREATOR = new C0254a();

    /* renamed from: kg */
    final int f503kg;

    /* renamed from: rR */
    final Operator f504rR;

    /* renamed from: rS */
    final MetadataBundle f505rS;

    /* renamed from: rT */
    final MetadataField<T> f506rT;

    ComparisonFilter(int versionCode, Operator operator, MetadataBundle value) {
        this.f503kg = versionCode;
        this.f504rR = operator;
        this.f505rS = value;
        this.f506rT = C0257d.m603b(value);
    }

    public ComparisonFilter(Operator operator, MetadataField<T> field, T value) {
        this(1, operator, MetadataBundle.m555a(field, value));
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel out, int flags) {
        C0254a.m594a(this, out, flags);
    }
}
