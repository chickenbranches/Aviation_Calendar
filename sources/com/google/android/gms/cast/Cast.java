package com.google.android.gms.cast;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.C0145b;
import com.google.android.gms.common.api.C0153a.C0154a;
import com.google.android.gms.common.api.C0153a.C0157c;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.ApiOptions;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.C0538dg;
import com.google.android.gms.internal.C0565dt;
import com.google.android.gms.internal.C0600eg;
import java.io.IOException;

public final class Cast {
    public static final Api API = new Api(f134jO, new Scope[0]);
    public static final CastApi CastApi = new C0114a();
    public static final String EXTRA_APP_NO_LONGER_RUNNING = "com.google.android.gms.cast.EXTRA_APP_NO_LONGER_RUNNING";
    public static final int MAX_MESSAGE_LENGTH = 65536;
    public static final int MAX_NAMESPACE_LENGTH = 128;

    /* renamed from: jO */
    static final C0145b<C0538dg> f134jO = new C0145b<C0538dg>() {
        /* renamed from: c */
        public C0538dg mo2057b(Context context, C0565dt dtVar, ApiOptions apiOptions, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            C0600eg.m1552b(apiOptions, (Object) "Setting the API options is required.");
            C0600eg.m1553b(apiOptions instanceof CastOptions, (Object) "Must provide valid CastOptions!");
            CastOptions castOptions = (CastOptions) apiOptions;
            return new C0538dg(context, castOptions.f153ks, (long) castOptions.f155ku, castOptions.f154kt, connectionCallbacks, onConnectionFailedListener);
        }

        public int getPriority() {
            return Integer.MAX_VALUE;
        }
    };

    public interface ApplicationConnectionResult extends Result {
        ApplicationMetadata getApplicationMetadata();

        String getApplicationStatus();

        String getSessionId();

        boolean getWasLaunched();
    }

    public interface CastApi {

        /* renamed from: com.google.android.gms.cast.Cast$CastApi$a */
        public static final class C0114a implements CastApi {
            public ApplicationMetadata getApplicationMetadata(GoogleApiClient client) throws IllegalStateException {
                return ((C0538dg) client.mo2302a(Cast.f134jO)).getApplicationMetadata();
            }

            public String getApplicationStatus(GoogleApiClient client) throws IllegalStateException {
                return ((C0538dg) client.mo2302a(Cast.f134jO)).getApplicationStatus();
            }

            public double getVolume(GoogleApiClient client) throws IllegalStateException {
                return ((C0538dg) client.mo2302a(Cast.f134jO)).mo3777aW();
            }

            public boolean isMute(GoogleApiClient client) throws IllegalStateException {
                return ((C0538dg) client.mo2302a(Cast.f134jO)).isMute();
            }

            public PendingResult<ApplicationConnectionResult> joinApplication(GoogleApiClient client) {
                return client.mo2304b(new C0126c() {
                    /* access modifiers changed from: protected */
                    /* renamed from: a */
                    public void mo2062a(C0538dg dgVar) {
                        try {
                            dgVar.mo3778b(null, null, this);
                        } catch (IllegalStateException e) {
                            mo2150r(2001);
                        } catch (RemoteException e2) {
                            mo2150r(8);
                        }
                    }
                });
            }

            public PendingResult<ApplicationConnectionResult> joinApplication(GoogleApiClient client, final String applicationId) {
                return client.mo2304b(new C0126c() {
                    /* access modifiers changed from: protected */
                    /* renamed from: a */
                    public void mo2062a(C0538dg dgVar) {
                        try {
                            dgVar.mo3778b(applicationId, null, this);
                        } catch (IllegalStateException e) {
                            mo2150r(2001);
                        } catch (RemoteException e2) {
                            mo2150r(8);
                        }
                    }
                });
            }

            public PendingResult<ApplicationConnectionResult> joinApplication(GoogleApiClient client, final String applicationId, final String sessionId) {
                return client.mo2304b(new C0126c() {
                    /* access modifiers changed from: protected */
                    /* renamed from: a */
                    public void mo2062a(C0538dg dgVar) {
                        try {
                            dgVar.mo3778b(applicationId, sessionId, this);
                        } catch (IllegalStateException e) {
                            mo2150r(2001);
                        } catch (RemoteException e2) {
                            mo2150r(8);
                        }
                    }
                });
            }

            public PendingResult<ApplicationConnectionResult> launchApplication(GoogleApiClient client, final String applicationId) {
                return client.mo2304b(new C0126c() {
                    /* access modifiers changed from: protected */
                    /* renamed from: a */
                    public void mo2062a(C0538dg dgVar) {
                        try {
                            dgVar.mo3775a(applicationId, false, (C0157c<ApplicationConnectionResult>) this);
                        } catch (IllegalStateException e) {
                            mo2150r(2001);
                        } catch (RemoteException e2) {
                            mo2150r(8);
                        }
                    }
                });
            }

