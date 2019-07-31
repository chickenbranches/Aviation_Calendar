package com.google.android.gms.ads.doubleclick;

import android.content.Context;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.internal.C0365ah;

public final class PublisherInterstitialAd {

    /* renamed from: ea */
    private final C0365ah f52ea;

    public PublisherInterstitialAd(Context context) {
        this.f52ea = new C0365ah(context);
    }

    public AdListener getAdListener() {
        return this.f52ea.getAdListener();
    }

    public String getAdUnitId() {
        return this.f52ea.getAdUnitId();
    }

    public AppEventListener getAppEventListener() {
        return this.f52ea.getAppEventListener();
    }

    public boolean isLoaded() {
        return this.f52ea.isLoaded();
    }

    public void loadAd(PublisherAdRequest publisherAdRequest) {
        this.f52ea.mo3489a(publisherAdRequest.mo1930v());
    }

    public void setAdListener(AdListener adListener) {
        this.f52ea.setAdListener(adListener);
    }

    public void setAdUnitId(String adUnitId) {
        this.f52ea.setAdUnitId(adUnitId);
    }

    public void setAppEventListener(AppEventListener appEventListener) {
        this.f52ea.setAppEventListener(appEventListener);
    }

    public void show() {
        this.f52ea.show();
    }
}
