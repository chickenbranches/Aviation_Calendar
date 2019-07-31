package com.google.android.gms.internal;

import com.google.android.gms.internal.C0834hd.C0835a;
import com.google.android.gms.internal.C0834hd.C0835a.C0836a;
import java.util.concurrent.BlockingQueue;

/* renamed from: com.google.android.gms.internal.hh */
public class C0840hh {

    /* renamed from: Bj */
    private static int f2113Bj = 10000;

    /* renamed from: Bk */
    private static int f2114Bk = 1000;

    /* renamed from: Be */
    private final int f2115Be;

    /* renamed from: Bl */
    private final String f2116Bl;

    /* renamed from: Bm */
    private final BlockingQueue<C0835a> f2117Bm;

    /* renamed from: a */
    public void mo4659a(C0836a aVar) {
        aVar.mo4643as(this.f2116Bl);
        aVar.mo4644bd(this.f2115Be);
        this.f2117Bm.offer(aVar.mo4645ek());
    }
}
