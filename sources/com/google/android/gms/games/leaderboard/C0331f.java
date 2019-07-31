package com.google.android.gms.games.leaderboard;

import com.google.android.gms.internal.C0596ee;
import com.google.android.gms.internal.C0791gc;
import com.google.android.gms.internal.C0793ge;

/* renamed from: com.google.android.gms.games.leaderboard.f */
public final class C0331f implements LeaderboardVariant {

    /* renamed from: vV */
    private final int f726vV;

    /* renamed from: vW */
    private final int f727vW;

    /* renamed from: vX */
    private final boolean f728vX;

    /* renamed from: vY */
    private final long f729vY;

    /* renamed from: vZ */
    private final String f730vZ;

    /* renamed from: wa */
    private final long f731wa;

    /* renamed from: wb */
    private final String f732wb;

    /* renamed from: wc */
    private final String f733wc;

    /* renamed from: wd */
    private final long f734wd;

    /* renamed from: we */
    private final String f735we;

    /* renamed from: wf */
    private final String f736wf;

    /* renamed from: wg */
    private final String f737wg;

    public C0331f(LeaderboardVariant leaderboardVariant) {
        this.f726vV = leaderboardVariant.getTimeSpan();
        this.f727vW = leaderboardVariant.getCollection();
        this.f728vX = leaderboardVariant.hasPlayerInfo();
        this.f729vY = leaderboardVariant.getRawPlayerScore();
        this.f730vZ = leaderboardVariant.getDisplayPlayerScore();
        this.f731wa = leaderboardVariant.getPlayerRank();
        this.f732wb = leaderboardVariant.getDisplayPlayerRank();
        this.f733wc = leaderboardVariant.getPlayerScoreTag();
        this.f734wd = leaderboardVariant.getNumScores();
        this.f735we = leaderboardVariant.mo3105dt();
        this.f736wf = leaderboardVariant.mo3106du();
        this.f737wg = leaderboardVariant.mo3107dv();
    }

    /* renamed from: a */
    static int m760a(LeaderboardVariant leaderboardVariant) {
        return C0596ee.hashCode(Integer.valueOf(leaderboardVariant.getTimeSpan()), Integer.valueOf(leaderboardVariant.getCollection()), Boolean.valueOf(leaderboardVariant.hasPlayerInfo()), Long.valueOf(leaderboardVariant.getRawPlayerScore()), leaderboardVariant.getDisplayPlayerScore(), Long.valueOf(leaderboardVariant.getPlayerRank()), leaderboardVariant.getDisplayPlayerRank(), Long.valueOf(leaderboardVariant.getNumScores()), leaderboardVariant.mo3105dt(), leaderboardVariant.mo3107dv(), leaderboardVariant.mo3106du());
    }

    /* renamed from: a */
    static boolean m761a(LeaderboardVariant leaderboardVariant, Object obj) {
        if (!(obj instanceof LeaderboardVariant)) {
            return false;
        }
        if (leaderboardVariant == obj) {
            return true;
        }
        LeaderboardVariant leaderboardVariant2 = (LeaderboardVariant) obj;
        return C0596ee.equal(Integer.valueOf(leaderboardVariant2.getTimeSpan()), Integer.valueOf(leaderboardVariant.getTimeSpan())) && C0596ee.equal(Integer.valueOf(leaderboardVariant2.getCollection()), Integer.valueOf(leaderboardVariant.getCollection())) && C0596ee.equal(Boolean.valueOf(leaderboardVariant2.hasPlayerInfo()), Boolean.valueOf(leaderboardVariant.hasPlayerInfo())) && C0596ee.equal(Long.valueOf(leaderboardVariant2.getRawPlayerScore()), Long.valueOf(leaderboardVariant.getRawPlayerScore())) && C0596ee.equal(leaderboardVariant2.getDisplayPlayerScore(), leaderboardVariant.getDisplayPlayerScore()) && C0596ee.equal(Long.valueOf(leaderboardVariant2.getPlayerRank()), Long.valueOf(leaderboardVariant.getPlayerRank())) && C0596ee.equal(leaderboardVariant2.getDisplayPlayerRank(), leaderboardVariant.getDisplayPlayerRank()) && C0596ee.equal(Long.valueOf(leaderboardVariant2.getNumScores()), Long.valueOf(leaderboardVariant.getNumScores())) && C0596ee.equal(leaderboardVariant2.mo3105dt(), leaderboardVariant.mo3105dt()) && C0596ee.equal(leaderboardVariant2.mo3107dv(), leaderboardVariant.mo3107dv()) && C0596ee.equal(leaderboardVariant2.mo3106du(), leaderboardVariant.mo3106du());
    }

    /* renamed from: b */
    static String m762b(LeaderboardVariant leaderboardVariant) {
        return C0596ee.m1542e(leaderboardVariant).mo3971a("TimeSpan", C0793ge.m2354aG(leaderboardVariant.getTimeSpan())).mo3971a("Collection", C0791gc.m2353aG(leaderboardVariant.getCollection())).mo3971a("RawPlayerScore", leaderboardVariant.hasPlayerInfo() ? Long.valueOf(leaderboardVariant.getRawPlayerScore()) : "none").mo3971a("DisplayPlayerScore", leaderboardVariant.hasPlayerInfo() ? leaderboardVariant.getDisplayPlayerScore() : "none").mo3971a("PlayerRank", leaderboardVariant.hasPlayerInfo() ? Long.valueOf(leaderboardVariant.getPlayerRank()) : "none").mo3971a("DisplayPlayerRank", leaderboardVariant.hasPlayerInfo() ? leaderboardVariant.getDisplayPlayerRank() : "none").mo3971a("NumScores", Long.valueOf(leaderboardVariant.getNumScores())).mo3971a("TopPageNextToken", leaderboardVariant.mo3105dt()).mo3971a("WindowPageNextToken", leaderboardVariant.mo3107dv()).mo3971a("WindowPagePrevToken", leaderboardVariant.mo3106du()).toString();
    }

    /* renamed from: dt */
    public String mo3105dt() {
        return this.f735we;
    }

    /* renamed from: du */
    public String mo3106du() {
        return this.f736wf;
    }

    /* renamed from: dv */
    public String mo3107dv() {
        return this.f737wg;
    }

    /* renamed from: dw */
    public LeaderboardVariant freeze() {
        return this;
    }

    public boolean equals(Object obj) {
        return m761a(this, obj);
    }

    public int getCollection() {
        return this.f727vW;
    }

    public String getDisplayPlayerRank() {
        return this.f732wb;
    }

    public String getDisplayPlayerScore() {
        return this.f730vZ;
    }

    public long getNumScores() {
        return this.f734wd;
    }

    public long getPlayerRank() {
        return this.f731wa;
    }

    public String getPlayerScoreTag() {
        return this.f733wc;
    }

    public long getRawPlayerScore() {
        return this.f729vY;
    }

    public int getTimeSpan() {
        return this.f726vV;
    }

    public boolean hasPlayerInfo() {
        return this.f728vX;
    }

    public int hashCode() {
        return m760a(this);
    }

    public boolean isDataValid() {
        return true;
    }

    public String toString() {
        return m762b(this);
    }
}
