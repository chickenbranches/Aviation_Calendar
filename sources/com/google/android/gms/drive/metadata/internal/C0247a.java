package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.MetadataField;

/* renamed from: com.google.android.gms.drive.metadata.internal.a */
public class C0247a extends MetadataField<Boolean> {
    public C0247a(String str) {
        super(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2714a(Bundle bundle, Boolean bool) {
        bundle.putBoolean(getName(), bool.booleanValue());
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public Boolean mo2713b(DataHolder dataHolder, int i, int i2) {
        return Boolean.valueOf(dataHolder.getBoolean(getName(), i, i2));
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public Boolean mo2720e(Bundle bundle) {
        return Boolean.valueOf(bundle.getBoolean(getName()));
    }
}
