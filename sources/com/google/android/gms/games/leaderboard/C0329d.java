package com.google.android.gms.games.leaderboard;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.internal.C0596ee;
import com.google.android.gms.internal.C0600eg;
import com.google.android.gms.internal.C0629fc;

/* renamed from: com.google.android.gms.games.leaderboard.d */
public final class C0329d implements LeaderboardScore {

    /* renamed from: vK */
    private final long f715vK;

    /* renamed from: vL */
    private final String f716vL;

    /* renamed from: vM */
    private final String f717vM;

    /* renamed from: vN */
    private final long f718vN;

    /* renamed from: vO */
    private final long f719vO;

    /* renamed from: vP */
    private final String f720vP;

    /* renamed from: vQ */
    private final Uri f721vQ;

    /* renamed from: vR */
    private final Uri f722vR;

    /* renamed from: vS */
    private final PlayerEntity f723vS;

    /* renamed from: vT */
    private final String f724vT;

    public C0329d(LeaderboardScore leaderboardScore) {
        this.f715vK = leaderboardScore.getRank();
        this.f716vL = (String) C0600eg.m1554f(leaderboardScore.getDisplayRank());
        this.f717vM = (String) C0600eg.m1554f(leaderboardScore.getDisplayScore());
        this.f718vN = leaderboardScore.getRawScore();
        this.f719vO = leaderboardScore.getTimestampMillis();
        this.f720vP = leaderboardScore.getScoreHolderDisplayName();
        this.f721vQ = leaderboardScore.getScoreHolderIconImageUri();
        this.f722vR = leaderboardScore.getScoreHolderHiResImageUri();
        Player scoreHolder = leaderboardScore.getScoreHolder();
        this.f723vS = scoreHolder == null ? null : (PlayerEntity) scoreHolder.freeze();
        this.f724vT = leaderboardScore.getScoreTag();
    }

    /* renamed from: a */
    static int m755a(LeaderboardScore leaderboardScore) {
        return C0596ee.hashCode(Long.valueOf(leaderboardScore.getRank()), leaderboardScore.getDisplayRank(), Long.valueOf(leaderboardScore.getRawScore()), leaderboardScore.getDisplayScore(), Long.valueOf(leaderboardScore.getTimestampMillis()), leaderboardScore.getScoreHolderDisplayName(), leaderboardScore.getScoreHolderIconImageUri(), leaderboardScore.getScoreHolderHiResImageUri(), leaderboardScore.getScoreHolder());
    }

    /* renamed from: a */
    static boolean m756a(LeaderboardScore leaderboardScore, Object obj) {
        if (!(obj instanceof LeaderboardScore)) {
            return false;
        }
        if (leaderboardScore == obj) {
            return true;
        }
        LeaderboardScore leaderboardScore2 = (LeaderboardScore) obj;
        return C0596ee.equal(Long.valueOf(leaderboardScore2.getRank()), Long.valueOf(leaderboardScore.getRank())) && C0596ee.equal(leaderboardScore2.getDisplayRank(), leaderboardScore.getDisplayRank()) && C0596ee.equal(Long.valueOf(leaderboardScore2.getRawScore()), Long.valueOf(leaderboardScore.getRawScore())) && C0596ee.equal(leaderboardScore2.getDisplayScore(), leaderboardScore.getDisplayScore()) && C0596ee.equal(Long.valueOf(leaderboardScore2.getTimestampMillis()), Long.valueOf(leaderboardScore.getTimestampMillis())) && C0596ee.equal(leaderboardScore2.getScoreHolderDisplayName(), leaderboardScore.getScoreHolderDisplayName()) && C0596ee.equal(leaderboardScore2.getScoreHolderIconImageUri(), leaderboardScore.getScoreHolderIconImageUri()) && C0596ee.equal(leaderboardScore2.getScoreHolderHiResImageUri(), leaderboardScore.getScoreHolderHiResImageUri()) && C0596ee.equal(leaderboardScore2.getScoreHolder(), leaderboardScore.getScoreHolder()) && C0596ee.equal(leaderboardScore2.getScoreTag(), leaderboardScore.getScoreTag());
    }

    /* renamed from: b */
    static String m757b(LeaderboardScore leaderboardScore) {
        return C0596ee.m1542e(leaderboardScore).mo3971a("Rank", Long.valueOf(leaderboardScore.getRank())).mo3971a("DisplayRank", leaderboardScore.getDisplayRank()).mo3971a("Score", Long.valueOf(leaderboardScore.getRawScore())).mo3971a("DisplayScore", leaderboardScore.getDisplayScore()).mo3971a("Timestamp", Long.valueOf(leaderboardScore.getTimestampMillis())).mo3971a("DisplayName", leaderboardScore.getScoreHolderDisplayName()).mo3971a("IconImageUri", leaderboardScore.getScoreHolderIconImageUri()).mo3971a("HiResImageUri", leaderboardScore.getScoreHolderHiResImageUri()).mo3971a("Player", leaderboardScore.getScoreHolder() == null ? null : leaderboardScore.getScoreHolder()).mo3971a("ScoreTag", leaderboardScore.getScoreTag()).toString();
    }

    /* renamed from: ds */
    public LeaderboardScore freeze() {
        return this;
    }

    public boolean equals(Object obj) {
        return m756a(this, obj);
    }

    public String getDisplayRank() {
        return this.f716vL;
    }

    public void getDisplayRank(CharArrayBuffer dataOut) {
        C0629fc.m1697b(this.f716vL, dataOut);
    }

    public String getDisplayScore() {
        return this.f717vM;
    }

    public void getDisplayScore(CharArrayBuffer dataOut) {
        C0629fc.m1697b(this.f717vM, dataOut);
    }

    public long getRank() {
        return this.f715vK;
    }

    public long getRawScore() {
        return this.f718vN;
    }

    public Player getScoreHolder() {
        return this.f723vS;
    }

    public String getScoreHolderDisplayName() {
        return this.f723vS == null ? this.f720vP : this.f723vS.getDisplayName();
    }

    public void getScoreHolderDisplayName(CharArrayBuffer dataOut) {
        if (this.f723vS == null) {
            C0629fc.m1697b(this.f720vP, dataOut);
        } else {
            this.f723vS.getDisplayName(dataOut);
        }
    }

    public Uri getScoreHolderHiResImageUri() {
        return this.f723vS == null ? this.f722vR : this.f723vS.getHiResImageUri();
    }

    public Uri getScoreHolderIconImageUri() {
        return this.f723vS == null ? this.f721vQ : this.f723vS.getIconImageUri();
    }

    public String getScoreTag() {
        return this.f724vT;
    }

    public long getTimestampMillis() {
        return this.f719vO;
    }

    public int hashCode() {
        return m755a(this);
    }

    public boolean isDataValid() {
        return true;
    }

    public String toString() {
        return m757b(this);
    }
}
