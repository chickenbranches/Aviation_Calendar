package com.google.android.gms.wallet;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.C0145b;
import com.google.android.gms.common.api.C0153a.C0154a;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.ApiOptions;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.C0565dt;
import com.google.android.gms.internal.C0600eg;
import com.google.android.gms.internal.C0933iu;

public final class Wallet {
    public static final Api API = new Api(f2829jO, new Scope[0]);

    /* renamed from: jO */
    static final C0145b<C0933iu> f2829jO = new C0145b<C0933iu>() {
        public int getPriority() {
            return Integer.MAX_VALUE;
        }

        /* renamed from: h */
        public C0933iu mo2057b(Context context, C0565dt dtVar, ApiOptions apiOptions, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            C0600eg.m1553b(context instanceof Activity, (Object) "An Activity must be used for Wallet APIs");
            Activity activity = (Activity) context;
            C0600eg.m1553b(apiOptions == null || (apiOptions instanceof WalletOptions), (Object) "WalletOptions must be used for Wallet APIs");
            WalletOptions walletOptions = apiOptions != null ? (WalletOptions) apiOptions : new WalletOptions();
            return new C0933iu(activity, connectionCallbacks, onConnectionFailedListener, walletOptions.environment, dtVar.getAccountName(), walletOptions.theme);
        }
    };

    public static final class WalletOptions implements ApiOptions {
        public final int environment;
        public final int theme;

        public static final class Builder {
            /* access modifiers changed from: private */

            /* renamed from: Hi */
            public int f2839Hi = 0;
            /* access modifiers changed from: private */
            public int mTheme = 0;

            public WalletOptions build() {
                return new WalletOptions(this);
            }

            public Builder setEnvironment(int environment) {
                if (environment == 0 || environment == 2 || environment == 1) {
                    this.f2839Hi = environment;
                    return this;
                }
                throw new IllegalArgumentException(String.format("Invalid environment value %d", new Object[]{Integer.valueOf(environment)}));
            }

            public Builder setTheme(int theme) {
                if (theme == 0 || theme == 1) {
                    this.mTheme = theme;
                    return this;
                }
                throw new IllegalArgumentException(String.format("Invalid theme value %d", new Object[]{Integer.valueOf(theme)}));
            }
        }

        private WalletOptions() {
            this(new Builder());
        }

        private WalletOptions(Builder builder) {
            this.environment = builder.f2839Hi;
            this.theme = builder.mTheme;
        }
    }

    /* renamed from: com.google.android.gms.wallet.Wallet$a */
    private static abstract class C1127a extends C0154a<Status, C0933iu> {
        public C1127a() {
            super(Wallet.f2829jO);
        }

        /* renamed from: g */
        public Status mo2067e(Status status) {
            return status;
        }
    }

    private Wallet() {
    }

    public static void changeMaskedWallet(GoogleApiClient googleApiClient, final String googleTransactionId, final String merchantTransactionId, final int requestCode) {
        googleApiClient.mo2303a(new C1127a() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo2062a(C0933iu iuVar) {
                iuVar.changeMaskedWallet(googleTransactionId, merchantTransactionId, requestCode);
                mo2048a(Status.f283nA);
            }
        });
    }

    public static void checkForPreAuthorization(GoogleApiClient googleApiClient, final int requestCode) {
        googleApiClient.mo2303a(new C1127a() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo2062a(C0933iu iuVar) {
                iuVar.checkForPreAuthorization(requestCode);
                mo2048a(Status.f283nA);
            }
        });
    }

    public static void loadFullWallet(GoogleApiClient googleApiClient, final FullWalletRequest request, final int requestCode) {
        googleApiClient.mo2303a(new C1127a() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo2062a(C0933iu iuVar) {
                iuVar.loadFullWallet(request, requestCode);
                mo2048a(Status.f283nA);
            }
        });
    }

    public static void loadMaskedWallet(GoogleApiClient googleApiClient, final MaskedWalletRequest request, final int requestCode) {
        googleApiClient.mo2303a(new C1127a() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo2062a(C0933iu iuVar) {
                iuVar.loadMaskedWallet(request, requestCode);
                mo2048a(Status.f283nA);
            }
        });
    }

    public static void notifyTransactionStatus(GoogleApiClient googleApiClient, final NotifyTransactionStatusRequest request) {
        googleApiClient.mo2303a(new C1127a() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo2062a(C0933iu iuVar) {
                iuVar.notifyTransactionStatus(request);
                mo2048a(Status.f283nA);
            }
        });
    }
}
