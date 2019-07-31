package com.google.android.gms.internal;

/* renamed from: com.google.android.gms.internal.cm */
public abstract class C0490cm {

    /* renamed from: ep */
    private final Runnable f1331ep = new Runnable() {
        public final void run() {
            C0490cm.this.f1332ix = Thread.currentThread();
            C0490cm.this.mo3624ai();
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: ix */
    public volatile Thread f1332ix;

    /* renamed from: ai */
    public abstract void mo3624ai();

    public final void cancel() {
        onStop();
        if (this.f1332ix != null) {
            this.f1332ix.interrupt();
        }
    }

    public abstract void onStop();

    public final void start() {
        C0492cn.execute(this.f1331ep);
    }
}
