package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.view.Display;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.fq */
public class C0711fq {

    /* renamed from: te */
    protected C0639fl f1760te;

    /* renamed from: uI */
    protected C0713a f1761uI;

    /* renamed from: com.google.android.gms.internal.fq$a */
    public static final class C0713a {
        public int bottom;
        public int gravity;
        public int left;
        public int right;
        public int top;

        /* renamed from: uJ */
        public IBinder f1762uJ;

        /* renamed from: uK */
        public int f1763uK;

        private C0713a(int i, IBinder iBinder) {
            this.f1763uK = -1;
            this.left = 0;
            this.top = 0;
            this.right = 0;
            this.bottom = 0;
            this.gravity = i;
            this.f1762uJ = iBinder;
        }

        /* renamed from: do */
        public Bundle mo4391do() {
            Bundle bundle = new Bundle();
            bundle.putInt("popupLocationInfo.gravity", this.gravity);
            bundle.putInt("popupLocationInfo.displayId", this.f1763uK);
            bundle.putInt("popupLocationInfo.left", this.left);
            bundle.putInt("popupLocationInfo.top", this.top);
            bundle.putInt("popupLocationInfo.right", this.right);
            bundle.putInt("popupLocationInfo.bottom", this.bottom);
            return bundle;
        }
    }

    /* renamed from: com.google.android.gms.internal.fq$b */
    private static final class C0714b extends C0711fq implements OnAttachStateChangeListener, OnGlobalLayoutListener {

        /* renamed from: tT */
        private boolean f1764tT = false;

        /* renamed from: uL */
        private WeakReference<View> f1765uL;

        protected C0714b(C0639fl flVar, int i) {
            super(flVar, i);
        }

        /* renamed from: f */
        private void m2248f(View view) {
            int i = -1;
            if (C0633fg.m1708cI()) {
                Display display = view.getDisplay();
                if (display != null) {
                    i = display.getDisplayId();
                }
            }
            IBinder windowToken = view.getWindowToken();
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            int width = view.getWidth();
            int height = view.getHeight();
            this.f1761uI.f1763uK = i;
            this.f1761uI.f1762uJ = windowToken;
            this.f1761uI.left = iArr[0];
            this.f1761uI.top = iArr[1];
            this.f1761uI.right = iArr[0] + width;
            this.f1761uI.bottom = iArr[1] + height;
            if (this.f1764tT) {
                mo4386dl();
                this.f1764tT = false;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: aF */
        public void mo4385aF(int i) {
            this.f1761uI = new C0713a(i, null);
        }

        /* renamed from: dl */
        public void mo4386dl() {
            if (this.f1761uI.f1762uJ != null) {
                C0711fq.super.mo4386dl();
            } else {
                this.f1764tT = this.f1765uL != null;
            }
        }

        /* renamed from: e */
        public void mo4389e(View view) {
            this.f1760te.mo4186df();
            if (this.f1765uL != null) {
                View view2 = (View) this.f1765uL.get();
                Context context = this.f1760te.getContext();
                if (view2 == null && (context instanceof Activity)) {
                    view2 = ((Activity) context).getWindow().getDecorView();
                }
                if (view2 != null) {
                    view2.removeOnAttachStateChangeListener(this);
                    ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                    if (C0633fg.m1707cH()) {
                        viewTreeObserver.removeOnGlobalLayoutListener(this);
                    } else {
                        viewTreeObserver.removeGlobalOnLayoutListener(this);
                    }
                }
            }
            this.f1765uL = null;
            Context context2 = this.f1760te.getContext();
            if (view == null && (context2 instanceof Activity)) {
                View findViewById = ((Activity) context2).findViewById(16908290);
                if (findViewById == null) {
                    findViewById = ((Activity) context2).getWindow().getDecorView();
                }
                C0704fn.m1919c("PopupManager", "You have not specified a View to use as content view for popups. Falling back to the Activity content view which may not work properly in future versions of the API. Use setViewForPopups() to set your content view.");
                view = findViewById;
            }
            if (view != null) {
                m2248f(view);
                this.f1765uL = new WeakReference<>(view);
                view.addOnAttachStateChangeListener(this);
                view.getViewTreeObserver().addOnGlobalLayoutListener(this);
                return;
            }
            C0704fn.m1920d("PopupManager", "No content view usable to display popups. Popups will not be displayed in response to this client's calls. Use setViewForPopups() to set your content view.");
        }

        public void onGlobalLayout() {
            if (this.f1765uL != null) {
                View view = (View) this.f1765uL.get();
                if (view != null) {
                    m2248f(view);
                }
            }
        }

        public void onViewAttachedToWindow(View v) {
            m2248f(v);
        }

        public void onViewDetachedFromWindow(View v) {
            this.f1760te.mo4186df();
            v.removeOnAttachStateChangeListener(this);
        }
    }

    private C0711fq(C0639fl flVar, int i) {
        this.f1760te = flVar;
        mo4385aF(i);
    }

    /* renamed from: a */
    public static C0711fq m2241a(C0639fl flVar, int i) {
        return C0633fg.m1704cE() ? new C0714b(flVar, i) : new C0711fq(flVar, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: aF */
    public void mo4385aF(int i) {
        this.f1761uI = new C0713a(i, new Binder());
    }

    /* renamed from: dl */
    public void mo4386dl() {
        this.f1760te.mo4160a(this.f1761uI.f1762uJ, this.f1761uI.mo4391do());
    }

    /* renamed from: dm */
    public Bundle mo4387dm() {
        return this.f1761uI.mo4391do();
    }

    /* renamed from: dn */
    public IBinder mo4388dn() {
        return this.f1761uI.f1762uJ;
    }

    /* renamed from: e */
    public void mo4389e(View view) {
    }

    public void setGravity(int gravity) {
        this.f1761uI.gravity = gravity;
    }
}
