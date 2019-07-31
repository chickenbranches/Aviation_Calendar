package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.internal.C0596ee;
import com.google.android.gms.internal.C0600eg;
import com.google.android.gms.internal.C0703fm;
import java.util.ArrayList;

public final class InvitationEntity extends C0703fm implements Invitation {
    public static final Creator<InvitationEntity> CREATOR = new C0333a();

    /* renamed from: kg */
    private final int f738kg;

    /* renamed from: uf */
    private final String f739uf;

    /* renamed from: wj */
    private final GameEntity f740wj;

    /* renamed from: wk */
    private final long f741wk;

    /* renamed from: wl */
    private final int f742wl;

    /* renamed from: wm */
    private final ParticipantEntity f743wm;

    /* renamed from: wn */
    private final ArrayList<ParticipantEntity> f744wn;

    /* renamed from: wo */
    private final int f745wo;

    /* renamed from: wp */
    private final int f746wp;

    /* renamed from: com.google.android.gms.games.multiplayer.InvitationEntity$a */
    static final class C0333a extends C0335a {
        C0333a() {
        }

        /* renamed from: aa */
        public InvitationEntity createFromParcel(Parcel parcel) {
            if (InvitationEntity.m1917c(InvitationEntity.m1411bM()) || InvitationEntity.m1408P(InvitationEntity.class.getCanonicalName())) {
                return super.createFromParcel(parcel);
            }
            GameEntity gameEntity = (GameEntity) GameEntity.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            long readLong = parcel.readLong();
            int readInt = parcel.readInt();
            ParticipantEntity participantEntity = (ParticipantEntity) ParticipantEntity.CREATOR.createFromParcel(parcel);
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            for (int i = 0; i < readInt2; i++) {
                arrayList.add(ParticipantEntity.CREATOR.createFromParcel(parcel));
            }
            return new InvitationEntity(2, gameEntity, readString, readLong, readInt, participantEntity, arrayList, -1, 0);
        }
    }

    InvitationEntity(int versionCode, GameEntity game, String invitationId, long creationTimestamp, int invitationType, ParticipantEntity inviter, ArrayList<ParticipantEntity> participants, int variant, int availableAutoMatchSlots) {
        this.f738kg = versionCode;
        this.f740wj = game;
        this.f739uf = invitationId;
        this.f741wk = creationTimestamp;
        this.f742wl = invitationType;
        this.f743wm = inviter;
        this.f744wn = participants;
        this.f745wo = variant;
        this.f746wp = availableAutoMatchSlots;
    }

    InvitationEntity(Invitation invitation) {
        this.f738kg = 2;
        this.f740wj = new GameEntity(invitation.getGame());
        this.f739uf = invitation.getInvitationId();
        this.f741wk = invitation.getCreationTimestamp();
        this.f742wl = invitation.getInvitationType();
        this.f745wo = invitation.getVariant();
        this.f746wp = invitation.getAvailableAutoMatchSlots();
        String participantId = invitation.getInviter().getParticipantId();
        Participant participant = null;
        ArrayList participants = invitation.getParticipants();
        int size = participants.size();
        this.f744wn = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            Participant participant2 = (Participant) participants.get(i);
            if (participant2.getParticipantId().equals(participantId)) {
                participant = participant2;
            }
            this.f744wn.add((ParticipantEntity) participant2.freeze());
        }
        C0600eg.m1552b(participant, (Object) "Must have a valid inviter!");
        this.f743wm = (ParticipantEntity) participant.freeze();
    }

    /* renamed from: a */
    static int m772a(Invitation invitation) {
        return C0596ee.hashCode(invitation.getGame(), invitation.getInvitationId(), Long.valueOf(invitation.getCreationTimestamp()), Integer.valueOf(invitation.getInvitationType()), invitation.getInviter(), invitation.getParticipants(), Integer.valueOf(invitation.getVariant()), Integer.valueOf(invitation.getAvailableAutoMatchSlots()));
    }

    /* renamed from: a */
    static boolean m773a(Invitation invitation, Object obj) {
        if (!(obj instanceof Invitation)) {
            return false;
        }
        if (invitation == obj) {
            return true;
        }
        Invitation invitation2 = (Invitation) obj;
        return C0596ee.equal(invitation2.getGame(), invitation.getGame()) && C0596ee.equal(invitation2.getInvitationId(), invitation.getInvitationId()) && C0596ee.equal(Long.valueOf(invitation2.getCreationTimestamp()), Long.valueOf(invitation.getCreationTimestamp())) && C0596ee.equal(Integer.valueOf(invitation2.getInvitationType()), Integer.valueOf(invitation.getInvitationType())) && C0596ee.equal(invitation2.getInviter(), invitation.getInviter()) && C0596ee.equal(invitation2.getParticipants(), invitation.getParticipants()) && C0596ee.equal(Integer.valueOf(invitation2.getVariant()), Integer.valueOf(invitation.getVariant())) && C0596ee.equal(Integer.valueOf(invitation2.getAvailableAutoMatchSlots()), Integer.valueOf(invitation.getAvailableAutoMatchSlots()));
    }

    /* renamed from: b */
    static String m775b(Invitation invitation) {
        return C0596ee.m1542e(invitation).mo3971a("Game", invitation.getGame()).mo3971a("InvitationId", invitation.getInvitationId()).mo3971a("CreationTimestamp", Long.valueOf(invitation.getCreationTimestamp())).mo3971a("InvitationType", Integer.valueOf(invitation.getInvitationType())).mo3971a("Inviter", invitation.getInviter()).mo3971a("Participants", invitation.getParticipants()).mo3971a("Variant", Integer.valueOf(invitation.getVariant())).mo3971a("AvailableAutoMatchSlots", Integer.valueOf(invitation.getAvailableAutoMatchSlots())).toString();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return m773a(this, obj);
    }

    public Invitation freeze() {
        return this;
    }

    public int getAvailableAutoMatchSlots() {
        return this.f746wp;
    }

    public long getCreationTimestamp() {
        return this.f741wk;
    }

    public Game getGame() {
        return this.f740wj;
    }

    public String getInvitationId() {
        return this.f739uf;
    }

    public int getInvitationType() {
        return this.f742wl;
    }

    public Participant getInviter() {
        return this.f743wm;
    }

    public ArrayList<Participant> getParticipants() {
        return new ArrayList<>(this.f744wn);
    }

    public int getVariant() {
        return this.f745wo;
    }

    public int getVersionCode() {
        return this.f738kg;
    }

    public int hashCode() {
        return m772a(this);
    }

    public boolean isDataValid() {
        return true;
    }

    public String toString() {
        return m775b((Invitation) this);
    }

    public void writeToParcel(Parcel dest, int flags) {
        if (!mo3885bN()) {
            C0335a.m790a(this, dest, flags);
            return;
        }
        this.f740wj.writeToParcel(dest, flags);
        dest.writeString(this.f739uf);
        dest.writeLong(this.f741wk);
        dest.writeInt(this.f742wl);
        this.f743wm.writeToParcel(dest, flags);
        int size = this.f744wn.size();
        dest.writeInt(size);
        for (int i = 0; i < size; i++) {
            ((ParticipantEntity) this.f744wn.get(i)).writeToParcel(dest, flags);
        }
    }
}
