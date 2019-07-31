package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api.C0144a;
import com.google.android.gms.common.api.Api.C0145b;
import com.google.android.gms.common.api.C0153a.C0154a;
import com.google.android.gms.internal.C0565dt;
import com.google.android.gms.internal.C0578dx;
import com.google.android.gms.internal.C0578dx.C0580b;
import com.google.android.gms.internal.C0600eg;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public final class GoogleApiClient {
    /* access modifiers changed from: private */

    /* renamed from: mV */
    public final Object f255mV;

    /* renamed from: nc */
    private final C0150a f256nc;

    /* renamed from: ne */
    private final C0578dx f257ne;

    /* renamed from: nf */
    final Queue<C0151b<?>> f258nf;
    /* access modifiers changed from: private */

    /* renamed from: ng */
    public ConnectionResult f259ng;
    /* access modifiers changed from: private */

    /* renamed from: nh */
    public int f260nh;
    /* access modifiers changed from: private */

    /* renamed from: ni */
    public int f261ni;

    /* renamed from: nj */
    private int f262nj;
    /* access modifiers changed from: private */

    /* renamed from: nk */
    public final Bundle f263nk;

    /* renamed from: nl */
    private final Map<C0145b<?>, C0144a> f264nl;
    /* access modifiers changed from: private */

    /* renamed from: nm */
    public boolean f265nm;

    /* renamed from: nn */
    final Set<C0151b> f266nn;

    /* renamed from: no */
    final ConnectionCallbacks f267no;

    /* renamed from: np */
    private final C0580b f268np;

    public interface ApiOptions {
    }

    public static final class Builder {

        /* renamed from: jG */
        private String f274jG;
        private final Context mContext;

        /* renamed from: ns */
        private final Set<String> f275ns;

        /* renamed from: nt */
        private int f276nt;

        /* renamed from: nu */
        private View f277nu;

        /* renamed from: nv */
        private String f278nv;

        /* renamed from: nw */
        private final Map<Api, ApiOptions> f279nw;

        /* renamed from: nx */
        private final Set<ConnectionCallbacks> f280nx;

        /* renamed from: ny */
        private final Set<OnConnectionFailedListener> f281ny;

        public Builder(Context context) {
            this.f275ns = new HashSet();
            this.f279nw = new HashMap();
            this.f280nx = new HashSet();
            this.f281ny = new HashSet();
            this.mContext = context;
            this.f278nv = context.getPackageName();
        }

        public Builder(Context context, ConnectionCallbacks connectedListener, OnConnectionFailedListener connectionFailedListener) {
            this(context);
            C0600eg.m1552b(connectedListener, (Object) "Must provide a connected listener");
            this.f280nx.add(connectedListener);
            C0600eg.m1552b(connectionFailedListener, (Object) "Must provide a connection failed listener");
            this.f281ny.add(connectionFailedListener);
        }

        public Builder addApi(Api api) {
            return addApi(api, null);
        }

        public Builder addApi(Api api, ApiOptions options) {
            this.f279nw.put(api, options);
            List bk = api.mo2298bk();
            int size = bk.size();
            for (int i = 0; i < size; i++) {
                this.f275ns.add(((Scope) bk.get(i)).mo2341br());
            }
            return this;
        }

        public Builder addConnectionCallbacks(ConnectionCallbacks listener) {
            this.f280nx.add(listener);
            return this;
        }

        public Builder addOnConnectionFailedListener(OnConnectionFailedListener listener) {
            this.f281ny.add(listener);
            return this;
        }

        public Builder addScope(Scope scope) {
            this.f275ns.add(scope.mo2341br());
            return this;
        }

        /* renamed from: bq */
        public C0565dt mo2327bq() {
            return new C0565dt(this.f274jG, this.f275ns, this.f276nt, this.f277nu, this.f278nv);
        }

        public GoogleApiClient build() {
            return new GoogleApiClient(this.mContext, mo2327bq(), this.f279nw, this.f280nx, this.f281ny);
        }

        public Builder setAccountName(String accountName) {
            this.f274jG = accountName;
            return this;
        }

        public Builder setGravityForPopups(int gravityForPopups) {
            this.f276nt = gravityForPopups;
            return this;
        }

        public Builder setViewForPopups(View viewForPopups) {
            this.f277nu = viewForPopups;
            return this;
        }

        public Builder useDefaultAccount() {
            return setAccountName("<<default account>>");
        }
    }

    public interface ConnectionCallbacks {
        public static final int CAUSE_NETWORK_LOST = 2;
        public static final int CAUSE_SERVICE_DISCONNECTED = 1;

        void onConnected(Bundle bundle);

        void onConnectionSuspended(int i);
    }

    public interface OnConnectionFailedListener extends com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener {
    }

    /* renamed from: com.google.android.gms.common.api.GoogleApiClient$a */
    public interface C0150a {
        /* renamed from: b */
        void mo2316b(C0151b bVar);
    }

    /* renamed from: com.google.android.gms.common.api.GoogleApiClient$b */
    public interface C0151b<A extends C0144a> {
        /* renamed from: a */
        void mo2333a(C0150a aVar);

        /* renamed from: b */
        void mo2334b(A a);

        /* renamed from: bj */
        C0145b<A> mo2335bj();
    }

    private GoogleApiClient(Context context, C0565dt commonSettings, Map<Api, ApiOptions> apis, Set<ConnectionCallbacks> connectedCallbacks, Set<OnConnectionFailedListener> onConnectionFailedListeners) {
        this.f255mV = new Object();
        this.f258nf = new LinkedList();
        this.f261ni = 4;
        this.f263nk = new Bundle();
        this.f264nl = new HashMap();
        this.f266nn = new HashSet();
        this.f256nc = new C0150a() {
            /* renamed from: b */
            public void mo2316b(C0151b bVar) {
                synchronized (GoogleApiClient.this.f255mV) {
                    GoogleApiClient.this.f266nn.remove(bVar);
                }
            }
        };
        this.f267no = new ConnectionCallbacks() {
            public void onConnected(Bundle connectionHint) {
                synchronized (GoogleApiClient.this.f255mV) {
                    if (GoogleApiClient.this.f261ni == 1) {
                        if (connectionHint != null) {
                            GoogleApiClient.this.f263nk.putAll(connectionHint);
                        }
                        GoogleApiClient.this.m190bn();
                    }
                }
            }

            public void onConnectionSuspended(int cause) {
                synchronized (GoogleApiClient.this.f255mV) {
                    GoogleApiClient.this.m185A(cause);
                    if (cause == 2) {
                        GoogleApiClient.this.connect();
                    }
                }
            }
        };
        this.f268np = new C0580b() {
            /* renamed from: aU */
            public Bundle mo2319aU() {
                return null;
            }

            /* renamed from: bp */
            public boolean mo2320bp() {
                return GoogleApiClient.this.f265nm;
            }

            public boolean isConnected() {
                return GoogleApiClient.this.isConnected();
            }
        };
        this.f257ne = new C0578dx(context, this.f268np);
        for (ConnectionCallbacks registerConnectionCallbacks : connectedCallbacks) {
            this.f257ne.registerConnectionCallbacks(registerConnectionCallbacks);
        }
        for (OnConnectionFailedListener registerConnectionFailedListener : onConnectionFailedListeners) {
            this.f257ne.registerConnectionFailedListener(registerConnectionFailedListener);
        }
        for (Api api : apis.keySet()) {
            final C0145b bj = api.mo2297bj();
            ApiOptions apiOptions = (ApiOptions) apis.get(api);
            this.f264nl.put(bj, bj.mo2057b(context, commonSettings, apiOptions, this.f267no, new OnConnectionFailedListener() {
                public void onConnectionFailed(ConnectionResult result) {
                    synchronized (GoogleApiClient.this.f255mV) {
                        if (GoogleApiClient.this.f259ng == null || bj.getPriority() < GoogleApiClient.this.f260nh) {
                            GoogleApiClient.this.f259ng = result;
                            GoogleApiClient.this.f260nh = bj.getPriority();
                        }
                        GoogleApiClient.this.m190bn();
                    }
                }
            }));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public void m185A(int i) {
        synchronized (this.f255mV) {
            if (this.f261ni != 3) {
                boolean isConnected = isConnected();
                this.f261ni = 3;
                if (i == -1) {
                    this.f258nf.clear();
                }
                for (C0151b bVar : this.f266nn) {
                    if (bVar instanceof Releasable) {
                        try {
                            ((Releasable) bVar).release();
                        } catch (Exception e) {
                            Log.w("GoogleApiClient", "Unable to release " + bVar, e);
                        }
                    }
                }
                this.f266nn.clear();
                this.f265nm = false;
                for (C0144a aVar : this.f264nl.values()) {
                    if (aVar.isConnected()) {
                        aVar.disconnect();
                    }
                }
                this.f265nm = true;
                this.f261ni = 4;
                if (isConnected) {
                    if (i != -1) {
                        this.f257ne.mo3905J(i);
                    }
                    this.f265nm = false;
                }
            }
        }
    }

    /* renamed from: a */
    private <A extends C0144a> void m187a(C0151b<A> bVar) {
        synchronized (this.f255mV) {
            C0600eg.m1550a(isConnected(), "GoogleApiClient is not connected yet.");
            C0600eg.m1550a(bVar.mo2335bj() != null, "This task can not be executed or enqueued (it's probably a Batch or malformed)");
            if (bVar instanceof Releasable) {
                this.f266nn.add(bVar);
                bVar.mo2333a(this.f256nc);
            }
            bVar.mo2334b(mo2302a(bVar.mo2335bj()));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: bn */
    public void m190bn() {
        synchronized (this.f255mV) {
            this.f262nj--;
            if (this.f262nj == 0) {
                if (this.f259ng != null) {
                    m185A(3);
                    this.f257ne.mo3906a(this.f259ng);
                    this.f265nm = false;
                } else {
                    this.f261ni = 2;
                    m191bo();
                    this.f257ne.mo3907b(this.f263nk.isEmpty() ? null : this.f263nk);
                }
            }
        }
    }

    /* renamed from: bo */
    private void m191bo() {
        C0600eg.m1550a(isConnected(), "GoogleApiClient is not connected yet.");
        synchronized (this.f255mV) {
            while (!this.f258nf.isEmpty()) {
                m187a((C0151b) this.f258nf.remove());
            }
        }
    }

    /* renamed from: a */
    public <C extends C0144a> C mo2302a(C0145b<C> bVar) {
        C c = (C0144a) this.f264nl.get(bVar);
        C0600eg.m1552b(c, (Object) "Appropriate Api was not requested.");
        return c;
    }

    /* renamed from: a */
    public <A extends C0144a, T extends C0154a<? extends Result, A>> T mo2303a(T t) {
        synchronized (this.f255mV) {
            if (isConnected()) {
                mo2304b(t);
            } else {
                this.f258nf.add(t);
            }
        }
        return t;
    }

    /* renamed from: b */
    public <A extends C0144a, T extends C0154a<? extends Result, A>> T mo2304b(T t) {
        C0600eg.m1550a(isConnected(), "GoogleApiClient is not connected yet.");
        m191bo();
        m187a((C0151b<A>) t);
        return t;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void connect() {
        /*
            r3 = this;
            java.lang.Object r1 = r3.f255mV
            monitor-enter(r1)
            boolean r0 = r3.isConnected()     // Catch:{ all -> 0x0041 }
            if (r0 != 0) goto L_0x000f
            boolean r0 = r3.isConnecting()     // Catch:{ all -> 0x0041 }
            if (r0 == 0) goto L_0x0011
        L_0x000f:
            monitor-exit(r1)     // Catch:{ all -> 0x0041 }
        L_0x0010:
            return
        L_0x0011:
            r0 = 1
            r3.f265nm = r0     // Catch:{ all -> 0x0041 }
            r0 = 0
            r3.f259ng = r0     // Catch:{ all -> 0x0041 }
            r0 = 1
            r3.f261ni = r0     // Catch:{ all -> 0x0041 }
            android.os.Bundle r0 = r3.f263nk     // Catch:{ all -> 0x0041 }
            r0.clear()     // Catch:{ all -> 0x0041 }
            java.util.Map<com.google.android.gms.common.api.Api$b<?>, com.google.android.gms.common.api.Api$a> r0 = r3.f264nl     // Catch:{ all -> 0x0041 }
            int r0 = r0.size()     // Catch:{ all -> 0x0041 }
            r3.f262nj = r0     // Catch:{ all -> 0x0041 }
            java.util.Map<com.google.android.gms.common.api.Api$b<?>, com.google.android.gms.common.api.Api$a> r0 = r3.f264nl     // Catch:{ all -> 0x0041 }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x0041 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x0041 }
        L_0x0031:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0041 }
            if (r0 == 0) goto L_0x0044
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x0041 }
            com.google.android.gms.common.api.Api$a r0 = (com.google.android.gms.common.api.Api.C0144a) r0     // Catch:{ all -> 0x0041 }
            r0.connect()     // Catch:{ all -> 0x0041 }
            goto L_0x0031
        L_0x0041:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0041 }
            throw r0
        L_0x0044:
            monitor-exit(r1)     // Catch:{ all -> 0x0041 }
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.GoogleApiClient.connect():void");
    }

    public void disconnect() {
        m185A(-1);
    }

    public boolean isConnected() {
        boolean z;
        synchronized (this.f255mV) {
            z = this.f261ni == 2;
        }
        return z;
    }

    public boolean isConnecting() {
        boolean z = true;
        synchronized (this.f255mV) {
            if (this.f261ni != 1) {
                z = false;
            }
        }
        return z;
    }

    public boolean isConnectionCallbacksRegistered(ConnectionCallbacks listener) {
        return this.f257ne.isConnectionCallbacksRegistered(listener);
    }

    public boolean isConnectionFailedListenerRegistered(OnConnectionFailedListener listener) {
        return this.f257ne.isConnectionFailedListenerRegistered(listener);
    }

    public void reconnect() {
        disconnect();
        connect();
    }

    public void registerConnectionCallbacks(ConnectionCallbacks listener) {
        this.f257ne.registerConnectionCallbacks(listener);
    }

    public void registerConnectionFailedListener(OnConnectionFailedListener listener) {
        this.f257ne.registerConnectionFailedListener(listener);
    }

    public void unregisterConnectionCallbacks(ConnectionCallbacks listener) {
        this.f257ne.unregisterConnectionCallbacks(listener);
    }

    public void unregisterConnectionFailedListener(OnConnectionFailedListener listener) {
        this.f257ne.unregisterConnectionFailedListener(listener);
    }
}
