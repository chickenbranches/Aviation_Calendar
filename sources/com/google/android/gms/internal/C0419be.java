package com.google.android.gms.internal;

import android.app.Activity;
import android.os.RemoteException;
import com.google.ads.mediation.MediationAdapter;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationServerParameters;
import com.google.ads.mediation.NetworkExtras;
import com.google.ads.mediation.admob.AdMobServerParameters;
import com.google.android.gms.dynamic.C0270b;
import com.google.android.gms.dynamic.C0273c;
import com.google.android.gms.internal.C0413bc.C0414a;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.be */
public final class C0419be<NETWORK_EXTRAS extends NetworkExtras, SERVER_PARAMETERS extends MediationServerParameters> extends C0414a {

    /* renamed from: gg */
    private final MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> f1149gg;

    /* renamed from: gh */
    private final NETWORK_EXTRAS f1150gh;

    public C0419be(MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> mediationAdapter, NETWORK_EXTRAS network_extras) {
        this.f1149gg = mediationAdapter;
        this.f1150gh = network_extras;
    }

    /* renamed from: a */
    private SERVER_PARAMETERS m957a(String str, int i, String str2) throws RemoteException {
        HashMap hashMap;
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                HashMap hashMap2 = new HashMap(jSONObject.length());
                Iterator keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String str3 = (String) keys.next();
                    hashMap2.put(str3, jSONObject.getString(str3));
                }
                hashMap = hashMap2;
            } catch (Throwable th) {
                C0502ct.m1150b("Could not get MediationServerParameters.", th);
                throw new RemoteException();
            }
        } else {
            hashMap = new HashMap(0);
        }
        Class serverParametersType = this.f1149gg.getServerParametersType();
        SERVER_PARAMETERS server_parameters = null;
        if (serverParametersType != null) {
            SERVER_PARAMETERS server_parameters2 = (MediationServerParameters) serverParametersType.newInstance();
            server_parameters2.load(hashMap);
            server_parameters = server_parameters2;
        }
        if (server_parameters instanceof AdMobServerParameters) {
            AdMobServerParameters adMobServerParameters = (AdMobServerParameters) server_parameters;
            adMobServerParameters.adJson = str2;
            adMobServerParameters.tagForChildDirectedTreatment = i;
        }
        return server_parameters;
    }

    /* renamed from: a */
    public void mo3535a(C0270b bVar, C0962v vVar, String str, C0416bd bdVar) throws RemoteException {
        mo3536a(bVar, vVar, str, (String) null, bdVar);
    }

    /* renamed from: a */
    public void mo3536a(C0270b bVar, C0962v vVar, String str, String str2, C0416bd bdVar) throws RemoteException {
        if (!(this.f1149gg instanceof MediationInterstitialAdapter)) {
            C0502ct.m1156v("MediationAdapter is not a MediationInterstitialAdapter: " + this.f1149gg.getClass().getCanonicalName());
            throw new RemoteException();
        }
        C0502ct.m1152r("Requesting interstitial ad from adapter.");
        try {
            ((MediationInterstitialAdapter) this.f1149gg).requestInterstitialAd(new C0420bf(bdVar), (Activity) C0273c.m633b(bVar), m957a(str, vVar.tagForChildDirectedTreatment, str2), C0432bg.m966e(vVar), this.f1150gh);
        } catch (Throwable th) {
            C0502ct.m1150b("Could not request interstitial ad from adapter.", th);
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public void mo3537a(C0270b bVar, C0964x xVar, C0962v vVar, String str, C0416bd bdVar) throws RemoteException {
        mo3538a(bVar, xVar, vVar, str, null, bdVar);
    }

    /* renamed from: a */
    public void mo3538a(C0270b bVar, C0964x xVar, C0962v vVar, String str, String str2, C0416bd bdVar) throws RemoteException {
        if (!(this.f1149gg instanceof MediationBannerAdapter)) {
            C0502ct.m1156v("MediationAdapter is not a MediationBannerAdapter: " + this.f1149gg.getClass().getCanonicalName());
            throw new RemoteException();
        }
        C0502ct.m1152r("Requesting banner ad from adapter.");
        try {
            ((MediationBannerAdapter) this.f1149gg).requestBannerAd(new C0420bf(bdVar), (Activity) C0273c.m633b(bVar), m957a(str, vVar.tagForChildDirectedTreatment, str2), C0432bg.m965b(xVar), C0432bg.m966e(vVar), this.f1150gh);
        } catch (Throwable th) {
            C0502ct.m1150b("Could not request banner ad from adapter.", th);
            throw new RemoteException();
        }
    }

    public void destroy() throws RemoteException {
        try {
            this.f1149gg.destroy();
        } catch (Throwable th) {
            C0502ct.m1150b("Could not destroy adapter.", th);
            throw new RemoteException();
        }
    }

    public C0270b getView() throws RemoteException {
        if (!(this.f1149gg instanceof MediationBannerAdapter)) {
            C0502ct.m1156v("MediationAdapter is not a MediationBannerAdapter: " + this.f1149gg.getClass().getCanonicalName());
            throw new RemoteException();
        }
        try {
            return C0273c.m634h(((MediationBannerAdapter) this.f1149gg).getBannerView());
        } catch (Throwable th) {
            C0502ct.m1150b("Could not get banner view from adapter.", th);
            throw new RemoteException();
        }
    }

    public void showInterstitial() throws RemoteException {
        if (!(this.f1149gg instanceof MediationInterstitialAdapter)) {
            C0502ct.m1156v("MediationAdapter is not a MediationInterstitialAdapter: " + this.f1149gg.getClass().getCanonicalName());
            throw new RemoteException();
        }
        C0502ct.m1152r("Showing interstitial from adapter.");
        try {
            ((MediationInterstitialAdapter) this.f1149gg).showInterstitial();
        } catch (Throwable th) {
            C0502ct.m1150b("Could not show interstitial from adapter.", th);
            throw new RemoteException();
        }
    }
}
