package com.google.ads.mediation.admob;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.google.ads.AdRequest.Gender;
import com.google.ads.AdSize;
import com.google.ads.mediation.MediationAdRequest;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationBannerListener;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdRequest.Builder;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.mediation.admob.AdMobExtras;
import com.google.android.gms.internal.C0432bg;
import com.google.android.gms.internal.C0501cs;
import java.util.Date;
import java.util.Set;

public final class AdMobAdapter implements MediationBannerAdapter<AdMobExtras, AdMobServerParameters>, MediationInterstitialAdapter<AdMobExtras, AdMobServerParameters> {

    /* renamed from: h */
    private AdView f9h;

    /* renamed from: i */
    private InterstitialAd f10i;

    /* renamed from: com.google.ads.mediation.admob.AdMobAdapter$a */
    private static final class C0078a extends AdListener {

        /* renamed from: j */
        private final AdMobAdapter f11j;

        /* renamed from: k */
        private final MediationBannerListener f12k;

        public C0078a(AdMobAdapter adMobAdapter, MediationBannerListener mediationBannerListener) {
            this.f11j = adMobAdapter;
            this.f12k = mediationBannerListener;
        }

        public void onAdClosed() {
            this.f12k.onDismissScreen(this.f11j);
        }

        public void onAdFailedToLoad(int errorCode) {
            this.f12k.onFailedToReceiveAd(this.f11j, C0432bg.m968h(errorCode));
        }

        public void onAdLeftApplication() {
            this.f12k.onLeaveApplication(this.f11j);
        }

        public void onAdLoaded() {
            this.f12k.onReceivedAd(this.f11j);
        }

        public void onAdOpened() {
            this.f12k.onClick(this.f11j);
            this.f12k.onPresentScreen(this.f11j);
        }
    }

    /* renamed from: com.google.ads.mediation.admob.AdMobAdapter$b */
    private static final class C0079b extends AdListener {

        /* renamed from: j */
        private final AdMobAdapter f13j;

        /* renamed from: l */
        private final MediationInterstitialListener f14l;

        public C0079b(AdMobAdapter adMobAdapter, MediationInterstitialListener mediationInterstitialListener) {
            this.f13j = adMobAdapter;
            this.f14l = mediationInterstitialListener;
        }

        public void onAdClosed() {
            this.f14l.onDismissScreen(this.f13j);
        }

        public void onAdFailedToLoad(int errorCode) {
            this.f14l.onFailedToReceiveAd(this.f13j, C0432bg.m968h(errorCode));
        }

        public void onAdLeftApplication() {
            this.f14l.onLeaveApplication(this.f13j);
        }

        public void onAdLoaded() {
            this.f14l.onReceivedAd(this.f13j);
        }

        public void onAdOpened() {
            this.f14l.onPresentScreen(this.f13j);
        }
    }

    /* renamed from: a */
    private static AdRequest m3a(Context context, MediationAdRequest mediationAdRequest, AdMobExtras adMobExtras, AdMobServerParameters adMobServerParameters) {
        Builder builder = new Builder();
        Date birthday = mediationAdRequest.getBirthday();
        if (birthday != null) {
            builder.setBirthday(birthday);
        }
        Gender gender = mediationAdRequest.getGender();
        if (gender != null) {
            builder.setGender(C0432bg.m964a(gender));
        }
        Set<String> keywords = mediationAdRequest.getKeywords();
        if (keywords != null) {
            for (String addKeyword : keywords) {
                builder.addKeyword(addKeyword);
            }
        }
        if (mediationAdRequest.isTesting()) {
            builder.addTestDevice(C0501cs.m1147l(context));
        }
        if (adMobServerParameters.tagForChildDirectedTreatment != -1) {
            builder.tagForChildDirectedTreatment(adMobServerParameters.tagForChildDirectedTreatment == 1);
        }
        if (adMobExtras == null) {
            adMobExtras = new AdMobExtras(new Bundle());
        }
        Bundle extras = adMobExtras.getExtras();
        extras.putInt("gw", 1);
        extras.putString("mad_hac", adMobServerParameters.allowHouseAds);
        if (!TextUtils.isEmpty(adMobServerParameters.adJson)) {
            extras.putString("_ad", adMobServerParameters.adJson);
        }
        extras.putBoolean("_noRefresh", true);
        builder.addNetworkExtras(adMobExtras);
        return builder.build();
    }

    public void destroy() {
        if (this.f9h != null) {
            this.f9h.destroy();
            this.f9h = null;
        }
        if (this.f10i != null) {
            this.f10i = null;
        }
    }

    public Class<AdMobExtras> getAdditionalParametersType() {
        return AdMobExtras.class;
    }

    public View getBannerView() {
        return this.f9h;
    }

    public Class<AdMobServerParameters> getServerParametersType() {
        return AdMobServerParameters.class;
    }

    public void requestBannerAd(MediationBannerListener bannerListener, Activity activity, AdMobServerParameters serverParameters, AdSize adSize, MediationAdRequest mediationAdRequest, AdMobExtras extras) {
        this.f9h = new AdView(activity);
        this.f9h.setAdSize(new com.google.android.gms.ads.AdSize(adSize.getWidth(), adSize.getHeight()));
        this.f9h.setAdUnitId(serverParameters.adUnitId);
        this.f9h.setAdListener(new C0078a(this, bannerListener));
        this.f9h.loadAd(m3a(activity, mediationAdRequest, extras, serverParameters));
    }

    public void requestInterstitialAd(MediationInterstitialListener interstitialListener, Activity activity, AdMobServerParameters serverParameters, MediationAdRequest mediationAdRequest, AdMobExtras extras) {
        this.f10i = new InterstitialAd(activity);
        this.f10i.setAdUnitId(serverParameters.adUnitId);
        this.f10i.setAdListener(new C0079b(this, interstitialListener));
        this.f10i.loadAd(m3a(activity, mediationAdRequest, extras, serverParameters));
    }

    public void showInterstitial() {
        this.f10i.show();
    }
}
