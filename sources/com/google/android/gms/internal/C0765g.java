package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.g */
public class C0765g extends C0625f {

    /* renamed from: com.google.android.gms.internal.g$a */
    class C0766a {

        /* renamed from: dH */
        private String f1853dH;

        /* renamed from: dI */
        private boolean f1854dI;

        public C0766a(String str, boolean z) {
            this.f1853dH = str;
            this.f1854dI = z;
        }

        public String getId() {
            return this.f1853dH;
        }

        public boolean isLimitAdTrackingEnabled() {
            return this.f1854dI;
        }
    }

    private C0765g(Context context, C0941j jVar, C0944k kVar) {
        super(context, jVar, kVar);
    }

    /* renamed from: a */
    public static C0765g m2317a(String str, Context context) {
        C0348a aVar = new C0348a();
        m1678a(str, context, aVar);
        return new C0765g(context, aVar, new C0947m(239));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo3936b(Context context) {
        long j = 1;
        super.mo3936b(context);
        try {
            C0766a f = mo4427f(context);
            try {
                if (!f.isLimitAdTrackingEnabled()) {
                    j = 0;
                }
                mo3933a(28, j);
                String id = f.getId();
                if (id != null) {
                    mo3934a(30, id);
                }
            } catch (IOException e) {
            }
        } catch (GooglePlayServicesNotAvailableException e2) {
        } catch (IOException e3) {
            mo3933a(28, 1);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public C0766a mo4427f(Context context) throws IOException, GooglePlayServicesNotAvailableException {
        String str;
        int i = 0;
        try {
            Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            String id = advertisingIdInfo.getId();
            if (id == null || !id.matches("^[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}$")) {
                str = id;
            } else {
                byte[] bArr = new byte[16];
                int i2 = 0;
                while (i < id.length()) {
                    if (i == 8 || i == 13 || i == 18 || i == 23) {
                        i++;
                    }
                    bArr[i2] = (byte) ((Character.digit(id.charAt(i), 16) << 4) + Character.digit(id.charAt(i + 1), 16));
                    i2++;
                    i += 2;
                }
                str = this.f1551dw.mo3419a(bArr, true);
            }
            return new C0766a(str, advertisingIdInfo.isLimitAdTrackingEnabled());
        } catch (GooglePlayServicesRepairableException e) {
            throw new IOException(e);
        }
    }
}
