package com.google.android.gms.internal;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.WebView;
import com.google.android.gms.internal.C0457bu.C0458a;
import com.google.android.gms.internal.C0464bw.C0465a;
import com.google.android.gms.internal.C0470bz.C0471a;
import com.google.android.gms.internal.C0507cx.C0509a;
import org.json.JSONException;

/* renamed from: com.google.android.gms.internal.bv */
public final class C0459bv extends C0490cm implements C0465a, C0509a {

    /* renamed from: ed */
    private final C0410bb f1214ed;
    /* access modifiers changed from: private */

    /* renamed from: fx */
    public final Object f1215fx = new Object();

    /* renamed from: fy */
    private C0386au f1216fy;
    /* access modifiers changed from: private */

    /* renamed from: gv */
    public final C0505cw f1217gv;
    /* access modifiers changed from: private */

    /* renamed from: hb */
    public final C0458a f1218hb;

    /* renamed from: hc */
    private final Object f1219hc = new Object();

    /* renamed from: hd */
    private final C0471a f1220hd;

    /* renamed from: he */
    private final C0830h f1221he;

    /* renamed from: hf */
    private C0490cm f1222hf;
    /* access modifiers changed from: private */

    /* renamed from: hg */
    public C0474cb f1223hg;

    /* renamed from: hh */
    private boolean f1224hh = false;

    /* renamed from: hi */
    private C0383as f1225hi;

    /* renamed from: hj */
    private C0391ay f1226hj;
    private final Context mContext;

    /* renamed from: com.google.android.gms.internal.bv$a */
    private static final class C0463a extends Exception {

        /* renamed from: hm */
        private final int f1231hm;

        public C0463a(String str, int i) {
            super(str);
            this.f1231hm = i;
        }

        public int getErrorCode() {
            return this.f1231hm;
        }
    }

    public C0459bv(Context context, C0471a aVar, C0830h hVar, C0505cw cwVar, C0410bb bbVar, C0458a aVar2) {
        this.f1214ed = bbVar;
        this.f1218hb = aVar2;
        this.f1217gv = cwVar;
        this.mContext = context;
        this.f1220hd = aVar;
        this.f1221he = hVar;
    }

    /* renamed from: a */
    private C0964x m1022a(C0470bz bzVar) throws C0463a {
        if (this.f1223hg.f1258hB == null) {
            throw new C0463a("The ad response must specify one of the supported ad sizes.", 0);
        }
        String[] split = this.f1223hg.f1258hB.split("x");
        if (split.length != 2) {
            throw new C0463a("Could not parse the ad size from the ad response: " + this.f1223hg.f1258hB, 0);
        }
        try {
            int parseInt = Integer.parseInt(split[0]);
            int parseInt2 = Integer.parseInt(split[1]);
            C0964x[] xVarArr = bzVar.f1239em.f2420eH;
            int length = xVarArr.length;
            for (int i = 0; i < length; i++) {
                C0964x xVar = xVarArr[i];
                float f = this.mContext.getResources().getDisplayMetrics().density;
                int i2 = xVar.width == -1 ? (int) (((float) xVar.widthPixels) / f) : xVar.width;
                int i3 = xVar.height == -2 ? (int) (((float) xVar.heightPixels) / f) : xVar.height;
                if (parseInt == i2 && parseInt2 == i3) {
                    return new C0964x(xVar, bzVar.f1239em.f2420eH);
                }
            }
            throw new C0463a("The ad size from the ad response was not one of the requested sizes: " + this.f1223hg.f1258hB, 0);
        } catch (NumberFormatException e) {
            throw new C0463a("Could not parse the ad size from the ad response: " + this.f1223hg.f1258hB, 0);
        }
    }

    /* renamed from: a */
    private void m1024a(C0470bz bzVar, long j) throws C0463a {
        synchronized (this.f1219hc) {
            this.f1225hi = new C0383as(this.mContext, bzVar, this.f1214ed, this.f1216fy);
        }
        this.f1226hj = this.f1225hi.mo3508a(j, 60000);
        switch (this.f1226hj.f932ga) {
            case 0:
                return;
            case 1:
                throw new C0463a("No fill from any mediation ad networks.", 3);
            default:
                throw new C0463a("Unexpected mediation result: " + this.f1226hj.f932ga, 0);
        }
    }

    /* renamed from: aj */
    private void m1025aj() throws C0463a {
        if (this.f1223hg.errorCode != -3) {
            if (TextUtils.isEmpty(this.f1223hg.f1259hw)) {
                throw new C0463a("No fill from ad server.", 3);
            } else if (this.f1223hg.f1261hy) {
                try {
                    this.f1216fy = new C0386au(this.f1223hg.f1259hw);
                } catch (JSONException e) {
                    throw new C0463a("Could not parse mediation config: " + this.f1223hg.f1259hw, 0);
                }
            }
        }
    }

