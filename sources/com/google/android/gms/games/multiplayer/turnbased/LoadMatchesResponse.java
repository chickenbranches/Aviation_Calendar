package com.google.android.gms.games.multiplayer.turnbased;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.multiplayer.InvitationBuffer;
import com.google.android.gms.internal.C0794gf;

public final class LoadMatchesResponse {

    /* renamed from: wO */
    private final InvitationBuffer f796wO;

    /* renamed from: wP */
    private final TurnBasedMatchBuffer f797wP;

    /* renamed from: wQ */
    private final TurnBasedMatchBuffer f798wQ;

    /* renamed from: wR */
    private final TurnBasedMatchBuffer f799wR;

    public LoadMatchesResponse(Bundle matchData) {
        DataHolder a = m815a(matchData, 0);
        if (a != null) {
            this.f796wO = new InvitationBuffer(a);
        } else {
            this.f796wO = null;
        }
        DataHolder a2 = m815a(matchData, 1);
        if (a2 != null) {
            this.f797wP = new TurnBasedMatchBuffer(a2);
        } else {
            this.f797wP = null;
        }
        DataHolder a3 = m815a(matchData, 2);
        if (a3 != null) {
            this.f798wQ = new TurnBasedMatchBuffer(a3);
        } else {
            this.f798wQ = null;
        }
        DataHolder a4 = m815a(matchData, 3);
        if (a4 != null) {
            this.f799wR = new TurnBasedMatchBuffer(a4);
        } else {
            this.f799wR = null;
        }
    }

    /* renamed from: a */
    private static DataHolder m815a(Bundle bundle, int i) {
        String aG = C0794gf.m2355aG(i);
        if (!bundle.containsKey(aG)) {
            return null;
        }
        return (DataHolder) bundle.getParcelable(aG);
    }

    public void close() {
        if (this.f796wO != null) {
            this.f796wO.close();
        }
        if (this.f797wP != null) {
            this.f797wP.close();
        }
        if (this.f798wQ != null) {
            this.f798wQ.close();
        }
        if (this.f799wR != null) {
            this.f799wR.close();
        }
    }

    public TurnBasedMatchBuffer getCompletedMatches() {
        return this.f799wR;
    }

    public InvitationBuffer getInvitations() {
        return this.f796wO;
    }

    public TurnBasedMatchBuffer getMyTurnMatches() {
        return this.f797wP;
    }

    public TurnBasedMatchBuffer getTheirTurnMatches() {
        return this.f798wQ;
    }
}
