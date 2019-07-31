package com.google.android.gms.games.multiplayer.realtime;

import android.database.CharArrayBuffer;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import com.google.android.gms.internal.C0596ee;
import com.google.android.gms.internal.C0629fc;
import com.google.android.gms.internal.C0703fm;
import java.util.ArrayList;

public final class RoomEntity extends C0703fm implements Room {
    public static final Creator<RoomEntity> CREATOR = new C0341a();

    /* renamed from: kg */
    private final int f785kg;

    /* renamed from: sJ */
    private final String f786sJ;

    /* renamed from: uk */
    private final String f787uk;

    /* renamed from: wH */
    private final Bundle f788wH;

    /* renamed from: wL */
    private final String f789wL;

    /* renamed from: wM */
    private final int f790wM;

    /* renamed from: wN */
    private final int f791wN;

    /* renamed from: wk */
    private final long f792wk;

    /* renamed from: wn */
    private final ArrayList<ParticipantEntity> f793wn;

    /* renamed from: wo */
    private final int f794wo;

    /* renamed from: com.google.android.gms.games.multiplayer.realtime.RoomEntity$a */
    static final class C0341a extends C0343b {
        C0341a() {
        }

        /* renamed from: ad */
        public RoomEntity createFromParcel(Parcel parcel) {
            if (RoomEntity.m1917c(RoomEntity.m1411bM()) || RoomEntity.m1408P(RoomEntity.class.getCanonicalName())) {
                return super.createFromParcel(parcel);
            }
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            long readLong = parcel.readLong();
            int readInt = parcel.readInt();
            String readString3 = parcel.readString();
            int readInt2 = parcel.readInt();
            Bundle readBundle = parcel.readBundle();
            int readInt3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt3);
            for (int i = 0; i < readInt3; i++) {
                arrayList.add(ParticipantEntity.CREATOR.createFromParcel(parcel));
            }
            return new RoomEntity(2, readString, readString2, readLong, readInt, readString3, readInt2, readBundle, arrayList, -1);
        }
    }

    RoomEntity(int versionCode, String roomId, String creatorId, long creationTimestamp, int roomStatus, String description, int variant, Bundle autoMatchCriteria, ArrayList<ParticipantEntity> participants, int autoMatchWaitEstimateSeconds) {
        this.f785kg = versionCode;
        this.f787uk = roomId;
        this.f789wL = creatorId;
        this.f792wk = creationTimestamp;
        this.f790wM = roomStatus;
        this.f786sJ = description;
        this.f794wo = variant;
        this.f788wH = autoMatchCriteria;
        this.f793wn = participants;
        this.f791wN = autoMatchWaitEstimateSeconds;
    }

    public RoomEntity(Room room) {
        this.f785kg = 2;
        this.f787uk = room.getRoomId();
        this.f789wL = room.getCreatorId();
        this.f792wk = room.getCreationTimestamp();
        this.f790wM = room.getStatus();
        this.f786sJ = room.getDescription();
        this.f794wo = room.getVariant();
        this.f788wH = room.getAutoMatchCriteria();
        ArrayList participants = room.getParticipants();
        int size = participants.size();
        this.f793wn = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            this.f793wn.add((ParticipantEntity) ((Participant) participants.get(i)).freeze());
        }
        this.f791wN = room.getAutoMatchWaitEstimateSeconds();
    }

    /* renamed from: a */
    static int m799a(Room room) {
        return C0596ee.hashCode(room.getRoomId(), room.getCreatorId(), Long.valueOf(room.getCreationTimestamp()), Integer.valueOf(room.getStatus()), room.getDescription(), Integer.valueOf(room.getVariant()), room.getAutoMatchCriteria(), room.getParticipants(), Integer.valueOf(room.getAutoMatchWaitEstimateSeconds()));
    }

    /* renamed from: a */
    static int m800a(Room room, String str) {
        ArrayList participants = room.getParticipants();
        int size = participants.size();
        for (int i = 0; i < size; i++) {
            Participant participant = (Participant) participants.get(i);
            if (participant.getParticipantId().equals(str)) {
                return participant.getStatus();
            }
        }
        throw new IllegalStateException("Participant " + str + " is not in room " + room.getRoomId());
    }

    /* renamed from: a */
    static boolean m801a(Room room, Object obj) {
        if (!(obj instanceof Room)) {
            return false;
        }
        if (room == obj) {
            return true;
        }
        Room room2 = (Room) obj;
        return C0596ee.equal(room2.getRoomId(), room.getRoomId()) && C0596ee.equal(room2.getCreatorId(), room.getCreatorId()) && C0596ee.equal(Long.valueOf(room2.getCreationTimestamp()), Long.valueOf(room.getCreationTimestamp())) && C0596ee.equal(Integer.valueOf(room2.getStatus()), Integer.valueOf(room.getStatus())) && C0596ee.equal(room2.getDescription(), room.getDescription()) && C0596ee.equal(Integer.valueOf(room2.getVariant()), Integer.valueOf(room.getVariant())) && C0596ee.equal(room2.getAutoMatchCriteria(), room.getAutoMatchCriteria()) && C0596ee.equal(room2.getParticipants(), room.getParticipants()) && C0596ee.equal(Integer.valueOf(room2.getAutoMatchWaitEstimateSeconds()), Integer.valueOf(room.getAutoMatchWaitEstimateSeconds()));
    }

    /* renamed from: b */
    static String m803b(Room room) {
        return C0596ee.m1542e(room).mo3971a("RoomId", room.getRoomId()).mo3971a("CreatorId", room.getCreatorId()).mo3971a("CreationTimestamp", Long.valueOf(room.getCreationTimestamp())).mo3971a("RoomStatus", Integer.valueOf(room.getStatus())).mo3971a("Description", room.getDescription()).mo3971a("Variant", Integer.valueOf(room.getVariant())).mo3971a("AutoMatchCriteria", room.getAutoMatchCriteria()).mo3971a("Participants", room.getParticipants()).mo3971a("AutoMatchWaitEstimateSeconds", Integer.valueOf(room.getAutoMatchWaitEstimateSeconds())).toString();
    }

    /* renamed from: b */
    static String m804b(Room room, String str) {
        ArrayList participants = room.getParticipants();
        int size = participants.size();
        for (int i = 0; i < size; i++) {
            Participant participant = (Participant) participants.get(i);
            Player player = participant.getPlayer();
            if (player != null && player.getPlayerId().equals(str)) {
                return participant.getParticipantId();
            }
        }
        return null;
    }

    /* renamed from: c */
    static Participant m806c(Room room, String str) {
        ArrayList participants = room.getParticipants();
        int size = participants.size();
        for (int i = 0; i < size; i++) {
            Participant participant = (Participant) participants.get(i);
            if (participant.getParticipantId().equals(str)) {
                return participant;
            }
        }
        throw new IllegalStateException("Participant " + str + " is not in match " + room.getRoomId());
    }

    /* renamed from: c */
    static ArrayList<String> m807c(Room room) {
        ArrayList participants = room.getParticipants();
        int size = participants.size();
        ArrayList<String> arrayList = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(((Participant) participants.get(i)).getParticipantId());
        }
        return arrayList;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return m801a((Room) this, obj);
    }

    public Room freeze() {
        return this;
    }

    public Bundle getAutoMatchCriteria() {
        return this.f788wH;
    }

    public int getAutoMatchWaitEstimateSeconds() {
        return this.f791wN;
    }

    public long getCreationTimestamp() {
        return this.f792wk;
    }

    public String getCreatorId() {
        return this.f789wL;
    }

    public String getDescription() {
        return this.f786sJ;
    }

    public void getDescription(CharArrayBuffer dataOut) {
        C0629fc.m1697b(this.f786sJ, dataOut);
    }

    public Participant getParticipant(String participantId) {
        return m806c(this, participantId);
    }

    public String getParticipantId(String playerId) {
        return m804b(this, playerId);
    }

    public ArrayList<String> getParticipantIds() {
        return m807c(this);
    }

    public int getParticipantStatus(String participantId) {
        return m800a((Room) this, participantId);
    }

    public ArrayList<Participant> getParticipants() {
        return new ArrayList<>(this.f793wn);
    }

    public String getRoomId() {
        return this.f787uk;
    }

    public int getStatus() {
        return this.f790wM;
    }

    public int getVariant() {
        return this.f794wo;
    }

    public int getVersionCode() {
        return this.f785kg;
    }

    public int hashCode() {
        return m799a(this);
    }

    public boolean isDataValid() {
        return true;
    }

    public String toString() {
        return m803b((Room) this);
    }

    public void writeToParcel(Parcel dest, int flags) {
        if (!mo3885bN()) {
            C0343b.m812a(this, dest, flags);
            return;
        }
        dest.writeString(this.f787uk);
        dest.writeString(this.f789wL);
        dest.writeLong(this.f792wk);
        dest.writeInt(this.f790wM);
        dest.writeString(this.f786sJ);
        dest.writeInt(this.f794wo);
        dest.writeBundle(this.f788wH);
        int size = this.f793wn.size();
        dest.writeInt(size);
        for (int i = 0; i < size; i++) {
            ((ParticipantEntity) this.f793wn.get(i)).writeToParcel(dest, flags);
        }
    }
}
