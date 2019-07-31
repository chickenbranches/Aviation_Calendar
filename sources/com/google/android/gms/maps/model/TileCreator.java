package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;

public class TileCreator implements Creator<Tile> {
    public static final int CONTENT_DESCRIPTION = 0;

    /* renamed from: a */
    static void m3166a(Tile tile, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m350c(parcel, 1, tile.getVersionCode());
        C0175b.m350c(parcel, 2, tile.width);
        C0175b.m350c(parcel, 3, tile.height);
        C0175b.m343a(parcel, 4, tile.data, false);
        C0175b.m329D(parcel, o);
    }

    public Tile createFromParcel(Parcel parcel) {
        int i = 0;
        int n = C0173a.m313n(parcel);
        byte[] bArr = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            switch (C0173a.m292M(m)) {
                case 1:
                    i3 = C0173a.m305g(parcel, m);
                    break;
                case 2:
                    i2 = C0173a.m305g(parcel, m);
                    break;
                case 3:
                    i = C0173a.m305g(parcel, m);
                    break;
                case 4:
                    bArr = C0173a.m316p(parcel, m);
                    break;
                default:
                    C0173a.m298b(parcel, m);
                    break;
            }
        }
        if (parcel.dataPosition() == n) {
            return new Tile(i3, i2, i, bArr);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }

    public Tile[] newArray(int size) {
        return new Tile[size];
    }
}
