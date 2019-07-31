package com.google.android.gms.internal;

import com.google.android.gms.plus.PlusShare;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.cg */
public final class C0482cg {
    /* access modifiers changed from: private */

    /* renamed from: fx */
    public final Object f1272fx = new Object();

    /* renamed from: gv */
    private C0505cw f1273gv;
    /* access modifiers changed from: private */

    /* renamed from: hK */
    public String f1274hK;
    /* access modifiers changed from: private */

    /* renamed from: hL */
    public String f1275hL;

    /* renamed from: hM */
    public final C0378an f1276hM = new C0378an() {
        /* renamed from: a */
        public void mo3504a(C0505cw cwVar, Map<String, String> map) {
            synchronized (C0482cg.this.f1272fx) {
                String str = (String) map.get("errors");
                C0502ct.m1156v("Invalid " + ((String) map.get("type")) + " request error: " + str);
                C0482cg.this.f1278hm = 1;
                C0482cg.this.f1272fx.notify();
            }
        }
    };

    /* renamed from: hN */
    public final C0378an f1277hN = new C0378an() {
        /* renamed from: a */
        public void mo3504a(C0505cw cwVar, Map<String, String> map) {
            synchronized (C0482cg.this.f1272fx) {
                String str = (String) map.get(PlusShare.KEY_CALL_TO_ACTION_URL);
                if (str == null) {
                    C0502ct.m1156v("URL missing in loadAdUrl GMSG.");
                    return;
                }
                if (str.contains("%40mediation_adapters%40")) {
                    str = str.replaceAll("%40mediation_adapters%40", C0489cl.m1102b(cwVar.getContext(), (String) map.get("check_adapters"), C0482cg.this.f1274hK));
                    C0502ct.m1155u("Ad request URL modified to " + str);
                }
                C0482cg.this.f1275hL = str;
                C0482cg.this.f1272fx.notify();
            }
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: hm */
    public int f1278hm = -2;

    public C0482cg(String str) {
        this.f1274hK = str;
    }

    /* renamed from: ap */
    public String mo3651ap() {
        String str;
        synchronized (this.f1272fx) {
            while (this.f1275hL == null && this.f1278hm == -2) {
                try {
                    this.f1272fx.wait();
                } catch (InterruptedException e) {
                    C0502ct.m1156v("Ad request service was interrupted.");
                    str = null;
                }
            }
            str = this.f1275hL;
        }
        return str;
    }

    /* renamed from: b */
    public void mo3652b(C0505cw cwVar) {
        synchronized (this.f1272fx) {
            this.f1273gv = cwVar;
        }
    }

    public int getErrorCode() {
        int i;
        synchronized (this.f1272fx) {
            i = this.f1278hm;
        }
        return i;
    }
}
