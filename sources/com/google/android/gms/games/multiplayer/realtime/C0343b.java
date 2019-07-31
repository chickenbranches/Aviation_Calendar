package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.games.multiplayer.realtime.b */
public class C0343b implements Creator<RoomEntity> {
    /* renamed from: a */
    static void m812a(RoomEntity roomEntity, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m339a(parcel, 1, roomEntity.getRoomId(), false);
        C0175b.m350c(parcel, 1000, roomEntity.getVersionCode());
        C0175b.m339a(parcel, 2, roomEntity.getCreatorId(), false);
        C0175b.m333a(parcel, 3, roomEntity.getCreationTimestamp());
        C0175b.m350c(parcel, 4, roomEntity.getStatus());
        C0175b.m339a(parcel, 5, roomEntity.getDescription(), false);
        C0175b.m350c(parcel, 6, roomEntity.getVariant());
        C0175b.m334a(parcel, 7, roomEntity.getAutoMatchCriteria(), false);
        C0175b.m349b(parcel, 8, roomEntity.getParticipants(), false);
        C0175b.m350c(parcel, 9, roomEntity.getAutoMatchWaitEstimateSeconds());
        C0175b.m329D(parcel, o);
    }

    /* renamed from: aL */
    public RoomEntity[] newArray(int i) {
        return new RoomEntity[i];
    }

    /* renamed from: ad */
    public RoomEntity createFromParcel(Parcel parcel) {
        int i = 0;
        ArrayList arrayList = null;
        int n = C0173a.m313n(parcel);
        long j = 0;
        Bundle bundle = null;
        int i2 = 0;
        String str = null;
        int i3 = 0;
        String str2 = null;
        String str3 = null;
        int i4 = 0;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            switch (C0173a.m292M(m)) {
                case 1:
                    str3 = C0173a.m312m(parcel, m);
                    break;
                case 2:
                    str2 = C0173a.m312m(parcel, m);
                    break;
                case 3:
                    j = C0173a.m306h(parcel, m);
                    break;
                case 4:
                    i3 = C0173a.m305g(parcel, m);
                    break;
                case 5:
                    str = C0173a.m312m(parcel, m);
                    break;
                case 6:
                    i2 = C0173a.m305g(parcel, m);
                    break;
                case 7:
                    bundle = C0173a.m315o(parcel, m);
                    break;
                case 8:
                    arrayList = C0173a.m300c(parcel, m, ParticipantEntity.CREATOR);
                    break;
                case 9:
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
            return new RoomEntity(i4, str3, str2, j, i3, str, i2, bundle, arrayList, i);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }
}
