package com.google.android.gms.internal;

import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.internal.C0359ae.C0360a;

/* renamed from: com.google.android.gms.internal.z */
public final class C0966z extends C0360a {

    /* renamed from: eI */
    private final AppEventListener f2421eI;

    public C0966z(AppEventListener appEventListener) {
        this.f2421eI = appEventListener;
    }

    public void onAppEvent(String name, String info) {
        this.f2421eI.onAppEvent(name, info);
    }
}
