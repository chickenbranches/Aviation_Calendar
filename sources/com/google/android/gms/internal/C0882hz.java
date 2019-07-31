package com.google.android.gms.internal;

import android.net.Uri;
import com.google.android.gms.common.api.Api.C0145b;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.plus.Moments;
import com.google.android.gms.plus.Moments.LoadMomentsResult;
import com.google.android.gms.plus.Plus.C1102a;
import com.google.android.gms.plus.model.moments.Moment;
import com.google.android.gms.plus.model.moments.MomentBuffer;

/* renamed from: com.google.android.gms.internal.hz */
public final class C0882hz implements Moments {

    /* renamed from: Ea */
    private final C0145b<C0866hs> f2176Ea;

    /* renamed from: com.google.android.gms.internal.hz$a */
    private static abstract class C0887a extends C1102a<LoadMomentsResult> {
        C0887a(C0145b<C0866hs> bVar) {
            super(bVar);
        }

        /* renamed from: K */
        public LoadMomentsResult mo2067e(final Status status) {
            return new LoadMomentsResult() {
                public MomentBuffer getMomentBuffer() {
                    return null;
                }

                public String getNextPageToken() {
                    return null;
                }

                public Status getStatus() {
                    return status;
                }

                public String getUpdated() {
                    return null;
                }

                public void release() {
                }
            };
        }
    }

    /* renamed from: com.google.android.gms.internal.hz$b */
    private static abstract class C0889b extends C1102a<Status> {
        C0889b(C0145b<C0866hs> bVar) {
            super(bVar);
        }

        /* renamed from: g */
        public Status mo2067e(Status status) {
            return status;
        }
    }

    /* renamed from: com.google.android.gms.internal.hz$c */
    private static abstract class C0890c extends C1102a<Status> {
        C0890c(C0145b<C0866hs> bVar) {
            super(bVar);
        }

        /* renamed from: g */
        public Status mo2067e(Status status) {
            return status;
        }
    }

    public C0882hz(C0145b<C0866hs> bVar) {
        this.f2176Ea = bVar;
    }

    public PendingResult<LoadMomentsResult> load(GoogleApiClient googleApiClient) {
        return googleApiClient.mo2303a(new C0887a(this.f2176Ea) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo2062a(C0866hs hsVar) {
                hsVar.mo4734j(this);
            }
        });
    }

    public PendingResult<LoadMomentsResult> load(GoogleApiClient googleApiClient, int maxResults, String pageToken, Uri targetUrl, String type, String userId) {
        final int i = maxResults;
        final String str = pageToken;
        final Uri uri = targetUrl;
        final String str2 = type;
        final String str3 = userId;
        return googleApiClient.mo2303a(new C0887a(this.f2176Ea) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo2062a(C0866hs hsVar) {
                hsVar.mo4725a(this, i, str, uri, str2, str3);
            }
        });
    }

    public PendingResult<Status> remove(GoogleApiClient googleApiClient, final String momentId) {
        return googleApiClient.mo2304b(new C0889b(this.f2176Ea) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo2062a(C0866hs hsVar) {
                hsVar.removeMoment(momentId);
                mo2048a(Status.f283nA);
            }
        });
    }

    public PendingResult<Status> write(GoogleApiClient googleApiClient, final Moment moment) {
        return googleApiClient.mo2304b(new C0890c(this.f2176Ea) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo2062a(C0866hs hsVar) {
                hsVar.writeMoment(moment);
                mo2048a(Status.f283nA);
            }
        });
    }
}
