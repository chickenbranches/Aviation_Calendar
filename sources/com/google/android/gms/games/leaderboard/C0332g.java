package com.google.android.gms.games.leaderboard;

import com.google.android.gms.common.data.C0161b;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: com.google.android.gms.games.leaderboard.g */
public final class C0332g extends C0161b implements LeaderboardVariant {
    C0332g(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    /* renamed from: dt */
    public String mo3105dt() {
        return getString("top_page_token_next");
    }

    /* renamed from: du */
    public String mo3106du() {
        return getString("window_page_token_prev");
    }

    /* renamed from: dv */
    public String mo3107dv() {
        return getString("window_page_token_next");
    }

    /* renamed from: dw */
    public LeaderboardVariant freeze() {
        return new C0331f(this);
    }

    public boolean equals(Object obj) {
        return C0331f.m761a(this, obj);
    }

    public int getCollection() {
        return getInteger("collection");
    }

    public String getDisplayPlayerRank() {
        return getString("player_display_rank");
    }

    public String getDisplayPlayerScore() {
        return getString("player_display_score");
    }

    public long getNumScores() {
        if (mo2411M("total_scores")) {
            return -1;
        }
        return getLong("total_scores");
    }

    public long getPlayerRank() {
        if (mo2411M("player_rank")) {
            return -1;
        }
        return getLong("player_rank");
    }

    public String getPlayerScoreTag() {
        return getString("player_score_tag");
    }

    public long getRawPlayerScore() {
        if (mo2411M("player_raw_score")) {
            return -1;
        }
        return getLong("player_raw_score");
    }

    public int getTimeSpan() {
        return getInteger("timespan");
    }

    public boolean hasPlayerInfo() {
        return !mo2411M("player_raw_score");
    }

    public int hashCode() {
        return C0331f.m760a(this);
    }

    public String toString() {
        return C0331f.m762b(this);
    }
}
