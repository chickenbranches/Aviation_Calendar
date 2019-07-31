package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.ads.AdSize;
import com.google.android.gms.common.images.WebImage;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.dp */
public class C0557dp {

    /* renamed from: lA */
    private static final C0550dk f1468lA = new C0550dk("MetadataUtils");

    /* renamed from: mx */
    private static final String[] f1469mx = {"Z", "+hh", "+hhmm", "+hh:mm"};

    /* renamed from: my */
    private static final String f1470my = ("yyyyMMdd'T'HHmmss" + f1469mx[0]);

    /* renamed from: G */
    public static Calendar m1381G(String str) {
        if (TextUtils.isEmpty(str)) {
            f1468lA.mo3816b("Input string is empty or null", new Object[0]);
            return null;
        }
        String H = m1382H(str);
        if (TextUtils.isEmpty(H)) {
            f1468lA.mo3816b("Invalid date format", new Object[0]);
            return null;
        }
        String I = m1383I(str);
        String str2 = "yyyyMMdd";
        if (!TextUtils.isEmpty(I)) {
            H = H + "T" + I;
            str2 = I.length() == "HHmmss".length() ? "yyyyMMdd'T'HHmmss" : f1470my;
        }
        Calendar instance = GregorianCalendar.getInstance();
        try {
            instance.setTime(new SimpleDateFormat(str2).parse(H));
            return instance;
        } catch (ParseException e) {
            f1468lA.mo3816b("Error parsing string: %s", e.getMessage());
            return null;
        }
    }

    /* renamed from: H */
    private static String m1382H(String str) {
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            f1468lA.mo3816b("Input string is empty or null", new Object[0]);
            return str2;
        }
        try {
            return str.substring(0, "yyyyMMdd".length());
        } catch (IndexOutOfBoundsException e) {
            f1468lA.mo3817c("Error extracting the date: %s", e.getMessage());
            return str2;
        }
    }

    /* renamed from: I */
    private static String m1383I(String str) {
        if (TextUtils.isEmpty(str)) {
            f1468lA.mo3816b("string is empty or null", new Object[0]);
            return null;
        }
        int indexOf = str.indexOf(84);
        int i = indexOf + 1;
        if (indexOf != "yyyyMMdd".length()) {
            f1468lA.mo3816b("T delimeter is not found", new Object[0]);
            return null;
        }
        try {
            String substring = str.substring(i);
            if (substring.length() == "HHmmss".length()) {
                return substring;
            }
            switch (substring.charAt("HHmmss".length())) {
                case '+':
                case '-':
                    if (m1384J(substring)) {
                        return substring.replaceAll("([\\+\\-]\\d\\d):(\\d\\d)", "$1$2");
                    }
                    return null;
                case AdSize.LARGE_AD_HEIGHT /*90*/:
                    if (substring.length() == "HHmmss".length() + f1469mx[0].length()) {
                        return substring.substring(0, substring.length() - 1) + "+0000";
                    }
                    return null;
                default:
                    return null;
            }
        } catch (IndexOutOfBoundsException e) {
            f1468lA.mo3816b("Error extracting the time substring: %s", e.getMessage());
            return null;
        }
    }

    /* renamed from: J */
    private static boolean m1384J(String str) {
        int length = str.length();
        int length2 = "HHmmss".length();
        return length == f1469mx[1].length() + length2 || length == f1469mx[2].length() + length2 || length == length2 + f1469mx[3].length();
    }

    /* renamed from: a */
    public static String m1385a(Calendar calendar) {
        if (calendar == null) {
            f1468lA.mo3816b("Calendar object cannot be null", new Object[0]);
            return null;
        }
        String str = f1470my;
        if (calendar.get(11) == 0 && calendar.get(12) == 0 && calendar.get(13) == 0) {
            str = "yyyyMMdd";
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str);
        simpleDateFormat.setTimeZone(calendar.getTimeZone());
        String format = simpleDateFormat.format(calendar.getTime());
        return format.endsWith("+0000") ? format.replace("+0000", f1469mx[0]) : format;
    }

    /* renamed from: a */
    public static void m1386a(List<WebImage> list, JSONObject jSONObject) {
        try {
            list.clear();
            JSONArray jSONArray = jSONObject.getJSONArray("images");
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                try {
                    list.add(new WebImage(jSONArray.getJSONObject(i)));
                } catch (IllegalArgumentException e) {
                }
            }
        } catch (JSONException e2) {
        }
    }

    /* renamed from: a */
    public static void m1387a(JSONObject jSONObject, List<WebImage> list) {
        if (list != null && !list.isEmpty()) {
            JSONArray jSONArray = new JSONArray();
            for (WebImage aP : list) {
                jSONArray.put(aP.mo2445aP());
            }
            try {
                jSONObject.put("images", jSONArray);
            } catch (JSONException e) {
            }
        }
    }
}
