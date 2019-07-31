package com.google.android.gms.internal;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.am */
public final class C0370am {

    /* renamed from: fn */
    public static final C0378an f888fn = new C0378an() {
        /* renamed from: a */
        public void mo3504a(C0505cw cwVar, Map<String, String> map) {
            String str = (String) map.get("urls");
            if (str == null) {
                C0502ct.m1156v("URLs missing in canOpenURLs GMSG.");
                return;
            }
            String[] split = str.split(",");
            HashMap hashMap = new HashMap();
            PackageManager packageManager = cwVar.getContext().getPackageManager();
            for (String str2 : split) {
                String[] split2 = str2.split(";", 2);
                hashMap.put(str2, Boolean.valueOf(packageManager.resolveActivity(new Intent(split2.length > 1 ? split2[1].trim() : "android.intent.action.VIEW", Uri.parse(split2[0].trim())), 65536) != null));
            }
            cwVar.mo3673a("openableURLs", (Map<String, ?>) hashMap);
        }
    };

    /* renamed from: fo */
    public static final C0378an f889fo = new C0378an() {
        /* renamed from: a */
        public void mo3504a(C0505cw cwVar, Map<String, String> map) {
            Uri uri;
            String str = (String) map.get("u");
            if (str == null) {
                C0502ct.m1156v("URL missing from click GMSG.");
                return;
            }
            Uri parse = Uri.parse(str);
            try {
                C0830h aD = cwVar.mo3677aD();
                if (aD != null && aD.mo4598a(parse)) {
                    uri = aD.mo4596a(parse, cwVar.getContext());
                    new C0500cr(cwVar.getContext(), cwVar.mo3678aE().f1346iJ, uri.toString()).start();
                }
            } catch (C0891i e) {
                C0502ct.m1156v("Unable to append parameter to URL: " + str);
            }
            uri = parse;
            new C0500cr(cwVar.getContext(), cwVar.mo3678aE().f1346iJ, uri.toString()).start();
        }
    };

    /* renamed from: fp */
    public static final C0378an f890fp = new C0378an() {
        /* renamed from: a */
        public void mo3504a(C0505cw cwVar, Map<String, String> map) {
            C0437bk aB = cwVar.mo3675aB();
            if (aB == null) {
                C0502ct.m1156v("A GMSG tried to close something that wasn't an overlay.");
            } else {
                aB.close();
            }
        }
    };

    /* renamed from: fq */
    public static final C0378an f891fq = new C0378an() {
        /* renamed from: a */
        public void mo3504a(C0505cw cwVar, Map<String, String> map) {
            C0437bk aB = cwVar.mo3675aB();
            if (aB == null) {
                C0502ct.m1156v("A GMSG tried to use a custom close button on something that wasn't an overlay.");
            } else {
                aB.mo3573g("1".equals(map.get("custom_close")));
            }
        }
    };

    /* renamed from: fr */
    public static final C0378an f892fr = new C0378an() {
        /* renamed from: a */
        public void mo3504a(C0505cw cwVar, Map<String, String> map) {
            String str = (String) map.get("u");
            if (str == null) {
                C0502ct.m1156v("URL missing from httpTrack GMSG.");
            } else {
                new C0500cr(cwVar.getContext(), cwVar.mo3678aE().f1346iJ, str).start();
            }
        }
    };

    /* renamed from: fs */
    public static final C0378an f893fs = new C0378an() {
        /* renamed from: a */
        public void mo3504a(C0505cw cwVar, Map<String, String> map) {
            C0502ct.m1154t("Received log message: " + ((String) map.get("string")));
        }
    };

    /* renamed from: ft */
    public static final C0378an f894ft = new C0379ao();

    /* renamed from: fu */
    public static final C0378an f895fu = new C0378an() {
        /* renamed from: a */
        public void mo3504a(C0505cw cwVar, Map<String, String> map) {
            String str = (String) map.get("ty");
            String str2 = (String) map.get("td");
            try {
                int parseInt = Integer.parseInt((String) map.get("tx"));
                int parseInt2 = Integer.parseInt(str);
                int parseInt3 = Integer.parseInt(str2);
                C0830h aD = cwVar.mo3677aD();
                if (aD != null) {
                    aD.mo4599g().mo3724a(parseInt, parseInt2, parseInt3);
                }
            } catch (NumberFormatException e) {
                C0502ct.m1156v("Could not parse touch parameters from gmsg.");
            }
        }
    };

    /* renamed from: fv */
    public static final C0378an f896fv = new C0380ap();
}
