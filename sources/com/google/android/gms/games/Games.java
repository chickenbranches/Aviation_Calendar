package com.google.android.gms.games;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.google.android.gms.common.Scopes;
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
import com.google.android.gms.games.achievement.Achievements;
import com.google.android.gms.games.leaderboard.Leaderboards;
import com.google.android.gms.games.multiplayer.Invitations;
import com.google.android.gms.games.multiplayer.Multiplayer;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMultiplayer;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer;
import com.google.android.gms.internal.C0565dt;
import com.google.android.gms.internal.C0600eg;
import com.google.android.gms.internal.C0639fl;
import com.google.android.gms.internal.C0716fs;
import com.google.android.gms.internal.C0730ft;
import com.google.android.gms.internal.C0731fu;
import com.google.android.gms.internal.C0735fv;
import com.google.android.gms.internal.C0739fw;
import com.google.android.gms.internal.C0755fx;
import com.google.android.gms.internal.C0756fy;
import com.google.android.gms.internal.C0757fz;
import com.google.android.gms.internal.C0767ga;
import com.google.android.gms.internal.C0768gb;
import com.google.android.gms.internal.C0795gg;

public final class Games {
    public static final Api API = new Api(f584jO, SCOPE_GAMES);
    public static final Achievements Achievements = new C0716fs();
    public static final GamesMetadata GamesMetadata = new C0731fu();
    public static final Invitations Invitations = new C0735fv();
    public static final Leaderboards Leaderboards = new C0739fw();
    public static final Notifications Notifications = new C0756fy();
    public static final Players Players = new C0757fz();
    public static final RealTimeMultiplayer RealTimeMultiplayer = new C0767ga();
    public static final Scope SCOPE_GAMES = new Scope(Scopes.GAMES);
    public static final TurnBasedMultiplayer TurnBasedMultiplayer = new C0768gb();

    /* renamed from: jO */
    static final C0145b<C0639fl> f584jO = new C0145b<C0639fl>() {
        /* renamed from: e */
        public C0639fl mo2057b(Context context, C0565dt dtVar, ApiOptions apiOptions, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            GamesOptions gamesOptions;
            GamesOptions gamesOptions2 = new GamesOptions();
            if (apiOptions != null) {
                C0600eg.m1553b(apiOptions instanceof GamesOptions, (Object) "Must provide valid GamesOptions!");
                gamesOptions = (GamesOptions) apiOptions;
            } else {
                gamesOptions = gamesOptions2;
            }
            return new C0639fl(context, dtVar.mo3873bJ(), dtVar.mo3869bF(), connectionCallbacks, onConnectionFailedListener, dtVar.mo3872bI(), dtVar.mo3870bG(), dtVar.mo3874bK(), gamesOptions.f589ta, gamesOptions.f590tb, gamesOptions.f591tc, gamesOptions.f592td);
        }

        public int getPriority() {
            return 1;
        }
    };

    /* renamed from: sW */
    public static final Scope f585sW = new Scope("https://www.googleapis.com/auth/games.firstparty");

    /* renamed from: sX */
    public static final Api f586sX = new Api(f584jO, f585sW);

    /* renamed from: sY */
    public static final Multiplayer f587sY = new C0755fx();

    /* renamed from: sZ */
    public static final C0795gg f588sZ = new C0730ft();

    public static final class GamesOptions implements ApiOptions {

        /* renamed from: ta */
        final boolean f589ta;

        /* renamed from: tb */
        final boolean f590tb;

        /* renamed from: tc */
        final int f591tc;

        /* renamed from: td */
        final int f592td;

        public static final class Builder {

            /* renamed from: ta */
            boolean f593ta;

            /* renamed from: tb */
            boolean f594tb;

            /* renamed from: tc */
            int f595tc;

            /* renamed from: td */
            int f596td;

            private Builder() {
                this.f593ta = false;
                this.f594tb = true;
                this.f595tc = 17;
                this.f596td = 4368;
            }

            public GamesOptions build() {
                return new GamesOptions(this);
            }

            public Builder setSdkVariant(int variant) {
                this.f596td = variant;
                return this;
            }

            public Builder setShowConnectingPopup(boolean showConnectingPopup) {
                this.f594tb = showConnectingPopup;
                this.f595tc = 17;
                return this;
            }

            public Builder setShowConnectingPopup(boolean showConnectingPopup, int gravity) {
                this.f594tb = showConnectingPopup;
                this.f595tc = gravity;
                return this;
            }
        }

        private GamesOptions() {
            this.f589ta = false;
            this.f590tb = true;
            this.f591tc = 17;
            this.f592td = 4368;
        }

        private GamesOptions(Builder builder) {
            this.f589ta = builder.f593ta;
            this.f590tb = builder.f594tb;
            this.f591tc = builder.f595tc;
            this.f592td = builder.f596td;
        }

        public static Builder builder() {
            return new Builder();
        }
    }

    /* renamed from: com.google.android.gms.games.Games$a */
    public static abstract class C0280a<R extends Result> extends C0154a<R, C0639fl> implements PendingResult<R> {
        public C0280a() {
            super(Games.f584jO);
        }
    }

    /* renamed from: com.google.android.gms.games.Games$b */
    private static abstract class C0281b extends C0280a<Status> {
        private C0281b() {
        }

        /* renamed from: g */
        public Status mo2067e(Status status) {
            return status;
        }
    }

    private Games() {
    }

    public static String getAppId(GoogleApiClient apiClient) {
        return m645j(apiClient).getAppId();
    }

    public static String getCurrentAccountName(GoogleApiClient apiClient) {
        return m645j(apiClient).getCurrentAccountName();
    }

    public static int getSdkVariant(GoogleApiClient apiClient) {
        return m645j(apiClient).mo4185dd();
    }

    public static Intent getSettingsIntent(GoogleApiClient apiClient) {
        return m645j(apiClient).getSettingsIntent();
    }

    /* renamed from: j */
    public static C0639fl m645j(GoogleApiClient googleApiClient) {
        boolean z = true;
        C0600eg.m1553b(googleApiClient != null, (Object) "GoogleApiClient parameter is required.");
        C0600eg.m1550a(googleApiClient.isConnected(), "GoogleApiClient must be connected.");
        C0639fl flVar = (C0639fl) googleApiClient.mo2302a(f584jO);
        if (flVar == null) {
            z = false;
        }
        C0600eg.m1550a(z, "GoogleApiClient is not configured to use the Games Api. Pass Games.API into GoogleApiClient.Builder#addApi() to use this feature.");
        return flVar;
    }

    public static void setGravityForPopups(GoogleApiClient apiClient, int gravity) {
        m645j(apiClient).setGravityForPopups(gravity);
    }

    public static void setViewForPopups(GoogleApiClient apiClient, View gamesContentView) {
        C0600eg.m1554f(gamesContentView);
        m645j(apiClient).setViewForPopups(gamesContentView);
    }

    public static PendingResult<Status> signOut(GoogleApiClient apiClient) {
        return apiClient.mo2304b(new C0281b() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo2062a(C0639fl flVar) {
                flVar.mo4176b(this);
            }
        });
    }
}
