package com.google.android.gms.games.multiplayer.turnbased;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import com.google.android.gms.internal.C0596ee;
import java.util.ArrayList;

public final class TurnBasedMatchEntity implements SafeParcelable, TurnBasedMatch {
    public static final TurnBasedMatchEntityCreator CREATOR = new TurnBasedMatchEntityCreator();

    /* renamed from: kg */
    private final int f809kg;

    /* renamed from: ul */
    private final String f810ul;

    /* renamed from: wH */
    private final Bundle f811wH;

    /* renamed from: wL */
    private final String f812wL;

    /* renamed from: wU */
    private final String f813wU;

    /* renamed from: wV */
    private final long f814wV;

    /* renamed from: wW */
    private final String f815wW;

    /* renamed from: wX */
    private final int f816wX;

    /* renamed from: wY */
    private final int f817wY;

    /* renamed from: wZ */
    private final byte[] f818wZ;

    /* renamed from: wj */
    private final GameEntity f819wj;

    /* renamed from: wk */
    private final long f820wk;

    /* renamed from: wn */
    private final ArrayList<ParticipantEntity> f821wn;

    /* renamed from: wo */
    private final int f822wo;

    /* renamed from: xa */
    private final String f823xa;

    /* renamed from: xb */
    private final byte[] f824xb;

    /* renamed from: xc */
    private final int f825xc;

    /* renamed from: xd */
    private final int f826xd;

    /* renamed from: xe */
    private final boolean f827xe;

    TurnBasedMatchEntity(int versionCode, GameEntity game, String matchId, String creatorId, long creationTimestamp, String lastUpdaterId, long lastUpdatedTimestamp, String pendingParticipantId, int matchStatus, int variant, int version, byte[] data, ArrayList<ParticipantEntity> participants, String rematchId, byte[] previousData, int matchNumber, Bundle autoMatchCriteria, int turnStatus, boolean isLocallyModified) {
        this.f809kg = versionCode;
        this.f819wj = game;
        this.f810ul = matchId;
        this.f812wL = creatorId;
        this.f820wk = creationTimestamp;
        this.f813wU = lastUpdaterId;
        this.f814wV = lastUpdatedTimestamp;
        this.f815wW = pendingParticipantId;
        this.f816wX = matchStatus;
        this.f826xd = turnStatus;
        this.f822wo = variant;
        this.f817wY = version;
        this.f818wZ = data;
        this.f821wn = participants;
        this.f823xa = rematchId;
        this.f824xb = previousData;
        this.f825xc = matchNumber;
        this.f811wH = autoMatchCriteria;
        this.f827xe = isLocallyModified;
    }

