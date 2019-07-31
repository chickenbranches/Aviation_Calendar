package com.google.android.gms.drive;

import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.internal.C0634fh;
import com.google.android.gms.internal.C0636fi;
import java.util.Date;

public abstract class Metadata implements Freezable<Metadata> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract <T> T mo2521a(MetadataField<T> metadataField);

    public Date getCreatedDate() {
        return (Date) mo2521a(C0636fi.f1623rL);
    }

    public DriveId getDriveId() {
        return (DriveId) mo2521a(C0634fh.f1618rG);
    }

    public String getMimeType() {
        return (String) mo2521a(C0634fh.MIME_TYPE);
    }

    public Date getModifiedByMeDate() {
        return (Date) mo2521a(C0636fi.f1622rK);
    }

    public Date getModifiedDate() {
        return (Date) mo2521a(C0636fi.f1621rJ);
    }

    public Date getSharedWithMeDate() {
        return (Date) mo2521a(C0636fi.f1624rM);
    }

    public String getTitle() {
        return (String) mo2521a(C0634fh.TITLE);
    }

    public boolean isEditable() {
        Boolean bool = (Boolean) mo2521a(C0634fh.f1619rH);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public boolean isFolder() {
        return DriveFolder.MIME_TYPE.equals(getMimeType());
    }

    public boolean isStarred() {
        Boolean bool = (Boolean) mo2521a(C0634fh.STARRED);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public boolean isTrashed() {
        Boolean bool = (Boolean) mo2521a(C0634fh.TRASHED);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }
}
