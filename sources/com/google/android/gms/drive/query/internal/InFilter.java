package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.metadata.CollectionMetadataField;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.drive.query.Filter;
import java.util.Collections;

public class InFilter<T> implements SafeParcelable, Filter {
    public static final C0258e CREATOR = new C0258e();

    /* renamed from: kg */
    final int f517kg;

    /* renamed from: rS */
    final MetadataBundle f518rS;

    /* renamed from: sa */
    private final CollectionMetadataField<T> f519sa;

    InFilter(int versionCode, MetadataBundle value) {
        this.f517kg = versionCode;
        this.f518rS = value;
        this.f519sa = (CollectionMetadataField) C0257d.m603b(value);
    }

    public InFilter(CollectionMetadataField<T> field, T value) {
        this(1, MetadataBundle.m555a(field, Collections.singleton(value)));
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel out, int flags) {
        C0258e.m604a(this, out, flags);
    }
}
