package com.google.android.gms.internal;

import android.util.Log;

/* renamed from: com.google.android.gms.internal.dk */
public class C0550dk {

    /* renamed from: mb */
    private static boolean f1445mb = false;
    private String mTag;

    /* renamed from: mc */
    private boolean f1446mc;

    /* renamed from: md */
    private boolean f1447md;

    public C0550dk(String str) {
        this(str, m1343bc());
    }

    public C0550dk(String str, boolean z) {
        this.mTag = str;
        this.f1446mc = z;
    }

    /* renamed from: bc */
    public static boolean m1343bc() {
        return f1445mb;
    }

    /* renamed from: a */
    public void mo3815a(String str, Object... objArr) {
        if (this.f1447md) {
            Log.v(this.mTag, String.format(str, objArr));
        }
    }

    /* renamed from: b */
    public void mo3816b(String str, Object... objArr) {
        if (this.f1446mc || f1445mb) {
            Log.d(this.mTag, String.format(str, objArr));
        }
    }

    /* renamed from: c */
    public void mo3817c(String str, Object... objArr) {
        Log.i(this.mTag, String.format(str, objArr));
    }

    /* renamed from: d */
    public void mo3818d(String str, Object... objArr) {
        Log.w(this.mTag, String.format(str, objArr));
    }
}
