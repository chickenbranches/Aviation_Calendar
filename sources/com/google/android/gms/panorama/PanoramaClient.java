package com.google.android.gms.panorama;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesClient;
import com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks;
import com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.C0153a.C0157c;
import com.google.android.gms.internal.C0849hm;
import com.google.android.gms.panorama.Panorama.PanoramaResult;

public class PanoramaClient implements GooglePlayServicesClient {

    /* renamed from: Di */
    private final C0849hm f2642Di;

    public interface OnPanoramaInfoLoadedListener {
        void onPanoramaInfoLoaded(ConnectionResult connectionResult, Intent intent);
    }

    public PanoramaClient(Context context, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener connectionFailedListener) {
        this.f2642Di = new C0849hm(context, connectionCallbacks, connectionFailedListener);
    }

    public void connect() {
        this.f2642Di.connect();
    }

    public void disconnect() {
        this.f2642Di.disconnect();
    }

    public boolean isConnected() {
        return this.f2642Di.isConnected();
    }

    public boolean isConnecting() {
        return this.f2642Di.isConnecting();
    }

    public boolean isConnectionCallbacksRegistered(ConnectionCallbacks listener) {
        return this.f2642Di.isConnectionCallbacksRegistered(listener);
    }

    public boolean isConnectionFailedListenerRegistered(OnConnectionFailedListener listener) {
        return this.f2642Di.isConnectionFailedListenerRegistered(listener);
    }

    public void loadPanoramaInfo(final OnPanoramaInfoLoadedListener listener, Uri uri) {
        this.f2642Di.mo4676a(new C0157c<PanoramaResult>() {
            /* renamed from: a */
            public void mo2048a(PanoramaResult panoramaResult) {
                listener.onPanoramaInfoLoaded(panoramaResult.getStatus().mo2344bu(), panoramaResult.getViewerIntent());
            }
        }, uri, false);
    }

    public void loadPanoramaInfoAndGrantAccess(final OnPanoramaInfoLoadedListener listener, Uri uri) {
        this.f2642Di.mo4676a(new C0157c<PanoramaResult>() {
            /* renamed from: a */
            public void mo2048a(PanoramaResult panoramaResult) {
                listener.onPanoramaInfoLoaded(panoramaResult.getStatus().mo2344bu(), panoramaResult.getViewerIntent());
            }
        }, uri, true);
    }

    public void registerConnectionCallbacks(ConnectionCallbacks listener) {
        this.f2642Di.registerConnectionCallbacks(listener);
    }

    public void registerConnectionFailedListener(OnConnectionFailedListener listener) {
        this.f2642Di.registerConnectionFailedListener(listener);
    }

    public void unregisterConnectionCallbacks(ConnectionCallbacks listener) {
        this.f2642Di.unregisterConnectionCallbacks(listener);
    }

    public void unregisterConnectionFailedListener(OnConnectionFailedListener listener) {
        this.f2642Di.unregisterConnectionFailedListener(listener);
    }
}
