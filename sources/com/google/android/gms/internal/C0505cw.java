package com.google.android.gms.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;
import android.net.Uri;
import android.os.Build.VERSION;
import android.view.MotionEvent;
import android.webkit.DownloadListener;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.android.gms.drive.DriveFile;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;

/* renamed from: com.google.android.gms.internal.cw */
public final class C0505cw extends WebView implements DownloadListener {

    /* renamed from: fU */
    private C0964x f1350fU;

    /* renamed from: fV */
    private final C0503cu f1351fV;

    /* renamed from: fx */
    private final Object f1352fx = new Object();

    /* renamed from: he */
    private final C0830h f1353he;

    /* renamed from: iN */
    private final C0507cx f1354iN;

    /* renamed from: iO */
    private final C0506a f1355iO;

    /* renamed from: iP */
    private C0437bk f1356iP;

    /* renamed from: iQ */
    private boolean f1357iQ;

    /* renamed from: iR */
    private boolean f1358iR;

    /* renamed from: com.google.android.gms.internal.cw$a */
    private static class C0506a extends MutableContextWrapper {

        /* renamed from: iS */
        private Activity f1359iS;

        /* renamed from: iT */
        private Context f1360iT;

        public C0506a(Context context) {
            super(context);
            setBaseContext(context);
        }

        public void setBaseContext(Context base) {
            this.f1360iT = base.getApplicationContext();
            this.f1359iS = base instanceof Activity ? (Activity) base : null;
            super.setBaseContext(this.f1360iT);
        }

        public void startActivity(Intent intent) {
            if (this.f1359iS != null) {
                this.f1359iS.startActivity(intent);
                return;
            }
            intent.setFlags(DriveFile.MODE_READ_ONLY);
            this.f1360iT.startActivity(intent);
        }
    }

    private C0505cw(C0506a aVar, C0964x xVar, boolean z, boolean z2, C0830h hVar, C0503cu cuVar) {
        super(aVar);
        this.f1355iO = aVar;
        this.f1350fU = xVar;
        this.f1357iQ = z;
        this.f1353he = hVar;
        this.f1351fV = cuVar;
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        C0495co.m1110a((Context) aVar, cuVar.f1346iJ, settings);
        if (VERSION.SDK_INT >= 17) {
            C0499cq.m1138a(getContext(), settings);
        } else if (VERSION.SDK_INT >= 11) {
            C0498cp.m1132a(getContext(), settings);
        }
        setDownloadListener(this);
        if (VERSION.SDK_INT >= 11) {
            this.f1354iN = new C0518cz(this, z2);
        } else {
            this.f1354iN = new C0507cx(this, z2);
        }
        setWebViewClient(this.f1354iN);
        if (VERSION.SDK_INT >= 14) {
            setWebChromeClient(new C0520da(this));
        } else if (VERSION.SDK_INT >= 11) {
            setWebChromeClient(new C0510cy(this));
        }
        m1161aG();
    }

    /* renamed from: a */
    public static C0505cw m1160a(Context context, C0964x xVar, boolean z, boolean z2, C0830h hVar, C0503cu cuVar) {
        return new C0505cw(new C0506a(context), xVar, z, z2, hVar, cuVar);
    }

    /* renamed from: aG */
    private void m1161aG() {
        synchronized (this.f1352fx) {
            if (this.f1357iQ || this.f1350fU.f2419eG) {
                if (VERSION.SDK_INT < 14) {
                    C0502ct.m1152r("Disabling hardware acceleration on an overlay.");
                    m1162aH();
                } else {
                    C0502ct.m1152r("Enabling hardware acceleration on an overlay.");
                    m1163aI();
                }
            } else if (VERSION.SDK_INT < 18) {
                C0502ct.m1152r("Disabling hardware acceleration on an AdView.");
                m1162aH();
            } else {
                C0502ct.m1152r("Enabling hardware acceleration on an AdView.");
                m1163aI();
            }
        }
    }

    /* renamed from: aH */
    private void m1162aH() {
        synchronized (this.f1352fx) {
            if (!this.f1358iR && VERSION.SDK_INT >= 11) {
                C0498cp.m1136c(this);
            }
            this.f1358iR = true;
        }
    }

    /* renamed from: aI */
    private void m1163aI() {
        synchronized (this.f1352fx) {
            if (this.f1358iR && VERSION.SDK_INT >= 11) {
                C0498cp.m1137d(this);
            }
            this.f1358iR = false;
        }
    }

