package com.google.android.gms.internal;

import android.content.Intent;
import android.net.Uri;
import android.support.p000v4.view.accessibility.AccessibilityEventCompat;
import com.google.android.gms.common.GooglePlayServicesUtil;

/* renamed from: com.google.android.gms.internal.dz */
public class C0584dz {

    /* renamed from: pK */
    private static final Uri f1547pK = Uri.parse("http://plus.google.com/");

    /* renamed from: pL */
    private static final Uri f1548pL = f1547pK.buildUpon().appendPath("circles").appendPath("find").build();

    /* renamed from: Q */
    public static Intent m1471Q(String str) {
        Uri fromParts = Uri.fromParts("package", str, null);
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(fromParts);
        return intent;
    }

    /* renamed from: R */
    private static Uri m1472R(String str) {
        return Uri.parse("market://details").buildUpon().appendQueryParameter("id", str).build();
    }

    /* renamed from: S */
    public static Intent m1473S(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(m1472R(str));
        intent.setPackage(GooglePlayServicesUtil.GOOGLE_PLAY_STORE_PACKAGE);
        intent.addFlags(AccessibilityEventCompat.TYPE_GESTURE_DETECTION_END);
        return intent;
    }

    /* renamed from: T */
    public static Intent m1474T(String str) {
        Uri parse = Uri.parse("bazaar://search?q=pname:" + str);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(parse);
        intent.setFlags(AccessibilityEventCompat.TYPE_GESTURE_DETECTION_END);
        return intent;
    }

    /* renamed from: bX */
    public static Intent m1475bX() {
        return new Intent("android.settings.DATE_SETTINGS");
    }
}
