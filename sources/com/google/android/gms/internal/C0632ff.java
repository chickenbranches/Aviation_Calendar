package com.google.android.gms.internal;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ff */
public class C0632ff {
    /* renamed from: a */
    public static void m1701a(StringBuilder sb, HashMap<String, String> hashMap) {
        boolean z;
        sb.append("{");
        boolean z2 = true;
        for (String str : hashMap.keySet()) {
            if (!z2) {
                sb.append(",");
                z = z2;
            } else {
                z = false;
            }
            String str2 = (String) hashMap.get(str);
            sb.append("\"").append(str).append("\":");
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append("\"").append(str2).append("\"");
            }
            z2 = z;
        }
        sb.append("}");
    }
}
