package com.google.android.gms.internal;

import android.content.Context;
import android.webkit.WebSettings;

/* renamed from: com.google.android.gms.internal.cq */
public final class C0499cq {
    /* renamed from: a */
    public static void m1138a(Context context, WebSettings webSettings) {
        C0498cp.m1132a(context, webSettings);
        webSettings.setMediaPlaybackRequiresUserGesture(false);
    }

    public static String getDefaultUserAgent(Context context) {
        return WebSettings.getDefaultUserAgent(context);
    }
}
