package com.google.android.gms.internal;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;

/* renamed from: com.google.android.gms.internal.bh */
public final class C0434bh {
    /* renamed from: a */
    public static boolean m969a(Context context, C0436bj bjVar, C0448bq bqVar) {
        if (bjVar == null) {
            C0502ct.m1156v("No intent data for launcher overlay.");
            return false;
        }
        Intent intent = new Intent();
        if (TextUtils.isEmpty(bjVar.f1168go)) {
            C0502ct.m1156v("Open GMSG did not contain a URL.");
            return false;
        }
        if (!TextUtils.isEmpty(bjVar.mimeType)) {
            intent.setDataAndType(Uri.parse(bjVar.f1168go), bjVar.mimeType);
        } else {
            intent.setData(Uri.parse(bjVar.f1168go));
        }
        intent.setAction("android.intent.action.VIEW");
        if (!TextUtils.isEmpty(bjVar.packageName)) {
            intent.setPackage(bjVar.packageName);
        }
        if (!TextUtils.isEmpty(bjVar.f1169gp)) {
            String[] split = bjVar.f1169gp.split("/", 2);
            if (split.length < 2) {
                C0502ct.m1156v("Could not parse component name from open GMSG: " + bjVar.f1169gp);
                return false;
            }
            intent.setClassName(split[0], split[1]);
        }
        try {
            C0502ct.m1155u("Launching an intent: " + intent);
            context.startActivity(intent);
            bqVar.mo3614z();
            return true;
        } catch (ActivityNotFoundException e) {
            C0502ct.m1156v(e.getMessage());
            return false;
        }
    }
}
