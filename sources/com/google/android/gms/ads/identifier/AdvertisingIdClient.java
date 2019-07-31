package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.C0143a;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.internal.C0600eg;
import com.google.android.gms.internal.C0952p;
import com.google.android.gms.internal.C0952p.C0953a;
import java.io.IOException;

public final class AdvertisingIdClient {

    public static final class Info {

        /* renamed from: eb */
        private final String f53eb;

        /* renamed from: ec */
        private final boolean f54ec;

        Info(String advertisingId, boolean limitAdTrackingEnabled) {
            this.f53eb = advertisingId;
            this.f54ec = limitAdTrackingEnabled;
        }

        public String getId() {
            return this.f53eb;
        }

        public boolean isLimitAdTrackingEnabled() {
            return this.f54ec;
        }
    }

    /* renamed from: g */
    private static C0143a m21g(Context context) throws IOException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        try {
            context.getPackageManager().getPackageInfo(GooglePlayServicesUtil.GOOGLE_PLAY_STORE_PACKAGE, 0);
            try {
                GooglePlayServicesUtil.m174m(context);
                C0143a aVar = new C0143a();
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage(GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_PACKAGE);
                if (context.bindService(intent, aVar, 1)) {
                    return aVar;
                }
                throw new IOException("Connection failure");
            } catch (GooglePlayServicesNotAvailableException e) {
                throw new IOException(e);
            }
        } catch (NameNotFoundException e2) {
            throw new GooglePlayServicesNotAvailableException(9);
        }
    }

    public static Info getAdvertisingIdInfo(Context context) throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        C0600eg.m1548O("Calling this from your main thread can lead to deadlock");
        C0143a g = m21g(context);
        try {
            C0952p b = C0953a.m2968b(g.mo2294bg());
            Info info = new Info(b.getId(), b.mo5252a(true));
            context.unbindService(g);
            return info;
        } catch (RemoteException e) {
            Log.i("AdvertisingIdClient", "GMS remote exception ", e);
            throw new IOException("Remote exception");
        } catch (InterruptedException e2) {
            throw new IOException("Interrupted exception");
        } catch (Throwable th) {
            context.unbindService(g);
            throw th;
        }
    }
}
