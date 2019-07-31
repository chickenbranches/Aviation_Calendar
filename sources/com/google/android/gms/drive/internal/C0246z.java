package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.C0153a.C0157c;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.drive.internal.z */
public class C0246z extends C0182a {

    /* renamed from: jW */
    private final C0157c<Status> f491jW;

    public C0246z(C0157c<Status> cVar) {
        this.f491jW = cVar;
    }

    /* renamed from: m */
    public void mo2598m(Status status) throws RemoteException {
        this.f491jW.mo2048a(status);
    }

    public void onSuccess() throws RemoteException {
        this.f491jW.mo2048a(Status.f283nA);
    }
}