            public PendingResult<ApplicationConnectionResult> launchApplication(GoogleApiClient client, final String applicationId, final boolean relaunchIfRunning) {
                return client.mo2304b(new C0126c() {
                    /* access modifiers changed from: protected */
                    /* renamed from: a */
                    public void mo2062a(C0538dg dgVar) {
                        try {
                            dgVar.mo3775a(applicationId, relaunchIfRunning, (C0157c<ApplicationConnectionResult>) this);
                        } catch (IllegalStateException e) {
                            mo2150r(2001);
                        } catch (RemoteException e2) {
                            mo2150r(8);
                        }
                    }
                });
            }

            public PendingResult<Status> leaveApplication(GoogleApiClient client) {
                return client.mo2304b(new C0125b() {
                    /* access modifiers changed from: protected */
                    /* renamed from: a */
                    public void mo2062a(C0538dg dgVar) {
                        try {
                            dgVar.mo3779e((C0157c<Status>) this);
                        } catch (IllegalStateException e) {
                            mo2150r(2001);
                        } catch (RemoteException e2) {
                            mo2150r(8);
                        }
                    }
                });
            }

            public void removeMessageReceivedCallbacks(GoogleApiClient client, String namespace) throws IOException, IllegalStateException {
                try {
                    ((C0538dg) client.mo2302a(Cast.f134jO)).mo3770C(namespace);
                } catch (RemoteException e) {
                    throw new IOException("service error");
                }
            }

            public void requestStatus(GoogleApiClient client) throws IOException, IllegalStateException {
                try {
                    ((C0538dg) client.mo2302a(Cast.f134jO)).mo3776aV();
                } catch (RemoteException e) {
                    throw new IOException("service error");
                }
            }

            public PendingResult<Status> sendMessage(GoogleApiClient client, final String namespace, final String message) {
                return client.mo2304b(new C0125b() {
                    /* access modifiers changed from: protected */
                    /* renamed from: a */
                    public void mo2062a(C0538dg dgVar) {
                        try {
                            dgVar.mo3774a(namespace, message, (C0157c<Status>) this);
                        } catch (IllegalArgumentException e) {
                            mo2150r(2001);
                        } catch (IllegalStateException e2) {
                            mo2150r(2001);
                        } catch (RemoteException e3) {
                            mo2150r(8);
                        }
                    }
                });
            }

            public void setMessageReceivedCallbacks(GoogleApiClient client, String namespace, MessageReceivedCallback callbacks) throws IOException, IllegalStateException {
                try {
                    ((C0538dg) client.mo2302a(Cast.f134jO)).mo3772a(namespace, callbacks);
                } catch (RemoteException e) {
                    throw new IOException("service error");
                }
            }

            public void setMute(GoogleApiClient client, boolean mute) throws IOException, IllegalStateException {
                try {
                    ((C0538dg) client.mo2302a(Cast.f134jO)).mo3783n(mute);
                } catch (RemoteException e) {
                    throw new IOException("service error");
                }
            }

            public void setVolume(GoogleApiClient client, double volume) throws IOException, IllegalArgumentException, IllegalStateException {
                try {
                    ((C0538dg) client.mo2302a(Cast.f134jO)).mo3771a(volume);
                } catch (RemoteException e) {
                    throw new IOException("service error");
                }
            }

            public PendingResult<Status> stopApplication(GoogleApiClient client) {
                return client.mo2304b(new C0125b() {
                    /* access modifiers changed from: protected */
                    /* renamed from: a */
                    public void mo2062a(C0538dg dgVar) {
                        try {
                            dgVar.mo3773a("", (C0157c<Status>) this);
                        } catch (IllegalStateException e) {
                            mo2150r(2001);
                        } catch (RemoteException e2) {
                            mo2150r(8);
                        }
                    }
                });
            }

            public PendingResult<Status> stopApplication(GoogleApiClient client, final String sessionId) {
                return client.mo2304b(new C0125b() {
                    /* access modifiers changed from: protected */
                    /* renamed from: a */
                    public void mo2062a(C0538dg dgVar) {
                        if (TextUtils.isEmpty(sessionId)) {
                            mo2149c(2001, "IllegalArgument: sessionId cannot be null or empty");
                            return;
                        }
                        try {
                            dgVar.mo3773a(sessionId, (C0157c<Status>) this);
                        } catch (IllegalStateException e) {
                            mo2150r(2001);
                        } catch (RemoteException e2) {
                            mo2150r(8);
                        }
                    }
                });
            }
        }

        ApplicationMetadata getApplicationMetadata(GoogleApiClient googleApiClient) throws IllegalStateException;

