package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.dx */
public final class C0578dx {
    private final Handler mHandler;
    /* access modifiers changed from: private */

    /* renamed from: ps */
    public final C0580b f1528ps;
    /* access modifiers changed from: private */

    /* renamed from: pt */
    public ArrayList<ConnectionCallbacks> f1529pt;

    /* renamed from: pu */
    final ArrayList<ConnectionCallbacks> f1530pu;

    /* renamed from: pv */
    private boolean f1531pv;

    /* renamed from: pw */
    private ArrayList<OnConnectionFailedListener> f1532pw;

    /* renamed from: px */
    private boolean f1533px;

    /* renamed from: com.google.android.gms.internal.dx$a */
    final class C0579a extends Handler {
        public C0579a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message msg) {
            if (msg.what == 1) {
                synchronized (C0578dx.this.f1529pt) {
                    if (C0578dx.this.f1528ps.mo2320bp() && C0578dx.this.f1528ps.isConnected() && C0578dx.this.f1529pt.contains(msg.obj)) {
                        ((ConnectionCallbacks) msg.obj).onConnected(C0578dx.this.f1528ps.mo2319aU());
                    }
                }
                return;
            }
            Log.wtf("GmsClientEvents", "Don't know how to handle this message.");
        }
    }

    /* renamed from: com.google.android.gms.internal.dx$b */
    public interface C0580b {
        /* renamed from: aU */
        Bundle mo2319aU();

        /* renamed from: bp */
        boolean mo2320bp();

        boolean isConnected();
    }

    public C0578dx(Context context, C0580b bVar) {
        this(context, bVar, null);
    }

    C0578dx(Context context, C0580b bVar, Handler handler) {
        this.f1530pu = new ArrayList<>();
        this.f1531pv = false;
        this.f1533px = false;
        if (handler == null) {
            handler = new C0579a(Looper.getMainLooper());
        }
        this.f1529pt = new ArrayList<>();
        this.f1532pw = new ArrayList<>();
        this.f1528ps = bVar;
        this.mHandler = handler;
    }

    /* renamed from: J */
    public void mo3905J(int i) {
        this.mHandler.removeMessages(1);
        synchronized (this.f1529pt) {
            this.f1531pv = true;
            ArrayList<ConnectionCallbacks> arrayList = this.f1529pt;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size && this.f1528ps.mo2320bp(); i2++) {
                if (this.f1529pt.contains(arrayList.get(i2))) {
                    ((ConnectionCallbacks) arrayList.get(i2)).onConnectionSuspended(i);
                }
            }
            this.f1531pv = false;
        }
    }

    /* renamed from: a */
    public void mo3906a(ConnectionResult connectionResult) {
        this.mHandler.removeMessages(1);
        synchronized (this.f1532pw) {
            this.f1533px = true;
            ArrayList<OnConnectionFailedListener> arrayList = this.f1532pw;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                if (this.f1528ps.mo2320bp()) {
                    if (this.f1532pw.contains(arrayList.get(i))) {
                        ((OnConnectionFailedListener) arrayList.get(i)).onConnectionFailed(connectionResult);
                    }
                    i++;
                } else {
                    return;
                }
            }
            this.f1533px = false;
        }
    }

    /* renamed from: b */
    public void mo3907b(Bundle bundle) {
        boolean z = true;
        synchronized (this.f1529pt) {
            C0600eg.m1555p(!this.f1531pv);
            this.mHandler.removeMessages(1);
            this.f1531pv = true;
            if (this.f1530pu.size() != 0) {
                z = false;
            }
            C0600eg.m1555p(z);
            ArrayList<ConnectionCallbacks> arrayList = this.f1529pt;
            int size = arrayList.size();
            for (int i = 0; i < size && this.f1528ps.mo2320bp() && this.f1528ps.isConnected(); i++) {
                this.f1530pu.size();
                if (!this.f1530pu.contains(arrayList.get(i))) {
                    ((ConnectionCallbacks) arrayList.get(i)).onConnected(bundle);
                }
            }
            this.f1530pu.clear();
            this.f1531pv = false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: bT */
    public void mo3908bT() {
        synchronized (this.f1529pt) {
            mo3907b(this.f1528ps.mo2319aU());
        }
    }

    public boolean isConnectionCallbacksRegistered(ConnectionCallbacks listener) {
        boolean contains;
        C0600eg.m1554f(listener);
        synchronized (this.f1529pt) {
            contains = this.f1529pt.contains(listener);
        }
        return contains;
    }

    public boolean isConnectionFailedListenerRegistered(OnConnectionFailedListener listener) {
        boolean contains;
        C0600eg.m1554f(listener);
        synchronized (this.f1532pw) {
            contains = this.f1532pw.contains(listener);
        }
        return contains;
    }

    public void registerConnectionCallbacks(ConnectionCallbacks listener) {
        C0600eg.m1554f(listener);
        synchronized (this.f1529pt) {
            if (this.f1529pt.contains(listener)) {
                Log.w("GmsClientEvents", "registerConnectionCallbacks(): listener " + listener + " is already registered");
            } else {
                if (this.f1531pv) {
                    this.f1529pt = new ArrayList<>(this.f1529pt);
                }
                this.f1529pt.add(listener);
            }
        }
        if (this.f1528ps.isConnected()) {
            this.mHandler.sendMessage(this.mHandler.obtainMessage(1, listener));
        }
    }

    public void registerConnectionFailedListener(OnConnectionFailedListener listener) {
        C0600eg.m1554f(listener);
        synchronized (this.f1532pw) {
            if (this.f1532pw.contains(listener)) {
                Log.w("GmsClientEvents", "registerConnectionFailedListener(): listener " + listener + " is already registered");
            } else {
                if (this.f1533px) {
                    this.f1532pw = new ArrayList<>(this.f1532pw);
                }
                this.f1532pw.add(listener);
            }
        }
    }

    public void unregisterConnectionCallbacks(ConnectionCallbacks listener) {
        C0600eg.m1554f(listener);
        synchronized (this.f1529pt) {
            if (this.f1529pt != null) {
                if (this.f1531pv) {
                    this.f1529pt = new ArrayList<>(this.f1529pt);
                }
                if (!this.f1529pt.remove(listener)) {
                    Log.w("GmsClientEvents", "unregisterConnectionCallbacks(): listener " + listener + " not found");
                } else if (this.f1531pv && !this.f1530pu.contains(listener)) {
                    this.f1530pu.add(listener);
                }
            }
        }
    }

    public void unregisterConnectionFailedListener(OnConnectionFailedListener listener) {
        C0600eg.m1554f(listener);
        synchronized (this.f1532pw) {
            if (this.f1532pw != null) {
                if (this.f1533px) {
                    this.f1532pw = new ArrayList<>(this.f1532pw);
                }
                if (!this.f1532pw.remove(listener)) {
                    Log.w("GmsClientEvents", "unregisterConnectionFailedListener(): listener " + listener + " not found");
                }
            }
        }
    }
}
