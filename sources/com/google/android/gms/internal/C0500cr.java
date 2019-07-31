package com.google.android.gms.internal;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.cr */
public final class C0500cr extends C0490cm {

    /* renamed from: iG */
    private final String f1343iG;

    /* renamed from: iH */
    private final String f1344iH;
    private final Context mContext;

    public C0500cr(Context context, String str, String str2) {
        this.mContext = context;
        this.f1343iG = str;
        this.f1344iH = str2;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: ai */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3624ai() {
        /*
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0064 }
            r0.<init>()     // Catch:{ IOException -> 0x0064 }
            java.lang.String r1 = "Pinging URL: "
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch:{ IOException -> 0x0064 }
            java.lang.String r1 = r4.f1344iH     // Catch:{ IOException -> 0x0064 }
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch:{ IOException -> 0x0064 }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x0064 }
            com.google.android.gms.internal.C0502ct.m1155u(r0)     // Catch:{ IOException -> 0x0064 }
            java.net.URL r0 = new java.net.URL     // Catch:{ IOException -> 0x0064 }
            java.lang.String r1 = r4.f1344iH     // Catch:{ IOException -> 0x0064 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0064 }
            java.net.URLConnection r0 = r0.openConnection()     // Catch:{ IOException -> 0x0064 }
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ IOException -> 0x0064 }
            android.content.Context r1 = r4.mContext     // Catch:{ all -> 0x005f }
            java.lang.String r2 = r4.f1343iG     // Catch:{ all -> 0x005f }
            r3 = 1
            com.google.android.gms.internal.C0495co.m1112a(r1, r2, r3, r0)     // Catch:{ all -> 0x005f }
            int r1 = r0.getResponseCode()     // Catch:{ all -> 0x005f }
            r2 = 200(0xc8, float:2.8E-43)
            if (r1 < r2) goto L_0x0039
            r2 = 300(0x12c, float:4.2E-43)
            if (r1 < r2) goto L_0x005b
        L_0x0039:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x005f }
            r2.<init>()     // Catch:{ all -> 0x005f }
            java.lang.String r3 = "Received non-success response code "
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch:{ all -> 0x005f }
            java.lang.StringBuilder r1 = r2.append(r1)     // Catch:{ all -> 0x005f }
            java.lang.String r2 = " from pinging URL: "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ all -> 0x005f }
            java.lang.String r2 = r4.f1344iH     // Catch:{ all -> 0x005f }
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ all -> 0x005f }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x005f }
            com.google.android.gms.internal.C0502ct.m1156v(r1)     // Catch:{ all -> 0x005f }
        L_0x005b:
            r0.disconnect()     // Catch:{ IOException -> 0x0064 }
        L_0x005e:
            return
        L_0x005f:
            r1 = move-exception
            r0.disconnect()     // Catch:{ IOException -> 0x0064 }
            throw r1     // Catch:{ IOException -> 0x0064 }
        L_0x0064:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Error while pinging URL: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = r4.f1344iH
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ". "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            com.google.android.gms.internal.C0502ct.m1156v(r0)
            goto L_0x005e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.C0500cr.mo3624ai():void");
    }

    public void onStop() {
    }
}
