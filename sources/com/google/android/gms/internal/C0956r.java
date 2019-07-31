package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.ViewSwitcher;
import com.google.android.gms.dynamic.C0270b;
import com.google.android.gms.dynamic.C0273c;
import com.google.android.gms.internal.C0353ac.C0354a;
import com.google.android.gms.internal.C0457bu.C0458a;
import com.google.android.gms.internal.C0470bz.C0471a;

/* renamed from: com.google.android.gms.internal.r */
public final class C0956r extends C0354a implements C0369al, C0387av, C0443bn, C0448bq, C0458a, C0955q {

    /* renamed from: ed */
    private final C0410bb f2390ed;

    /* renamed from: ee */
    private final C0957a f2391ee;

    /* renamed from: ef */
    private final C0958s f2392ef = new C0958s(this);

    /* renamed from: com.google.android.gms.internal.r$a */
    private static final class C0957a {
        public final String adUnitId;

        /* renamed from: eg */
        public final ViewSwitcher f2393eg;

        /* renamed from: eh */
        public final Context f2394eh;

        /* renamed from: ei */
        public final C0830h f2395ei;

        /* renamed from: ej */
        public final C0503cu f2396ej;

        /* renamed from: ek */
        public C0350ab f2397ek;

        /* renamed from: el */
        public C0490cm f2398el;

        /* renamed from: em */
        public C0964x f2399em;

        /* renamed from: en */
        public C0487cj f2400en;

        /* renamed from: eo */
        public C0359ae f2401eo;

        public C0957a(Context context, C0964x xVar, String str, C0503cu cuVar) {
            if (xVar.f2419eG) {
                this.f2393eg = null;
            } else {
                this.f2393eg = new ViewSwitcher(context);
                this.f2393eg.setMinimumWidth(xVar.widthPixels);
                this.f2393eg.setMinimumHeight(xVar.heightPixels);
                this.f2393eg.setVisibility(4);
            }
            this.f2399em = xVar;
            this.adUnitId = str;
            this.f2394eh = context;
            this.f2395ei = new C0830h(C0765g.m2317a(cuVar.f1346iJ, context));
            this.f2396ej = cuVar;
        }
    }

    public C0956r(Context context, C0964x xVar, String str, C0410bb bbVar, C0503cu cuVar) {
        this.f2391ee = new C0957a(context, xVar, str, cuVar);
        this.f2390ed = bbVar;
        C0502ct.m1154t("Use AdRequest.Builder.addTestDevice(\"" + C0501cs.m1147l(context) + "\") to get test ads on this device.");
        C0495co.m1125i(context);
    }

    /* renamed from: I */
    private void m2973I() {
        C0502ct.m1154t("Ad closing.");
        if (this.f2391ee.f2397ek != null) {
            try {
                this.f2391ee.f2397ek.onAdClosed();
            } catch (RemoteException e) {
                C0502ct.m1150b("Could not call AdListener.onAdClosed().", e);
            }
        }
    }

    /* renamed from: J */
    private void m2974J() {
        C0502ct.m1154t("Ad leaving application.");
        if (this.f2391ee.f2397ek != null) {
            try {
                this.f2391ee.f2397ek.onAdLeftApplication();
            } catch (RemoteException e) {
                C0502ct.m1150b("Could not call AdListener.onAdLeftApplication().", e);
            }
        }
    }

    /* renamed from: K */
    private void m2975K() {
        C0502ct.m1154t("Ad opening.");
        if (this.f2391ee.f2397ek != null) {
            try {
                this.f2391ee.f2397ek.onAdOpened();
            } catch (RemoteException e) {
                C0502ct.m1150b("Could not call AdListener.onAdOpened().", e);
            }
        }
    }

    /* renamed from: L */
    private void m2976L() {
        C0502ct.m1154t("Ad finished loading.");
        if (this.f2391ee.f2397ek != null) {
            try {
                this.f2391ee.f2397ek.onAdLoaded();
            } catch (RemoteException e) {
                C0502ct.m1150b("Could not call AdListener.onAdLoaded().", e);
            }
        }
    }

