package com.google.android.gms.location;

import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.GooglePlayServicesClient;
import com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks;
import com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener;
import com.google.android.gms.internal.C0810gn;

public class ActivityRecognitionClient implements GooglePlayServicesClient {

    /* renamed from: xl */
    private final C0810gn f2422xl;

    public ActivityRecognitionClient(Context context, ConnectionCallbacks connectedListener, OnConnectionFailedListener connectionFailedListener) {
        this.f2422xl = new C0810gn(context, connectedListener, connectionFailedListener, "activity_recognition");
    }

    public void connect() {
        this.f2422xl.connect();
    }

    public void disconnect() {
        this.f2422xl.disconnect();
    }

    public boolean isConnected() {
        return this.f2422xl.isConnected();
    }

    public boolean isConnecting() {
        return this.f2422xl.isConnecting();
    }

    public boolean isConnectionCallbacksRegistered(ConnectionCallbacks listener) {
        return this.f2422xl.isConnectionCallbacksRegistered(listener);
    }

    public boolean isConnectionFailedListenerRegistered(OnConnectionFailedListener listener) {
        return this.f2422xl.isConnectionFailedListenerRegistered(listener);
    }

    public void registerConnectionCallbacks(ConnectionCallbacks listener) {
        this.f2422xl.registerConnectionCallbacks(listener);
    }

    public void registerConnectionFailedListener(OnConnectionFailedListener listener) {
        this.f2422xl.registerConnectionFailedListener(listener);
    }

    public void removeActivityUpdates(PendingIntent callbackIntent) {
        this.f2422xl.removeActivityUpdates(callbackIntent);
    }

    public void requestActivityUpdates(long detectionIntervalMillis, PendingIntent callbackIntent) {
        this.f2422xl.requestActivityUpdates(detectionIntervalMillis, callbackIntent);
    }

    public void unregisterConnectionCallbacks(ConnectionCallbacks listener) {
        this.f2422xl.unregisterConnectionCallbacks(listener);
    }

    public void unregisterConnectionFailedListener(OnConnectionFailedListener listener) {
        this.f2422xl.unregisterConnectionFailedListener(listener);
    }
}
