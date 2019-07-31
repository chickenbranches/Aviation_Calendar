package com.google.android.gms.drive.metadata.internal;

import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.internal.C0634fh;
import com.google.android.gms.internal.C0636fi;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.drive.metadata.internal.c */
public final class C0249c {

    /* renamed from: rE */
    private static Map<String, MetadataField<?>> f496rE = new HashMap();

    static {
        m574b(C0634fh.f1618rG);
        m574b(C0634fh.TITLE);
        m574b(C0634fh.MIME_TYPE);
        m574b(C0634fh.STARRED);
        m574b(C0634fh.TRASHED);
        m574b(C0634fh.f1619rH);
        m574b(C0634fh.f1620rI);
        m574b(C0634fh.PARENTS);
        m574b(C0636fi.f1623rL);
        m574b(C0636fi.f1621rJ);
        m574b(C0636fi.f1622rK);
        m574b(C0636fi.f1624rM);
    }

    /* renamed from: ac */
    public static MetadataField<?> m573ac(String str) {
        return (MetadataField) f496rE.get(str);
    }

    /* renamed from: b */
    private static void m574b(MetadataField<?> metadataField) {
        if (f496rE.containsKey(metadataField.getName())) {
            throw new IllegalArgumentException("Duplicate field name registered: " + metadataField.getName());
        }
        f496rE.put(metadataField.getName(), metadataField);
    }

    /* renamed from: cW */
    public static Collection<MetadataField<?>> m575cW() {
        return Collections.unmodifiableCollection(f496rE.values());
    }
}
