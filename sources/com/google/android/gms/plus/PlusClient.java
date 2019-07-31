package com.google.android.gms.plus;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesClient;
import com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks;
import com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.C0153a.C0157c;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.C0866hs;
import com.google.android.gms.internal.C0876hv;
import com.google.android.gms.plus.Moments.LoadMomentsResult;
import com.google.android.gms.plus.People.LoadPeopleResult;
import com.google.android.gms.plus.model.moments.Moment;
import com.google.android.gms.plus.model.moments.MomentBuffer;
import com.google.android.gms.plus.model.people.Person;
import com.google.android.gms.plus.model.people.PersonBuffer;
import java.util.Collection;

@Deprecated
public class PlusClient implements GooglePlayServicesClient {

    /* renamed from: Du */
    final C0866hs f2653Du;

    @Deprecated
    public static class Builder {

        /* renamed from: DA */
        private final C0876hv f2668DA = new C0876hv(this.mContext);

        /* renamed from: Dz */
        private final ConnectionCallbacks f2669Dz;

        /* renamed from: jE */
        private final OnConnectionFailedListener f2670jE;
        private final Context mContext;

        public Builder(Context context, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener connectionFailedListener) {
            this.mContext = context;
            this.f2669Dz = connectionCallbacks;
            this.f2670jE = connectionFailedListener;
        }

        public PlusClient build() {
            return new PlusClient(new C0866hs(this.mContext, this.f2669Dz, this.f2670jE, this.f2668DA.mo4765eZ()));
        }

        public Builder clearScopes() {
            this.f2668DA.mo4764eY();
            return this;
        }

        public Builder setAccountName(String accountName) {
            this.f2668DA.mo4761aA(accountName);
            return this;
        }

        public Builder setActions(String... actions) {
            this.f2668DA.mo4763e(actions);
            return this;
        }

        public Builder setScopes(String... scopes) {
            this.f2668DA.mo4762d(scopes);
            return this;
        }
    }

    @Deprecated
    public interface OnAccessRevokedListener {
        void onAccessRevoked(ConnectionResult connectionResult);
    }

    @Deprecated
    public interface OnMomentsLoadedListener {
        @Deprecated
        void onMomentsLoaded(ConnectionResult connectionResult, MomentBuffer momentBuffer, String str, String str2);
    }

    @Deprecated
    public interface OnPeopleLoadedListener {
        void onPeopleLoaded(ConnectionResult connectionResult, PersonBuffer personBuffer, String str);
    }

    @Deprecated
    public interface OrderBy {
        @Deprecated
        public static final int ALPHABETICAL = 0;
        @Deprecated
        public static final int BEST = 1;
    }

    PlusClient(C0866hs plusClientImpl) {
        this.f2653Du = plusClientImpl;
    }

    @Deprecated
    public void clearDefaultAccount() {
        this.f2653Du.clearDefaultAccount();
    }

    @Deprecated
    public void connect() {
        this.f2653Du.connect();
    }

