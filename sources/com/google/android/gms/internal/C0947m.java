package com.google.android.gms.internal;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.m */
class C0947m implements C0944k {

    /* renamed from: dR */
    private C0937ix f2385dR;

    /* renamed from: dS */
    private byte[] f2386dS;

    /* renamed from: dT */
    private final int f2387dT;

    public C0947m(int i) {
        this.f2387dT = i;
        reset();
    }

    /* renamed from: b */
    public void mo5243b(int i, long j) throws IOException {
        this.f2385dR.mo5227b(i, j);
    }

    /* renamed from: b */
    public void mo5244b(int i, String str) throws IOException {
        this.f2385dR.mo5228b(i, str);
    }

    /* renamed from: h */
    public byte[] mo5245h() throws IOException {
        int ge = this.f2385dR.mo5236ge();
        if (ge < 0) {
            throw new IOException();
        } else if (ge == 0) {
            return this.f2386dS;
        } else {
            byte[] bArr = new byte[(this.f2386dS.length - ge)];
            System.arraycopy(this.f2386dS, 0, bArr, 0, bArr.length);
            return bArr;
        }
    }

    public void reset() {
        this.f2386dS = new byte[this.f2387dT];
        this.f2385dR = C0937ix.m2894i(this.f2386dS);
    }
}