    /* renamed from: M */
    private boolean m2977M() {
        boolean z = true;
        if (!C0495co.m1116a(this.f2391ee.f2394eh.getPackageManager(), this.f2391ee.f2394eh.getPackageName(), "android.permission.INTERNET")) {
            if (!this.f2391ee.f2399em.f2419eG) {
                C0501cs.m1144a(this.f2391ee.f2393eg, this.f2391ee.f2399em, "Missing internet permission in AndroidManifest.xml.", "Missing internet permission in AndroidManifest.xml. You must have the following declaration: <uses-permission android:name=\"android.permission.INTERNET\" />");
            }
            z = false;
        }
        if (!C0495co.m1124h(this.f2391ee.f2394eh)) {
            if (!this.f2391ee.f2399em.f2419eG) {
                C0501cs.m1144a(this.f2391ee.f2393eg, this.f2391ee.f2399em, "Missing AdActivity with android:configChanges in AndroidManifest.xml.", "Missing AdActivity with android:configChanges in AndroidManifest.xml. You must have the following declaration within the <application> element: <activity android:name=\"com.google.android.gms.ads.AdActivity\" android:configChanges=\"keyboard|keyboardHidden|orientation|screenLayout|uiMode|screenSize|smallestScreenSize\" />");
            }
            z = false;
        }
        if (!z && !this.f2391ee.f2399em.f2419eG) {
            this.f2391ee.f2393eg.setVisibility(0);
        }
        return z;
    }

    /* renamed from: N */
    private void m2978N() {
        if (this.f2391ee.f2400en == null) {
            C0502ct.m1156v("Ad state was null when trying to ping click URLs.");
            return;
        }
        C0502ct.m1152r("Pinging click URLs.");
        if (this.f2391ee.f2400en.f1310fK != null) {
            C0495co.m1111a(this.f2391ee.f2394eh, this.f2391ee.f2396ej.f1346iJ, this.f2391ee.f2400en.f1310fK);
        }
        if (this.f2391ee.f2400en.f1324is != null && this.f2391ee.f2400en.f1324is.f912fK != null) {
            C0393az.m924a(this.f2391ee.f2394eh, this.f2391ee.f2396ej.f1346iJ, this.f2391ee.f2400en, this.f2391ee.adUnitId, false, this.f2391ee.f2400en.f1324is.f912fK);
        }
    }

    /* renamed from: O */
    private void m2979O() {
        if (this.f2391ee.f2400en != null) {
            this.f2391ee.f2400en.f1313gJ.destroy();
            this.f2391ee.f2400en = null;
        }
    }

    /* renamed from: a */
    private void m2980a(int i) {
        C0502ct.m1156v("Failed to load ad: " + i);
        if (this.f2391ee.f2397ek != null) {
            try {
                this.f2391ee.f2397ek.onAdFailedToLoad(i);
            } catch (RemoteException e) {
                C0502ct.m1150b("Could not call AdListener.onAdFailedToLoad().", e);
            }
        }
    }

    /* renamed from: b */
    private void m2981b(View view) {
        this.f2391ee.f2393eg.addView(view, new LayoutParams(-2, -2));
    }

