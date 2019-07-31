package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;

/* renamed from: com.google.android.gms.games.a */
public class C0320a implements Creator<GameEntity> {
    /* renamed from: a */
    static void m733a(GameEntity gameEntity, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m339a(parcel, 1, gameEntity.getApplicationId(), false);
        C0175b.m339a(parcel, 2, gameEntity.getDisplayName(), false);
        C0175b.m339a(parcel, 3, gameEntity.getPrimaryCategory(), false);
        C0175b.m339a(parcel, 4, gameEntity.getSecondaryCategory(), false);
        C0175b.m339a(parcel, 5, gameEntity.getDescription(), false);
        C0175b.m339a(parcel, 6, gameEntity.getDeveloperName(), false);
        C0175b.m337a(parcel, 7, (Parcelable) gameEntity.getIconImageUri(), i, false);
        C0175b.m337a(parcel, 8, (Parcelable) gameEntity.getHiResImageUri(), i, false);
        C0175b.m337a(parcel, 9, (Parcelable) gameEntity.getFeaturedImageUri(), i, false);
        C0175b.m342a(parcel, 10, gameEntity.isPlayEnabledGame());
        C0175b.m342a(parcel, 11, gameEntity.isInstanceInstalled());
        C0175b.m339a(parcel, 12, gameEntity.getInstancePackageName(), false);
        C0175b.m350c(parcel, 13, gameEntity.getGameplayAclStatus());
        C0175b.m350c(parcel, 14, gameEntity.getAchievementTotalCount());
        C0175b.m350c(parcel, 15, gameEntity.getLeaderboardCount());
        C0175b.m342a(parcel, 17, gameEntity.isTurnBasedMultiplayerEnabled());
        C0175b.m342a(parcel, 16, gameEntity.isRealTimeMultiplayerEnabled());
        C0175b.m350c(parcel, 1000, gameEntity.getVersionCode());
        C0175b.m329D(parcel, o);
    }

    /* renamed from: Y */
    public GameEntity createFromParcel(Parcel parcel) {
        int n = C0173a.m313n(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        Uri uri = null;
        Uri uri2 = null;
        Uri uri3 = null;
        boolean z = false;
        boolean z2 = false;
        String str7 = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        boolean z3 = false;
        boolean z4 = false;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            switch (C0173a.m292M(m)) {
                case 1:
                    str = C0173a.m312m(parcel, m);
                    break;
                case 2:
                    str2 = C0173a.m312m(parcel, m);
                    break;
                case 3:
                    str3 = C0173a.m312m(parcel, m);
                    break;
                case 4:
                    str4 = C0173a.m312m(parcel, m);
                    break;
                case 5:
                    str5 = C0173a.m312m(parcel, m);
                    break;
                case 6:
                    str6 = C0173a.m312m(parcel, m);
                    break;
                case 7:
                    uri = (Uri) C0173a.m294a(parcel, m, Uri.CREATOR);
                    break;
                case 8:
                    uri2 = (Uri) C0173a.m294a(parcel, m, Uri.CREATOR);
                    break;
                case 9:
                    uri3 = (Uri) C0173a.m294a(parcel, m, Uri.CREATOR);
                    break;
                case 10:
                    z = C0173a.m301c(parcel, m);
                    break;
                case 11:
                    z2 = C0173a.m301c(parcel, m);
                    break;
                case 12:
                    str7 = C0173a.m312m(parcel, m);
                    break;
                case 13:
                    i2 = C0173a.m305g(parcel, m);
                    break;
                case 14:
                    i3 = C0173a.m305g(parcel, m);
                    break;
                case 15:
                    i4 = C0173a.m305g(parcel, m);
                    break;
                case 16:
                    z3 = C0173a.m301c(parcel, m);
                    break;
                case 17:
                    z4 = C0173a.m301c(parcel, m);
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
            return new GameEntity(i, str, str2, str3, str4, str5, str6, uri, uri2, uri3, z, z2, str7, i2, i3, i4, z3, z4);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }

    /* renamed from: az */
    public GameEntity[] newArray(int i) {
        return new GameEntity[i];
    }
}
