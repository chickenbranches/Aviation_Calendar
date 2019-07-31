package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.internal.C0466bx.C0467a;
import com.google.android.gms.internal.C0466bx.C0468b;

/* renamed from: com.google.android.gms.internal.bw */
public final class C0464bw {

    /* renamed from: com.google.android.gms.internal.bw$a */
    public interface C0465a {
        /* renamed from: a */
        void mo3623a(C0474cb cbVar);
    }

    /* renamed from: a */
    public static C0490cm m1036a(Context context, C0470bz bzVar, C0465a aVar) {
        return bzVar.f1238ej.f1349iM ? m1037b(context, bzVar, aVar) : m1038c(context, bzVar, aVar);
    }

    /* renamed from: b */
    private static C0490cm m1037b(Context context, C0470bz bzVar, C0465a aVar) {
        C0502ct.m1152r("Fetching ad response from local ad request service.");
        C0467a aVar2 = new C0467a(context, bzVar, aVar);
        aVar2.start();
        return aVar2;
    }

    /* renamed from: c */
    private static C0490cm m1038c(Context context, C0470bz bzVar, C0465a aVar) {
        C0502ct.m1152r("Fetching ad response from remote ad request service.");
        if (GooglePlayServicesUtil.isGooglePlayServicesAvailable(context) == 0) {
            return new C0468b(context, bzVar, aVar);
        }
        C0502ct.m1156v("Failed to connect to remote ad request service.");
        return null;
    }
}
