package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.common.images.ImageManager.OnImageLoadedListener;
import com.google.android.gms.internal.C0558dq;
import com.google.android.gms.internal.C0563dr;
import com.google.android.gms.internal.C0564ds;
import com.google.android.gms.internal.C0596ee;
import com.google.android.gms.internal.C0633fg;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.images.a */
public final class C0170a {

    /* renamed from: op */
    final C0171a f349op;

    /* renamed from: oq */
    private int f350oq;

    /* renamed from: or */
    private int f351or;

    /* renamed from: os */
    int f352os;

    /* renamed from: ot */
    private int f353ot;

    /* renamed from: ou */
    private WeakReference<OnImageLoadedListener> f354ou;

    /* renamed from: ov */
    private WeakReference<ImageView> f355ov;

    /* renamed from: ow */
    private WeakReference<TextView> f356ow;

    /* renamed from: ox */
    private int f357ox;

    /* renamed from: oy */
    private boolean f358oy;

    /* renamed from: oz */
    private boolean f359oz;

    /* renamed from: com.google.android.gms.common.images.a$a */
    public static final class C0171a {
        public final Uri uri;

        public C0171a(Uri uri2) {
            this.uri = uri2;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C0171a)) {
                return false;
            }
            return this == obj || ((C0171a) obj).hashCode() == hashCode();
        }

        public int hashCode() {
            return C0596ee.hashCode(this.uri);
        }
    }

    public C0170a(int i) {
        this.f350oq = 0;
        this.f351or = 0;
        this.f357ox = -1;
        this.f358oy = true;
        this.f359oz = false;
        this.f349op = new C0171a(null);
        this.f351or = i;
    }

    public C0170a(Uri uri) {
        this.f350oq = 0;
        this.f351or = 0;
        this.f357ox = -1;
        this.f358oy = true;
        this.f359oz = false;
        this.f349op = new C0171a(uri);
        this.f351or = 0;
    }

    /* renamed from: a */
    private C0558dq m277a(Drawable drawable, Drawable drawable2) {
        if (drawable == null) {
            drawable = null;
        } else if (drawable instanceof C0558dq) {
            drawable = ((C0558dq) drawable).mo3840bC();
        }
        return new C0558dq(drawable, drawable2);
    }

    /* renamed from: a */
    private void m278a(Drawable drawable, boolean z, boolean z2, boolean z3) {
        switch (this.f352os) {
            case 1:
                if (!z2) {
                    OnImageLoadedListener onImageLoadedListener = (OnImageLoadedListener) this.f354ou.get();
                    if (onImageLoadedListener != null) {
                        onImageLoadedListener.onImageLoaded(this.f349op.uri, drawable, z3);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ImageView imageView = (ImageView) this.f355ov.get();
                if (imageView != null) {
                    m279a(imageView, drawable, z, z2, z3);
                    return;
                }
                return;
            case 3:
                TextView textView = (TextView) this.f356ow.get();
                if (textView != null) {
                    m280a(textView, this.f357ox, drawable, z, z2);
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    private void m279a(ImageView imageView, Drawable drawable, boolean z, boolean z2, boolean z3) {
        boolean z4 = !z2 && !z3;
        if (z4 && (imageView instanceof C0563dr)) {
            int bE = ((C0563dr) imageView).mo3866bE();
            if (this.f351or != 0 && bE == this.f351or) {
                return;
            }
        }
        boolean a = m281a(z, z2);
        Drawable drawable2 = a ? m277a(imageView.getDrawable(), drawable) : drawable;
        imageView.setImageDrawable(drawable2);
        if (imageView instanceof C0563dr) {
            C0563dr drVar = (C0563dr) imageView;
            drVar.mo3867d(z3 ? this.f349op.uri : null);
            drVar.mo3865H(z4 ? this.f351or : 0);
        }
        if (a) {
            ((C0558dq) drawable2).startTransition(250);
        }
    }

    /* renamed from: a */
    private void m280a(TextView textView, int i, Drawable drawable, boolean z, boolean z2) {
        boolean a = m281a(z, z2);
        Drawable[] compoundDrawables = C0633fg.m1708cI() ? textView.getCompoundDrawablesRelative() : textView.getCompoundDrawables();
        Drawable drawable2 = a ? m277a(compoundDrawables[i], drawable) : drawable;
        Drawable drawable3 = i == 0 ? drawable2 : compoundDrawables[0];
        Drawable drawable4 = i == 1 ? drawable2 : compoundDrawables[1];
        Drawable drawable5 = i == 2 ? drawable2 : compoundDrawables[2];
        Drawable drawable6 = i == 3 ? drawable2 : compoundDrawables[3];
        if (C0633fg.m1708cI()) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable3, drawable4, drawable5, drawable6);
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds(drawable3, drawable4, drawable5, drawable6);
        }
        if (a) {
            ((C0558dq) drawable2).startTransition(250);
        }
    }

    /* renamed from: a */
    private boolean m281a(boolean z, boolean z2) {
        return this.f358oy && !z2 && (!z || this.f359oz);
    }

    /* renamed from: F */
    public void mo2455F(int i) {
        this.f351or = i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2456a(Context context, Bitmap bitmap, boolean z) {
        C0564ds.m1396d(bitmap);
        m278a(new BitmapDrawable(context.getResources(), bitmap), z, false, true);
    }

    /* renamed from: a */
    public void mo2457a(ImageView imageView) {
        C0564ds.m1396d(imageView);
        this.f354ou = null;
        this.f355ov = new WeakReference<>(imageView);
        this.f356ow = null;
        this.f357ox = -1;
        this.f352os = 2;
        this.f353ot = imageView.hashCode();
    }

    /* renamed from: a */
    public void mo2458a(OnImageLoadedListener onImageLoadedListener) {
        C0564ds.m1396d(onImageLoadedListener);
        this.f354ou = new WeakReference<>(onImageLoadedListener);
        this.f355ov = null;
        this.f356ow = null;
        this.f357ox = -1;
        this.f352os = 1;
        this.f353ot = C0596ee.hashCode(onImageLoadedListener, this.f349op);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo2459b(Context context, boolean z) {
        Drawable drawable = null;
        if (this.f351or != 0) {
            drawable = context.getResources().getDrawable(this.f351or);
        }
        m278a(drawable, z, false, false);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0170a)) {
            return false;
        }
        return this == obj || ((C0170a) obj).hashCode() == hashCode();
    }

    public int hashCode() {
        return this.f353ot;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public void mo2462r(Context context) {
        Drawable drawable = null;
        if (this.f350oq != 0) {
            drawable = context.getResources().getDrawable(this.f350oq);
        }
        m278a(drawable, false, true, false);
    }
}
