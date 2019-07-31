package com.google.android.gms.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.CollectionMetadataField;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.StringMetadataField;
import com.google.android.gms.drive.metadata.internal.C0247a;
import com.google.android.gms.drive.metadata.internal.C0251e;
import com.google.android.gms.plus.PlusShare;

/* renamed from: com.google.android.gms.internal.fh */
public class C0634fh {
    public static final MetadataField<String> MIME_TYPE = new StringMetadataField("mimeType");
    public static final CollectionMetadataField<DriveId> PARENTS = new C0251e("parents");
    public static final MetadataField<Boolean> STARRED = new C0247a("starred");
    public static final MetadataField<String> TITLE = new StringMetadataField(PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE);
    public static final MetadataField<Boolean> TRASHED = new C0247a("trashed") {
        /* access modifiers changed from: protected */
        /* renamed from: e */
        public Boolean mo2713b(DataHolder dataHolder, int i, int i2) {
            return Boolean.valueOf(dataHolder.getInteger(getName(), i, i2) != 0);
        }
    };

    /* renamed from: rG */
    public static final MetadataField<DriveId> f1618rG = C0637fj.f1625rN;

    /* renamed from: rH */
    public static final MetadataField<Boolean> f1619rH = new C0247a("isEditable");

    /* renamed from: rI */
    public static final MetadataField<Boolean> f1620rI = new C0247a("isPinned");
}
