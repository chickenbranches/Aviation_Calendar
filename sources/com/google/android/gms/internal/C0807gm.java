package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.ContentProviderClient;
import android.content.Context;
import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.location.C0969c;
import com.google.android.gms.location.C0969c.C0970a;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.gm */
public class C0807gm {
    private final Context mContext;

    /* renamed from: xP */
    private final C0818gq<C0804gl> f1904xP;

    /* renamed from: xQ */
    private ContentProviderClient f1905xQ = null;

    /* renamed from: xR */
    private boolean f1906xR = false;

    /* renamed from: xS */
    private HashMap<LocationListener, C0809b> f1907xS = new HashMap<>();

    /* renamed from: com.google.android.gms.internal.gm$a */
    private static class C0808a extends Handler {

        /* renamed from: xT */
        private final LocationListener f1908xT;

        public C0808a(LocationListener locationListener) {
            this.f1908xT = locationListener;
        }

        public C0808a(LocationListener locationListener, Looper looper) {
            super(looper);
            this.f1908xT = locationListener;
        }

        public void handleMessage(Message msg) {
            switch (msg.what) {
                case 1:
                    this.f1908xT.onLocationChanged(new Location((Location) msg.obj));
                    return;
                default:
                    Log.e("LocationClientHelper", "unknown message in LocationHandler.handleMessage");
                    return;
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.gm$b */
    private static class C0809b extends C0970a {

        /* renamed from: xU */
        private Handler f1909xU;

        C0809b(LocationListener locationListener, Looper looper) {
            this.f1909xU = looper == null ? new C0808a(locationListener) : new C0808a(locationListener, looper);
        }

        public void onLocationChanged(Location location) {
            if (this.f1909xU == null) {
                Log.e("LocationClientHelper", "Received a location in client after calling removeLocationUpdates.");
                return;
            }
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = location;
            this.f1909xU.sendMessage(obtain);
        }

        public void release() {
            this.f1909xU = null;
        }
    }

    public C0807gm(Context context, C0818gq<C0804gl> gqVar) {
        this.mContext = context;
        this.f1904xP = gqVar;
    }

    /* renamed from: dI */
    public void mo4509dI() {
        if (this.f1906xR) {
            setMockMode(false);
        }
    }

    public Location getLastLocation() {
        this.f1904xP.mo4536bP();
        try {
            return ((C0804gl) this.f1904xP.mo4537bQ()).mo4499an(this.mContext.getPackageName());
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    public void removeAllListeners() {
        try {
            synchronized (this.f1907xS) {
                for (C0809b bVar : this.f1907xS.values()) {
                    if (bVar != null) {
                        ((C0804gl) this.f1904xP.mo4537bQ()).mo4486a((C0969c) bVar);
                    }
                }
                this.f1907xS.clear();
            }
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    public void removeLocationUpdates(PendingIntent callbackIntent) {
        this.f1904xP.mo4536bP();
        try {
            ((C0804gl) this.f1904xP.mo4537bQ()).mo4476a(callbackIntent);
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    public void removeLocationUpdates(LocationListener listener) {
        this.f1904xP.mo4536bP();
        C0600eg.m1552b(listener, (Object) "Invalid null listener");
        synchronized (this.f1907xS) {
            C0809b bVar = (C0809b) this.f1907xS.remove(listener);
            if (this.f1905xQ != null && this.f1907xS.isEmpty()) {
                this.f1905xQ.release();
                this.f1905xQ = null;
            }
            if (bVar != null) {
                bVar.release();
                try {
                    ((C0804gl) this.f1904xP.mo4537bQ()).mo4486a((C0969c) bVar);
                } catch (RemoteException e) {
                    throw new IllegalStateException(e);
                }
            }
        }
    }

    public void requestLocationUpdates(LocationRequest request, PendingIntent callbackIntent) {
        this.f1904xP.mo4536bP();
        try {
            ((C0804gl) this.f1904xP.mo4537bQ()).mo4483a(request, callbackIntent);
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    public void requestLocationUpdates(LocationRequest request, LocationListener listener, Looper looper) {
        this.f1904xP.mo4536bP();
        if (looper == null) {
            C0600eg.m1552b(Looper.myLooper(), (Object) "Can't create handler inside thread that has not called Looper.prepare()");
        }
        synchronized (this.f1907xS) {
            C0809b bVar = (C0809b) this.f1907xS.get(listener);
            C0809b bVar2 = bVar == null ? new C0809b(listener, looper) : bVar;
            this.f1907xS.put(listener, bVar2);
            try {
                ((C0804gl) this.f1904xP.mo4537bQ()).mo4485a(request, (C0969c) bVar2, this.mContext.getPackageName());
            } catch (RemoteException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public void setMockLocation(Location mockLocation) {
        this.f1904xP.mo4536bP();
        try {
            ((C0804gl) this.f1904xP.mo4537bQ()).setMockLocation(mockLocation);
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    public void setMockMode(boolean isMockMode) {
        this.f1904xP.mo4536bP();
        try {
            ((C0804gl) this.f1904xP.mo4537bQ()).setMockMode(isMockMode);
            this.f1906xR = isMockMode;
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }
}
