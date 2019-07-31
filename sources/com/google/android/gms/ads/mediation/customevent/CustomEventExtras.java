package com.google.android.gms.ads.mediation.customevent;

import com.google.ads.mediation.NetworkExtras;
import java.util.HashMap;

public final class CustomEventExtras implements NetworkExtras {

    /* renamed from: ji */
    private final HashMap<String, Object> f56ji = new HashMap<>();

    public Object getExtra(String label) {
        return this.f56ji.get(label);
    }

    public void setExtra(String label, Object value) {
        this.f56ji.put(label, value);
    }
}
