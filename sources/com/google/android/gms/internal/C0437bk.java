package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p000v4.view.ViewCompat;
import android.support.p000v4.view.accessibility.AccessibilityEventCompat;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.internal.C0451bs.C0452a;
import com.google.android.gms.internal.C0507cx.C0509a;

/* renamed from: com.google.android.gms.internal.bk */
public final class C0437bk extends C0452a {

    /* renamed from: gA */
    private boolean f1172gA = false;

    /* renamed from: gB */
    private boolean f1173gB = false;

    /* renamed from: gC */
    private RelativeLayout f1174gC;

    /* renamed from: gs */
    private final Activity f1175gs;

    /* renamed from: gt */
    private C0442bm f1176gt;

    /* renamed from: gu */
    private C0444bo f1177gu;

    /* renamed from: gv */
    private C0505cw f1178gv;

    /* renamed from: gw */
    private C0440b f1179gw;

    /* renamed from: gx */
    private C0447bp f1180gx;

    /* renamed from: gy */
    private FrameLayout f1181gy;

    /* renamed from: gz */
    private CustomViewCallback f1182gz;

    /* renamed from: com.google.android.gms.internal.bk$a */
    private static final class C0439a extends Exception {
        public C0439a(String str) {
            super(str);
        }
    }

    /* renamed from: com.google.android.gms.internal.bk$b */
    private static final class C0440b {

        /* renamed from: gE */
        public final LayoutParams f1184gE;

        /* renamed from: gF */
        public final ViewGroup f1185gF;
        public final int index;

        public C0440b(C0505cw cwVar) throws C0439a {
            this.f1184gE = cwVar.getLayoutParams();
            ViewParent parent = cwVar.getParent();
            if (parent instanceof ViewGroup) {
                this.f1185gF = (ViewGroup) parent;
                this.index = this.f1185gF.indexOfChild(cwVar);
                this.f1185gF.removeView(cwVar);
                cwVar.mo3681l(true);
                return;
            }
            throw new C0439a("Could not get the parent of the WebView for an overlay.");
        }
    }

    public C0437bk(Activity activity) {
        this.f1175gs = activity;
    }

    /* renamed from: Z */
    private void m973Z() {
        if (this.f1175gs.isFinishing() && !this.f1173gB) {
            this.f1173gB = true;
            if (this.f1175gs.isFinishing()) {
                if (this.f1178gv != null) {
                    this.f1178gv.mo3680az();
                    this.f1174gC.removeView(this.f1178gv);
                    if (this.f1179gw != null) {
                        this.f1178gv.mo3681l(false);
                        this.f1179gw.f1185gF.addView(this.f1178gv, this.f1179gw.index, this.f1179gw.f1184gE);
                    }
                }
                if (this.f1176gt != null && this.f1176gt.f1189gI != null) {
                    this.f1176gt.f1189gI.mo3595A();
                }
            }
        }
    }

