package com.google.android.gms.internal;

import android.util.Base64;

/* renamed from: com.google.android.gms.internal.fb */
public final class C0628fb {
    /* renamed from: b */
    public static String m1695b(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 0);
    }

    /* renamed from: c */
    public static String m1696c(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 10);
    }
}
