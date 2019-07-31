package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesClient;
import com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks;
import com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.C0153a.C0157c;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.internal.C0569dw.C0572c;
import com.google.android.gms.internal.C0569dw.C0573d;
import com.google.android.gms.internal.C0569dw.C0574e;
import com.google.android.gms.internal.C0569dw.C0576g;
import com.google.android.gms.internal.C0863hr.C0864a;
import com.google.android.gms.plus.Moments.LoadMomentsResult;
import com.google.android.gms.plus.People.LoadPeopleResult;
import com.google.android.gms.plus.model.moments.Moment;
import com.google.android.gms.plus.model.moments.MomentBuffer;
import com.google.android.gms.plus.model.people.Person;
import com.google.android.gms.plus.model.people.PersonBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* renamed from: com.google.android.gms.internal.hs */
public class C0866hs extends C0569dw<C0863hr> implements GooglePlayServicesClient {

    /* renamed from: DK */
    private Person f2136DK;

    /* renamed from: DL */
    private C0875hu f2137DL;

    /* renamed from: com.google.android.gms.internal.hs$a */
    final class C0867a extends C0853hn {

        /* renamed from: Dp */
        private final C0157c<LoadMomentsResult> f2139Dp;

        public C0867a(C0157c<LoadMomentsResult> cVar) {
            this.f2139Dp = cVar;
        }

        /* renamed from: a */
        public void mo4687a(DataHolder dataHolder, String str, String str2) {
            DataHolder dataHolder2;
            Status status = new Status(dataHolder.getStatusCode(), null, dataHolder.getMetadata() != null ? (PendingIntent) dataHolder.getMetadata().getParcelable("pendingIntent") : null);
            if (status.isSuccess() || dataHolder == null) {
                dataHolder2 = dataHolder;
            } else {
                if (!dataHolder.isClosed()) {
                    dataHolder.close();
                }
                dataHolder2 = null;
            }
            C0866hs.this.mo3887a((C0571b<?>) new C0868b<Object>(this.f2139Dp, status, dataHolder2, str, str2));
        }
    }

    /* renamed from: com.google.android.gms.internal.hs$b */
    final class C0868b extends C0573d<C0157c<LoadMomentsResult>> implements LoadMomentsResult {

        /* renamed from: DN */
        private final String f2141DN;

        /* renamed from: DO */
        private MomentBuffer f2142DO;

        /* renamed from: jY */
        private final Status f2143jY;

        /* renamed from: qT */
        private final String f2144qT;

