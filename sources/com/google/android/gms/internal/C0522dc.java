package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.appstate.AppStateBuffer;
import com.google.android.gms.appstate.AppStateManager.StateConflictResult;
import com.google.android.gms.appstate.AppStateManager.StateDeletedResult;
import com.google.android.gms.appstate.AppStateManager.StateListResult;
import com.google.android.gms.appstate.AppStateManager.StateLoadedResult;
import com.google.android.gms.appstate.AppStateManager.StateResult;
import com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks;
import com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.api.C0153a.C0157c;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.internal.C0534de.C0535a;
import com.google.android.gms.internal.C0569dw.C0572c;
import com.google.android.gms.internal.C0569dw.C0573d;
import com.google.android.gms.internal.C0569dw.C0574e;
import com.google.android.gms.internal.C0569dw.C0576g;

/* renamed from: com.google.android.gms.internal.dc */
public final class C0522dc extends C0569dw<C0534de> {

    /* renamed from: jG */
    private final String f1382jG;

    /* renamed from: com.google.android.gms.internal.dc$a */
    final class C0523a extends C0521db {

        /* renamed from: jW */
        private final C0157c<StateDeletedResult> f1383jW;

        public C0523a(C0157c<StateDeletedResult> cVar) {
            this.f1383jW = (C0157c) C0600eg.m1552b(cVar, (Object) "Result holder must not be null");
        }

        public void onStateDeleted(int statusCode, int stateKey) {
            C0522dc.this.mo3887a((C0571b<?>) new C0524b<Object>(this.f1383jW, new Status(statusCode), stateKey));
        }
    }

    /* renamed from: com.google.android.gms.internal.dc$b */
    final class C0524b extends C0571b<C0157c<StateDeletedResult>> implements StateDeletedResult {

        /* renamed from: jY */
        private final Status f1386jY;

        /* renamed from: jZ */
        private final int f1387jZ;

        public C0524b(C0157c<StateDeletedResult> cVar, Status status, int i) {
            super(cVar);
            this.f1386jY = status;
            this.f1387jZ = i;
        }

        /* access modifiers changed from: protected */
        /* renamed from: aL */
        public void mo3742aL() {
        }

        /* renamed from: c */
        public void mo3743b(C0157c<StateDeletedResult> cVar) {
            cVar.mo2048a(this);
        }

        public int getStateKey() {
            return this.f1387jZ;
        }

        public Status getStatus() {
            return this.f1386jY;
        }
    }

    /* renamed from: com.google.android.gms.internal.dc$c */
    final class C0525c extends C0521db {

        /* renamed from: jW */
        private final C0157c<StateListResult> f1388jW;

        public C0525c(C0157c<StateListResult> cVar) {
            this.f1388jW = (C0157c) C0600eg.m1552b(cVar, (Object) "Result holder must not be null");
        }

        /* renamed from: a */
        public void mo3728a(DataHolder dataHolder) {
            C0522dc.this.mo3887a((C0571b<?>) new C0526d<Object>(this.f1388jW, new Status(dataHolder.getStatusCode()), dataHolder));
        }
    }

    /* renamed from: com.google.android.gms.internal.dc$d */
    final class C0526d extends C0573d<C0157c<StateListResult>> implements StateListResult {

        /* renamed from: jY */
        private final Status f1391jY;

        /* renamed from: ka */
        private final AppStateBuffer f1392ka;

        public C0526d(C0157c<StateListResult> cVar, Status status, DataHolder dataHolder) {
            super(cVar, dataHolder);
            this.f1391jY = status;
            this.f1392ka = new AppStateBuffer(dataHolder);
        }

        /* renamed from: a */
        public void mo3746a(C0157c<StateListResult> cVar, DataHolder dataHolder) {
            cVar.mo2048a(this);
        }

        public AppStateBuffer getStateBuffer() {
            return this.f1392ka;
        }

        public Status getStatus() {
            return this.f1391jY;
        }
    }

    /* renamed from: com.google.android.gms.internal.dc$e */
    final class C0527e extends C0521db {

        /* renamed from: jW */
        private final C0157c<StateResult> f1393jW;

        public C0527e(C0157c<StateResult> cVar) {
            this.f1393jW = (C0157c) C0600eg.m1552b(cVar, (Object) "Result holder must not be null");
        }

        /* renamed from: a */
        public void mo3727a(int i, DataHolder dataHolder) {
            C0522dc.this.mo3887a((C0571b<?>) new C0528f<Object>(this.f1393jW, i, dataHolder));
        }
    }

    /* renamed from: com.google.android.gms.internal.dc$f */
    final class C0528f extends C0573d<C0157c<StateResult>> implements StateConflictResult, StateLoadedResult, StateResult {

        /* renamed from: jY */
        private final Status f1396jY;

        /* renamed from: jZ */
        private final int f1397jZ;

        /* renamed from: ka */
        private final AppStateBuffer f1398ka;

        public C0528f(C0157c<StateResult> cVar, int i, DataHolder dataHolder) {
            super(cVar, dataHolder);
            this.f1397jZ = i;
            this.f1396jY = new Status(dataHolder.getStatusCode());
            this.f1398ka = new AppStateBuffer(dataHolder);
        }

        /* renamed from: aM */
        private boolean m1222aM() {
            return this.f1396jY.getStatusCode() == 2000;
        }

        /* renamed from: a */
        public void mo3746a(C0157c<StateResult> cVar, DataHolder dataHolder) {
            cVar.mo2048a(this);
        }

        public StateConflictResult getConflictResult() {
            if (m1222aM()) {
                return this;
            }
            return null;
        }

