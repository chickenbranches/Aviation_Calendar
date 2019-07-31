package com.google.android.gms.internal;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/* renamed from: com.google.android.gms.internal.e */
public abstract class C0585e implements C0519d {

    /* renamed from: du */
    protected MotionEvent f1549du;

    /* renamed from: dv */
    protected DisplayMetrics f1550dv;

    /* renamed from: dw */
    protected C0941j f1551dw;

    /* renamed from: dx */
    private C0944k f1552dx;

    protected C0585e(Context context, C0941j jVar, C0944k kVar) {
        this.f1551dw = jVar;
        this.f1552dx = kVar;
        try {
            this.f1550dv = context.getResources().getDisplayMetrics();
        } catch (UnsupportedOperationException e) {
            this.f1550dv = new DisplayMetrics();
            this.f1550dv.density = 1.0f;
        }
    }

    /* renamed from: a */
    private String m1476a(Context context, String str, boolean z) {
        byte[] c;
        try {
            synchronized (this) {
                m1477b();
                if (z) {
                    mo3937c(context);
                } else {
                    mo3936b(context);
                }
                c = m1478c();
            }
            return c.length == 0 ? Integer.toString(5) : mo3932a(c, str);
        } catch (NoSuchAlgorithmException e) {
            return Integer.toString(7);
        } catch (UnsupportedEncodingException e2) {
            return Integer.toString(7);
        } catch (IOException e3) {
            return Integer.toString(3);
        }
    }

    /* renamed from: b */
    private void m1477b() {
        this.f1552dx.reset();
    }

    /* renamed from: c */
    private byte[] m1478c() throws IOException {
        return this.f1552dx.mo5245h();
    }

    /* renamed from: a */
    public String mo3722a(Context context) {
        return m1476a(context, (String) null, false);
    }

    /* renamed from: a */
    public String mo3723a(Context context, String str) {
        return m1476a(context, str, true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo3932a(byte[] bArr, String str) throws NoSuchAlgorithmException, UnsupportedEncodingException, IOException {
        byte[] array;
        if (bArr.length > 239) {
            m1477b();
            mo3933a(20, 1);
            bArr = m1478c();
        }
        if (bArr.length < 239) {
            byte[] bArr2 = new byte[(239 - bArr.length)];
            new SecureRandom().nextBytes(bArr2);
            array = ByteBuffer.allocate(240).put((byte) bArr.length).put(bArr).put(bArr2).array();
        } else {
            array = ByteBuffer.allocate(240).put((byte) bArr.length).put(bArr).array();
        }
        MessageDigest instance = MessageDigest.getInstance("MD5");
        instance.update(array);
        byte[] array2 = ByteBuffer.allocate(256).put(instance.digest()).put(array).array();
        byte[] bArr3 = new byte[256];
        new C0394b().mo3528a(array2, bArr3);
        if (str != null && str.length() > 0) {
            mo3935a(str, bArr3);
        }
        return this.f1551dw.mo3419a(bArr3, true);
    }

    /* renamed from: a */
    public void mo3724a(int i, int i2, int i3) {
        if (this.f1549du != null) {
            this.f1549du.recycle();
        }
        this.f1549du = MotionEvent.obtain(0, (long) i3, 1, ((float) i) * this.f1550dv.density, ((float) i2) * this.f1550dv.density, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3933a(int i, long j) throws IOException {
        this.f1552dx.mo5243b(i, j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3934a(int i, String str) throws IOException {
        this.f1552dx.mo5244b(i, str);
    }

    /* renamed from: a */
    public void mo3725a(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (this.f1549du != null) {
                this.f1549du.recycle();
            }
            this.f1549du = MotionEvent.obtain(motionEvent);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3935a(String str, byte[] bArr) throws UnsupportedEncodingException {
        if (str.length() > 32) {
            str = str.substring(0, 32);
        }
        new C0935iv(str.getBytes("UTF-8")).mo5209h(bArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo3936b(Context context);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo3937c(Context context);
}
