package com.google.android.gms.games.multiplayer.turnbased;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.p000v4.util.TimeUtils;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import java.util.ArrayList;

public class TurnBasedMatchEntityCreator implements Creator<TurnBasedMatchEntity> {
    public static final int CONTENT_DESCRIPTION = 0;

    /* renamed from: a */
    static void m824a(TurnBasedMatchEntity turnBasedMatchEntity, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m337a(parcel, 1, (Parcelable) turnBasedMatchEntity.getGame(), i, false);
        C0175b.m339a(parcel, 2, turnBasedMatchEntity.getMatchId(), false);
        C0175b.m339a(parcel, 3, turnBasedMatchEntity.getCreatorId(), false);
        C0175b.m333a(parcel, 4, turnBasedMatchEntity.getCreationTimestamp());
        C0175b.m339a(parcel, 5, turnBasedMatchEntity.getLastUpdaterId(), false);
        C0175b.m333a(parcel, 6, turnBasedMatchEntity.getLastUpdatedTimestamp());
        C0175b.m339a(parcel, 7, turnBasedMatchEntity.getPendingParticipantId(), false);
        C0175b.m350c(parcel, 8, turnBasedMatchEntity.getStatus());
        C0175b.m350c(parcel, 10, turnBasedMatchEntity.getVariant());
        C0175b.m350c(parcel, 11, turnBasedMatchEntity.getVersion());
        C0175b.m343a(parcel, 12, turnBasedMatchEntity.getData(), false);
        C0175b.m349b(parcel, 13, turnBasedMatchEntity.getParticipants(), false);
        C0175b.m339a(parcel, 14, turnBasedMatchEntity.getRematchId(), false);
        C0175b.m343a(parcel, 15, turnBasedMatchEntity.getPreviousMatchData(), false);
        C0175b.m334a(parcel, 17, turnBasedMatchEntity.getAutoMatchCriteria(), false);
        C0175b.m350c(parcel, 16, turnBasedMatchEntity.getMatchNumber());
        C0175b.m350c(parcel, 1000, turnBasedMatchEntity.getVersionCode());
        C0175b.m342a(parcel, 19, turnBasedMatchEntity.isLocallyModified());
        C0175b.m350c(parcel, 18, turnBasedMatchEntity.getTurnStatus());
        C0175b.m329D(parcel, o);
    }

    public TurnBasedMatchEntity createFromParcel(Parcel parcel) {
        int n = C0173a.m313n(parcel);
        int i = 0;
        GameEntity gameEntity = null;
        String str = null;
        String str2 = null;
        long j = 0;
        String str3 = null;
        long j2 = 0;
        String str4 = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        byte[] bArr = null;
        ArrayList arrayList = null;
        String str5 = null;
        byte[] bArr2 = null;
        int i5 = 0;
        Bundle bundle = null;
        int i6 = 0;
        boolean z = false;
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
                    str2 = C0173a.m312m(parcel, m);
                    break;
                case 4:
                    j = C0173a.m306h(parcel, m);
                    break;
                case 5:
                    str3 = C0173a.m312m(parcel, m);
                    break;
                case 6:
                    j2 = C0173a.m306h(parcel, m);
                    break;
                case 7:
                    str4 = C0173a.m312m(parcel, m);
                    break;
                case 8:
                    i2 = C0173a.m305g(parcel, m);
                    break;
                case 10:
                    i3 = C0173a.m305g(parcel, m);
                    break;
                case 11:
                    i4 = C0173a.m305g(parcel, m);
                    break;
                case 12:
                    bArr = C0173a.m316p(parcel, m);
                    break;
                case 13:
                    arrayList = C0173a.m300c(parcel, m, ParticipantEntity.CREATOR);
                    break;
                case 14:
                    str5 = C0173a.m312m(parcel, m);
                    break;
                case 15:
                    bArr2 = C0173a.m316p(parcel, m);
                    break;
                case 16:
                    i5 = C0173a.m305g(parcel, m);
                    break;
                case 17:
                    bundle = C0173a.m315o(parcel, m);
                    break;
                case 18:
                    i6 = C0173a.m305g(parcel, m);
                    break;
                case TimeUtils.HUNDRED_DAY_FIELD_LEN /*19*/:
                    z = C0173a.m301c(parcel, m);
                    break;
                case 1000:
                    i = C0173a.m305g(parcel, m);
                    break;
                default:
                    C0173a.m298b(parcel, m);
                    break;
            }
        }
        if (parcel.dataPosition() == n) {
            return new TurnBasedMatchEntity(i, gameEntity, str, str2, j, str3, j2, str4, i2, i3, i4, bArr, arrayList, str5, bArr2, i5, bundle, i6, z);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }

    public TurnBasedMatchEntity[] newArray(int size) {
        return new TurnBasedMatchEntity[size];
    }
}