    /* renamed from: a */
    public void mo3670a(Context context, C0964x xVar) {
        synchronized (this.f1352fx) {
            this.f1355iO.setBaseContext(context);
            this.f1356iP = null;
            this.f1350fU = xVar;
            this.f1357iQ = false;
            C0495co.m1123b(this);
            loadUrl("about:blank");
            this.f1354iN.reset();
        }
    }

    /* renamed from: a */
    public void mo3671a(C0437bk bkVar) {
        synchronized (this.f1352fx) {
            this.f1356iP = bkVar;
        }
    }

    /* renamed from: a */
    public void mo3672a(C0964x xVar) {
        synchronized (this.f1352fx) {
            this.f1350fU = xVar;
            requestLayout();
        }
    }

    /* renamed from: a */
    public void mo3673a(String str, Map<String, ?> map) {
        StringBuilder sb = new StringBuilder();
        sb.append("javascript:AFMA_ReceiveMessage('");
        sb.append(str);
        sb.append("'");
        if (map != null) {
            try {
                String jSONObject = C0495co.m1129m(map).toString();
                sb.append(",");
                sb.append(jSONObject);
            } catch (JSONException e) {
                C0502ct.m1156v("Could not convert AFMA event parameters to JSON.");
                return;
            }
        }
        sb.append(");");
        C0502ct.m1155u("Dispatching AFMA event: " + sb);
        loadUrl(sb.toString());
    }

