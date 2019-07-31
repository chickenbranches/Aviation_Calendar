package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks;
import com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.internal.C0569dw.C0574e;
import com.google.android.gms.internal.C0801gk.C0802a;
import com.google.android.gms.internal.C0804gl.C0805a;
import com.google.android.gms.location.LocationClient.OnAddGeofencesResultListener;
import com.google.android.gms.location.LocationClient.OnRemoveGeofencesResultListener;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationStatusCodes;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.google.android.gms.internal.gn */
public class C0810gn extends C0569dw<C0804gl> {

    /* renamed from: jG */
    private final String f1910jG;

    /* renamed from: xP */
    private final C0818gq<C0804gl> f1911xP = new C0814c();

    /* renamed from: xV */
    private final C0807gm f1912xV;

    /* renamed from: xW */
    private final HashMap f1913xW = new HashMap();

    /* renamed from: xX */
    private final String f1914xX;

    /* renamed from: com.google.android.gms.internal.gn$a */
    private final class C0812a extends C0571b<OnAddGeofencesResultListener> {

        /* renamed from: mC */
        private final int f1915mC;

        /* renamed from: xY */
        private final String[] f1916xY;

        public C0812a(OnAddGeofencesResultListener onAddGeofencesResultListener, int i, String[] strArr) {
            super(onAddGeofencesResultListener);
            this.f1915mC = LocationStatusCodes.m3029aR(i);
            this.f1916xY = strArr;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo3743b(OnAddGeofencesResultListener onAddGeofencesResultListener) {
            if (onAddGeofencesResultListener != null) {
                onAddGeofencesResultListener.onAddGeofencesResult(this.f1915mC, this.f1916xY);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: aL */
        public void mo3742aL() {
        }
    }

    /* renamed from: com.google.android.gms.internal.gn$b */
    private static final class C0813b extends C0802a {

        /* renamed from: ya */
        private OnAddGeofencesResultListener f1918ya;

        /* renamed from: yb */
        private OnRemoveGeofencesResultListener f1919yb;

        /* renamed from: yc */
        private C0810gn f1920yc;

        public C0813b(OnAddGeofencesResultListener onAddGeofencesResultListener, C0810gn gnVar) {
            this.f1918ya = onAddGeofencesResultListener;
            this.f1919yb = null;
            this.f1920yc = gnVar;
        }

        public C0813b(OnRemoveGeofencesResultListener onRemoveGeofencesResultListener, C0810gn gnVar) {
            this.f1919yb = onRemoveGeofencesResultListener;
            this.f1918ya = null;
            this.f1920yc = gnVar;
        }

        public void onAddGeofencesResult(int statusCode, String[] geofenceRequestIds) throws RemoteException {
            if (this.f1920yc == null) {
                Log.wtf("LocationClientImpl", "onAddGeofenceResult called multiple times");
                return;
            }
            C0810gn gnVar = this.f1920yc;
            C0810gn gnVar2 = this.f1920yc;
            gnVar2.getClass();
            gnVar.mo3887a((C0571b<?>) new C0812a<Object>(this.f1918ya, statusCode, geofenceRequestIds));
            this.f1920yc = null;
            this.f1918ya = null;
            this.f1919yb = null;
        }

        public void onRemoveGeofencesByPendingIntentResult(int statusCode, PendingIntent pendingIntent) {
            if (this.f1920yc == null) {
                Log.wtf("LocationClientImpl", "onRemoveGeofencesByPendingIntentResult called multiple times");
                return;
            }
            C0810gn gnVar = this.f1920yc;
            C0810gn gnVar2 = this.f1920yc;
            gnVar2.getClass();
            gnVar.mo3887a((C0571b<?>) new C0815d<Object>(gnVar2, 1, this.f1919yb, statusCode, pendingIntent));
            this.f1920yc = null;
            this.f1918ya = null;
            this.f1919yb = null;
        }

        public void onRemoveGeofencesByRequestIdsResult(int statusCode, String[] geofenceRequestIds) {
            if (this.f1920yc == null) {
                Log.wtf("LocationClientImpl", "onRemoveGeofencesByRequestIdsResult called multiple times");
                return;
            }
            C0810gn gnVar = this.f1920yc;
            C0810gn gnVar2 = this.f1920yc;
            gnVar2.getClass();
            gnVar.mo3887a((C0571b<?>) new C0815d<Object>(2, this.f1919yb, statusCode, geofenceRequestIds));
            this.f1920yc = null;
            this.f1918ya = null;
            this.f1919yb = null;
        }
    }

    /* renamed from: com.google.android.gms.internal.gn$c */
    private final class C0814c implements C0818gq<C0804gl> {
        private C0814c() {
        }

        /* renamed from: bP */
        public void mo4536bP() {
            C0810gn.this.mo3889bP();
        }

        /* renamed from: dJ */
        public C0804gl mo4537bQ() {
            return (C0804gl) C0810gn.this.mo3890bQ();
        }
    }

    /* renamed from: com.google.android.gms.internal.gn$d */
    private final class C0815d extends C0571b<OnRemoveGeofencesResultListener> {

        /* renamed from: mC */
        private final int f1922mC;
        private final PendingIntent mPendingIntent;

        /* renamed from: xY */
        private final String[] f1923xY;

        /* renamed from: yd */
        private final int f1925yd;

        public C0815d(C0810gn gnVar, int i, OnRemoveGeofencesResultListener onRemoveGeofencesResultListener, int i2, PendingIntent pendingIntent) {
            boolean z = true;
            C0810gn.this = gnVar;
            super(onRemoveGeofencesResultListener);
            if (i != 1) {
                z = false;
            }
            C0564ds.m1397p(z);
            this.f1925yd = i;
            this.f1922mC = LocationStatusCodes.m3029aR(i2);
            this.mPendingIntent = pendingIntent;
            this.f1923xY = null;
        }

        public C0815d(int i, OnRemoveGeofencesResultListener onRemoveGeofencesResultListener, int i2, String[] strArr) {
            super(onRemoveGeofencesResultListener);
            C0564ds.m1397p(i == 2);
            this.f1925yd = i;
            this.f1922mC = LocationStatusCodes.m3029aR(i2);
            this.f1923xY = strArr;
            this.mPendingIntent = null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo3743b(OnRemoveGeofencesResultListener onRemoveGeofencesResultListener) {
            if (onRemoveGeofencesResultListener != null) {
                switch (this.f1925yd) {
                    case 1:
                        onRemoveGeofencesResultListener.onRemoveGeofencesByPendingIntentResult(this.f1922mC, this.mPendingIntent);
                        return;
                    case 2:
                        onRemoveGeofencesResultListener.onRemoveGeofencesByRequestIdsResult(this.f1922mC, this.f1923xY);
                        return;
                    default:
                        Log.wtf("LocationClientImpl", "Unsupported action: " + this.f1925yd);
                        return;
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: aL */
        public void mo3742aL() {
        }
    }

    public C0810gn(Context context, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener, String str) {
        super(context, connectionCallbacks, onConnectionFailedListener, new String[0]);
        this.f1912xV = new C0807gm(context, this.f1911xP);
        this.f1914xX = str;
        this.f1910jG = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public C0804gl mo2643p(IBinder iBinder) {
        return C0805a.m2402L(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2638a(C0590ec ecVar, C0574e eVar) throws RemoteException {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", this.f1914xX);
        ecVar.mo3957e(eVar, GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE, getContext().getPackageName(), bundle);
    }

    public void addGeofences(List<C0816go> geofences, PendingIntent pendingIntent, OnAddGeofencesResultListener listener) {
        mo3889bP();
        C0600eg.m1553b(geofences != null && geofences.size() > 0, (Object) "At least one geofence must be specified.");
        C0600eg.m1552b(pendingIntent, (Object) "PendingIntent must be specified.");
        C0600eg.m1552b(listener, (Object) "OnAddGeofencesResultListener not provided.");
        try {
            ((C0804gl) mo3890bQ()).mo4497a(geofences, pendingIntent, (C0801gk) listener == null ? null : new C0813b(listener, this), getContext().getPackageName());
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: am */
    public String mo2639am() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: an */
    public String mo2640an() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    public void disconnect() {
        synchronized (this.f1912xV) {
            if (isConnected()) {
                this.f1912xV.removeAllListeners();
                this.f1912xV.mo4509dI();
            }
            super.disconnect();
        }
    }

    public Location getLastLocation() {
        return this.f1912xV.getLastLocation();
    }

    public void removeActivityUpdates(PendingIntent callbackIntent) {
        mo3889bP();
        C0600eg.m1554f(callbackIntent);
        try {
            ((C0804gl) mo3890bQ()).removeActivityUpdates(callbackIntent);
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    public void removeGeofences(PendingIntent pendingIntent, OnRemoveGeofencesResultListener listener) {
        mo3889bP();
        C0600eg.m1552b(pendingIntent, (Object) "PendingIntent must be specified.");
        C0600eg.m1552b(listener, (Object) "OnRemoveGeofencesResultListener not provided.");
        try {
            ((C0804gl) mo3890bQ()).mo4477a(pendingIntent, (C0801gk) listener == null ? null : new C0813b(listener, this), getContext().getPackageName());
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    public void removeGeofences(List<String> geofenceRequestIds, OnRemoveGeofencesResultListener listener) {
        mo3889bP();
        C0600eg.m1553b(geofenceRequestIds != null && geofenceRequestIds.size() > 0, (Object) "geofenceRequestIds can't be null nor empty.");
        C0600eg.m1552b(listener, (Object) "OnRemoveGeofencesResultListener not provided.");
        try {
            ((C0804gl) mo3890bQ()).mo4498a((String[]) geofenceRequestIds.toArray(new String[0]), (C0801gk) listener == null ? null : new C0813b(listener, this), getContext().getPackageName());
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    public void removeLocationUpdates(PendingIntent callbackIntent) {
        this.f1912xV.removeLocationUpdates(callbackIntent);
    }

    public void removeLocationUpdates(LocationListener listener) {
        this.f1912xV.removeLocationUpdates(listener);
    }

    public void requestActivityUpdates(long detectionIntervalMillis, PendingIntent callbackIntent) {
        boolean z = true;
        mo3889bP();
        C0600eg.m1554f(callbackIntent);
        if (detectionIntervalMillis < 0) {
            z = false;
        }
        C0600eg.m1553b(z, (Object) "detectionIntervalMillis must be >= 0");
        try {
            ((C0804gl) mo3890bQ()).mo4475a(detectionIntervalMillis, true, callbackIntent);
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    public void requestLocationUpdates(LocationRequest request, PendingIntent callbackIntent) {
        this.f1912xV.requestLocationUpdates(request, callbackIntent);
    }

    public void requestLocationUpdates(LocationRequest request, LocationListener listener) {
        requestLocationUpdates(request, listener, null);
    }

    public void requestLocationUpdates(LocationRequest request, LocationListener listener, Looper looper) {
        synchronized (this.f1912xV) {
            this.f1912xV.requestLocationUpdates(request, listener, looper);
        }
    }

    public void setMockLocation(Location mockLocation) {
        this.f1912xV.setMockLocation(mockLocation);
    }

    public void setMockMode(boolean isMockMode) {
        this.f1912xV.setMockMode(isMockMode);
    }
}