    /* renamed from: b */
    private void m2982b(boolean z) {
        if (this.f2391ee.f2400en == null) {
            C0502ct.m1156v("Ad state was null when trying to ping impression URLs.");
            return;
        }
        C0502ct.m1152r("Pinging Impression URLs.");
        if (this.f2391ee.f2400en.f1311fL != null) {
            C0495co.m1111a(this.f2391ee.f2394eh, this.f2391ee.f2396ej.f1346iJ, this.f2391ee.f2400en.f1311fL);
        }
        if (!(this.f2391ee.f2400en.f1324is == null || this.f2391ee.f2400en.f1324is.f913fL == null)) {
            C0393az.m924a(this.f2391ee.f2394eh, this.f2391ee.f2396ej.f1346iJ, this.f2391ee.f2400en, this.f2391ee.adUnitId, z, this.f2391ee.f2400en.f1324is.f913fL);
        }
        if (this.f2391ee.f2400en.f1314gb != null && this.f2391ee.f2400en.f1314gb.f908fG != null) {
            C0393az.m924a(this.f2391ee.f2394eh, this.f2391ee.f2396ej.f1346iJ, this.f2391ee.f2400en, this.f2391ee.adUnitId, z, this.f2391ee.f2400en.f1314gb.f908fG);
        }
    }

    /* renamed from: b */
    private boolean m2983b(C0487cj cjVar) {
        if (cjVar.f1322hy) {
            try {
                View view = (View) C0273c.m633b(cjVar.f1315gc.getView());
                View nextView = this.f2391ee.f2393eg.getNextView();
                if (nextView != null) {
                    this.f2391ee.f2393eg.removeView(nextView);
                }
                try {
                    m2981b(view);
                } catch (Throwable th) {
                    C0502ct.m1150b("Could not add mediation view to view hierarchy.", th);
                    return false;
                }
            } catch (RemoteException e) {
                C0502ct.m1150b("Could not get View from mediation adapter.", e);
                return false;
            }
        } else if (cjVar.f1325it != null) {
            cjVar.f1313gJ.mo3672a(cjVar.f1325it);
            this.f2391ee.f2393eg.removeAllViews();
            this.f2391ee.f2393eg.setMinimumWidth(cjVar.f1325it.widthPixels);
            this.f2391ee.f2393eg.setMinimumHeight(cjVar.f1325it.heightPixels);
            m2981b((View) cjVar.f1313gJ);
        }
        if (this.f2391ee.f2393eg.getChildCount() > 1) {
            this.f2391ee.f2393eg.showNext();
        }
        if (this.f2391ee.f2400en != null) {
            View nextView2 = this.f2391ee.f2393eg.getNextView();
            if (nextView2 instanceof C0505cw) {
                ((C0505cw) nextView2).mo3670a(this.f2391ee.f2394eh, this.f2391ee.f2399em);
            } else if (nextView2 != null) {
                this.f2391ee.f2393eg.removeView(nextView2);
            }
            if (this.f2391ee.f2400en.f1315gc != null) {
                try {
                    this.f2391ee.f2400en.f1315gc.destroy();
                } catch (RemoteException e2) {
                    C0502ct.m1156v("Could not destroy previous mediation adapter.");
                }
            }
        }
        this.f2391ee.f2393eg.setVisibility(0);
        return true;
    }

    /* renamed from: c */
    private C0471a m2984c(C0962v vVar) {
        PackageInfo packageInfo;
        Bundle bundle;
        ApplicationInfo applicationInfo = this.f2391ee.f2394eh.getApplicationInfo();
        try {
            packageInfo = this.f2391ee.f2394eh.getPackageManager().getPackageInfo(applicationInfo.packageName, 0);
        } catch (NameNotFoundException e) {
            packageInfo = null;
        }
        if (this.f2391ee.f2399em.f2419eG || this.f2391ee.f2393eg.getParent() == null) {
            bundle = null;
        } else {
            int[] iArr = new int[2];
            this.f2391ee.f2393eg.getLocationOnScreen(iArr);
            int i = iArr[0];
            int i2 = iArr[1];
            DisplayMetrics displayMetrics = this.f2391ee.f2394eh.getResources().getDisplayMetrics();
            int width = this.f2391ee.f2393eg.getWidth();
            int height = this.f2391ee.f2393eg.getHeight();
            int i3 = (!this.f2391ee.f2393eg.isShown() || i + width <= 0 || i2 + height <= 0 || i > displayMetrics.widthPixels || i2 > displayMetrics.heightPixels) ? 0 : 1;
            bundle = new Bundle(5);
            bundle.putInt("x", i);
            bundle.putInt("y", i2);
            bundle.putInt("width", width);
            bundle.putInt("height", height);
            bundle.putInt("visible", i3);
        }
        return new C0471a(bundle, vVar, this.f2391ee.f2399em, this.f2391ee.adUnitId, applicationInfo, packageInfo, C0488ck.m1100ar(), C0488ck.f1327iu, this.f2391ee.f2396ej);
    }

