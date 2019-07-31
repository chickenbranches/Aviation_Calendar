package com.google.android.gms.internal;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.iz */
public abstract class C0940iz {

    /* renamed from: rw */
    protected int f2369rw = -1;

    /* renamed from: a */
    public static final <T extends C0940iz> T m2921a(T t, byte[] bArr) throws C0939iy {
        return m2924b(t, bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public static final void m2922a(C0940iz izVar, byte[] bArr, int i, int i2) {
        try {
            C0937ix b = C0937ix.m2887b(bArr, i, i2);
            izVar.mo2677a(b);
            b.mo5237gf();
        } catch (IOException e) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    /* renamed from: a */
    public static final byte[] m2923a(C0940iz izVar) {
        byte[] bArr = new byte[izVar.mo2679cP()];
        m2922a(izVar, bArr, 0, bArr.length);
        return bArr;
    }

    /* renamed from: b */
    public static final <T extends C0940iz> T m2924b(T t, byte[] bArr, int i, int i2) throws C0939iy {
        try {
            C0936iw a = C0936iw.m2870a(bArr, i, i2);
            t.mo2678b(a);
            a.mo5210bI(0);
            return t;
        } catch (C0939iy e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
        }
    }

    /* renamed from: a */
    public abstract void mo2677a(C0937ix ixVar) throws IOException;

    /* renamed from: b */
    public abstract C0940iz mo2678b(C0936iw iwVar) throws IOException;

    /* renamed from: cP */
    public int mo2679cP() {
        this.f2369rw = 0;
        return 0;
    }

    public String toString() {
        return C0942ja.m2935b(this);
    }
}
