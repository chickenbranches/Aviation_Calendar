package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.cast.Cast.ApplicationConnectionResult;
import com.google.android.gms.cast.Cast.Listener;
import com.google.android.gms.cast.Cast.MessageReceivedCallback;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.C0153a.C0157c;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.C0545di.C0546a;
import com.google.android.gms.internal.C0548dj.C0549a;
import com.google.android.gms.internal.C0569dw.C0574e;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.gms.internal.dg */
public final class C0538dg extends C0569dw<C0545di> {
    /* access modifiers changed from: private */

    /* renamed from: lA */
    public static final C0550dk f1408lA = new C0550dk("CastClientImpl");
    /* access modifiers changed from: private */

    /* renamed from: lQ */
    public static final Object f1409lQ = new Object();
    /* access modifiers changed from: private */

    /* renamed from: lR */
    public static final Object f1410lR = new Object();
    /* access modifiers changed from: private */

    /* renamed from: kw */
    public final Listener f1411kw;
    /* access modifiers changed from: private */

    /* renamed from: lB */
    public ApplicationMetadata f1412lB = null;
    /* access modifiers changed from: private */

    /* renamed from: lC */
    public final CastDevice f1413lC;

    /* renamed from: lD */
    private final C0548dj f1414lD = new C0549a() {
        /* renamed from: b */
        private void m1295b(long j, int i) {
            C0157c cVar;
            synchronized (C0538dg.this.f1424lN) {
                cVar = (C0157c) C0538dg.this.f1424lN.remove(Long.valueOf(j));
            }
            if (cVar != null) {
                cVar.mo2048a(new Status(i));
            }
        }

        /* renamed from: x */
        private boolean m1296x(int i) {
            synchronized (C0538dg.f1410lR) {
                if (C0538dg.this.f1426lP == null) {
                    return false;
                }
                C0538dg.this.f1426lP.mo2048a(new Status(i));
                C0538dg.this.f1426lP = null;
                return true;
            }
        }

        /* renamed from: a */
        public void mo3785a(ApplicationMetadata applicationMetadata, String str, String str2, boolean z) {
            C0538dg.this.f1421lK = applicationMetadata.getApplicationId();
            C0538dg.this.f1422lL = str2;
            synchronized (C0538dg.f1409lQ) {
                if (C0538dg.this.f1425lO != null) {
                    C0538dg.this.f1425lO.mo2048a(new C0543a(new Status(0), applicationMetadata, str, str2, z));
                    C0538dg.this.f1425lO = null;
                }
            }
        }

        /* renamed from: a */
        public void mo3786a(String str, long j) {
            m1295b(j, 0);
        }

        /* renamed from: a */
        public void mo3787a(String str, long j, int i) {
            m1295b(j, i);
        }

        /* renamed from: a */
        public void mo3788a(final String str, final String str2) {
            C0538dg.f1408lA.mo3816b("Receive (type=text, ns=%s) %s", str, str2);
            C0538dg.this.mHandler.post(new Runnable() {
                public void run() {
                    MessageReceivedCallback messageReceivedCallback;
                    synchronized (C0538dg.this.f1415lE) {
                        messageReceivedCallback = (MessageReceivedCallback) C0538dg.this.f1415lE.get(str);
                    }
                    if (messageReceivedCallback != null) {
                        messageReceivedCallback.onMessageReceived(C0538dg.this.f1413lC, str, str2);
                        return;
                    }
                    C0538dg.f1408lA.mo3816b("Discarded message for unknown namespace '%s'", str);
                }
            });
        }

        /* renamed from: b */
        public void mo3789b(String str, double d, boolean z) {
            final String str2 = str;
            final double d2 = d;
            final boolean z2 = z;
            C0538dg.this.mHandler.post(new Runnable() {
                public void run() {
                    C0538dg.this.m1260a(str2, d2, z2);
                }
            });
        }

        /* renamed from: b */
        public void mo3790b(String str, byte[] bArr) {
            C0538dg.f1408lA.mo3816b("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
        }

        public void onApplicationDisconnected(final int statusCode) {
            C0538dg.this.f1421lK = null;
            C0538dg.this.f1422lL = null;
            if (!m1296x(statusCode) && C0538dg.this.f1411kw != null) {
                C0538dg.this.mHandler.post(new Runnable() {
                    public void run() {
                        if (C0538dg.this.f1411kw != null) {
                            C0538dg.this.f1411kw.onApplicationDisconnected(statusCode);
                        }
                    }
                });
            }
        }

        /* renamed from: t */
        public void mo3792t(int i) {
            C0538dg.f1408lA.mo3816b("ICastDeviceControllerListener.onDisconnected", new Object[0]);
            C0538dg.this.f1419lI = false;
            C0538dg.this.f1412lB = null;
            if (i != 0) {
                C0538dg.this.mo3886I(2);
            }
        }

        /* renamed from: u */
        public void mo3793u(int i) {
            synchronized (C0538dg.f1409lQ) {
                if (C0538dg.this.f1425lO != null) {
                    C0538dg.this.f1425lO.mo2048a(new C0543a(new Status(i)));
                    C0538dg.this.f1425lO = null;
                }
            }
        }

        /* renamed from: v */
        public void mo3794v(int i) {
            m1296x(i);
        }

        /* renamed from: w */
        public void mo3795w(int i) {
            m1296x(i);
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: lE */
    public final Map<String, MessageReceivedCallback> f1415lE = new HashMap();

    /* renamed from: lF */
    private final long f1416lF;

    /* renamed from: lG */
    private String f1417lG = null;

    /* renamed from: lH */
    private boolean f1418lH;
    /* access modifiers changed from: private */

    /* renamed from: lI */
    public boolean f1419lI = false;

    /* renamed from: lJ */
    private final AtomicLong f1420lJ = new AtomicLong(0);
    /* access modifiers changed from: private */

    /* renamed from: lK */
    public String f1421lK;
    /* access modifiers changed from: private */

    /* renamed from: lL */
    public String f1422lL;

    /* renamed from: lM */
    private Bundle f1423lM;
    /* access modifiers changed from: private */

    /* renamed from: lN */
    public Map<Long, C0157c<Status>> f1424lN = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: lO */
    public C0157c<ApplicationConnectionResult> f1425lO;
    /* access modifiers changed from: private */

    /* renamed from: lP */
    public C0157c<Status> f1426lP;

    /* renamed from: lb */
    private double f1427lb = 0.0d;

    /* renamed from: lc */
    private boolean f1428lc = false;
    /* access modifiers changed from: private */
    public final Handler mHandler = new Handler(Looper.getMainLooper());

    /* renamed from: com.google.android.gms.internal.dg$a */
    private static final class C0543a implements ApplicationConnectionResult {

        /* renamed from: jY */
        private final Status f1439jY;

        /* renamed from: lX */
        private final ApplicationMetadata f1440lX;

        /* renamed from: lY */
        private final String f1441lY;

        /* renamed from: lZ */
        private final String f1442lZ;

        /* renamed from: ma */
        private final boolean f1443ma;

        public C0543a(Status status) {
            this(status, null, null, null, false);
        }

        public C0543a(Status status, ApplicationMetadata applicationMetadata, String str, String str2, boolean z) {
            this.f1439jY = status;
            this.f1440lX = applicationMetadata;
            this.f1441lY = str;
            this.f1442lZ = str2;
            this.f1443ma = z;
        }

        public ApplicationMetadata getApplicationMetadata() {
            return this.f1440lX;
        }

        public String getApplicationStatus() {
            return this.f1441lY;
        }

        public String getSessionId() {
            return this.f1442lZ;
        }

        public Status getStatus() {
            return this.f1439jY;
        }

        public boolean getWasLaunched() {
            return this.f1443ma;
        }
    }

    public C0538dg(Context context, CastDevice castDevice, long j, Listener listener, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        super(context, connectionCallbacks, onConnectionFailedListener, (String[]) null);
        this.f1413lC = castDevice;
        this.f1411kw = listener;
        this.f1416lF = j;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m1260a(String str, double d, boolean z) {
        boolean z2;
        boolean z3;
        if (!C0544dh.m1307a(str, this.f1417lG)) {
            this.f1417lG = str;
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.f1411kw != null && (z2 || this.f1418lH)) {
            this.f1411kw.onApplicationStatusChanged();
        }
        if (d != this.f1427lb) {
            this.f1427lb = d;
            z3 = true;
        } else {
            z3 = false;
        }
        if (z != this.f1428lc) {
            this.f1428lc = z;
            z3 = true;
        }
        f1408lA.mo3816b("hasChange=%b, mFirstStatusUpdate=%b", Boolean.valueOf(z3), Boolean.valueOf(this.f1418lH));
        if (this.f1411kw != null && (z3 || this.f1418lH)) {
            this.f1411kw.onVolumeChanged();
        }
        this.f1418lH = false;
    }

    /* renamed from: aX */
    private void m1262aX() throws IllegalStateException {
        if (!this.f1419lI) {
            throw new IllegalStateException("not connected to a device");
        }
    }

    /* renamed from: d */
    private void m1271d(C0157c<ApplicationConnectionResult> cVar) {
        synchronized (f1409lQ) {
            if (this.f1425lO != null) {
                this.f1425lO.mo2048a(new C0543a(new Status(2002)));
            }
            this.f1425lO = cVar;
        }
    }

    /* renamed from: f */
    private void m1274f(C0157c<Status> cVar) {
        synchronized (f1410lR) {
            if (this.f1426lP != null) {
                cVar.mo2048a(new Status(2001));
            } else {
                this.f1426lP = cVar;
            }
        }
    }

    /* renamed from: C */
    public void mo3770C(String str) throws IllegalArgumentException, IllegalStateException, RemoteException {
        MessageReceivedCallback messageReceivedCallback;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Channel namespace cannot be null or empty");
        }
        synchronized (this.f1415lE) {
            messageReceivedCallback = (MessageReceivedCallback) this.f1415lE.remove(str);
        }
        if (messageReceivedCallback != null) {
            ((C0545di) mo3890bQ()).mo3801F(str);
        }
    }

    /* renamed from: a */
    public void mo3771a(double d) throws IllegalArgumentException, IllegalStateException, RemoteException {
        if (Double.isInfinite(d) || Double.isNaN(d)) {
            throw new IllegalArgumentException("Volume cannot be " + d);
        }
        ((C0545di) mo3890bQ()).mo3802a(d, this.f1427lb, this.f1428lc);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2637a(int i, IBinder iBinder, Bundle bundle) {
        if (i == 0 || i == 1001) {
            this.f1419lI = true;
            this.f1418lH = true;
        } else {
            this.f1419lI = false;
        }
        if (i == 1001) {
            this.f1423lM = new Bundle();
            this.f1423lM.putBoolean(Cast.EXTRA_APP_NO_LONGER_RUNNING, true);
            i = 0;
        }
        super.mo2637a(i, iBinder, bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2638a(C0590ec ecVar, C0574e eVar) throws RemoteException {
        Bundle bundle = new Bundle();
        f1408lA.mo3816b("getServiceFromBroker(): mLastApplicationId=%s, mLastSessionId=%s", this.f1421lK, this.f1422lL);
        this.f1413lC.putInBundle(bundle);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", this.f1416lF);
        if (this.f1421lK != null) {
            bundle.putString("last_application_id", this.f1421lK);
            if (this.f1422lL != null) {
                bundle.putString("last_session_id", this.f1422lL);
            }
        }
        ecVar.mo3948a((C0587eb) eVar, (int) GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE, getContext().getPackageName(), this.f1414lD.asBinder(), bundle);
    }

    /* renamed from: a */
    public void mo3772a(String str, MessageReceivedCallback messageReceivedCallback) throws IllegalArgumentException, IllegalStateException, RemoteException {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Channel namespace cannot be null or empty");
        }
        mo3770C(str);
        if (messageReceivedCallback != null) {
            synchronized (this.f1415lE) {
                this.f1415lE.put(str, messageReceivedCallback);
            }
            ((C0545di) mo3890bQ()).mo3800E(str);
        }
    }

    /* renamed from: a */
    public void mo3773a(String str, C0157c<Status> cVar) throws IllegalStateException, RemoteException {
        m1274f(cVar);
        ((C0545di) mo3890bQ()).mo3799D(str);
    }

    /* renamed from: a */
    public void mo3774a(String str, String str2, C0157c<Status> cVar) throws IllegalArgumentException, IllegalStateException, RemoteException {
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("The message payload cannot be null or empty");
        } else if (str == null || str.length() > 128) {
            throw new IllegalArgumentException("Invalid namespace length");
        } else if (str2.length() > 65536) {
            throw new IllegalArgumentException("Message exceeds maximum size");
        } else {
            m1262aX();
            long incrementAndGet = this.f1420lJ.incrementAndGet();
            ((C0545di) mo3890bQ()).mo3803a(str, str2, incrementAndGet);
            this.f1424lN.put(Long.valueOf(incrementAndGet), cVar);
        }
    }

    /* renamed from: a */
    public void mo3775a(String str, boolean z, C0157c<ApplicationConnectionResult> cVar) throws IllegalStateException, RemoteException {
        m1271d(cVar);
        ((C0545di) mo3890bQ()).mo3809c(str, z);
    }

    /* renamed from: aU */
    public Bundle mo2319aU() {
        if (this.f1423lM == null) {
            return super.mo2319aU();
        }
        Bundle bundle = this.f1423lM;
        this.f1423lM = null;
        return bundle;
    }

    /* renamed from: aV */
    public void mo3776aV() throws IllegalStateException, RemoteException {
        ((C0545di) mo3890bQ()).mo3806aV();
    }

    /* renamed from: aW */
    public double mo3777aW() throws IllegalStateException {
        m1262aX();
        return this.f1427lb;
    }

    /* access modifiers changed from: protected */
    /* renamed from: am */
    public String mo2639am() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    /* access modifiers changed from: protected */
    /* renamed from: an */
    public String mo2640an() {
        return "com.google.android.gms.cast.internal.ICastDeviceController";
    }

    /* renamed from: b */
    public void mo3778b(String str, String str2, C0157c<ApplicationConnectionResult> cVar) throws IllegalStateException, RemoteException {
        m1271d(cVar);
        ((C0545di) mo3890bQ()).mo3807b(str, str2);
    }

    public void disconnect() {
        try {
            if (isConnected()) {
                synchronized (this.f1415lE) {
                    this.f1415lE.clear();
                }
                ((C0545di) mo3890bQ()).disconnect();
            }
        } catch (RemoteException e) {
            try {
                f1408lA.mo3816b("Error while disconnecting the controller interface: %s", e.getMessage());
            } catch (Throwable th) {
                super.disconnect();
                throw th;
            }
        }
        super.disconnect();
    }

    /* renamed from: e */
    public void mo3779e(C0157c<Status> cVar) throws IllegalStateException, RemoteException {
        m1274f(cVar);
        ((C0545di) mo3890bQ()).mo3808bb();
    }

    public ApplicationMetadata getApplicationMetadata() throws IllegalStateException {
        m1262aX();
        return this.f1412lB;
    }

    public String getApplicationStatus() throws IllegalStateException {
        m1262aX();
        return this.f1417lG;
    }

    public boolean isMute() throws IllegalStateException {
        m1262aX();
        return this.f1428lc;
    }

    /* renamed from: n */
    public void mo3783n(boolean z) throws IllegalStateException, RemoteException {
        ((C0545di) mo3890bQ()).mo3805a(z, this.f1427lb, this.f1428lc);
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public C0545di mo2643p(IBinder iBinder) {
        return C0546a.m1321v(iBinder);
    }
}
