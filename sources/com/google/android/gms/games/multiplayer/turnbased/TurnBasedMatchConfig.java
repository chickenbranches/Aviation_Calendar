package com.google.android.gms.games.multiplayer.turnbased;

import android.os.Bundle;
import com.google.android.gms.internal.C0600eg;
import java.util.ArrayList;

public final class TurnBasedMatchConfig {

    /* renamed from: wG */
    private final String[] f801wG;

    /* renamed from: wH */
    private final Bundle f802wH;

    /* renamed from: wT */
    private final int f803wT;

    /* renamed from: wo */
    private final int f804wo;

    public static final class Builder {

        /* renamed from: wH */
        Bundle f805wH;

        /* renamed from: wK */
        ArrayList<String> f806wK;

        /* renamed from: wT */
        int f807wT;

        /* renamed from: wo */
        int f808wo;

        private Builder() {
            this.f808wo = -1;
            this.f806wK = new ArrayList<>();
            this.f805wH = null;
            this.f807wT = 2;
        }

        public Builder addInvitedPlayer(String playerId) {
            C0600eg.m1554f(playerId);
            this.f806wK.add(playerId);
            return this;
        }

        public Builder addInvitedPlayers(ArrayList<String> playerIds) {
            C0600eg.m1554f(playerIds);
            this.f806wK.addAll(playerIds);
            return this;
        }

        public TurnBasedMatchConfig build() {
            return new TurnBasedMatchConfig(this);
        }

        public Builder setAutoMatchCriteria(Bundle autoMatchCriteria) {
            this.f805wH = autoMatchCriteria;
            return this;
        }

        public Builder setMinPlayers(int minPlayers) {
            this.f807wT = minPlayers;
            return this;
        }

        public Builder setVariant(int variant) {
            C0600eg.m1553b(variant == -1 || variant > 0, (Object) "Variant must be a positive integer or TurnBasedMatch.MATCH_VARIANT_ANY");
            this.f808wo = variant;
            return this;
        }
    }

    private TurnBasedMatchConfig(Builder builder) {
        this.f804wo = builder.f808wo;
        this.f803wT = builder.f807wT;
        this.f802wH = builder.f805wH;
        this.f801wG = (String[]) builder.f806wK.toArray(new String[builder.f806wK.size()]);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Bundle createAutoMatchCriteria(int minAutoMatchPlayers, int maxAutoMatchPlayers, long exclusiveBitMask) {
        Bundle bundle = new Bundle();
        bundle.putInt("min_automatch_players", minAutoMatchPlayers);
        bundle.putInt("max_automatch_players", maxAutoMatchPlayers);
        bundle.putLong("exclusive_bit_mask", exclusiveBitMask);
        return bundle;
    }

    public Bundle getAutoMatchCriteria() {
        return this.f802wH;
    }

    public String[] getInvitedPlayerIds() {
        return this.f801wG;
    }

    public int getMinPlayers() {
        return this.f803wT;
    }

    public int getVariant() {
        return this.f804wo;
    }
}
