package com.google.android.gms.games.leaderboard;

import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.common.data.DataHolder;

public final class LeaderboardScoreBuffer extends DataBuffer<LeaderboardScore> {

    /* renamed from: vI */
    private final C0328c f695vI;

    public LeaderboardScoreBuffer(DataHolder dataHolder) {
        super(dataHolder);
        this.f695vI = new C0328c(dataHolder.getMetadata());
    }

    /* renamed from: dq */
    public C0328c mo3104dq() {
        return this.f695vI;
    }

    public LeaderboardScore get(int position) {
        return new C0330e(this.f299nE, position);
    }
}
