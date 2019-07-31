package com.google.android.gms.appstate;

import android.content.Context;
import com.google.android.gms.appstate.AppStateManager.StateConflictResult;
import com.google.android.gms.appstate.AppStateManager.StateDeletedResult;
import com.google.android.gms.appstate.AppStateManager.StateListResult;
import com.google.android.gms.appstate.AppStateManager.StateLoadedResult;
import com.google.android.gms.appstate.AppStateManager.StateResult;
import com.google.android.gms.common.GooglePlayServicesClient;
import com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks;
import com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.api.C0153a.C0157c;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.C0522dc;
import com.google.android.gms.internal.C0564ds;
import com.google.android.gms.internal.C0600eg;

@Deprecated
public final class AppStateClient implements GooglePlayServicesClient {
    public static final int STATUS_CLIENT_RECONNECT_REQUIRED = 2;
    public static final int STATUS_DEVELOPER_ERROR = 7;
    public static final int STATUS_INTERNAL_ERROR = 1;
    public static final int STATUS_NETWORK_ERROR_NO_DATA = 4;
    public static final int STATUS_NETWORK_ERROR_OPERATION_DEFERRED = 5;
    public static final int STATUS_NETWORK_ERROR_OPERATION_FAILED = 6;
    public static final int STATUS_NETWORK_ERROR_STALE_DATA = 3;
    public static final int STATUS_OK = 0;
    public static final int STATUS_STATE_KEY_LIMIT_EXCEEDED = 2003;
    public static final int STATUS_STATE_KEY_NOT_FOUND = 2002;
    public static final int STATUS_WRITE_OUT_OF_DATE_VERSION = 2000;
    public static final int STATUS_WRITE_SIZE_EXCEEDED = 2001;

    /* renamed from: jx */
    private final C0522dc f88jx;

    @Deprecated
    public static final class Builder {

        /* renamed from: jC */
        private static final String[] f96jC = {Scopes.APP_STATE};

        /* renamed from: jD */
        private ConnectionCallbacks f97jD;

        /* renamed from: jE */
        private OnConnectionFailedListener f98jE;

        /* renamed from: jF */
        private String[] f99jF = f96jC;

        /* renamed from: jG */
        private String f100jG = "<<default account>>";
        private Context mContext;

        public Builder(Context context, ConnectionCallbacks connectedListener, OnConnectionFailedListener connectionFailedListener) {
            this.mContext = context;
            this.f97jD = connectedListener;
            this.f98jE = connectionFailedListener;
        }

        public AppStateClient create() {
            return new AppStateClient(this.mContext, this.f97jD, this.f98jE, this.f100jG, this.f99jF);
        }

        public Builder setAccountName(String accountName) {
            this.f100jG = (String) C0600eg.m1554f(accountName);
            return this;
        }

        public Builder setScopes(String... scopes) {
            this.f99jF = scopes;
            return this;
        }
    }

    /* renamed from: com.google.android.gms.appstate.AppStateClient$a */
    private static final class C0094a implements C0157c<StateResult> {

        /* renamed from: jH */
        private final OnStateLoadedListener f101jH;

        C0094a(OnStateLoadedListener onStateLoadedListener) {
            this.f101jH = onStateLoadedListener;
        }

        /* renamed from: a */
        public void mo2048a(StateResult stateResult) {
            if (this.f101jH != null) {
                if (stateResult.getStatus().getStatusCode() == 2000) {
                    StateConflictResult conflictResult = stateResult.getConflictResult();
                    C0564ds.m1396d(conflictResult);
                    this.f101jH.onStateConflict(conflictResult.getStateKey(), conflictResult.getResolvedVersion(), conflictResult.getLocalData(), conflictResult.getServerData());
                    return;
                }
                StateLoadedResult loadedResult = stateResult.getLoadedResult();
                C0564ds.m1396d(loadedResult);
                this.f101jH.onStateLoaded(loadedResult.getStatus().getStatusCode(), loadedResult.getStateKey(), loadedResult.getLocalData());
            }
        }
    }

    private AppStateClient(Context context, ConnectionCallbacks connectedListener, OnConnectionFailedListener connectionFailedListener, String accountName, String[] scopes) {
        this.f88jx = new C0522dc(context, connectedListener, connectionFailedListener, accountName, scopes);
    }

