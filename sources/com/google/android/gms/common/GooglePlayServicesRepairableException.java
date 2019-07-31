package com.google.android.gms.common;

import android.content.Intent;

public class GooglePlayServicesRepairableException extends UserRecoverableException {

    /* renamed from: kf */
    private final int f235kf;

    GooglePlayServicesRepairableException(int connectionStatusCode, String msg, Intent intent) {
        super(msg, intent);
        this.f235kf = connectionStatusCode;
    }

    public int getConnectionStatusCode() {
        return this.f235kf;
    }
}
