package com.google.android.gms.games.multiplayer;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.internal.C0596ee;
import com.google.android.gms.internal.C0629fc;
import com.google.android.gms.internal.C0703fm;

public final class ParticipantEntity extends C0703fm implements Participant {
    public static final Creator<ParticipantEntity> CREATOR = new C0334a();

    /* renamed from: kg */
    private final int f747kg;

    /* renamed from: qa */
    private final String f748qa;

    /* renamed from: sL */
    private final Uri f749sL;

    /* renamed from: sM */
    private final Uri f750sM;

    /* renamed from: up */
    private final String f751up;

    /* renamed from: wr */
    private final int f752wr;

    /* renamed from: ws */
    private final String f753ws;

    /* renamed from: wt */
    private final boolean f754wt;

    /* renamed from: wu */
    private final PlayerEntity f755wu;

    /* renamed from: wv */
    private final int f756wv;

    /* renamed from: ww */
    private final ParticipantResult f757ww;

    /* renamed from: com.google.android.gms.games.multiplayer.ParticipantEntity$a */
    static final class C0334a extends C0337c {
        C0334a() {
        }

        /* renamed from: ab */
        public ParticipantEntity createFromParcel(Parcel parcel) {
            boolean z = true;
            if (ParticipantEntity.m1917c(ParticipantEntity.m1411bM()) || ParticipantEntity.m1408P(ParticipantEntity.class.getCanonicalName())) {
                return super.createFromParcel(parcel);
            }
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            Uri parse = readString3 == null ? null : Uri.parse(readString3);
            String readString4 = parcel.readString();
            Uri parse2 = readString4 == null ? null : Uri.parse(readString4);
            int readInt = parcel.readInt();
            String readString5 = parcel.readString();
            boolean z2 = parcel.readInt() > 0;
            if (parcel.readInt() <= 0) {
                z = false;
            }
            return new ParticipantEntity(2, readString, readString2, parse, parse2, readInt, readString5, z2, z ? (PlayerEntity) PlayerEntity.CREATOR.createFromParcel(parcel) : null, 7, null);
        }
    }

    ParticipantEntity(int versionCode, String participantId, String displayName, Uri iconImageUri, Uri hiResImageUri, int status, String clientAddress, boolean connectedToRoom, PlayerEntity player, int capabilities, ParticipantResult result) {
        this.f747kg = versionCode;
        this.f751up = participantId;
        this.f748qa = displayName;
        this.f749sL = iconImageUri;
        this.f750sM = hiResImageUri;
        this.f752wr = status;
        this.f753ws = clientAddress;
        this.f754wt = connectedToRoom;
        this.f755wu = player;
        this.f756wv = capabilities;
        this.f757ww = result;
    }

    public ParticipantEntity(Participant participant) {
        this.f747kg = 2;
        this.f751up = participant.getParticipantId();
        this.f748qa = participant.getDisplayName();
        this.f749sL = participant.getIconImageUri();
        this.f750sM = participant.getHiResImageUri();
        this.f752wr = participant.getStatus();
        this.f753ws = participant.mo3196dy();
        this.f754wt = participant.isConnectedToRoom();
        Player player = participant.getPlayer();
        this.f755wu = player == null ? null : new PlayerEntity(player);
        this.f756wv = participant.getCapabilities();
        this.f757ww = participant.getResult();
    }

    /* renamed from: a */
    static int m780a(Participant participant) {
        return C0596ee.hashCode(participant.getPlayer(), Integer.valueOf(participant.getStatus()), participant.mo3196dy(), Boolean.valueOf(participant.isConnectedToRoom()), participant.getDisplayName(), participant.getIconImageUri(), participant.getHiResImageUri(), Integer.valueOf(participant.getCapabilities()), participant.getResult());
    }

