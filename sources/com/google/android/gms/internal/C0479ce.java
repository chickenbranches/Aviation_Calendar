package com.google.android.gms.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.internal.C0476cd.C0477a;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ce */
public final class C0479ce extends C0477a {

    /* renamed from: hC */
    private static final Object f1264hC = new Object();

    /* renamed from: hD */
    private static C0479ce f1265hD;

    /* renamed from: hE */
    private final C0381aq f1266hE;
    private final Context mContext;

    private C0479ce(Context context, C0381aq aqVar) {
        this.mContext = context;
        this.f1266hE = aqVar;
    }

    /* renamed from: a */
    private static C0474cb m1063a(final Context context, C0381aq aqVar, final C0470bz bzVar) {
        C0502ct.m1152r("Starting ad request from service.");
        aqVar.init();
        C0486ci ciVar = new C0486ci(context);
        if (ciVar.f1302ik == -1) {
            C0502ct.m1152r("Device is offline.");
            return new C0474cb(2);
        }
        final C0482cg cgVar = new C0482cg(bzVar.applicationInfo.packageName);
        if (bzVar.f1241hr.extras != null) {
            String string = bzVar.f1241hr.extras.getString("_ad");
            if (string != null) {
                return C0481cf.m1068a(context, bzVar, string);
            }
        }
        final String a = C0481cf.m1069a(bzVar, ciVar, aqVar.mo3506a(250));
        if (a == null) {
            return new C0474cb(0);
        }
        C0501cs.f1345iI.post(new Runnable() {
            public void run() {
                C0505cw a = C0505cw.m1160a(context, new C0964x(), false, false, null, bzVar.f1238ej);
                a.setWillNotDraw(true);
                cgVar.mo3652b(a);
                C0507cx aC = a.mo3676aC();
                aC.mo3693a("/invalidRequest", cgVar.f1276hM);
                aC.mo3693a("/loadAdURL", cgVar.f1277hN);
                aC.mo3693a("/log", C0370am.f893fs);
                C0502ct.m1152r("Getting the ad request URL.");
                a.loadDataWithBaseURL("http://googleads.g.doubleclick.net", "<!DOCTYPE html><html><head><script src=\"http://googleads.g.doubleclick.net/mads/static/sdk/native/sdk-core-v40.js\"></script><script>AFMA_buildAdURL(" + a + ");</script></head><body></body></html>", "text/html", "UTF-8", null);
            }
        });
        String ap = cgVar.mo3651ap();
        return TextUtils.isEmpty(ap) ? new C0474cb(cgVar.getErrorCode()) : m1064a(context, bzVar.f1238ej.f1346iJ, ap);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        com.google.android.gms.internal.C0502ct.m1156v("Received error HTTP response code: " + r4);
        r1 = new com.google.android.gms.internal.C0474cb(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r0.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        return r1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.C0474cb m1064a(android.content.Context r8, java.lang.String r9, java.lang.String r10) {
        /*
            r7 = 300(0x12c, float:4.2E-43)
            r0 = 0
            com.google.android.gms.internal.ch r3 = new com.google.android.gms.internal.ch     // Catch:{ IOException -> 0x00b4 }
            r3.<init>()     // Catch:{ IOException -> 0x00b4 }
            java.net.URL r1 = new java.net.URL     // Catch:{ IOException -> 0x00b4 }
            r1.<init>(r10)     // Catch:{ IOException -> 0x00b4 }
            r2 = r1
            r1 = r0
        L_0x000f:
            java.net.URLConnection r0 = r2.openConnection()     // Catch:{ IOException -> 0x00b4 }
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ IOException -> 0x00b4 }
            r4 = 0
            com.google.android.gms.internal.C0495co.m1112a(r8, r9, r4, r0)     // Catch:{ all -> 0x00d7 }
            int r4 = r0.getResponseCode()     // Catch:{ all -> 0x00d7 }
            java.util.Map r5 = r0.getHeaderFields()     // Catch:{ all -> 0x00d7 }
            r6 = 200(0xc8, float:2.8E-43)
            if (r4 < r6) goto L_0x0047
            if (r4 >= r7) goto L_0x0047
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x00d7 }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ all -> 0x00d7 }
            java.io.InputStream r6 = r0.getInputStream()     // Catch:{ all -> 0x00d7 }
            r2.<init>(r6)     // Catch:{ all -> 0x00d7 }
            java.lang.String r2 = com.google.android.gms.internal.C0495co.m1106a(r2)     // Catch:{ all -> 0x00d7 }
            m1066a(r1, r5, r2, r4)     // Catch:{ all -> 0x00d7 }
            r3.mo3654a(r1, r5, r2)     // Catch:{ all -> 0x00d7 }
            com.google.android.gms.internal.cb r1 = r3.mo3655aq()     // Catch:{ all -> 0x00d7 }
            r0.disconnect()     // Catch:{ IOException -> 0x00b4 }
            r0 = r1
        L_0x0046:
            return r0
        L_0x0047:
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00d7 }
            r6 = 0
            m1066a(r2, r5, r6, r4)     // Catch:{ all -> 0x00d7 }
            if (r4 < r7) goto L_0x008b
            r2 = 400(0x190, float:5.6E-43)
            if (r4 >= r2) goto L_0x008b
            java.lang.String r2 = "Location"
            java.lang.String r4 = r0.getHeaderField(r2)     // Catch:{ all -> 0x00d7 }
            boolean r2 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x00d7 }
            if (r2 == 0) goto L_0x0071
            java.lang.String r1 = "No location header to follow redirect."
            com.google.android.gms.internal.C0502ct.m1156v(r1)     // Catch:{ all -> 0x00d7 }
            com.google.android.gms.internal.cb r1 = new com.google.android.gms.internal.cb     // Catch:{ all -> 0x00d7 }
            r2 = 0
            r1.<init>(r2)     // Catch:{ all -> 0x00d7 }
            r0.disconnect()     // Catch:{ IOException -> 0x00b4 }
            r0 = r1
            goto L_0x0046
        L_0x0071:
            java.net.URL r2 = new java.net.URL     // Catch:{ all -> 0x00d7 }
            r2.<init>(r4)     // Catch:{ all -> 0x00d7 }
            int r1 = r1 + 1
            r4 = 5
            if (r1 <= r4) goto L_0x00ac
            java.lang.String r1 = "Too many redirects."
            com.google.android.gms.internal.C0502ct.m1156v(r1)     // Catch:{ all -> 0x00d7 }
            com.google.android.gms.internal.cb r1 = new com.google.android.gms.internal.cb     // Catch:{ all -> 0x00d7 }
            r2 = 0
            r1.<init>(r2)     // Catch:{ all -> 0x00d7 }
            r0.disconnect()     // Catch:{ IOException -> 0x00b4 }
            r0 = r1
            goto L_0x0046
        L_0x008b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d7 }
            r1.<init>()     // Catch:{ all -> 0x00d7 }
            java.lang.String r2 = "Received error HTTP response code: "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ all -> 0x00d7 }
            java.lang.StringBuilder r1 = r1.append(r4)     // Catch:{ all -> 0x00d7 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00d7 }
            com.google.android.gms.internal.C0502ct.m1156v(r1)     // Catch:{ all -> 0x00d7 }
            com.google.android.gms.internal.cb r1 = new com.google.android.gms.internal.cb     // Catch:{ all -> 0x00d7 }
            r2 = 0
            r1.<init>(r2)     // Catch:{ all -> 0x00d7 }
            r0.disconnect()     // Catch:{ IOException -> 0x00b4 }
            r0 = r1
            goto L_0x0046
        L_0x00ac:
            r3.mo3656d(r5)     // Catch:{ all -> 0x00d7 }
            r0.disconnect()     // Catch:{ IOException -> 0x00b4 }
            goto L_0x000f
        L_0x00b4:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Error while connecting to ad server: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            com.google.android.gms.internal.C0502ct.m1156v(r0)
            com.google.android.gms.internal.cb r0 = new com.google.android.gms.internal.cb
            r1 = 2
            r0.<init>(r1)
            goto L_0x0046
        L_0x00d7:
            r1 = move-exception
            r0.disconnect()     // Catch:{ IOException -> 0x00b4 }
            throw r1     // Catch:{ IOException -> 0x00b4 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.C0479ce.m1064a(android.content.Context, java.lang.String, java.lang.String):com.google.android.gms.internal.cb");
    }

    /* renamed from: a */
    public static C0479ce m1065a(Context context, C0381aq aqVar) {
        C0479ce ceVar;
        synchronized (f1264hC) {
            if (f1265hD == null) {
                f1265hD = new C0479ce(context.getApplicationContext(), aqVar);
            }
            ceVar = f1265hD;
        }
        return ceVar;
    }

    /* renamed from: a */
    private static void m1066a(String str, Map<String, List<String>> map, String str2, int i) {
        if (C0502ct.m1151n(2)) {
            C0502ct.m1155u("Http Response: {\n  URL:\n    " + str + "\n  Headers:");
            if (map != null) {
                for (String str3 : map.keySet()) {
                    C0502ct.m1155u("    " + str3 + ":");
                    for (String str4 : (List) map.get(str3)) {
                        C0502ct.m1155u("      " + str4);
                    }
                }
            }
            C0502ct.m1155u("  Body:");
            if (str2 != null) {
                for (int i2 = 0; i2 < Math.min(str2.length(), 100000); i2 += 1000) {
                    C0502ct.m1155u(str2.substring(i2, Math.min(str2.length(), i2 + 1000)));
                }
            } else {
                C0502ct.m1155u("    null");
            }
            C0502ct.m1155u("  Response Code:\n    " + i + "\n}");
        }
    }

    /* renamed from: b */
    public C0474cb mo3646b(C0470bz bzVar) {
        return m1063a(this.mContext, this.f1266hE, bzVar);
    }
}
