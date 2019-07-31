package com.google.android.gms.internal;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.iw */
public final class C0936iw {

    /* renamed from: Hp */
    private int f2361Hp;

    /* renamed from: Hq */
    private int f2362Hq;

    /* renamed from: Hr */
    private int f2363Hr;

    /* renamed from: Hs */
    private int f2364Hs;

    /* renamed from: Ht */
    private int f2365Ht = Integer.MAX_VALUE;

    /* renamed from: Hu */
    private int f2366Hu = 64;

    /* renamed from: Hv */
    private int f2367Hv = 67108864;
    private final byte[] buffer;

    private C0936iw(byte[] bArr, int i, int i2) {
        this.buffer = bArr;
        this.f2361Hp = i;
        this.f2362Hq = i + i2;
        this.f2363Hr = i;
    }

    /* renamed from: a */
    public static C0936iw m2870a(byte[] bArr, int i, int i2) {
        return new C0936iw(bArr, i, i2);
    }

    /* renamed from: n */
    public static long m2871n(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    /* renamed from: bI */
    public void mo5210bI(int i) throws C0939iy {
        if (this.f2364Hs != i) {
            throw C0939iy.m2919gk();
        }
    }

    /* renamed from: bJ */
    public boolean mo5211bJ(int i) throws IOException {
        switch (C0943jb.m2937bS(i)) {
            case 0:
                mo5216fW();
                return true;
            case 1:
                mo5221gb();
                return true;
            case 2:
                mo5213bL(mo5218fY());
                return true;
            case 3:
                mo5215fV();
                mo5210bI(C0943jb.m2939g(C0943jb.m2938bT(i), 4));
                return true;
            case 4:
                return false;
            case 5:
                mo5220ga();
                return true;
            default:
                throw C0939iy.m2920gl();
        }
    }

    /* renamed from: bK */
    public byte[] mo5212bK(int i) throws IOException {
        if (i < 0) {
            throw C0939iy.m2916gh();
        } else if (this.f2363Hr + i > this.f2365Ht) {
            mo5213bL(this.f2365Ht - this.f2363Hr);
            throw C0939iy.m2915gg();
        } else if (i <= this.f2362Hq - this.f2363Hr) {
            byte[] bArr = new byte[i];
            System.arraycopy(this.buffer, this.f2363Hr, bArr, 0, i);
            this.f2363Hr += i;
            return bArr;
        } else {
            throw C0939iy.m2915gg();
        }
    }

    /* renamed from: bL */
    public void mo5213bL(int i) throws IOException {
        if (i < 0) {
            throw C0939iy.m2916gh();
        } else if (this.f2363Hr + i > this.f2365Ht) {
            mo5213bL(this.f2365Ht - this.f2363Hr);
            throw C0939iy.m2915gg();
        } else if (i <= this.f2362Hq - this.f2363Hr) {
            this.f2363Hr += i;
        } else {
            throw C0939iy.m2915gg();
        }
    }

    /* renamed from: fU */
    public int mo5214fU() throws IOException {
        if (mo5222gc()) {
            this.f2364Hs = 0;
            return 0;
        }
        this.f2364Hs = mo5218fY();
        if (this.f2364Hs != 0) {
            return this.f2364Hs;
        }
        throw C0939iy.m2918gj();
    }

    /* renamed from: fV */
    public void mo5215fV() throws IOException {
        int fU;
        do {
            fU = mo5214fU();
            if (fU == 0) {
                return;
            }
        } while (mo5211bJ(fU));
    }

    /* renamed from: fW */
    public int mo5216fW() throws IOException {
        return mo5218fY();
    }

    /* renamed from: fX */
    public long mo5217fX() throws IOException {
        return m2871n(mo5219fZ());
    }

    /* renamed from: fY */
    public int mo5218fY() throws IOException {
        byte gd = mo5223gd();
        if (gd >= 0) {
            return gd;
        }
        byte b = gd & Byte.MAX_VALUE;
        byte gd2 = mo5223gd();
        if (gd2 >= 0) {
            return b | (gd2 << 7);
        }
        byte b2 = b | ((gd2 & Byte.MAX_VALUE) << 7);
        byte gd3 = mo5223gd();
        if (gd3 >= 0) {
            return b2 | (gd3 << 14);
        }
        byte b3 = b2 | ((gd3 & Byte.MAX_VALUE) << 14);
        byte gd4 = mo5223gd();
        if (gd4 >= 0) {
            return b3 | (gd4 << 21);
        }
        byte b4 = b3 | ((gd4 & Byte.MAX_VALUE) << 21);
        byte gd5 = mo5223gd();
        byte b5 = b4 | (gd5 << 28);
        if (gd5 >= 0) {
            return b5;
        }
        for (int i = 0; i < 5; i++) {
            if (mo5223gd() >= 0) {
                return b5;
            }
        }
        throw C0939iy.m2917gi();
    }

    /* renamed from: fZ */
    public long mo5219fZ() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte gd = mo5223gd();
            j |= ((long) (gd & Byte.MAX_VALUE)) << i;
            if ((gd & 128) == 0) {
                return j;
            }
        }
        throw C0939iy.m2917gi();
    }

    /* renamed from: ga */
    public int mo5220ga() throws IOException {
        return (mo5223gd() & 255) | ((mo5223gd() & 255) << 8) | ((mo5223gd() & 255) << 16) | ((mo5223gd() & 255) << 24);
    }

    /* renamed from: gb */
    public long mo5221gb() throws IOException {
        byte gd = mo5223gd();
        byte gd2 = mo5223gd();
        return ((((long) gd2) & 255) << 8) | (((long) gd) & 255) | ((((long) mo5223gd()) & 255) << 16) | ((((long) mo5223gd()) & 255) << 24) | ((((long) mo5223gd()) & 255) << 32) | ((((long) mo5223gd()) & 255) << 40) | ((((long) mo5223gd()) & 255) << 48) | ((((long) mo5223gd()) & 255) << 56);
    }

    /* renamed from: gc */
    public boolean mo5222gc() {
        return this.f2363Hr == this.f2362Hq;
    }

    /* renamed from: gd */
    public byte mo5223gd() throws IOException {
        if (this.f2363Hr == this.f2362Hq) {
            throw C0939iy.m2915gg();
        }
        byte[] bArr = this.buffer;
        int i = this.f2363Hr;
        this.f2363Hr = i + 1;
        return bArr[i];
    }

    public String readString() throws IOException {
        int fY = mo5218fY();
        if (fY > this.f2362Hq - this.f2363Hr || fY <= 0) {
            return new String(mo5212bK(fY), "UTF-8");
        }
        String str = new String(this.buffer, this.f2363Hr, fY, "UTF-8");
        this.f2363Hr = fY + this.f2363Hr;
        return str;
    }
}
