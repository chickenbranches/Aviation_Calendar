package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks;
import com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener;
import com.google.android.gms.internal.C0476cd.C0477a;
import com.google.android.gms.internal.C0569dw.C0574e;

/* renamed from: com.google.android.gms.internal.by */
public class C0469by extends C0569dw<C0476cd> {

    /* renamed from: hp */
    private final int f1237hp;

    public C0469by(Context context, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener, int i) {
        super(context, connectionCallbacks, onConnectionFailedListener, new String[0]);
        this.f1237hp = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2638a(C0590ec ecVar, C0574e eVar) throws RemoteException {
        ecVar.mo3959g(eVar, this.f1237hp, getContext().getPackageName(), new Bundle());
    }

    /* access modifiers changed from: protected */
    /* renamed from: am */
    public String mo2639am() {
        return "com.google.android.gms.ads.service.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: an */
    public String mo2640an() {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    /* renamed from: ao */
    public C0476cd mo3632ao() {
        return (C0476cd) super.mo3890bQ();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public C0476cd mo2643p(IBinder iBinder) {
        return C0477a.m1061q(iBinder);
    }
}
