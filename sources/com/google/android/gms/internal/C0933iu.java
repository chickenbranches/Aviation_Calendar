package com.google.android.gms.internal;

import android.accounts.Account;
import android.app.Activity;
import android.app.PendingIntent;
import android.app.PendingIntent.CanceledException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.GoogleAuthUtil;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks;
import com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.internal.C0569dw.C0572c;
import com.google.android.gms.internal.C0569dw.C0574e;
import com.google.android.gms.internal.C0569dw.C0576g;
import com.google.android.gms.internal.C0927is.C0928a;
import com.google.android.gms.internal.C0930it.C0931a;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.FullWalletRequest;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.NotifyTransactionStatusRequest;
import com.google.android.gms.wallet.WalletConstants;

/* renamed from: com.google.android.gms.internal.iu */
public class C0933iu extends C0569dw<C0927is> {

    /* renamed from: Hi */
    private final int f2353Hi;
    /* access modifiers changed from: private */

    /* renamed from: gs */
    public final Activity f2354gs;

    /* renamed from: jG */
    private final String f2355jG;
    private final int mTheme;

    /* renamed from: com.google.android.gms.internal.iu$a */
    final class C0934a extends C0931a {

        /* renamed from: oZ */
        private final int f2357oZ;

        public C0934a(int i) {
            this.f2357oZ = i;
        }

        /* renamed from: a */
        public void mo5197a(int i, FullWallet fullWallet, Bundle bundle) {
            int i2;
            Intent intent;
            PendingIntent pendingIntent = null;
            if (bundle != null) {
                pendingIntent = (PendingIntent) bundle.getParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT");
            }
            ConnectionResult connectionResult = new ConnectionResult(i, pendingIntent);
            if (connectionResult.hasResolution()) {
                try {
                    connectionResult.startResolutionForResult(C0933iu.this.f2354gs, this.f2357oZ);
                } catch (SendIntentException e) {
                    Log.w("WalletClientImpl", "Exception starting pending intent", e);
                }
            } else {
                if (connectionResult.isSuccess()) {
                    i2 = -1;
                    intent = new Intent();
                    intent.putExtra(WalletConstants.EXTRA_FULL_WALLET, fullWallet);
                } else {
                    i2 = i == 408 ? 0 : 1;
                    intent = new Intent();
                    intent.putExtra(WalletConstants.EXTRA_ERROR_CODE, i);
                }
                PendingIntent createPendingResult = C0933iu.this.f2354gs.createPendingResult(this.f2357oZ, intent, 1073741824);
                if (createPendingResult == null) {
                    Log.w("WalletClientImpl", "Null pending result returned for onFullWalletLoaded");
                    return;
                }
                try {
                    createPendingResult.send(i2);
                } catch (CanceledException e2) {
                    Log.w("WalletClientImpl", "Exception setting pending result", e2);
                }
            }
        }

        /* renamed from: a */
        public void mo5198a(int i, MaskedWallet maskedWallet, Bundle bundle) {
            int i2;
            Intent intent;
            PendingIntent pendingIntent = null;
            if (bundle != null) {
                pendingIntent = (PendingIntent) bundle.getParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT");
            }
            ConnectionResult connectionResult = new ConnectionResult(i, pendingIntent);
            if (connectionResult.hasResolution()) {
                try {
                    connectionResult.startResolutionForResult(C0933iu.this.f2354gs, this.f2357oZ);
                } catch (SendIntentException e) {
                    Log.w("WalletClientImpl", "Exception starting pending intent", e);
                }
            } else {
                if (connectionResult.isSuccess()) {
                    i2 = -1;
                    intent = new Intent();
                    intent.putExtra(WalletConstants.EXTRA_MASKED_WALLET, maskedWallet);
                } else {
                    i2 = i == 408 ? 0 : 1;
                    intent = new Intent();
                    intent.putExtra(WalletConstants.EXTRA_ERROR_CODE, i);
                }
                PendingIntent createPendingResult = C0933iu.this.f2354gs.createPendingResult(this.f2357oZ, intent, 1073741824);
                if (createPendingResult == null) {
                    Log.w("WalletClientImpl", "Null pending result returned for onMaskedWalletLoaded");
                    return;
                }
                try {
                    createPendingResult.send(i2);
                } catch (CanceledException e2) {
                    Log.w("WalletClientImpl", "Exception setting pending result", e2);
                }
            }
        }

