package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.au */
public final class C0386au {

    /* renamed from: fI */
    public final List<C0385at> f910fI;

    /* renamed from: fJ */
    public final long f911fJ;

    /* renamed from: fK */
    public final List<String> f912fK;

    /* renamed from: fL */
    public final List<String> f913fL;

    /* renamed from: fM */
    public final List<String> f914fM;

    /* renamed from: fN */
    public final String f915fN;

    /* renamed from: fO */
    public final long f916fO;

    public C0386au(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        if (C0502ct.m1151n(2)) {
            C0502ct.m1155u("Mediation Response JSON: " + jSONObject.toString(2));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(new C0385at(jSONArray.getJSONObject(i)));
        }
        this.f910fI = Collections.unmodifiableList(arrayList);
        this.f915fN = jSONObject.getString("qdata");
        JSONObject optJSONObject = jSONObject.optJSONObject("settings");
        if (optJSONObject != null) {
            this.f911fJ = optJSONObject.optLong("ad_network_timeout_millis", -1);
            this.f912fK = C0393az.m923a(optJSONObject, "click_urls");
            this.f913fL = C0393az.m923a(optJSONObject, "imp_urls");
            this.f914fM = C0393az.m923a(optJSONObject, "nofill_urls");
            long optLong = optJSONObject.optLong("refresh", -1);
            this.f916fO = optLong > 0 ? 1000 * optLong : -1;
            return;
        }
        this.f911fJ = -1;
        this.f912fK = null;
        this.f913fL = null;
        this.f914fM = null;
        this.f916fO = -1;
    }
}