    public TurnBasedMatchEntity(TurnBasedMatch match) {
        this.f809kg = 2;
        this.f819wj = new GameEntity(match.getGame());
        this.f810ul = match.getMatchId();
        this.f812wL = match.getCreatorId();
        this.f820wk = match.getCreationTimestamp();
        this.f813wU = match.getLastUpdaterId();
        this.f814wV = match.getLastUpdatedTimestamp();
        this.f815wW = match.getPendingParticipantId();
        this.f816wX = match.getStatus();
        this.f826xd = match.getTurnStatus();
        this.f822wo = match.getVariant();
        this.f817wY = match.getVersion();
        this.f823xa = match.getRematchId();
        this.f825xc = match.getMatchNumber();
        this.f811wH = match.getAutoMatchCriteria();
        this.f827xe = match.isLocallyModified();
        byte[] data = match.getData();
        if (data == null) {
            this.f818wZ = null;
        } else {
            this.f818wZ = new byte[data.length];
            System.arraycopy(data, 0, this.f818wZ, 0, data.length);
        }
        byte[] previousMatchData = match.getPreviousMatchData();
        if (previousMatchData == null) {
            this.f824xb = null;
        } else {
            this.f824xb = new byte[previousMatchData.length];
            System.arraycopy(previousMatchData, 0, this.f824xb, 0, previousMatchData.length);
        }
        ArrayList participants = match.getParticipants();
        int size = participants.size();
        this.f821wn = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            this.f821wn.add((ParticipantEntity) ((Participant) participants.get(i)).freeze());
        }
    }

    /* renamed from: a */
    static int m817a(TurnBasedMatch turnBasedMatch) {
        return C0596ee.hashCode(turnBasedMatch.getGame(), turnBasedMatch.getMatchId(), turnBasedMatch.getCreatorId(), Long.valueOf(turnBasedMatch.getCreationTimestamp()), turnBasedMatch.getLastUpdaterId(), Long.valueOf(turnBasedMatch.getLastUpdatedTimestamp()), turnBasedMatch.getPendingParticipantId(), Integer.valueOf(turnBasedMatch.getStatus()), Integer.valueOf(turnBasedMatch.getTurnStatus()), Integer.valueOf(turnBasedMatch.getVariant()), Integer.valueOf(turnBasedMatch.getVersion()), turnBasedMatch.getParticipants(), turnBasedMatch.getRematchId(), Integer.valueOf(turnBasedMatch.getMatchNumber()), turnBasedMatch.getAutoMatchCriteria(), Integer.valueOf(turnBasedMatch.getAvailableAutoMatchSlots()), Boolean.valueOf(turnBasedMatch.isLocallyModified()));
    }

    /* renamed from: a */
    static int m818a(TurnBasedMatch turnBasedMatch, String str) {
        ArrayList participants = turnBasedMatch.getParticipants();
        int size = participants.size();
        for (int i = 0; i < size; i++) {
            Participant participant = (Participant) participants.get(i);
            if (participant.getParticipantId().equals(str)) {
                return participant.getStatus();
            }
        }
        throw new IllegalStateException("Participant " + str + " is not in match " + turnBasedMatch.getMatchId());
    }

    /* renamed from: a */
    static boolean m819a(TurnBasedMatch turnBasedMatch, Object obj) {
        if (!(obj instanceof TurnBasedMatch)) {
            return false;
        }
        if (turnBasedMatch == obj) {
            return true;
        }
        TurnBasedMatch turnBasedMatch2 = (TurnBasedMatch) obj;
        return C0596ee.equal(turnBasedMatch2.getGame(), turnBasedMatch.getGame()) && C0596ee.equal(turnBasedMatch2.getMatchId(), turnBasedMatch.getMatchId()) && C0596ee.equal(turnBasedMatch2.getCreatorId(), turnBasedMatch.getCreatorId()) && C0596ee.equal(Long.valueOf(turnBasedMatch2.getCreationTimestamp()), Long.valueOf(turnBasedMatch.getCreationTimestamp())) && C0596ee.equal(turnBasedMatch2.getLastUpdaterId(), turnBasedMatch.getLastUpdaterId()) && C0596ee.equal(Long.valueOf(turnBasedMatch2.getLastUpdatedTimestamp()), Long.valueOf(turnBasedMatch.getLastUpdatedTimestamp())) && C0596ee.equal(turnBasedMatch2.getPendingParticipantId(), turnBasedMatch.getPendingParticipantId()) && C0596ee.equal(Integer.valueOf(turnBasedMatch2.getStatus()), Integer.valueOf(turnBasedMatch.getStatus())) && C0596ee.equal(Integer.valueOf(turnBasedMatch2.getTurnStatus()), Integer.valueOf(turnBasedMatch.getTurnStatus())) && C0596ee.equal(Integer.valueOf(turnBasedMatch2.getVariant()), Integer.valueOf(turnBasedMatch.getVariant())) && C0596ee.equal(Integer.valueOf(turnBasedMatch2.getVersion()), Integer.valueOf(turnBasedMatch.getVersion())) && C0596ee.equal(turnBasedMatch2.getParticipants(), turnBasedMatch.getParticipants()) && C0596ee.equal(turnBasedMatch2.getRematchId(), turnBasedMatch.getRematchId()) && C0596ee.equal(Integer.valueOf(turnBasedMatch2.getMatchNumber()), Integer.valueOf(turnBasedMatch.getMatchNumber())) && C0596ee.equal(turnBasedMatch2.getAutoMatchCriteria(), turnBasedMatch.getAutoMatchCriteria()) && C0596ee.equal(Integer.valueOf(turnBasedMatch2.getAvailableAutoMatchSlots()), Integer.valueOf(turnBasedMatch.getAvailableAutoMatchSlots())) && C0596ee.equal(Boolean.valueOf(turnBasedMatch2.isLocallyModified()), Boolean.valueOf(turnBasedMatch.isLocallyModified()));
    }

    /* renamed from: b */
    static String m820b(TurnBasedMatch turnBasedMatch) {
        return C0596ee.m1542e(turnBasedMatch).mo3971a("Game", turnBasedMatch.getGame()).mo3971a("MatchId", turnBasedMatch.getMatchId()).mo3971a("CreatorId", turnBasedMatch.getCreatorId()).mo3971a("CreationTimestamp", Long.valueOf(turnBasedMatch.getCreationTimestamp())).mo3971a("LastUpdaterId", turnBasedMatch.getLastUpdaterId()).mo3971a("LastUpdatedTimestamp", Long.valueOf(turnBasedMatch.getLastUpdatedTimestamp())).mo3971a("PendingParticipantId", turnBasedMatch.getPendingParticipantId()).mo3971a("MatchStatus", Integer.valueOf(turnBasedMatch.getStatus())).mo3971a("TurnStatus", Integer.valueOf(turnBasedMatch.getTurnStatus())).mo3971a("Variant", Integer.valueOf(turnBasedMatch.getVariant())).mo3971a("Data", turnBasedMatch.getData()).mo3971a("Version", Integer.valueOf(turnBasedMatch.getVersion())).mo3971a("Participants", turnBasedMatch.getParticipants()).mo3971a("RematchId", turnBasedMatch.getRematchId()).mo3971a("PreviousData", turnBasedMatch.getPreviousMatchData()).mo3971a("MatchNumber", Integer.valueOf(turnBasedMatch.getMatchNumber())).mo3971a("AutoMatchCriteria", turnBasedMatch.getAutoMatchCriteria()).mo3971a("AvailableAutoMatchSlots", Integer.valueOf(turnBasedMatch.getAvailableAutoMatchSlots())).mo3971a("LocallyModified", Boolean.valueOf(turnBasedMatch.isLocallyModified())).toString();
    }

    /* renamed from: b */
    static String m821b(TurnBasedMatch turnBasedMatch, String str) {
        ArrayList participants = turnBasedMatch.getParticipants();
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
    static Participant m822c(TurnBasedMatch turnBasedMatch, String str) {
        ArrayList participants = turnBasedMatch.getParticipants();
        int size = participants.size();
        for (int i = 0; i < size; i++) {
            Participant participant = (Participant) participants.get(i);
            if (participant.getParticipantId().equals(str)) {
                return participant;
            }
        }
        throw new IllegalStateException("Participant " + str + " is not in match " + turnBasedMatch.getMatchId());
    }

    /* renamed from: c */
    static ArrayList<String> m823c(TurnBasedMatch turnBasedMatch) {
        ArrayList participants = turnBasedMatch.getParticipants();
        int size = participants.size();
        ArrayList<String> arrayList = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(((Participant) participants.get(i)).getParticipantId());
        }
        return arrayList;
    }

    public boolean canRematch() {
        return this.f816wX == 2 && this.f823xa == null;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return m819a((TurnBasedMatch) this, obj);
    }

    public TurnBasedMatch freeze() {
        return this;
    }

    public Bundle getAutoMatchCriteria() {
        return this.f811wH;
    }

    public int getAvailableAutoMatchSlots() {
        if (this.f811wH == null) {
            return 0;
        }
        return this.f811wH.getInt("max_automatch_players");
    }

    public long getCreationTimestamp() {
        return this.f820wk;
    }

    public String getCreatorId() {
        return this.f812wL;
    }

    public byte[] getData() {
        return this.f818wZ;
    }

    public Game getGame() {
        return this.f819wj;
    }

    public long getLastUpdatedTimestamp() {
        return this.f814wV;
    }

    public String getLastUpdaterId() {
        return this.f813wU;
    }

    public String getMatchId() {
        return this.f810ul;
    }

    public int getMatchNumber() {
        return this.f825xc;
    }

    public Participant getParticipant(String participantId) {
        return m822c(this, participantId);
    }

    public String getParticipantId(String playerId) {
        return m821b(this, playerId);
    }

    public ArrayList<String> getParticipantIds() {
        return m823c(this);
    }

    public int getParticipantStatus(String participantId) {
        return m818a((TurnBasedMatch) this, participantId);
    }

    public ArrayList<Participant> getParticipants() {
        return new ArrayList<>(this.f821wn);
    }

    public String getPendingParticipantId() {
        return this.f815wW;
    }

    public byte[] getPreviousMatchData() {
        return this.f824xb;
    }

    public String getRematchId() {
        return this.f823xa;
    }

    public int getStatus() {
        return this.f816wX;
    }

    public int getTurnStatus() {
        return this.f826xd;
    }

    public int getVariant() {
        return this.f822wo;
    }

    public int getVersion() {
        return this.f817wY;
    }

    public int getVersionCode() {
        return this.f809kg;
    }

    public int hashCode() {
        return m817a(this);
    }

    public boolean isDataValid() {
        return true;
    }

    public boolean isLocallyModified() {
        return this.f827xe;
    }

    public String toString() {
        return m820b(this);
    }

    public void writeToParcel(Parcel out, int flags) {
        TurnBasedMatchEntityCreator.m824a(this, out, flags);
    }
}
