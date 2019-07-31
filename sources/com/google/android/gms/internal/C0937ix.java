package com.google.android.gms.internal;

import android.support.p000v4.media.TransportMediator;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/* renamed from: com.google.android.gms.internal.ix */
public final class C0937ix {

    /* renamed from: Hw */
    private final int f2368Hw;
    private final byte[] buffer;
    private int position;

    /* renamed from: com.google.android.gms.internal.ix$a */
    public static class C0938a extends IOException {
        C0938a(int i, int i2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space (pos " + i + " limit " + i2 + ").");
        }
    }

    private C0937ix(byte[] bArr, int i, int i2) {
        this.buffer = bArr;
        this.position = i;
        this.f2368Hw = i + i2;
    }

    /* renamed from: aD */
    public static int m2886aD(String str) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            return bytes.length + m2890bR(bytes.length);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported.");
        }
    }

    /* renamed from: b */
    public static C0937ix m2887b(byte[] bArr, int i, int i2) {
        return new C0937ix(bArr, i, i2);
    }

    /* renamed from: bN */
    public static int m2888bN(int i) {
        if (i >= 0) {
            return m2890bR(i);
        }
        return 10;
    }

    /* renamed from: bP */
    public static int m2889bP(int i) {
        return m2890bR(C0943jb.m2939g(i, 0));
    }

    /* renamed from: bR */
    public static int m2890bR(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (-268435456 & i) == 0 ? 4 : 5;
    }

    /* renamed from: d */
    public static int m2891d(int i, long j) {
        return m2889bP(i) + m2895q(j);
    }

    /* renamed from: e */
    public static int m2892e(int i, int i2) {
        return m2889bP(i) + m2888bN(i2);
    }

    /* renamed from: e */
    public static int m2893e(int i, String str) {
        return m2889bP(i) + m2886aD(str);
    }

    /* renamed from: i */
    public static C0937ix m2894i(byte[] bArr) {
        return m2887b(bArr, 0, bArr.length);
    }

    /* renamed from: q */
    public static int m2895q(long j) {
        return m2896s(m2897t(j));
    }

    /* renamed from: s */
    public static int m2896s(long j) {
        if ((-128 & j) == 0) {
            return 1;
        }
        if ((-16384 & j) == 0) {
            return 2;
        }
        if ((-2097152 & j) == 0) {
            return 3;
        }
        if ((-268435456 & j) == 0) {
            return 4;
        }
        if ((-34359738368L & j) == 0) {
            return 5;
        }
        if ((-4398046511104L & j) == 0) {
            return 6;
        }
        if ((-562949953421312L & j) == 0) {
            return 7;
        }
        if ((-72057594037927936L & j) == 0) {
            return 8;
        }
        return (Long.MIN_VALUE & j) == 0 ? 9 : 10;
    }

    /* renamed from: t */
    public static long m2897t(long j) {
        return (j << 1) ^ (j >> 63);
    }

    /* renamed from: aC */
    public void mo5225aC(String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        mo5231bQ(bytes.length);
        mo5238j(bytes);
    }

    /* renamed from: b */
    public void mo5226b(byte b) throws IOException {
        if (this.position == this.f2368Hw) {
            throw new C0938a(this.position, this.f2368Hw);
        }
        byte[] bArr = this.buffer;
        int i = this.position;
        this.position = i + 1;
        bArr[i] = b;
    }

    /* renamed from: b */
    public void mo5227b(int i, long j) throws IOException {
        mo5235f(i, 0);
        mo5239o(j);
    }

    /* renamed from: b */
    public void mo5228b(int i, String str) throws IOException {
        mo5235f(i, 2);
        mo5225aC(str);
    }

    /* renamed from: bM */
    public void mo5229bM(int i) throws IOException {
        if (i >= 0) {
            mo5231bQ(i);
        } else {
            mo5241r((long) i);
        }
    }

    /* renamed from: bO */
    public void mo5230bO(int i) throws IOException {
        mo5226b((byte) i);
    }

    /* renamed from: bQ */
    public void mo5231bQ(int i) throws IOException {
        while ((i & -128) != 0) {
            mo5230bO((i & TransportMediator.KEYCODE_MEDIA_PAUSE) | 128);
            i >>>= 7;
        }
        mo5230bO(i);
    }

    /* renamed from: c */
    public void mo5232c(int i, long j) throws IOException {
        mo5235f(i, 0);
        mo5240p(j);
    }

    /* renamed from: c */
    public void mo5233c(byte[] bArr, int i, int i2) throws IOException {
        if (this.f2368Hw - this.position >= i2) {
            System.arraycopy(bArr, i, this.buffer, this.position, i2);
            this.position += i2;
            return;
        }
        throw new C0938a(this.position, this.f2368Hw);
    }

    /* renamed from: d */
    public void mo5234d(int i, int i2) throws IOException {
        mo5235f(i, 0);
        mo5229bM(i2);
    }

    /* renamed from: f */
    public void mo5235f(int i, int i2) throws IOException {
        mo5231bQ(C0943jb.m2939g(i, i2));
    }

    /* renamed from: ge */
    public int mo5236ge() {
        return this.f2368Hw - this.position;
    }

    /* renamed from: gf */
    public void mo5237gf() {
        if (mo5236ge() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* renamed from: j */
    public void mo5238j(byte[] bArr) throws IOException {
        mo5233c(bArr, 0, bArr.length);
    }

    /* renamed from: o */
    public void mo5239o(long j) throws IOException {
        mo5241r(j);
    }

    /* renamed from: p */
    public void mo5240p(long j) throws IOException {
        mo5241r(m2897t(j));
    }

    /* renamed from: r */
    public void mo5241r(long j) throws IOException {
        while ((-128 & j) != 0) {
            mo5230bO((((int) j) & TransportMediator.KEYCODE_MEDIA_PAUSE) | 128);
            j >>>= 7;
        }
        mo5230bO((int) j);
    }
}
