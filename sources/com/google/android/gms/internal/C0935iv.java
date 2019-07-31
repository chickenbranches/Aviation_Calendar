package com.google.android.gms.internal;

import android.support.p000v4.view.MotionEventCompat;

/* renamed from: com.google.android.gms.internal.iv */
public class C0935iv {

    /* renamed from: Hm */
    private final byte[] f2358Hm = new byte[256];

    /* renamed from: Hn */
    private int f2359Hn;

    /* renamed from: Ho */
    private int f2360Ho;

    public C0935iv(byte[] bArr) {
        for (int i = 0; i < 256; i++) {
            this.f2358Hm[i] = (byte) i;
        }
        byte b = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            b = (b + this.f2358Hm[i2] + bArr[i2 % bArr.length]) & 255;
            byte b2 = this.f2358Hm[i2];
            this.f2358Hm[i2] = this.f2358Hm[b];
            this.f2358Hm[b] = b2;
        }
        this.f2359Hn = 0;
        this.f2360Ho = 0;
    }

    /* renamed from: h */
    public void mo5209h(byte[] bArr) {
        int i = this.f2359Hn;
        int i2 = this.f2360Ho;
        for (int i3 = 0; i3 < bArr.length; i3++) {
            i = (i + 1) & MotionEventCompat.ACTION_MASK;
            i2 = (i2 + this.f2358Hm[i]) & MotionEventCompat.ACTION_MASK;
            byte b = this.f2358Hm[i];
            this.f2358Hm[i] = this.f2358Hm[i2];
            this.f2358Hm[i2] = b;
            bArr[i3] = (byte) (bArr[i3] ^ this.f2358Hm[(this.f2358Hm[i] + this.f2358Hm[i2]) & MotionEventCompat.ACTION_MASK]);
        }
        this.f2359Hn = i;
        this.f2360Ho = i2;
    }
}
