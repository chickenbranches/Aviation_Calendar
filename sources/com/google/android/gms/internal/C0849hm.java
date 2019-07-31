package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks;
import com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.C0153a.C0157c;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.C0569dw.C0572c;
import com.google.android.gms.internal.C0569dw.C0574e;
import com.google.android.gms.internal.C0569dw.C0576g;
import com.google.android.gms.internal.C0843hk.C0844a;
import com.google.android.gms.internal.C0846hl.C0847a;
import com.google.android.gms.panorama.Panorama.C1096a;
import com.google.android.gms.panorama.Panorama.PanoramaResult;

/* renamed from: com.google.android.gms.internal.hm */
public class C0849hm extends C0569dw<C0846hl> {

    /* renamed from: com.google.android.gms.internal.hm$a */
    final class C0850a extends C0571b<C0157c<C1096a>> implements C1096a {

        /* renamed from: Dl */
        public final Status f2122Dl;

        /* renamed from: Dm */
        public final Intent f2123Dm;
        public final int type;

        public C0850a(C0157c<C1096a> cVar, Status status, int i, Intent intent) {
            super(cVar);
            this.f2122Dl = status;
            this.type = i;
            this.f2123Dm = intent;
        }

        /* access modifiers changed from: protected */
        /* renamed from: aL */
        public void mo3742aL() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void mo3743b(C0157c<C1096a> cVar) {
            cVar.mo2048a(this);
        }

        public Status getStatus() {
            return this.f2122Dl;
        }

        public Intent getViewerIntent() {
            return this.f2123Dm;
        }
    }

    /* renamed from: com.google.android.gms.internal.hm$b */
    final class C0851b extends C0844a {

        /* renamed from: Do */
        private final C0157c<C1096a> f2126Do;

        /* renamed from: Dp */
        private final C0157c<PanoramaResult> f2127Dp;

        /* renamed from: Dq */
        private final Uri f2128Dq;

        public C0851b(C0157c<C1096a> cVar, C0157c<PanoramaResult> cVar2, Uri uri) {
            this.f2126Do = cVar;
            this.f2127Dp = cVar2;
            this.f2128Dq = uri;
        }

        /* renamed from: a */
        public void mo4669a(int i, Bundle bundle, int i2, Intent intent) {
            if (this.f2128Dq != null) {
                C0849hm.this.getContext().revokeUriPermission(this.f2128Dq, 1);
            }
            Status status = new Status(i, null, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null);
            if (this.f2127Dp != null) {
                C0849hm.this.mo3887a((C0571b<?>) new C0852c<Object>(this.f2127Dp, status, intent));
            } else if (this.f2126Do != null) {
                C0849hm.this.mo3887a((C0571b<?>) new C0850a<Object>(this.f2126Do, status, i2, intent));
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.hm$c */
    final class C0852c extends C0571b<C0157c<PanoramaResult>> implements PanoramaResult {

        /* renamed from: Dl */
        private final Status f2129Dl;

        /* renamed from: Dm */
        private final Intent f2130Dm;

        public C0852c(C0157c<PanoramaResult> cVar, Status status, Intent intent) {
            super(cVar);
            this.f2129Dl = status;
            this.f2130Dm = intent;
        }

        /* access modifiers changed from: protected */
        /* renamed from: aL */
        public void mo3742aL() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void mo3743b(C0157c<PanoramaResult> cVar) {
            cVar.mo2048a(this);
        }

        public Status getStatus() {
            return this.f2129Dl;
        }

        public Intent getViewerIntent() {
            return this.f2130Dm;
        }
    }

    @Deprecated
    public C0849hm(Context context, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        this(context, (GoogleApiClient.ConnectionCallbacks) new C0572c(connectionCallbacks), (GoogleApiClient.OnConnectionFailedListener) new C0576g(onConnectionFailedListener));
    }

    public C0849hm(Context context, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, connectionCallbacks, onConnectionFailedListener, (String[]) null);
    }

    /* renamed from: a */
    public void mo4676a(C0157c<PanoramaResult> cVar, Uri uri, boolean z) {
        mo4677a(new C0851b(null, cVar, z ? uri : null), uri, null, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2638a(C0590ec ecVar, C0574e eVar) throws RemoteException {
        ecVar.mo3947a(eVar, GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE, getContext().getPackageName(), new Bundle());
    }

    /* renamed from: a */
    public void mo4677a(C0851b bVar, Uri uri, Bundle bundle, boolean z) {
        mo3889bP();
        if (z) {
            getContext().grantUriPermission(GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_PACKAGE, uri, 1);
        }
        try {
            ((C0846hl) mo3890bQ()).mo4673a(bVar, uri, bundle, z);
        } catch (RemoteException e) {
            bVar.mo4669a(8, null, 0, null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: am */
    public String mo2639am() {
        return "com.google.android.gms.panorama.service.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: an */
    public String mo2640an() {
        return "com.google.android.gms.panorama.internal.IPanoramaService";
    }

    /* renamed from: at */
    public C0846hl mo2643p(IBinder iBinder) {
        return C0847a.m2529as(iBinder);
    }
}
