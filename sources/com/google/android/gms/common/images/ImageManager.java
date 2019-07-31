package com.google.android.gms.common.images;

import android.app.ActivityManager;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import android.support.p000v4.view.accessibility.AccessibilityEventCompat;
import android.util.Log;
import android.widget.ImageView;
import com.google.android.gms.common.images.C0170a.C0171a;
import com.google.android.gms.internal.C0564ds;
import com.google.android.gms.internal.C0604ek;
import com.google.android.gms.internal.C0633fg;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class ImageManager {
    /* access modifiers changed from: private */

    /* renamed from: ob */
    public static final Object f326ob = new Object();
    /* access modifiers changed from: private */

    /* renamed from: oc */
    public static HashSet<Uri> f327oc = new HashSet<>();

    /* renamed from: od */
    private static ImageManager f328od;

    /* renamed from: oe */
    private static ImageManager f329oe;
    /* access modifiers changed from: private */
    public final Context mContext;
    /* access modifiers changed from: private */
    public final Handler mHandler = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: of */
    public final ExecutorService f330of = Executors.newFixedThreadPool(4);
    /* access modifiers changed from: private */

    /* renamed from: og */
    public final C0165b f331og;
    /* access modifiers changed from: private */

    /* renamed from: oh */
    public final Map<C0170a, ImageReceiver> f332oh;
    /* access modifiers changed from: private */

    /* renamed from: oi */
    public final Map<Uri, ImageReceiver> f333oi;

    private final class ImageReceiver extends ResultReceiver {
        private final Uri mUri;
        /* access modifiers changed from: private */

        /* renamed from: oj */
        public final ArrayList<C0170a> f334oj;

        /* renamed from: ok */
        boolean f335ok = false;

        ImageReceiver(Uri uri) {
            super(new Handler(Looper.getMainLooper()));
            this.mUri = uri;
            this.f334oj = new ArrayList<>();
        }

        /* renamed from: bB */
        public void mo2430bB() {
            Intent intent = new Intent("com.google.android.gms.common.images.LOAD_IMAGE");
            intent.putExtra("com.google.android.gms.extras.uri", this.mUri);
            intent.putExtra("com.google.android.gms.extras.resultReceiver", this);
            intent.putExtra("com.google.android.gms.extras.priority", 3);
            ImageManager.this.mContext.sendBroadcast(intent);
        }

        /* renamed from: c */
        public void mo2431c(C0170a aVar) {
            C0564ds.m1395a(!this.f335ok, "Cannot add an ImageRequest when mHandlingRequests is true");
            C0564ds.m1393N("ImageReceiver.addImageRequest() must be called in the main thread");
            this.f334oj.add(aVar);
        }

        /* renamed from: d */
        public void mo2432d(C0170a aVar) {
            C0564ds.m1395a(!this.f335ok, "Cannot remove an ImageRequest when mHandlingRequests is true");
            C0564ds.m1393N("ImageReceiver.removeImageRequest() must be called in the main thread");
            this.f334oj.remove(aVar);
        }

        public void onReceiveResult(int resultCode, Bundle resultData) {
            ImageManager.this.f330of.execute(new C0166c(this.mUri, (ParcelFileDescriptor) resultData.getParcelable("com.google.android.gms.extra.fileDescriptor")));
        }
    }

    public interface OnImageLoadedListener {
        void onImageLoaded(Uri uri, Drawable drawable, boolean z);
    }

    /* renamed from: com.google.android.gms.common.images.ImageManager$a */
    private static final class C0164a {
        /* renamed from: a */
        static int m270a(ActivityManager activityManager) {
            return activityManager.getLargeMemoryClass();
        }
    }

    /* renamed from: com.google.android.gms.common.images.ImageManager$b */
    private static final class C0165b extends C0604ek<C0171a, Bitmap> {
        public C0165b(Context context) {
            super(m271q(context));
        }

        /* renamed from: q */
        private static int m271q(Context context) {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            return (int) (((float) (((!((context.getApplicationInfo().flags & AccessibilityEventCompat.TYPE_TOUCH_INTERACTION_START) != 0) || !C0633fg.m1703cD()) ? activityManager.getMemoryClass() : C0164a.m270a(activityManager)) * AccessibilityEventCompat.TYPE_TOUCH_INTERACTION_START)) * 0.33f);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int sizeOf(C0171a aVar, Bitmap bitmap) {
            return bitmap.getHeight() * bitmap.getRowBytes();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void entryRemoved(boolean z, C0171a aVar, Bitmap bitmap, Bitmap bitmap2) {
            super.entryRemoved(z, aVar, bitmap, bitmap2);
        }
    }

    /* renamed from: com.google.android.gms.common.images.ImageManager$c */
    private final class C0166c implements Runnable {
        private final Uri mUri;

        /* renamed from: om */
        private final ParcelFileDescriptor f338om;

        public C0166c(Uri uri, ParcelFileDescriptor parcelFileDescriptor) {
            this.mUri = uri;
            this.f338om = parcelFileDescriptor;
        }

        public void run() {
            C0564ds.m1394O("LoadBitmapFromDiskRunnable can't be executed in the main thread");
            boolean z = false;
            Bitmap bitmap = null;
            if (this.f338om != null) {
                try {
                    bitmap = BitmapFactory.decodeFileDescriptor(this.f338om.getFileDescriptor());
                } catch (OutOfMemoryError e) {
                    Log.e("ImageManager", "OOM while loading bitmap for uri: " + this.mUri, e);
                    z = true;
                }
                try {
                    this.f338om.close();
                } catch (IOException e2) {
                    Log.e("ImageManager", "closed failed", e2);
                }
            }
            CountDownLatch countDownLatch = new CountDownLatch(1);
            ImageManager.this.mHandler.post(new C0169f(this.mUri, bitmap, z, countDownLatch));
            try {
                countDownLatch.await();
            } catch (InterruptedException e3) {
                Log.w("ImageManager", "Latch interrupted while posting " + this.mUri);
            }
        }
    }

    /* renamed from: com.google.android.gms.common.images.ImageManager$d */
    private final class C0167d implements Runnable {

        /* renamed from: on */
        private final C0170a f340on;

        public C0167d(C0170a aVar) {
            this.f340on = aVar;
        }

        public void run() {
            C0564ds.m1393N("LoadImageRunnable must be executed on the main thread");
            ImageManager.this.m258b(this.f340on);
            C0171a aVar = this.f340on.f349op;
            if (aVar.uri == null) {
                this.f340on.mo2459b(ImageManager.this.mContext, true);
                return;
            }
            Bitmap a = ImageManager.this.m253a(aVar);
            if (a != null) {
                this.f340on.mo2456a(ImageManager.this.mContext, a, true);
                return;
            }
            this.f340on.mo2462r(ImageManager.this.mContext);
            ImageReceiver imageReceiver = (ImageReceiver) ImageManager.this.f333oi.get(aVar.uri);
            if (imageReceiver == null) {
                imageReceiver = new ImageReceiver(aVar.uri);
                ImageManager.this.f333oi.put(aVar.uri, imageReceiver);
            }
            imageReceiver.mo2431c(this.f340on);
            if (this.f340on.f352os != 1) {
                ImageManager.this.f332oh.put(this.f340on, imageReceiver);
            }
            synchronized (ImageManager.f326ob) {
                if (!ImageManager.f327oc.contains(aVar.uri)) {
                    ImageManager.f327oc.add(aVar.uri);
                    imageReceiver.mo2430bB();
                }
            }
        }
    }

    /* renamed from: com.google.android.gms.common.images.ImageManager$e */
    private static final class C0168e implements ComponentCallbacks2 {

        /* renamed from: og */
        private final C0165b f341og;

        public C0168e(C0165b bVar) {
            this.f341og = bVar;
        }

        public void onConfigurationChanged(Configuration newConfig) {
        }

        public void onLowMemory() {
            this.f341og.evictAll();
        }

        public void onTrimMemory(int level) {
            if (level >= 60) {
                this.f341og.evictAll();
            } else if (level >= 20) {
                this.f341og.trimToSize(this.f341og.size() / 2);
            }
        }
    }

    /* renamed from: com.google.android.gms.common.images.ImageManager$f */
    private final class C0169f implements Runnable {
        private final Bitmap mBitmap;
        private final Uri mUri;

        /* renamed from: mX */
        private final CountDownLatch f342mX;

        /* renamed from: oo */
        private boolean f344oo;

        public C0169f(Uri uri, Bitmap bitmap, boolean z, CountDownLatch countDownLatch) {
            this.mUri = uri;
            this.mBitmap = bitmap;
            this.f344oo = z;
            this.f342mX = countDownLatch;
        }

        /* renamed from: a */
        private void m274a(ImageReceiver imageReceiver, boolean z) {
            imageReceiver.f335ok = true;
            ArrayList a = imageReceiver.f334oj;
            int size = a.size();
            for (int i = 0; i < size; i++) {
                C0170a aVar = (C0170a) a.get(i);
                if (z) {
                    aVar.mo2456a(ImageManager.this.mContext, this.mBitmap, false);
                } else {
                    aVar.mo2459b(ImageManager.this.mContext, false);
                }
                if (aVar.f352os != 1) {
                    ImageManager.this.f332oh.remove(aVar);
                }
            }
            imageReceiver.f335ok = false;
        }

        public void run() {
            C0564ds.m1393N("OnBitmapLoadedRunnable must be executed in the main thread");
            boolean z = this.mBitmap != null;
            if (ImageManager.this.f331og != null) {
                if (this.f344oo) {
                    ImageManager.this.f331og.evictAll();
                    System.gc();
                    this.f344oo = false;
                    ImageManager.this.mHandler.post(this);
                    return;
                } else if (z) {
                    ImageManager.this.f331og.put(new C0171a(this.mUri), this.mBitmap);
                }
            }
            ImageReceiver imageReceiver = (ImageReceiver) ImageManager.this.f333oi.remove(this.mUri);
            if (imageReceiver != null) {
                m274a(imageReceiver, z);
            }
            this.f342mX.countDown();
            synchronized (ImageManager.f326ob) {
                ImageManager.f327oc.remove(this.mUri);
            }
        }
    }

    private ImageManager(Context context, boolean withMemoryCache) {
        this.mContext = context.getApplicationContext();
        if (withMemoryCache) {
            this.f331og = new C0165b(this.mContext);
            if (C0633fg.m1706cG()) {
                m260bz();
            }
        } else {
            this.f331og = null;
        }
        this.f332oh = new HashMap();
        this.f333oi = new HashMap();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Bitmap m253a(C0171a aVar) {
        if (this.f331og == null) {
            return null;
        }
        return (Bitmap) this.f331og.get(aVar);
    }

    /* renamed from: a */
    public static ImageManager m254a(Context context, boolean z) {
        if (z) {
            if (f329oe == null) {
                f329oe = new ImageManager(context, true);
            }
            return f329oe;
        }
        if (f328od == null) {
            f328od = new ImageManager(context, false);
        }
        return f328od;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public boolean m258b(C0170a aVar) {
        C0564ds.m1393N("ImageManager.cleanupHashMaps() must be called in the main thread");
        if (aVar.f352os == 1) {
            return true;
        }
        ImageReceiver imageReceiver = (ImageReceiver) this.f332oh.get(aVar);
        if (imageReceiver == null) {
            return true;
        }
        if (imageReceiver.f335ok) {
            return false;
        }
        this.f332oh.remove(aVar);
        imageReceiver.mo2432d(aVar);
        return true;
    }

    /* renamed from: bz */
    private void m260bz() {
        this.mContext.registerComponentCallbacks(new C0168e(this.f331og));
    }

    public static ImageManager create(Context context) {
        return m254a(context, false);
    }

    /* renamed from: a */
    public void mo2424a(C0170a aVar) {
        C0564ds.m1393N("ImageManager.loadImage() must be called in the main thread");
        boolean b = m258b(aVar);
        C0167d dVar = new C0167d(aVar);
        if (b) {
            dVar.run();
        } else {
            this.mHandler.post(dVar);
        }
    }

    public void loadImage(ImageView imageView, int resId) {
        C0170a aVar = new C0170a(resId);
        aVar.mo2457a(imageView);
        mo2424a(aVar);
    }

    public void loadImage(ImageView imageView, Uri uri) {
        C0170a aVar = new C0170a(uri);
        aVar.mo2457a(imageView);
        mo2424a(aVar);
    }

    public void loadImage(ImageView imageView, Uri uri, int defaultResId) {
        C0170a aVar = new C0170a(uri);
        aVar.mo2455F(defaultResId);
        aVar.mo2457a(imageView);
        mo2424a(aVar);
    }

    public void loadImage(OnImageLoadedListener listener, Uri uri) {
        C0170a aVar = new C0170a(uri);
        aVar.mo2458a(listener);
        mo2424a(aVar);
    }

    public void loadImage(OnImageLoadedListener listener, Uri uri, int defaultResId) {
        C0170a aVar = new C0170a(uri);
        aVar.mo2455F(defaultResId);
        aVar.mo2458a(listener);
        mo2424a(aVar);
    }
}
