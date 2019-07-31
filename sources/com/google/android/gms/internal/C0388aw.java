package com.google.android.gms.internal;

import com.google.android.gms.internal.C0391ay.C0392a;
import com.google.android.gms.internal.C0416bd.C0417a;

/* renamed from: com.google.android.gms.internal.aw */
public final class C0388aw extends C0417a {

    /* renamed from: fP */
    private C0392a f917fP;

    /* renamed from: fQ */
    private C0387av f918fQ;

    /* renamed from: fx */
    private final Object f919fx = new Object();

    /* renamed from: a */
    public void mo3516a(C0387av avVar) {
        synchronized (this.f919fx) {
            this.f918fQ = avVar;
        }
    }

    /* renamed from: a */
    public void mo3517a(C0392a aVar) {
        synchronized (this.f919fx) {
            this.f917fP = aVar;
        }
    }

    public void onAdClosed() {
        synchronized (this.f919fx) {
            if (this.f918fQ != null) {
                this.f918fQ.mo3512D();
            }
        }
    }

    public void onAdFailedToLoad(int error) {
        synchronized (this.f919fx) {
            if (this.f917fP != null) {
                this.f917fP.mo3526f(error == 3 ? 1 : 2);
                this.f917fP = null;
            }
        }
    }

    public void onAdLeftApplication() {
        synchronized (this.f919fx) {
            if (this.f918fQ != null) {
                this.f918fQ.mo3513E();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAdLoaded() {
        /*
            r3 = this;
            java.lang.Object r1 = r3.f919fx
            monitor-enter(r1)
            com.google.android.gms.internal.ay$a r0 = r3.f917fP     // Catch:{ all -> 0x001d }
            if (r0 == 0) goto L_0x0012
            com.google.android.gms.internal.ay$a r0 = r3.f917fP     // Catch:{ all -> 0x001d }
            r2 = 0
            r0.mo3526f(r2)     // Catch:{ all -> 0x001d }
            r0 = 0
            r3.f917fP = r0     // Catch:{ all -> 0x001d }
            monitor-exit(r1)     // Catch:{ all -> 0x001d }
        L_0x0011:
            return
        L_0x0012:
            com.google.android.gms.internal.av r0 = r3.f918fQ     // Catch:{ all -> 0x001d }
            if (r0 == 0) goto L_0x001b
            com.google.android.gms.internal.av r0 = r3.f918fQ     // Catch:{ all -> 0x001d }
            r0.mo3515G()     // Catch:{ all -> 0x001d }
        L_0x001b:
            monitor-exit(r1)     // Catch:{ all -> 0x001d }
            goto L_0x0011
        L_0x001d:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.C0388aw.onAdLoaded():void");
    }

    public void onAdOpened() {
        synchronized (this.f919fx) {
            if (this.f918fQ != null) {
                this.f918fQ.mo3514F();
            }
        }
    }

    /* renamed from: w */
    public void mo3523w() {
        synchronized (this.f919fx) {
            if (this.f918fQ != null) {
                this.f918fQ.mo3511C();
            }
        }
    }
}
