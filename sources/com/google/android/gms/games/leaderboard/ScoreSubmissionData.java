package com.google.android.gms.games.leaderboard;

import android.content.ContentValues;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.DataHolder.Builder;
import com.google.android.gms.internal.C0596ee;
import com.google.android.gms.internal.C0596ee.C0598a;
import com.google.android.gms.internal.C0600eg;
import com.google.android.gms.internal.C0793ge;
import java.util.HashMap;

public final class ScoreSubmissionData {

    /* renamed from: wh */
    private static final String[] f696wh = {"leaderboardId", "playerId", "timeSpan", "hasResult", "rawScore", "formattedScore", "newBest", "scoreTag"};

    /* renamed from: mC */
    private int f697mC;

    /* renamed from: tC */
    private String f698tC;

    /* renamed from: vD */
    private String f699vD;

    /* renamed from: wi */
    private HashMap<Integer, Result> f700wi = new HashMap<>();

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

    public ScoreSubmissionData(DataHolder dataHolder) {
        this.f697mC = dataHolder.getStatusCode();
        int count = dataHolder.getCount();
        C0600eg.m1556r(count == 3);
        for (int i = 0; i < count; i++) {
            int C = dataHolder.mo2371C(i);
            if (i == 0) {
                this.f699vD = dataHolder.getString("leaderboardId", i, C);
                this.f698tC = dataHolder.getString("playerId", i, C);
            }
            if (dataHolder.getBoolean("hasResult", i, C)) {
                m745a(new Result(dataHolder.getLong("rawScore", i, C), dataHolder.getString("formattedScore", i, C), dataHolder.getString("scoreTag", i, C), dataHolder.getBoolean("newBest", i, C)), dataHolder.getInteger("timeSpan", i, C));
            }
        }
    }

    /* renamed from: a */
    private void m745a(Result result, int i) {
        this.f700wi.put(Integer.valueOf(i), result);
    }

    /* renamed from: aH */
    private ContentValues m746aH(int i) {
        Result scoreResult = getScoreResult(i);
        ContentValues contentValues = new ContentValues();
        contentValues.put("leaderboardId", this.f699vD);
        contentValues.put("playerId", this.f698tC);
        contentValues.put("timeSpan", Integer.valueOf(i));
        if (scoreResult != null) {
            contentValues.put("rawScore", Long.valueOf(scoreResult.rawScore));
            contentValues.put("formattedScore", scoreResult.formattedScore);
            contentValues.put("scoreTag", scoreResult.scoreTag);
            contentValues.put("newBest", Boolean.valueOf(scoreResult.newBest));
            contentValues.put("hasResult", Boolean.valueOf(true));
        } else {
            contentValues.put("hasResult", Boolean.valueOf(false));
        }
        return contentValues;
    }

    /* renamed from: dx */
    public DataHolder mo3140dx() {
        Builder builder = DataHolder.builder(f696wh);
        for (int i = 0; i < 3; i++) {
            builder.withRow(m746aH(i));
        }
        return builder.build(this.f697mC);
    }

    public String getLeaderboardId() {
        return this.f699vD;
    }

    public String getPlayerId() {
        return this.f698tC;
    }

    public Result getScoreResult(int timeSpan) {
        return (Result) this.f700wi.get(Integer.valueOf(timeSpan));
    }

    public String toString() {
        C0598a a = C0596ee.m1542e(this).mo3971a("PlayerId", this.f698tC).mo3971a("StatusCode", Integer.valueOf(this.f697mC));
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= 3) {
                return a.toString();
            }
            Result result = (Result) this.f700wi.get(Integer.valueOf(i2));
            a.mo3971a("TimesSpan", C0793ge.m2354aG(i2));
            a.mo3971a("Result", result == null ? "null" : result.toString());
            i = i2 + 1;
        }
    }
}
