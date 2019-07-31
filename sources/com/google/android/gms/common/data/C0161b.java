package com.google.android.gms.common.data;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.internal.C0596ee;
import com.google.android.gms.internal.C0600eg;

/* renamed from: com.google.android.gms.common.data.b */
public abstract class C0161b {

    /* renamed from: nE */
    protected final DataHolder f319nE;

    /* renamed from: nG */
    protected final int f320nG;

    /* renamed from: nH */
    private final int f321nH;

    public C0161b(DataHolder dataHolder, int i) {
        this.f319nE = (DataHolder) C0600eg.m1554f(dataHolder);
        C0600eg.m1555p(i >= 0 && i < dataHolder.getCount());
        this.f320nG = i;
        this.f321nH = dataHolder.mo2371C(this.f320nG);
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public Uri mo2410L(String str) {
        return this.f319nE.parseUri(str, this.f320nG, this.f321nH);
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public boolean mo2411M(String str) {
        return this.f319nE.hasNull(str, this.f320nG, this.f321nH);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2412a(String str, CharArrayBuffer charArrayBuffer) {
        this.f319nE.copyToBuffer(str, this.f320nG, this.f321nH, charArrayBuffer);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0161b)) {
            return false;
        }
        C0161b bVar = (C0161b) obj;
        return C0596ee.equal(Integer.valueOf(bVar.f320nG), Integer.valueOf(this.f320nG)) && C0596ee.equal(Integer.valueOf(bVar.f321nH), Integer.valueOf(this.f321nH)) && bVar.f319nE == this.f319nE;
    }

    /* access modifiers changed from: protected */
    public boolean getBoolean(String column) {
        return this.f319nE.getBoolean(column, this.f320nG, this.f321nH);
    }

    /* access modifiers changed from: protected */
    public byte[] getByteArray(String column) {
        return this.f319nE.getByteArray(column, this.f320nG, this.f321nH);
    }

    /* access modifiers changed from: protected */
    public int getInteger(String column) {
        return this.f319nE.getInteger(column, this.f320nG, this.f321nH);
    }

    /* access modifiers changed from: protected */
    public long getLong(String column) {
        return this.f319nE.getLong(column, this.f320nG, this.f321nH);
    }

    /* access modifiers changed from: protected */
    public String getString(String column) {
        return this.f319nE.getString(column, this.f320nG, this.f321nH);
    }

    public boolean hasColumn(String column) {
        return this.f319nE.hasColumn(column);
    }

    public int hashCode() {
        return C0596ee.hashCode(Integer.valueOf(this.f320nG), Integer.valueOf(this.f321nH), this.f319nE);
    }

    public boolean isDataValid() {
        return !this.f319nE.isClosed();
    }
}
