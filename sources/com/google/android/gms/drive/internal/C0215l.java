package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.C0153a.C0157c;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveApi.MetadataBufferResult;
import com.google.android.gms.drive.DriveFile;
import com.google.android.gms.drive.DriveFolder;
import com.google.android.gms.drive.DriveFolder.DriveFileResult;
import com.google.android.gms.drive.DriveFolder.DriveFolderResult;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.MetadataChangeSet;
import com.google.android.gms.drive.query.Filters;
import com.google.android.gms.drive.query.Query;
import com.google.android.gms.drive.query.Query.Builder;
import com.google.android.gms.drive.query.SearchableField;

/* renamed from: com.google.android.gms.drive.internal.l */
public class C0215l extends C0223m implements DriveFolder {

    /* renamed from: com.google.android.gms.drive.internal.l$a */
    private static class C0218a extends C0182a {

        /* renamed from: jW */
        private final C0157c<DriveFileResult> f468jW;

        public C0218a(C0157c<DriveFileResult> cVar) {
            this.f468jW = cVar;
        }

        /* renamed from: a */
        public void mo2595a(OnDriveIdResponse onDriveIdResponse) throws RemoteException {
            this.f468jW.mo2048a(new C0221d(Status.f283nA, new C0209k(onDriveIdResponse.getDriveId())));
        }

        /* renamed from: m */
        public void mo2598m(Status status) throws RemoteException {
            this.f468jW.mo2048a(new C0221d(status, null));
        }
    }

    /* renamed from: com.google.android.gms.drive.internal.l$b */
    private static class C0219b extends C0182a {

        /* renamed from: jW */
        private final C0157c<DriveFolderResult> f469jW;

        public C0219b(C0157c<DriveFolderResult> cVar) {
            this.f469jW = cVar;
        }

        /* renamed from: a */
        public void mo2595a(OnDriveIdResponse onDriveIdResponse) throws RemoteException {
            this.f469jW.mo2048a(new C0222e(Status.f283nA, new C0215l(onDriveIdResponse.getDriveId())));
        }

        /* renamed from: m */
        public void mo2598m(Status status) throws RemoteException {
            this.f469jW.mo2048a(new C0222e(status, null));
        }
    }

    /* renamed from: com.google.android.gms.drive.internal.l$c */
    private abstract class C0220c extends C0207i<DriveFolderResult> {
        private C0220c() {
        }

        /* renamed from: r */
        public DriveFolderResult mo2067e(Status status) {
            return new C0222e(status, null);
        }
    }

    /* renamed from: com.google.android.gms.drive.internal.l$d */
    private static class C0221d implements DriveFileResult {

        /* renamed from: jY */
        private final Status f471jY;

        /* renamed from: rn */
        private final DriveFile f472rn;

        public C0221d(Status status, DriveFile driveFile) {
            this.f471jY = status;
            this.f472rn = driveFile;
        }

        public DriveFile getDriveFile() {
            return this.f472rn;
        }

        public Status getStatus() {
            return this.f471jY;
        }
    }

    /* renamed from: com.google.android.gms.drive.internal.l$e */
    private static class C0222e implements DriveFolderResult {

        /* renamed from: jY */
        private final Status f473jY;

        /* renamed from: ro */
        private final DriveFolder f474ro;

        public C0222e(Status status, DriveFolder driveFolder) {
            this.f473jY = status;
            this.f474ro = driveFolder;
        }

        public DriveFolder getDriveFolder() {
            return this.f474ro;
        }

        public Status getStatus() {
            return this.f473jY;
        }
    }

    public C0215l(DriveId driveId) {
        super(driveId);
    }

    public PendingResult<DriveFileResult> createFile(GoogleApiClient apiClient, final MetadataChangeSet changeSet, final Contents contents) {
        if (changeSet == null) {
            throw new IllegalArgumentException("MetatadataChangeSet must be provided.");
        } else if (contents == null) {
            throw new IllegalArgumentException("Contents must be provided.");
        } else if (!DriveFolder.MIME_TYPE.equals(changeSet.getMimeType())) {
            return apiClient.mo2304b(new C0207i<DriveFileResult>() {
                /* access modifiers changed from: protected */
                /* renamed from: a */
                public void mo2062a(C0208j jVar) {
                    try {
                        contents.close();
                        jVar.mo2641cN().mo2664a(new CreateFileRequest(C0215l.this.getDriveId(), changeSet.mo2535cM(), contents), (C0234p) new C0218a(this));
                    } catch (RemoteException e) {
                        mo2048a(new C0221d(new Status(8, e.getLocalizedMessage(), null), null));
                    }
                }

                /* renamed from: q */
                public DriveFileResult mo2067e(Status status) {
                    return new C0221d(status, null);
                }
            });
        } else {
            throw new IllegalArgumentException("May not create folders (mimetype: application/vnd.google-apps.folder) using this method. Use DriveFolder.createFolder() instead.");
        }
    }

    public PendingResult<DriveFolderResult> createFolder(GoogleApiClient apiClient, final MetadataChangeSet changeSet) {
        if (changeSet == null) {
            throw new IllegalArgumentException("MetatadataChangeSet must be provided.");
        } else if (changeSet.getMimeType() == null || changeSet.getMimeType().equals(DriveFolder.MIME_TYPE)) {
            return apiClient.mo2304b(new C0220c() {
                /* access modifiers changed from: protected */
                /* renamed from: a */
                public void mo2062a(C0208j jVar) {
                    try {
                        jVar.mo2641cN().mo2665a(new CreateFolderRequest(C0215l.this.getDriveId(), changeSet.mo2535cM()), (C0234p) new C0219b(this));
                    } catch (RemoteException e) {
                        mo2048a(new C0222e(new Status(8, e.getLocalizedMessage(), null), null));
                    }
                }
            });
        } else {
            throw new IllegalArgumentException("The mimetype must be of type application/vnd.google-apps.folder");
        }
    }

    public PendingResult<MetadataBufferResult> listChildren(GoogleApiClient apiClient) {
        return queryChildren(apiClient, null);
    }

    public PendingResult<MetadataBufferResult> queryChildren(GoogleApiClient apiClient, Query query) {
        Builder addFilter = new Builder().addFilter(Filters.m588in(SearchableField.PARENTS, getDriveId()));
        if (query != null) {
            if (query.getFilter() != null) {
                addFilter.addFilter(query.getFilter());
            }
            addFilter.setPageToken(query.getPageToken());
        }
        return new C0190h().query(apiClient, addFilter.build());
    }
}
