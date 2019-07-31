package com.google.android.gms.internal;

/* renamed from: com.google.android.gms.internal.ge */
public final class C0793ge {
    /* renamed from: aG */
    public static String m2354aG(int i) {
        switch (i) {
            case 0:
                return "DAILY";
            case 1:
                return "WEEKLY";
            case 2:
                return "ALL_TIME";
            default:
                throw new IllegalArgumentException("Unknown time span " + i);
        }
    }
}
