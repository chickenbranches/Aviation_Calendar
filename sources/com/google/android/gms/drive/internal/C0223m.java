package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.C0153a.C0157c;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.DriveResource;
import com.google.android.gms.drive.DriveResource.MetadataResult;
import com.google.android.gms.drive.Metadata;
import com.google.android.gms.drive.MetadataChangeSet;

/* renamed from: com.google.android.gms.drive.internal.m */
public class C0223m implements DriveResource {
    /* access modifiers changed from: private */

    /* renamed from: qG */
    public final DriveId f475qG;

    /* renamed from: com.google.android.gms.drive.internal.m$a */
    private abstract class C0226a extends C0207i<MetadataResult> {
        private C0226a() {
        }

        /* renamed from: s */
        public MetadataResult mo2067e(Status status) {
            return new C0228c(status, null);
        }
    }

    /* renamed from: com.google.android.gms.drive.internal.m$b */
    private static class C0227b extends C0182a {

        /* renamed from: jW */
        private final C0157c<MetadataResult> f480jW;

        public C0227b(C0157c<MetadataResult> cVar) {
            this.f480jW = cVar;
        }

        /* renamed from: a */
        public void mo2597a(OnMetadataResponse onMetadataResponse) throws RemoteException {
            this.f480jW.mo2048a(new C0228c(Status.f283nA, new C0189g(onMetadataResponse.mo2582cU())));
        }

        /* renamed from: m */
        public void mo2598m(Status status) throws RemoteException {
            this.f480jW.mo2048a(new C0228c(status, null));
        }
    }

    /* renamed from: com.google.android.gms.drive.internal.m$c */
    private static class C0228c implements MetadataResult {

        /* renamed from: jY */
        private final Status f481jY;

        /* renamed from: rq */
        private final Metadata f482rq;

        public C0228c(Status status, Metadata metadata) {
            this.f481jY = status;
            this.f482rq = metadata;
        }

        public Metadata getMetadata() {
            return this.f482rq;
        }

        public Status getStatus() {
            return this.f481jY;
        }
    }

    /* renamed from: com.google.android.gms.drive.internal.m$d */
    private abstract class C0229d extends C0207i<MetadataResult> {
        private C0229d() {
        }

        /* renamed from: s */
        public MetadataResult mo2067e(Status status) {
            return new C0228c(status, null);
        }
    }

    public C0223m(DriveId driveId) {
        this.f475qG = driveId;
    }

    public DriveId getDriveId() {
        return this.f475qG;
    }

    public PendingResult<MetadataResult> getMetadata(GoogleApiClient apiClient) {
        return apiClient.mo2303a(new C0226a() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo2062a(C0208j jVar) {
                try {
                    jVar.mo2641cN().mo2666a(new GetMetadataRequest(C0223m.this.f475qG), (C0234p) new C0227b(this));
                } catch (RemoteException e) {
                    mo2048a(new C0228c(new Status(8, e.getLocalizedMessage(), null), null));
                }
            }
        });
    }

    public PendingResult<MetadataResult> updateMetadata(GoogleApiClient apiClient, final MetadataChangeSet changeSet) {
        if (changeSet != null) {
            return apiClient.mo2304b(new C0229d() {
                /* access modifiers changed from: protected */
                /* renamed from: a */
                public void mo2062a(C0208j jVar) {
                    try {
                        jVar.mo2641cN().mo2669a(new UpdateMetadataRequest(C0223m.this.f475qG, changeSet.mo2535cM()), (C0234p) new C0227b(this));
                    } catch (RemoteException e) {
                        mo2048a(new C0228c(new Status(8, e.getLocalizedMessage(), null), null));
                    }
                }
            });
        }
        throw new IllegalArgumentException("ChangeSet must be provided.");
    }
}
