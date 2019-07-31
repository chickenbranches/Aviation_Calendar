package com.google.android.gms.plus;

import android.content.Context;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.C0145b;
import com.google.android.gms.common.api.C0153a.C0154a;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.ApiOptions;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.C0565dt;
import com.google.android.gms.internal.C0600eg;
import com.google.android.gms.internal.C0866hs;
import com.google.android.gms.internal.C0875hu;
import com.google.android.gms.internal.C0878hx;
import com.google.android.gms.internal.C0881hy;
import com.google.android.gms.internal.C0882hz;
import com.google.android.gms.internal.C0892ia;
import java.util.HashSet;
import java.util.Set;

public final class Plus {
    public static final Api API = new Api(f2648jO, new Scope[0]);
    public static final Account AccountApi = new C0878hx(f2648jO);

    /* renamed from: Dr */
    public static final C1115a f2647Dr = new C0881hy(f2648jO);
    public static final Moments MomentsApi = new C0882hz(f2648jO);
    public static final People PeopleApi = new C0892ia(f2648jO);
    public static final Scope SCOPE_PLUS_LOGIN = new Scope(Scopes.PLUS_LOGIN);
    public static final Scope SCOPE_PLUS_PROFILE = new Scope(Scopes.PLUS_ME);

    /* renamed from: jO */
    static final C0145b<C0866hs> f2648jO = new C0145b<C0866hs>() {
        /* renamed from: g */
        public C0866hs mo2057b(Context context, C0565dt dtVar, ApiOptions apiOptions, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            PlusOptions plusOptions;
            PlusOptions plusOptions2 = new PlusOptions();
            if (apiOptions != null) {
                C0600eg.m1553b(apiOptions instanceof PlusOptions, (Object) "Must provide valid PlusOptions!");
                plusOptions = (PlusOptions) apiOptions;
            } else {
                plusOptions = plusOptions2;
            }
            return new C0866hs(context, connectionCallbacks, onConnectionFailedListener, new C0875hu(dtVar.mo3869bF(), dtVar.mo3872bI(), (String[]) plusOptions.f2650Dt.toArray(new String[0]), new String[0], context.getPackageName(), context.getPackageName(), null));
        }

        public int getPriority() {
            return 2;
        }
    };

    public static final class PlusOptions implements ApiOptions {

        /* renamed from: Ds */
        final String f2649Ds;

        /* renamed from: Dt */
        final Set<String> f2650Dt;

        public static final class Builder {

            /* renamed from: Ds */
            String f2651Ds;

            /* renamed from: Dt */
            final Set<String> f2652Dt = new HashSet();

            public Builder addActivityTypes(String... activityTypes) {
                C0600eg.m1552b(activityTypes, (Object) "activityTypes may not be null.");
                for (String add : activityTypes) {
                    this.f2652Dt.add(add);
                }
                return this;
            }

            public PlusOptions build() {
                return new PlusOptions(this);
            }

            public Builder setServerClientId(String clientId) {
                this.f2651Ds = clientId;
                return this;
            }
        }

        private PlusOptions() {
            this.f2649Ds = null;
            this.f2650Dt = new HashSet();
        }

        private PlusOptions(Builder builder) {
            this.f2649Ds = builder.f2651Ds;
            this.f2650Dt = builder.f2652Dt;
        }

        public static Builder builder() {
            return new Builder();
        }
    }

    /* renamed from: com.google.android.gms.plus.Plus$a */
    public static abstract class C1102a<R extends Result> extends C0154a<R, C0866hs> {
        public C1102a(C0145b<C0866hs> bVar) {
            super(bVar);
        }
    }

    private Plus() {
    }

    /* renamed from: a */
    public static C0866hs m3234a(GoogleApiClient googleApiClient, C0145b<C0866hs> bVar) {
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
}
