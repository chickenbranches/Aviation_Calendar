package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameBuffer;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.Games.C0280a;
import com.google.android.gms.games.GamesMetadata;
import com.google.android.gms.games.GamesMetadata.LoadGamesResult;

/* renamed from: com.google.android.gms.internal.fu */
public final class C0731fu implements GamesMetadata {

    /* renamed from: com.google.android.gms.internal.fu$a */
    private static abstract class C0733a extends C0280a<LoadGamesResult> {
        private C0733a() {
        }

        /* renamed from: v */
        public LoadGamesResult mo2067e(final Status status) {
            return new LoadGamesResult() {
                public GameBuffer getGames() {
                    return new GameBuffer(DataHolder.empty(14));
                }

                public Status getStatus() {
                    return status;
                }

                public void release() {
                }
            };
        }
    }

    public Game getCurrentGame(GoogleApiClient apiClient) {
        return Games.m645j(apiClient).getCurrentGame();
    }

    public PendingResult<LoadGamesResult> loadGame(GoogleApiClient apiClient) {
        return apiClient.mo2303a(new C0733a() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo2062a(C0639fl flVar) {
                flVar.mo4190g(this);
            }
        });
    }
}
