package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.doubleclick.AppEventListener;

/* renamed from: com.google.android.gms.internal.ah */
public final class C0365ah {

    /* renamed from: eI */
    private AppEventListener f869eI;

    /* renamed from: eK */
    private String f870eK;

    /* renamed from: eW */
    private final C0409ba f871eW = new C0409ba();

    /* renamed from: eX */
    private C0353ac f872eX;

    /* renamed from: ev */
    private AdListener f873ev;
    private final Context mContext;

    public C0365ah(Context context) {
        this.mContext = context;
    }

    /* renamed from: j */
    private void m879j(String str) throws RemoteException {
        if (this.f870eK == null) {
            m880k(str);
        }
        this.f872eX = C0961u.m3007a(this.mContext, new C0964x(), this.f870eK, this.f871eW);
        if (this.f873ev != null) {
            this.f872eX.mo3432a((C0350ab) new C0960t(this.f873ev));
        }
        if (this.f869eI != null) {
            this.f872eX.mo3433a((C0359ae) new C0966z(this.f869eI));
        }
    }

    /* renamed from: k */
    private void m880k(String str) {
        if (this.f872eX == null) {
            throw new IllegalStateException("The ad unit ID must be set on InterstitialAd before " + str + " is called.");
        }
    }

    /* renamed from: a */
    public void mo3489a(C0362af afVar) {
        try {
            if (this.f872eX == null) {
                m879j("loadAd");
            }
            if (this.f872eX.mo3435a(new C0962v(this.mContext, afVar))) {
                this.f871eW.mo3530c(afVar.mo3455R());
            }
        } catch (RemoteException e) {
            C0502ct.m1150b("Failed to load ad.", e);
        }
    }

    public AdListener getAdListener() {
        return this.f873ev;
    }

    public String getAdUnitId() {
        return this.f870eK;
    }

    public AppEventListener getAppEventListener() {
        return this.f869eI;
    }

    public boolean isLoaded() {
        try {
            if (this.f872eX == null) {
                return false;
            }
            return this.f872eX.isReady();
        } catch (RemoteException e) {
            C0502ct.m1150b("Failed to check if ad is ready.", e);
            return false;
        }
    }

    public void setAdListener(AdListener adListener) {
        try {
            this.f873ev = adListener;
            if (this.f872eX != null) {
                this.f872eX.mo3432a((C0350ab) adListener != null ? new C0960t(adListener) : null);
            }
        } catch (RemoteException e) {
            C0502ct.m1150b("Failed to set the AdListener.", e);
        }
    }

    public void setAdUnitId(String adUnitId) {
        if (this.f870eK != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on InterstitialAd.");
        }
        this.f870eK = adUnitId;
    }

    public void setAppEventListener(AppEventListener appEventListener) {
        try {
            this.f869eI = appEventListener;
            if (this.f872eX != null) {
                this.f872eX.mo3433a((C0359ae) appEventListener != null ? new C0966z(appEventListener) : null);
            }
        } catch (RemoteException e) {
            C0502ct.m1150b("Failed to set the AppEventListener.", e);
        }
    }

    public void show() {
        try {
            m880k("show");
            this.f872eX.showInterstitial();
        } catch (RemoteException e) {
            C0502ct.m1150b("Failed to show interstitial.", e);
        }
    }
}
