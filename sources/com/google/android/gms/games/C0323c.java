package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;

/* renamed from: com.google.android.gms.games.c */
public class C0323c implements Creator<PlayerEntity> {
    /* renamed from: a */
    static void m736a(PlayerEntity playerEntity, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m339a(parcel, 1, playerEntity.getPlayerId(), false);
        C0175b.m350c(parcel, 1000, playerEntity.getVersionCode());
        C0175b.m339a(parcel, 2, playerEntity.getDisplayName(), false);
        C0175b.m337a(parcel, 3, (Parcelable) playerEntity.getIconImageUri(), i, false);
        C0175b.m337a(parcel, 4, (Parcelable) playerEntity.getHiResImageUri(), i, false);
        C0175b.m333a(parcel, 5, playerEntity.getRetrievedTimestamp());
        C0175b.m350c(parcel, 6, playerEntity.mo3014db());
        C0175b.m333a(parcel, 7, playerEntity.getLastPlayedWithTimestamp());
        C0175b.m329D(parcel, o);
    }

    /* renamed from: Z */
    public PlayerEntity createFromParcel(Parcel parcel) {
        long j = 0;
        int i = 0;
        Uri uri = null;
        int n = C0173a.m313n(parcel);
        long j2 = 0;
        Uri uri2 = null;
        String str = null;
        String str2 = null;
        int i2 = 0;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            switch (C0173a.m292M(m)) {
                case 1:
                    str2 = C0173a.m312m(parcel, m);
                    break;
                case 2:
                    str = C0173a.m312m(parcel, m);
                    break;
                case 3:
                    uri2 = (Uri) C0173a.m294a(parcel, m, Uri.CREATOR);
                    break;
                case 4:
                    uri = (Uri) C0173a.m294a(parcel, m, Uri.CREATOR);
                    break;
                case 5:
                    j2 = C0173a.m306h(parcel, m);
                    break;
                case 6:
                    i = C0173a.m305g(parcel, m);
                    break;
                case 7:
                    j = C0173a.m306h(parcel, m);
                    break;
                case 1000:
                    i2 = C0173a.m305g(parcel, m);
                    break;
                default:
                    C0173a.m298b(parcel, m);
                    break;
            }
        }
        if (parcel.dataPosition() == n) {
            return new PlayerEntity(i2, str2, str, uri2, uri, j2, i, j);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }

    /* renamed from: aA */
    public PlayerEntity[] newArray(int i) {
        return new PlayerEntity[i];
    }
}
