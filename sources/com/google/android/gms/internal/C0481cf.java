package com.google.android.gms.internal;

import android.content.Context;
import android.graphics.Color;
import android.location.Location;
import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.cf */
public final class C0481cf {

    /* renamed from: hJ */
    private static final SimpleDateFormat f1271hJ = new SimpleDateFormat("yyyyMMdd");

    /* renamed from: a */
    public static C0474cb m1068a(Context context, C0470bz bzVar, String str) {
        C0474cb cbVar;
        List<String> list;
        List<String> list2;
        List<String> list3;
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("ad_base_url", null);
            String optString2 = jSONObject.optString("ad_url", null);
            String optString3 = jSONObject.optString("ad_size", null);
            String optString4 = jSONObject.optString("ad_html", null);
            long j = jSONObject.has("interstitial_timeout") ? (long) (jSONObject.getDouble("interstitial_timeout") * 1000.0d) : -1;
            String optString5 = jSONObject.optString("orientation", null);
            int i = -1;
            if ("portrait".equals(optString5)) {
                i = C0495co.m1120av();
            } else if ("landscape".equals(optString5)) {
                i = C0495co.m1119au();
            }
            if (!TextUtils.isEmpty(optString4)) {
                if (TextUtils.isEmpty(optString)) {
                    C0502ct.m1156v("Could not parse the mediation config: Missing required ad_base_url field");
                    return new C0474cb(0);
                }
                cbVar = null;
            } else if (!TextUtils.isEmpty(optString2)) {
                C0474cb a = C0479ce.m1064a(context, bzVar.f1238ej.f1346iJ, optString2);
                optString = a.f1256gL;
                optString4 = a.f1259hw;
                cbVar = a;
            } else {
                C0502ct.m1156v("Could not parse the mediation config: Missing required ad_html or ad_url field.");
                return new C0474cb(0);
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("click_urls");
            List<String> list4 = cbVar == null ? null : cbVar.f1253fK;
            if (optJSONArray != null) {
                if (list4 == null) {
                    list4 = new LinkedList<>();
                }
                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                    list4.add(optJSONArray.getString(i2));
                }
                list = list4;
            } else {
                list = list4;
            }
            JSONArray optJSONArray2 = jSONObject.optJSONArray("impression_urls");
            List<String> list5 = cbVar == null ? null : cbVar.f1254fL;
            if (optJSONArray2 != null) {
                if (list5 == null) {
                    list5 = new LinkedList<>();
                }
                for (int i3 = 0; i3 < optJSONArray2.length(); i3++) {
                    list5.add(optJSONArray2.getString(i3));
                }
                list2 = list5;
            } else {
                list2 = list5;
            }
            JSONArray optJSONArray3 = jSONObject.optJSONArray("manual_impression_urls");
            List<String> list6 = cbVar == null ? null : cbVar.f1257hA;
            if (optJSONArray3 != null) {
                if (list6 == null) {
                    list6 = new LinkedList<>();
                }
                for (int i4 = 0; i4 < optJSONArray3.length(); i4++) {
                    list6.add(optJSONArray3.getString(i4));
                }
                list3 = list6;
            } else {
                list3 = list6;
            }
            if (cbVar != null) {
                if (cbVar.orientation != -1) {
                    i = cbVar.orientation;
                }
                if (cbVar.f1260hx > 0) {
                    j = cbVar.f1260hx;
                }
            }
            return new C0474cb(optString, optString4, list, list2, j, false, -1, list3, -1, i, optString3);
        } catch (JSONException e) {
            C0502ct.m1156v("Could not parse the mediation config: " + e.getMessage());
            return new C0474cb(0);
        }
    }

    /* renamed from: a */
    public static String m1069a(C0470bz bzVar, C0486ci ciVar, Location location) {
        try {
            HashMap hashMap = new HashMap();
            if (bzVar.f1240hq != null) {
                hashMap.put("ad_pos", bzVar.f1240hq);
            }
            m1073a(hashMap, bzVar.f1241hr);
            hashMap.put("format", bzVar.f1239em.f2418eF);
            if (bzVar.f1239em.width == -1) {
                hashMap.put("smart_w", "full");
            }
            if (bzVar.f1239em.height == -2) {
                hashMap.put("smart_h", "auto");
            }
            if (bzVar.f1239em.f2420eH != null) {
                StringBuilder sb = new StringBuilder();
                C0964x[] xVarArr = bzVar.f1239em.f2420eH;
                int length = xVarArr.length;
                for (int i = 0; i < length; i++) {
                    C0964x xVar = xVarArr[i];
                    if (sb.length() != 0) {
                        sb.append("|");
                    }
                    sb.append(xVar.width == -1 ? (int) (((float) xVar.widthPixels) / ciVar.f1307ip) : xVar.width);
                    sb.append("x");
                    sb.append(xVar.height == -2 ? (int) (((float) xVar.heightPixels) / ciVar.f1307ip) : xVar.height);
                }
                hashMap.put("sz", sb);
            }
            hashMap.put("slotname", bzVar.adUnitId);
            hashMap.put("pn", bzVar.applicationInfo.packageName);
            if (bzVar.f1242hs != null) {
                hashMap.put("vc", Integer.valueOf(bzVar.f1242hs.versionCode));
            }
            hashMap.put("ms", bzVar.f1243ht);
            hashMap.put("seq_num", bzVar.f1244hu);
            hashMap.put("session_id", bzVar.f1245hv);
            hashMap.put("js", bzVar.f1238ej.f1346iJ);
            m1072a(hashMap, ciVar);
            if (bzVar.f1241hr.versionCode >= 2 && bzVar.f1241hr.f2414eE != null) {
                m1070a(hashMap, bzVar.f1241hr.f2414eE);
            }
            if (C0502ct.m1151n(2)) {
                C0502ct.m1155u("Ad Request JSON: " + C0495co.m1129m(hashMap).toString(2));
            }
            return C0495co.m1129m(hashMap).toString();
        } catch (JSONException e) {
            C0502ct.m1156v("Problem serializing ad request to JSON: " + e.getMessage());
            return null;
        }
    }

    /* renamed from: a */
    private static void m1070a(HashMap<String, Object> hashMap, Location location) {
        HashMap hashMap2 = new HashMap();
        Float valueOf = Float.valueOf(location.getAccuracy() * 1000.0f);
        Long valueOf2 = Long.valueOf(location.getTime() * 1000);
        Long valueOf3 = Long.valueOf((long) (location.getLatitude() * 1.0E7d));
        Long valueOf4 = Long.valueOf((long) (location.getLongitude() * 1.0E7d));
        hashMap2.put("radius", valueOf);
        hashMap2.put("lat", valueOf3);
        hashMap2.put("long", valueOf4);
        hashMap2.put("time", valueOf2);
        hashMap.put("uule", hashMap2);
    }

    /* renamed from: a */
    private static void m1071a(HashMap<String, Object> hashMap, C0366ai aiVar) {
        String str;
        String str2 = null;
        if (Color.alpha(aiVar.f874eZ) != 0) {
            hashMap.put("acolor", m1075m(aiVar.f874eZ));
        }
        if (Color.alpha(aiVar.backgroundColor) != 0) {
            hashMap.put("bgcolor", m1075m(aiVar.backgroundColor));
        }
        if (!(Color.alpha(aiVar.f875fa) == 0 || Color.alpha(aiVar.f876fb) == 0)) {
            hashMap.put("gradientto", m1075m(aiVar.f875fa));
            hashMap.put("gradientfrom", m1075m(aiVar.f876fb));
        }
        if (Color.alpha(aiVar.f877fc) != 0) {
            hashMap.put("bcolor", m1075m(aiVar.f877fc));
        }
        hashMap.put("bthick", Integer.toString(aiVar.f878fd));
        switch (aiVar.f879fe) {
            case 0:
                str = "none";
                break;
            case 1:
                str = "dashed";
                break;
            case 2:
                str = "dotted";
                break;
            case 3:
                str = "solid";
                break;
            default:
                str = null;
                break;
        }
        if (str != null) {
            hashMap.put("btype", str);
        }
        switch (aiVar.f880ff) {
            case 0:
                str2 = "light";
                break;
            case 1:
                str2 = "medium";
                break;
            case 2:
                str2 = "dark";
                break;
        }
        if (str2 != null) {
            hashMap.put("callbuttoncolor", str2);
        }
        if (aiVar.f881fg != null) {
            hashMap.put("channel", aiVar.f881fg);
        }
        if (Color.alpha(aiVar.f882fh) != 0) {
            hashMap.put("dcolor", m1075m(aiVar.f882fh));
        }
        if (aiVar.f883fi != null) {
            hashMap.put("font", aiVar.f883fi);
        }
        if (Color.alpha(aiVar.f884fj) != 0) {
            hashMap.put("hcolor", m1075m(aiVar.f884fj));
        }
        hashMap.put("headersize", Integer.toString(aiVar.f885fk));
        if (aiVar.f886fl != null) {
            hashMap.put("q", aiVar.f886fl);
        }
    }

    /* renamed from: a */
    private static void m1072a(HashMap<String, Object> hashMap, C0486ci ciVar) {
        hashMap.put("am", Integer.valueOf(ciVar.f1291hZ));
        hashMap.put("cog", m1074j(ciVar.f1292ia));
        hashMap.put("coh", m1074j(ciVar.f1293ib));
        if (!TextUtils.isEmpty(ciVar.f1294ic)) {
            hashMap.put("carrier", ciVar.f1294ic);
        }
        hashMap.put("gl", ciVar.f1295id);
        if (ciVar.f1296ie) {
            hashMap.put("simulator", Integer.valueOf(1));
        }
        hashMap.put("ma", m1074j(ciVar.f1297if));
        hashMap.put("sp", m1074j(ciVar.f1298ig));
        hashMap.put("hl", ciVar.f1299ih);
        if (!TextUtils.isEmpty(ciVar.f1300ii)) {
            hashMap.put("mv", ciVar.f1300ii);
        }
        hashMap.put("muv", Integer.valueOf(ciVar.f1301ij));
        if (ciVar.f1302ik != -2) {
            hashMap.put("cnt", Integer.valueOf(ciVar.f1302ik));
        }
        hashMap.put("gnt", Integer.valueOf(ciVar.f1303il));
        hashMap.put("pt", Integer.valueOf(ciVar.f1304im));
        hashMap.put("rm", Integer.valueOf(ciVar.f1305in));
        hashMap.put("riv", Integer.valueOf(ciVar.f1306io));
        hashMap.put("u_sd", Float.valueOf(ciVar.f1307ip));
        hashMap.put("sh", Integer.valueOf(ciVar.f1309ir));
        hashMap.put("sw", Integer.valueOf(ciVar.f1308iq));
    }

    /* renamed from: a */
    private static void m1073a(HashMap<String, Object> hashMap, C0962v vVar) {
        String as = C0489cl.m1101as();
        if (as != null) {
            hashMap.put("abf", as);
        }
        if (vVar.f2415ex != -1) {
            hashMap.put("cust_age", f1271hJ.format(new Date(vVar.f2415ex)));
        }
        if (vVar.extras != null) {
            hashMap.put("extras", vVar.extras);
        }
        if (vVar.f2416ey != -1) {
            hashMap.put("cust_gender", Integer.valueOf(vVar.f2416ey));
        }
        if (vVar.f2417ez != null) {
            hashMap.put("kw", vVar.f2417ez);
        }
        if (vVar.tagForChildDirectedTreatment != -1) {
            hashMap.put("tag_for_child_directed_treatment", Integer.valueOf(vVar.tagForChildDirectedTreatment));
        }
        if (vVar.f2410eA) {
            hashMap.put("adtest", "on");
        }
        if (vVar.versionCode >= 2) {
            if (vVar.f2411eB) {
                hashMap.put("d_imp_hdr", Integer.valueOf(1));
            }
            if (!TextUtils.isEmpty(vVar.f2412eC)) {
                hashMap.put("ppid", vVar.f2412eC);
            }
            if (vVar.f2413eD != null) {
                m1071a(hashMap, vVar.f2413eD);
            }
        }
    }

    /* renamed from: j */
    private static Integer m1074j(boolean z) {
        return Integer.valueOf(z ? 1 : 0);
    }

    /* renamed from: m */
    private static String m1075m(int i) {
        return String.format(Locale.US, "#%06x", new Object[]{Integer.valueOf(16777215 & i)});
    }
}
