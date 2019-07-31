package com.google.android.gms.games.leaderboard;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.common.data.C0161b;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.C0324d;
import com.google.android.gms.games.Player;

/* renamed from: com.google.android.gms.games.leaderboard.e */
public final class C0330e extends C0161b implements LeaderboardScore {

    /* renamed from: vU */
    private final C0324d f725vU;

    C0330e(DataHolder dataHolder, int i) {
        super(dataHolder, i);
        this.f725vU = new C0324d(dataHolder, i);
    }

    /* renamed from: ds */
    public LeaderboardScore freeze() {
        return new C0329d(this);
    }

    public boolean equals(Object obj) {
        return C0329d.m756a(this, obj);
    }

    public String getDisplayRank() {
        return getString("display_rank");
    }

    public void getDisplayRank(CharArrayBuffer dataOut) {
        mo2412a("display_rank", dataOut);
    }

    public String getDisplayScore() {
        return getString("display_score");
    }

    public void getDisplayScore(CharArrayBuffer dataOut) {
        mo2412a("display_score", dataOut);
    }

    public long getRank() {
        return getLong("rank");
    }

    public long getRawScore() {
        return getLong("raw_score");
    }

    public Player getScoreHolder() {
        if (mo2411M("external_player_id")) {
            return null;
        }
        return this.f725vU;
    }

    public String getScoreHolderDisplayName() {
        return mo2411M("external_player_id") ? getString("default_display_name") : this.f725vU.getDisplayName();
    }

    public void getScoreHolderDisplayName(CharArrayBuffer dataOut) {
        if (mo2411M("external_player_id")) {
            mo2412a("default_display_name", dataOut);
        } else {
            this.f725vU.getDisplayName(dataOut);
        }
    }

    public Uri getScoreHolderHiResImageUri() {
        if (mo2411M("external_player_id")) {
            return null;
        }
        return this.f725vU.getHiResImageUri();
    }

    public Uri getScoreHolderIconImageUri() {
        return mo2411M("external_player_id") ? mo2410L("default_display_image_uri") : this.f725vU.getIconImageUri();
    }

    public String getScoreTag() {
        return getString("score_tag");
    }

    public long getTimestampMillis() {
        return getLong("achieved_timestamp");
    }

    public int hashCode() {
        return C0329d.m755a(this);
    }

    public String toString() {
        return C0329d.m757b(this);
    }
}
