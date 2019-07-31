package com.google.android.gms.internal;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.C0270b.C0271a;
import com.google.android.gms.dynamic.C0273c;

/* renamed from: com.google.android.gms.internal.bm */
public final class C0442bm implements SafeParcelable {
    public static final C0441bl CREATOR = new C0441bl();

    /* renamed from: ej */
    public final C0503cu f1186ej;

    /* renamed from: gG */
    public final C0436bj f1187gG;

    /* renamed from: gH */
    public final C0955q f1188gH;

    /* renamed from: gI */
    public final C0443bn f1189gI;

    /* renamed from: gJ */
    public final C0505cw f1190gJ;

    /* renamed from: gK */
    public final C0369al f1191gK;

    /* renamed from: gL */
    public final String f1192gL;

    /* renamed from: gM */
    public final boolean f1193gM;

    /* renamed from: gN */
    public final String f1194gN;

    /* renamed from: gO */
    public final C0448bq f1195gO;

    /* renamed from: gP */
    public final int f1196gP;

    /* renamed from: go */
    public final String f1197go;
    public final int orientation;
    public final int versionCode;

    C0442bm(int i, C0436bj bjVar, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z, String str2, IBinder iBinder5, int i2, int i3, String str3, C0503cu cuVar) {
        this.versionCode = i;
        this.f1187gG = bjVar;
        this.f1188gH = (C0955q) C0273c.m633b(C0271a.m632E(iBinder));
        this.f1189gI = (C0443bn) C0273c.m633b(C0271a.m632E(iBinder2));
        this.f1190gJ = (C0505cw) C0273c.m633b(C0271a.m632E(iBinder3));
        this.f1191gK = (C0369al) C0273c.m633b(C0271a.m632E(iBinder4));
        this.f1192gL = str;
        this.f1193gM = z;
        this.f1194gN = str2;
        this.f1195gO = (C0448bq) C0273c.m633b(C0271a.m632E(iBinder5));
        this.orientation = i2;
        this.f1196gP = i3;
        this.f1197go = str3;
        this.f1186ej = cuVar;
    }

    public C0442bm(C0436bj bjVar, C0955q qVar, C0443bn bnVar, C0448bq bqVar, C0503cu cuVar) {
        this.versionCode = 1;
        this.f1187gG = bjVar;
        this.f1188gH = qVar;
        this.f1189gI = bnVar;
        this.f1190gJ = null;
        this.f1191gK = null;
        this.f1192gL = null;
        this.f1193gM = false;
        this.f1194gN = null;
        this.f1195gO = bqVar;
        this.orientation = -1;
        this.f1196gP = 4;
        this.f1197go = null;
        this.f1186ej = cuVar;
    }

    public C0442bm(C0955q qVar, C0443bn bnVar, C0369al alVar, C0448bq bqVar, C0505cw cwVar, boolean z, int i, String str, C0503cu cuVar) {
        this.versionCode = 1;
        this.f1187gG = null;
        this.f1188gH = qVar;
        this.f1189gI = bnVar;
        this.f1190gJ = cwVar;
        this.f1191gK = alVar;
        this.f1192gL = null;
        this.f1193gM = z;
        this.f1194gN = null;
        this.f1195gO = bqVar;
        this.orientation = i;
        this.f1196gP = 3;
        this.f1197go = str;
        this.f1186ej = cuVar;
    }

    public C0442bm(C0955q qVar, C0443bn bnVar, C0369al alVar, C0448bq bqVar, C0505cw cwVar, boolean z, int i, String str, String str2, C0503cu cuVar) {
        this.versionCode = 1;
        this.f1187gG = null;
        this.f1188gH = qVar;
        this.f1189gI = bnVar;
        this.f1190gJ = cwVar;
        this.f1191gK = alVar;
        this.f1192gL = str2;
        this.f1193gM = z;
        this.f1194gN = str;
        this.f1195gO = bqVar;
        this.orientation = i;
        this.f1196gP = 3;
        this.f1197go = null;
        this.f1186ej = cuVar;
    }

    public C0442bm(C0955q qVar, C0443bn bnVar, C0448bq bqVar, C0505cw cwVar, int i, C0503cu cuVar) {
        this.versionCode = 1;
        this.f1187gG = null;
        this.f1188gH = qVar;
        this.f1189gI = bnVar;
        this.f1190gJ = cwVar;
        this.f1191gK = null;
        this.f1192gL = null;
        this.f1193gM = false;
        this.f1194gN = null;
        this.f1195gO = bqVar;
        this.orientation = i;
        this.f1196gP = 1;
        this.f1197go = null;
        this.f1186ej = cuVar;
    }

    public C0442bm(C0955q qVar, C0443bn bnVar, C0448bq bqVar, C0505cw cwVar, boolean z, int i, C0503cu cuVar) {
        this.versionCode = 1;
        this.f1187gG = null;
        this.f1188gH = qVar;
        this.f1189gI = bnVar;
        this.f1190gJ = cwVar;
        this.f1191gK = null;
        this.f1192gL = null;
        this.f1193gM = z;
        this.f1194gN = null;
        this.f1195gO = bqVar;
        this.orientation = i;
        this.f1196gP = 2;
        this.f1197go = null;
        this.f1186ej = cuVar;
    }

    /* renamed from: a */
    public static C0442bm m989a(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(C0442bm.class.getClassLoader());
            return (C0442bm) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception e) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m990a(Intent intent, C0442bm bmVar) {
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bmVar);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: aa */
    public IBinder mo3588aa() {
        return C0273c.m634h(this.f1188gH).asBinder();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ab */
    public IBinder mo3589ab() {
        return C0273c.m634h(this.f1189gI).asBinder();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ac */
    public IBinder mo3590ac() {
        return C0273c.m634h(this.f1190gJ).asBinder();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ad */
    public IBinder mo3591ad() {
        return C0273c.m634h(this.f1191gK).asBinder();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ae */
    public IBinder mo3592ae() {
        return C0273c.m634h(this.f1195gO).asBinder();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel out, int flags) {
        C0441bl.m986a(this, out, flags);
    }
}
