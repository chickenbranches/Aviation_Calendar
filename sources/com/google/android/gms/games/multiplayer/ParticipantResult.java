package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C0600eg;
import com.google.android.gms.internal.C0792gd;

public final class ParticipantResult implements SafeParcelable {
    public static final ParticipantResultCreator CREATOR = new ParticipantResultCreator();
    public static final int MATCH_RESULT_DISAGREED = 5;
    public static final int MATCH_RESULT_DISCONNECT = 4;
    public static final int MATCH_RESULT_LOSS = 1;
    public static final int MATCH_RESULT_NONE = 3;
    public static final int MATCH_RESULT_TIE = 2;
    public static final int MATCH_RESULT_UNINITIALIZED = -1;
    public static final int MATCH_RESULT_WIN = 0;
    public static final int PLACING_UNINITIALIZED = -1;

    /* renamed from: kg */
    private final int f758kg;

    /* renamed from: up */
    private final String f759up;

    /* renamed from: wy */
    private final int f760wy;

    /* renamed from: wz */
    private final int f761wz;

    public ParticipantResult(int versionCode, String participantId, int result, int placing) {
        this.f758kg = versionCode;
        this.f759up = (String) C0600eg.m1554f(participantId);
        C0600eg.m1555p(C0792gd.isValid(result));
        this.f760wy = result;
        this.f761wz = placing;
    }

    public ParticipantResult(String participantId, int result, int placing) {
        this(1, participantId, result, placing);
    }

    public int describeContents() {
        return 0;
    }

    public String getParticipantId() {
        return this.f759up;
    }

    public int getPlacing() {
        return this.f761wz;
    }

    public int getResult() {
        return this.f760wy;
    }

    public int getVersionCode() {
        return this.f758kg;
    }

    public void writeToParcel(Parcel out, int flags) {
        ParticipantResultCreator.m788a(this, out, flags);
    }
}
