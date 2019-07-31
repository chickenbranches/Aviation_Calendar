package com.google.android.gms.dynamic;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.internal.C0600eg;

/* renamed from: com.google.android.gms.dynamic.e */
public abstract class C0275e<T> {

    /* renamed from: sF */
    private final String f564sF;

    /* renamed from: sG */
    private T f565sG;

    /* renamed from: com.google.android.gms.dynamic.e$a */
    public static class C0276a extends Exception {
        public C0276a(String str) {
            super(str);
        }

        public C0276a(String str, Throwable th) {
            super(str, th);
        }
    }

    protected C0275e(String str) {
        this.f564sF = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract T mo2842d(IBinder iBinder);

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final T mo2843t(Context context) throws C0276a {
        if (this.f565sG == null) {
            C0600eg.m1554f(context);
            Context remoteContext = GooglePlayServicesUtil.getRemoteContext(context);
            if (remoteContext == null) {
                throw new C0276a("Could not get remote context.");
            }
            try {
                this.f565sG = mo2842d((IBinder) remoteContext.getClassLoader().loadClass(this.f564sF).newInstance());
            } catch (ClassNotFoundException e) {
                throw new C0276a("Could not load creator class.");
            } catch (InstantiationException e2) {
                throw new C0276a("Could not instantiate creator.");
            } catch (IllegalAccessException e3) {
                throw new C0276a("Could not access creator.");
            }
        }
        return this.f565sG;
    }
}
