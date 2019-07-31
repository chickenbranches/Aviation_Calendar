package com.google.android.gms.internal;

import android.os.SystemClock;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.do */
public final class C0556do {

    /* renamed from: lA */
    private static final C0550dk f1462lA = new C0550dk("RequestTracker");

    /* renamed from: mw */
    public static final Object f1463mw = new Object();

    /* renamed from: ms */
    private long f1464ms;

    /* renamed from: mt */
    private long f1465mt = -1;

    /* renamed from: mu */
    private long f1466mu = 0;

    /* renamed from: mv */
    private C0555dn f1467mv;

    public C0556do(long j) {
        this.f1464ms = j;
    }

    /* renamed from: be */
    private void m1374be() {
        this.f1465mt = -1;
        this.f1467mv = null;
        this.f1466mu = 0;
    }

    /* renamed from: a */
    public void mo3833a(long j, C0555dn dnVar) {
        C0555dn dnVar2;
        long j2;
        synchronized (f1463mw) {
            dnVar2 = this.f1467mv;
            j2 = this.f1465mt;
            this.f1465mt = j;
            this.f1467mv = dnVar;
            this.f1466mu = SystemClock.elapsedRealtime();
        }
        if (dnVar2 != null) {
            dnVar2.mo2268g(j2);
        }
    }

    /* renamed from: b */
    public boolean mo3834b(long j, int i, JSONObject jSONObject) {
        boolean z = true;
        C0555dn dnVar = null;
        synchronized (f1463mw) {
            if (this.f1465mt == -1 || this.f1465mt != j) {
                z = false;
            } else {
                f1462lA.mo3816b("request %d completed", Long.valueOf(this.f1465mt));
                dnVar = this.f1467mv;
                m1374be();
            }
        }
        if (dnVar != null) {
            dnVar.mo2267a(j, i, jSONObject);
        }
        return z;
    }

    /* renamed from: bf */
    public boolean mo3835bf() {
        boolean z;
        synchronized (f1463mw) {
            z = this.f1465mt != -1;
        }
        return z;
    }

    /* renamed from: c */
    public boolean mo3836c(long j, int i) {
        return mo3834b(j, i, null);
    }

    public void clear() {
        synchronized (f1463mw) {
            if (this.f1465mt != -1) {
                m1374be();
            }
        }
    }

    /* renamed from: d */
    public boolean mo3838d(long j, int i) {
        C0555dn dnVar;
        boolean z = true;
        long j2 = 0;
        synchronized (f1463mw) {
            if (this.f1465mt == -1 || j - this.f1466mu < this.f1464ms) {
                z = false;
                dnVar = null;
            } else {
                f1462lA.mo3816b("request %d timed out", Long.valueOf(this.f1465mt));
                j2 = this.f1465mt;
                dnVar = this.f1467mv;
                m1374be();
            }
        }
        if (dnVar != null) {
            dnVar.mo2267a(j2, i, null);
        }
        return z;
    }

    /* renamed from: i */
    public boolean mo3839i(long j) {
        boolean z;
        synchronized (f1463mw) {
            z = this.f1465mt != -1 && this.f1465mt == j;
        }
        return z;
    }
}
