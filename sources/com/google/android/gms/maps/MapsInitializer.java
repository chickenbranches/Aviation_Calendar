package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.internal.C0600eg;
import com.google.android.gms.maps.internal.C1015c;
import com.google.android.gms.maps.internal.C1055q;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.RuntimeRemoteException;

public final class MapsInitializer {
    private MapsInitializer() {
    }

    public static int initialize(Context context) {
        C0600eg.m1554f(context);
        try {
            C1015c u = C1055q.m3140u(context);
            try {
                CameraUpdateFactory.m3045a(u.mo5648ez());
                BitmapDescriptorFactory.m3145a(u.mo5647eA());
                return 0;
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } catch (GooglePlayServicesNotAvailableException e2) {
            return e2.errorCode;
        }
    }
}
