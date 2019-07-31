package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.C0153a.C0157c;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.CreateFileActivityBuilder;
import com.google.android.gms.drive.Drive;
import com.google.android.gms.drive.DriveApi;
import com.google.android.gms.drive.DriveApi.ContentsResult;
import com.google.android.gms.drive.DriveApi.DriveIdResult;
import com.google.android.gms.drive.DriveApi.MetadataBufferResult;
import com.google.android.gms.drive.DriveFile;
import com.google.android.gms.drive.DriveFolder;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.MetadataBuffer;
import com.google.android.gms.drive.OpenFileActivityBuilder;
import com.google.android.gms.drive.query.Query;

/* renamed from: com.google.android.gms.drive.internal.h */
public class C0190h implements DriveApi {

    /* renamed from: com.google.android.gms.drive.internal.h$a */
    static class C0196a implements ContentsResult {

        /* renamed from: jY */
        private final Status f438jY;

        /* renamed from: qK */
        private final Contents f439qK;

        public C0196a(Status status, Contents contents) {
            this.f438jY = status;
            this.f439qK = contents;
        }

        public Contents getContents() {
            return this.f439qK;
        }

        public Status getStatus() {
            return this.f438jY;
        }
    }

    /* renamed from: com.google.android.gms.drive.internal.h$b */
    abstract class C0197b extends C0207i<Status> {
        C0197b() {
        }

        /* renamed from: g */
        public Status mo2067e(Status status) {
            return status;
        }
    }

    /* renamed from: com.google.android.gms.drive.internal.h$c */
    private static class C0198c extends C0182a {

        /* renamed from: jW */
        private final C0157c<DriveIdResult> f441jW;

        public C0198c(C0157c<DriveIdResult> cVar) {
            this.f441jW = cVar;
        }

        /* renamed from: a */
        public void mo2597a(OnMetadataResponse onMetadataResponse) throws RemoteException {
            this.f441jW.mo2048a(new C0199d(Status.f283nA, new C0189g(onMetadataResponse.mo2582cU()).getDriveId()));
        }

        /* renamed from: m */
        public void mo2598m(Status status) throws RemoteException {
            this.f441jW.mo2048a(new C0199d(status, null));
        }
    }

    /* renamed from: com.google.android.gms.drive.internal.h$d */
    static class C0199d implements DriveIdResult {

        /* renamed from: jY */
        private final Status f442jY;

        /* renamed from: qG */
        private final DriveId f443qG;

        public C0199d(Status status, DriveId driveId) {
            this.f442jY = status;
            this.f443qG = driveId;
        }

        public DriveId getDriveId() {
            return this.f443qG;
        }

        public Status getStatus() {
            return this.f442jY;
        }
    }

    /* renamed from: com.google.android.gms.drive.internal.h$e */
    abstract class C0200e extends C0207i<DriveIdResult> {
        C0200e() {
        }

        /* renamed from: n */
        public DriveIdResult mo2067e(Status status) {
            return new C0199d(status, null);
        }
    }

    /* renamed from: com.google.android.gms.drive.internal.h$f */
    static class C0201f implements MetadataBufferResult {

        /* renamed from: jY */
        private final Status f445jY;

        /* renamed from: rf */
        private final MetadataBuffer f446rf;

        public C0201f(Status status, MetadataBuffer metadataBuffer) {
            this.f445jY = status;
            this.f446rf = metadataBuffer;
        }

        public MetadataBuffer getMetadataBuffer() {
            return this.f446rf;
        }

        public Status getStatus() {
            return this.f445jY;
        }
    }

    /* renamed from: com.google.android.gms.drive.internal.h$g */
    private static class C0202g extends C0182a {

        /* renamed from: jW */
        private final C0157c<ContentsResult> f447jW;

        public C0202g(C0157c<ContentsResult> cVar) {
            this.f447jW = cVar;
        }

        /* renamed from: a */
        public void mo2593a(OnContentsResponse onContentsResponse) throws RemoteException {
            this.f447jW.mo2048a(new C0196a(Status.f283nA, onContentsResponse.mo2569cQ()));
        }

        /* renamed from: m */
        public void mo2598m(Status status) throws RemoteException {
            this.f447jW.mo2048a(new C0196a(status, null));
        }
    }

    /* renamed from: com.google.android.gms.drive.internal.h$h */
    abstract class C0203h extends C0207i<ContentsResult> {
        C0203h() {
        }

        /* renamed from: o */
        public ContentsResult mo2067e(Status status) {
            return new C0196a(status, null);
        }
    }

    /* renamed from: com.google.android.gms.drive.internal.h$i */
    static class C0204i extends C0182a {

        /* renamed from: jW */
        private final C0157c<MetadataBufferResult> f449jW;

