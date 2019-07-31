package com.google.ads.mediation.jsadapter;

import android.app.Activity;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.google.ads.AdRequest.ErrorCode;
import com.google.ads.AdSize;
import com.google.ads.mediation.EmptyNetworkExtras;
import com.google.ads.mediation.MediationAdRequest;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationBannerListener;
import com.google.android.gms.internal.C0502ct;

public final class JavascriptAdapter implements MediationBannerAdapter<EmptyNetworkExtras, JavascriptServerParameters> {

    /* renamed from: C */
    private WebView f35C;

    /* renamed from: D */
    private FrameLayout f36D;

    /* renamed from: E */
    private boolean f37E;

    /* renamed from: k */
    private MediationBannerListener f38k;

    /* renamed from: v */
    private int f39v;

    /* renamed from: w */
    private int f40w;

    public void destroy() {
        this.f37E = true;
    }

    public Class<EmptyNetworkExtras> getAdditionalParametersType() {
        return EmptyNetworkExtras.class;
    }

    public View getBannerView() {
        return this.f36D;
    }

    public Class<JavascriptServerParameters> getServerParametersType() {
        return JavascriptServerParameters.class;
    }

    public WebView getWebView() {
        return this.f35C;
    }

    public int getWebViewHeight() {
        return this.f39v;
    }

    public int getWebViewWidth() {
        return this.f40w;
    }

    public void passbackReceived() {
        C0502ct.m1152r("Passback received");
        sendAdNotReceivedUpdate();
    }

    public void requestBannerAd(MediationBannerListener listener, Activity activity, JavascriptServerParameters serverParameters, AdSize adSize, MediationAdRequest mediationAdRequest, EmptyNetworkExtras extras) {
        this.f38k = listener;
        this.f39v = serverParameters.height != null ? serverParameters.height.intValue() : adSize.getHeightInPixels(activity);
        this.f40w = serverParameters.width != null ? serverParameters.width.intValue() : adSize.getWidthInPixels(activity);
        this.f37E = false;
        this.f35C = new WebView(activity);
        this.f35C.getSettings().setJavaScriptEnabled(true);
        this.f35C.setWebViewClient(new BannerWebViewClient(this, serverParameters.passBackUrl));
        this.f35C.setBackgroundColor(0);
        this.f36D = new FrameLayout(activity);
        this.f36D.addView(this.f35C, new LayoutParams(this.f40w, this.f39v, 17));
        this.f35C.loadDataWithBaseURL(null, serverParameters.htmlScript, "text/html", "utf-8", null);
    }

    public void sendAdNotReceivedUpdate() {
        if (!this.f37E) {
            this.f37E = true;
            this.f38k.onFailedToReceiveAd(this, ErrorCode.NO_FILL);
        }
    }

    public void sendAdReceivedUpdate() {
        if (!this.f37E) {
            this.f37E = true;
            this.f38k.onReceivedAd(this);
        }
    }

    public boolean shouldStopAdCheck() {
        return this.f37E;
    }

    public void startCheckingForAd() {
        new AdViewCheckTask(this, 200, 100).start();
    }
}
