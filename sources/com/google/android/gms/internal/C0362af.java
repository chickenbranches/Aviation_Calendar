package com.google.android.gms.internal;

import android.content.Context;
import android.location.Location;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.af */
public final class C0362af {
    public static final String DEVICE_ID_EMULATOR = C0501cs.m1148q("emulator");

    /* renamed from: d */
    private final Date f843d;

    /* renamed from: eL */
    private final int f844eL;

    /* renamed from: eM */
    private final Location f845eM;

    /* renamed from: eN */
    private final boolean f846eN;

    /* renamed from: eO */
    private final Map<Class<? extends NetworkExtras>, NetworkExtras> f847eO;

    /* renamed from: eP */
    private final String f848eP;

    /* renamed from: eQ */
    private final SearchAdRequest f849eQ;

    /* renamed from: eR */
    private final int f850eR;

    /* renamed from: eS */
    private final Set<String> f851eS;

    /* renamed from: f */
    private final Set<String> f852f;

    /* renamed from: com.google.android.gms.internal.af$a */
    public static final class C0363a {
        /* access modifiers changed from: private */

        /* renamed from: d */
        public Date f853d;
        /* access modifiers changed from: private */

        /* renamed from: eL */
        public int f854eL = -1;
        /* access modifiers changed from: private */

        /* renamed from: eM */
        public Location f855eM;
        /* access modifiers changed from: private */

        /* renamed from: eN */
        public boolean f856eN = false;
        /* access modifiers changed from: private */

        /* renamed from: eP */
        public String f857eP;
        /* access modifiers changed from: private */

        /* renamed from: eR */
        public int f858eR = -1;
        /* access modifiers changed from: private */

        /* renamed from: eT */
        public final HashSet<String> f859eT = new HashSet<>();
        /* access modifiers changed from: private */

        /* renamed from: eU */
        public final HashMap<Class<? extends NetworkExtras>, NetworkExtras> f860eU = new HashMap<>();
        /* access modifiers changed from: private */

        /* renamed from: eV */
        public final HashSet<String> f861eV = new HashSet<>();

        /* renamed from: a */
        public void mo3465a(Location location) {
            this.f855eM = location;
        }

        /* renamed from: a */
        public void mo3466a(NetworkExtras networkExtras) {
            this.f860eU.put(networkExtras.getClass(), networkExtras);
        }

        /* renamed from: a */
        public void mo3467a(Date date) {
            this.f853d = date;
        }

        /* renamed from: d */
        public void mo3468d(int i) {
            this.f854eL = i;
        }

        /* renamed from: d */
        public void mo3469d(boolean z) {
            this.f856eN = z;
        }

        /* renamed from: e */
        public void mo3470e(boolean z) {
            this.f858eR = z ? 1 : 0;
        }

        /* renamed from: g */
        public void mo3471g(String str) {
            this.f859eT.add(str);
        }

        /* renamed from: h */
        public void mo3472h(String str) {
            this.f861eV.add(str);
        }

        /* renamed from: i */
        public void mo3473i(String str) {
            this.f857eP = str;
        }
    }

    public C0362af(C0363a aVar) {
        this(aVar, null);
    }

    public C0362af(C0363a aVar, SearchAdRequest searchAdRequest) {
        this.f843d = aVar.f853d;
        this.f844eL = aVar.f854eL;
        this.f852f = Collections.unmodifiableSet(aVar.f859eT);
        this.f845eM = aVar.f855eM;
        this.f846eN = aVar.f856eN;
        this.f847eO = Collections.unmodifiableMap(aVar.f860eU);
        this.f848eP = aVar.f857eP;
        this.f849eQ = searchAdRequest;
        this.f850eR = aVar.f858eR;
        this.f851eS = Collections.unmodifiableSet(aVar.f861eV);
    }

    /* renamed from: Q */
    public SearchAdRequest mo3454Q() {
        return this.f849eQ;
    }

    /* renamed from: R */
    public Map<Class<? extends NetworkExtras>, NetworkExtras> mo3455R() {
        return this.f847eO;
    }

    /* renamed from: S */
    public int mo3456S() {
        return this.f850eR;
    }

    public Date getBirthday() {
        return this.f843d;
    }

    public int getGender() {
        return this.f844eL;
    }

    public Set<String> getKeywords() {
        return this.f852f;
    }

    public Location getLocation() {
        return this.f845eM;
    }

    public boolean getManualImpressionsEnabled() {
        return this.f846eN;
    }

    public <T extends NetworkExtras> T getNetworkExtras(Class<T> networkExtrasClass) {
        return (NetworkExtras) this.f847eO.get(networkExtrasClass);
    }

    public String getPublisherProvidedId() {
        return this.f848eP;
    }

    public boolean isTestDevice(Context context) {
        return this.f851eS.contains(C0501cs.m1147l(context));
    }
}
