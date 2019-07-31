package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.ads.AdRequest.ErrorCode;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationBannerListener;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationInterstitialListener;
import com.google.ads.mediation.MediationServerParameters;
import com.google.ads.mediation.NetworkExtras;

/* renamed from: com.google.android.gms.internal.bf */
public final class C0420bf<NETWORK_EXTRAS extends NetworkExtras, SERVER_PARAMETERS extends MediationServerParameters> implements MediationBannerListener, MediationInterstitialListener {
    /* access modifiers changed from: private */

    /* renamed from: gi */
    public final C0416bd f1151gi;

    public C0420bf(C0416bd bdVar) {
        this.f1151gi = bdVar;
    }

    public void onClick(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        C0502ct.m1152r("Adapter called onClick.");
        if (!C0501cs.m1146ay()) {
            C0502ct.m1156v("onClick must be called on the main UI thread.");
            C0501cs.f1345iI.post(new Runnable() {
                public void run() {
                    try {
                        C0420bf.this.f1151gi.mo3523w();
                    } catch (RemoteException e) {
                        C0502ct.m1150b("Could not call onAdClicked.", e);
                    }
                }
            });
            return;
        }
        try {
            this.f1151gi.mo3523w();
        } catch (RemoteException e) {
            C0502ct.m1150b("Could not call onAdClicked.", e);
        }
    }

    public void onDismissScreen(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        C0502ct.m1152r("Adapter called onDismissScreen.");
        if (!C0501cs.m1146ay()) {
            C0502ct.m1156v("onDismissScreen must be called on the main UI thread.");
            C0501cs.f1345iI.post(new Runnable() {
                public void run() {
                    try {
                        C0420bf.this.f1151gi.onAdClosed();
                    } catch (RemoteException e) {
                        C0502ct.m1150b("Could not call onAdClosed.", e);
                    }
                }
            });
            return;
        }
        try {
            this.f1151gi.onAdClosed();
        } catch (RemoteException e) {
            C0502ct.m1150b("Could not call onAdClosed.", e);
        }
    }

    public void onDismissScreen(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter) {
        C0502ct.m1152r("Adapter called onDismissScreen.");
        if (!C0501cs.m1146ay()) {
            C0502ct.m1156v("onDismissScreen must be called on the main UI thread.");
            C0501cs.f1345iI.post(new Runnable() {
                public void run() {
                    try {
                        C0420bf.this.f1151gi.onAdClosed();
                    } catch (RemoteException e) {
                        C0502ct.m1150b("Could not call onAdClosed.", e);
                    }
                }
            });
            return;
        }
        try {
            this.f1151gi.onAdClosed();
        } catch (RemoteException e) {
            C0502ct.m1150b("Could not call onAdClosed.", e);
        }
    }

    public void onFailedToReceiveAd(MediationBannerAdapter<?, ?> mediationBannerAdapter, final ErrorCode errorCode) {
        C0502ct.m1152r("Adapter called onFailedToReceiveAd with error. " + errorCode);
        if (!C0501cs.m1146ay()) {
            C0502ct.m1156v("onFailedToReceiveAd must be called on the main UI thread.");
            C0501cs.f1345iI.post(new Runnable() {
                public void run() {
                    try {
                        C0420bf.this.f1151gi.onAdFailedToLoad(C0432bg.m963a(errorCode));
                    } catch (RemoteException e) {
                        C0502ct.m1150b("Could not call onAdFailedToLoad.", e);
                    }
                }
            });
            return;
        }
        try {
            this.f1151gi.onAdFailedToLoad(C0432bg.m963a(errorCode));
        } catch (RemoteException e) {
            C0502ct.m1150b("Could not call onAdFailedToLoad.", e);
        }
    }

    public void onFailedToReceiveAd(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter, final ErrorCode errorCode) {
        C0502ct.m1152r("Adapter called onFailedToReceiveAd with error " + errorCode + ".");
        if (!C0501cs.m1146ay()) {
            C0502ct.m1156v("onFailedToReceiveAd must be called on the main UI thread.");
            C0501cs.f1345iI.post(new Runnable() {
                public void run() {
                    try {
                        C0420bf.this.f1151gi.onAdFailedToLoad(C0432bg.m963a(errorCode));
                    } catch (RemoteException e) {
                        C0502ct.m1150b("Could not call onAdFailedToLoad.", e);
                    }
                }
            });
            return;
        }
        try {
            this.f1151gi.onAdFailedToLoad(C0432bg.m963a(errorCode));
        } catch (RemoteException e) {
            C0502ct.m1150b("Could not call onAdFailedToLoad.", e);
        }
    }

