package com.google.android.gms.internal;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ao */
public final class C0379ao implements C0378an {
    /* renamed from: a */
    private static boolean m894a(Map<String, String> map) {
        return "1".equals(map.get("custom_close"));
    }

    /* renamed from: b */
    private static int m895b(Map<String, String> map) {
        String str = (String) map.get("o");
        if (str != null) {
            if ("p".equalsIgnoreCase(str)) {
                return C0495co.m1120av();
            }
            if ("l".equalsIgnoreCase(str)) {
                return C0495co.m1119au();
            }
        }
        return -1;
    }

    /* renamed from: a */
    public void mo3504a(C0505cw cwVar, Map<String, String> map) {
        String str = (String) map.get("a");
        if (str == null) {
            C0502ct.m1156v("Action missing from an open GMSG.");
            return;
        }
        C0507cx aC = cwVar.mo3676aC();
        if ("expand".equalsIgnoreCase(str)) {
            if (cwVar.mo3679aF()) {
                C0502ct.m1156v("Cannot expand WebView that is already expanded.");
            } else {
                aC.mo3694a(m894a(map), m895b(map));
            }
        } else if ("webapp".equalsIgnoreCase(str)) {
            String str2 = (String) map.get("u");
            if (str2 != null) {
                aC.mo3695a(m894a(map), m895b(map), str2);
            } else {
                aC.mo3696a(m894a(map), m895b(map), (String) map.get("html"), (String) map.get("baseurl"));
            }
        } else {
            aC.mo3690a(new C0436bj((String) map.get("i"), (String) map.get("u"), (String) map.get("m"), (String) map.get("p"), (String) map.get("c"), (String) map.get("f"), (String) map.get("e")));
        }
    }
}