    /* renamed from: A */
    public void mo3595A() {
        if (this.f2391ee.f2399em.f2419eG) {
            m2979O();
        }
        m2973I();
    }

    /* renamed from: B */
    public void mo3596B() {
        if (this.f2391ee.f2399em.f2419eG) {
            m2982b(false);
        }
        m2975K();
    }

    /* renamed from: C */
    public void mo3511C() {
        mo5258w();
    }

    /* renamed from: D */
    public void mo3512D() {
        mo3595A();
    }

    /* renamed from: E */
    public void mo3513E() {
        mo3614z();
    }

    /* renamed from: F */
    public void mo3514F() {
        mo3596B();
    }

    /* renamed from: G */
    public void mo3515G() {
        if (this.f2391ee.f2400en != null) {
            C0502ct.m1156v("Mediation adapter " + this.f2391ee.f2400en.f1316gd + " refreshed, but mediation adapters should never refresh.");
        }
        m2982b(true);
        m2976L();
    }

    /* renamed from: H */
    public void mo3431H() {
        C0600eg.m1547N("recordManualImpression must be called on the main UI thread.");
        if (this.f2391ee.f2400en == null) {
            C0502ct.m1156v("Ad state was null when trying to ping manual tracking URLs.");
            return;
        }
        C0502ct.m1152r("Pinging manual tracking URLs.");
        if (this.f2391ee.f2400en.f1318hA != null) {
            C0495co.m1111a(this.f2391ee.f2394eh, this.f2391ee.f2396ej.f1346iJ, this.f2391ee.f2400en.f1318hA);
        }
    }

    /* renamed from: a */
    public void mo3432a(C0350ab abVar) {
        C0600eg.m1547N("setAdListener must be called on the main UI thread.");
        this.f2391ee.f2397ek = abVar;
    }

    /* renamed from: a */
    public void mo3433a(C0359ae aeVar) {
        C0600eg.m1547N("setAppEventListener must be called on the main UI thread.");
        this.f2391ee.f2401eo = aeVar;
    }

    /* renamed from: a */
    public void mo3622a(C0487cj cjVar) {
        this.f2391ee.f2398el = null;
        if (cjVar.errorCode != -1) {
            boolean z = cjVar.f1319hr.extras != null ? cjVar.f1319hr.extras.getBoolean("_noRefresh", false) : false;
            if (this.f2391ee.f2399em.f2419eG) {
                C0495co.m1113a((WebView) cjVar.f1313gJ);
            } else if (!z) {
                if (cjVar.f1312fO > 0) {
                    this.f2392ef.mo5260a(cjVar.f1319hr, cjVar.f1312fO);
                } else if (cjVar.f1324is != null && cjVar.f1324is.f916fO > 0) {
                    this.f2392ef.mo5260a(cjVar.f1319hr, cjVar.f1324is.f916fO);
                } else if (!cjVar.f1322hy && cjVar.errorCode == 2) {
                    this.f2392ef.mo5262d(cjVar.f1319hr);
                }
            }
            if (!(cjVar.errorCode != 3 || cjVar.f1324is == null || cjVar.f1324is.f914fM == null)) {
                C0502ct.m1152r("Pinging no fill URLs.");
                C0393az.m924a(this.f2391ee.f2394eh, this.f2391ee.f2396ej.f1346iJ, cjVar, this.f2391ee.adUnitId, false, cjVar.f1324is.f914fM);
            }
            if (cjVar.errorCode != -2) {
                m2980a(cjVar.errorCode);
            } else if (this.f2391ee.f2399em.f2419eG || m2983b(cjVar)) {
                if (!(this.f2391ee.f2400en == null || this.f2391ee.f2400en.f1317ge == null)) {
                    this.f2391ee.f2400en.f1317ge.mo3516a((C0387av) null);
                }
                if (cjVar.f1317ge != null) {
                    cjVar.f1317ge.mo3516a((C0387av) this);
                }
                this.f2391ee.f2400en = cjVar;
                if (cjVar.f1325it != null) {
                    this.f2391ee.f2399em = cjVar.f1325it;
                }
                if (!this.f2391ee.f2399em.f2419eG) {
                    m2982b(false);
                }
                m2976L();
            } else {
                m2980a(0);
            }
        }
    }

