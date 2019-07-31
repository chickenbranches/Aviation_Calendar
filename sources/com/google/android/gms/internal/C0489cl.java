package com.google.android.gms.internal;

import android.content.Context;
import android.text.TextUtils;
import java.math.BigInteger;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.cl */
public final class C0489cl {

    /* renamed from: hC */
    private static final Object f1329hC = new Object();

    /* renamed from: iw */
    private static String f1330iw;

    /* renamed from: as */
    public static String m1101as() {
        String str;
        synchronized (f1329hC) {
            str = f1330iw;
        }
        return str;
    }

    /* renamed from: b */
    public static String m1102b(Context context, String str, String str2) {
        String str3;
        synchronized (f1329hC) {
            if (f1330iw == null && !TextUtils.isEmpty(str)) {
                m1103c(context, str, str2);
            }
            str3 = f1330iw;
        }
        return str3;
    }

    /* renamed from: c */
    private static void m1103c(Context context, String str, String str2) {
        try {
            ClassLoader classLoader = context.createPackageContext(str2, 3).getClassLoader();
            Class cls = Class.forName("com.google.ads.mediation.MediationAdapter", false, classLoader);
            BigInteger bigInteger = new BigInteger(new byte[1]);
            String[] split = str.split(",");
            BigInteger bigInteger2 = bigInteger;
            for (int i = 0; i < split.length; i++) {
                if (C0495co.m1117a(classLoader, cls, split[i])) {
                    bigInteger2 = bigInteger2.setBit(i);
                }
            }
            f1330iw = String.format(Locale.US, "%X", new Object[]{bigInteger2});
        } catch (Throwable th) {
            f1330iw = "err";
        }
    }
}
