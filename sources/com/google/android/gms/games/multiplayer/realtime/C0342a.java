package com.google.android.gms.games.multiplayer.realtime;

import com.google.android.gms.common.data.C0163d;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: com.google.android.gms.games.multiplayer.realtime.a */
public final class C0342a extends C0163d<Room> {
    public C0342a(DataHolder dataHolder) {
        super(dataHolder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Room mo2422a(int i, int i2) {
        return new C0344c(this.f299nE, i, i2);
    }

    /* access modifiers changed from: protected */
    public String getPrimaryDataMarkerColumn() {
        return "external_match_id";
    }
}
