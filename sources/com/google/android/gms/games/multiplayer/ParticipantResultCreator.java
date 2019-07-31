package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;

public class ParticipantResultCreator implements Creator<ParticipantResult> {
    public static final int CONTENT_DESCRIPTION = 0;

    /* renamed from: a */
    static void m788a(ParticipantResult participantResult, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m339a(parcel, 1, participantResult.getParticipantId(), false);
        C0175b.m350c(parcel, 1000, participantResult.getVersionCode());
        C0175b.m350c(parcel, 2, participantResult.getResult());
        C0175b.m350c(parcel, 3, participantResult.getPlacing());
        C0175b.m329D(parcel, o);
    }

    public ParticipantResult createFromParcel(Parcel parcel) {
        int i = 0;
        int n = C0173a.m313n(parcel);
        String str = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            switch (C0173a.m292M(m)) {
                case 1:
                    str = C0173a.m312m(parcel, m);
                    break;
                case 2:
                    i2 = C0173a.m305g(parcel, m);
                    break;
                case 3:
                    i = C0173a.m305g(parcel, m);
                    break;
                case 1000:
                    i3 = C0173a.m305g(parcel, m);
                    break;
                default:
                    C0173a.m298b(parcel, m);
                    break;
            }
        }
        if (parcel.dataPosition() == n) {
            return new ParticipantResult(i3, str, i2, i);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }

    public ParticipantResult[] newArray(int size) {
        return new ParticipantResult[size];
    }
}
