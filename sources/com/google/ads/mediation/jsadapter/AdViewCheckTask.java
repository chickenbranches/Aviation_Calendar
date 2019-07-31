package com.google.ads.mediation.jsadapter;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.view.View.MeasureSpec;
import android.webkit.WebView;
import com.google.android.gms.internal.C0502ct;

public final class AdViewCheckTask implements Runnable {
    public static final int BACKGROUND_COLOR = 0;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final JavascriptAdapter f23r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public final Handler f24s = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: t */
    public final long f25t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public long f26u;

    /* renamed from: com.google.ads.mediation.jsadapter.AdViewCheckTask$a */
    private final class C0082a extends AsyncTask<Void, Void, Boolean> {

        /* renamed from: v */
        private final int f27v;

        /* renamed from: w */
        private final int f28w;

        /* renamed from: x */
        private final WebView f29x;

        /* renamed from: y */
        private Bitmap f30y;

        public C0082a(int i, int i2, WebView webView) {
            this.f27v = i2;
            this.f28w = i;
            this.f29x = webView;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public synchronized Boolean doInBackground(Void... voidArr) {
            Boolean bool;
            int width = this.f30y.getWidth();
            int height = this.f30y.getHeight();
            if (width == 0 || height == 0) {
                bool = Boolean.valueOf(false);
            } else {
                int i = 0;
                for (int i2 = 0; i2 < width; i2 += 10) {
                    for (int i3 = 0; i3 < height; i3 += 10) {
                        if (this.f30y.getPixel(i2, i3) != 0) {
                            i++;
                        }
                    }
                }
                bool = Boolean.valueOf(((double) i) / (((double) (width * height)) / 100.0d) > 0.1d);
            }
            return bool;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Boolean bool) {
            AdViewCheckTask.m7a(AdViewCheckTask.this);
            if (bool.booleanValue()) {
                AdViewCheckTask.this.f23r.sendAdReceivedUpdate();
            } else if (AdViewCheckTask.this.f26u > 0) {
                if (C0502ct.m1151n(2)) {
                    C0502ct.m1152r("Ad not detected, scheduling another run.");
                }
                AdViewCheckTask.this.f24s.postDelayed(AdViewCheckTask.this, AdViewCheckTask.this.f25t);
            } else {
                C0502ct.m1152r("Ad not detected, Not scheduling anymore runs.");
                AdViewCheckTask.this.f23r.sendAdNotReceivedUpdate();
            }
        }

        /* access modifiers changed from: protected */
        public synchronized void onPreExecute() {
            this.f30y = Bitmap.createBitmap(this.f28w, this.f27v, Config.ARGB_8888);
            this.f29x.setVisibility(0);
            this.f29x.measure(MeasureSpec.makeMeasureSpec(this.f28w, 0), MeasureSpec.makeMeasureSpec(this.f27v, 0));
            this.f29x.layout(0, 0, this.f28w, this.f27v);
            this.f29x.draw(new Canvas(this.f30y));
            this.f29x.invalidate();
        }
    }

    public AdViewCheckTask(JavascriptAdapter adapter, long checkIntervalInMillis, long numIterations) {
        this.f23r = adapter;
        this.f25t = checkIntervalInMillis;
        this.f26u = numIterations;
    }

    /* renamed from: a */
    static /* synthetic */ long m7a(AdViewCheckTask adViewCheckTask) {
        long j = adViewCheckTask.f26u - 1;
        adViewCheckTask.f26u = j;
        return j;
    }

    public void run() {
        if (this.f23r != null && !this.f23r.shouldStopAdCheck()) {
            new C0082a(this.f23r.getWebViewWidth(), this.f23r.getWebViewHeight(), this.f23r.getWebView()).execute(new Void[0]);
        }
    }

    public void start() {
        this.f24s.postDelayed(this, this.f25t);
    }
}