    /* renamed from: b */
    private void m1027b(long j) throws C0463a {
        C0501cs.f1345iI.post(new Runnable() {
            /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
                return;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r7 = this;
                    com.google.android.gms.internal.bv r0 = com.google.android.gms.internal.C0459bv.this
                    java.lang.Object r6 = r0.f1215fx
                    monitor-enter(r6)
                    com.google.android.gms.internal.bv r0 = com.google.android.gms.internal.C0459bv.this     // Catch:{ all -> 0x005f }
                    com.google.android.gms.internal.cb r0 = r0.f1223hg     // Catch:{ all -> 0x005f }
                    int r0 = r0.errorCode     // Catch:{ all -> 0x005f }
                    r1 = -2
                    if (r0 == r1) goto L_0x0014
                    monitor-exit(r6)     // Catch:{ all -> 0x005f }
                L_0x0013:
                    return
                L_0x0014:
                    com.google.android.gms.internal.bv r0 = com.google.android.gms.internal.C0459bv.this     // Catch:{ all -> 0x005f }
                    com.google.android.gms.internal.cw r0 = r0.f1217gv     // Catch:{ all -> 0x005f }
                    com.google.android.gms.internal.cx r0 = r0.mo3676aC()     // Catch:{ all -> 0x005f }
                    com.google.android.gms.internal.bv r1 = com.google.android.gms.internal.C0459bv.this     // Catch:{ all -> 0x005f }
                    r0.mo3691a(r1)     // Catch:{ all -> 0x005f }
                    com.google.android.gms.internal.bv r0 = com.google.android.gms.internal.C0459bv.this     // Catch:{ all -> 0x005f }
                    com.google.android.gms.internal.cb r0 = r0.f1223hg     // Catch:{ all -> 0x005f }
                    int r0 = r0.errorCode     // Catch:{ all -> 0x005f }
                    r1 = -3
                    if (r0 != r1) goto L_0x0062
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x005f }
                    r0.<init>()     // Catch:{ all -> 0x005f }
                    java.lang.String r1 = "Loading URL in WebView: "
                    java.lang.StringBuilder r0 = r0.append(r1)     // Catch:{ all -> 0x005f }
                    com.google.android.gms.internal.bv r1 = com.google.android.gms.internal.C0459bv.this     // Catch:{ all -> 0x005f }
                    com.google.android.gms.internal.cb r1 = r1.f1223hg     // Catch:{ all -> 0x005f }
                    java.lang.String r1 = r1.f1256gL     // Catch:{ all -> 0x005f }
                    java.lang.StringBuilder r0 = r0.append(r1)     // Catch:{ all -> 0x005f }
                    java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x005f }
                    com.google.android.gms.internal.C0502ct.m1155u(r0)     // Catch:{ all -> 0x005f }
                    com.google.android.gms.internal.bv r0 = com.google.android.gms.internal.C0459bv.this     // Catch:{ all -> 0x005f }
                    com.google.android.gms.internal.cw r0 = r0.f1217gv     // Catch:{ all -> 0x005f }
                    com.google.android.gms.internal.bv r1 = com.google.android.gms.internal.C0459bv.this     // Catch:{ all -> 0x005f }
                    com.google.android.gms.internal.cb r1 = r1.f1223hg     // Catch:{ all -> 0x005f }
                    java.lang.String r1 = r1.f1256gL     // Catch:{ all -> 0x005f }
                    r0.loadUrl(r1)     // Catch:{ all -> 0x005f }
                L_0x005d:
                    monitor-exit(r6)     // Catch:{ all -> 0x005f }
                    goto L_0x0013
                L_0x005f:
                    r0 = move-exception
                    monitor-exit(r6)     // Catch:{ all -> 0x005f }
                    throw r0
                L_0x0062:
                    java.lang.String r0 = "Loading HTML in WebView."
                    com.google.android.gms.internal.C0502ct.m1155u(r0)     // Catch:{ all -> 0x005f }
                    com.google.android.gms.internal.bv r0 = com.google.android.gms.internal.C0459bv.this     // Catch:{ all -> 0x005f }
                    com.google.android.gms.internal.cw r0 = r0.f1217gv     // Catch:{ all -> 0x005f }
                    com.google.android.gms.internal.bv r1 = com.google.android.gms.internal.C0459bv.this     // Catch:{ all -> 0x005f }
                    com.google.android.gms.internal.cb r1 = r1.f1223hg     // Catch:{ all -> 0x005f }
                    java.lang.String r1 = r1.f1256gL     // Catch:{ all -> 0x005f }
                    java.lang.String r1 = com.google.android.gms.internal.C0495co.m1130o(r1)     // Catch:{ all -> 0x005f }
                    com.google.android.gms.internal.bv r2 = com.google.android.gms.internal.C0459bv.this     // Catch:{ all -> 0x005f }
                    com.google.android.gms.internal.cb r2 = r2.f1223hg     // Catch:{ all -> 0x005f }
                    java.lang.String r2 = r2.f1259hw     // Catch:{ all -> 0x005f }
                    java.lang.String r3 = "text/html"
                    java.lang.String r4 = "UTF-8"
                    r5 = 0
                    r0.loadDataWithBaseURL(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x005f }
                    goto L_0x005d
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.C0459bv.C04623.run():void");
            }
        });
        m1031d(j);
    }

    /* renamed from: c */
    private void m1029c(long j) throws C0463a {
        while (m1032e(j)) {
            if (this.f1223hg != null) {
                synchronized (this.f1219hc) {
                    this.f1222hf = null;
                }
                if (this.f1223hg.errorCode != -2 && this.f1223hg.errorCode != -3) {
                    throw new C0463a("There was a problem getting an ad response. ErrorCode: " + this.f1223hg.errorCode, this.f1223hg.errorCode);
                }
                return;
            }
        }
        throw new C0463a("Timed out waiting for ad response.", 2);
    }

    /* renamed from: d */
    private void m1031d(long j) throws C0463a {
        while (m1032e(j)) {
            if (this.f1224hh) {
                return;
            }
        }
        throw new C0463a("Timed out waiting for WebView to finish loading.", 2);
    }

    /* renamed from: e */
    private boolean m1032e(long j) throws C0463a {
        long elapsedRealtime = 60000 - (SystemClock.elapsedRealtime() - j);
        if (elapsedRealtime <= 0) {
            return false;
        }
        try {
            this.f1215fx.wait(elapsedRealtime);
            return true;
        } catch (InterruptedException e) {
            throw new C0463a("Ad request cancelled.", -1);
        }
    }

    /* renamed from: a */
    public void mo3623a(C0474cb cbVar) {
        synchronized (this.f1215fx) {
            C0502ct.m1152r("Received ad response.");
            this.f1223hg = cbVar;
            this.f1215fx.notify();
        }
    }

    /* renamed from: a */
    public void mo3583a(C0505cw cwVar) {
        synchronized (this.f1215fx) {
            C0502ct.m1152r("WebView finished loading.");
            this.f1224hh = true;
            this.f1215fx.notify();
        }
    }

    /* renamed from: ai */
    public void mo3624ai() {
        C0964x xVar;
        synchronized (this.f1215fx) {
            C0502ct.m1152r("AdLoaderBackgroundTask started.");
            C0470bz bzVar = new C0470bz(this.f1220hd, this.f1221he.mo4599g().mo3722a(this.mContext));
            C0964x xVar2 = null;
            int i = -2;
            try {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                C0490cm a = C0464bw.m1036a(this.mContext, bzVar, this);
                synchronized (this.f1219hc) {
                    this.f1222hf = a;
                    if (this.f1222hf == null) {
                        throw new C0463a("Could not start the ad request service.", 0);
                    }
                }
                m1029c(elapsedRealtime);
                m1025aj();
                if (bzVar.f1239em.f2420eH != null) {
                    xVar2 = m1022a(bzVar);
                }
                if (this.f1223hg.f1261hy) {
                    m1024a(bzVar, elapsedRealtime);
                } else {
                    m1027b(elapsedRealtime);
                }
                xVar = xVar2;
            } catch (C0463a e) {
                i = e.getErrorCode();
                if (i == 3 || i == -1) {
                    C0502ct.m1154t(e.getMessage());
                } else {
                    C0502ct.m1156v(e.getMessage());
                }
                this.f1223hg = new C0474cb(i);
                C0501cs.f1345iI.post(new Runnable() {
                    public void run() {
                        C0459bv.this.onStop();
                    }
                });
                xVar = null;
            }
            final C0487cj cjVar = new C0487cj(bzVar.f1241hr, this.f1217gv, this.f1223hg.f1253fK, i, this.f1223hg.f1254fL, this.f1223hg.f1257hA, this.f1223hg.orientation, this.f1223hg.f1255fO, bzVar.f1244hu, this.f1223hg.f1261hy, this.f1226hj != null ? this.f1226hj.f933gb : null, this.f1226hj != null ? this.f1226hj.f934gc : null, this.f1226hj != null ? this.f1226hj.f935gd : null, this.f1216fy, this.f1226hj != null ? this.f1226hj.f936ge : null, this.f1223hg.f1262hz, xVar, this.f1223hg.f1260hx);
            C0501cs.f1345iI.post(new Runnable() {
                public void run() {
                    synchronized (C0459bv.this.f1215fx) {
                        C0459bv.this.f1218hb.mo3622a(cjVar);
                    }
                }
            });
        }
    }

    public void onStop() {
        synchronized (this.f1219hc) {
            if (this.f1222hf != null) {
                this.f1222hf.cancel();
            }
            this.f1217gv.stopLoading();
            C0495co.m1113a((WebView) this.f1217gv);
            if (this.f1225hi != null) {
                this.f1225hi.cancel();
            }
        }
    }
}
