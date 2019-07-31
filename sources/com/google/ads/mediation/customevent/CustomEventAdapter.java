package com.google.ads.mediation.customevent;

import android.app.Activity;
import android.view.View;
import com.google.ads.AdRequest.ErrorCode;
import com.google.ads.AdSize;
import com.google.ads.mediation.MediationAdRequest;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationBannerListener;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.customevent.CustomEventExtras;
import com.google.android.gms.internal.C0502ct;

public final class CustomEventAdapter implements MediationBannerAdapter<CustomEventExtras, CustomEventServerParameters>, MediationInterstitialAdapter<CustomEventExtras, CustomEventServerParameters> {

    /* renamed from: m */
    private View f15m;

    /* renamed from: n */
    private CustomEventBanner f16n;

    /* renamed from: o */
    private CustomEventInterstitial f17o;

    /* renamed from: com.google.ads.mediation.customevent.CustomEventAdapter$a */
    private static final class C0080a implements CustomEventBannerListener {

        /* renamed from: k */
        private final MediationBannerListener f18k;

        /* renamed from: p */
        private final CustomEventAdapter f19p;

        public C0080a(CustomEventAdapter customEventAdapter, MediationBannerListener mediationBannerListener) {
            this.f19p = customEventAdapter;
            this.f18k = mediationBannerListener;
        }

        public void onClick() {
            C0502ct.m1152r("Custom event adapter called onFailedToReceiveAd.");
            this.f18k.onClick(this.f19p);
        }

        public void onDismissScreen() {
            C0502ct.m1152r("Custom event adapter called onFailedToReceiveAd.");
            this.f18k.onDismissScreen(this.f19p);
        }

        public void onFailedToReceiveAd() {
            C0502ct.m1152r("Custom event adapter called onFailedToReceiveAd.");
            this.f18k.onFailedToReceiveAd(this.f19p, ErrorCode.NO_FILL);
        }

        public void onLeaveApplication() {
            C0502ct.m1152r("Custom event adapter called onFailedToReceiveAd.");
            this.f18k.onLeaveApplication(this.f19p);
        }

        public void onPresentScreen() {
            C0502ct.m1152r("Custom event adapter called onFailedToReceiveAd.");
            this.f18k.onPresentScreen(this.f19p);
        }

        public void onReceivedAd(View view) {
            C0502ct.m1152r("Custom event adapter called onReceivedAd.");
            this.f19p.m5a(view);
            this.f18k.onReceivedAd(this.f19p);
        }
    }

    /* renamed from: com.google.ads.mediation.customevent.CustomEventAdapter$b */
    private class C0081b implements CustomEventInterstitialListener {

        /* renamed from: l */
        private final MediationInterstitialListener f20l;

        /* renamed from: p */
        private final CustomEventAdapter f21p;

        public C0081b(CustomEventAdapter customEventAdapter, MediationInterstitialListener mediationInterstitialListener) {
            this.f21p = customEventAdapter;
            this.f20l = mediationInterstitialListener;
        }

        public void onDismissScreen() {
            C0502ct.m1152r("Custom event adapter called onDismissScreen.");
            this.f20l.onDismissScreen(this.f21p);
        }

        public void onFailedToReceiveAd() {
            C0502ct.m1152r("Custom event adapter called onFailedToReceiveAd.");
            this.f20l.onFailedToReceiveAd(this.f21p, ErrorCode.NO_FILL);
        }

        public void onLeaveApplication() {
            C0502ct.m1152r("Custom event adapter called onLeaveApplication.");
            this.f20l.onLeaveApplication(this.f21p);
        }

        public void onPresentScreen() {
            C0502ct.m1152r("Custom event adapter called onPresentScreen.");
            this.f20l.onPresentScreen(this.f21p);
        }

        public void onReceivedAd() {
            C0502ct.m1152r("Custom event adapter called onReceivedAd.");
            this.f20l.onReceivedAd(CustomEventAdapter.this);
        }
    }

    /* renamed from: a */
    private static <T> T m4a(String str) {
        try {
            return Class.forName(str).newInstance();
        } catch (Throwable th) {
            C0502ct.m1156v("Could not instantiate custom event adapter: " + str + ". " + th.getMessage());
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m5a(View view) {
        this.f15m = view;
    }

    public void destroy() {
        if (this.f16n != null) {
            this.f16n.destroy();
        }
        if (this.f17o != null) {
            this.f17o.destroy();
        }
    }

    public Class<CustomEventExtras> getAdditionalParametersType() {
        return CustomEventExtras.class;
    }

    public View getBannerView() {
        return this.f15m;
    }

    public Class<CustomEventServerParameters> getServerParametersType() {
        return CustomEventServerParameters.class;
    }

    public void requestBannerAd(MediationBannerListener listener, Activity activity, CustomEventServerParameters serverParameters, AdSize adSize, MediationAdRequest mediationAdRequest, CustomEventExtras customEventExtras) {
        this.f16n = (CustomEventBanner) m4a(serverParameters.className);
        if (this.f16n == null) {
            listener.onFailedToReceiveAd(this, ErrorCode.INTERNAL_ERROR);
        } else {
            this.f16n.requestBannerAd(new C0080a(this, listener), activity, serverParameters.label, serverParameters.parameter, adSize, mediationAdRequest, customEventExtras == null ? null : customEventExtras.getExtra(serverParameters.label));
        }
    }

    public void requestInterstitialAd(MediationInterstitialListener listener, Activity activity, CustomEventServerParameters serverParameters, MediationAdRequest mediationAdRequest, CustomEventExtras customEventExtras) {
        this.f17o = (CustomEventInterstitial) m4a(serverParameters.className);
        if (this.f17o == null) {
            listener.onFailedToReceiveAd(this, ErrorCode.INTERNAL_ERROR);
        } else {
            this.f17o.requestInterstitialAd(new C0081b(this, listener), activity, serverParameters.label, serverParameters.parameter, mediationAdRequest, customEventExtras == null ? null : customEventExtras.getExtra(serverParameters.label));
        }
    }

    public void showInterstitial() {
        this.f17o.showInterstitial();
    }
}
