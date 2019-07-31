package com.google.android.gms.wallet;

import android.app.Activity;
import com.google.android.gms.common.GooglePlayServicesClient;
import com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks;
import com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener;
import com.google.android.gms.internal.C0933iu;

@Deprecated
public class WalletClient implements GooglePlayServicesClient {

    /* renamed from: Hj */
    private final C0933iu f2840Hj;

    public WalletClient(Activity activity, int environment, String accountName, int theme, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener connectionFailedListener) {
        this.f2840Hj = new C0933iu(activity, connectionCallbacks, connectionFailedListener, environment, accountName, theme);
    }

    public WalletClient(Activity activity, int environment, String accountName, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener connectionFailedListener) {
        this(activity, environment, accountName, 0, connectionCallbacks, connectionFailedListener);
    }

    public void changeMaskedWallet(String googleTransactionId, String merchantTransactionId, int requestCode) {
        this.f2840Hj.changeMaskedWallet(googleTransactionId, merchantTransactionId, requestCode);
    }

    public void checkForPreAuthorization(int requestCode) {
        this.f2840Hj.checkForPreAuthorization(requestCode);
    }

    public void connect() {
        this.f2840Hj.connect();
    }

    public void disconnect() {
        this.f2840Hj.disconnect();
    }

    public boolean isConnected() {
        return this.f2840Hj.isConnected();
    }

    public boolean isConnecting() {
        return this.f2840Hj.isConnecting();
    }

    public boolean isConnectionCallbacksRegistered(ConnectionCallbacks listener) {
        return this.f2840Hj.isConnectionCallbacksRegistered(listener);
    }

    public boolean isConnectionFailedListenerRegistered(OnConnectionFailedListener listener) {
        return this.f2840Hj.isConnectionFailedListenerRegistered(listener);
    }

    public void loadFullWallet(FullWalletRequest request, int requestCode) {
        this.f2840Hj.loadFullWallet(request, requestCode);
    }

    public void loadMaskedWallet(MaskedWalletRequest request, int requestCode) {
        this.f2840Hj.loadMaskedWallet(request, requestCode);
    }

    public void notifyTransactionStatus(NotifyTransactionStatusRequest request) {
        this.f2840Hj.notifyTransactionStatus(request);
    }

    public void registerConnectionCallbacks(ConnectionCallbacks listener) {
        this.f2840Hj.registerConnectionCallbacks(listener);
    }

    public void registerConnectionFailedListener(OnConnectionFailedListener listener) {
        this.f2840Hj.registerConnectionFailedListener(listener);
    }

    public void unregisterConnectionCallbacks(ConnectionCallbacks listener) {
        this.f2840Hj.unregisterConnectionCallbacks(listener);
    }

    public void unregisterConnectionFailedListener(OnConnectionFailedListener listener) {
        this.f2840Hj.unregisterConnectionFailedListener(listener);
    }
}
