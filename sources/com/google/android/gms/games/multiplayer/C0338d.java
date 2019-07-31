package com.google.android.gms.games.multiplayer;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.C0161b;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.C0324d;
import com.google.android.gms.games.Player;

/* renamed from: com.google.android.gms.games.multiplayer.d */
public final class C0338d extends C0161b implements Participant {

    /* renamed from: wx */
    private final C0324d f765wx;

    public C0338d(DataHolder dataHolder, int i) {
        super(dataHolder, i);
        this.f765wx = new C0324d(dataHolder, i);
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: dy */
    public String mo3196dy() {
        return getString("client_address");
    }

    public boolean equals(Object obj) {
        return ParticipantEntity.m781a(this, obj);
    }

    public Participant freeze() {
        return new ParticipantEntity(this);
    }

    public int getCapabilities() {
        return getInteger("capabilities");
    }

    public String getDisplayName() {
        return mo2411M("external_player_id") ? getString("default_display_name") : this.f765wx.getDisplayName();
    }

    public void getDisplayName(CharArrayBuffer dataOut) {
        if (mo2411M("external_player_id")) {
            mo2412a("default_display_name", dataOut);
        } else {
            this.f765wx.getDisplayName(dataOut);
        }
    }

    public Uri getHiResImageUri() {
        return mo2411M("external_player_id") ? mo2410L("default_display_hi_res_image_uri") : this.f765wx.getHiResImageUri();
    }

    public Uri getIconImageUri() {
        return mo2411M("external_player_id") ? mo2410L("default_display_image_uri") : this.f765wx.getIconImageUri();
    }

    public String getParticipantId() {
        return getString("external_participant_id");
    }

    public Player getPlayer() {
        if (mo2411M("external_player_id")) {
            return null;
        }
        return this.f765wx;
    }

    public ParticipantResult getResult() {
        if (mo2411M("result_type")) {
            return null;
        }
        return new ParticipantResult(getParticipantId(), getInteger("result_type"), getInteger("placing"));
    }

    public int getStatus() {
        return getInteger("player_status");
    }

    public int hashCode() {
        return ParticipantEntity.m780a(this);
    }

    public boolean isConnectedToRoom() {
        return getInteger("connected") > 0;
    }

    public String toString() {
        return ParticipantEntity.m783b((Participant) this);
    }

    public void writeToParcel(Parcel dest, int flags) {
        ((ParticipantEntity) freeze()).writeToParcel(dest, flags);
    }
}
