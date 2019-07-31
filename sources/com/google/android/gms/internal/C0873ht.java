package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.view.View;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.dynamic.C0273c;
import com.google.android.gms.internal.C0857hp.C0858a;
import com.google.android.gms.plus.PlusOneDummyView;

/* renamed from: com.google.android.gms.internal.ht */
public final class C0873ht {

    /* renamed from: Ci */
    private static Context f2155Ci;

    /* renamed from: DQ */
    private static C0857hp f2156DQ;

    /* renamed from: com.google.android.gms.internal.ht$a */
    public static class C0874a extends Exception {
        public C0874a(String str) {
            super(str);
        }
    }

    /* renamed from: a */
    public static View m2637a(Context context, int i, int i2, String str, int i3) {
        if (str != null) {
            return (View) C0273c.m633b(m2639x(context).mo4694a(C0273c.m634h(context), i, i2, str, i3));
        }
        try {
            throw new NullPointerException();
        } catch (Exception e) {
            return new PlusOneDummyView(context, i);
        }
    }

    /* renamed from: a */
    public static View m2638a(Context context, int i, int i2, String str, String str2) {
        if (str != null) {
            return (View) C0273c.m633b(m2639x(context).mo4695a(C0273c.m634h(context), i, i2, str, str2));
        }
        try {
            throw new NullPointerException();
        } catch (Exception e) {
            return new PlusOneDummyView(context, i);
        }
    }

    /* renamed from: x */
    private static C0857hp m2639x(Context context) throws C0874a {
        C0600eg.m1554f(context);
        if (f2156DQ == null) {
            if (f2155Ci == null) {
                f2155Ci = GooglePlayServicesUtil.getRemoteContext(context);
                if (f2155Ci == null) {
                    throw new C0874a("Could not get remote context.");
                }
            }
            try {
                f2156DQ = C0858a.m2575av((IBinder) f2155Ci.getClassLoader().loadClass("com.google.android.gms.plus.plusone.PlusOneButtonCreatorImpl").newInstance());
            } catch (ClassNotFoundException e) {
                throw new C0874a("Could not load creator class.");
            } catch (InstantiationException e2) {
                throw new C0874a("Could not instantiate creator.");
            } catch (IllegalAccessException e3) {
                throw new C0874a("Could not access creator.");
            }
        }
        return f2156DQ;
    }
}
