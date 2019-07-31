package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.IBinder;
import android.os.Message;
import com.google.android.gms.common.GooglePlayServicesUtil;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.dy */
public final class C0581dy implements Callback {

    /* renamed from: pA */
    private static C0581dy f1535pA;

    /* renamed from: pz */
    private static final Object f1536pz = new Object();

    /* renamed from: iT */
    private final Context f1537iT;
    private final Handler mHandler;
    /* access modifiers changed from: private */

    /* renamed from: pB */
    public final HashMap<String, C0582a> f1538pB = new HashMap<>();

    /* renamed from: com.google.android.gms.internal.dy$a */
    final class C0582a {
        /* access modifiers changed from: private */
        public int mState = 0;

        /* renamed from: pC */
        private final String f1539pC;

        /* renamed from: pD */
        private final C0583a f1540pD = new C0583a();
        /* access modifiers changed from: private */

        /* renamed from: pE */
        public final HashSet<C0575f> f1541pE = new HashSet<>();

        /* renamed from: pF */
        private boolean f1542pF;
        /* access modifiers changed from: private */

        /* renamed from: pG */
        public IBinder f1543pG;
        /* access modifiers changed from: private */

        /* renamed from: pH */
        public ComponentName f1544pH;

        /* renamed from: com.google.android.gms.internal.dy$a$a */
        public class C0583a implements ServiceConnection {
            public C0583a() {
            }

            public void onServiceConnected(ComponentName component, IBinder binder) {
                synchronized (C0581dy.this.f1538pB) {
                    C0582a.this.f1543pG = binder;
                    C0582a.this.f1544pH = component;
                    Iterator it = C0582a.this.f1541pE.iterator();
                    while (it.hasNext()) {
                        ((C0575f) it.next()).onServiceConnected(component, binder);
                    }
                    C0582a.this.mState = 1;
                }
            }

            public void onServiceDisconnected(ComponentName component) {
                synchronized (C0581dy.this.f1538pB) {
                    C0582a.this.f1543pG = null;
                    C0582a.this.f1544pH = component;
                    Iterator it = C0582a.this.f1541pE.iterator();
                    while (it.hasNext()) {
                        ((C0575f) it.next()).onServiceDisconnected(component);
                    }
                    C0582a.this.mState = 2;
                }
            }
        }

        public C0582a(String str) {
            this.f1539pC = str;
        }

        /* renamed from: a */
        public void mo3919a(C0575f fVar) {
            this.f1541pE.add(fVar);
        }

        /* renamed from: b */
        public void mo3920b(C0575f fVar) {
            this.f1541pE.remove(fVar);
        }

        /* renamed from: bU */
        public C0583a mo3921bU() {
            return this.f1540pD;
        }

        /* renamed from: bV */
        public String mo3922bV() {
            return this.f1539pC;
        }

        /* renamed from: bW */
        public boolean mo3923bW() {
            return this.f1541pE.isEmpty();
        }

        /* renamed from: c */
        public boolean mo3924c(C0575f fVar) {
            return this.f1541pE.contains(fVar);
        }

        public IBinder getBinder() {
            return this.f1543pG;
        }

        public ComponentName getComponentName() {
            return this.f1544pH;
        }

        public int getState() {
            return this.mState;
        }

        public boolean isBound() {
            return this.f1542pF;
        }

        /* renamed from: q */
        public void mo3929q(boolean z) {
            this.f1542pF = z;
        }
    }

    private C0581dy(Context context) {
        this.mHandler = new Handler(context.getMainLooper(), this);
        this.f1537iT = context.getApplicationContext();
    }

    /* renamed from: s */
    public static C0581dy m1457s(Context context) {
        synchronized (f1536pz) {
            if (f1535pA == null) {
                f1535pA = new C0581dy(context.getApplicationContext());
            }
        }
        return f1535pA;
    }

    /* renamed from: a */
    public boolean mo3916a(String str, C0575f fVar) {
        boolean isBound;
        synchronized (this.f1538pB) {
            C0582a aVar = (C0582a) this.f1538pB.get(str);
            if (aVar != null) {
                this.mHandler.removeMessages(0, aVar);
                if (!aVar.mo3924c(fVar)) {
                    aVar.mo3919a(fVar);
                    switch (aVar.getState()) {
                        case 1:
                            fVar.onServiceConnected(aVar.getComponentName(), aVar.getBinder());
                            break;
                        case 2:
                            aVar.mo3929q(this.f1537iT.bindService(new Intent(str).setPackage(GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_PACKAGE), aVar.mo3921bU(), 129));
                            break;
                    }
                } else {
                    throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  startServiceAction=" + str);
                }
            } else {
                aVar = new C0582a(str);
                aVar.mo3919a(fVar);
                aVar.mo3929q(this.f1537iT.bindService(new Intent(str).setPackage(GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_PACKAGE), aVar.mo3921bU(), 129));
                this.f1538pB.put(str, aVar);
            }
            isBound = aVar.isBound();
        }
        return isBound;
    }

    /* renamed from: b */
    public void mo3917b(String str, C0575f fVar) {
        synchronized (this.f1538pB) {
            C0582a aVar = (C0582a) this.f1538pB.get(str);
            if (aVar == null) {
                throw new IllegalStateException("Nonexistent connection status for service action: " + str);
            } else if (!aVar.mo3924c(fVar)) {
                throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  startServiceAction=" + str);
            } else {
                aVar.mo3920b(fVar);
                if (aVar.mo3923bW()) {
                    this.mHandler.sendMessageDelayed(this.mHandler.obtainMessage(0, aVar), 5000);
                }
            }
        }
    }

    public boolean handleMessage(Message msg) {
        switch (msg.what) {
            case 0:
                C0582a aVar = (C0582a) msg.obj;
                synchronized (this.f1538pB) {
                    if (aVar.mo3923bW()) {
                        this.f1537iT.unbindService(aVar.mo3921bU());
                        this.f1538pB.remove(aVar.mo3922bV());
                    }
                }
                return true;
            default:
                return false;
        }
    }
}
