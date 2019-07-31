package com.google.android.gms.drive;

import android.content.IntentSender;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.drive.internal.C0208j;
import com.google.android.gms.drive.internal.OpenFileIntentSenderRequest;
import com.google.android.gms.internal.C0600eg;

public class OpenFileActivityBuilder {
    public static final String EXTRA_RESPONSE_DRIVE_ID = "response_drive_id";

    /* renamed from: qL */
    private String f384qL;

    /* renamed from: qM */
    private DriveId f385qM;

    /* renamed from: qW */
    private String[] f386qW;

    public IntentSender build(GoogleApiClient apiClient) {
        C0600eg.m1552b(this.f386qW, (Object) "setMimeType(String[]) must be called on this builder before calling build()");
        C0600eg.m1550a(apiClient.isConnected(), "Client must be connected");
        try {
            return ((C0208j) apiClient.mo2302a(Drive.f371jO)).mo2641cN().mo2661a(new OpenFileIntentSenderRequest(this.f384qL, this.f386qW, this.f385qM));
        } catch (RemoteException e) {
            throw new RuntimeException("Unable to connect Drive Play Service", e);
        }
    }

    public OpenFileActivityBuilder setActivityStartFolder(DriveId folder) {
        this.f385qM = (DriveId) C0600eg.m1554f(folder);
        return this;
    }

    public OpenFileActivityBuilder setActivityTitle(String title) {
        this.f384qL = (String) C0600eg.m1554f(title);
        return this;
    }

    public OpenFileActivityBuilder setMimeType(String[] mimeTypes) {
        C0600eg.m1553b(mimeTypes != null && mimeTypes.length > 0, (Object) "mimeTypes may not be null and must contain at least one value");
        this.f386qW = mimeTypes;
        return this;
    }
}
