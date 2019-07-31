package com.google.android.gms.internal;

import android.net.Uri;
import android.net.UrlQuerySanitizer;
import android.net.UrlQuerySanitizer.ParameterValuePair;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.cx */
public class C0507cx extends WebViewClient {

    /* renamed from: fm */
    private C0369al f1361fm;

    /* renamed from: fx */
    private final Object f1362fx = new Object();

    /* renamed from: gv */
    protected final C0505cw f1363gv;

    /* renamed from: iU */
    private final HashMap<String, C0378an> f1364iU = new HashMap<>();

    /* renamed from: iV */
    private C0955q f1365iV;

    /* renamed from: iW */
    private C0443bn f1366iW;

    /* renamed from: iX */
    private C0509a f1367iX;

    /* renamed from: iY */
    private boolean f1368iY = false;

    /* renamed from: iZ */
    private boolean f1369iZ;

    /* renamed from: ja */
    private C0448bq f1370ja;

    /* renamed from: com.google.android.gms.internal.cx$a */
    public interface C0509a {
        /* renamed from: a */
        void mo3583a(C0505cw cwVar);
    }

    public C0507cx(C0505cw cwVar, boolean z) {
        this.f1363gv = cwVar;
        this.f1369iZ = z;
    }

    /* renamed from: a */
    private void m1177a(C0442bm bmVar) {
        C0437bk.m975a(this.f1363gv.getContext(), bmVar);
    }

    /* renamed from: b */
    private static boolean m1178b(Uri uri) {
        String scheme = uri.getScheme();
        return "http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme);
    }

    /* renamed from: c */
    private void m1179c(Uri uri) {
        String path = uri.getPath();
        C0378an anVar = (C0378an) this.f1364iU.get(path);
        if (anVar != null) {
            HashMap hashMap = new HashMap();
            UrlQuerySanitizer urlQuerySanitizer = new UrlQuerySanitizer();
            urlQuerySanitizer.setAllowUnregisteredParamaters(true);
            urlQuerySanitizer.setUnregisteredParameterValueSanitizer(UrlQuerySanitizer.getAllButNulLegal());
            urlQuerySanitizer.parseUrl(uri.toString());
            for (ParameterValuePair parameterValuePair : urlQuerySanitizer.getParameterList()) {
                hashMap.put(parameterValuePair.mParameter, parameterValuePair.mValue);
            }
            if (C0502ct.m1151n(2)) {
                C0502ct.m1155u("Received GMSG: " + path);
                for (String str : hashMap.keySet()) {
                    C0502ct.m1155u("  " + str + ": " + ((String) hashMap.get(str)));
                }
            }
            anVar.mo3504a(this.f1363gv, hashMap);
            return;
        }
        C0502ct.m1156v("No GMSG handler found for GMSG: " + uri);
    }

