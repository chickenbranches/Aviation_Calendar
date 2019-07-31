package com.google.android.gms.internal;

import com.google.android.gms.common.api.Api.C0145b;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.plus.Account;
import com.google.android.gms.plus.Plus.C1102a;

/* renamed from: com.google.android.gms.internal.hx */
public final class C0878hx implements Account {

    /* renamed from: Ea */
    private final C0145b<C0866hs> f2173Ea;

    /* renamed from: com.google.android.gms.internal.hx$a */
    private static abstract class C0880a extends C1102a<Status> {
        C0880a(C0145b<C0866hs> bVar) {
            super(bVar);
        }

        /* renamed from: g */
        public Status mo2067e(Status status) {
            return status;
        }
    }

    public C0878hx(C0145b<C0866hs> bVar) {
        this.f2173Ea = bVar;
    }

    /* renamed from: a */
    private static C0866hs m2655a(GoogleApiClient googleApiClient, C0145b<C0866hs> bVar) {
        boolean z = true;
        C0600eg.m1553b(googleApiClient != null, (Object) "GoogleApiClient parameter is required.");
        C0600eg.m1550a(googleApiClient.isConnected(), "GoogleApiClient must be connected.");
        C0866hs hsVar = (C0866hs) googleApiClient.mo2302a(bVar);
        if (hsVar == null) {
            z = false;
        }
        C0600eg.m1550a(z, "GoogleApiClient is not configured to use the Plus.API Api. Pass this into GoogleApiClient.Builder#addApi() to use this feature.");
        return hsVar;
    }

    public void clearDefaultAccount(GoogleApiClient googleApiClient) {
        m2655a(googleApiClient, this.f2173Ea).clearDefaultAccount();
    }

    public String getAccountName(GoogleApiClient googleApiClient) {
        return m2655a(googleApiClient, this.f2173Ea).getAccountName();
    }

    public PendingResult<Status> revokeAccessAndDisconnect(GoogleApiClient googleApiClient) {
        return googleApiClient.mo2304b(new C0880a(this.f2173Ea) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo2062a(C0866hs hsVar) {
                hsVar.mo4736l(this);
            }
        });
    }
}
