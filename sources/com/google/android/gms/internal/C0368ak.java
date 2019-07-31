package com.google.android.gms.internal;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ak */
public final class C0368ak implements C0378an {

    /* renamed from: fm */
    private final C0369al f887fm;

    public C0368ak(C0369al alVar) {
        this.f887fm = alVar;
    }

    /* renamed from: a */
    public void mo3504a(C0505cw cwVar, Map<String, String> map) {
        String str = (String) map.get("name");
        if (str == null) {
            C0502ct.m1156v("App event with no name parameter.");
        } else {
            this.f887fm.onAppEvent(str, (String) map.get("info"));
        }
    }
}
