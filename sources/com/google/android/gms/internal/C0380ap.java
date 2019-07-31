package com.google.android.gms.internal;

import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ap */
public final class C0380ap implements C0378an {
    /* renamed from: a */
    private static int m897a(DisplayMetrics displayMetrics, Map<String, String> map, String str, int i) {
        String str2 = (String) map.get(str);
        if (str2 == null) {
            return i;
        }
        try {
            return C0501cs.m1141a(displayMetrics, Integer.parseInt(str2));
        } catch (NumberFormatException e) {
            C0502ct.m1156v("Could not parse " + str + " in a video GMSG: " + str2);
            return i;
        }
    }

    /* renamed from: a */
    public void mo3504a(C0505cw cwVar, Map<String, String> map) {
        String str = (String) map.get("action");
        if (str == null) {
            C0502ct.m1156v("Action missing from video GMSG.");
            return;
        }
        C0437bk aB = cwVar.mo3675aB();
        if (aB == null) {
            C0502ct.m1156v("Could not get ad overlay for a video GMSG.");
            return;
        }
        boolean equalsIgnoreCase = "new".equalsIgnoreCase(str);
        boolean equalsIgnoreCase2 = "position".equalsIgnoreCase(str);
        if (equalsIgnoreCase || equalsIgnoreCase2) {
            DisplayMetrics displayMetrics = cwVar.getContext().getResources().getDisplayMetrics();
            int a = m897a(displayMetrics, map, "x", 0);
            int a2 = m897a(displayMetrics, map, "y", 0);
            int a3 = m897a(displayMetrics, map, "w", -1);
            int a4 = m897a(displayMetrics, map, "h", -1);
            if (!equalsIgnoreCase || aB.mo3565W() != null) {
                aB.mo3569b(a, a2, a3, a4);
            } else {
                aB.mo3570c(a, a2, a3, a4);
            }
        } else {
            C0444bo W = aB.mo3565W();
            if (W == null) {
                C0444bo.m999a(cwVar, "no_video_view", (String) null);
            } else if ("click".equalsIgnoreCase(str)) {
                DisplayMetrics displayMetrics2 = cwVar.getContext().getResources().getDisplayMetrics();
                int a5 = m897a(displayMetrics2, map, "x", 0);
                int a6 = m897a(displayMetrics2, map, "y", 0);
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, (float) a5, (float) a6, 0);
                W.mo3599b(obtain);
                obtain.recycle();
            } else if ("controls".equalsIgnoreCase(str)) {
                String str2 = (String) map.get("enabled");
                if (str2 == null) {
                    C0502ct.m1156v("Enabled parameter missing from controls video GMSG.");
                } else {
                    W.mo3601i(Boolean.parseBoolean(str2));
                }
            } else if ("currentTime".equalsIgnoreCase(str)) {
                String str3 = (String) map.get("time");
                if (str3 == null) {
                    C0502ct.m1156v("Time parameter missing from currentTime video GMSG.");
                    return;
                }
                try {
                    W.seekTo((int) (Float.parseFloat(str3) * 1000.0f));
                } catch (NumberFormatException e) {
                    C0502ct.m1156v("Could not parse time parameter from currentTime video GMSG: " + str3);
                }
            } else if ("hide".equalsIgnoreCase(str)) {
                W.setVisibility(4);
            } else if ("load".equalsIgnoreCase(str)) {
                W.mo3597af();
            } else if ("pause".equalsIgnoreCase(str)) {
                W.pause();
            } else if ("play".equalsIgnoreCase(str)) {
                W.play();
            } else if ("show".equalsIgnoreCase(str)) {
                W.setVisibility(0);
            } else if ("src".equalsIgnoreCase(str)) {
                W.mo3602n((String) map.get("src"));
            } else {
                C0502ct.m1156v("Unknown video action: " + str);
            }
        }
    }
}