        public C0868b(C0157c<LoadMomentsResult> cVar, Status status, DataHolder dataHolder, String str, String str2) {
            super(cVar, dataHolder);
            this.f2143jY = status;
            this.f2144qT = str;
            this.f2141DN = str2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo3746a(C0157c<LoadMomentsResult> cVar, DataHolder dataHolder) {
            this.f2142DO = dataHolder != null ? new MomentBuffer(dataHolder) : null;
            cVar.mo2048a(this);
        }

        public MomentBuffer getMomentBuffer() {
            return this.f2142DO;
        }

        public String getNextPageToken() {
            return this.f2144qT;
        }

        public Status getStatus() {
            return this.f2143jY;
        }

        public String getUpdated() {
            return this.f2141DN;
        }

        public void release() {
            if (this.f2142DO != null) {
                this.f2142DO.close();
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.hs$c */
    final class C0869c extends C0853hn {

        /* renamed from: Dp */
        private final C0157c<LoadPeopleResult> f2146Dp;

        public C0869c(C0157c<LoadPeopleResult> cVar) {
            this.f2146Dp = cVar;
        }

        /* renamed from: a */
        public void mo4686a(DataHolder dataHolder, String str) {
            DataHolder dataHolder2;
            Status status = new Status(dataHolder.getStatusCode(), null, dataHolder.getMetadata() != null ? (PendingIntent) dataHolder.getMetadata().getParcelable("pendingIntent") : null);
            if (status.isSuccess() || dataHolder == null) {
                dataHolder2 = dataHolder;
            } else {
                if (!dataHolder.isClosed()) {
                    dataHolder.close();
                }
                dataHolder2 = null;
            }
            C0866hs.this.mo3887a((C0571b<?>) new C0870d<Object>(this.f2146Dp, status, dataHolder2, str));
        }
    }

    /* renamed from: com.google.android.gms.internal.hs$d */
    final class C0870d extends C0573d<C0157c<LoadPeopleResult>> implements LoadPeopleResult {

        /* renamed from: DP */
        private PersonBuffer f2148DP;

        /* renamed from: jY */
        private final Status f2149jY;

        /* renamed from: qT */
        private final String f2150qT;

        public C0870d(C0157c<LoadPeopleResult> cVar, Status status, DataHolder dataHolder, String str) {
            super(cVar, dataHolder);
            this.f2149jY = status;
            this.f2150qT = str;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo3746a(C0157c<LoadPeopleResult> cVar, DataHolder dataHolder) {
            this.f2148DP = dataHolder != null ? new PersonBuffer(dataHolder) : null;
            cVar.mo2048a(this);
        }

        public String getNextPageToken() {
            return this.f2150qT;
        }

        public PersonBuffer getPersonBuffer() {
            return this.f2148DP;
        }

        public Status getStatus() {
            return this.f2149jY;
        }

        public void release() {
            if (this.f2148DP != null) {
                this.f2148DP.close();
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.hs$e */
    final class C0871e extends C0853hn {

        /* renamed from: Dp */
        private final C0157c<Status> f2152Dp;

        public C0871e(C0157c<Status> cVar) {
            this.f2152Dp = cVar;
        }

        /* renamed from: b */
        public void mo4690b(int i, Bundle bundle) {
            C0866hs.this.mo3887a((C0571b<?>) new C0872f<Object>(this.f2152Dp, new Status(i, null, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null)));
        }
    }

    /* renamed from: com.google.android.gms.internal.hs$f */
    final class C0872f extends C0571b<C0157c<Status>> {

        /* renamed from: jY */
        private final Status f2154jY;

        public C0872f(C0157c<Status> cVar, Status status) {
            super(cVar);
            this.f2154jY = status;
        }

        /* access modifiers changed from: protected */
        /* renamed from: aL */
        public void mo3742aL() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void mo3743b(C0157c<Status> cVar) {
            C0866hs.this.disconnect();
            if (cVar != null) {
                cVar.mo2048a(this.f2154jY);
            }
        }
    }

    @Deprecated
    public C0866hs(Context context, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener, C0875hu huVar) {
        this(context, (GoogleApiClient.ConnectionCallbacks) new C0572c(connectionCallbacks), (GoogleApiClient.OnConnectionFailedListener) new C0576g(onConnectionFailedListener), huVar);
    }

    public C0866hs(Context context, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener, C0875hu huVar) {
        super(context, connectionCallbacks, onConnectionFailedListener, huVar.mo4748eR());
        this.f2137DL = huVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2637a(int i, IBinder iBinder, Bundle bundle) {
        if (i == 0 && bundle != null && bundle.containsKey("loaded_person")) {
            this.f2136DK = C0905ig.m2725g(bundle.getByteArray("loaded_person"));
        }
        super.mo2637a(i, iBinder, bundle);
    }

    /* renamed from: a */
    public void mo4724a(C0157c<LoadPeopleResult> cVar, int i, String str) {
        mo3889bP();
        C0869c cVar2 = new C0869c(cVar);
        try {
            ((C0863hr) mo3890bQ()).mo4705a(cVar2, 1, i, -1, str);
        } catch (RemoteException e) {
            cVar2.mo4686a(DataHolder.empty(8), null);
        }
    }

    /* renamed from: a */
    public void mo4725a(C0157c<LoadMomentsResult> cVar, int i, String str, Uri uri, String str2, String str3) {
        mo3889bP();
        C0867a aVar = cVar != null ? new C0867a(cVar) : null;
        try {
            ((C0863hr) mo3890bQ()).mo4706a(aVar, i, str, uri, str2, str3);
        } catch (RemoteException e) {
            aVar.mo4687a(DataHolder.empty(8), null, null);
        }
    }

    /* renamed from: a */
    public void mo4726a(C0157c<LoadPeopleResult> cVar, Collection<String> collection) {
        mo3889bP();
        C0869c cVar2 = new C0869c(cVar);
        try {
            ((C0863hr) mo3890bQ()).mo4710a((C0854ho) cVar2, (List<String>) new ArrayList<String>(collection));
        } catch (RemoteException e) {
            cVar2.mo4686a(DataHolder.empty(8), null);
        }
    }

    /* renamed from: a */
    public void mo4727a(C0157c<LoadPeopleResult> cVar, String[] strArr) {
        mo4726a(cVar, (Collection<String>) Arrays.asList(strArr));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2638a(C0590ec ecVar, C0574e eVar) throws RemoteException {
        Bundle bundle = new Bundle();
        bundle.putStringArray("request_visible_actions", this.f2137DL.mo4749eS());
        ecVar.mo3950a(eVar, GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE, this.f2137DL.mo4752eV(), this.f2137DL.mo4751eU(), mo3888bO(), this.f2137DL.getAccountName(), bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: am */
    public String mo2639am() {
        return "com.google.android.gms.plus.service.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: an */
    public String mo2640an() {
        return "com.google.android.gms.plus.internal.IPlusService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: ay */
    public C0863hr mo2643p(IBinder iBinder) {
        return C0864a.m2595ax(iBinder);
    }

    /* renamed from: az */
    public boolean mo4729az(String str) {
        return Arrays.asList(mo3888bO()).contains(str);
    }

    public void clearDefaultAccount() {
        mo3889bP();
        try {
            this.f2136DK = null;
            ((C0863hr) mo3890bQ()).clearDefaultAccount();
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    public String getAccountName() {
        mo3889bP();
        try {
            return ((C0863hr) mo3890bQ()).getAccountName();
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    public Person getCurrentPerson() {
        mo3889bP();
        return this.f2136DK;
    }

    /* renamed from: i */
    public void mo4733i(C0157c<LoadPeopleResult> cVar, String str) {
        mo4724a(cVar, 0, str);
    }

    /* renamed from: j */
    public void mo4734j(C0157c<LoadMomentsResult> cVar) {
        mo4725a(cVar, 20, null, null, null, "me");
    }

    /* renamed from: k */
    public void mo4735k(C0157c<LoadPeopleResult> cVar) {
        mo3889bP();
        C0869c cVar2 = new C0869c(cVar);
        try {
            ((C0863hr) mo3890bQ()).mo4705a(cVar2, 2, 1, -1, null);
        } catch (RemoteException e) {
            cVar2.mo4686a(DataHolder.empty(8), null);
        }
    }

    /* renamed from: l */
    public void mo4736l(C0157c<Status> cVar) {
        mo3889bP();
        clearDefaultAccount();
        C0871e eVar = new C0871e(cVar);
        try {
            ((C0863hr) mo3890bQ()).mo4711b(eVar);
        } catch (RemoteException e) {
            eVar.mo4690b(8, null);
        }
    }

    public void removeMoment(String momentId) {
        mo3889bP();
        try {
            ((C0863hr) mo3890bQ()).removeMoment(momentId);
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    public void writeMoment(Moment moment) {
        mo3889bP();
        try {
            ((C0863hr) mo3890bQ()).mo4703a(C0623ey.m1656a((C0902id) moment));
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }
}
