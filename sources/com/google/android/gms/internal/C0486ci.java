package com.google.android.gms.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.ci */
public final class C0486ci {

    /* renamed from: hZ */
    public final int f1291hZ;

    /* renamed from: ia */
    public final boolean f1292ia;

    /* renamed from: ib */
    public final boolean f1293ib;

    /* renamed from: ic */
    public final String f1294ic;

    /* renamed from: id */
    public final String f1295id;

    /* renamed from: ie */
    public final boolean f1296ie;

    /* renamed from: if */
    public final boolean f1297if;

    /* renamed from: ig */
    public final boolean f1298ig;

    /* renamed from: ih */
    public final String f1299ih;

    /* renamed from: ii */
    public final String f1300ii;

    /* renamed from: ij */
    public final int f1301ij;

    /* renamed from: ik */
    public final int f1302ik;

    /* renamed from: il */
    public final int f1303il;

    /* renamed from: im */
    public final int f1304im;

    /* renamed from: in */
    public final int f1305in;

    /* renamed from: io */
    public final int f1306io;

    /* renamed from: ip */
    public final float f1307ip;

    /* renamed from: iq */
    public final int f1308iq;

    /* renamed from: ir */
    public final int f1309ir;

    public C0486ci(Context context) {
        boolean z = true;
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Locale locale = Locale.getDefault();
        PackageManager packageManager = context.getPackageManager();
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        this.f1291hZ = audioManager.getMode();
        this.f1292ia = m1098a(packageManager, "geo:0,0?q=donuts") != null;
        if (m1098a(packageManager, "http://www.google.com") == null) {
            z = false;
        }
        this.f1293ib = z;
        this.f1294ic = telephonyManager.getNetworkOperator();
        this.f1295id = locale.getCountry();
        this.f1296ie = C0501cs.m1145ax();
        this.f1297if = audioManager.isMusicActive();
        this.f1298ig = audioManager.isSpeakerphoneOn();
        this.f1299ih = locale.getLanguage();
        this.f1300ii = m1099a(packageManager);
        this.f1301ij = audioManager.getStreamVolume(3);
        this.f1302ik = m1097a(context, connectivityManager, packageManager);
        this.f1303il = telephonyManager.getNetworkType();
        this.f1304im = telephonyManager.getPhoneType();
        this.f1305in = audioManager.getRingerMode();
        this.f1306io = audioManager.getStreamVolume(2);
        this.f1307ip = displayMetrics.density;
        this.f1308iq = displayMetrics.widthPixels;
        this.f1309ir = displayMetrics.heightPixels;
    }

    /* renamed from: a */
    private static int m1097a(Context context, ConnectivityManager connectivityManager, PackageManager packageManager) {
        if (!C0495co.m1116a(packageManager, context.getPackageName(), "android.permission.ACCESS_NETWORK_STATE")) {
            return -2;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            return activeNetworkInfo.getType();
        }
        return -1;
    }

    /* renamed from: a */
    private static ResolveInfo m1098a(PackageManager packageManager, String str) {
        return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
    }

    /* renamed from: a */
    private static String m1099a(PackageManager packageManager) {
        ResolveInfo a = m1098a(packageManager, "market://details?id=com.google.android.gms.ads");
        if (a == null) {
            return null;
        }
        ActivityInfo activityInfo = a.activityInfo;
        if (activityInfo == null) {
            return null;
        }
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(activityInfo.packageName, 0);
            if (packageInfo != null) {
                return packageInfo.versionCode + "." + activityInfo.packageName;
            }
            return null;
        } catch (NameNotFoundException e) {
            return null;
        }
    }
}
