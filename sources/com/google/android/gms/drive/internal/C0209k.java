package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.C0153a.C0157c;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.Drive;
import com.google.android.gms.drive.DriveApi.ContentsResult;
import com.google.android.gms.drive.DriveFile;
import com.google.android.gms.drive.DriveFile.DownloadProgressListener;
import com.google.android.gms.drive.DriveId;

/* renamed from: com.google.android.gms.drive.internal.k */
public class C0209k extends C0223m implements DriveFile {

    /* renamed from: com.google.android.gms.drive.internal.k$a */
    private abstract class C0212a extends C0207i<Status> {
        private C0212a() {
        }

        /* renamed from: g */
        public Status mo2067e(Status status) {
            return status;
        }
    }

    /* renamed from: com.google.android.gms.drive.internal.k$b */
    private static class C0213b extends C0182a {

        /* renamed from: jW */
        private final C0157c<ContentsResult> f460jW;

        /* renamed from: rk */
        private final DownloadProgressListener f461rk;

        public C0213b(C0157c<ContentsResult> cVar, DownloadProgressListener downloadProgressListener) {
            this.f460jW = cVar;
            this.f461rk = downloadProgressListener;
        }

        /* renamed from: a */
        public void mo2593a(OnContentsResponse onContentsResponse) throws RemoteException {
            this.f460jW.mo2048a(new C0196a(Status.f283nA, onContentsResponse.mo2569cQ()));
        }

        /* renamed from: a */
        public void mo2594a(OnDownloadProgressResponse onDownloadProgressResponse) throws RemoteException {
            if (this.f461rk != null) {
                this.f461rk.onProgress(onDownloadProgressResponse.mo2572cR(), onDownloadProgressResponse.mo2573cS());
            }
        }

        /* renamed from: m */
        public void mo2598m(Status status) throws RemoteException {
            this.f460jW.mo2048a(new C0196a(status, null));
        }
    }

    /* renamed from: com.google.android.gms.drive.internal.k$c */
    private abstract class C0214c extends C0207i<ContentsResult> {
        private C0214c() {
        }

        /* renamed from: o */
        public ContentsResult mo2067e(Status status) {
            return new C0196a(status, null);
        }
    }

    public C0209k(DriveId driveId) {
        super(driveId);
    }

    public PendingResult<Status> commitAndCloseContents(GoogleApiClient apiClient, final Contents contents) {
        if (contents != null) {
            return apiClient.mo2304b(new C0212a() {
                /* access modifiers changed from: protected */
                /* renamed from: a */
                public void mo2062a(C0208j jVar) {
                    try {
                        contents.close();
                        jVar.mo2641cN().mo2662a(new CloseContentsRequest(contents, true), (C0234p) new C0246z(this));
                    } catch (RemoteException e) {
                        mo2048a(new Status(8, e.getLocalizedMessage(), null));
                    }
                }
            });
        }
        throw new IllegalArgumentException("Contents must be provided.");
    }

    public PendingResult<Status> discardContents(GoogleApiClient apiClient, Contents contents) {
        return Drive.DriveApi.discardContents(apiClient, contents);
    }

    public PendingResult<ContentsResult> openContents(GoogleApiClient apiClient, final int mode, final DownloadProgressListener listener) {
        if (mode == 268435456 || mode == 536870912 || mode == 805306368) {
            return apiClient.mo2303a(new C0214c() {
                /* access modifiers changed from: protected */
                /* renamed from: a */
                public void mo2062a(C0208j jVar) {
                    try {
                        jVar.mo2641cN().mo2667a(new OpenContentsRequest(C0209k.this.getDriveId(), mode), (C0234p) new C0213b(this, listener));
                    } catch (RemoteException e) {
                        mo2048a(new C0196a(new Status(8, e.getLocalizedMessage(), null), null));
                    }
                }
            });
        }
        throw new IllegalArgumentException("Invalid mode provided.");
    }
}
