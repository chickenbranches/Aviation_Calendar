package com.google.android.gms.internal;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.df */
public abstract class C0537df {

    /* renamed from: lx */
    protected final C0550dk f1405lx;

    /* renamed from: ly */
    private final String f1406ly;

    /* renamed from: lz */
    private C0554dm f1407lz;

    protected C0537df(String str, String str2) {
        this.f1406ly = str;
        this.f1405lx = new C0550dk(str2);
    }

    /* renamed from: B */
    public void mo3763B(String str) {
    }

    /* renamed from: a */
    public void mo3764a(long j, int i) {
    }

    /* renamed from: a */
    public final void mo3765a(C0554dm dmVar) {
        this.f1407lz = dmVar;
        if (this.f1407lz == null) {
            mo3768aT();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo3766a(String str, long j, String str2) throws IOException {
        this.f1405lx.mo3815a("Sending text message: %s to: %s", str, str2);
        this.f1407lz.mo2261a(this.f1406ly, str, j, str2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: aS */
    public final long mo3767aS() {
        return this.f1407lz.mo2262aR();
    }

    /* renamed from: aT */
    public void mo3768aT() {
    }

    public final String getNamespace() {
        return this.f1406ly;
    }
}