        public StateLoadedResult getLoadedResult() {
            if (m1222aM()) {
                return null;
            }
            return this;
        }

        public byte[] getLocalData() {
            if (this.f1398ka.getCount() == 0) {
                return null;
            }
            return this.f1398ka.get(0).getLocalData();
        }

        public String getResolvedVersion() {
            if (this.f1398ka.getCount() == 0) {
                return null;
            }
            return this.f1398ka.get(0).getConflictVersion();
        }

        public byte[] getServerData() {
            if (this.f1398ka.getCount() == 0) {
                return null;
            }
            return this.f1398ka.get(0).getConflictData();
        }

        public int getStateKey() {
            return this.f1397jZ;
        }

        public Status getStatus() {
            return this.f1396jY;
        }
    }

    /* renamed from: com.google.android.gms.internal.dc$g */
    final class C0529g extends C0521db {

        /* renamed from: jW */
        C0157c<Status> f1399jW;

        public C0529g(C0157c<Status> cVar) {
            this.f1399jW = (C0157c) C0600eg.m1552b(cVar, (Object) "Holder must not be null");
        }

        public void onSignOutComplete() {
            C0522dc.this.mo3887a((C0571b<?>) new C0530h<Object>(this.f1399jW, new Status(0)));
        }
    }

    /* renamed from: com.google.android.gms.internal.dc$h */
    final class C0530h extends C0571b<C0157c<Status>> {

        /* renamed from: jY */
        private final Status f1402jY;

        public C0530h(C0157c<Status> cVar, Status status) {
            super(cVar);
            this.f1402jY = status;
        }

        /* access modifiers changed from: protected */
        /* renamed from: aL */
        public void mo3742aL() {
        }

        /* renamed from: c */
        public void mo3743b(C0157c<Status> cVar) {
            cVar.mo2048a(this.f1402jY);
        }
    }

    @Deprecated
    public C0522dc(Context context, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener, String str, String[] strArr) {
        this(context, (GoogleApiClient.ConnectionCallbacks) new C0572c(connectionCallbacks), (GoogleApiClient.OnConnectionFailedListener) new C0576g(onConnectionFailedListener), str, strArr);
    }

    public C0522dc(Context context, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener, String str, String[] strArr) {
        super(context, connectionCallbacks, onConnectionFailedListener, strArr);
        this.f1382jG = (String) C0600eg.m1554f(str);
    }

    /* renamed from: a */
    public void mo3732a(C0157c<StateListResult> cVar) {
        try {
            ((C0534de) mo3890bQ()).mo3752a(new C0525c(cVar));
        } catch (RemoteException e) {
            Log.w("AppStateClient", "service died");
        }
    }

    /* renamed from: a */
    public void mo3733a(C0157c<StateDeletedResult> cVar, int i) {
        try {
            ((C0534de) mo3890bQ()).mo3757b(new C0523a(cVar), i);
        } catch (RemoteException e) {
            Log.w("AppStateClient", "service died");
        }
    }

    /* renamed from: a */
    public void mo3734a(C0157c<StateResult> cVar, int i, String str, byte[] bArr) {
        try {
            ((C0534de) mo3890bQ()).mo3754a(new C0527e(cVar), i, str, bArr);
        } catch (RemoteException e) {
            Log.w("AppStateClient", "service died");
        }
    }

    /* renamed from: a */
    public void mo3735a(C0157c<StateResult> cVar, int i, byte[] bArr) {
        try {
            ((C0534de) mo3890bQ()).mo3755a(cVar == null ? null : new C0527e(cVar), i, bArr);
        } catch (RemoteException e) {
            Log.w("AppStateClient", "service died");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2638a(C0590ec ecVar, C0574e eVar) throws RemoteException {
        ecVar.mo3949a((C0587eb) eVar, (int) GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE, getContext().getPackageName(), this.f1382jG, mo3888bO());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3736a(String... strArr) {
        boolean z = false;
        for (String equals : strArr) {
            if (equals.equals(Scopes.APP_STATE)) {
                z = true;
            }
        }
        C0600eg.m1550a(z, String.format("App State APIs requires %s to function.", new Object[]{Scopes.APP_STATE}));
    }

    /* access modifiers changed from: protected */
    /* renamed from: am */
    public String mo2639am() {
        return "com.google.android.gms.appstate.service.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: an */
    public String mo2640an() {
        return "com.google.android.gms.appstate.internal.IAppStateService";
    }

    /* renamed from: b */
    public void mo3737b(C0157c<Status> cVar) {
        try {
            ((C0534de) mo3890bQ()).mo3756b(new C0529g(cVar));
        } catch (RemoteException e) {
            Log.w("AppStateClient", "service died");
        }
    }

    /* renamed from: b */
    public void mo3738b(C0157c<StateResult> cVar, int i) {
        try {
            ((C0534de) mo3890bQ()).mo3753a(new C0527e(cVar), i);
        } catch (RemoteException e) {
            Log.w("AppStateClient", "service died");
        }
    }

    public int getMaxNumKeys() {
        try {
            return ((C0534de) mo3890bQ()).getMaxNumKeys();
        } catch (RemoteException e) {
            Log.w("AppStateClient", "service died");
            return 2;
        }
    }

    public int getMaxStateSize() {
        try {
            return ((C0534de) mo3890bQ()).getMaxStateSize();
        } catch (RemoteException e) {
            Log.w("AppStateClient", "service died");
            return 2;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public C0534de mo2643p(IBinder iBinder) {
        return C0535a.m1242t(iBinder);
    }
}
