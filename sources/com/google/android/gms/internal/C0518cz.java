package com.google.android.gms.internal;

import android.content.Context;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: com.google.android.gms.internal.cz */
public final class C0518cz extends C0507cx {
    public C0518cz(C0505cw cwVar, boolean z) {
        super(cwVar, z);
    }

    /* renamed from: d */
    private static WebResourceResponse m1195d(Context context, String str, String str2) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str2).openConnection();
        try {
            C0495co.m1112a(context, str, true, httpURLConnection);
            httpURLConnection.connect();
            return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(C0495co.m1106a((Readable) new InputStreamReader(httpURLConnection.getInputStream())).getBytes("UTF-8")));
        } finally {
            httpURLConnection.disconnect();
        }
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, String url) {
        try {
            if (!"mraid.js".equalsIgnoreCase(new File(url).getName())) {
                return super.shouldInterceptRequest(webView, url);
            }
            if (!(webView instanceof C0505cw)) {
                C0502ct.m1156v("Tried to intercept request from a WebView that wasn't an AdWebView.");
                return super.shouldInterceptRequest(webView, url);
            }
            C0505cw cwVar = (C0505cw) webView;
            cwVar.mo3676aC().mo3689Y();
            if (cwVar.mo3686y().f2419eG) {
                C0502ct.m1155u("shouldInterceptRequest(http://media.admob.com/mraid/v1/mraid_app_interstitial.js)");
                return m1195d(cwVar.getContext(), this.f1363gv.mo3678aE().f1346iJ, "http://media.admob.com/mraid/v1/mraid_app_interstitial.js");
            } else if (cwVar.mo3679aF()) {
                C0502ct.m1155u("shouldInterceptRequest(http://media.admob.com/mraid/v1/mraid_app_expanded_banner.js)");
                return m1195d(cwVar.getContext(), this.f1363gv.mo3678aE().f1346iJ, "http://media.admob.com/mraid/v1/mraid_app_expanded_banner.js");
            } else {
                C0502ct.m1155u("shouldInterceptRequest(http://media.admob.com/mraid/v1/mraid_app_banner.js)");
                return m1195d(cwVar.getContext(), this.f1363gv.mo3678aE().f1346iJ, "http://media.admob.com/mraid/v1/mraid_app_banner.js");
            }
        } catch (IOException e) {
            C0502ct.m1156v("Could not fetching MRAID JS. " + e.getMessage());
            return super.shouldInterceptRequest(webView, url);
        }
    }
}
