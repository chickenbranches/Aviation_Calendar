package com.google.android.gms.internal;

import com.google.android.gms.common.api.Api.C0145b;
import com.google.android.gms.common.api.C0153a.C0157c;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.plus.People;
import com.google.android.gms.plus.People.LoadPeopleResult;
import com.google.android.gms.plus.Plus;
import com.google.android.gms.plus.Plus.C1102a;
import com.google.android.gms.plus.model.people.Person;
import com.google.android.gms.plus.model.people.PersonBuffer;
import java.util.Collection;

/* renamed from: com.google.android.gms.internal.ia */
public final class C0892ia implements People {

    /* renamed from: Ea */
    private final C0145b<C0866hs> f2190Ea;

    /* renamed from: com.google.android.gms.internal.ia$a */
    private static abstract class C0898a extends C1102a<LoadPeopleResult> {
        C0898a(C0145b<C0866hs> bVar) {
            super(bVar);
        }

        /* renamed from: L */
        public LoadPeopleResult mo2067e(final Status status) {
            return new LoadPeopleResult() {
                public String getNextPageToken() {
                    return null;
                }

                public PersonBuffer getPersonBuffer() {
                    return null;
                }

                public Status getStatus() {
                    return status;
                }

                public void release() {
                }
            };
        }
    }

    public C0892ia(C0145b<C0866hs> bVar) {
        this.f2190Ea = bVar;
    }

    public Person getCurrentPerson(GoogleApiClient googleApiClient) {
        return Plus.m3234a(googleApiClient, this.f2190Ea).getCurrentPerson();
    }

    public PendingResult<LoadPeopleResult> load(GoogleApiClient googleApiClient, final Collection<String> personIds) {
        return googleApiClient.mo2303a(new C0898a(this.f2190Ea) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo2062a(C0866hs hsVar) {
                hsVar.mo4726a((C0157c<LoadPeopleResult>) this, personIds);
            }
        });
    }

    public PendingResult<LoadPeopleResult> load(GoogleApiClient googleApiClient, final String... personIds) {
        return googleApiClient.mo2303a(new C0898a(this.f2190Ea) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo2062a(C0866hs hsVar) {
                hsVar.mo4727a((C0157c<LoadPeopleResult>) this, personIds);
            }
        });
    }

    public PendingResult<LoadPeopleResult> loadConnected(GoogleApiClient googleApiClient) {
        return googleApiClient.mo2303a(new C0898a(this.f2190Ea) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo2062a(C0866hs hsVar) {
                hsVar.mo4735k(this);
            }
        });
    }

    public PendingResult<LoadPeopleResult> loadVisible(GoogleApiClient googleApiClient, final int orderBy, final String pageToken) {
        return googleApiClient.mo2303a(new C0898a(this.f2190Ea) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo2062a(C0866hs hsVar) {
                hsVar.mo4724a((C0157c<LoadPeopleResult>) this, orderBy, pageToken);
            }
        });
    }

    public PendingResult<LoadPeopleResult> loadVisible(GoogleApiClient googleApiClient, final String pageToken) {
        return googleApiClient.mo2303a(new C0898a(this.f2190Ea) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo2062a(C0866hs hsVar) {
                hsVar.mo4733i(this, pageToken);
            }
        });
    }
}
