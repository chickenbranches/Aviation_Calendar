package com.google.android.gms.drive.query;

import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.CollectionMetadataField;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.OrderedMetadataField;
import com.google.android.gms.internal.C0634fh;
import com.google.android.gms.internal.C0636fi;
import java.util.Date;

public class SearchableField {
    public static final MetadataField<String> MIME_TYPE = C0634fh.MIME_TYPE;
    public static final OrderedMetadataField<Date> MODIFIED_DATE = C0636fi.f1621rJ;
    public static final CollectionMetadataField<DriveId> PARENTS = C0634fh.PARENTS;
    public static final MetadataField<Boolean> STARRED = C0634fh.STARRED;
    public static final MetadataField<String> TITLE = C0634fh.TITLE;
    public static final MetadataField<Boolean> TRASHED = C0634fh.TRASHED;

    /* renamed from: rM */
    public static final OrderedMetadataField<Date> f502rM = C0636fi.f1624rM;
}
