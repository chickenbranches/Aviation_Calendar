package com.google.android.gms.panorama;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.C0145b;
import com.google.android.gms.common.api.C0153a.C0154a;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.ApiOptions;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.C0565dt;
import com.google.android.gms.internal.C0849hm;

public final class Panorama {
    public static final Api API = new Api(f2637jO, new Scope[0]);

    /* renamed from: jO */
    static final C0145b<C0849hm> f2637jO = new C0145b<C0849hm>() {
        /* renamed from: f */
        public C0849hm mo2057b(Context context, C0565dt dtVar, ApiOptions apiOptions, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            return new C0849hm(context, connectionCallbacks, onConnectionFailedListener);
        }

        public int getPriority() {
            return Integer.MAX_VALUE;
        }
    };

    public interface PanoramaResult extends Result {
        Intent getViewerIntent();
    }

    /* renamed from: com.google.android.gms.panorama.Panorama$a */
    public interface C1096a extends PanoramaResult {
    }

    /* renamed from: com.google.android.gms.panorama.Panorama$b */
    private static abstract class C1097b extends C0154a<PanoramaResult, C0849hm> {
        public C1097b() {
            super(Panorama.f2637jO);
        }

        /* renamed from: J */
        public PanoramaResult mo2067e(final Status status) {
            return new PanoramaResult() {
                public Status getStatus() {
                    return status;
                }

                public Intent getViewerIntent() {
                    return null;
                }
            };
        }
    }

    private Panorama() {
    }

    public static PendingResult<PanoramaResult> loadPanoramaInfo(GoogleApiClient client, final Uri uri) {
        return client.mo2303a(new C1097b() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo2062a(C0849hm hmVar) {
                hmVar.mo4676a(this, uri, false);
            }
        });
    }

    public static PendingResult<PanoramaResult> loadPanoramaInfoAndGrantAccess(GoogleApiClient client, final Uri uri) {
        return client.mo2303a(new C1097b() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo2062a(C0849hm hmVar) {
                hmVar.mo4676a(this, uri, true);
            }
        });
    }
}
