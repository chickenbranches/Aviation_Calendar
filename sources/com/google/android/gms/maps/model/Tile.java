package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.internal.C1056r;

public final class Tile implements SafeParcelable {
    public static final TileCreator CREATOR = new TileCreator();
    public final byte[] data;
    public final int height;

    /* renamed from: kg */
    private final int f2614kg;
    public final int width;

    Tile(int versionCode, int width2, int height2, byte[] data2) {
        this.f2614kg = versionCode;
        this.width = width2;
        this.height = height2;
        this.data = data2;
    }

    public Tile(int width2, int height2, byte[] data2) {
        this(1, width2, height2, data2);
    }

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: 0000 */
    public int getVersionCode() {
        return this.f2614kg;
    }

    public void writeToParcel(Parcel out, int flags) {
        if (C1056r.m3143eD()) {
            C1067i.m3181a(this, out, flags);
        } else {
            TileCreator.m3166a(this, out, flags);
        }
    }
}
