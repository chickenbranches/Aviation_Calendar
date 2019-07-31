package com.google.android.gms.internal;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.as */
public final class C0383as {

    /* renamed from: ed */
    private final C0410bb f897ed;

    /* renamed from: fA */
    private C0389ax f898fA;

    /* renamed from: fw */
    private final C0470bz f899fw;

    /* renamed from: fx */
    private final Object f900fx = new Object();

    /* renamed from: fy */
    private final C0386au f901fy;

    /* renamed from: fz */
    private boolean f902fz = false;
    private final Context mContext;

    public C0383as(Context context, C0470bz bzVar, C0410bb bbVar, C0386au auVar) {
        this.mContext = context;
        this.f899fw = bzVar;
        this.f897ed = bbVar;
        this.f901fy = auVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0080, code lost:
        r4 = r16.f898fA.mo3524b(r17, r19);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x008e, code lost:
        if (r4.f932ga != 0) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0090, code lost:
        com.google.android.gms.internal.C0502ct.m1152r("Adapter succeeded.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x009b, code lost:
        if (r4.f934gc == null) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x009d, code lost:
        com.google.android.gms.internal.C0501cs.f1345iI.post(new com.google.android.gms.internal.C0383as.C03841(r16));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        return r4;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.internal.C0391ay mo3508a(long r17, long r19) {
        /*
            r16 = this;
            java.lang.String r4 = "Starting mediation."
            com.google.android.gms.internal.C0502ct.m1152r(r4)
            r0 = r16
            com.google.android.gms.internal.au r4 = r0.f901fy
            java.util.List<com.google.android.gms.internal.at> r4 = r4.f910fI
            java.util.Iterator r13 = r4.iterator()
        L_0x000f:
            boolean r4 = r13.hasNext()
            if (r4 == 0) goto L_0x00aa
            java.lang.Object r9 = r13.next()
            com.google.android.gms.internal.at r9 = (com.google.android.gms.internal.C0385at) r9
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Trying mediation network: "
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = r9.f905fD
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.google.android.gms.internal.C0502ct.m1154t(r4)
            java.util.List<java.lang.String> r4 = r9.f906fE
            java.util.Iterator r14 = r4.iterator()
        L_0x0039:
            boolean r4 = r14.hasNext()
            if (r4 == 0) goto L_0x000f
            java.lang.Object r6 = r14.next()
            java.lang.String r6 = (java.lang.String) r6
            r0 = r16
            java.lang.Object r15 = r0.f900fx
            monitor-enter(r15)
            r0 = r16
            boolean r4 = r0.f902fz     // Catch:{ all -> 0x0096 }
            if (r4 == 0) goto L_0x0058
            com.google.android.gms.internal.ay r4 = new com.google.android.gms.internal.ay     // Catch:{ all -> 0x0096 }
            r5 = -1
            r4.<init>(r5)     // Catch:{ all -> 0x0096 }
            monitor-exit(r15)     // Catch:{ all -> 0x0096 }
        L_0x0057:
            return r4
        L_0x0058:
            com.google.android.gms.internal.ax r4 = new com.google.android.gms.internal.ax     // Catch:{ all -> 0x0096 }
            r0 = r16
            android.content.Context r5 = r0.mContext     // Catch:{ all -> 0x0096 }
            r0 = r16
            com.google.android.gms.internal.bb r7 = r0.f897ed     // Catch:{ all -> 0x0096 }
            r0 = r16
            com.google.android.gms.internal.au r8 = r0.f901fy     // Catch:{ all -> 0x0096 }
            r0 = r16
            com.google.android.gms.internal.bz r10 = r0.f899fw     // Catch:{ all -> 0x0096 }
            com.google.android.gms.internal.v r10 = r10.f1241hr     // Catch:{ all -> 0x0096 }
            r0 = r16
            com.google.android.gms.internal.bz r11 = r0.f899fw     // Catch:{ all -> 0x0096 }
            com.google.android.gms.internal.x r11 = r11.f1239em     // Catch:{ all -> 0x0096 }
            r0 = r16
            com.google.android.gms.internal.bz r12 = r0.f899fw     // Catch:{ all -> 0x0096 }
            com.google.android.gms.internal.cu r12 = r12.f1238ej     // Catch:{ all -> 0x0096 }
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0096 }
            r0 = r16
            r0.f898fA = r4     // Catch:{ all -> 0x0096 }
            monitor-exit(r15)     // Catch:{ all -> 0x0096 }
            r0 = r16
            com.google.android.gms.internal.ax r4 = r0.f898fA
            r0 = r17
            r2 = r19
            com.google.android.gms.internal.ay r4 = r4.mo3524b(r0, r2)
            int r5 = r4.f932ga
            if (r5 != 0) goto L_0x0099
            java.lang.String r5 = "Adapter succeeded."
            com.google.android.gms.internal.C0502ct.m1152r(r5)
            goto L_0x0057
        L_0x0096:
            r4 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x0096 }
            throw r4
        L_0x0099:
            com.google.android.gms.internal.bc r5 = r4.f934gc
            if (r5 == 0) goto L_0x0039
            android.os.Handler r5 = com.google.android.gms.internal.C0501cs.f1345iI
            com.google.android.gms.internal.as$1 r6 = new com.google.android.gms.internal.as$1
            r0 = r16
            r6.<init>(r4)
            r5.post(r6)
            goto L_0x0039
        L_0x00aa:
            com.google.android.gms.internal.ay r4 = new com.google.android.gms.internal.ay
            r5 = 1
            r4.<init>(r5)
            goto L_0x0057
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.C0383as.mo3508a(long, long):com.google.android.gms.internal.ay");
    }

    public void cancel() {
        synchronized (this.f900fx) {
            this.f902fz = true;
            if (this.f898fA != null) {
                this.f898fA.cancel();
            }
        }
    }
}
