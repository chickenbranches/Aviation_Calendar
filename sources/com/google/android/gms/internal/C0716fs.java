package com.google.android.gms.internal;

import android.content.Intent;
import com.google.android.gms.common.api.C0153a.C0157c;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.Games.C0280a;
import com.google.android.gms.games.achievement.AchievementBuffer;
import com.google.android.gms.games.achievement.Achievements;
import com.google.android.gms.games.achievement.Achievements.LoadAchievementsResult;
import com.google.android.gms.games.achievement.Achievements.UpdateAchievementResult;

/* renamed from: com.google.android.gms.internal.fs */
public final class C0716fs implements Achievements {

    /* renamed from: com.google.android.gms.internal.fs$a */
    private static abstract class C0726a extends C0280a<LoadAchievementsResult> {
        private C0726a() {
        }

        /* renamed from: t */
        public LoadAchievementsResult mo2067e(final Status status) {
            return new LoadAchievementsResult() {
                public AchievementBuffer getAchievements() {
                    return new AchievementBuffer(DataHolder.empty(14));
                }

                public Status getStatus() {
                    return status;
                }

                public void release() {
                }
            };
        }
    }

    /* renamed from: com.google.android.gms.internal.fs$b */
    private static abstract class C0728b extends C0280a<UpdateAchievementResult> {
        /* access modifiers changed from: private */

        /* renamed from: uS */
        public final String f1793uS;

        public C0728b(String str) {
            this.f1793uS = str;
        }

        /* renamed from: u */
        public UpdateAchievementResult mo2067e(final Status status) {
            return new UpdateAchievementResult() {
                public String getAchievementId() {
                    return C0728b.this.f1793uS;
                }

                public Status getStatus() {
                    return status;
                }
            };
        }
    }

    public Intent getAchievementsIntent(GoogleApiClient apiClient) {
        return Games.m645j(apiClient).getAchievementsIntent();
    }

    public void increment(GoogleApiClient apiClient, final String id, final int numSteps) {
        apiClient.mo2304b(new C0728b(id) {
            /* renamed from: a */
            public void mo2062a(C0639fl flVar) {
                flVar.mo4165a(null, id, numSteps);
            }
        });
    }

    public PendingResult<UpdateAchievementResult> incrementImmediate(GoogleApiClient apiClient, final String id, final int numSteps) {
        return apiClient.mo2304b(new C0728b(id) {
            /* renamed from: a */
            public void mo2062a(C0639fl flVar) {
                flVar.mo4165a((C0157c<UpdateAchievementResult>) this, id, numSteps);
            }
        });
    }

    public PendingResult<LoadAchievementsResult> load(GoogleApiClient apiClient, final boolean forceReload) {
        return apiClient.mo2303a(new C0726a() {
            /* renamed from: a */
            public void mo2062a(C0639fl flVar) {
                flVar.mo4180b((C0157c<LoadAchievementsResult>) this, forceReload);
            }
        });
    }

    public void reveal(GoogleApiClient apiClient, final String id) {
        apiClient.mo2304b(new C0728b(id) {
            /* renamed from: a */
            public void mo2062a(C0639fl flVar) {
                flVar.mo4177b(null, id);
            }
        });
    }

    public PendingResult<UpdateAchievementResult> revealImmediate(GoogleApiClient apiClient, final String id) {
        return apiClient.mo2304b(new C0728b(id) {
            /* renamed from: a */
            public void mo2062a(C0639fl flVar) {
                flVar.mo4177b((C0157c<UpdateAchievementResult>) this, id);
            }
        });
    }

    public void setSteps(GoogleApiClient apiClient, final String id, final int numSteps) {
        apiClient.mo2304b(new C0728b(id) {
            /* renamed from: a */
            public void mo2062a(C0639fl flVar) {
                flVar.mo4178b(null, id, numSteps);
            }
        });
    }

    public PendingResult<UpdateAchievementResult> setStepsImmediate(GoogleApiClient apiClient, final String id, final int numSteps) {
        return apiClient.mo2304b(new C0728b(id) {
            /* renamed from: a */
            public void mo2062a(C0639fl flVar) {
                flVar.mo4178b(this, id, numSteps);
            }
        });
    }

    public void unlock(GoogleApiClient apiClient, final String id) {
        apiClient.mo2304b(new C0728b(id) {
            /* renamed from: a */
            public void mo2062a(C0639fl flVar) {
                flVar.mo4181c(null, id);
            }
        });
    }

    public PendingResult<UpdateAchievementResult> unlockImmediate(GoogleApiClient apiClient, final String id) {
        return apiClient.mo2304b(new C0728b(id) {
            /* renamed from: a */
            public void mo2062a(C0639fl flVar) {
                flVar.mo4181c(this, id);
            }
        });
    }
}
