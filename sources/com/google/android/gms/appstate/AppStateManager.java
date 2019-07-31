package com.google.android.gms.appstate;

import android.content.Context;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.C0145b;
import com.google.android.gms.common.api.C0153a.C0154a;
import com.google.android.gms.common.api.C0153a.C0157c;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.ApiOptions;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.C0522dc;
import com.google.android.gms.internal.C0565dt;
import com.google.android.gms.internal.C0600eg;

public final class AppStateManager {
    public static final Api API = new Api(f102jO, SCOPE_APP_STATE);
    public static final Scope SCOPE_APP_STATE = new Scope(Scopes.APP_STATE);

    /* renamed from: jO */
    static final C0145b<C0522dc> f102jO = new C0145b<C0522dc>() {
        /* renamed from: a */
        public C0522dc mo2057b(Context context, C0565dt dtVar, ApiOptions apiOptions, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            return new C0522dc(context, connectionCallbacks, onConnectionFailedListener, dtVar.mo3869bF(), (String[]) dtVar.mo3871bH().toArray(new String[0]));
        }

        public int getPriority() {
            return Integer.MAX_VALUE;
        }
    };

    public interface StateConflictResult extends Result {
        byte[] getLocalData();

        String getResolvedVersion();

        byte[] getServerData();

        int getStateKey();
    }

    public interface StateDeletedResult extends Result {
        int getStateKey();
    }

    public interface StateListResult extends Result {
        AppStateBuffer getStateBuffer();
    }

    public interface StateLoadedResult extends Result {
        byte[] getLocalData();

        int getStateKey();
    }

    public interface StateResult extends Result {
        StateConflictResult getConflictResult();

        StateLoadedResult getLoadedResult();
    }

    /* renamed from: com.google.android.gms.appstate.AppStateManager$a */
    public static abstract class C0105a<R extends Result> extends C0154a<R, C0522dc> implements PendingResult<R> {
        public C0105a() {
            super(AppStateManager.f102jO);
        }
    }

    /* renamed from: com.google.android.gms.appstate.AppStateManager$b */
    private static abstract class C0106b extends C0105a<StateDeletedResult> {
        private C0106b() {
        }
    }

    /* renamed from: com.google.android.gms.appstate.AppStateManager$c */
    private static abstract class C0107c extends C0105a<StateListResult> {
        private C0107c() {
        }

        /* renamed from: f */
        public StateListResult mo2067e(final Status status) {
            return new StateListResult() {
                public AppStateBuffer getStateBuffer() {
                    return new AppStateBuffer(null);
                }

                public Status getStatus() {
                    return status;
                }
            };
        }
    }

    /* renamed from: com.google.android.gms.appstate.AppStateManager$d */
    private static abstract class C0109d extends C0105a<Status> {
        private C0109d() {
        }

        /* renamed from: g */
        public Status mo2067e(Status status) {
            return status;
        }
    }

    /* renamed from: com.google.android.gms.appstate.AppStateManager$e */
    private static abstract class C0110e extends C0105a<StateResult> {
        private C0110e() {
        }

        /* renamed from: h */
        public StateResult mo2067e(Status status) {
            return AppStateManager.m49b(status);
        }
    }

    private AppStateManager() {
    }

    /* renamed from: a */
    public static C0522dc m48a(GoogleApiClient googleApiClient) {
        boolean z = true;
        C0600eg.m1553b(googleApiClient != null, (Object) "GoogleApiClient parameter is required.");
        C0600eg.m1550a(googleApiClient.isConnected(), "GoogleApiClient must be connected.");
        C0522dc dcVar = (C0522dc) googleApiClient.mo2302a(f102jO);
        if (dcVar == null) {
            z = false;
        }
        C0600eg.m1550a(z, "GoogleApiClient is not configured to use the AppState API. Pass AppStateManager.API into GoogleApiClient.Builder#addApi() to use this feature.");
        return dcVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static StateResult m49b(final Status status) {
        return new StateResult() {
            public StateConflictResult getConflictResult() {
                return null;
            }

            public StateLoadedResult getLoadedResult() {
                return null;
            }

            public Status getStatus() {
                return status;
            }
        };
    }

    public static PendingResult<StateDeletedResult> delete(GoogleApiClient googleApiClient, final int stateKey) {
        return googleApiClient.mo2304b(new C0106b() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo2062a(C0522dc dcVar) {
                dcVar.mo3733a((C0157c<StateDeletedResult>) this, stateKey);
            }

            /* renamed from: d */
            public StateDeletedResult mo2067e(final Status status) {
                return new StateDeletedResult() {
                    public int getStateKey() {
                        return stateKey;
                    }

                    public Status getStatus() {
                        return status;
                    }
                };
            }
        });
    }

    public static int getMaxNumKeys(GoogleApiClient googleApiClient) {
        return m48a(googleApiClient).getMaxNumKeys();
    }

    public static int getMaxStateSize(GoogleApiClient googleApiClient) {
        return m48a(googleApiClient).getMaxStateSize();
    }

    public static PendingResult<StateListResult> list(GoogleApiClient googleApiClient) {
        return googleApiClient.mo2303a(new C0107c() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo2062a(C0522dc dcVar) {
                dcVar.mo3732a((C0157c<StateListResult>) this);
            }
        });
    }

    public static PendingResult<StateResult> load(GoogleApiClient googleApiClient, final int stateKey) {
        return googleApiClient.mo2303a(new C0110e() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo2062a(C0522dc dcVar) {
                dcVar.mo3738b(this, stateKey);
            }
        });
    }

    public static PendingResult<StateResult> resolve(GoogleApiClient googleApiClient, final int stateKey, final String resolvedVersion, final byte[] resolvedData) {
        return googleApiClient.mo2304b(new C0110e() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo2062a(C0522dc dcVar) {
                dcVar.mo3734a(this, stateKey, resolvedVersion, resolvedData);
            }
        });
    }

    public static PendingResult<Status> signOut(GoogleApiClient googleApiClient) {
        return googleApiClient.mo2304b(new C0109d() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo2062a(C0522dc dcVar) {
                dcVar.mo3737b(this);
            }
        });
    }

    public static void update(GoogleApiClient googleApiClient, final int stateKey, final byte[] data) {
        googleApiClient.mo2304b(new C0110e() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo2062a(C0522dc dcVar) {
                dcVar.mo3735a(null, stateKey, data);
            }
        });
    }

    public static PendingResult<StateResult> updateImmediate(GoogleApiClient googleApiClient, final int stateKey, final byte[] data) {
        return googleApiClient.mo2304b(new C0110e() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo2062a(C0522dc dcVar) {
                dcVar.mo3735a(this, stateKey, data);
            }
        });
    }
}
