package com.google.android.gms.internal;

import android.util.Log;

/* renamed from: com.google.android.gms.internal.ea */
public final class C0586ea {

    /* renamed from: pM */
    private final String f1553pM;

    public C0586ea(String str) {
        this.f1553pM = (String) C0600eg.m1554f(str);
    }

    /* renamed from: K */
    public boolean mo3938K(int i) {
        return Log.isLoggable(this.f1553pM, i);
    }

    /* renamed from: a */
    public void mo3939a(String str, String str2, Throwable th) {
        if (mo3938K(6)) {
            Log.e(str, str2, th);
        }
    }

    /* renamed from: c */
    public void mo3940c(String str, String str2) {
        if (mo3938K(5)) {
            Log.w(str, str2);
        }
    }

    /* renamed from: d */
    public void mo3941d(String str, String str2) {
        if (mo3938K(6)) {
            Log.e(str, str2);
        }
    }
}
