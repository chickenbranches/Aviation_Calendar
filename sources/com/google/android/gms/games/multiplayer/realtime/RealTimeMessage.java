package com.google.android.gms.games.multiplayer.realtime;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.C0600eg;

public final class RealTimeMessage implements Parcelable {
    public static final Creator<RealTimeMessage> CREATOR = new Creator<RealTimeMessage>() {
        /* renamed from: aK */
        public RealTimeMessage[] newArray(int i) {
            return new RealTimeMessage[i];
        }

        /* renamed from: ac */
        public RealTimeMessage createFromParcel(Parcel parcel) {
            return new RealTimeMessage(parcel);
        }
    };
    public static final int RELIABLE = 1;
    public static final int UNRELIABLE = 0;

    /* renamed from: wA */
    private final String f766wA;

    /* renamed from: wB */
    private final byte[] f767wB;

    /* renamed from: wC */
    private final int f768wC;

    private RealTimeMessage(Parcel parcel) {
        this(parcel.readString(), parcel.createByteArray(), parcel.readInt());
    }

    public RealTimeMessage(String senderParticipantId, byte[] messageData, int isReliable) {
        this.f766wA = (String) C0600eg.m1554f(senderParticipantId);
        this.f767wB = (byte[]) ((byte[]) C0600eg.m1554f(messageData)).clone();
        this.f768wC = isReliable;
    }

    public int describeContents() {
        return 0;
    }

    public byte[] getMessageData() {
        return this.f767wB;
    }

    public String getSenderParticipantId() {
        return this.f766wA;
    }

    public boolean isReliable() {
        return this.f768wC == 1;
    }

    public void writeToParcel(Parcel parcel, int flag) {
        parcel.writeString(this.f766wA);
        parcel.writeByteArray(this.f767wB);
        parcel.writeInt(this.f768wC);
    }
}
