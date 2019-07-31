package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.dynamic.C0273c;
import com.google.android.gms.internal.C0391ay.C0392a;

/* renamed from: com.google.android.gms.internal.ax */
public final class C0389ax implements C0392a {

    /* renamed from: ed */
    private final C0410bb f920ed;

    /* renamed from: eq */
    private final C0962v f921eq;

    /* renamed from: fR */
    private final String f922fR;

    /* renamed from: fS */
    private final long f923fS;

    /* renamed from: fT */
    private final C0385at f924fT;

    /* renamed from: fU */
    private final C0964x f925fU;

    /* renamed from: fV */
    private final C0503cu f926fV;
    /* access modifiers changed from: private */

    /* renamed from: fW */
    public C0413bc f927fW;
    /* access modifiers changed from: private */

    /* renamed from: fX */
    public int f928fX = -2;
    /* access modifiers changed from: private */

    /* renamed from: fx */
    public final Object f929fx = new Object();
    private final Context mContext;

    public C0389ax(Context context, String str, C0410bb bbVar, C0386au auVar, C0385at atVar, C0962v vVar, C0964x xVar, C0503cu cuVar) {
        this.mContext = context;
        this.f922fR = str;
        this.f920ed = bbVar;
        this.f923fS = auVar.f911fJ != -1 ? auVar.f911fJ : 10000;
        this.f924fT = atVar;
        this.f921eq = vVar;
        this.f925fU = xVar;
        this.f926fV = cuVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: V */
    public C0413bc m910V() {
        C0502ct.m1154t("Instantiating mediation adapter: " + this.f922fR);
        try {
            return this.f920ed.mo3531l(this.f922fR);
        } catch (RemoteException e) {
            C0502ct.m1149a("Could not instantiate mediation adapter: " + this.f922fR, e);
            return null;
        }
    }

    /* renamed from: a */
    private void m913a(long j, long j2, long j3, long j4) {
        while (this.f928fX == -2) {
            m917b(j, j2, j3, j4);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m914a(C0388aw awVar) {
        try {
            if (this.f926fV.f1348iL < 4100000) {
                if (this.f925fU.f2419eG) {
                    this.f927fW.mo3535a(C0273c.m634h(this.mContext), this.f921eq, this.f924fT.f909fH, awVar);
                } else {
                    this.f927fW.mo3537a(C0273c.m634h(this.mContext), this.f925fU, this.f921eq, this.f924fT.f909fH, (C0416bd) awVar);
                }
            } else if (this.f925fU.f2419eG) {
                this.f927fW.mo3536a(C0273c.m634h(this.mContext), this.f921eq, this.f924fT.f909fH, this.f924fT.adJson, (C0416bd) awVar);
            } else {
                this.f927fW.mo3538a(C0273c.m634h(this.mContext), this.f925fU, this.f921eq, this.f924fT.f909fH, this.f924fT.adJson, awVar);
            }
        } catch (RemoteException e) {
            C0502ct.m1150b("Could not request ad from mediation adapter.", e);
            mo3526f(5);
        }
    }

    /* renamed from: b */
    private void m917b(long j, long j2, long j3, long j4) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j5 = j2 - (elapsedRealtime - j);
        long j6 = j4 - (elapsedRealtime - j3);
        if (j5 <= 0 || j6 <= 0) {
            C0502ct.m1154t("Timed out waiting for adapter.");
            this.f928fX = 3;
            return;
        }
        try {
            this.f929fx.wait(Math.min(j5, j6));
        } catch (InterruptedException e) {
            this.f928fX = -1;
        }
    }

    /* renamed from: b */
    public C0391ay mo3524b(long j, long j2) {
        C0391ay ayVar;
        synchronized (this.f929fx) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            final C0388aw awVar = new C0388aw();
            C0501cs.f1345iI.post(new Runnable() {
                public void run() {
                    synchronized (C0389ax.this.f929fx) {
                        if (C0389ax.this.f928fX == -2) {
                            C0389ax.this.f927fW = C0389ax.this.m910V();
                            if (C0389ax.this.f927fW == null) {
                                C0389ax.this.mo3526f(4);
                                return;
                            }
                            awVar.mo3517a((C0392a) C0389ax.this);
                            C0389ax.this.m914a(awVar);
                        }
                    }
                }
            });
            m913a(elapsedRealtime, this.f923fS, j, j2);
            ayVar = new C0391ay(this.f924fT, this.f927fW, this.f922fR, awVar, this.f928fX);
        }
        return ayVar;
    }

    public void cancel() {
        synchronized (this.f929fx) {
            try {
                if (this.f927fW != null) {
                    this.f927fW.destroy();
                }
            } catch (RemoteException e) {
                C0502ct.m1150b("Could not destroy mediation adapter.", e);
            }
            this.f928fX = -1;
            this.f929fx.notify();
        }
    }

    /* renamed from: f */
    public void mo3526f(int i) {
        synchronized (this.f929fx) {
            this.f928fX = i;
            this.f929fx.notify();
        }
    }
}
