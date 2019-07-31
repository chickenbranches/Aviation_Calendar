package com.google.android.gms.games.multiplayer;

import com.google.android.gms.common.data.C0163d;
import com.google.android.gms.common.data.DataHolder;

public final class InvitationBuffer extends C0163d<Invitation> {
    public InvitationBuffer(DataHolder dataHolder) {
        super(dataHolder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: getEntry */
    public Invitation mo2422a(int rowIndex, int numChildren) {
        return new C0336b(this.f299nE, rowIndex, numChildren);
    }

    /* access modifiers changed from: protected */
    public String getPrimaryDataMarkerColumn() {
        return "external_invitation_id";
    }
}
