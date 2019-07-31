package com.google.android.gms.drive;

import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.internal.C0634fh;

public final class MetadataChangeSet {

    /* renamed from: qV */
    private final MetadataBundle f382qV;

    public static class Builder {

        /* renamed from: qV */
        private final MetadataBundle f383qV = MetadataBundle.m557cX();

        public MetadataChangeSet build() {
            return new MetadataChangeSet(this.f383qV);
        }

        public Builder setMimeType(String mimeType) {
            this.f383qV.mo2727b(C0634fh.MIME_TYPE, mimeType);
            return this;
        }

        public Builder setStarred(boolean starred) {
            this.f383qV.mo2727b(C0634fh.STARRED, Boolean.valueOf(starred));
            return this;
        }

        public Builder setTitle(String title) {
            this.f383qV.mo2727b(C0634fh.TITLE, title);
            return this;
        }
    }

    private MetadataChangeSet(MetadataBundle bag) {
        this.f382qV = MetadataBundle.m556a(bag);
    }

    /* renamed from: cM */
    public MetadataBundle mo2535cM() {
        return this.f382qV;
    }

    public String getMimeType() {
        return (String) this.f382qV.mo2726a(C0634fh.MIME_TYPE);
    }

    public String getTitle() {
        return (String) this.f382qV.mo2726a(C0634fh.TITLE);
    }

    public Boolean isStarred() {
        return (Boolean) this.f382qV.mo2726a(C0634fh.STARRED);
    }
}
