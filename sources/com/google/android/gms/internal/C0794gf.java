package com.google.android.gms.internal;

/* renamed from: com.google.android.gms.internal.gf */
public final class C0794gf {
    /* renamed from: aG */
    public static String m2355aG(int i) {
        switch (i) {
            case 0:
                return "TURN_STATUS_INVITED";
            case 1:
                return "TURN_STATUS_MY_TURN";
            case 2:
                return "TURN_STATUS_THEIR_TURN";
            case 3:
                return "TURN_STATUS_COMPLETE";
            default:
                C0704fn.m1920d("MatchTurnStatus", "Unknown match turn status: " + i);
                return "TURN_STATUS_UNKNOWN";
        }
    }
}
