package com.google.android.gms.internal;

import android.os.Looper;
import android.text.TextUtils;

/* renamed from: com.google.android.gms.internal.eg */
public final class C0600eg {
    /* renamed from: N */
    public static void m1547N(String str) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: O */
    public static void m1548O(String str) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: U */
    public static String m1549U(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }

    /* renamed from: a */
    public static void m1550a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* renamed from: a */
    public static void m1551a(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    /* renamed from: b */
    public static <T> T m1552b(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: b */
    public static void m1553b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: f */
    public static <T> T m1554f(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException("null reference");
    }

    /* renamed from: p */
    public static void m1555p(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: r */
    public static void m1556r(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }
}
