package com.google.android.gms.drive;

import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.internal.C0249c;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.ArrayList;

public final class MetadataBuffer extends DataBuffer<Metadata> {

    /* renamed from: qS */
    private static final String[] f377qS;

    /* renamed from: qT */
    private final String f378qT;

    /* renamed from: com.google.android.gms.drive.MetadataBuffer$a */
    private static class C0177a extends Metadata {

        /* renamed from: nE */
        private final DataHolder f379nE;

        /* renamed from: nH */
        private final int f380nH;

        /* renamed from: qU */
        private final int f381qU;

        public C0177a(DataHolder dataHolder, int i) {
            this.f379nE = dataHolder;
            this.f381qU = i;
            this.f380nH = dataHolder.mo2371C(i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public <T> T mo2521a(MetadataField<T> metadataField) {
            return metadataField.mo2717c(this.f379nE, this.f381qU, this.f380nH);
        }

        /* renamed from: cK */
        public Metadata freeze() {
            MetadataBundle cX = MetadataBundle.m557cX();
            for (MetadataField a : C0249c.m575cW()) {
                a.mo2715a(this.f379nE, cX, this.f381qU, this.f380nH);
            }
            return new C0180b(cX);
        }

        public boolean isDataValid() {
            return !this.f379nE.isClosed();
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        for (MetadataField cV : C0249c.m575cW()) {
            arrayList.addAll(cV.mo2718cV());
        }
        f377qS = (String[]) arrayList.toArray(new String[0]);
    }

    public MetadataBuffer(DataHolder dataHolder, String nextPageToken) {
        super(dataHolder);
        this.f378qT = nextPageToken;
    }

    public Metadata get(int row) {
        return new C0177a(this.f299nE, row);
    }

    public String getNextPageToken() {
        return this.f378qT;
    }
}