    /* renamed from: a */
    public void mo3434a(C0964x xVar) {
        C0600eg.m1547N("setAdSize must be called on the main UI thread.");
        this.f2391ee.f2399em = xVar;
        if (this.f2391ee.f2400en != null) {
            this.f2391ee.f2400en.f1313gJ.mo3672a(xVar);
        }
        if (this.f2391ee.f2393eg.getChildCount() > 1) {
            this.f2391ee.f2393eg.removeView(this.f2391ee.f2393eg.getNextView());
        }
        this.f2391ee.f2393eg.setMinimumWidth(xVar.widthPixels);
        this.f2391ee.f2393eg.setMinimumHeight(xVar.heightPixels);
        this.f2391ee.f2393eg.requestLayout();
    }

    /* renamed from: a */
    public boolean mo3435a(C0962v vVar) {
        C0505cw a;
        C0505cw cwVar;
        C0600eg.m1547N("loadAd must be called on the main UI thread.");
        if (this.f2391ee.f2398el != null) {
            C0502ct.m1156v("An ad request is already in progress. Aborting.");
            return false;
        } else if (this.f2391ee.f2399em.f2419eG && this.f2391ee.f2400en != null) {
            C0502ct.m1156v("An interstitial is already loading. Aborting.");
            return false;
        } else if (!m2977M()) {
            return false;
        } else {
            C0502ct.m1154t("Starting ad request.");
            this.f2392ef.cancel();
            C0471a c = m2984c(vVar);
            if (this.f2391ee.f2399em.f2419eG) {
                C0505cw a2 = C0505cw.m1160a(this.f2391ee.f2394eh, this.f2391ee.f2399em, false, false, this.f2391ee.f2395ei, this.f2391ee.f2396ej);
                a2.mo3676aC().mo3692a(this, null, this, this, true);
                cwVar = a2;
            } else {
                View nextView = this.f2391ee.f2393eg.getNextView();
                if (nextView instanceof C0505cw) {
                    a = (C0505cw) nextView;
                    a.mo3670a(this.f2391ee.f2394eh, this.f2391ee.f2399em);
                } else {
                    if (nextView != null) {
                        this.f2391ee.f2393eg.removeView(nextView);
                    }
                    a = C0505cw.m1160a(this.f2391ee.f2394eh, this.f2391ee.f2399em, false, false, this.f2391ee.f2395ei, this.f2391ee.f2396ej);
                    if (this.f2391ee.f2399em.f2420eH == null) {
                        m2981b((View) a);
                    }
                }
                a.mo3676aC().mo3692a(this, this, this, this, false);
                cwVar = a;
            }
            this.f2391ee.f2398el = C0457bu.m1020a(this.f2391ee.f2394eh, c, this.f2391ee.f2395ei, cwVar, this.f2390ed, this);
            return true;
        }
    }

