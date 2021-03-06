package com.google.android.gms.games.leaderboard;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.internal.C0596ee;
import com.google.android.gms.internal.C0596ee.C0598a;
import com.google.android.gms.internal.C0600eg;
import com.google.android.gms.internal.C0793ge;
import java.util.HashMap;

@Deprecated
public final class SubmitScoreResult {

    /* renamed from: wh */
    private static final String[] f701wh = {"leaderboardId", "playerId", "timeSpan", "hasResult", "rawScore", "formattedScore", "newBest", "scoreTag"};

    /* renamed from: mC */
    private int f702mC;

    /* renamed from: tC */
    private String f703tC;

    /* renamed from: vD */
    private String f704vD;

    /* renamed from: wi */
    private HashMap<Integer, Result> f705wi;

    public static final class Result {
        public final String formattedScore;
        public final boolean newBest;
        public final long rawScore;
        public final String scoreTag;

        public Result(long rawScore2, String formattedScore2, String scoreTag2, boolean newBest2) {
            this.rawScore = rawScore2;
            this.formattedScore = formattedScore2;
            this.scoreTag = scoreTag2;
            this.newBest = newBest2;
        }

        public String toString() {
            return C0596ee.m1542e(this).mo3971a("RawScore", Long.valueOf(this.rawScore)).mo3971a("FormattedScore", this.formattedScore).mo3971a("ScoreTag", this.scoreTag).mo3971a("NewBest", Boolean.valueOf(this.newBest)).toString();
        }
    }

    public SubmitScoreResult(int statusCode, String leaderboardId, String playerId) {
        this(statusCode, leaderboardId, playerId, new HashMap());
    }

    public SubmitScoreResult(int statusCode, String leaderboardId, String playerId, HashMap<Integer, Result> results) {
        this.f702mC = statusCode;
        this.f704vD = leaderboardId;
        this.f703tC = playerId;
        this.f705wi = results;
    }

    public SubmitScoreResult(DataHolder dataHolder) {
        this.f702mC = dataHolder.getStatusCode();
        this.f705wi = new HashMap<>();
        int count = dataHolder.getCount();
        C0600eg.m1556r(count == 3);
        for (int i = 0; i < count; i++) {
            int C = dataHolder.mo2371C(i);
            if (i == 0) {
                this.f704vD = dataHolder.getString("leaderboardId", i, C);
                this.f703tC = dataHolder.getString("playerId", i, C);
            }
            if (dataHolder.getBoolean("hasResult", i, C)) {
                m748a(new Result(dataHolder.getLong("rawScore", i, C), dataHolder.getString("formattedScore", i, C), dataHolder.getString("scoreTag", i, C), dataHolder.getBoolean("newBest", i, C)), dataHolder.getInteger("timeSpan", i, C));
            }
        }
    }

    /* renamed from: a */
    private void m748a(Result result, int i) {
        this.f705wi.put(Integer.valueOf(i), result);
    }

    public String getLeaderboardId() {
        return this.f704vD;
    }

    public String getPlayerId() {
        return this.f703tC;
    }

    public Result getScoreResult(int timeSpan) {
        return (Result) this.f705wi.get(Integer.valueOf(timeSpan));
    }

    public int getStatusCode() {
        return this.f702mC;
    }

    public String toString() {
        C0598a a = C0596ee.m1542e(this).mo3971a("PlayerId", this.f703tC).mo3971a("StatusCode", Integer.valueOf(this.f702mC));
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= 3) {
                return a.toString();
            }
            Result result = (Result) this.f705wi.get(Integer.valueOf(i2));
            a.mo3971a("TimesSpan", C0793ge.m2354aG(i2));
            a.mo3971a("Result", result == null ? "null" : result.toString());
            i = i2 + 1;
        }
    }
}