        String getApplicationStatus(GoogleApiClient googleApiClient) throws IllegalStateException;

        double getVolume(GoogleApiClient googleApiClient) throws IllegalStateException;

        boolean isMute(GoogleApiClient googleApiClient) throws IllegalStateException;

        PendingResult<ApplicationConnectionResult> joinApplication(GoogleApiClient googleApiClient);

        PendingResult<ApplicationConnectionResult> joinApplication(GoogleApiClient googleApiClient, String str);

        PendingResult<ApplicationConnectionResult> joinApplication(GoogleApiClient googleApiClient, String str, String str2);

        PendingResult<ApplicationConnectionResult> launchApplication(GoogleApiClient googleApiClient, String str);

        PendingResult<ApplicationConnectionResult> launchApplication(GoogleApiClient googleApiClient, String str, boolean z);

        PendingResult<Status> leaveApplication(GoogleApiClient googleApiClient);

        void removeMessageReceivedCallbacks(GoogleApiClient googleApiClient, String str) throws IOException, IllegalStateException;

        void requestStatus(GoogleApiClient googleApiClient) throws IOException, IllegalStateException;

        PendingResult<Status> sendMessage(GoogleApiClient googleApiClient, String str, String str2);

        void setMessageReceivedCallbacks(GoogleApiClient googleApiClient, String str, MessageReceivedCallback messageReceivedCallback) throws IOException, IllegalStateException;

        void setMute(GoogleApiClient googleApiClient, boolean z) throws IOException, IllegalStateException;

        void setVolume(GoogleApiClient googleApiClient, double d) throws IOException, IllegalArgumentException, IllegalStateException;

        PendingResult<Status> stopApplication(GoogleApiClient googleApiClient);

        PendingResult<Status> stopApplication(GoogleApiClient googleApiClient, String str);
    }

    public static final class CastOptions implements ApiOptions {

        /* renamed from: ks */
        final CastDevice f153ks;

        /* renamed from: kt */
        final Listener f154kt;
        /* access modifiers changed from: private */

        /* renamed from: ku */
        public final int f155ku;

        public static final class Builder {

            /* renamed from: kv */
            CastDevice f156kv;

            /* renamed from: kw */
            Listener f157kw;
            /* access modifiers changed from: private */

            /* renamed from: kx */
            public int f158kx;

            private Builder(CastDevice castDevice, Listener castListener) {
                this.f156kv = castDevice;
                this.f157kw = castListener;
                this.f158kx = 0;
            }

            public CastOptions build() {
                return new CastOptions(this);
            }

            public Builder setDebuggingEnabled() {
                this.f158kx |= 1;
                return this;
            }
        }

        private CastOptions(Builder builder) {
            this.f153ks = builder.f156kv;
            this.f154kt = builder.f157kw;
            this.f155ku = builder.f158kx;
        }

        public static Builder builder(CastDevice castDevice, Listener castListener) {
            return new Builder(castDevice, castListener);
        }
    }

    public static abstract class Listener {
        public void onApplicationDisconnected(int statusCode) {
        }

        public void onApplicationStatusChanged() {
        }

        public void onVolumeChanged() {
        }
    }

    public interface MessageReceivedCallback {
        void onMessageReceived(CastDevice castDevice, String str, String str2);
    }

    /* renamed from: com.google.android.gms.cast.Cast$a */
    protected static abstract class C0124a<R extends Result> extends C0154a<R, C0538dg> implements PendingResult<R> {
        public C0124a() {
            super(Cast.f134jO);
        }

        /* renamed from: c */
        public void mo2149c(int i, String str) {
            mo2048a(mo2067e(new Status(i, str, null)));
        }

        /* renamed from: r */
        public void mo2150r(int i) {
            mo2048a(mo2067e(new Status(i)));
        }
    }

    /* renamed from: com.google.android.gms.cast.Cast$b */
    private static abstract class C0125b extends C0124a<Status> {
        private C0125b() {
        }

        /* renamed from: g */
        public Status mo2067e(Status status) {
            return status;
        }
    }

    /* renamed from: com.google.android.gms.cast.Cast$c */
    private static abstract class C0126c extends C0124a<ApplicationConnectionResult> {
        private C0126c() {
        }

        /* renamed from: i */
        public ApplicationConnectionResult mo2067e(final Status status) {
            return new ApplicationConnectionResult() {
                public ApplicationMetadata getApplicationMetadata() {
                    return null;
                }

                public String getApplicationStatus() {
                    return null;
                }

                public String getSessionId() {
                    return null;
                }

                public Status getStatus() {
                    return status;
                }

                public boolean getWasLaunched() {
                    return false;
                }
            };
        }
    }

    private Cast() {
    }
}
