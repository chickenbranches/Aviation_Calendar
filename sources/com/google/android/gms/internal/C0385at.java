package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.at */
public final class C0385at {
    public final String adJson;

    /* renamed from: fD */
    public final String f905fD;

    /* renamed from: fE */
    public final List<String> f906fE;

    /* renamed from: fF */
    public final String f907fF;

    /* renamed from: fG */
    public final List<String> f908fG;

    /* renamed from: fH */
    public final String f909fH;

    public C0385at(JSONObject jSONObject) throws JSONException {
        String str = null;
        this.f905fD = jSONObject.getString("id");
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        this.f906fE = Collections.unmodifiableList(arrayList);
        this.f907fF = jSONObject.optString("allocation_id", null);
        this.f908fG = C0393az.m923a(jSONObject, "imp_urls");
        JSONObject optJSONObject = jSONObject.optJSONObject("ad");
        this.adJson = optJSONObject != null ? optJSONObject.toString() : null;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("data");
        if (optJSONObject2 != null) {
            str = optJSONObject2.toString();
        }
        this.f909fH = str;
    }
}
