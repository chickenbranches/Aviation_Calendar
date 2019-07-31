package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import com.google.android.gms.internal.C0600eg;
import java.util.ArrayList;
import java.util.Arrays;

public final class RoomConfig {

    /* renamed from: uf */
    private final String f769uf;

    /* renamed from: wD */
    private final RoomUpdateListener f770wD;

    /* renamed from: wE */
    private final RoomStatusUpdateListener f771wE;

    /* renamed from: wF */
    private final RealTimeMessageReceivedListener f772wF;

    /* renamed from: wG */
    private final String[] f773wG;

    /* renamed from: wH */
    private final Bundle f774wH;

    /* renamed from: wI */
    private final boolean f775wI;

    /* renamed from: wo */
    private final int f776wo;

    public static final class Builder {

        /* renamed from: wD */
        final RoomUpdateListener f777wD;

        /* renamed from: wE */
        RoomStatusUpdateListener f778wE;

        /* renamed from: wF */
        RealTimeMessageReceivedListener f779wF;

        /* renamed from: wH */
        Bundle f780wH;

        /* renamed from: wI */
        boolean f781wI;

        /* renamed from: wJ */
        String f782wJ;

        /* renamed from: wK */
        ArrayList<String> f783wK;

        /* renamed from: wo */
        int f784wo;

        private Builder(RoomUpdateListener updateListener) {
            this.f782wJ = null;
            this.f784wo = -1;
            this.f783wK = new ArrayList<>();
            this.f781wI = false;
            this.f777wD = (RoomUpdateListener) C0600eg.m1552b(updateListener, (Object) "Must provide a RoomUpdateListener");
        }

        public Builder addPlayersToInvite(ArrayList<String> playerIds) {
            C0600eg.m1554f(playerIds);
            this.f783wK.addAll(playerIds);
            return this;
        }

        public Builder addPlayersToInvite(String... playerIds) {
            C0600eg.m1554f(playerIds);
            this.f783wK.addAll(Arrays.asList(playerIds));
            return this;
        }

        public RoomConfig build() {
            return new RoomConfig(this);
        }

        public Builder setAutoMatchCriteria(Bundle autoMatchCriteria) {
            this.f780wH = autoMatchCriteria;
            return this;
        }

        public Builder setInvitationIdToAccept(String invitationId) {
            C0600eg.m1554f(invitationId);
            this.f782wJ = invitationId;
            return this;
        }

        public Builder setMessageReceivedListener(RealTimeMessageReceivedListener listener) {
            this.f779wF = listener;
            return this;
        }

        public Builder setRoomStatusUpdateListener(RoomStatusUpdateListener listener) {
            this.f778wE = listener;
            return this;
        }

        public Builder setSocketCommunicationEnabled(boolean enableSockets) {
            this.f781wI = enableSockets;
            return this;
        }

        public Builder setVariant(int variant) {
            C0600eg.m1553b(variant == -1 || variant > 0, (Object) "Variant must be a positive integer or Room.ROOM_VARIANT_ANY");
            this.f784wo = variant;
            return this;
        }
    }

    private RoomConfig(Builder builder) {
        this.f770wD = builder.f777wD;
        this.f771wE = builder.f778wE;
        this.f772wF = builder.f779wF;
        this.f769uf = builder.f782wJ;
        this.f776wo = builder.f784wo;
        this.f774wH = builder.f780wH;
        this.f775wI = builder.f781wI;
        this.f773wG = (String[]) builder.f783wK.toArray(new String[builder.f783wK.size()]);
        if (this.f772wF == null) {
            C0600eg.m1550a(this.f775wI, "Must either enable sockets OR specify a message listener");
        }
    }

    public static Builder builder(RoomUpdateListener listener) {
        return new Builder(listener);
    }

    public static Bundle createAutoMatchCriteria(int minAutoMatchPlayers, int maxAutoMatchPlayers, long exclusiveBitMask) {
        Bundle bundle = new Bundle();
        bundle.putInt("min_automatch_players", minAutoMatchPlayers);
        bundle.putInt("max_automatch_players", maxAutoMatchPlayers);
        bundle.putLong("exclusive_bit_mask", exclusiveBitMask);
        return bundle;
    }

    public Bundle getAutoMatchCriteria() {
        return this.f774wH;
    }

    public String getInvitationId() {
        return this.f769uf;
    }

    public String[] getInvitedPlayerIds() {
        return this.f773wG;
    }

    public RealTimeMessageReceivedListener getMessageReceivedListener() {
        return this.f772wF;
    }

    public RoomStatusUpdateListener getRoomStatusUpdateListener() {
        return this.f771wE;
    }

    public RoomUpdateListener getRoomUpdateListener() {
        return this.f770wD;
    }

    public int getVariant() {
        return this.f776wo;
    }

    public boolean isSocketEnabled() {
        return this.f775wI;
    }
}
