package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.dynamic.C0270b;
import com.google.android.gms.dynamic.C0273c;

/* renamed from: com.google.android.gms.internal.ag */
public final class C0364ag {

    /* renamed from: eI */
    private AppEventListener f862eI;

    /* renamed from: eJ */
    private AdSize[] f863eJ;

    /* renamed from: eK */
    private String f864eK;

    /* renamed from: eW */
    private final C0409ba f865eW = new C0409ba();

    /* renamed from: eX */
    private C0353ac f866eX;

    /* renamed from: eY */
    private ViewGroup f867eY;

    /* renamed from: ev */
    private AdListener f868ev;

    public C0364ag(ViewGroup viewGroup) {
        this.f867eY = viewGroup;
    }

    public C0364ag(ViewGroup viewGroup, AttributeSet attributeSet, boolean z) {
        this.f867eY = viewGroup;
        Context context = viewGroup.getContext();
        try {
            C0349aa aaVar = new C0349aa(context, attributeSet);
            this.f863eJ = aaVar.mo3421c(z);
            this.f864eK = aaVar.getAdUnitId();
            if (viewGroup.isInEditMode()) {
                C0501cs.m1142a(viewGroup, new C0964x(context, this.f863eJ[0]), "Ads by Google");
            }
        } catch (IllegalArgumentException e) {
            C0501cs.m1144a(viewGroup, new C0964x(context, AdSize.BANNER), e.getMessage(), e.getMessage());
        }
    }

    /* renamed from: T */
    private void m875T() {
        try {
            C0270b x = this.f866eX.mo3442x();
            if (x != null) {
                this.f867eY.addView((View) C0273c.m633b(x));
            }
        } catch (RemoteException e) {
            C0502ct.m1150b("Failed to get an ad frame.", e);
        }
    }

    /* renamed from: U */
    private void m876U() throws RemoteException {
        if ((this.f863eJ == null || this.f864eK == null) && this.f866eX == null) {
            throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
        }
        Context context = this.f867eY.getContext();
        this.f866eX = C0961u.m3007a(context, new C0964x(context, this.f863eJ), this.f864eK, this.f865eW);
        if (this.f868ev != null) {
            this.f866eX.mo3432a((C0350ab) new C0960t(this.f868ev));
        }
        if (this.f862eI != null) {
            this.f866eX.mo3433a((C0359ae) new C0966z(this.f862eI));
        }
        m875T();
    }

    /* renamed from: a */
    public void mo3474a(C0362af afVar) {
        try {
            if (this.f866eX == null) {
                m876U();
            }
            if (this.f866eX.mo3435a(new C0962v(this.f867eY.getContext(), afVar))) {
                this.f865eW.mo3530c(afVar.mo3455R());
            }
        } catch (RemoteException e) {
            C0502ct.m1150b("Failed to load ad.", e);
        }
    }

    /* renamed from: a */
    public void mo3475a(AdSize... adSizeArr) {
        this.f863eJ = adSizeArr;
        try {
            if (this.f866eX != null) {
                this.f866eX.mo3434a(new C0964x(this.f867eY.getContext(), this.f863eJ));
            }
        } catch (RemoteException e) {
            C0502ct.m1150b("Failed to set the ad size.", e);
        }
        this.f867eY.requestLayout();
    }

    public void destroy() {
        try {
            if (this.f866eX != null) {
                this.f866eX.destroy();
            }
        } catch (RemoteException e) {
            C0502ct.m1150b("Failed to destroy AdView.", e);
        }
    }

    public AdListener getAdListener() {
        return this.f868ev;
    }

    public AdSize getAdSize() {
        try {
            if (this.f866eX != null) {
                return this.f866eX.mo3443y().mo5271P();
            }
        } catch (RemoteException e) {
            C0502ct.m1150b("Failed to get the current AdSize.", e);
        }
        if (this.f863eJ != null) {
            return this.f863eJ[0];
        }
        return null;
    }

    public AdSize[] getAdSizes() {
        return this.f863eJ;
    }

    public String getAdUnitId() {
        return this.f864eK;
    }

    public AppEventListener getAppEventListener() {
        return this.f862eI;
    }

    public void pause() {
        try {
            if (this.f866eX != null) {
                this.f866eX.pause();
            }
        } catch (RemoteException e) {
            C0502ct.m1150b("Failed to call pause.", e);
        }
    }

    public void recordManualImpression() {
        try {
            this.f866eX.mo3431H();
        } catch (RemoteException e) {
            C0502ct.m1150b("Failed to record impression.", e);
        }
    }

    public void resume() {
        try {
            if (this.f866eX != null) {
                this.f866eX.resume();
            }
        } catch (RemoteException e) {
            C0502ct.m1150b("Failed to call resume.", e);
        }
    }

    public void setAdListener(AdListener adListener) {
        try {
            this.f868ev = adListener;
            if (this.f866eX != null) {
                this.f866eX.mo3432a((C0350ab) adListener != null ? new C0960t(adListener) : null);
            }
        } catch (RemoteException e) {
            C0502ct.m1150b("Failed to set the AdListener.", e);
        }
    }

    public void setAdSizes(AdSize... adSizes) {
        if (this.f863eJ != null) {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        }
        mo3475a(adSizes);
    }

    public void setAdUnitId(String adUnitId) {
        if (this.f864eK != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        }
        this.f864eK = adUnitId;
    }

    public void setAppEventListener(AppEventListener appEventListener) {
        try {
            this.f862eI = appEventListener;
            if (this.f866eX != null) {
                this.f866eX.mo3433a((C0359ae) appEventListener != null ? new C0966z(appEventListener) : null);
            }
        } catch (RemoteException e) {
            C0502ct.m1150b("Failed to set the AppEventListener.", e);
        }
    }
}
