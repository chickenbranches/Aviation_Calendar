package com.google.android.gms.games.leaderboard;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.common.data.C0161b;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.C0322b;
import com.google.android.gms.games.Game;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.games.leaderboard.b */
public final class C0327b extends C0161b implements Leaderboard {

    /* renamed from: vG */
    private final Game f712vG;

    /* renamed from: vH */
    private final int f713vH;

    C0327b(DataHolder dataHolder, int i, int i2) {
        super(dataHolder, i);
        this.f713vH = i2;
        this.f712vG = new C0322b(dataHolder, i);
    }

    /* renamed from: dp */
    public Leaderboard freeze() {
        return new C0326a(this);
    }

    public boolean equals(Object obj) {
        return C0326a.m750a(this, obj);
    }

    public String getDisplayName() {
        return getString("name");
    }

    public void getDisplayName(CharArrayBuffer dataOut) {
        mo2412a("name", dataOut);
    }

    public Game getGame() {
        return this.f712vG;
    }

    public Uri getIconImageUri() {
        return mo2410L("board_icon_image_uri");
    }

    public String getLeaderboardId() {
        return getString("external_leaderboard_id");
    }

    public int getScoreOrder() {
        return getInteger("score_order");
    }

    public ArrayList<LeaderboardVariant> getVariants() {
        ArrayList<LeaderboardVariant> arrayList = new ArrayList<>(this.f713vH);
        for (int i = 0; i < this.f713vH; i++) {
            arrayList.add(new C0332g(this.f319nE, this.f320nG + i));
        }
        return arrayList;
    }

    public int hashCode() {
        return C0326a.m749a(this);
    }

    public String toString() {
        return C0326a.m751b(this);
    }
}