    /* renamed from: a */
    private static RelativeLayout.LayoutParams m974a(int i, int i2, int i3, int i4) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i3, i4);
        layoutParams.setMargins(i, i2, 0, 0);
        layoutParams.addRule(10);
        layoutParams.addRule(9);
        return layoutParams;
    }

    /* renamed from: a */
    public static void m975a(Context context, C0442bm bmVar) {
        Intent intent = new Intent();
        intent.setClassName(context, AdActivity.CLASS_NAME);
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", bmVar.f1186ej.f1349iM);
        C0442bm.m990a(intent, bmVar);
        intent.addFlags(AccessibilityEventCompat.TYPE_GESTURE_DETECTION_END);
        context.startActivity(intent);
    }

    /* renamed from: h */
    private void m976h(boolean z) throws C0439a {
        this.f1175gs.requestWindowFeature(1);
        Window window = this.f1175gs.getWindow();
        window.setFlags(1024, 1024);
        setRequestedOrientation(this.f1176gt.orientation);
        if (VERSION.SDK_INT >= 11) {
            C0502ct.m1152r("Enabling hardware acceleration on the AdActivity window.");
            C0498cp.m1133a(window);
        }
        this.f1174gC = new RelativeLayout(this.f1175gs);
        this.f1174gC.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        this.f1175gs.setContentView(this.f1174gC);
        boolean aJ = this.f1176gt.f1190gJ.mo3676aC().mo3697aJ();
        if (z) {
            this.f1178gv = C0505cw.m1160a(this.f1175gs, this.f1176gt.f1190gJ.mo3686y(), true, aJ, null, this.f1176gt.f1186ej);
            this.f1178gv.mo3676aC().mo3692a(null, null, this.f1176gt.f1191gK, this.f1176gt.f1195gO, true);
            this.f1178gv.mo3676aC().mo3691a((C0509a) new C0509a() {
                /* renamed from: a */
                public void mo3583a(C0505cw cwVar) {
                    cwVar.mo3674aA();
                }
            });
            if (this.f1176gt.f1197go != null) {
                this.f1178gv.loadUrl(this.f1176gt.f1197go);
            } else if (this.f1176gt.f1194gN != null) {
                this.f1178gv.loadDataWithBaseURL(this.f1176gt.f1192gL, this.f1176gt.f1194gN, "text/html", "UTF-8", null);
            } else {
                throw new C0439a("No URL or HTML to display in ad overlay.");
            }
        } else {
            this.f1178gv = this.f1176gt.f1190gJ;
            this.f1178gv.setContext(this.f1175gs);
        }
        this.f1178gv.mo3671a(this);
        this.f1174gC.addView(this.f1178gv, -1, -1);
        if (!z) {
            this.f1178gv.mo3674aA();
        }
        mo3572f(aJ);
    }

    /* renamed from: W */
    public C0444bo mo3565W() {
        return this.f1177gu;
    }

    /* renamed from: X */
    public void mo3566X() {
        if (this.f1176gt != null) {
            setRequestedOrientation(this.f1176gt.orientation);
        }
        if (this.f1181gy != null) {
            this.f1175gs.setContentView(this.f1174gC);
            this.f1181gy.removeAllViews();
            this.f1181gy = null;
        }
        if (this.f1182gz != null) {
            this.f1182gz.onCustomViewHidden();
            this.f1182gz = null;
        }
    }

    /* renamed from: Y */
    public void mo3567Y() {
        this.f1174gC.removeView(this.f1180gx);
        mo3572f(true);
    }

    /* renamed from: a */
    public void mo3568a(View view, CustomViewCallback customViewCallback) {
        this.f1181gy = new FrameLayout(this.f1175gs);
        this.f1181gy.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        this.f1181gy.addView(view, -1, -1);
        this.f1175gs.setContentView(this.f1181gy);
        this.f1182gz = customViewCallback;
    }

    /* renamed from: b */
    public void mo3569b(int i, int i2, int i3, int i4) {
        if (this.f1177gu != null) {
            this.f1177gu.setLayoutParams(m974a(i, i2, i3, i4));
        }
    }

    /* renamed from: c */
    public void mo3570c(int i, int i2, int i3, int i4) {
        if (this.f1177gu == null) {
            this.f1177gu = new C0444bo(this.f1175gs, this.f1178gv);
            this.f1174gC.addView(this.f1177gu, 0, m974a(i, i2, i3, i4));
            this.f1178gv.mo3676aC().mo3698m(false);
        }
    }

    public void close() {
        this.f1175gs.finish();
    }

    /* renamed from: f */
    public void mo3572f(boolean z) {
        this.f1180gx = new C0447bp(this.f1175gs, z ? 50 : 32);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(z ? 11 : 9);
        this.f1180gx.mo3612g(this.f1176gt.f1193gM);
        this.f1174gC.addView(this.f1180gx, layoutParams);
    }

    /* renamed from: g */
    public void mo3573g(boolean z) {
        if (this.f1180gx != null) {
            this.f1180gx.mo3612g(z);
        }
    }

    public void onCreate(Bundle savedInstanceState) {
        boolean z = false;
        if (savedInstanceState != null) {
            z = savedInstanceState.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        }
        this.f1172gA = z;
        try {
            this.f1176gt = C0442bm.m989a(this.f1175gs.getIntent());
            if (this.f1176gt == null) {
                throw new C0439a("Could not get info for ad overlay.");
            }
            if (savedInstanceState == null) {
                if (this.f1176gt.f1189gI != null) {
                    this.f1176gt.f1189gI.mo3596B();
                }
                if (!(this.f1176gt.f1196gP == 1 || this.f1176gt.f1188gH == null)) {
                    this.f1176gt.f1188gH.mo5258w();
                }
            }
            switch (this.f1176gt.f1196gP) {
                case 1:
                    m976h(false);
                    return;
                case 2:
                    this.f1179gw = new C0440b(this.f1176gt.f1190gJ);
                    m976h(false);
                    return;
                case 3:
                    m976h(true);
                    return;
                case 4:
                    if (this.f1172gA) {
                        this.f1175gs.finish();
                        return;
                    } else if (!C0434bh.m969a(this.f1175gs, this.f1176gt.f1187gG, this.f1176gt.f1195gO)) {
                        this.f1175gs.finish();
                        return;
                    } else {
                        return;
                    }
                default:
                    throw new C0439a("Could not determine ad overlay type.");
            }
        } catch (C0439a e) {
            C0502ct.m1156v(e.getMessage());
            this.f1175gs.finish();
        }
    }

    public void onDestroy() {
        if (this.f1177gu != null) {
            this.f1177gu.destroy();
        }
        if (this.f1178gv != null) {
            this.f1174gC.removeView(this.f1178gv);
        }
        m973Z();
    }

    public void onPause() {
        if (this.f1177gu != null) {
            this.f1177gu.pause();
        }
        mo3566X();
        if (this.f1178gv != null && (!this.f1175gs.isFinishing() || this.f1179gw == null)) {
            C0495co.m1113a((WebView) this.f1178gv);
        }
        m973Z();
    }

    public void onRestart() {
    }

    public void onResume() {
        if (this.f1176gt != null && this.f1176gt.f1196gP == 4) {
            if (this.f1172gA) {
                this.f1175gs.finish();
            } else {
                this.f1172gA = true;
            }
        }
        if (this.f1178gv != null) {
            C0495co.m1123b(this.f1178gv);
        }
    }

    public void onSaveInstanceState(Bundle outBundle) {
        outBundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f1172gA);
    }

    public void onStart() {
    }

    public void onStop() {
        m973Z();
    }

    public void setRequestedOrientation(int requestedOrientation) {
        this.f1175gs.setRequestedOrientation(requestedOrientation);
    }
}
