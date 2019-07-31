package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesClient;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.Api.C0144a;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.internal.C0578dx.C0580b;
import com.google.android.gms.internal.C0587eb.C0588a;
import com.google.android.gms.internal.C0590ec.C0591a;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.dw */
public abstract class C0569dw<T extends IInterface> implements GooglePlayServicesClient, C0144a, C0580b {

    /* renamed from: pk */
    public static final String[] f1507pk = {"service_esmobile", "service_googleme"};

    /* renamed from: jF */
    private final String[] f1508jF;
    /* access modifiers changed from: private */
    public final Context mContext;
    final Handler mHandler;
    /* access modifiers changed from: private */

    /* renamed from: ne */
    public final C0578dx f1509ne;
    /* access modifiers changed from: private */

    /* renamed from: pe */
    public T f1510pe;
    /* access modifiers changed from: private */

    /* renamed from: pf */
    public final ArrayList<C0571b<?>> f1511pf;
    /* access modifiers changed from: private */

    /* renamed from: pg */
    public C0575f f1512pg;

    /* renamed from: ph */
    boolean f1513ph;

    /* renamed from: pi */
    boolean f1514pi;
    /* access modifiers changed from: private */

    /* renamed from: pj */
    public final Object f1515pj;

    /* renamed from: com.google.android.gms.internal.dw$a */
    final class C0570a extends Handler {
        public C0570a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message msg) {
            if (msg.what != 1 || C0569dw.this.isConnecting()) {
                synchronized (C0569dw.this.f1515pj) {
                    C0569dw.this.f1514pi = false;
                }
                if (msg.what == 3) {
                    C0569dw.this.f1509ne.mo3906a(new ConnectionResult(((Integer) msg.obj).intValue(), null));
                } else if (msg.what == 4) {
                    C0569dw.this.f1509ne.mo3905J(((Integer) msg.obj).intValue());
                } else if (msg.what == 2 && !C0569dw.this.isConnected()) {
                    C0571b bVar = (C0571b) msg.obj;
                    bVar.mo3742aL();
                    bVar.unregister();
                } else if (msg.what == 2 || msg.what == 1) {
                    ((C0571b) msg.obj).mo3896bR();
                } else {
                    Log.wtf("GmsClient", "Don't know how to handle this message.");
                }
            } else {
                C0571b bVar2 = (C0571b) msg.obj;
                bVar2.mo3742aL();
                bVar2.unregister();
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.dw$b */
    protected abstract class C0571b<TListener> {
        private TListener mListener;

        /* renamed from: pm */
        private boolean f1518pm = false;

        public C0571b(TListener tlistener) {
            this.mListener = tlistener;
        }

        /* access modifiers changed from: protected */
        /* renamed from: aL */
        public abstract void mo3742aL();

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public abstract void mo3743b(TListener tlistener);

        /* renamed from: bR */
        public void mo3896bR() {
            TListener tlistener;
            synchronized (this) {
                tlistener = this.mListener;
                if (this.f1518pm) {
                    Log.w("GmsClient", "Callback proxy " + this + " being reused. This is not safe.");
                }
            }
            if (tlistener != null) {
                try {
                    mo3743b(tlistener);
                } catch (RuntimeException e) {
                    mo3742aL();
                    throw e;
                }
            } else {
                mo3742aL();
            }
            synchronized (this) {
                this.f1518pm = true;
            }
            unregister();
        }

        /* renamed from: bS */
        public void mo3897bS() {
            synchronized (this) {
                this.mListener = null;
            }
        }

        public void unregister() {
            mo3897bS();
            synchronized (C0569dw.this.f1511pf) {
                C0569dw.this.f1511pf.remove(this);
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.dw$c */
    public static final class C0572c implements ConnectionCallbacks {

        /* renamed from: pn */
        private final GooglePlayServicesClient.ConnectionCallbacks f1519pn;

        public C0572c(GooglePlayServicesClient.ConnectionCallbacks connectionCallbacks) {
            this.f1519pn = connectionCallbacks;
        }

        public boolean equals(Object other) {
            return other instanceof C0572c ? this.f1519pn.equals(((C0572c) other).f1519pn) : this.f1519pn.equals(other);
        }

        public void onConnected(Bundle connectionHint) {
            this.f1519pn.onConnected(connectionHint);
        }

        public void onConnectionSuspended(int cause) {
            this.f1519pn.onDisconnected();
        }
    }

    /* renamed from: com.google.android.gms.internal.dw$d */
    public abstract class C0573d<TListener> extends C0571b<TListener> {

        /* renamed from: nE */
        private final DataHolder f1520nE;

        public C0573d(TListener tlistener, DataHolder dataHolder) {
            super(tlistener);
            this.f1520nE = dataHolder;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo3746a(TListener tlistener, DataHolder dataHolder);

        /* access modifiers changed from: protected */
        /* renamed from: aL */
        public void mo3742aL() {
            if (this.f1520nE != null) {
                this.f1520nE.close();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final void mo3743b(TListener tlistener) {
            mo3746a(tlistener, this.f1520nE);
        }

        /* renamed from: bR */
        public /* bridge */ /* synthetic */ void mo3896bR() {
            super.mo3896bR();
        }

        /* renamed from: bS */
        public /* bridge */ /* synthetic */ void mo3897bS() {
            super.mo3897bS();
        }

        public /* bridge */ /* synthetic */ void unregister() {
            super.unregister();
        }
    }

    /* renamed from: com.google.android.gms.internal.dw$e */
    public static final class C0574e extends C0588a {

        /* renamed from: po */
        private C0569dw f1522po;

        public C0574e(C0569dw dwVar) {
            this.f1522po = dwVar;
        }

        /* renamed from: b */
        public void mo3900b(int i, IBinder iBinder, Bundle bundle) {
            C0600eg.m1552b("onPostInitComplete can be called only once per call to getServiceFromBroker", (Object) this.f1522po);
            this.f1522po.mo2637a(i, iBinder, bundle);
            this.f1522po = null;
        }
    }

    /* renamed from: com.google.android.gms.internal.dw$f */
    final class C0575f implements ServiceConnection {
        C0575f() {
        }

        public void onServiceConnected(ComponentName component, IBinder binder) {
            C0569dw.this.mo3894w(binder);
        }

        public void onServiceDisconnected(ComponentName component) {
            C0569dw.this.f1510pe = null;
            C0569dw.this.f1509ne.mo3905J(1);
        }
    }

    /* renamed from: com.google.android.gms.internal.dw$g */
    public static final class C0576g implements OnConnectionFailedListener {

        /* renamed from: pp */
        private final GooglePlayServicesClient.OnConnectionFailedListener f1524pp;

        public C0576g(GooglePlayServicesClient.OnConnectionFailedListener onConnectionFailedListener) {
            this.f1524pp = onConnectionFailedListener;
        }

        public boolean equals(Object other) {
            return other instanceof C0576g ? this.f1524pp.equals(((C0576g) other).f1524pp) : this.f1524pp.equals(other);
        }

        public void onConnectionFailed(ConnectionResult result) {
            this.f1524pp.onConnectionFailed(result);
        }
    }

    /* renamed from: com.google.android.gms.internal.dw$h */
    protected final class C0577h extends C0571b<Boolean> {

        /* renamed from: pq */
        public final Bundle f1526pq;

        /* renamed from: pr */
        public final IBinder f1527pr;
        public final int statusCode;

        public C0577h(int i, IBinder iBinder, Bundle bundle) {
            super(Boolean.valueOf(true));
            this.statusCode = i;
            this.f1527pr = iBinder;
            this.f1526pq = bundle;
        }

        /* access modifiers changed from: protected */
        /* renamed from: aL */
        public void mo3742aL() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo3743b(Boolean bool) {
            if (bool != null) {
                switch (this.statusCode) {
                    case 0:
                        try {
                            if (C0569dw.this.mo2640an().equals(this.f1527pr.getInterfaceDescriptor())) {
                                C0569dw.this.f1510pe = C0569dw.this.mo2643p(this.f1527pr);
                                if (C0569dw.this.f1510pe != null) {
                                    C0569dw.this.f1509ne.mo3908bT();
                                    return;
                                }
                            }
                        } catch (RemoteException e) {
                        }
                        C0581dy.m1457s(C0569dw.this.mContext).mo3917b(C0569dw.this.mo2639am(), C0569dw.this.f1512pg);
                        C0569dw.this.f1512pg = null;
                        C0569dw.this.f1510pe = null;
                        C0569dw.this.f1509ne.mo3906a(new ConnectionResult(8, null));
                        return;
                    case 10:
                        throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
                    default:
                        PendingIntent pendingIntent = this.f1526pq != null ? (PendingIntent) this.f1526pq.getParcelable("pendingIntent") : null;
                        if (C0569dw.this.f1512pg != null) {
                            C0581dy.m1457s(C0569dw.this.mContext).mo3917b(C0569dw.this.mo2639am(), C0569dw.this.f1512pg);
                            C0569dw.this.f1512pg = null;
                        }
                        C0569dw.this.f1510pe = null;
                        C0569dw.this.f1509ne.mo3906a(new ConnectionResult(this.statusCode, pendingIntent));
                        return;
                }
            }
        }
    }

    protected C0569dw(Context context, GooglePlayServicesClient.ConnectionCallbacks connectionCallbacks, GooglePlayServicesClient.OnConnectionFailedListener onConnectionFailedListener, String... strArr) {
        this(context, (ConnectionCallbacks) new C0572c(connectionCallbacks), (OnConnectionFailedListener) new C0576g(onConnectionFailedListener), strArr);
    }

    protected C0569dw(Context context, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener, String... strArr) {
        this.f1511pf = new ArrayList<>();
        this.f1513ph = false;
        this.f1514pi = false;
        this.f1515pj = new Object();
        this.mContext = (Context) C0600eg.m1554f(context);
        this.f1509ne = new C0578dx(context, this, null);
        this.mHandler = new C0570a(context.getMainLooper());
        mo3736a(strArr);
        this.f1508jF = strArr;
        registerConnectionCallbacks((ConnectionCallbacks) C0600eg.m1554f(connectionCallbacks));
        registerConnectionFailedListener((OnConnectionFailedListener) C0600eg.m1554f(onConnectionFailedListener));
    }

    /* renamed from: I */
    public void mo3886I(int i) {
        this.mHandler.sendMessage(this.mHandler.obtainMessage(4, Integer.valueOf(i)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2637a(int i, IBinder iBinder, Bundle bundle) {
        this.mHandler.sendMessage(this.mHandler.obtainMessage(1, new C0577h(i, iBinder, bundle)));
    }

    /* renamed from: a */
    public final void mo3887a(C0571b<?> bVar) {
        synchronized (this.f1511pf) {
            this.f1511pf.add(bVar);
        }
        this.mHandler.sendMessage(this.mHandler.obtainMessage(2, bVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo2638a(C0590ec ecVar, C0574e eVar) throws RemoteException;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3736a(String... strArr) {
    }

    /* renamed from: aU */
    public Bundle mo2319aU() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: am */
    public abstract String mo2639am();

    /* access modifiers changed from: protected */
    /* renamed from: an */
    public abstract String mo2640an();

    /* renamed from: bO */
    public final String[] mo3888bO() {
        return this.f1508jF;
    }

    /* access modifiers changed from: protected */
    /* renamed from: bP */
    public final void mo3889bP() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: bQ */
    public final T mo3890bQ() {
        mo3889bP();
        return this.f1510pe;
    }

    /* renamed from: bp */
    public boolean mo2320bp() {
        return this.f1513ph;
    }

    public void connect() {
        this.f1513ph = true;
        synchronized (this.f1515pj) {
            this.f1514pi = true;
        }
        int isGooglePlayServicesAvailable = GooglePlayServicesUtil.isGooglePlayServicesAvailable(this.mContext);
        if (isGooglePlayServicesAvailable != 0) {
            this.mHandler.sendMessage(this.mHandler.obtainMessage(3, Integer.valueOf(isGooglePlayServicesAvailable)));
            return;
        }
        if (this.f1512pg != null) {
            Log.e("GmsClient", "Calling connect() while still connected, missing disconnect().");
            this.f1510pe = null;
            C0581dy.m1457s(this.mContext).mo3917b(mo2639am(), this.f1512pg);
        }
        this.f1512pg = new C0575f<>();
        if (!C0581dy.m1457s(this.mContext).mo3916a(mo2639am(), this.f1512pg)) {
            Log.e("GmsClient", "unable to connect to service: " + mo2639am());
            this.mHandler.sendMessage(this.mHandler.obtainMessage(3, Integer.valueOf(9)));
        }
    }

    public void disconnect() {
        this.f1513ph = false;
        synchronized (this.f1515pj) {
            this.f1514pi = false;
        }
        synchronized (this.f1511pf) {
            int size = this.f1511pf.size();
            for (int i = 0; i < size; i++) {
                ((C0571b) this.f1511pf.get(i)).mo3897bS();
            }
            this.f1511pf.clear();
        }
        this.f1510pe = null;
        if (this.f1512pg != null) {
            C0581dy.m1457s(this.mContext).mo3917b(mo2639am(), this.f1512pg);
            this.f1512pg = null;
            this.f1509ne.mo3905J(-1);
        }
    }

    public final Context getContext() {
        return this.mContext;
    }

    public boolean isConnected() {
        return this.f1510pe != null;
    }

    public boolean isConnecting() {
        boolean z;
        synchronized (this.f1515pj) {
            z = this.f1514pi;
        }
        return z;
    }

    public boolean isConnectionCallbacksRegistered(GooglePlayServicesClient.ConnectionCallbacks listener) {
        return this.f1509ne.isConnectionCallbacksRegistered(new C0572c(listener));
    }

    public boolean isConnectionFailedListenerRegistered(GooglePlayServicesClient.OnConnectionFailedListener listener) {
        return this.f1509ne.isConnectionFailedListenerRegistered(listener);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public abstract T mo2643p(IBinder iBinder);

    public void registerConnectionCallbacks(GooglePlayServicesClient.ConnectionCallbacks listener) {
        this.f1509ne.registerConnectionCallbacks(new C0572c(listener));
    }

    public void registerConnectionCallbacks(ConnectionCallbacks listener) {
        this.f1509ne.registerConnectionCallbacks(listener);
    }

    public void registerConnectionFailedListener(GooglePlayServicesClient.OnConnectionFailedListener listener) {
        this.f1509ne.registerConnectionFailedListener(listener);
    }

    public void registerConnectionFailedListener(OnConnectionFailedListener listener) {
        this.f1509ne.registerConnectionFailedListener(listener);
    }

    public void unregisterConnectionCallbacks(GooglePlayServicesClient.ConnectionCallbacks listener) {
        this.f1509ne.unregisterConnectionCallbacks(new C0572c(listener));
    }

    public void unregisterConnectionFailedListener(GooglePlayServicesClient.OnConnectionFailedListener listener) {
        this.f1509ne.unregisterConnectionFailedListener(listener);
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final void mo3894w(IBinder iBinder) {
        try {
            mo2638a(C0591a.m1517y(iBinder), new C0574e(this));
        } catch (RemoteException e) {
            Log.w("GmsClient", "service died");
        }
    }
}
