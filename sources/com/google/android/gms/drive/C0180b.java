package com.google.android.gms.drive;

import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

/* renamed from: com.google.android.gms.drive.b */
public final class C0180b extends Metadata {

    /* renamed from: qN */
    private final MetadataBundle f387qN;

    public C0180b(MetadataBundle metadataBundle) {
        this.f387qN = metadataBundle;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public <T> T mo2521a(MetadataField<T> metadataField) {
        return this.f387qN.mo2726a(metadataField);
    }

    /* renamed from: cK */
    public Metadata freeze() {
        return new C0180b(MetadataBundle.m556a(this.f387qN));
    }

    public boolean isDataValid() {
        return this.f387qN != null;
    }

    public String toString() {
        return "Metadata [mImpl=" + this.f387qN + "]";
    }
}
