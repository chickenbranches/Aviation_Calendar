package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.dynamic.C0273c;
import com.google.android.gms.dynamic.C0275e;
import com.google.android.gms.dynamic.C0275e.C0276a;
import com.google.android.gms.internal.C0353ac.C0354a;
import com.google.android.gms.internal.C0356ad.C0357a;

/* renamed from: com.google.android.gms.internal.u */
public final class C0961u extends C0275e<C0356ad> {

    /* renamed from: ew */
    private static final C0961u f2409ew = new C0961u();

    private C0961u() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    /* renamed from: a */
    public static C0353ac m3007a(Context context, C0964x xVar, String str, C0409ba baVar) {
        if (GooglePlayServicesUtil.isGooglePlayServicesAvailable(context) == 0) {
            C0353ac b = f2409ew.m3008b(context, xVar, str, baVar);
            if (b != null) {
                return b;
            }
        }
        C0502ct.m1152r("Using AdManager from the client jar.");
        return new C0956r(context, xVar, str, baVar, new C0503cu(GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE, GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE, true));
    }

    /* renamed from: b */
    private C0353ac m3008b(Context context, C0964x xVar, String str, C0409ba baVar) {
        try {
            return C0354a.m842f(((C0356ad) mo2843t(context)).mo3447a(C0273c.m634h(context), xVar, str, baVar, GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE));
        } catch (RemoteException e) {
            C0502ct.m1150b("Could not create remote AdManager.", e);
            return null;
        } catch (C0276a e2) {
            C0502ct.m1150b("Could not create remote AdManager.", e2);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C0356ad mo2842d(IBinder iBinder) {
        return C0357a.m851g(iBinder);
    }
}