    /* renamed from: Y */
    public final void mo3689Y() {
        synchronized (this.f1362fx) {
            this.f1368iY = false;
            this.f1369iZ = true;
            final C0437bk aB = this.f1363gv.mo3675aB();
            if (aB != null) {
                if (!C0501cs.m1146ay()) {
                    C0501cs.f1345iI.post(new Runnable() {
                        public void run() {
                            aB.mo3567Y();
                        }
                    });
                } else {
                    aB.mo3567Y();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo3690a(C0436bj bjVar) {
        C0443bn bnVar = null;
        boolean aF = this.f1363gv.mo3679aF();
        C0955q qVar = (!aF || this.f1363gv.mo3686y().f2419eG) ? this.f1365iV : null;
        if (!aF) {
            bnVar = this.f1366iW;
        }
        m1177a(new C0442bm(bjVar, qVar, bnVar, this.f1370ja, this.f1363gv.mo3678aE()));
    }

    /* renamed from: a */
    public final void mo3691a(C0509a aVar) {
        this.f1367iX = aVar;
    }

    /* renamed from: a */
    public void mo3692a(C0955q qVar, C0443bn bnVar, C0369al alVar, C0448bq bqVar, boolean z) {
        mo3693a("/appEvent", (C0378an) new C0368ak(alVar));
        mo3693a("/canOpenURLs", C0370am.f888fn);
        mo3693a("/click", C0370am.f889fo);
        mo3693a("/close", C0370am.f890fp);
        mo3693a("/customClose", C0370am.f891fq);
        mo3693a("/httpTrack", C0370am.f892fr);
        mo3693a("/log", C0370am.f893fs);
        mo3693a("/open", C0370am.f894ft);
        mo3693a("/touch", C0370am.f895fu);
        mo3693a("/video", C0370am.f896fv);
        this.f1365iV = qVar;
        this.f1366iW = bnVar;
        this.f1361fm = alVar;
        this.f1370ja = bqVar;
        mo3698m(z);
    }

    /* renamed from: a */
    public final void mo3693a(String str, C0378an anVar) {
        this.f1364iU.put(str, anVar);
    }

    /* renamed from: a */
    public final void mo3694a(boolean z, int i) {
        m1177a(new C0442bm((!this.f1363gv.mo3679aF() || this.f1363gv.mo3686y().f2419eG) ? this.f1365iV : null, this.f1366iW, this.f1370ja, this.f1363gv, z, i, this.f1363gv.mo3678aE()));
    }

    /* renamed from: a */
    public final void mo3695a(boolean z, int i, String str) {
        C0443bn bnVar = null;
        boolean aF = this.f1363gv.mo3679aF();
        C0955q qVar = (!aF || this.f1363gv.mo3686y().f2419eG) ? this.f1365iV : null;
        if (!aF) {
            bnVar = this.f1366iW;
        }
        m1177a(new C0442bm(qVar, bnVar, this.f1361fm, this.f1370ja, this.f1363gv, z, i, str, this.f1363gv.mo3678aE()));
    }

    /* renamed from: a */
    public final void mo3696a(boolean z, int i, String str, String str2) {
        C0443bn bnVar = null;
        boolean aF = this.f1363gv.mo3679aF();
        C0955q qVar = (!aF || this.f1363gv.mo3686y().f2419eG) ? this.f1365iV : null;
        if (!aF) {
            bnVar = this.f1366iW;
        }
        m1177a(new C0442bm(qVar, bnVar, this.f1361fm, this.f1370ja, this.f1363gv, z, i, str, str2, this.f1363gv.mo3678aE()));
    }

    /* renamed from: aJ */
    public boolean mo3697aJ() {
        boolean z;
        synchronized (this.f1362fx) {
            z = this.f1369iZ;
        }
        return z;
    }

    /* renamed from: m */
    public final void mo3698m(boolean z) {
        this.f1368iY = z;
    }

    public final void onPageFinished(WebView webView, String url) {
        if (this.f1367iX != null) {
            this.f1367iX.mo3583a(this.f1363gv);
            this.f1367iX = null;
        }
    }

    public final void reset() {
        synchronized (this.f1362fx) {
            this.f1364iU.clear();
            this.f1365iV = null;
            this.f1366iW = null;
            this.f1367iX = null;
            this.f1361fm = null;
            this.f1368iY = false;
            this.f1369iZ = false;
            this.f1370ja = null;
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String url) {
        Uri uri;
        C0502ct.m1155u("AdWebView shouldOverrideUrlLoading: " + url);
        Uri parse = Uri.parse(url);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            m1179c(parse);
        } else if (this.f1368iY && webView == this.f1363gv && m1178b(parse)) {
            return super.shouldOverrideUrlLoading(webView, url);
        } else {
            if (!this.f1363gv.willNotDraw()) {
                try {
                    C0830h aD = this.f1363gv.mo3677aD();
                    if (aD != null && aD.mo4598a(parse)) {
                        parse = aD.mo4596a(parse, this.f1363gv.getContext());
                    }
                    uri = parse;
                } catch (C0891i e) {
                    C0502ct.m1156v("Unable to append parameter to URL: " + url);
                    uri = parse;
                }
                mo3690a(new C0436bj("android.intent.action.VIEW", uri.toString(), null, null, null, null, null));
            } else {
                C0502ct.m1156v("AdWebView unable to handle URL: " + url);
            }
        }
        return true;
    }
}