    public void onLeaveApplication(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        C0502ct.m1152r("Adapter called onLeaveApplication.");
        if (!C0501cs.m1146ay()) {
            C0502ct.m1156v("onLeaveApplication must be called on the main UI thread.");
            C0501cs.f1345iI.post(new Runnable() {
                public void run() {
                    try {
                        C0420bf.this.f1151gi.onAdLeftApplication();
                    } catch (RemoteException e) {
                        C0502ct.m1150b("Could not call onAdLeftApplication.", e);
                    }
                }
            });
            return;
        }
        try {
            this.f1151gi.onAdLeftApplication();
        } catch (RemoteException e) {
            C0502ct.m1150b("Could not call onAdLeftApplication.", e);
        }
    }

    public void onLeaveApplication(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter) {
        C0502ct.m1152r("Adapter called onLeaveApplication.");
        if (!C0501cs.m1146ay()) {
            C0502ct.m1156v("onLeaveApplication must be called on the main UI thread.");
            C0501cs.f1345iI.post(new Runnable() {
                public void run() {
                    try {
                        C0420bf.this.f1151gi.onAdLeftApplication();
                    } catch (RemoteException e) {
                        C0502ct.m1150b("Could not call onAdLeftApplication.", e);
                    }
                }
            });
            return;
        }
        try {
            this.f1151gi.onAdLeftApplication();
        } catch (RemoteException e) {
            C0502ct.m1150b("Could not call onAdLeftApplication.", e);
        }
    }

    public void onPresentScreen(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        C0502ct.m1152r("Adapter called onPresentScreen.");
        if (!C0501cs.m1146ay()) {
            C0502ct.m1156v("onPresentScreen must be called on the main UI thread.");
            C0501cs.f1345iI.post(new Runnable() {
                public void run() {
                    try {
                        C0420bf.this.f1151gi.onAdOpened();
                    } catch (RemoteException e) {
                        C0502ct.m1150b("Could not call onAdOpened.", e);
                    }
                }
            });
            return;
        }
        try {
            this.f1151gi.onAdOpened();
        } catch (RemoteException e) {
            C0502ct.m1150b("Could not call onAdOpened.", e);
        }
    }

    public void onPresentScreen(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter) {
        C0502ct.m1152r("Adapter called onPresentScreen.");
        if (!C0501cs.m1146ay()) {
            C0502ct.m1156v("onPresentScreen must be called on the main UI thread.");
            C0501cs.f1345iI.post(new Runnable() {
                public void run() {
                    try {
                        C0420bf.this.f1151gi.onAdOpened();
                    } catch (RemoteException e) {
                        C0502ct.m1150b("Could not call onAdOpened.", e);
                    }
                }
            });
            return;
        }
        try {
            this.f1151gi.onAdOpened();
        } catch (RemoteException e) {
            C0502ct.m1150b("Could not call onAdOpened.", e);
        }
    }

    public void onReceivedAd(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        C0502ct.m1152r("Adapter called onReceivedAd.");
        if (!C0501cs.m1146ay()) {
            C0502ct.m1156v("onReceivedAd must be called on the main UI thread.");
            C0501cs.f1345iI.post(new Runnable() {
                public void run() {
                    try {
                        C0420bf.this.f1151gi.onAdLoaded();
                    } catch (RemoteException e) {
                        C0502ct.m1150b("Could not call onAdLoaded.", e);
                    }
                }
            });
            return;
        }
        try {
            this.f1151gi.onAdLoaded();
        } catch (RemoteException e) {
            C0502ct.m1150b("Could not call onAdLoaded.", e);
        }
    }

    public void onReceivedAd(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter) {
        C0502ct.m1152r("Adapter called onReceivedAd.");
        if (!C0501cs.m1146ay()) {
            C0502ct.m1156v("onReceivedAd must be called on the main UI thread.");
            C0501cs.f1345iI.post(new Runnable() {
                public void run() {
                    try {
                        C0420bf.this.f1151gi.onAdLoaded();
                    } catch (RemoteException e) {
                        C0502ct.m1150b("Could not call onAdLoaded.", e);
                    }
                }
            });
            return;
        }
        try {
            this.f1151gi.onAdLoaded();
        } catch (RemoteException e) {
            C0502ct.m1150b("Could not call onAdLoaded.", e);
        }
    }
}
