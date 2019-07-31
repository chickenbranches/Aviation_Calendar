package com.google.android.gms.games.leaderboard;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.internal.C0596ee;
import com.google.android.gms.internal.C0629fc;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.games.leaderboard.a */
public final class C0326a implements Leaderboard {

    /* renamed from: qa */
    private final String f706qa;

    /* renamed from: sL */
    private final Uri f707sL;

    /* renamed from: vD */
    private final String f708vD;

    /* renamed from: vE */
    private final int f709vE;

    /* renamed from: vF */
    private final ArrayList<C0331f> f710vF;

    /* renamed from: vG */
    private final Game f711vG;

    public C0326a(Leaderboard leaderboard) {
        this.f708vD = leaderboard.getLeaderboardId();
        this.f706qa = leaderboard.getDisplayName();
        this.f707sL = leaderboard.getIconImageUri();
        this.f709vE = leaderboard.getScoreOrder();
        Game game = leaderboard.getGame();
        this.f711vG = game == null ? null : new GameEntity(game);
        ArrayList variants = leaderboard.getVariants();
        int size = variants.size();
        this.f710vF = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            this.f710vF.add((C0331f) ((LeaderboardVariant) variants.get(i)).freeze());
        }
    }

    /* renamed from: a */
    static int m749a(Leaderboard leaderboard) {
        return C0596ee.hashCode(leaderboard.getLeaderboardId(), leaderboard.getDisplayName(), leaderboard.getIconImageUri(), Integer.valueOf(leaderboard.getScoreOrder()), leaderboard.getVariants());
    }

    /* renamed from: a */
    static boolean m750a(Leaderboard leaderboard, Object obj) {
        if (!(obj instanceof Leaderboard)) {
            return false;
        }
        if (leaderboard == obj) {
            return true;
        }
        Leaderboard leaderboard2 = (Leaderboard) obj;
        return C0596ee.equal(leaderboard2.getLeaderboardId(), leaderboard.getLeaderboardId()) && C0596ee.equal(leaderboard2.getDisplayName(), leaderboard.getDisplayName()) && C0596ee.equal(leaderboard2.getIconImageUri(), leaderboard.getIconImageUri()) && C0596ee.equal(Integer.valueOf(leaderboard2.getScoreOrder()), Integer.valueOf(leaderboard.getScoreOrder())) && C0596ee.equal(leaderboard2.getVariants(), leaderboard.getVariants());
    }

    /* renamed from: b */
    static String m751b(Leaderboard leaderboard) {
        return C0596ee.m1542e(leaderboard).mo3971a("LeaderboardId", leaderboard.getLeaderboardId()).mo3971a("DisplayName", leaderboard.getDisplayName()).mo3971a("IconImageUri", leaderboard.getIconImageUri()).mo3971a("ScoreOrder", Integer.valueOf(leaderboard.getScoreOrder())).mo3971a("Variants", leaderboard.getVariants()).toString();
    }

    /* renamed from: dp */
    public Leaderboard freeze() {
        return this;
    }

    public boolean equals(Object obj) {
        return m750a(this, obj);
    }

    public String getDisplayName() {
        return this.f706qa;
    }

    public void getDisplayName(CharArrayBuffer dataOut) {
        C0629fc.m1697b(this.f706qa, dataOut);
    }

    public Game getGame() {
        return this.f711vG;
    }

    public Uri getIconImageUri() {
        return this.f707sL;
    }

    public String getLeaderboardId() {
        return this.f708vD;
    }

    public int getScoreOrder() {
        return this.f709vE;
    }

    public ArrayList<LeaderboardVariant> getVariants() {
        return new ArrayList<>(this.f710vF);
    }

    public int hashCode() {
        return m749a(this);
    }

    public boolean isDataValid() {
        return true;
    }

    public String toString() {
        return m751b(this);
    }
}
