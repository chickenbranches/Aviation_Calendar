package com.google.android.gms.internal;

import android.content.Context;
import android.support.p000v4.view.ViewCompat;
import android.view.View;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.io.File;

/* renamed from: com.google.android.gms.internal.cp */
public final class C0498cp {
    /* renamed from: a */
    public static void m1132a(Context context, WebSettings webSettings) {
        webSettings.setAppCachePath(new File(context.getCacheDir(), "com.google.android.gms.ads.appcache").getAbsolutePath());
        webSettings.setAppCacheMaxSize(0);
        webSettings.setAppCacheEnabled(true);
        webSettings.setDatabasePath(context.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath());
        webSettings.setDatabaseEnabled(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setDisplayZoomControls(false);
        webSettings.setBuiltInZoomControls(true);
        webSettings.setSupportZoom(true);
    }

    /* renamed from: a */
    public static void m1133a(Window window) {
        window.setFlags(ViewCompat.MEASURED_STATE_TOO_SMALL, ViewCompat.MEASURED_STATE_TOO_SMALL);
    }

    /* renamed from: a */
    public static void m1134a(WebView webView) {
        webView.onPause();
    }

    /* renamed from: b */
    public static void m1135b(WebView webView) {
        webView.onResume();
    }

    /* renamed from: c */
    public static void m1136c(View view) {
        view.setLayerType(1, null);
    }

    /* renamed from: d */
    public static void m1137d(View view) {
        view.setLayerType(0, null);
    }
}
