package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.drive.metadata.MetadataField;
import java.util.Collection;

/* renamed from: com.google.android.gms.drive.metadata.internal.f */
public abstract class C0252f<T extends Parcelable> extends MetadataField<T> {
    public C0252f(String str, Collection<String> collection) {
        super(str, collection);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2714a(Bundle bundle, T t) {
        bundle.putParcelable(getName(), t);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public T mo2720e(Bundle bundle) {
        return bundle.getParcelable(getName());
    }
}
