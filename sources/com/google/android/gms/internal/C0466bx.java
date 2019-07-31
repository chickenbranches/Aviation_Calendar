package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks;
import com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener;
import com.google.android.gms.internal.C0464bw.C0465a;

/* renamed from: com.google.android.gms.internal.bx */
public abstract class C0466bx extends C0490cm {

    /* renamed from: fw */
    private final C0470bz f1232fw;

    /* renamed from: hn */
    private final C0465a f1233hn;

    /* renamed from: com.google.android.gms.internal.bx$a */
    public static final class C0467a extends C0466bx {
        private final Context mContext;

        public C0467a(Context context, C0470bz bzVar, C0465a aVar) {
            super(bzVar, aVar);
            this.mContext = context;
        }

        /* renamed from: ak */
        public void mo3630ak() {
        }

        /* renamed from: al */
        public C0476cd mo3631al() {
            return C0479ce.m1065a(this.mContext, new C0382ar());
        }
    }

    /* renamed from: com.google.android.gms.internal.bx$b */
    public static final class C0468b extends C0466bx implements ConnectionCallbacks, OnConnectionFailedListener {

        /* renamed from: fx */
        private final Object f1234fx = new Object();

        /* renamed from: hn */
        private final C0465a f1235hn;

        /* renamed from: ho */
        private final C0469by f1236ho;

        public C0468b(Context context, C0470bz bzVar, C0465a aVar) {
            super(bzVar, aVar);
            this.f1235hn = aVar;
            this.f1236ho = new C0469by(context, this, this, bzVar.f1238ej.f1348iL);
            this.f1236ho.connect();
        }

        /* renamed from: ak */
        public void mo3630ak() {
            synchronized (this.f1234fx) {
                if (this.f1236ho.isConnected() || this.f1236ho.isConnecting()) {
                    this.f1236ho.disconnect();
                }
            }
        }

        /* renamed from: al */
        public C0476cd mo3631al() {
            C0476cd cdVar;
            synchronized (this.f1234fx) {
                try {
                    cdVar = this.f1236ho.mo3632ao();
                } catch (IllegalStateException e) {
                    cdVar = null;
                }
            }
            return cdVar;
        }

        public void onConnected(Bundle connectionHint) {
            start();
        }

        public void onConnectionFailed(ConnectionResult result) {
            this.f1235hn.mo3623a(new C0474cb(0));
        }

        public void onDisconnected() {
            C0502ct.m1152r("Disconnected from remote ad request service.");
        }
    }

    public C0466bx(C0470bz bzVar, C0465a aVar) {
        this.f1232fw = bzVar;
        this.f1233hn = aVar;
    }

    /* renamed from: a */
    private static C0474cb m1040a(C0476cd cdVar, C0470bz bzVar) {
        try {
            return cdVar.mo3646b(bzVar);
        } catch (RemoteException e) {
            C0502ct.m1150b("Could not fetch ad response from ad request service.", e);
            return null;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: ai */
    public final void mo3624ai() {
        C0474cb a;
        try {
            C0476cd al = mo3631al();
            if (al == null) {
                a = new C0474cb(0);
            } else {
                a = m1040a(al, this.f1232fw);
                if (a == null) {
                    a = new C0474cb(0);
                }
            }
            mo3630ak();
            this.f1233hn.mo3623a(a);
        } catch (Throwable th) {
            mo3630ak();
            throw th;
        }
    }

    /* renamed from: ak */
    public abstract void mo3630ak();

    /* renamed from: al */
    public abstract C0476cd mo3631al();

    public final void onStop() {
        mo3630ak();
    }
}