        public C0204i(C0157c<MetadataBufferResult> cVar) {
            this.f449jW = cVar;
        }

        /* renamed from: a */
        public void mo2596a(OnListEntriesResponse onListEntriesResponse) throws RemoteException {
            this.f449jW.mo2048a(new C0201f(Status.f283nA, new MetadataBuffer(onListEntriesResponse.mo2579cT(), null)));
        }

        /* renamed from: m */
        public void mo2598m(Status status) throws RemoteException {
            this.f449jW.mo2048a(new C0201f(status, null));
        }
    }

    /* renamed from: com.google.android.gms.drive.internal.h$j */
    abstract class C0205j extends C0207i<MetadataBufferResult> {
        C0205j() {
        }

        /* renamed from: p */
        public MetadataBufferResult mo2067e(Status status) {
            return new C0201f(status, null);
        }
    }

    /* renamed from: com.google.android.gms.drive.internal.h$k */
    abstract class C0206k extends C0207i<Status> {
        C0206k() {
        }

        /* renamed from: g */
        public Status mo2067e(Status status) {
            return status;
        }
    }

    public PendingResult<Status> discardContents(GoogleApiClient apiClient, final Contents contents) {
        return apiClient.mo2304b(new C0197b() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo2062a(C0208j jVar) {
                try {
                    jVar.mo2641cN().mo2662a(new CloseContentsRequest(contents, false), (C0234p) new C0246z(this));
                } catch (RemoteException e) {
                    mo2048a(new Status(8, e.getLocalizedMessage(), null));
                }
            }
        });
    }

    public PendingResult<DriveIdResult> fetchDriveId(GoogleApiClient apiClient, final String resourceId) {
        return apiClient.mo2303a(new C0200e() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo2062a(C0208j jVar) {
                try {
                    jVar.mo2641cN().mo2666a(new GetMetadataRequest(DriveId.m356ab(resourceId)), (C0234p) new C0198c(this));
                } catch (RemoteException e) {
                    mo2048a(new C0199d(new Status(8, e.getLocalizedMessage(), null), null));
                }
            }
        });
    }

    public DriveFile getFile(GoogleApiClient apiClient, DriveId id) {
        if (id == null) {
            throw new IllegalArgumentException("Id must be provided.");
        } else if (apiClient.isConnected()) {
            return new C0209k(id);
        } else {
            throw new IllegalStateException("Client must be connected");
        }
    }

    public DriveFolder getFolder(GoogleApiClient apiClient, DriveId id) {
        if (id == null) {
            throw new IllegalArgumentException("Id must be provided.");
        } else if (apiClient.isConnected()) {
            return new C0215l(id);
        } else {
            throw new IllegalStateException("Client must be connected");
        }
    }

    public DriveFolder getRootFolder(GoogleApiClient apiClient) {
        if (apiClient.isConnected()) {
            return new C0215l(((C0208j) apiClient.mo2302a(Drive.f371jO)).mo2642cO());
        }
        throw new IllegalStateException("Client must be connected");
    }

    public PendingResult<ContentsResult> newContents(GoogleApiClient apiClient) {
        return apiClient.mo2303a(new C0203h() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo2062a(C0208j jVar) {
                try {
                    jVar.mo2641cN().mo2663a(new CreateContentsRequest(), (C0234p) new C0202g(this));
                } catch (RemoteException e) {
                    mo2048a(new C0196a(new Status(8, e.getLocalizedMessage(), null), null));
                }
            }
        });
    }

    public CreateFileActivityBuilder newCreateFileActivityBuilder() {
        return new CreateFileActivityBuilder();
    }

    public OpenFileActivityBuilder newOpenFileActivityBuilder() {
        return new OpenFileActivityBuilder();
    }

    public PendingResult<MetadataBufferResult> query(GoogleApiClient apiClient, final Query query) {
        if (query != null) {
            return apiClient.mo2303a(new C0205j() {
                /* access modifiers changed from: protected */
                /* renamed from: a */
                public void mo2062a(C0208j jVar) {
                    try {
                        jVar.mo2641cN().mo2668a(new QueryRequest(query), (C0234p) new C0204i(this));
                    } catch (RemoteException e) {
                        mo2048a(new C0201f(new Status(8, e.getLocalizedMessage(), null), null));
                    }
                }
            });
        }
        throw new IllegalArgumentException("Query must be provided.");
    }

    public PendingResult<Status> requestSync(GoogleApiClient client) {
        return client.mo2304b(new C0206k() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo2062a(C0208j jVar) {
                try {
                    jVar.mo2641cN().mo2670a((C0234p) new C0246z(this));
                } catch (RemoteException e) {
                    mo2048a(new Status(8, e.getLocalizedMessage(), null));
                }
            }
        });
    }
}
