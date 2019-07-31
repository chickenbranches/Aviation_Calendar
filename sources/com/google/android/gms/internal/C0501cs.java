package com.google.android.gms.internal;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings.Secure;
import android.support.p000v4.internal.view.SupportMenu;
import android.support.p000v4.view.ViewCompat;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.cs */
public final class C0501cs {

    /* renamed from: iI */
    public static final Handler f1345iI = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public static int m1140a(Context context, int i) {
        return m1141a(context.getResources().getDisplayMetrics(), i);
    }

    /* renamed from: a */
    public static int m1141a(DisplayMetrics displayMetrics, int i) {
        return (int) TypedValue.applyDimension(1, (float) i, displayMetrics);
    }

    /* renamed from: a */
    public static void m1142a(ViewGroup viewGroup, C0964x xVar, String str) {
        m1143a(viewGroup, xVar, str, ViewCompat.MEASURED_STATE_MASK, -1);
    }

    /* renamed from: a */
    private static void m1143a(ViewGroup viewGroup, C0964x xVar, String str, int i, int i2) {
        if (viewGroup.getChildCount() == 0) {
            Context context = viewGroup.getContext();
            TextView textView = new TextView(context);
            textView.setGravity(17);
            textView.setText(str);
            textView.setTextColor(i);
            textView.setBackgroundColor(i2);
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setBackgroundColor(i);
            int a = m1140a(context, 3);
            frameLayout.addView(textView, new LayoutParams(xVar.widthPixels - a, xVar.heightPixels - a, 17));
            viewGroup.addView(frameLayout, xVar.widthPixels, xVar.heightPixels);
        }
    }

    /* renamed from: a */
    public static void m1144a(ViewGroup viewGroup, C0964x xVar, String str, String str2) {
        C0502ct.m1156v(str2);
        m1143a(viewGroup, xVar, str, SupportMenu.CATEGORY_MASK, ViewCompat.MEASURED_STATE_MASK);
    }

    /* renamed from: ax */
    public static boolean m1145ax() {
        return Build.DEVICE.startsWith("generic");
    }

    /* renamed from: ay */
    public static boolean m1146ay() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* renamed from: l */
    public static String m1147l(Context context) {
        String string = Secure.getString(context.getContentResolver(), "android_id");
        if (string == null || m1145ax()) {
            string = "emulator";
        }
        return m1148q(string);
    }

    /* renamed from: q */
    public static String m1148q(String str) {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                instance.update(str.getBytes());
                return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, instance.digest())});
            } catch (NoSuchAlgorithmException e) {
                i++;
            }
        }
        return null;
    }
}
