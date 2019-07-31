package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.internal.C0365ah;

public final class InterstitialAd {

    /* renamed from: ea */
    private final C0365ah f48ea;

    public InterstitialAd(Context context) {
        this.f48ea = new C0365ah(context);
    }

    public AdListener getAdListener() {
        return this.f48ea.getAdListener();
    }

    public String getAdUnitId() {
        return this.f48ea.getAdUnitId();
    }

    public boolean isLoaded() {
        return this.f48ea.isLoaded();
    }

    public void loadAd(AdRequest adRequest) {
        this.f48ea.mo3489a(adRequest.mo1884v());
    }

    public void setAdListener(AdListener adListener) {
        this.f48ea.setAdListener(adListener);
    }

    public void setAdUnitId(String adUnitId) {
        this.f48ea.setAdUnitId(adUnitId);
    }

    public void show() {
        this.f48ea.show();
    }
}