    /* renamed from: a */
    static boolean m781a(Participant participant, Object obj) {
        if (!(obj instanceof Participant)) {
            return false;
        }
        if (participant == obj) {
            return true;
        }
        Participant participant2 = (Participant) obj;
        return C0596ee.equal(participant2.getPlayer(), participant.getPlayer()) && C0596ee.equal(Integer.valueOf(participant2.getStatus()), Integer.valueOf(participant.getStatus())) && C0596ee.equal(participant2.mo3196dy(), participant.mo3196dy()) && C0596ee.equal(Boolean.valueOf(participant2.isConnectedToRoom()), Boolean.valueOf(participant.isConnectedToRoom())) && C0596ee.equal(participant2.getDisplayName(), participant.getDisplayName()) && C0596ee.equal(participant2.getIconImageUri(), participant.getIconImageUri()) && C0596ee.equal(participant2.getHiResImageUri(), participant.getHiResImageUri()) && C0596ee.equal(Integer.valueOf(participant2.getCapabilities()), Integer.valueOf(participant.getCapabilities())) && C0596ee.equal(participant2.getResult(), participant.getResult());
    }

    /* renamed from: b */
    static String m783b(Participant participant) {
        return C0596ee.m1542e(participant).mo3971a("Player", participant.getPlayer()).mo3971a("Status", Integer.valueOf(participant.getStatus())).mo3971a("ClientAddress", participant.mo3196dy()).mo3971a("ConnectedToRoom", Boolean.valueOf(participant.isConnectedToRoom())).mo3971a("DisplayName", participant.getDisplayName()).mo3971a("IconImage", participant.getIconImageUri()).mo3971a("HiResImage", participant.getHiResImageUri()).mo3971a("Capabilities", Integer.valueOf(participant.getCapabilities())).mo3971a("Result", participant.getResult()).toString();
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: dy */
    public String mo3196dy() {
        return this.f753ws;
    }

    public boolean equals(Object obj) {
        return m781a(this, obj);
    }

    public Participant freeze() {
        return this;
    }

    public int getCapabilities() {
        return this.f756wv;
    }

    public String getDisplayName() {
        return this.f755wu == null ? this.f748qa : this.f755wu.getDisplayName();
    }

    public void getDisplayName(CharArrayBuffer dataOut) {
        if (this.f755wu == null) {
            C0629fc.m1697b(this.f748qa, dataOut);
        } else {
            this.f755wu.getDisplayName(dataOut);
        }
    }

    public Uri getHiResImageUri() {
        return this.f755wu == null ? this.f750sM : this.f755wu.getHiResImageUri();
    }

    public Uri getIconImageUri() {
        return this.f755wu == null ? this.f749sL : this.f755wu.getIconImageUri();
    }

    public String getParticipantId() {
        return this.f751up;
    }

    public Player getPlayer() {
        return this.f755wu;
    }

    public ParticipantResult getResult() {
        return this.f757ww;
    }

    public int getStatus() {
        return this.f752wr;
    }

    public int getVersionCode() {
        return this.f747kg;
    }

    public int hashCode() {
        return m780a(this);
    }

    public boolean isConnectedToRoom() {
        return this.f754wt;
    }

    public boolean isDataValid() {
        return true;
    }

    public String toString() {
        return m783b((Participant) this);
    }

    public void writeToParcel(Parcel dest, int flags) {
        String str = null;
        int i = 0;
        if (!mo3885bN()) {
            C0337c.m793a(this, dest, flags);
            return;
        }
        dest.writeString(this.f751up);
        dest.writeString(this.f748qa);
        dest.writeString(this.f749sL == null ? null : this.f749sL.toString());
        if (this.f750sM != null) {
            str = this.f750sM.toString();
        }
        dest.writeString(str);
        dest.writeInt(this.f752wr);
        dest.writeString(this.f753ws);
        dest.writeInt(this.f754wt ? 1 : 0);
        if (this.f755wu != null) {
            i = 1;
        }
        dest.writeInt(i);
        if (this.f755wu != null) {
            this.f755wu.writeToParcel(dest, flags);
        }
    }
}