    @Deprecated
    public void disconnect() {
        this.f2653Du.disconnect();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: eK */
    public C0866hs mo6133eK() {
        return this.f2653Du;
    }

    @Deprecated
    public String getAccountName() {
        return this.f2653Du.getAccountName();
    }

    @Deprecated
    public Person getCurrentPerson() {
        return this.f2653Du.getCurrentPerson();
    }

    @Deprecated
    public boolean isConnected() {
        return this.f2653Du.isConnected();
    }

    @Deprecated
    public boolean isConnecting() {
        return this.f2653Du.isConnecting();
    }

    @Deprecated
    public boolean isConnectionCallbacksRegistered(ConnectionCallbacks listener) {
        return this.f2653Du.isConnectionCallbacksRegistered(listener);
    }

    @Deprecated
    public boolean isConnectionFailedListenerRegistered(OnConnectionFailedListener listener) {
        return this.f2653Du.isConnectionFailedListenerRegistered(listener);
    }

    @Deprecated
    public void loadMoments(final OnMomentsLoadedListener listener) {
        this.f2653Du.mo4734j(new C0157c<LoadMomentsResult>() {
            /* renamed from: a */
            public void mo2048a(LoadMomentsResult loadMomentsResult) {
                listener.onMomentsLoaded(loadMomentsResult.getStatus().mo2344bu(), loadMomentsResult.getMomentBuffer(), loadMomentsResult.getNextPageToken(), loadMomentsResult.getUpdated());
            }
        });
    }

    @Deprecated
    public void loadMoments(final OnMomentsLoadedListener listener, int maxResults, String pageToken, Uri targetUrl, String type, String userId) {
        this.f2653Du.mo4725a(new C0157c<LoadMomentsResult>() {
            /* renamed from: a */
            public void mo2048a(LoadMomentsResult loadMomentsResult) {
                listener.onMomentsLoaded(loadMomentsResult.getStatus().mo2344bu(), loadMomentsResult.getMomentBuffer(), loadMomentsResult.getNextPageToken(), loadMomentsResult.getUpdated());
            }
        }, maxResults, pageToken, targetUrl, type, userId);
    }

    @Deprecated
    public void loadPeople(final OnPeopleLoadedListener listener, Collection<String> personIds) {
        this.f2653Du.mo4726a((C0157c<LoadPeopleResult>) new C0157c<LoadPeopleResult>() {
            /* renamed from: a */
            public void mo2048a(LoadPeopleResult loadPeopleResult) {
                listener.onPeopleLoaded(loadPeopleResult.getStatus().mo2344bu(), loadPeopleResult.getPersonBuffer(), loadPeopleResult.getNextPageToken());
            }
        }, personIds);
    }

    @Deprecated
    public void loadPeople(final OnPeopleLoadedListener listener, String... personIds) {
        this.f2653Du.mo4727a((C0157c<LoadPeopleResult>) new C0157c<LoadPeopleResult>() {
            /* renamed from: a */
            public void mo2048a(LoadPeopleResult loadPeopleResult) {
                listener.onPeopleLoaded(loadPeopleResult.getStatus().mo2344bu(), loadPeopleResult.getPersonBuffer(), loadPeopleResult.getNextPageToken());
            }
        }, personIds);
    }

    @Deprecated
    public void loadVisiblePeople(final OnPeopleLoadedListener listener, int orderBy, String pageToken) {
        this.f2653Du.mo4724a((C0157c<LoadPeopleResult>) new C0157c<LoadPeopleResult>() {
            /* renamed from: a */
            public void mo2048a(LoadPeopleResult loadPeopleResult) {
                listener.onPeopleLoaded(loadPeopleResult.getStatus().mo2344bu(), loadPeopleResult.getPersonBuffer(), loadPeopleResult.getNextPageToken());
            }
        }, orderBy, pageToken);
    }

    @Deprecated
    public void loadVisiblePeople(final OnPeopleLoadedListener listener, String pageToken) {
        this.f2653Du.mo4733i(new C0157c<LoadPeopleResult>() {
            /* renamed from: a */
            public void mo2048a(LoadPeopleResult loadPeopleResult) {
                listener.onPeopleLoaded(loadPeopleResult.getStatus().mo2344bu(), loadPeopleResult.getPersonBuffer(), loadPeopleResult.getNextPageToken());
            }
        }, pageToken);
    }

    @Deprecated
    public void registerConnectionCallbacks(ConnectionCallbacks listener) {
        this.f2653Du.registerConnectionCallbacks(listener);
    }

    @Deprecated
    public void registerConnectionFailedListener(OnConnectionFailedListener listener) {
        this.f2653Du.registerConnectionFailedListener(listener);
    }

    @Deprecated
    public void removeMoment(String momentId) {
        this.f2653Du.removeMoment(momentId);
    }

    @Deprecated
    public void revokeAccessAndDisconnect(final OnAccessRevokedListener listener) {
        this.f2653Du.mo4736l(new C0157c<Status>() {
            /* renamed from: a */
            public void mo2048a(Status status) {
                listener.onAccessRevoked(status.getStatus().mo2344bu());
            }
        });
    }

    @Deprecated
    public void unregisterConnectionCallbacks(ConnectionCallbacks listener) {
        this.f2653Du.unregisterConnectionCallbacks(listener);
    }

    @Deprecated
    public void unregisterConnectionFailedListener(OnConnectionFailedListener listener) {
        this.f2653Du.unregisterConnectionFailedListener(listener);
    }

    @Deprecated
    public void writeMoment(Moment moment) {
        this.f2653Du.writeMoment(moment);
    }
}
