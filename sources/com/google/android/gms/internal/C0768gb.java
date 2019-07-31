package com.google.android.gms.internal;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.C0153a.C0157c;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.Games.C0280a;
import com.google.android.gms.games.multiplayer.ParticipantResult;
import com.google.android.gms.games.multiplayer.turnbased.LoadMatchesResponse;
import com.google.android.gms.games.multiplayer.turnbased.OnTurnBasedMatchUpdateReceivedListener;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatchConfig;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.CancelMatchResult;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.InitiateMatchResult;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.LeaveMatchResult;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.LoadMatchResult;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.LoadMatchesResult;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.UpdateMatchResult;
import java.util.List;

/* renamed from: com.google.android.gms.internal.gb */
public final class C0768gb implements TurnBasedMultiplayer {

    /* renamed from: com.google.android.gms.internal.gb$a */
    private static abstract class C0779a extends C0280a<CancelMatchResult> {
        /* access modifiers changed from: private */

        /* renamed from: uS */
        public final String f1882uS;

        public C0779a(String str) {
            this.f1882uS = str;
        }

        /* renamed from: C */
        public CancelMatchResult mo2067e(final Status status) {
            return new CancelMatchResult() {
                public String getMatchId() {
                    return C0779a.this.f1882uS;
                }

                public Status getStatus() {
                    return status;
                }
            };
        }
    }

    /* renamed from: com.google.android.gms.internal.gb$b */
    private static abstract class C0781b extends C0280a<InitiateMatchResult> {
        private C0781b() {
        }

        /* renamed from: D */
        public InitiateMatchResult mo2067e(final Status status) {
            return new InitiateMatchResult() {
                public TurnBasedMatch getMatch() {
                    return null;
                }

                public Status getStatus() {
                    return status;
                }
            };
        }
    }

    /* renamed from: com.google.android.gms.internal.gb$c */
    private static abstract class C0783c extends C0280a<LeaveMatchResult> {
        private C0783c() {
        }

        /* renamed from: E */
        public LeaveMatchResult mo2067e(final Status status) {
            return new LeaveMatchResult() {
                public TurnBasedMatch getMatch() {
                    return null;
                }

                public Status getStatus() {
                    return status;
                }
            };
        }
    }

    /* renamed from: com.google.android.gms.internal.gb$d */
    private static abstract class C0785d extends C0280a<LoadMatchResult> {
        private C0785d() {
        }

        /* renamed from: F */
        public LoadMatchResult mo2067e(final Status status) {
            return new LoadMatchResult() {
                public TurnBasedMatch getMatch() {
                    return null;
                }

                public Status getStatus() {
                    return status;
                }
            };
        }
    }

    /* renamed from: com.google.android.gms.internal.gb$e */
    private static abstract class C0787e extends C0280a<LoadMatchesResult> {
        private C0787e() {
        }

        /* renamed from: G */
        public LoadMatchesResult mo2067e(final Status status) {
            return new LoadMatchesResult() {
                public LoadMatchesResponse getMatches() {
                    return new LoadMatchesResponse(new Bundle());
                }

                public Status getStatus() {
                    return status;
                }

                public void release() {
                }
            };
        }
    }

    /* renamed from: com.google.android.gms.internal.gb$f */
    private static abstract class C0789f extends C0280a<UpdateMatchResult> {
        private C0789f() {
        }

        /* renamed from: H */
        public UpdateMatchResult mo2067e(final Status status) {
            return new UpdateMatchResult() {
                public TurnBasedMatch getMatch() {
                    return null;
                }

                public Status getStatus() {
                    return status;
                }
            };
        }
    }

