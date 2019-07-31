package com.google.android.gms.games.multiplayer.turnbased;

import com.google.android.gms.common.data.C0163d;
import com.google.android.gms.common.data.DataHolder;

public final class TurnBasedMatchBuffer extends C0163d<TurnBasedMatch> {
    public TurnBasedMatchBuffer(DataHolder dataHolder) {
        super(dataHolder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: getEntry */
    public TurnBasedMatch mo2422a(int rowIndex, int numChildren) {
        return new C0346a(this.f299nE, rowIndex, numChildren);
    }

    /* access modifiers changed from: protected */
    public String getPrimaryDataMarkerColumn() {
        return "external_match_id";
    }
}
