package com.google.android.gms.internal;

import android.content.Intent;
import com.google.android.gms.common.api.C0153a.C0157c;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.Games.C0280a;
import com.google.android.gms.games.leaderboard.Leaderboard;
import com.google.android.gms.games.leaderboard.LeaderboardBuffer;
import com.google.android.gms.games.leaderboard.LeaderboardScore;
import com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer;
import com.google.android.gms.games.leaderboard.Leaderboards;
import com.google.android.gms.games.leaderboard.Leaderboards.LeaderboardMetadataResult;
import com.google.android.gms.games.leaderboard.Leaderboards.LoadPlayerScoreResult;
import com.google.android.gms.games.leaderboard.Leaderboards.LoadScoresResult;
import com.google.android.gms.games.leaderboard.Leaderboards.SubmitScoreResult;
import com.google.android.gms.games.leaderboard.ScoreSubmissionData;

/* renamed from: com.google.android.gms.internal.fw */
public final class C0739fw implements Leaderboards {

    /* renamed from: com.google.android.gms.internal.fw$a */
    private static abstract class C0747a extends C0280a<LeaderboardMetadataResult> {
        private C0747a() {
        }

        /* renamed from: x */
        public LeaderboardMetadataResult mo2067e(final Status status) {
            return new LeaderboardMetadataResult() {
                public LeaderboardBuffer getLeaderboards() {
                    return new LeaderboardBuffer(DataHolder.empty(14));
                }

                public Status getStatus() {
                    return status;
                }

                public void release() {
                }
            };
        }
    }

    /* renamed from: com.google.android.gms.internal.fw$b */
    private static abstract class C0749b extends C0280a<LoadPlayerScoreResult> {
        private C0749b() {
        }

        /* renamed from: y */
        public LoadPlayerScoreResult mo2067e(final Status status) {
            return new LoadPlayerScoreResult() {
                public LeaderboardScore getScore() {
                    return null;
                }

                public Status getStatus() {
                    return status;
                }
            };
        }
    }

    /* renamed from: com.google.android.gms.internal.fw$c */
    private static abstract class C0751c extends C0280a<LoadScoresResult> {
        private C0751c() {
        }

        /* renamed from: z */
        public LoadScoresResult mo2067e(final Status status) {
            return new LoadScoresResult() {
                public Leaderboard getLeaderboard() {
                    return null;
                }

                public LeaderboardScoreBuffer getScores() {
                    return new LeaderboardScoreBuffer(DataHolder.empty(14));
                }

                public Status getStatus() {
                    return status;
                }

                public void release() {
                }
            };
        }
    }

    /* renamed from: com.google.android.gms.internal.fw$d */
    protected static abstract class C0753d extends C0280a<SubmitScoreResult> {
        protected C0753d() {
        }

        /* renamed from: A */
        public SubmitScoreResult mo2067e(final Status status) {
            return new SubmitScoreResult() {
                public ScoreSubmissionData getScoreData() {
                    return new ScoreSubmissionData(DataHolder.empty(14));
                }

                public Status getStatus() {
                    return status;
                }

                public void release() {
                }
            };
        }
    }

    public Intent getAllLeaderboardsIntent(GoogleApiClient apiClient) {
        return Games.m645j(apiClient).getAllLeaderboardsIntent();
    }

    public Intent getLeaderboardIntent(GoogleApiClient apiClient, String leaderboardId) {
        return Games.m645j(apiClient).getLeaderboardIntent(leaderboardId);
    }

