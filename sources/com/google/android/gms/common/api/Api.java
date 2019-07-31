package com.google.android.gms.common.api;

import android.content.Context;
import com.google.android.gms.common.api.GoogleApiClient.ApiOptions;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.internal.C0565dt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class Api {

    /* renamed from: mS */
    private final C0145b<?> f253mS;

    /* renamed from: mT */
    private final ArrayList<Scope> f254mT;

    /* renamed from: com.google.android.gms.common.api.Api$a */
    public interface C0144a {
        void connect();

        void disconnect();

        boolean isConnected();
    }

    /* renamed from: com.google.android.gms.common.api.Api$b */
    public interface C0145b<T extends C0144a> {
        /* renamed from: b */
        T mo2057b(Context context, C0565dt dtVar, ApiOptions apiOptions, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener);

        int getPriority();
    }

    public Api(C0145b<?> ClientBuilder, Scope... impliedScopes) {
        this.f253mS = ClientBuilder;
        this.f254mT = new ArrayList<>(Arrays.asList(impliedScopes));
    }

    /* renamed from: bj */
    public C0145b<?> mo2297bj() {
        return this.f253mS;
    }

    /* renamed from: bk */
    public List<Scope> mo2298bk() {
        return this.f254mT;
    }
}
