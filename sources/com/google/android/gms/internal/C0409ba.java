package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.ads.mediation.MediationAdapter;
import com.google.ads.mediation.MediationServerParameters;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.internal.C0410bb.C0411a;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ba */
public final class C0409ba extends C0411a {

    /* renamed from: gf */
    private Map<Class<? extends NetworkExtras>, NetworkExtras> f1145gf;

    /* renamed from: m */
    private <NETWORK_EXTRAS extends com.google.ads.mediation.NetworkExtras, SERVER_PARAMETERS extends MediationServerParameters> C0413bc m939m(String str) throws RemoteException {
        try {
            Class cls = Class.forName(str, false, C0409ba.class.getClassLoader());
            if (!MediationAdapter.class.isAssignableFrom(cls)) {
                C0502ct.m1156v("Could not instantiate mediation adapter: " + str + ".");
                throw new RemoteException();
            }
            MediationAdapter mediationAdapter = (MediationAdapter) cls.newInstance();
            return new C0419be(mediationAdapter, (com.google.ads.mediation.NetworkExtras) this.f1145gf.get(mediationAdapter.getAdditionalParametersType()));
        } catch (Throwable th) {
            C0502ct.m1156v("Could not instantiate mediation adapter: " + str + ". " + th.getMessage());
            throw new RemoteException();
        }
    }

    /* renamed from: c */
    public void mo3530c(Map<Class<? extends NetworkExtras>, NetworkExtras> map) {
        this.f1145gf = map;
    }

    /* renamed from: l */
    public C0413bc mo3531l(String str) throws RemoteException {
        return m939m(str);
    }
}
