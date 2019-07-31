package com.google.android.gms.drive;

import android.content.IntentSender;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.drive.internal.C0208j;
import com.google.android.gms.drive.internal.CreateFileIntentSenderRequest;
import com.google.android.gms.internal.C0600eg;
import java.io.IOException;

public class CreateFileActivityBuilder {
    public static final String EXTRA_RESPONSE_DRIVE_ID = "response_drive_id";

    /* renamed from: qJ */
    private MetadataChangeSet f367qJ;

    /* renamed from: qK */
    private Contents f368qK;

    /* renamed from: qL */
    private String f369qL;

    /* renamed from: qM */
    private DriveId f370qM;

    public IntentSender build(GoogleApiClient apiClient) {
        C0600eg.m1552b(this.f368qK, (Object) "Must provide initial contents to CreateFileActivityBuilder.");
        try {
            this.f368qK.getParcelFileDescriptor().close();
        } catch (IOException e) {
        }
        this.f368qK.close();
        C0600eg.m1550a(apiClient.isConnected(), "Client must be connected");
        try {
            return ((C0208j) apiClient.mo2302a(Drive.f371jO)).mo2641cN().mo2660a(new CreateFileIntentSenderRequest(this.f367qJ.mo2535cM(), this.f368qK.mo2469cJ(), this.f369qL, this.f370qM));
        } catch (RemoteException e2) {
            throw new RuntimeException("Unable to connect Drive Play Service", e2);
        }
    }

    public CreateFileActivityBuilder setActivityStartFolder(DriveId folder) {
        this.f370qM = (DriveId) C0600eg.m1554f(folder);
        return this;
    }

    public CreateFileActivityBuilder setActivityTitle(String title) {
        this.f369qL = (String) C0600eg.m1554f(title);
        return this;
    }

    public CreateFileActivityBuilder setInitialContents(Contents contents) {
        this.f368qK = (Contents) C0600eg.m1554f(contents);
        return this;
    }

    public CreateFileActivityBuilder setInitialMetadata(MetadataChangeSet metadataChangeSet) {
        this.f367qJ = (MetadataChangeSet) C0600eg.m1554f(metadataChangeSet);
        return this;
    }
}
