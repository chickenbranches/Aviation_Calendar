package com.google.ads.mediation.jsadapter;

import android.text.TextUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.C0502ct;
import java.net.URI;
import java.net.URISyntaxException;

public final class BannerWebViewClient extends WebViewClient {

    /* renamed from: A */
    private final String f32A;

    /* renamed from: B */
    private boolean f33B = false;

    /* renamed from: r */
    private final JavascriptAdapter f34r;

    public BannerWebViewClient(JavascriptAdapter adapter, String passbackUrl) {
        this.f32A = m15c(passbackUrl);
        this.f34r = adapter;
    }

    /* renamed from: b */
    private boolean m14b(String str) {
        String c = m15c(str);
        if (TextUtils.isEmpty(c)) {
            return false;
        }
        try {
            URI uri = new URI(c);
            if ("passback".equals(uri.getScheme())) {
                C0502ct.m1152r("Passback received");
                this.f34r.sendAdNotReceivedUpdate();
                return true;
            } else if (TextUtils.isEmpty(this.f32A)) {
                return false;
            } else {
                URI uri2 = new URI(this.f32A);
                String host = uri2.getHost();
                String host2 = uri.getHost();
                String path = uri2.getPath();
                String path2 = uri.getPath();
                if (!equals(host, host2) || !equals(path, path2)) {
                    return false;
                }
                C0502ct.m1152r("Passback received");
                this.f34r.sendAdNotReceivedUpdate();
                return true;
            }
        } catch (URISyntaxException e) {
            C0502ct.m1153s(e.getMessage());
            return false;
        }
    }

    /* renamed from: c */
    private String m15c(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return str.endsWith("/") ? str.substring(0, str.length() - 1) : str;
        } catch (IndexOutOfBoundsException e) {
            C0502ct.m1153s(e.getMessage());
            return str;
        }
    }

    private static boolean equals(Object obj1, Object obj2) {
        return obj1 == obj2 || (obj1 != null && obj1.equals(obj2));
    }

    public void onLoadResource(WebView view, String url) {
        C0502ct.m1155u("onLoadResource: " + url);
        if (!m14b(url)) {
            super.onLoadResource(view, url);
        }
    }

    public void onPageFinished(WebView view, String url) {
        C0502ct.m1155u("onPageFinished: " + url);
        super.onPageFinished(view, url);
        if (!this.f33B) {
            this.f34r.startCheckingForAd();
            this.f33B = true;
        }
    }

    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        C0502ct.m1155u("shouldOverrideUrlLoading: " + url);
        if (!m14b(url)) {
            return false;
        }
        C0502ct.m1152r("shouldOverrideUrlLoading: received passback url");
        return true;
    }
}