    public PendingResult<InitiateMatchResult> acceptInvitation(GoogleApiClient apiClient, final String invitationId) {
        return apiClient.mo2304b(new C0781b() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo2062a(C0639fl flVar) {
                flVar.mo4188e(this, invitationId);
            }
        });
    }

    public PendingResult<CancelMatchResult> cancelMatch(GoogleApiClient apiClient, final String matchId) {
        return apiClient.mo2304b(new C0779a(matchId) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo2062a(C0639fl flVar) {
                flVar.mo4191g(this, matchId);
            }
        });
    }

    public PendingResult<InitiateMatchResult> createMatch(GoogleApiClient apiClient, final TurnBasedMatchConfig config) {
        return apiClient.mo2304b(new C0781b() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo2062a(C0639fl flVar) {
                flVar.mo4163a((C0157c<InitiateMatchResult>) this, config);
            }
        });
    }

    public void declineInvitation(GoogleApiClient apiClient, String invitationId) {
        Games.m645j(apiClient).mo4212j(invitationId, 1);
    }

    public void dismissInvitation(GoogleApiClient apiClient, String invitationId) {
        Games.m645j(apiClient).mo4211i(invitationId, 1);
    }

    public void dismissMatch(GoogleApiClient apiClient, String matchId) {
        Games.m645j(apiClient).dismissTurnBasedMatch(matchId);
    }

    public PendingResult<UpdateMatchResult> finishMatch(GoogleApiClient apiClient, String matchId) {
        return finishMatch(apiClient, matchId, (byte[]) null, (ParticipantResult[]) null);
    }

    public PendingResult<UpdateMatchResult> finishMatch(GoogleApiClient apiClient, String matchId, byte[] matchData, List<ParticipantResult> results) {
        return finishMatch(apiClient, matchId, matchData, results == null ? null : (ParticipantResult[]) results.toArray(new ParticipantResult[results.size()]));
    }

    public PendingResult<UpdateMatchResult> finishMatch(GoogleApiClient apiClient, final String matchId, final byte[] matchData, final ParticipantResult... results) {
        return apiClient.mo2304b(new C0789f() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo2062a(C0639fl flVar) {
                flVar.mo4173a((C0157c<UpdateMatchResult>) this, matchId, matchData, results);
            }
        });
    }

    public Intent getInboxIntent(GoogleApiClient apiClient) {
        return Games.m645j(apiClient).getMatchInboxIntent();
    }

    public int getMaxMatchDataSize(GoogleApiClient apiClient) {
        return Games.m645j(apiClient).getMaxTurnBasedMatchDataSize();
    }

    public Intent getSelectOpponentsIntent(GoogleApiClient apiClient, int minPlayers, int maxPlayers) {
        return Games.m645j(apiClient).getTurnBasedSelectOpponentsIntent(minPlayers, maxPlayers, true);
    }

    public Intent getSelectOpponentsIntent(GoogleApiClient apiClient, int minPlayers, int maxPlayers, boolean allowAutomatch) {
        return Games.m645j(apiClient).getTurnBasedSelectOpponentsIntent(minPlayers, maxPlayers, allowAutomatch);
    }

    public PendingResult<LeaveMatchResult> leaveMatch(GoogleApiClient apiClient, final String matchId) {
        return apiClient.mo2304b(new C0783c() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo2062a(C0639fl flVar) {
                flVar.mo4189f(this, matchId);
            }
        });
    }

    public PendingResult<LeaveMatchResult> leaveMatchDuringTurn(GoogleApiClient apiClient, final String matchId, final String pendingParticipantId) {
        return apiClient.mo2304b(new C0783c() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo2062a(C0639fl flVar) {
                flVar.mo4169a((C0157c<LeaveMatchResult>) this, matchId, pendingParticipantId);
            }
        });
    }

    public PendingResult<LoadMatchResult> loadMatch(GoogleApiClient apiClient, final String matchId) {
        return apiClient.mo2303a(new C0785d() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo2062a(C0639fl flVar) {
                flVar.mo4210h(this, matchId);
            }
        });
    }

    public PendingResult<LoadMatchesResult> loadMatchesByStatus(GoogleApiClient apiClient, final int... matchTurnStatuses) {
        return apiClient.mo2303a(new C0787e() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo2062a(C0639fl flVar) {
                flVar.mo4175a((C0157c<LoadMatchesResult>) this, matchTurnStatuses);
            }
        });
    }

    public void registerMatchUpdateListener(GoogleApiClient apiClient, OnTurnBasedMatchUpdateReceivedListener listener) {
        Games.m645j(apiClient).registerMatchUpdateListener(listener);
    }

    public PendingResult<InitiateMatchResult> rematch(GoogleApiClient apiClient, final String matchId) {
        return apiClient.mo2304b(new C0781b() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo2062a(C0639fl flVar) {
                flVar.mo4184d(this, matchId);
            }
        });
    }

    public PendingResult<UpdateMatchResult> takeTurn(GoogleApiClient apiClient, String matchId, byte[] matchData, String pendingParticipantId) {
        return takeTurn(apiClient, matchId, matchData, pendingParticipantId, (ParticipantResult[]) null);
    }

    public PendingResult<UpdateMatchResult> takeTurn(GoogleApiClient apiClient, String matchId, byte[] matchData, String pendingParticipantId, List<ParticipantResult> results) {
        return takeTurn(apiClient, matchId, matchData, pendingParticipantId, results == null ? null : (ParticipantResult[]) results.toArray(new ParticipantResult[results.size()]));
    }

    public PendingResult<UpdateMatchResult> takeTurn(GoogleApiClient apiClient, String matchId, byte[] matchData, String pendingParticipantId, ParticipantResult... results) {
        final String str = matchId;
        final byte[] bArr = matchData;
        final String str2 = pendingParticipantId;
        final ParticipantResult[] participantResultArr = results;
        return apiClient.mo2304b(new C0789f() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo2062a(C0639fl flVar) {
                flVar.mo4172a((C0157c<UpdateMatchResult>) this, str, bArr, str2, participantResultArr);
            }
        });
    }

    public void unregisterMatchUpdateListener(GoogleApiClient apiClient) {
        Games.m645j(apiClient).unregisterMatchUpdateListener();
    }
}
