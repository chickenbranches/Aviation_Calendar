package com.google.android.gms.games.multiplayer.turnbased;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.data.C0161b;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.C0322b;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.multiplayer.C0338d;
import com.google.android.gms.games.multiplayer.Participant;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.games.multiplayer.turnbased.a */
public final class C0346a extends C0161b implements TurnBasedMatch {

    /* renamed from: vG */
    private final Game f828vG;

    /* renamed from: vH */
    private final int f829vH;

    C0346a(DataHolder dataHolder, int i, int i2) {
        super(dataHolder, i);
        this.f828vG = new C0322b(dataHolder, i);
        this.f829vH = i2;
    }

    public boolean canRematch() {
        return getTurnStatus() == 3 && getRematchId() == null && getParticipants().size() > 1;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return TurnBasedMatchEntity.m819a((TurnBasedMatch) this, obj);
    }

    public TurnBasedMatch freeze() {
        return new TurnBasedMatchEntity(this);
    }

    public Bundle getAutoMatchCriteria() {
        if (!getBoolean("has_automatch_criteria")) {
            return null;
        }
        return TurnBasedMatchConfig.createAutoMatchCriteria(getInteger("automatch_min_players"), getInteger("automatch_max_players"), getLong("automatch_bit_mask"));
    }

    public int getAvailableAutoMatchSlots() {
        if (!getBoolean("has_automatch_criteria")) {
            return 0;
        }
        return getInteger("automatch_max_players");
    }

    public long getCreationTimestamp() {
        return getLong("creation_timestamp");
    }

    public String getCreatorId() {
        return getString("creator_external");
    }

    public byte[] getData() {
        return getByteArray("data");
    }

    public Game getGame() {
        return this.f828vG;
    }

    public long getLastUpdatedTimestamp() {
        return getLong("last_updated_timestamp");
    }

    public String getLastUpdaterId() {
        return getString("last_updater_external");
    }

    public String getMatchId() {
        return getString("external_match_id");
    }

    public int getMatchNumber() {
        return getInteger("match_number");
    }

    public Participant getParticipant(String participantId) {
        return TurnBasedMatchEntity.m822c(this, participantId);
    }

    public String getParticipantId(String playerId) {
        return TurnBasedMatchEntity.m821b(this, playerId);
    }

    public ArrayList<String> getParticipantIds() {
        return TurnBasedMatchEntity.m823c(this);
    }

    public int getParticipantStatus(String participantId) {
        return TurnBasedMatchEntity.m818a((TurnBasedMatch) this, participantId);
    }

    public ArrayList<Participant> getParticipants() {
        ArrayList<Participant> arrayList = new ArrayList<>(this.f829vH);
        for (int i = 0; i < this.f829vH; i++) {
            arrayList.add(new C0338d(this.f319nE, this.f320nG + i));
        }
        return arrayList;
    }

    public String getPendingParticipantId() {
        return getString("pending_participant_external");
    }

    public byte[] getPreviousMatchData() {
        return getByteArray("previous_match_data");
    }

    public String getRematchId() {
        return getString("rematch_id");
    }

    public int getStatus() {
        return getInteger("status");
    }

    public int getTurnStatus() {
        return getInteger("user_match_status");
    }

    public int getVariant() {
        return getInteger("variant");
    }

    public int getVersion() {
        return getInteger("version");
    }

    public int hashCode() {
        return TurnBasedMatchEntity.m817a(this);
    }

    public boolean isLocallyModified() {
        return getBoolean("upsync_required");
    }

    public String toString() {
        return TurnBasedMatchEntity.m820b(this);
    }

    public void writeToParcel(Parcel dest, int flags) {
        ((TurnBasedMatchEntity) freeze()).writeToParcel(dest, flags);
    }
}