    /* renamed from: aA */
    public void mo3674aA() {
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.f1351fV.f1346iJ);
        mo3673a("onshow", (Map<String, ?>) hashMap);
    }

    /* renamed from: aB */
    public C0437bk mo3675aB() {
        C0437bk bkVar;
        synchronized (this.f1352fx) {
            bkVar = this.f1356iP;
        }
        return bkVar;
    }

    /* renamed from: aC */
    public C0507cx mo3676aC() {
        return this.f1354iN;
    }

    /* renamed from: aD */
    public C0830h mo3677aD() {
        return this.f1353he;
    }

    /* renamed from: aE */
    public C0503cu mo3678aE() {
        return this.f1351fV;
    }

    /* renamed from: aF */
    public boolean mo3679aF() {
        boolean z;
        synchronized (this.f1352fx) {
            z = this.f1357iQ;
        }
        return z;
    }

    /* renamed from: az */
    public void mo3680az() {
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.f1351fV.f1346iJ);
        mo3673a("onhide", (Map<String, ?>) hashMap);
    }

    /* renamed from: l */
    public void mo3681l(boolean z) {
        synchronized (this.f1352fx) {
            this.f1357iQ = z;
            m1161aG();
        }
    }

    public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimeType, long size) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(url), mimeType);
            getContext().startActivity(intent);
        } catch (ActivityNotFoundException e) {
            C0502ct.m1152r("Couldn't find an Activity to view url/mimetype: " + url + " / " + mimeType);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r10, int r11) {
        /*
            r9 = this;
            r0 = 2147483647(0x7fffffff, float:NaN)
            r8 = 1073741824(0x40000000, float:2.0)
            r7 = 8
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            java.lang.Object r4 = r9.f1352fx
            monitor-enter(r4)
            boolean r1 = r9.isInEditMode()     // Catch:{ all -> 0x0094 }
            if (r1 != 0) goto L_0x0016
            boolean r1 = r9.f1357iQ     // Catch:{ all -> 0x0094 }
            if (r1 == 0) goto L_0x001b
        L_0x0016:
            super.onMeasure(r10, r11)     // Catch:{ all -> 0x0094 }
            monitor-exit(r4)     // Catch:{ all -> 0x0094 }
        L_0x001a:
            return
        L_0x001b:
            int r2 = android.view.View.MeasureSpec.getMode(r10)     // Catch:{ all -> 0x0094 }
            int r3 = android.view.View.MeasureSpec.getSize(r10)     // Catch:{ all -> 0x0094 }
            int r5 = android.view.View.MeasureSpec.getMode(r11)     // Catch:{ all -> 0x0094 }
            int r1 = android.view.View.MeasureSpec.getSize(r11)     // Catch:{ all -> 0x0094 }
            if (r2 == r6) goto L_0x002f
            if (r2 != r8) goto L_0x00ad
        L_0x002f:
            r2 = r3
        L_0x0030:
            if (r5 == r6) goto L_0x0034
            if (r5 != r8) goto L_0x0035
        L_0x0034:
            r0 = r1
        L_0x0035:
            com.google.android.gms.internal.x r5 = r9.f1350fU     // Catch:{ all -> 0x0094 }
            int r5 = r5.widthPixels     // Catch:{ all -> 0x0094 }
            if (r5 > r2) goto L_0x0041
            com.google.android.gms.internal.x r2 = r9.f1350fU     // Catch:{ all -> 0x0094 }
            int r2 = r2.heightPixels     // Catch:{ all -> 0x0094 }
            if (r2 <= r0) goto L_0x0097
        L_0x0041:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0094 }
            r0.<init>()     // Catch:{ all -> 0x0094 }
            java.lang.String r2 = "Not enough space to show ad. Needs "
            java.lang.StringBuilder r0 = r0.append(r2)     // Catch:{ all -> 0x0094 }
            com.google.android.gms.internal.x r2 = r9.f1350fU     // Catch:{ all -> 0x0094 }
            int r2 = r2.widthPixels     // Catch:{ all -> 0x0094 }
            java.lang.StringBuilder r0 = r0.append(r2)     // Catch:{ all -> 0x0094 }
            java.lang.String r2 = "x"
            java.lang.StringBuilder r0 = r0.append(r2)     // Catch:{ all -> 0x0094 }
            com.google.android.gms.internal.x r2 = r9.f1350fU     // Catch:{ all -> 0x0094 }
            int r2 = r2.heightPixels     // Catch:{ all -> 0x0094 }
            java.lang.StringBuilder r0 = r0.append(r2)     // Catch:{ all -> 0x0094 }
            java.lang.String r2 = " pixels, but only has "
            java.lang.StringBuilder r0 = r0.append(r2)     // Catch:{ all -> 0x0094 }
            java.lang.StringBuilder r0 = r0.append(r3)     // Catch:{ all -> 0x0094 }
            java.lang.String r2 = "x"
            java.lang.StringBuilder r0 = r0.append(r2)     // Catch:{ all -> 0x0094 }
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch:{ all -> 0x0094 }
            java.lang.String r1 = " pixels."
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch:{ all -> 0x0094 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0094 }
            com.google.android.gms.internal.C0502ct.m1156v(r0)     // Catch:{ all -> 0x0094 }
            int r0 = r9.getVisibility()     // Catch:{ all -> 0x0094 }
            if (r0 == r7) goto L_0x008d
            r0 = 4
            r9.setVisibility(r0)     // Catch:{ all -> 0x0094 }
        L_0x008d:
            r0 = 0
            r1 = 0
            r9.setMeasuredDimension(r0, r1)     // Catch:{ all -> 0x0094 }
        L_0x0092:
            monitor-exit(r4)     // Catch:{ all -> 0x0094 }
            goto L_0x001a
        L_0x0094:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0094 }
            throw r0
        L_0x0097:
            int r0 = r9.getVisibility()     // Catch:{ all -> 0x0094 }
            if (r0 == r7) goto L_0x00a1
            r0 = 0
            r9.setVisibility(r0)     // Catch:{ all -> 0x0094 }
        L_0x00a1:
            com.google.android.gms.internal.x r0 = r9.f1350fU     // Catch:{ all -> 0x0094 }
            int r0 = r0.widthPixels     // Catch:{ all -> 0x0094 }
            com.google.android.gms.internal.x r1 = r9.f1350fU     // Catch:{ all -> 0x0094 }
            int r1 = r1.heightPixels     // Catch:{ all -> 0x0094 }
            r9.setMeasuredDimension(r0, r1)     // Catch:{ all -> 0x0094 }
            goto L_0x0092
        L_0x00ad:
            r2 = r0
            goto L_0x0030
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.C0505cw.onMeasure(int, int):void");
    }

    public boolean onTouchEvent(MotionEvent event) {
        if (this.f1353he != null) {
            this.f1353he.mo4597a(event);
        }
        return super.onTouchEvent(event);
    }

    public void setContext(Context context) {
        this.f1355iO.setBaseContext(context);
    }

    /* renamed from: y */
    public C0964x mo3686y() {
        C0964x xVar;
        synchronized (this.f1352fx) {
            xVar = this.f1350fU;
        }
        return xVar;
    }
}
