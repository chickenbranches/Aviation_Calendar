package com.google.android.gms.drive.internal;

import com.google.android.gms.drive.Metadata;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

/* renamed from: com.google.android.gms.drive.internal.g */
public final class C0189g extends Metadata {

    /* renamed from: qN */
    private final MetadataBundle f429qN;

    public C0189g(MetadataBundle metadataBundle) {
        this.f429qN = metadataBundle;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public <T> T mo2521a(MetadataField<T> metadataField) {
        return this.f429qN.mo2726a(metadataField);
    }

    /* renamed from: cK */
    public Metadata freeze() {
        return new C0189g(MetadataBundle.m556a(this.f429qN));
    }

    public boolean isDataValid() {
        return this.f429qN != null;
    }

    public String toString() {
        return "Metadata [mImpl=" + this.f429qN + "]";
    }
}
