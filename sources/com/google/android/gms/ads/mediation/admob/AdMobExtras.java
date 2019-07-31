package com.google.android.gms.ads.mediation.admob;

import android.os.Bundle;
import com.google.ads.mediation.NetworkExtras;

public final class AdMobExtras implements NetworkExtras {

    /* renamed from: jh */
    private final Bundle f55jh;

    public AdMobExtras(Bundle extras) {
        this.f55jh = extras != null ? new Bundle(extras) : null;
    }

    public Bundle getExtras() {
        return this.f55jh;
    }
}
