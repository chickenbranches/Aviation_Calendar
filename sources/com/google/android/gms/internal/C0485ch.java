package com.google.android.gms.internal;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ch */
public final class C0485ch {

    /* renamed from: hP */
    private String f1281hP;

    /* renamed from: hQ */
    private String f1282hQ;

    /* renamed from: hR */
    private String f1283hR;

    /* renamed from: hS */
    private List<String> f1284hS;

    /* renamed from: hT */
    private List<String> f1285hT;

    /* renamed from: hU */
    private long f1286hU = -1;

    /* renamed from: hV */
    private boolean f1287hV = false;

    /* renamed from: hW */
    private final long f1288hW = -1;

    /* renamed from: hX */
    private List<String> f1289hX;

    /* renamed from: hY */
    private long f1290hY = -1;
    private int mOrientation = -1;

    /* renamed from: a */
    private static long m1084a(Map<String, List<String>> map, String str) {
        List list = (List) map.get(str);
        if (list != null && !list.isEmpty()) {
            String str2 = (String) list.get(0);
            try {
                return (long) (Float.parseFloat(str2) * 1000.0f);
            } catch (NumberFormatException e) {
                C0502ct.m1156v("Could not parse float from " + str + " header: " + str2);
            }
        }
        return -1;
    }

    /* renamed from: b */
    private static List<String> m1085b(Map<String, List<String>> map, String str) {
        List list = (List) map.get(str);
        if (list != null && !list.isEmpty()) {
            String str2 = (String) list.get(0);
            if (str2 != null) {
                return Arrays.asList(str2.trim().split("\\s+"));
            }
        }
        return null;
    }

    /* renamed from: e */
    private void m1086e(Map<String, List<String>> map) {
        List list = (List) map.get("X-Afma-Ad-Size");
        if (list != null && !list.isEmpty()) {
            this.f1281hP = (String) list.get(0);
        }
    }

    /* renamed from: f */
    private void m1087f(Map<String, List<String>> map) {
        List<String> b = m1085b(map, "X-Afma-Click-Tracking-Urls");
        if (b != null) {
            this.f1284hS = b;
        }
    }

    /* renamed from: g */
    private void m1088g(Map<String, List<String>> map) {
        List<String> b = m1085b(map, "X-Afma-Tracking-Urls");
        if (b != null) {
            this.f1285hT = b;
        }
    }

    /* renamed from: h */
    private void m1089h(Map<String, List<String>> map) {
        long a = m1084a(map, "X-Afma-Interstitial-Timeout");
        if (a != -1) {
            this.f1286hU = a;
        }
    }

    /* renamed from: i */
    private void m1090i(Map<String, List<String>> map) {
        List list = (List) map.get("X-Afma-Mediation");
        if (list != null && !list.isEmpty()) {
            this.f1287hV = Boolean.valueOf((String) list.get(0)).booleanValue();
        }
    }

    /* renamed from: j */
    private void m1091j(Map<String, List<String>> map) {
        List<String> b = m1085b(map, "X-Afma-Manual-Tracking-Urls");
        if (b != null) {
            this.f1289hX = b;
        }
    }

    /* renamed from: k */
    private void m1092k(Map<String, List<String>> map) {
        long a = m1084a(map, "X-Afma-Refresh-Rate");
        if (a != -1) {
            this.f1290hY = a;
        }
    }

    /* renamed from: l */
    private void m1093l(Map<String, List<String>> map) {
        List list = (List) map.get("X-Afma-Orientation");
        if (list != null && !list.isEmpty()) {
            String str = (String) list.get(0);
            if ("portrait".equalsIgnoreCase(str)) {
                this.mOrientation = C0495co.m1120av();
            } else if ("landscape".equalsIgnoreCase(str)) {
                this.mOrientation = C0495co.m1119au();
            }
        }
    }

    /* renamed from: a */
    public void mo3654a(String str, Map<String, List<String>> map, String str2) {
        this.f1282hQ = str;
        this.f1283hR = str2;
        mo3656d(map);
    }

    /* renamed from: aq */
    public C0474cb mo3655aq() {
        return new C0474cb(this.f1282hQ, this.f1283hR, this.f1284hS, this.f1285hT, this.f1286hU, this.f1287hV, -1, this.f1289hX, this.f1290hY, this.mOrientation, this.f1281hP);
    }

    /* renamed from: d */
    public void mo3656d(Map<String, List<String>> map) {
        m1086e(map);
        m1087f(map);
        m1088g(map);
        m1089h(map);
        m1090i(map);
        m1091j(map);
        m1092k(map);
        m1093l(map);
    }
}
