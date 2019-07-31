package com.google.android.gms.drive.query.internal;

import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.Set;

/* renamed from: com.google.android.gms.drive.query.internal.d */
class C0257d {
    /* renamed from: b */
    static MetadataField<?> m603b(MetadataBundle metadataBundle) {
        Set cY = metadataBundle.mo2728cY();
        if (cY.size() == 1) {
            return (MetadataField) cY.iterator().next();
        }
        throw new IllegalArgumentException("bundle should have exactly 1 populated field");
    }
}
