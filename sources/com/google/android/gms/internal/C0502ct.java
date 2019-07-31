package com.google.android.gms.internal;

import android.util.Log;
import com.google.ads.AdRequest;

/* renamed from: com.google.android.gms.internal.ct */
public final class C0502ct {
    /* renamed from: a */
    public static void m1149a(String str, Throwable th) {
        if (m1151n(3)) {
            Log.d(AdRequest.LOGTAG, str, th);
        }
    }

    /* renamed from: b */
    public static void m1150b(String str, Throwable th) {
        if (m1151n(5)) {
            Log.w(AdRequest.LOGTAG, str, th);
        }
    }

    /* renamed from: n */
    public static boolean m1151n(int i) {
        return (i >= 5 || Log.isLoggable(AdRequest.LOGTAG, i)) && i != 2;
    }

    /* renamed from: r */
    public static void m1152r(String str) {
        if (m1151n(3)) {
            Log.d(AdRequest.LOGTAG, str);
        }
    }

    /* renamed from: s */
    public static void m1153s(String str) {
        if (m1151n(6)) {
            Log.e(AdRequest.LOGTAG, str);
        }
    }

    /* renamed from: t */
    public static void m1154t(String str) {
        if (m1151n(4)) {
            Log.i(AdRequest.LOGTAG, str);
        }
    }

    /* renamed from: u */
    public static void m1155u(String str) {
        if (m1151n(2)) {
            Log.v(AdRequest.LOGTAG, str);
        }
    }

    /* renamed from: v */
    public static void m1156v(String str) {
        if (m1151n(5)) {
            Log.w(AdRequest.LOGTAG, str);
        }
    }
}
