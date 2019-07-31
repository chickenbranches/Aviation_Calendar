package com.google.android.gms.games.multiplayer;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;
import com.google.android.gms.games.PlayerEntity;

/* renamed from: com.google.android.gms.games.multiplayer.c */
public class C0337c implements Creator<ParticipantEntity> {
    /* renamed from: a */
    static void m793a(ParticipantEntity participantEntity, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m339a(parcel, 1, participantEntity.getParticipantId(), false);
        C0175b.m350c(parcel, 1000, participantEntity.getVersionCode());
        C0175b.m339a(parcel, 2, participantEntity.getDisplayName(), false);
        C0175b.m337a(parcel, 3, (Parcelable) participantEntity.getIconImageUri(), i, false);
        C0175b.m337a(parcel, 4, (Parcelable) participantEntity.getHiResImageUri(), i, false);
        C0175b.m350c(parcel, 5, participantEntity.getStatus());
        C0175b.m339a(parcel, 6, participantEntity.mo3196dy(), false);
        C0175b.m342a(parcel, 7, participantEntity.isConnectedToRoom());
        C0175b.m337a(parcel, 8, (Parcelable) participantEntity.getPlayer(), i, false);
        C0175b.m350c(parcel, 9, participantEntity.getCapabilities());
        C0175b.m337a(parcel, 10, (Parcelable) participantEntity.getResult(), i, false);
        C0175b.m329D(parcel, o);
    }

    /* renamed from: aJ */
    public ParticipantEntity[] newArray(int i) {
        return new ParticipantEntity[i];
    }

    /* renamed from: ab */
    public ParticipantEntity createFromParcel(Parcel parcel) {
        int i = 0;
        ParticipantResult participantResult = null;
        int n = C0173a.m313n(parcel);
        PlayerEntity playerEntity = null;
        boolean z = false;
        String str = null;
        int i2 = 0;
        Uri uri = null;
        Uri uri2 = null;
        String str2 = null;
        String str3 = null;
        int i3 = 0;
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
                    uri2 = (Uri) C0173a.m294a(parcel, m, Uri.CREATOR);
                    break;
                case 4:
                    uri = (Uri) C0173a.m294a(parcel, m, Uri.CREATOR);
                    break;
                case 5:
                    i2 = C0173a.m305g(parcel, m);
                    break;
                case 6:
                    str = C0173a.m312m(parcel, m);
                    break;
                case 7:
                    z = C0173a.m301c(parcel, m);
                    break;
                case 8:
                    playerEntity = (PlayerEntity) C0173a.m294a(parcel, m, PlayerEntity.CREATOR);
                    break;
                case 9:
                    i = C0173a.m305g(parcel, m);
                    break;
                case 10:
                    participantResult = (ParticipantResult) C0173a.m294a(parcel, m, (Creator<T>) ParticipantResult.CREATOR);
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
            return new ParticipantEntity(i3, str3, str2, uri2, uri, i2, str, z, playerEntity, i, participantResult);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }
}
