package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C0273c;
import com.google.android.gms.dynamic.C0275e;
import com.google.android.gms.dynamic.C0275e.C0276a;
import com.google.android.gms.internal.C0451bs.C0452a;
import com.google.android.gms.internal.C0454bt.C0455a;

/* renamed from: com.google.android.gms.internal.br */
public final class C0449br extends C0275e<C0454bt> {

    /* renamed from: ha */
    private static final C0449br f1211ha = new C0449br();

    /* renamed from: com.google.android.gms.internal.br$a */
    private static final class C0450a extends Exception {
        public C0450a(String str) {
            super(str);
        }
    }

    private C0449br() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    /* renamed from: a */
    public static C0451bs m1011a(Activity activity) {
        try {
            if (!m1012b(activity)) {
                return f1211ha.m1013c(activity);
            }
            C0502ct.m1152r("Using AdOverlay from the client jar.");
            return new C0437bk(activity);
        } catch (C0450a e) {
            C0502ct.m1156v(e.getMessage());
            return null;
        }
    }

    /* renamed from: b */
    private static boolean m1012b(Activity activity) throws C0450a {
        Intent intent = activity.getIntent();
        if (intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            return intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        }
        throw new C0450a("Ad overlay requires the useClientJar flag in intent extras.");
    }

    /* renamed from: c */
    private C0451bs m1013c(Activity activity) {
        try {
            return C0452a.m1016m(((C0454bt) mo2843t(activity)).mo3619a(C0273c.m634h(activity)));
        } catch (RemoteException e) {
            C0502ct.m1150b("Could not create remote AdOverlay.", e);
            return null;
        } catch (C0276a e2) {
            C0502ct.m1150b("Could not create remote AdOverlay.", e2);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public C0454bt mo2842d(IBinder iBinder) {
        return C0455a.m1018n(iBinder);
    }
}
