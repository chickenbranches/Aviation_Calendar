package com.google.android.gms.drive.metadata;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.internal.C0600eg;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public abstract class MetadataField<T> {

    /* renamed from: rC */
    private final String f492rC;

    /* renamed from: rD */
    private final Set<String> f493rD;

    protected MetadataField(String fieldName) {
        this.f492rC = (String) C0600eg.m1552b(fieldName, (Object) "fieldName");
        this.f493rD = Collections.singleton(fieldName);
    }

    protected MetadataField(String fieldName, Collection<String> dataHolderFieldNames) {
        this.f492rC = (String) C0600eg.m1552b(fieldName, (Object) "fieldName");
        this.f493rD = Collections.unmodifiableSet(new HashSet(dataHolderFieldNames));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo2714a(Bundle bundle, T t);

    /* renamed from: a */
    public final void mo2715a(DataHolder dataHolder, MetadataBundle metadataBundle, int i, int i2) {
        C0600eg.m1552b(dataHolder, (Object) "dataHolder");
        C0600eg.m1552b(metadataBundle, (Object) "bundle");
        metadataBundle.mo2727b(this, mo2717c(dataHolder, i, i2));
    }

    /* renamed from: a */
    public final void mo2716a(T t, Bundle bundle) {
        C0600eg.m1552b(bundle, (Object) "bundle");
        if (t == null) {
            bundle.putString(getName(), null);
        } else {
            mo2714a(bundle, t);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract T mo2713b(DataHolder dataHolder, int i, int i2);

    /* renamed from: c */
    public final T mo2717c(DataHolder dataHolder, int i, int i2) {
        for (String hasNull : this.f493rD) {
            if (dataHolder.hasNull(hasNull, i, i2)) {
                return null;
            }
        }
        return mo2713b(dataHolder, i, i2);
    }

    /* renamed from: cV */
    public final Collection<String> mo2718cV() {
        return this.f493rD;
    }

    /* renamed from: d */
    public final T mo2719d(Bundle bundle) {
        C0600eg.m1552b(bundle, (Object) "bundle");
        if (bundle.get(getName()) != null) {
            return mo2720e(bundle);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract T mo2720e(Bundle bundle);

    public final String getName() {
        return this.f492rC;
    }

    public String toString() {
        return this.f492rC;
    }
}
