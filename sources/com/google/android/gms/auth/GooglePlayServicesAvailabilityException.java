package com.google.android.gms.auth;

import android.content.Intent;

public class GooglePlayServicesAvailabilityException extends UserRecoverableAuthException {

    /* renamed from: kf */
    private final int f127kf;

    GooglePlayServicesAvailabilityException(int connectionStatusCode, String msg, Intent intent) {
        super(msg, intent);
        this.f127kf = connectionStatusCode;
    }

    public int getConnectionStatusCode() {
        return this.f127kf;
    }
}