    @Deprecated
    public void connect() {
        this.f88jx.connect();
    }

    @Deprecated
    public void deleteState(final OnStateDeletedListener listener, int stateKey) {
        this.f88jx.mo3733a((C0157c<StateDeletedResult>) new C0157c<StateDeletedResult>() {
            /* renamed from: a */
            public void mo2048a(StateDeletedResult stateDeletedResult) {
                listener.onStateDeleted(stateDeletedResult.getStatus().getStatusCode(), stateDeletedResult.getStateKey());
            }
        }, stateKey);
    }

    @Deprecated
    public void disconnect() {
        this.f88jx.disconnect();
    }

    @Deprecated
    public int getMaxNumKeys() {
        return this.f88jx.getMaxNumKeys();
    }

    @Deprecated
    public int getMaxStateSize() {
        return this.f88jx.getMaxStateSize();
    }

    @Deprecated
    public boolean isConnected() {
        return this.f88jx.isConnected();
    }

    @Deprecated
    public boolean isConnecting() {
        return this.f88jx.isConnecting();
    }

    @Deprecated
    public boolean isConnectionCallbacksRegistered(ConnectionCallbacks listener) {
        return this.f88jx.isConnectionCallbacksRegistered(listener);
    }

    @Deprecated
    public boolean isConnectionFailedListenerRegistered(OnConnectionFailedListener listener) {
        return this.f88jx.isConnectionFailedListenerRegistered(listener);
    }

    @Deprecated
    public void listStates(final OnStateListLoadedListener listener) {
        this.f88jx.mo3732a((C0157c<StateListResult>) new C0157c<StateListResult>() {
            /* renamed from: a */
            public void mo2048a(StateListResult stateListResult) {
                listener.onStateListLoaded(stateListResult.getStatus().getStatusCode(), stateListResult.getStateBuffer());
            }
        });
    }

    @Deprecated
    public void loadState(OnStateLoadedListener listener, int stateKey) {
        this.f88jx.mo3738b(new C0094a(listener), stateKey);
    }

    @Deprecated
    public void reconnect() {
        this.f88jx.disconnect();
        this.f88jx.connect();
    }

    @Deprecated
    public void registerConnectionCallbacks(ConnectionCallbacks listener) {
        this.f88jx.registerConnectionCallbacks(listener);
    }

    @Deprecated
    public void registerConnectionFailedListener(OnConnectionFailedListener listener) {
        this.f88jx.registerConnectionFailedListener(listener);
    }

    @Deprecated
    public void resolveState(OnStateLoadedListener listener, int stateKey, String resolvedVersion, byte[] resolvedData) {
        this.f88jx.mo3734a(new C0094a(listener), stateKey, resolvedVersion, resolvedData);
    }

    @Deprecated
    public void signOut() {
        this.f88jx.mo3737b(new C0157c<Status>() {
            /* renamed from: a */
            public void mo2048a(Status status) {
            }
        });
    }

    @Deprecated
    public void signOut(final OnSignOutCompleteListener listener) {
        C0600eg.m1552b(listener, (Object) "Must provide a valid listener");
        this.f88jx.mo3737b(new C0157c<Status>() {
            /* renamed from: a */
            public void mo2048a(Status status) {
                listener.onSignOutComplete();
            }
        });
    }

    @Deprecated
    public void unregisterConnectionCallbacks(ConnectionCallbacks listener) {
        this.f88jx.unregisterConnectionCallbacks(listener);
    }

    @Deprecated
    public void unregisterConnectionFailedListener(OnConnectionFailedListener listener) {
        this.f88jx.unregisterConnectionFailedListener(listener);
    }

    @Deprecated
    public void updateState(int stateKey, byte[] data) {
        this.f88jx.mo3735a(new C0094a(null), stateKey, data);
    }

    @Deprecated
    public void updateStateImmediate(OnStateLoadedListener listener, int stateKey, byte[] data) {
        C0600eg.m1552b(listener, (Object) "Must provide a valid listener");
        this.f88jx.mo3735a(new C0094a(listener), stateKey, data);
    }
}
