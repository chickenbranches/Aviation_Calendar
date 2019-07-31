package com.google.android.gms.common.api;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Api.C0144a;
import com.google.android.gms.common.api.Api.C0145b;
import com.google.android.gms.common.api.GoogleApiClient.C0150a;
import com.google.android.gms.common.api.GoogleApiClient.C0151b;
import com.google.android.gms.common.api.PendingResult.C0152a;
import com.google.android.gms.internal.C0600eg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.common.api.a */
public class C0153a {

    /* renamed from: com.google.android.gms.common.api.a$a */
    public static abstract class C0154a<R extends Result, A extends C0144a> implements C0151b<A>, PendingResult<R>, C0157c<R> {

        /* renamed from: mU */
        private final C0145b<A> f289mU;

        /* renamed from: mV */
        private final Object f290mV = new Object();

        /* renamed from: mW */
        private final C0156b<R> f291mW;

        /* renamed from: mX */
        private final CountDownLatch f292mX = new CountDownLatch(1);

        /* renamed from: mY */
        private final ArrayList<C0152a> f293mY = new ArrayList<>();

        /* renamed from: mZ */
        private ResultCallback<R> f294mZ;

        /* renamed from: na */
        private R f295na;

        /* renamed from: nb */
        private boolean f296nb;

        /* renamed from: nc */
        private C0150a f297nc;

        public C0154a(C0145b<A> bVar) {
            this.f289mU = bVar;
            this.f291mW = new C0156b<R>() {
                /* access modifiers changed from: protected */
                /* renamed from: a */
                public void mo2362a(ResultCallback<R> resultCallback, R r) {
                    resultCallback.onResult(r);
                }
            };
        }

        /* renamed from: bl */
        private R m218bl() {
            R r;
            synchronized (this.f290mV) {
                C0600eg.m1550a(!this.f296nb, "Result has already been consumed.");
                C0600eg.m1550a(isReady(), "Result is not ready.");
                r = this.f295na;
                mo2360bm();
            }
            return r;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo2062a(A a);

        /* renamed from: a */
        public void mo2333a(C0150a aVar) {
            this.f297nc = aVar;
        }

        /* renamed from: a */
        public final void mo2048a(R r) {
            boolean z = true;
            C0600eg.m1550a(!isReady(), "Results have already been set");
            if (this.f296nb) {
                z = false;
            }
            C0600eg.m1550a(z, "Result has already been consumed");
            synchronized (this.f290mV) {
                this.f295na = r;
                this.f292mX.countDown();
                Status status = this.f295na.getStatus();
                if (this.f294mZ != null) {
                    this.f291mW.mo2363b(this.f294mZ, m218bl());
                }
                Iterator it = this.f293mY.iterator();
                while (it.hasNext()) {
                    ((C0152a) it.next()).mo2339l(status);
                }
                this.f293mY.clear();
            }
        }

        public final R await() {
            C0600eg.m1550a(!this.f296nb, "Results has already been consumed");
            try {
                this.f292mX.await();
            } catch (InterruptedException e) {
                mo2048a((R) mo2067e(Status.f284nB));
            }
            C0600eg.m1550a(isReady(), "Result is not ready.");
            return m218bl();
        }

        public final R await(long time, TimeUnit units) {
            C0600eg.m1550a(!this.f296nb, "Result has already been consumed.");
            try {
                if (!this.f292mX.await(time, units)) {
                    mo2048a((R) mo2067e(Status.f285nC));
                }
            } catch (InterruptedException e) {
                mo2048a((R) mo2067e(Status.f284nB));
            }
            C0600eg.m1550a(isReady(), "Result is not ready.");
            return m218bl();
        }

        /* renamed from: b */
        public final void mo2334b(A a) {
            mo2062a(a);
        }

        /* renamed from: bj */
        public final C0145b<A> mo2335bj() {
            return this.f289mU;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: bm */
        public void mo2360bm() {
            this.f296nb = true;
            this.f295na = null;
            if (this.f297nc != null) {
                this.f297nc.mo2316b(this);
            }
        }

        public final boolean isReady() {
            return this.f292mX.getCount() == 0;
        }

        public final void setResultCallback(ResultCallback<R> callback) {
            C0600eg.m1550a(!this.f296nb, "Result has already been consumed.");
            synchronized (this.f290mV) {
                if (isReady()) {
                    this.f291mW.mo2363b(callback, m218bl());
                } else {
                    this.f294mZ = callback;
                }
            }
        }
    }

    /* renamed from: com.google.android.gms.common.api.a$b */
    static abstract class C0156b<R extends Result> extends Handler {
        public C0156b() {
            this(Looper.getMainLooper());
        }

        public C0156b(Looper looper) {
            super(looper);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo2362a(ResultCallback<R> resultCallback, R r);

        /* renamed from: b */
        public void mo2363b(ResultCallback<R> resultCallback, R r) {
            sendMessage(obtainMessage(1, new Pair(resultCallback, r)));
        }

        public void handleMessage(Message msg) {
            switch (msg.what) {
                case 1:
                    Pair pair = (Pair) msg.obj;
                    mo2362a((ResultCallback) pair.first, (Result) pair.second);
                    return;
                default:
                    Log.wtf("GoogleApi", "Don't know how to handle this message.");
                    return;
            }
        }
    }

    /* renamed from: com.google.android.gms.common.api.a$c */
    public interface C0157c<R> {
        /* renamed from: a */
        void mo2048a(R r);
    }
}
