package com.google.android.gms.internal;

import android.content.Intent;
import com.google.android.gms.common.api.C0153a.C0157c;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.Games.C0280a;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerBuffer;
import com.google.android.gms.games.Players;
import com.google.android.gms.games.Players.LoadPlayersResult;

/* renamed from: com.google.android.gms.internal.fz */
public final class C0757fz implements Players {

    /* renamed from: com.google.android.gms.internal.fz$a */
    private static abstract class C0763a extends C0280a<LoadPlayersResult> {
        private C0763a() {
        }

        /* renamed from: B */
        public LoadPlayersResult mo2067e(final Status status) {
            return new LoadPlayersResult() {
                public PlayerBuffer getPlayers() {
                    return new PlayerBuffer(DataHolder.empty(14));
                }

                public Status getStatus() {
                    return status;
                }

                public void release() {
                }
            };
        }
    }

    public Player getCurrentPlayer(GoogleApiClient apiClient) {
        return Games.m645j(apiClient).getCurrentPlayer();
    }

    public String getCurrentPlayerId(GoogleApiClient apiClient) {
        return Games.m645j(apiClient).getCurrentPlayerId();
    }

    public Intent getPlayerSearchIntent(GoogleApiClient apiClient) {
        return Games.m645j(apiClient).getPlayerSearchIntent();
    }

    public PendingResult<LoadPlayersResult> loadInvitablePlayers(GoogleApiClient apiClient, final int pageSize, final boolean forceReload) {
        return apiClient.mo2303a(new C0763a() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo2062a(C0639fl flVar) {
                flVar.mo4161a((C0157c<LoadPlayersResult>) this, pageSize, false, forceReload);
            }
        });
    }

    public PendingResult<LoadPlayersResult> loadMoreInvitablePlayers(GoogleApiClient apiClient, final int pageSize) {
        return apiClient.mo2303a(new C0763a() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo2062a(C0639fl flVar) {
                flVar.mo4161a((C0157c<LoadPlayersResult>) this, pageSize, true, false);
            }
        });
    }

    public PendingResult<LoadPlayersResult> loadMoreRecentlyPlayedWithPlayers(GoogleApiClient apiClient, final int pageSize) {
        return apiClient.mo2303a(new C0763a() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo2062a(C0639fl flVar) {
                flVar.mo4167a((C0157c<LoadPlayersResult>) this, "playedWith", pageSize, true, false);
            }
        });
    }

    public PendingResult<LoadPlayersResult> loadPlayer(GoogleApiClient apiClient, final String playerId) {
        return apiClient.mo2303a(new C0763a() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo2062a(C0639fl flVar) {
                flVar.mo4164a((C0157c<LoadPlayersResult>) this, playerId);
            }
        });
    }

    public PendingResult<LoadPlayersResult> loadRecentlyPlayedWithPlayers(GoogleApiClient apiClient, final int pageSize, final boolean forceReload) {
        return apiClient.mo2303a(new C0763a() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo2062a(C0639fl flVar) {
                flVar.mo4167a((C0157c<LoadPlayersResult>) this, "playedWith", pageSize, false, forceReload);
            }
        });
    }
}
