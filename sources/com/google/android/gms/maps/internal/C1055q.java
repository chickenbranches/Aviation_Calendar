package com.google.android.gms.maps.internal;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.dynamic.C0273c;
import com.google.android.gms.internal.C0600eg;
import com.google.android.gms.maps.internal.C1015c.C1016a;
import com.google.android.gms.maps.model.RuntimeRemoteException;

/* renamed from: com.google.android.gms.maps.internal.q */
public class C1055q {

    /* renamed from: Ci */
    private static Context f2544Ci;

    /* renamed from: Cj */
    private static C1015c f2545Cj;

    /* renamed from: a */
    private static <T> T m3136a(ClassLoader classLoader, String str) {
        try {
            return m3137c(((ClassLoader) C0600eg.m1554f(classLoader)).loadClass(str));
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException("Unable to find dynamic class " + str);
        }
    }

    /* renamed from: c */
    private static <T> T m3137c(Class<?> cls) {
        try {
            return cls.newInstance();
        } catch (InstantiationException e) {
            throw new IllegalStateException("Unable to instantiate the dynamic class " + cls.getName());
        } catch (IllegalAccessException e2) {
            throw new IllegalStateException("Unable to call the default constructor of " + cls.getName());
        }
    }

    /* renamed from: eB */
    private static boolean m3138eB() {
        return false;
    }

    /* renamed from: eC */
    private static Class<?> m3139eC() {
        try {
            return VERSION.SDK_INT < 15 ? Class.forName("com.google.android.gms.maps.internal.CreatorImplGmm6") : Class.forName("com.google.android.gms.maps.internal.CreatorImpl");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static Context getRemoteContext(Context context) {
        if (f2544Ci == null) {
            if (m3138eB()) {
                f2544Ci = context;
            } else {
                f2544Ci = GooglePlayServicesUtil.getRemoteContext(context);
            }
        }
        return f2544Ci;
    }

    /* renamed from: u */
    public static C1015c m3140u(Context context) throws GooglePlayServicesNotAvailableException {
        C0600eg.m1554f(context);
        if (f2545Cj != null) {
            return f2545Cj;
        }
        m3141v(context);
        f2545Cj = m3142w(context);
        try {
            f2545Cj.mo5645a(C0273c.m634h(getRemoteContext(context).getResources()), (int) GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE);
            return f2545Cj;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: v */
    private static void m3141v(Context context) throws GooglePlayServicesNotAvailableException {
        int isGooglePlayServicesAvailable = GooglePlayServicesUtil.isGooglePlayServicesAvailable(context);
        switch (isGooglePlayServicesAvailable) {
            case 0:
                return;
            default:
                throw new GooglePlayServicesNotAvailableException(isGooglePlayServicesAvailable);
        }
    }

    /* renamed from: w */
    private static C1015c m3142w(Context context) {
        if (!m3138eB()) {
            return C1016a.m3096Q((IBinder) m3136a(getRemoteContext(context).getClassLoader(), "com.google.android.gms.maps.internal.CreatorImpl"));
        }
        Log.i(C1055q.class.getSimpleName(), "Making Creator statically");
        return (C1015c) m3137c(m3139eC());
    }
}