    public PendingResult<LoadPlayerScoreResult> loadCurrentPlayerLeaderboardScore(GoogleApiClient apiClient, final String leaderboardId, final int span, final int leaderboardCollection) {
        return apiClient.mo2303a(new C0749b() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo2062a(C0639fl flVar) {
                flVar.mo4170a((C0157c<LoadPlayerScoreResult>) this, (String) null, leaderboardId, span, leaderboardCollection);
            }
        });
    }

    public PendingResult<LeaderboardMetadataResult> loadLeaderboardMetadata(GoogleApiClient apiClient, final String leaderboardId, final boolean forceReload) {
        return apiClient.mo2303a(new C0747a() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo2062a(C0639fl flVar) {
                flVar.mo4171a((C0157c<LeaderboardMetadataResult>) this, leaderboardId, forceReload);
            }
        });
    }

    public PendingResult<LeaderboardMetadataResult> loadLeaderboardMetadata(GoogleApiClient apiClient, final boolean forceReload) {
        return apiClient.mo2303a(new C0747a() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo2062a(C0639fl flVar) {
                flVar.mo4174a((C0157c<LeaderboardMetadataResult>) this, forceReload);
            }
        });
    }

    public PendingResult<LoadScoresResult> loadMoreScores(GoogleApiClient apiClient, final LeaderboardScoreBuffer buffer, final int maxResults, final int pageDirection) {
        return apiClient.mo2303a(new C0751c() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo2062a(C0639fl flVar) {
                flVar.mo4162a((C0157c<LoadScoresResult>) this, buffer, maxResults, pageDirection);
            }
        });
    }

    public PendingResult<LoadScoresResult> loadPlayerCenteredScores(GoogleApiClient apiClient, String leaderboardId, int span, int leaderboardCollection, int maxResults) {
        return loadPlayerCenteredScores(apiClient, leaderboardId, span, leaderboardCollection, maxResults, false);
    }

    public PendingResult<LoadScoresResult> loadPlayerCenteredScores(GoogleApiClient apiClient, String leaderboardId, int span, int leaderboardCollection, int maxResults, boolean forceReload) {
        final String str = leaderboardId;
        final int i = span;
        final int i2 = leaderboardCollection;
        final int i3 = maxResults;
        final boolean z = forceReload;
        return apiClient.mo2303a(new C0751c() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo2062a(C0639fl flVar) {
                flVar.mo4179b(this, str, i, i2, i3, z);
            }
        });
    }

    public PendingResult<LoadScoresResult> loadTopScores(GoogleApiClient apiClient, String leaderboardId, int span, int leaderboardCollection, int maxResults) {
        return loadTopScores(apiClient, leaderboardId, span, leaderboardCollection, maxResults, false);
    }

    public PendingResult<LoadScoresResult> loadTopScores(GoogleApiClient apiClient, String leaderboardId, int span, int leaderboardCollection, int maxResults, boolean forceReload) {
        final String str = leaderboardId;
        final int i = span;
        final int i2 = leaderboardCollection;
        final int i3 = maxResults;
        final boolean z = forceReload;
        return apiClient.mo2303a(new C0751c() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo2062a(C0639fl flVar) {
                flVar.mo4166a(this, str, i, i2, i3, z);
            }
        });
    }

    public void submitScore(GoogleApiClient apiClient, String leaderboardId, long score) {
        submitScore(apiClient, leaderboardId, score, null);
    }

    public void submitScore(GoogleApiClient apiClient, String leaderboardId, long score, String scoreTag) {
        Games.m645j(apiClient).mo4168a(null, leaderboardId, score, scoreTag);
    }

    public PendingResult<SubmitScoreResult> submitScoreImmediate(GoogleApiClient apiClient, String leaderboardId, long score) {
        return submitScoreImmediate(apiClient, leaderboardId, score, null);
    }

    public PendingResult<SubmitScoreResult> submitScoreImmediate(GoogleApiClient apiClient, String leaderboardId, long score, String scoreTag) {
        final String str = leaderboardId;
        final long j = score;
        final String str2 = scoreTag;
        return apiClient.mo2304b(new C0753d() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo2062a(C0639fl flVar) {
                flVar.mo4168a((C0157c<SubmitScoreResult>) this, str, j, str2);
            }
        });
    }
}
