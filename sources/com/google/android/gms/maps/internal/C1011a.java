package com.google.android.gms.maps.internal;

/* renamed from: com.google.android.gms.maps.internal.a */
public final class C1011a {
    /* renamed from: a */
    public static Boolean m3087a(byte b) {
        switch (b) {
            case 0:
                return Boolean.FALSE;
            case 1:
                return Boolean.TRUE;
            default:
                return null;
        }
    }

    /* renamed from: c */
    public static byte m3088c(Boolean bool) {
        if (bool != null) {
            return bool.booleanValue() ? (byte) 1 : 0;
        }
        return -1;
    }
}
