package com.google.android.gms.games.multiplayer.realtime;

import android.database.CharArrayBuffer;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.data.C0161b;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.multiplayer.C0338d;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.plus.PlusShare;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.games.multiplayer.realtime.c */
public final class C0344c extends C0161b implements Room {

    /* renamed from: vH */
    private final int f795vH;

    C0344c(DataHolder dataHolder, int i, int i2) {
        super(dataHolder, i);
        this.f795vH = i2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return RoomEntity.m801a((Room) this, obj);
    }

    public Room freeze() {
        return new RoomEntity(this);
    }

    public Bundle getAutoMatchCriteria() {
        if (!getBoolean("has_automatch_criteria")) {
            return null;
        }
        return RoomConfig.createAutoMatchCriteria(getInteger("automatch_min_players"), getInteger("automatch_max_players"), getLong("automatch_bit_mask"));
    }

    public int getAutoMatchWaitEstimateSeconds() {
        return getInteger("automatch_wait_estimate_sec");
    }

    public long getCreationTimestamp() {
        return getLong("creation_timestamp");
    }

    public String getCreatorId() {
        return getString("creator_external");
    }

    public String getDescription() {
        return getString(PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_DESCRIPTION);
    }

    public void getDescription(CharArrayBuffer dataOut) {
        mo2412a(PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_DESCRIPTION, dataOut);
    }

    public Participant getParticipant(String participantId) {
        return RoomEntity.m806c(this, participantId);
    }

    public String getParticipantId(String playerId) {
        return RoomEntity.m804b(this, playerId);
    }

    public ArrayList<String> getParticipantIds() {
        return RoomEntity.m807c(this);
    }

    public int getParticipantStatus(String participantId) {
        return RoomEntity.m800a((Room) this, participantId);
    }

    public ArrayList<Participant> getParticipants() {
        ArrayList<Participant> arrayList = new ArrayList<>(this.f795vH);
        for (int i = 0; i < this.f795vH; i++) {
            arrayList.add(new C0338d(this.f319nE, this.f320nG + i));
        }
        return arrayList;
    }

    public String getRoomId() {
        return getString("external_match_id");
    }

    public int getStatus() {
        return getInteger("status");
    }

    public int getVariant() {
        return getInteger("variant");
    }

    public int hashCode() {
        return RoomEntity.m799a(this);
    }

    public String toString() {
        return RoomEntity.m803b((Room) this);
    }

    public void writeToParcel(Parcel dest, int flags) {
        ((RoomEntity) freeze()).writeToParcel(dest, flags);
    }
}
