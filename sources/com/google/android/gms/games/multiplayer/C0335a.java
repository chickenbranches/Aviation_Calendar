package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;
import com.google.android.gms.games.GameEntity;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.games.multiplayer.a */
public class C0335a implements Creator<InvitationEntity> {
    /* renamed from: a */
    static void m790a(InvitationEntity invitationEntity, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m337a(parcel, 1, (Parcelable) invitationEntity.getGame(), i, false);
        C0175b.m350c(parcel, 1000, invitationEntity.getVersionCode());
        C0175b.m339a(parcel, 2, invitationEntity.getInvitationId(), false);
        C0175b.m333a(parcel, 3, invitationEntity.getCreationTimestamp());
        C0175b.m350c(parcel, 4, invitationEntity.getInvitationType());
        C0175b.m337a(parcel, 5, (Parcelable) invitationEntity.getInviter(), i, false);
        C0175b.m349b(parcel, 6, invitationEntity.getParticipants(), false);
        C0175b.m350c(parcel, 7, invitationEntity.getVariant());
        C0175b.m350c(parcel, 8, invitationEntity.getAvailableAutoMatchSlots());
        C0175b.m329D(parcel, o);
    }

    /* renamed from: aI */
    public InvitationEntity[] newArray(int i) {
        return new InvitationEntity[i];
    }

    /* renamed from: aa */
    public InvitationEntity createFromParcel(Parcel parcel) {
        ArrayList arrayList = null;
        int i = 0;
        int n = C0173a.m313n(parcel);
        long j = 0;
        int i2 = 0;
        ParticipantEntity participantEntity = null;
        int i3 = 0;
        String str = null;
        GameEntity gameEntity = null;
        int i4 = 0;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            switch (C0173a.m292M(m)) {
                case 1:
                    gameEntity = (GameEntity) C0173a.m294a(parcel, m, GameEntity.CREATOR);
                    break;
                case 2:
                    str = C0173a.m312m(parcel, m);
                    break;
                case 3:
                    j = C0173a.m306h(parcel, m);
                    break;
                case 4:
                    i3 = C0173a.m305g(parcel, m);
                    break;
                case 5:
                    participantEntity = (ParticipantEntity) C0173a.m294a(parcel, m, ParticipantEntity.CREATOR);
                    break;
                case 6:
                    arrayList = C0173a.m300c(parcel, m, ParticipantEntity.CREATOR);
                    break;
                case 7:
                    i2 = C0173a.m305g(parcel, m);
                    break;
                case 8:
                    i = C0173a.m305g(parcel, m);
                    break;
                case 1000:
                    i4 = C0173a.m305g(parcel, m);
                    break;
                default:
                    C0173a.m298b(parcel, m);
                    break;
            }
        }
        if (parcel.dataPosition() == n) {
            return new InvitationEntity(i4, gameEntity, str, j, i3, participantEntity, arrayList, i2, i);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }
}
