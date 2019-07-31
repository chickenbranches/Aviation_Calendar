package com.google.android.gms.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.util.Log;

/* renamed from: com.google.android.gms.internal.du */
public class C0567du implements OnClickListener {

    /* renamed from: gs */
    private final Activity f1501gs;
    private final Intent mIntent;

    /* renamed from: oZ */
    private final int f1502oZ;

    public C0567du(Activity activity, Intent intent, int i) {
        this.f1501gs = activity;
        this.mIntent = intent;
        this.f1502oZ = i;
    }

    public void onClick(DialogInterface dialog, int which) {
        try {
            if (this.mIntent != null) {
                this.f1501gs.startActivityForResult(this.mIntent, this.f1502oZ);
            }
            dialog.dismiss();
        } catch (ActivityNotFoundException e) {
            Log.e("SettingsRedirect", "Can't redirect to app settings for Google Play services");
        }
    }
}
