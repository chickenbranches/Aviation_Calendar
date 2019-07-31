package com.google.android.gms.internal;

import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.Games.C0280a;
import com.google.android.gms.games.multiplayer.InvitationBuffer;
import com.google.android.gms.games.multiplayer.Invitations;
import com.google.android.gms.games.multiplayer.Invitations.LoadInvitationsResult;
import com.google.android.gms.games.multiplayer.OnInvitationReceivedListener;

/* renamed from: com.google.android.gms.internal.fv */
public final class C0735fv implements Invitations {

    /* renamed from: com.google.android.gms.internal.fv$a */
    private static abstract class C0737a extends C0280a<LoadInvitationsResult> {
        private C0737a() {
        }

        /* renamed from: w */
        public LoadInvitationsResult mo2067e(final Status status) {
            return new LoadInvitationsResult() {
                public InvitationBuffer getInvitations() {
                    return new InvitationBuffer(DataHolder.empty(14));
                }

                public Status getStatus() {
                    return status;
                }

                public void release() {
                }
            };
        }
    }

    public Intent getInvitationInboxIntent(GoogleApiClient apiClient) {
        return Games.m645j(apiClient).getInvitationInboxIntent();
    }

    public PendingResult<LoadInvitationsResult> loadInvitations(GoogleApiClient apiClient) {
        return apiClient.mo2303a(new C0737a() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo2062a(C0639fl flVar) {
                flVar.mo4209h(this);
            }
        });
    }

    public void registerInvitationListener(GoogleApiClient apiClient, OnInvitationReceivedListener listener) {
        Games.m645j(apiClient).registerInvitationListener(listener);
    }

    public void unregisterInvitationListener(GoogleApiClient apiClient) {
        Games.m645j(apiClient).unregisterInvitationListener();
    }
}
