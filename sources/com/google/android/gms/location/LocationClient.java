package com.google.android.gms.location;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Looper;
import com.google.android.gms.common.GooglePlayServicesClient;
import com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks;
import com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener;
import com.google.android.gms.internal.C0600eg;
import com.google.android.gms.internal.C0810gn;
import com.google.android.gms.internal.C0816go;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LocationClient implements GooglePlayServicesClient {
    public static final String KEY_LOCATION_CHANGED = "com.google.android.location.LOCATION";
    public static final String KEY_MOCK_LOCATION = "mockLocation";

    /* renamed from: xl */
    private final C0810gn f2439xl;

    public interface OnAddGeofencesResultListener {
        void onAddGeofencesResult(int i, String[] strArr);
    }

    public interface OnRemoveGeofencesResultListener {
        void onRemoveGeofencesByPendingIntentResult(int i, PendingIntent pendingIntent);

        void onRemoveGeofencesByRequestIdsResult(int i, String[] strArr);
    }

    public LocationClient(Context context, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener connectionFailedListener) {
        this.f2439xl = new C0810gn(context, connectionCallbacks, connectionFailedListener, "location");
    }

    public static int getErrorCode(Intent intent) {
        return intent.getIntExtra("gms_error_code", -1);
    }

    public static int getGeofenceTransition(Intent intent) {
        int intExtra = intent.getIntExtra("com.google.android.location.intent.extra.transition", -1);
        if (intExtra == -1) {
            return -1;
        }
        if (intExtra == 1 || intExtra == 2 || intExtra == 4) {
            return intExtra;
        }
        return -1;
    }

    public static List<Geofence> getTriggeringGeofences(Intent intent) {
        ArrayList arrayList = (ArrayList) intent.getSerializableExtra("com.google.android.location.intent.extra.geofence_list");
        if (arrayList == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(C0816go.m2454f((byte[]) it.next()));
        }
        return arrayList2;
    }

    public static boolean hasError(Intent intent) {
        return intent.hasExtra("gms_error_code");
    }

    public void addGeofences(List<Geofence> geofences, PendingIntent pendingIntent, OnAddGeofencesResultListener listener) {
        List list = null;
        if (geofences != null) {
            ArrayList arrayList = new ArrayList();
            for (Geofence geofence : geofences) {
                C0600eg.m1553b(geofence instanceof C0816go, (Object) "Geofence must be created using Geofence.Builder.");
                arrayList.add((C0816go) geofence);
            }
            list = arrayList;
        }
        this.f2439xl.addGeofences(list, pendingIntent, listener);
    }

    public void connect() {
        this.f2439xl.connect();
    }

    public void disconnect() {
        this.f2439xl.disconnect();
    }

    public Location getLastLocation() {
        return this.f2439xl.getLastLocation();
    }

    public boolean isConnected() {
        return this.f2439xl.isConnected();
    }

    public boolean isConnecting() {
        return this.f2439xl.isConnecting();
    }

    public boolean isConnectionCallbacksRegistered(ConnectionCallbacks listener) {
        return this.f2439xl.isConnectionCallbacksRegistered(listener);
    }

    public boolean isConnectionFailedListenerRegistered(OnConnectionFailedListener listener) {
        return this.f2439xl.isConnectionFailedListenerRegistered(listener);
    }

    public void registerConnectionCallbacks(ConnectionCallbacks listener) {
        this.f2439xl.registerConnectionCallbacks(listener);
    }

    public void registerConnectionFailedListener(OnConnectionFailedListener listener) {
        this.f2439xl.registerConnectionFailedListener(listener);
    }

    public void removeGeofences(PendingIntent pendingIntent, OnRemoveGeofencesResultListener listener) {
        this.f2439xl.removeGeofences(pendingIntent, listener);
    }

    public void removeGeofences(List<String> geofenceRequestIds, OnRemoveGeofencesResultListener listener) {
        this.f2439xl.removeGeofences(geofenceRequestIds, listener);
    }

    public void removeLocationUpdates(PendingIntent callbackIntent) {
        this.f2439xl.removeLocationUpdates(callbackIntent);
    }

    public void removeLocationUpdates(LocationListener listener) {
        this.f2439xl.removeLocationUpdates(listener);
    }

    public void requestLocationUpdates(LocationRequest request, PendingIntent callbackIntent) {
        this.f2439xl.requestLocationUpdates(request, callbackIntent);
    }

    public void requestLocationUpdates(LocationRequest request, LocationListener listener) {
        this.f2439xl.requestLocationUpdates(request, listener);
    }

    public void requestLocationUpdates(LocationRequest request, LocationListener listener, Looper looper) {
        this.f2439xl.requestLocationUpdates(request, listener, looper);
    }

    public void setMockLocation(Location mockLocation) {
        this.f2439xl.setMockLocation(mockLocation);
    }

    public void setMockMode(boolean isMockMode) {
        this.f2439xl.setMockMode(isMockMode);
    }

    public void unregisterConnectionCallbacks(ConnectionCallbacks listener) {
        this.f2439xl.unregisterConnectionCallbacks(listener);
    }

    public void unregisterConnectionFailedListener(OnConnectionFailedListener listener) {
        this.f2439xl.unregisterConnectionFailedListener(listener);
    }
}
