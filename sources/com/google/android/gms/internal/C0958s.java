package com.google.android.gms.internal;

import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.s */
public final class C0958s {

    /* renamed from: ep */
    private final Runnable f2402ep;
    /* access modifiers changed from: private */

    /* renamed from: eq */
    public C0962v f2403eq;
    /* access modifiers changed from: private */

    /* renamed from: er */
    public boolean f2404er = false;

    public C0958s(final C0956r rVar) {
        this.f2402ep = new Runnable() {

            /* renamed from: es */
            private final WeakReference<C0956r> f2405es = new WeakReference<>(rVar);

            public void run() {
                C0958s.this.f2404er = false;
                C0956r rVar = (C0956r) this.f2405es.get();
                if (rVar != null) {
                    rVar.mo5259b(C0958s.this.f2403eq);
                }
            }
        };
    }

    /* renamed from: a */
    public void mo5260a(C0962v vVar, long j) {
        if (this.f2404er) {
            C0502ct.m1156v("An ad refresh is already scheduled.");
            return;
        }
        C0502ct.m1154t("Scheduling ad refresh " + j + " milliseconds from now.");
        this.f2403eq = vVar;
        this.f2404er = true;
        C0501cs.f1345iI.postDelayed(this.f2402ep, j);
    }

    public void cancel() {
        C0501cs.f1345iI.removeCallbacks(this.f2402ep);
    }

    /* renamed from: d */
    public void mo5262d(C0962v vVar) {
        mo5260a(vVar, 60000);
    }
}
