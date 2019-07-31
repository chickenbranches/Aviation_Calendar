package com.google.android.gms.internal;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.az */
public final class C0393az {
    /* renamed from: a */
    public static List<String> m923a(JSONObject jSONObject, String str) throws JSONException {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(optJSONArray.length());
        for (int i = 0; i < optJSONArray.length(); i++) {
            arrayList.add(optJSONArray.getString(i));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    public static void m924a(Context context, String str, C0487cj cjVar, String str2, boolean z, List<String> list) {
        String str3 = z ? "1" : "0";
        for (String replaceAll : list) {
            String replaceAll2 = replaceAll.replaceAll("@gw_adlocid@", str2).replaceAll("@gw_adnetrefresh@", str3).replaceAll("@gw_qdata@", cjVar.f1324is.f915fN).replaceAll("@gw_sdkver@", str).replaceAll("@gw_sessid@", C0488ck.f1327iu).replaceAll("@gw_seqnum@", cjVar.f1320hu);
            if (cjVar.f1314gb != null) {
                replaceAll2 = replaceAll2.replaceAll("@gw_adnetid@", cjVar.f1314gb.f905fD).replaceAll("@gw_allocid@", cjVar.f1314gb.f907fF);
            }
            new C0500cr(context, str, replaceAll2).start();
        }
    }
}
