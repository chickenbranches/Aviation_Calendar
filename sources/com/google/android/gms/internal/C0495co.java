package com.google.android.gms.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.android.gms.ads.AdActivity;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.nio.CharBuffer;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.co */
public final class C0495co {
    /* access modifiers changed from: private */

    /* renamed from: hC */
    public static final Object f1338hC = new Object();
    /* access modifiers changed from: private */

    /* renamed from: iD */
    public static boolean f1339iD = true;
    /* access modifiers changed from: private */

    /* renamed from: iE */
    public static String f1340iE;

    /* renamed from: iF */
    private static boolean f1341iF = false;

    /* renamed from: com.google.android.gms.internal.co$a */
    private static final class C0497a extends BroadcastReceiver {
        private C0497a() {
        }

        public void onReceive(Context context, Intent intent) {
            if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                C0495co.f1339iD = true;
            } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                C0495co.f1339iD = false;
            }
        }
    }

    /* renamed from: a */
    public static String m1106a(Readable readable) throws IOException {
        StringBuilder sb = new StringBuilder();
        CharBuffer allocate = CharBuffer.allocate(2048);
        while (true) {
            int read = readable.read(allocate);
            if (read == -1) {
                return sb.toString();
            }
            allocate.flip();
            sb.append(allocate, 0, read);
        }
    }

    /* renamed from: a */
    private static JSONArray m1107a(Collection<?> collection) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (Object a : collection) {
            m1114a(jSONArray, a);
        }
        return jSONArray;
    }

    /* renamed from: a */
    private static JSONArray m1108a(Object[] objArr) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (Object a : objArr) {
            m1114a(jSONArray, a);
        }
        return jSONArray;
    }

    /* renamed from: a */
    private static JSONObject m1109a(Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            m1115a(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m1110a(Context context, String str, WebSettings webSettings) {
        webSettings.setUserAgentString(m1122b(context, str));
    }

    /* renamed from: a */
    public static void m1111a(Context context, String str, List<String> list) {
        for (String crVar : list) {
            new C0500cr(context, str, crVar).start();
        }
    }

    /* renamed from: a */
    public static void m1112a(Context context, String str, boolean z, HttpURLConnection httpURLConnection) {
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setInstanceFollowRedirects(z);
        httpURLConnection.setReadTimeout(60000);
        httpURLConnection.setRequestProperty("User-Agent", m1122b(context, str));
        httpURLConnection.setUseCaches(false);
    }

    /* renamed from: a */
    public static void m1113a(WebView webView) {
        if (VERSION.SDK_INT >= 11) {
            C0498cp.m1134a(webView);
        }
    }

    /* renamed from: a */
    private static void m1114a(JSONArray jSONArray, Object obj) throws JSONException {
        if (obj instanceof Bundle) {
            jSONArray.put(m1109a((Bundle) obj));
        } else if (obj instanceof Map) {
            jSONArray.put(m1129m((Map) obj));
        } else if (obj instanceof Collection) {
            jSONArray.put(m1107a((Collection) obj));
        } else if (obj instanceof Object[]) {
            jSONArray.put(m1108a((Object[]) obj));
        } else {
            jSONArray.put(obj);
        }
    }

    /* renamed from: a */
    private static void m1115a(JSONObject jSONObject, String str, Object obj) throws JSONException {
        if (obj instanceof Bundle) {
            jSONObject.put(str, m1109a((Bundle) obj));
        } else if (obj instanceof Map) {
            jSONObject.put(str, m1129m((Map) obj));
        } else if (obj instanceof Collection) {
            if (str == null) {
                str = "null";
            }
            jSONObject.put(str, m1107a((Collection) obj));
        } else if (obj instanceof Object[]) {
            jSONObject.put(str, m1107a((Collection<?>) Arrays.asList((Object[]) obj)));
        } else {
            jSONObject.put(str, obj);
        }
    }

    /* renamed from: a */
    public static boolean m1116a(PackageManager packageManager, String str, String str2) {
        return packageManager.checkPermission(str2, str) == 0;
    }

    /* renamed from: a */
    public static boolean m1117a(ClassLoader classLoader, Class<?> cls, String str) {
        boolean z = false;
        try {
            return cls.isAssignableFrom(Class.forName(str, false, classLoader));
        } catch (Throwable th) {
            return z;
        }
    }

    /* renamed from: at */
    public static boolean m1118at() {
        return f1339iD;
    }

    /* renamed from: au */
    public static int m1119au() {
        return VERSION.SDK_INT >= 9 ? 6 : 0;
    }

    /* renamed from: av */
    public static int m1120av() {
        return VERSION.SDK_INT >= 9 ? 7 : 1;
    }

    /* renamed from: b */
    private static String m1122b(final Context context, String str) {
        String str2;
        synchronized (f1338hC) {
            if (f1340iE != null) {
                str2 = f1340iE;
            } else {
                if (VERSION.SDK_INT >= 17) {
                    f1340iE = C0499cq.getDefaultUserAgent(context);
                } else if (!C0501cs.m1146ay()) {
                    C0501cs.f1345iI.post(new Runnable() {
                        public void run() {
                            synchronized (C0495co.f1338hC) {
                                C0495co.f1340iE = C0495co.m1126j(context);
                                C0495co.f1338hC.notifyAll();
                            }
                        }
                    });
                    while (f1340iE == null) {
                        try {
                            f1338hC.wait();
                        } catch (InterruptedException e) {
                            str2 = f1340iE;
                        }
                    }
                } else {
                    f1340iE = m1126j(context);
                }
                f1340iE += " (Mobile; " + str + ")";
                str2 = f1340iE;
            }
        }
        return str2;
    }

    /* renamed from: b */
    public static void m1123b(WebView webView) {
        if (VERSION.SDK_INT >= 11) {
            C0498cp.m1135b(webView);
        }
    }

    /* renamed from: h */
    public static boolean m1124h(Context context) {
        boolean z;
        Intent intent = new Intent();
        intent.setClassName(context, AdActivity.CLASS_NAME);
        ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
        if (resolveActivity == null || resolveActivity.activityInfo == null) {
            C0502ct.m1156v("Could not find com.google.android.gms.ads.AdActivity, please make sure it is declared in AndroidManifest.xml.");
            return false;
        }
        String str = "com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".";
        if ((resolveActivity.activityInfo.configChanges & 16) == 0) {
            C0502ct.m1156v(String.format(str, new Object[]{"keyboard"}));
            z = false;
        } else {
            z = true;
        }
        if ((resolveActivity.activityInfo.configChanges & 32) == 0) {
            C0502ct.m1156v(String.format(str, new Object[]{"keyboardHidden"}));
            z = false;
        }
        if ((resolveActivity.activityInfo.configChanges & 128) == 0) {
            C0502ct.m1156v(String.format(str, new Object[]{"orientation"}));
            z = false;
        }
        if ((resolveActivity.activityInfo.configChanges & 256) == 0) {
            C0502ct.m1156v(String.format(str, new Object[]{"screenLayout"}));
            z = false;
        }
        if ((resolveActivity.activityInfo.configChanges & 512) == 0) {
            C0502ct.m1156v(String.format(str, new Object[]{"uiMode"}));
            z = false;
        }
        if ((resolveActivity.activityInfo.configChanges & 1024) == 0) {
            C0502ct.m1156v(String.format(str, new Object[]{"screenSize"}));
            z = false;
        }
        if ((resolveActivity.activityInfo.configChanges & 2048) != 0) {
            return z;
        }
        C0502ct.m1156v(String.format(str, new Object[]{"smallestScreenSize"}));
        return false;
    }

    /* renamed from: i */
    public static void m1125i(Context context) {
        if (!f1341iF) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            context.getApplicationContext().registerReceiver(new C0497a(), intentFilter);
            f1341iF = true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static String m1126j(Context context) {
        return new WebView(context).getSettings().getUserAgentString();
    }

    /* renamed from: m */
    public static JSONObject m1129m(Map<String, ?> map) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                m1115a(jSONObject, str, map.get(str));
            }
            return jSONObject;
        } catch (ClassCastException e) {
            throw new JSONException("Could not convert map to JSON: " + e.getMessage());
        }
    }

    /* renamed from: o */
    public static String m1130o(String str) {
        return Uri.parse(str).buildUpon().query(null).build().toString();
    }
}