    /* renamed from: b */
    public void mo5259b(C0962v vVar) {
        ViewParent parent = this.f2391ee.f2393eg.getParent();
        if (!(parent instanceof View) || !((View) parent).isShown() || !C0495co.m1118at()) {
            C0502ct.m1154t("Ad is not visible. Not refreshing ad.");
            this.f2392ef.mo5262d(vVar);
            return;
        }
        mo3435a(vVar);
    }

    public void destroy() {
        C0600eg.m1547N("destroy must be called on the main UI thread.");
        this.f2391ee.f2397ek = null;
        this.f2391ee.f2401eo = null;
        this.f2392ef.cancel();
        stopLoading();
        if (this.f2391ee.f2393eg != null) {
            this.f2391ee.f2393eg.removeAllViews();
        }
        if (this.f2391ee.f2400en != null && this.f2391ee.f2400en.f1313gJ != null) {
            this.f2391ee.f2400en.f1313gJ.destroy();
        }
    }

    public boolean isReady() {
        C0600eg.m1547N("isLoaded must be called on the main UI thread.");
        return this.f2391ee.f2398el == null && this.f2391ee.f2400en != null;
    }

    public void onAppEvent(String name, String info) {
        if (this.f2391ee.f2401eo != null) {
            try {
                this.f2391ee.f2401eo.onAppEvent(name, info);
            } catch (RemoteException e) {
                C0502ct.m1150b("Could not call the AppEventListener.", e);
            }
        }
    }

    public void pause() {
        C0600eg.m1547N("pause must be called on the main UI thread.");
        if (this.f2391ee.f2400en != null) {
            C0495co.m1113a((WebView) this.f2391ee.f2400en.f1313gJ);
        }
    }

    public void resume() {
        C0600eg.m1547N("resume must be called on the main UI thread.");
        if (this.f2391ee.f2400en != null) {
            C0495co.m1123b(this.f2391ee.f2400en.f1313gJ);
        }
    }

    public void showInterstitial() {
        C0600eg.m1547N("showInterstitial must be called on the main UI thread.");
        if (!this.f2391ee.f2399em.f2419eG) {
            C0502ct.m1156v("Cannot call showInterstitial on a banner ad.");
        } else if (this.f2391ee.f2400en == null) {
            C0502ct.m1156v("The interstitial has not loaded.");
        } else if (this.f2391ee.f2400en.f1313gJ.mo3679aF()) {
            C0502ct.m1156v("The interstitial is already showing.");
        } else {
            this.f2391ee.f2400en.f1313gJ.mo3681l(true);
            if (this.f2391ee.f2400en.f1322hy) {
                try {
                    this.f2391ee.f2400en.f1315gc.showInterstitial();
                } catch (RemoteException e) {
                    C0502ct.m1150b("Could not show interstitial.", e);
                    m2979O();
                }
            } else {
                C0437bk.m975a(this.f2391ee.f2394eh, new C0442bm(this, this, this, this.f2391ee.f2400en.f1313gJ, this.f2391ee.f2400en.orientation, this.f2391ee.f2396ej));
            }
        }
    }

    public void stopLoading() {
        C0600eg.m1547N("stopLoading must be called on the main UI thread.");
        if (this.f2391ee.f2400en != null) {
            this.f2391ee.f2400en.f1313gJ.stopLoading();
            this.f2391ee.f2400en = null;
        }
        if (this.f2391ee.f2398el != null) {
            this.f2391ee.f2398el.cancel();
        }
    }

    /* renamed from: w */
    public void mo5258w() {
        m2978N();
    }

    /* renamed from: x */
    public C0270b mo3442x() {
        C0600eg.m1547N("getAdFrame must be called on the main UI thread.");
        return C0273c.m634h(this.f2391ee.f2393eg);
    }

    /* renamed from: y */
    public C0964x mo3443y() {
        C0600eg.m1547N("getAdSize must be called on the main UI thread.");
        return this.f2391ee.f2399em;
    }

    /* renamed from: z */
    public void mo3614z() {
        m2974J();
    }
}
