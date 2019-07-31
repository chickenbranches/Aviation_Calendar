package com.google.android.gms.internal;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.internal.C0350ab.C0351a;

/* renamed from: com.google.android.gms.internal.t */
public final class C0960t extends C0351a {

    /* renamed from: ev */
    private final AdListener f2408ev;

    public C0960t(AdListener adListener) {
        this.f2408ev = adListener;
    }

    public void onAdClosed() {
        this.f2408ev.onAdClosed();
    }

    public void onAdFailedToLoad(int errorCode) {
        this.f2408ev.onAdFailedToLoad(errorCode);
    }

    public void onAdLeftApplication() {
        this.f2408ev.onAdLeftApplication();
    }

    public void onAdLoaded() {
        this.f2408ev.onAdLoaded();
    }

    public void onAdOpened() {
        this.f2408ev.onAdOpened();
    }
}
