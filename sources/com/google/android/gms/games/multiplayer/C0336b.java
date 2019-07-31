package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import com.google.android.gms.common.data.C0161b;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.C0322b;
import com.google.android.gms.games.Game;
import com.google.android.gms.internal.C0600eg;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.games.multiplayer.b */
public final class C0336b extends C0161b implements Invitation {

    /* renamed from: vG */
    private final Game f762vG;

    /* renamed from: wn */
    private final ArrayList<Participant> f763wn;

    /* renamed from: wq */
    private final C0338d f764wq;

    C0336b(DataHolder dataHolder, int i, int i2) {
        super(dataHolder, i);
        this.f762vG = new C0322b(dataHolder, i);
        this.f763wn = new ArrayList<>(i2);
        String string = getString("external_inviter_id");
        C0338d dVar = null;
        for (int i3 = 0; i3 < i2; i3++) {
            C0338d dVar2 = new C0338d(this.f319nE, this.f320nG + i3);
            if (dVar2.getParticipantId().equals(string)) {
                dVar = dVar2;
            }
            this.f763wn.add(dVar2);
        }
        this.f764wq = (C0338d) C0600eg.m1552b(dVar, (Object) "Must have a valid inviter!");
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return InvitationEntity.m773a(this, obj);
    }

    public Invitation freeze() {
        return new InvitationEntity(this);
    }

    public int getAvailableAutoMatchSlots() {
        if (!getBoolean("has_automatch_criteria")) {
            return 0;
        }
        return getInteger("automatch_max_players");
    }

    public long getCreationTimestamp() {
        return Math.max(getLong("creation_timestamp"), getLong("last_modified_timestamp"));
    }

    public Game getGame() {
        return this.f762vG;
    }

    public String getInvitationId() {
        return getString("external_invitation_id");
    }

    public int getInvitationType() {
        return getInteger("type");
    }

    public Participant getInviter() {
        return this.f764wq;
    }

    public ArrayList<Participant> getParticipants() {
        return this.f763wn;
    }

    public int getVariant() {
        return getInteger("variant");
    }

    public int hashCode() {
        return InvitationEntity.m772a(this);
    }

    public String toString() {
        return InvitationEntity.m775b((Invitation) this);
    }

    public void writeToParcel(Parcel dest, int flags) {
        ((InvitationEntity) freeze()).writeToParcel(dest, flags);
    }
}
