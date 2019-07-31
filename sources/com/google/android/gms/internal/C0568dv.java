package com.google.android.gms.internal;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* renamed from: com.google.android.gms.internal.dv */
public abstract class C0568dv implements SafeParcelable {

    /* renamed from: pa */
    private static final Object f1503pa = new Object();

    /* renamed from: pb */
    private static ClassLoader f1504pb = null;

    /* renamed from: pc */
    private static Integer f1505pc = null;

    /* renamed from: pd */
    private boolean f1506pd = false;

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public static boolean m1408P(String str) {
        ClassLoader bL = m1410bL();
        if (bL == null) {
            return true;
        }
        try {
            return m1409a(bL.loadClass(str));
        } catch (Exception e) {
            return false;
        }
    }

    /* renamed from: a */
    private static boolean m1409a(Class<?> cls) {
        boolean z = false;
        try {
            return SafeParcelable.NULL.equals(cls.getField("NULL").get(null));
        } catch (IllegalAccessException | NoSuchFieldException e) {
            return z;
        }
    }

    /* renamed from: bL */
    protected static ClassLoader m1410bL() {
        ClassLoader classLoader;
        synchronized (f1503pa) {
            classLoader = f1504pb;
        }
        return classLoader;
    }

    /* access modifiers changed from: protected */
    /* renamed from: bM */
    public static Integer m1411bM() {
        Integer num;
        synchronized (f1503pa) {
            num = f1505pc;
        }
        return num;
    }

    /* access modifiers changed from: protected */
    /* renamed from: bN */
    public boolean mo3885bN() {
        return this.f1506pd;
    }
}