        /* renamed from: a */
        public void mo5199a(int i, boolean z, Bundle bundle) {
            Intent intent = new Intent();
            intent.putExtra(WalletConstants.EXTRA_IS_USER_PREAUTHORIZED, z);
            PendingIntent createPendingResult = C0933iu.this.f2354gs.createPendingResult(this.f2357oZ, intent, 1073741824);
            if (createPendingResult == null) {
                Log.w("WalletClientImpl", "Null pending result returned for onPreAuthorizationDetermined");
                return;
            }
            try {
                createPendingResult.send(-1);
            } catch (CanceledException e) {
                Log.w("WalletClientImpl", "Exception setting pending result", e);
            }
        }
    }

    @Deprecated
    public C0933iu(Activity activity, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener, int i, String str, int i2) {
        this(activity, (GoogleApiClient.ConnectionCallbacks) new C0572c(connectionCallbacks), (GoogleApiClient.OnConnectionFailedListener) new C0576g(onConnectionFailedListener), i, str, i2);
    }

    public C0933iu(Activity activity, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener, int i, String str, int i2) {
        super((Context) activity, connectionCallbacks, onConnectionFailedListener, new String[0]);
        this.f2354gs = activity;
        this.f2353Hi = i;
        this.f2355jG = str;
        this.mTheme = i2;
    }

    /* renamed from: fT */
    private Bundle m2860fT() {
        Bundle bundle = new Bundle();
        bundle.putInt("com.google.android.gms.wallet.EXTRA_ENVIRONMENT", this.f2353Hi);
        bundle.putString("androidPackageName", this.f2354gs.getPackageName());
        if (!TextUtils.isEmpty(this.f2355jG)) {
            bundle.putParcelable("com.google.android.gms.wallet.EXTRA_BUYER_ACCOUNT", new Account(this.f2355jG, GoogleAuthUtil.GOOGLE_ACCOUNT_TYPE));
        }
        bundle.putInt("com.google.android.gms.wallet.EXTRA_THEME", this.mTheme);
        return bundle;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2638a(C0590ec ecVar, C0574e eVar) throws RemoteException {
        ecVar.mo3945a(eVar, GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    /* access modifiers changed from: protected */
    /* renamed from: aB */
    public C0927is mo2643p(IBinder iBinder) {
        return C0928a.m2846az(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: am */
    public String mo2639am() {
        return "com.google.android.gms.wallet.service.BIND";
    }

    /* access modifiers changed from: protected */
    /* renamed from: an */
    public String mo2640an() {
        return "com.google.android.gms.wallet.internal.IOwService";
    }

    public void changeMaskedWallet(String googleTransactionId, String merchantTransactionId, int requestCode) {
        Bundle fT = m2860fT();
        C0934a aVar = new C0934a(requestCode);
        try {
            ((C0927is) mo3890bQ()).mo5194a(googleTransactionId, merchantTransactionId, fT, aVar);
        } catch (RemoteException e) {
            Log.e("WalletClientImpl", "RemoteException changing masked wallet", e);
            aVar.mo5198a(8, (MaskedWallet) null, (Bundle) null);
        }
    }

    public void checkForPreAuthorization(int requestCode) {
        Bundle fT = m2860fT();
        C0934a aVar = new C0934a(requestCode);
        try {
            ((C0927is) mo3890bQ()).mo5190a(fT, (C0930it) aVar);
        } catch (RemoteException e) {
            Log.e("WalletClientImpl", "RemoteException during checkForPreAuthorization", e);
            aVar.mo5199a(8, false, (Bundle) null);
        }
    }

    public void loadFullWallet(FullWalletRequest request, int requestCode) {
        C0934a aVar = new C0934a(requestCode);
        try {
            ((C0927is) mo3890bQ()).mo5191a(request, m2860fT(), (C0930it) aVar);
        } catch (RemoteException e) {
            Log.e("WalletClientImpl", "RemoteException getting full wallet", e);
            aVar.mo5197a(8, (FullWallet) null, (Bundle) null);
        }
    }

    public void loadMaskedWallet(MaskedWalletRequest request, int requestCode) {
        Bundle fT = m2860fT();
        C0934a aVar = new C0934a(requestCode);
        try {
            ((C0927is) mo3890bQ()).mo5192a(request, fT, (C0930it) aVar);
        } catch (RemoteException e) {
            Log.e("WalletClientImpl", "RemoteException getting masked wallet", e);
            aVar.mo5198a(8, (MaskedWallet) null, (Bundle) null);
        }
    }

    public void notifyTransactionStatus(NotifyTransactionStatusRequest request) {
        try {
            ((C0927is) mo3890bQ()).mo5193a(request, m2860fT());
        } catch (RemoteException e) {
        }
    }
}
