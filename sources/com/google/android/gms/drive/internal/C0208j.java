package com.google.android.gms.drive.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.internal.C0231o.C0232a;
import com.google.android.gms.internal.C0565dt;
import com.google.android.gms.internal.C0569dw;
import com.google.android.gms.internal.C0569dw.C0574e;
import com.google.android.gms.internal.C0590ec;
import com.google.android.gms.internal.C0600eg;

/* renamed from: com.google.android.gms.drive.internal.j */
public class C0208j extends C0569dw<C0231o> {

    /* renamed from: jG */
    private final String f452jG;

    /* renamed from: rg */
    private DriveId f453rg;

    public C0208j(Context context, C0565dt dtVar, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener, String[] strArr) {
        super(context, connectionCallbacks, onConnectionFailedListener, strArr);
        this.f452jG = (String) C0600eg.m1552b(dtVar.mo3869bF(), (Object) "Must call Api.ClientBuilder.setAccountName()");
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public C0231o mo2643p(IBinder iBinder) {
        return C0232a.m484C(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2637a(int i, IBinder iBinder, Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(getClass().getClassLoader());
            this.f453rg = (DriveId) bundle.getParcelable("com.google.android.gms.drive.root_id");
        }
        super.mo2637a(i, iBinder, bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2638a(C0590ec ecVar, C0574e eVar) throws RemoteException {
        String packageName = getContext().getPackageName();
        C0600eg.m1554f(eVar);
        C0600eg.m1554f(packageName);
        C0600eg.m1554f(mo3888bO());
        ecVar.mo3952a(eVar, GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE, packageName, mo3888bO(), this.f452jG, new Bundle());
    }

    /* access modifiers changed from: protected */
    /* renamed from: am */
    public String mo2639am() {
        return "com.google.android.gms.drive.ApiService.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: an */
    public String mo2640an() {
        return "com.google.android.gms.drive.internal.IDriveService";
    }

    /* renamed from: cN */
    public C0231o mo2641cN() {
        return (C0231o) mo3890bQ();
    }

    /* renamed from: cO */
    public DriveId mo2642cO() {
        return this.f453rg;
    }
}
