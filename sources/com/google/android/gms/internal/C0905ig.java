package com.google.android.gms.internal;

import android.os.Parcel;
import android.support.p000v4.util.TimeUtils;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C0613es.C0614a;
import com.google.android.gms.plus.PlusShare;
import com.google.android.gms.plus.model.people.Person;
import com.google.android.gms.plus.model.people.Person.AgeRange;
import com.google.android.gms.plus.model.people.Person.Cover;
import com.google.android.gms.plus.model.people.Person.Cover.CoverInfo;
import com.google.android.gms.plus.model.people.Person.Cover.CoverPhoto;
import com.google.android.gms.plus.model.people.Person.Image;
import com.google.android.gms.plus.model.people.Person.Name;
import com.google.android.gms.plus.model.people.Person.Organizations;
import com.google.android.gms.plus.model.people.Person.PlacesLived;
import com.google.android.gms.plus.model.people.Person.Urls;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ig */
public final class C0905ig extends C0613es implements SafeParcelable, Person {
    public static final C0916ih CREATOR = new C0916ih();

    /* renamed from: Ep */
    private static final HashMap<String, C0614a<?, ?>> f2268Ep = new HashMap<>();

    /* renamed from: Eq */
    private final Set<Integer> f2269Eq;

    /* renamed from: FA */
    private String f2270FA;

    /* renamed from: FB */
    private int f2271FB;

    /* renamed from: FC */
    private List<C0913f> f2272FC;

    /* renamed from: FD */
    private List<C0914g> f2273FD;

    /* renamed from: FE */
    private int f2274FE;

    /* renamed from: FF */
    private int f2275FF;

    /* renamed from: FG */
    private String f2276FG;

    /* renamed from: FH */
    private List<C0915h> f2277FH;

    /* renamed from: FI */
    private boolean f2278FI;

    /* renamed from: Fp */
    private String f2279Fp;

    /* renamed from: Fq */
    private C0906a f2280Fq;

    /* renamed from: Fr */
    private String f2281Fr;

    /* renamed from: Fs */
    private String f2282Fs;

    /* renamed from: Ft */
    private int f2283Ft;

    /* renamed from: Fu */
    private C0907b f2284Fu;

    /* renamed from: Fv */
    private String f2285Fv;

    /* renamed from: Fw */
    private C0910c f2286Fw;

    /* renamed from: Fx */
    private boolean f2287Fx;

    /* renamed from: Fy */
    private String f2288Fy;

    /* renamed from: Fz */
    private C0911d f2289Fz;

    /* renamed from: eL */
    private int f2290eL;

    /* renamed from: iH */
    private String f2291iH;

    /* renamed from: kg */
    private final int f2292kg;

    /* renamed from: qa */
    private String f2293qa;

    /* renamed from: uS */
    private String f2294uS;

    /* renamed from: com.google.android.gms.internal.ig$a */
    public static final class C0906a extends C0613es implements SafeParcelable, AgeRange {
        public static final C0917ii CREATOR = new C0917ii();

        /* renamed from: Ep */
        private static final HashMap<String, C0614a<?, ?>> f2295Ep = new HashMap<>();

        /* renamed from: Eq */
        private final Set<Integer> f2296Eq;

        /* renamed from: FJ */
        private int f2297FJ;

        /* renamed from: FK */
        private int f2298FK;

        /* renamed from: kg */
        private final int f2299kg;

        static {
            f2295Ep.put("max", C0614a.m1612d("max", 2));
            f2295Ep.put("min", C0614a.m1612d("min", 3));
        }

        public C0906a() {
            this.f2299kg = 1;
            this.f2296Eq = new HashSet();
        }

        C0906a(Set<Integer> set, int i, int i2, int i3) {
            this.f2296Eq = set;
            this.f2299kg = i;
            this.f2297FJ = i2;
            this.f2298FK = i3;
        }

        /* access modifiers changed from: protected */
        /* renamed from: V */
        public Object mo4033V(String str) {
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: W */
        public boolean mo4034W(String str) {
            return false;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo4038a(C0614a aVar) {
            return this.f2296Eq.contains(Integer.valueOf(aVar.mo4051cq()));
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public Object mo4039b(C0614a aVar) {
            switch (aVar.mo4051cq()) {
                case 2:
                    return Integer.valueOf(this.f2297FJ);
                case 3:
                    return Integer.valueOf(this.f2298FK);
                default:
                    throw new IllegalStateException("Unknown safe parcelable id=" + aVar.mo4051cq());
            }
        }

        /* renamed from: cj */
        public HashMap<String, C0614a<?, ?>> mo4040cj() {
            return f2295Ep;
        }

        public int describeContents() {
            C0917ii iiVar = CREATOR;
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C0906a)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            C0906a aVar = (C0906a) obj;
            for (C0614a aVar2 : f2295Ep.values()) {
                if (mo4038a(aVar2)) {
                    if (!aVar.mo4038a(aVar2)) {
                        return false;
                    }
                    if (!mo4039b(aVar2).equals(aVar.mo4039b(aVar2))) {
                        return false;
                    }
                } else if (aVar.mo4038a(aVar2)) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: fD */
        public C0906a freeze() {
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: fa */
        public Set<Integer> mo5021fa() {
            return this.f2296Eq;
        }

        public int getMax() {
            return this.f2297FJ;
        }

        public int getMin() {
            return this.f2298FK;
        }

        /* access modifiers changed from: 0000 */
        public int getVersionCode() {
            return this.f2299kg;
        }

        public boolean hasMax() {
            return this.f2296Eq.contains(Integer.valueOf(2));
        }

        public boolean hasMin() {
            return this.f2296Eq.contains(Integer.valueOf(3));
        }

        public int hashCode() {
            int i = 0;
            Iterator it = f2295Ep.values().iterator();
            while (true) {
                int i2 = i;
                if (!it.hasNext()) {
                    return i2;
                }
                C0614a aVar = (C0614a) it.next();
                if (mo4038a(aVar)) {
                    i = mo4039b(aVar).hashCode() + i2 + aVar.mo4051cq();
                } else {
                    i = i2;
                }
            }
        }

        public boolean isDataValid() {
            return true;
        }

        public void writeToParcel(Parcel out, int flags) {
            C0917ii iiVar = CREATOR;
            C0917ii.m2810a(this, out, flags);
        }
    }

    /* renamed from: com.google.android.gms.internal.ig$b */
    public static final class C0907b extends C0613es implements SafeParcelable, Cover {
        public static final C0918ij CREATOR = new C0918ij();

        /* renamed from: Ep */
        private static final HashMap<String, C0614a<?, ?>> f2300Ep = new HashMap<>();

        /* renamed from: Eq */
        private final Set<Integer> f2301Eq;

        /* renamed from: FL */
        private C0908a f2302FL;

        /* renamed from: FM */
        private C0909b f2303FM;

        /* renamed from: FN */
        private int f2304FN;

        /* renamed from: kg */
        private final int f2305kg;

        /* renamed from: com.google.android.gms.internal.ig$b$a */
        public static final class C0908a extends C0613es implements SafeParcelable, CoverInfo {
            public static final C0919ik CREATOR = new C0919ik();

            /* renamed from: Ep */
            private static final HashMap<String, C0614a<?, ?>> f2306Ep = new HashMap<>();

            /* renamed from: Eq */
            private final Set<Integer> f2307Eq;

            /* renamed from: FO */
            private int f2308FO;

            /* renamed from: FP */
            private int f2309FP;

            /* renamed from: kg */
            private final int f2310kg;

            static {
                f2306Ep.put("leftImageOffset", C0614a.m1612d("leftImageOffset", 2));
                f2306Ep.put("topImageOffset", C0614a.m1612d("topImageOffset", 3));
            }

            public C0908a() {
                this.f2310kg = 1;
                this.f2307Eq = new HashSet();
            }

            C0908a(Set<Integer> set, int i, int i2, int i3) {
                this.f2307Eq = set;
                this.f2310kg = i;
                this.f2308FO = i2;
                this.f2309FP = i3;
            }

            /* access modifiers changed from: protected */
            /* renamed from: V */
            public Object mo4033V(String str) {
                return null;
            }

            /* access modifiers changed from: protected */
            /* renamed from: W */
            public boolean mo4034W(String str) {
                return false;
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public boolean mo4038a(C0614a aVar) {
                return this.f2307Eq.contains(Integer.valueOf(aVar.mo4051cq()));
            }

            /* access modifiers changed from: protected */
            /* renamed from: b */
            public Object mo4039b(C0614a aVar) {
                switch (aVar.mo4051cq()) {
                    case 2:
                        return Integer.valueOf(this.f2308FO);
                    case 3:
                        return Integer.valueOf(this.f2309FP);
                    default:
                        throw new IllegalStateException("Unknown safe parcelable id=" + aVar.mo4051cq());
                }
            }

            /* renamed from: cj */
            public HashMap<String, C0614a<?, ?>> mo4040cj() {
                return f2306Ep;
            }

            public int describeContents() {
                C0919ik ikVar = CREATOR;
                return 0;
            }

            public boolean equals(Object obj) {
                if (!(obj instanceof C0908a)) {
                    return false;
                }
                if (this == obj) {
                    return true;
                }
                C0908a aVar = (C0908a) obj;
                for (C0614a aVar2 : f2306Ep.values()) {
                    if (mo4038a(aVar2)) {
                        if (!aVar.mo4038a(aVar2)) {
                            return false;
                        }
                        if (!mo4039b(aVar2).equals(aVar.mo4039b(aVar2))) {
                            return false;
                        }
                    } else if (aVar.mo4038a(aVar2)) {
                        return false;
                    }
                }
                return true;
            }

            /* renamed from: fH */
            public C0908a freeze() {
                return this;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: fa */
            public Set<Integer> mo5047fa() {
                return this.f2307Eq;
            }

            public int getLeftImageOffset() {
                return this.f2308FO;
            }

            public int getTopImageOffset() {
                return this.f2309FP;
            }

            /* access modifiers changed from: 0000 */
            public int getVersionCode() {
                return this.f2310kg;
            }

            public boolean hasLeftImageOffset() {
                return this.f2307Eq.contains(Integer.valueOf(2));
            }

            public boolean hasTopImageOffset() {
                return this.f2307Eq.contains(Integer.valueOf(3));
            }

            public int hashCode() {
                int i = 0;
                Iterator it = f2306Ep.values().iterator();
                while (true) {
                    int i2 = i;
                    if (!it.hasNext()) {
                        return i2;
                    }
                    C0614a aVar = (C0614a) it.next();
                    if (mo4038a(aVar)) {
                        i = mo4039b(aVar).hashCode() + i2 + aVar.mo4051cq();
                    } else {
                        i = i2;
                    }
                }
            }

            public boolean isDataValid() {
                return true;
            }

            public void writeToParcel(Parcel out, int flags) {
                C0919ik ikVar = CREATOR;
                C0919ik.m2816a(this, out, flags);
            }
        }

        /* renamed from: com.google.android.gms.internal.ig$b$b */
        public static final class C0909b extends C0613es implements SafeParcelable, CoverPhoto {
            public static final C0920il CREATOR = new C0920il();

            /* renamed from: Ep */
            private static final HashMap<String, C0614a<?, ?>> f2311Ep = new HashMap<>();

            /* renamed from: Eq */
            private final Set<Integer> f2312Eq;

            /* renamed from: iH */
            private String f2313iH;

            /* renamed from: kg */
            private final int f2314kg;

            /* renamed from: v */
            private int f2315v;

            /* renamed from: w */
            private int f2316w;

            static {
                f2311Ep.put("height", C0614a.m1612d("height", 2));
                f2311Ep.put(PlusShare.KEY_CALL_TO_ACTION_URL, C0614a.m1615g(PlusShare.KEY_CALL_TO_ACTION_URL, 3));
                f2311Ep.put("width", C0614a.m1612d("width", 4));
            }

            public C0909b() {
                this.f2314kg = 1;
                this.f2312Eq = new HashSet();
            }

            C0909b(Set<Integer> set, int i, int i2, String str, int i3) {
                this.f2312Eq = set;
                this.f2314kg = i;
                this.f2315v = i2;
                this.f2313iH = str;
                this.f2316w = i3;
            }

            /* access modifiers changed from: protected */
            /* renamed from: V */
            public Object mo4033V(String str) {
                return null;
            }

            /* access modifiers changed from: protected */
            /* renamed from: W */
            public boolean mo4034W(String str) {
                return false;
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public boolean mo4038a(C0614a aVar) {
                return this.f2312Eq.contains(Integer.valueOf(aVar.mo4051cq()));
            }

            /* access modifiers changed from: protected */
            /* renamed from: b */
            public Object mo4039b(C0614a aVar) {
                switch (aVar.mo4051cq()) {
                    case 2:
                        return Integer.valueOf(this.f2315v);
                    case 3:
                        return this.f2313iH;
                    case 4:
                        return Integer.valueOf(this.f2316w);
                    default:
                        throw new IllegalStateException("Unknown safe parcelable id=" + aVar.mo4051cq());
                }
            }

            /* renamed from: cj */
            public HashMap<String, C0614a<?, ?>> mo4040cj() {
                return f2311Ep;
            }

            public int describeContents() {
                C0920il ilVar = CREATOR;
                return 0;
            }

            public boolean equals(Object obj) {
                if (!(obj instanceof C0909b)) {
                    return false;
                }
                if (this == obj) {
                    return true;
                }
                C0909b bVar = (C0909b) obj;
                for (C0614a aVar : f2311Ep.values()) {
                    if (mo4038a(aVar)) {
                        if (!bVar.mo4038a(aVar)) {
                            return false;
                        }
                        if (!mo4039b(aVar).equals(bVar.mo4039b(aVar))) {
                            return false;
                        }
                    } else if (bVar.mo4038a(aVar)) {
                        return false;
                    }
                }
                return true;
            }

            /* renamed from: fI */
            public C0909b freeze() {
                return this;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: fa */
            public Set<Integer> mo5058fa() {
                return this.f2312Eq;
            }

            public int getHeight() {
                return this.f2315v;
            }

            public String getUrl() {
                return this.f2313iH;
            }

            /* access modifiers changed from: 0000 */
            public int getVersionCode() {
                return this.f2314kg;
            }

            public int getWidth() {
                return this.f2316w;
            }

            public boolean hasHeight() {
                return this.f2312Eq.contains(Integer.valueOf(2));
            }

            public boolean hasUrl() {
                return this.f2312Eq.contains(Integer.valueOf(3));
            }

            public boolean hasWidth() {
                return this.f2312Eq.contains(Integer.valueOf(4));
            }

            public int hashCode() {
                int i = 0;
                Iterator it = f2311Ep.values().iterator();
                while (true) {
                    int i2 = i;
                    if (!it.hasNext()) {
                        return i2;
                    }
                    C0614a aVar = (C0614a) it.next();
                    if (mo4038a(aVar)) {
                        i = mo4039b(aVar).hashCode() + i2 + aVar.mo4051cq();
                    } else {
                        i = i2;
                    }
                }
            }

            public boolean isDataValid() {
                return true;
            }

            public void writeToParcel(Parcel out, int flags) {
                C0920il ilVar = CREATOR;
                C0920il.m2819a(this, out, flags);
            }
        }

        static {
            f2300Ep.put("coverInfo", C0614a.m1609a("coverInfo", 2, C0908a.class));
            f2300Ep.put("coverPhoto", C0614a.m1609a("coverPhoto", 3, C0909b.class));
            f2300Ep.put("layout", C0614a.m1608a("layout", 4, new C0609ep().mo4015c("banner", 0), false));
        }

        public C0907b() {
            this.f2305kg = 1;
            this.f2301Eq = new HashSet();
        }

        C0907b(Set<Integer> set, int i, C0908a aVar, C0909b bVar, int i2) {
            this.f2301Eq = set;
            this.f2305kg = i;
            this.f2302FL = aVar;
            this.f2303FM = bVar;
            this.f2304FN = i2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: V */
        public Object mo4033V(String str) {
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: W */
        public boolean mo4034W(String str) {
            return false;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo4038a(C0614a aVar) {
            return this.f2301Eq.contains(Integer.valueOf(aVar.mo4051cq()));
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public Object mo4039b(C0614a aVar) {
            switch (aVar.mo4051cq()) {
                case 2:
                    return this.f2302FL;
                case 3:
                    return this.f2303FM;
                case 4:
                    return Integer.valueOf(this.f2304FN);
                default:
                    throw new IllegalStateException("Unknown safe parcelable id=" + aVar.mo4051cq());
            }
        }

        /* renamed from: cj */
        public HashMap<String, C0614a<?, ?>> mo4040cj() {
            return f2300Ep;
        }

        public int describeContents() {
            C0918ij ijVar = CREATOR;
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C0907b)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            C0907b bVar = (C0907b) obj;
            for (C0614a aVar : f2300Ep.values()) {
                if (mo4038a(aVar)) {
                    if (!bVar.mo4038a(aVar)) {
                        return false;
                    }
                    if (!mo4039b(aVar).equals(bVar.mo4039b(aVar))) {
                        return false;
                    }
                } else if (bVar.mo4038a(aVar)) {
                    return false;
                }
            }
            return true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: fE */
        public C0908a mo5031fE() {
            return this.f2302FL;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: fF */
        public C0909b mo5032fF() {
            return this.f2303FM;
        }

        /* renamed from: fG */
        public C0907b freeze() {
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: fa */
        public Set<Integer> mo5034fa() {
            return this.f2301Eq;
        }

        public CoverInfo getCoverInfo() {
            return this.f2302FL;
        }

        public CoverPhoto getCoverPhoto() {
            return this.f2303FM;
        }

        public int getLayout() {
            return this.f2304FN;
        }

        /* access modifiers changed from: 0000 */
        public int getVersionCode() {
            return this.f2305kg;
        }

        public boolean hasCoverInfo() {
            return this.f2301Eq.contains(Integer.valueOf(2));
        }

        public boolean hasCoverPhoto() {
            return this.f2301Eq.contains(Integer.valueOf(3));
        }

        public boolean hasLayout() {
            return this.f2301Eq.contains(Integer.valueOf(4));
        }

        public int hashCode() {
            int i = 0;
            Iterator it = f2300Ep.values().iterator();
            while (true) {
                int i2 = i;
                if (!it.hasNext()) {
                    return i2;
                }
                C0614a aVar = (C0614a) it.next();
                if (mo4038a(aVar)) {
                    i = mo4039b(aVar).hashCode() + i2 + aVar.mo4051cq();
                } else {
                    i = i2;
                }
            }
        }

        public boolean isDataValid() {
            return true;
        }

        public void writeToParcel(Parcel out, int flags) {
            C0918ij ijVar = CREATOR;
            C0918ij.m2813a(this, out, flags);
        }
    }

    /* renamed from: com.google.android.gms.internal.ig$c */
    public static final class C0910c extends C0613es implements SafeParcelable, Image {
        public static final C0921im CREATOR = new C0921im();

        /* renamed from: Ep */
        private static final HashMap<String, C0614a<?, ?>> f2317Ep = new HashMap<>();

        /* renamed from: Eq */
        private final Set<Integer> f2318Eq;

        /* renamed from: iH */
        private String f2319iH;

        /* renamed from: kg */
        private final int f2320kg;

        static {
            f2317Ep.put(PlusShare.KEY_CALL_TO_ACTION_URL, C0614a.m1615g(PlusShare.KEY_CALL_TO_ACTION_URL, 2));
        }

        public C0910c() {
            this.f2320kg = 1;
            this.f2318Eq = new HashSet();
        }

        public C0910c(String str) {
            this.f2318Eq = new HashSet();
            this.f2320kg = 1;
            this.f2319iH = str;
            this.f2318Eq.add(Integer.valueOf(2));
        }

        C0910c(Set<Integer> set, int i, String str) {
            this.f2318Eq = set;
            this.f2320kg = i;
            this.f2319iH = str;
        }

        /* access modifiers changed from: protected */
        /* renamed from: V */
        public Object mo4033V(String str) {
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: W */
        public boolean mo4034W(String str) {
            return false;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo4038a(C0614a aVar) {
            return this.f2318Eq.contains(Integer.valueOf(aVar.mo4051cq()));
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public Object mo4039b(C0614a aVar) {
            switch (aVar.mo4051cq()) {
                case 2:
                    return this.f2319iH;
                default:
                    throw new IllegalStateException("Unknown safe parcelable id=" + aVar.mo4051cq());
            }
        }

        /* renamed from: cj */
        public HashMap<String, C0614a<?, ?>> mo4040cj() {
            return f2317Ep;
        }

        public int describeContents() {
            C0921im imVar = CREATOR;
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C0910c)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            C0910c cVar = (C0910c) obj;
            for (C0614a aVar : f2317Ep.values()) {
                if (mo4038a(aVar)) {
                    if (!cVar.mo4038a(aVar)) {
                        return false;
                    }
                    if (!mo4039b(aVar).equals(cVar.mo4039b(aVar))) {
                        return false;
                    }
                } else if (cVar.mo4038a(aVar)) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: fJ */
        public C0910c freeze() {
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: fa */
        public Set<Integer> mo5071fa() {
            return this.f2318Eq;
        }

        public String getUrl() {
            return this.f2319iH;
        }

        /* access modifiers changed from: 0000 */
        public int getVersionCode() {
            return this.f2320kg;
        }

        public boolean hasUrl() {
            return this.f2318Eq.contains(Integer.valueOf(2));
        }

        public int hashCode() {
            int i = 0;
            Iterator it = f2317Ep.values().iterator();
            while (true) {
                int i2 = i;
                if (!it.hasNext()) {
                    return i2;
                }
                C0614a aVar = (C0614a) it.next();
                if (mo4038a(aVar)) {
                    i = mo4039b(aVar).hashCode() + i2 + aVar.mo4051cq();
                } else {
                    i = i2;
                }
            }
        }

        public boolean isDataValid() {
            return true;
        }

        public void writeToParcel(Parcel out, int flags) {
            C0921im imVar = CREATOR;
            C0921im.m2822a(this, out, flags);
        }
    }

    /* renamed from: com.google.android.gms.internal.ig$d */
    public static final class C0911d extends C0613es implements SafeParcelable, Name {
        public static final C0922in CREATOR = new C0922in();

        /* renamed from: Ep */
        private static final HashMap<String, C0614a<?, ?>> f2321Ep = new HashMap<>();

        /* renamed from: EP */
        private String f2322EP;

        /* renamed from: ES */
        private String f2323ES;

        /* renamed from: Eq */
        private final Set<Integer> f2324Eq;

        /* renamed from: FQ */
        private String f2325FQ;

        /* renamed from: FR */
        private String f2326FR;

        /* renamed from: FS */
        private String f2327FS;

        /* renamed from: FT */
        private String f2328FT;

        /* renamed from: kg */
        private final int f2329kg;

        static {
            f2321Ep.put("familyName", C0614a.m1615g("familyName", 2));
            f2321Ep.put("formatted", C0614a.m1615g("formatted", 3));
            f2321Ep.put("givenName", C0614a.m1615g("givenName", 4));
            f2321Ep.put("honorificPrefix", C0614a.m1615g("honorificPrefix", 5));
            f2321Ep.put("honorificSuffix", C0614a.m1615g("honorificSuffix", 6));
            f2321Ep.put("middleName", C0614a.m1615g("middleName", 7));
        }

        public C0911d() {
            this.f2329kg = 1;
            this.f2324Eq = new HashSet();
        }

        C0911d(Set<Integer> set, int i, String str, String str2, String str3, String str4, String str5, String str6) {
            this.f2324Eq = set;
            this.f2329kg = i;
            this.f2322EP = str;
            this.f2325FQ = str2;
            this.f2323ES = str3;
            this.f2326FR = str4;
            this.f2327FS = str5;
            this.f2328FT = str6;
        }

        /* access modifiers changed from: protected */
        /* renamed from: V */
        public Object mo4033V(String str) {
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: W */
        public boolean mo4034W(String str) {
            return false;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo4038a(C0614a aVar) {
            return this.f2324Eq.contains(Integer.valueOf(aVar.mo4051cq()));
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public Object mo4039b(C0614a aVar) {
            switch (aVar.mo4051cq()) {
                case 2:
                    return this.f2322EP;
                case 3:
                    return this.f2325FQ;
                case 4:
                    return this.f2323ES;
                case 5:
                    return this.f2326FR;
                case 6:
                    return this.f2327FS;
                case 7:
                    return this.f2328FT;
                default:
                    throw new IllegalStateException("Unknown safe parcelable id=" + aVar.mo4051cq());
            }
        }

        /* renamed from: cj */
        public HashMap<String, C0614a<?, ?>> mo4040cj() {
            return f2321Ep;
        }

        public int describeContents() {
            C0922in inVar = CREATOR;
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C0911d)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            C0911d dVar = (C0911d) obj;
            for (C0614a aVar : f2321Ep.values()) {
                if (mo4038a(aVar)) {
                    if (!dVar.mo4038a(aVar)) {
                        return false;
                    }
                    if (!mo4039b(aVar).equals(dVar.mo4039b(aVar))) {
                        return false;
                    }
                } else if (dVar.mo4038a(aVar)) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: fK */
        public C0911d freeze() {
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: fa */
        public Set<Integer> mo5080fa() {
            return this.f2324Eq;
        }

        public String getFamilyName() {
            return this.f2322EP;
        }

        public String getFormatted() {
            return this.f2325FQ;
        }

        public String getGivenName() {
            return this.f2323ES;
        }

        public String getHonorificPrefix() {
            return this.f2326FR;
        }

        public String getHonorificSuffix() {
            return this.f2327FS;
        }

        public String getMiddleName() {
            return this.f2328FT;
        }

        /* access modifiers changed from: 0000 */
        public int getVersionCode() {
            return this.f2329kg;
        }

        public boolean hasFamilyName() {
            return this.f2324Eq.contains(Integer.valueOf(2));
        }

        public boolean hasFormatted() {
            return this.f2324Eq.contains(Integer.valueOf(3));
        }

        public boolean hasGivenName() {
            return this.f2324Eq.contains(Integer.valueOf(4));
        }

        public boolean hasHonorificPrefix() {
            return this.f2324Eq.contains(Integer.valueOf(5));
        }

        public boolean hasHonorificSuffix() {
            return this.f2324Eq.contains(Integer.valueOf(6));
        }

        public boolean hasMiddleName() {
            return this.f2324Eq.contains(Integer.valueOf(7));
        }

        public int hashCode() {
            int i = 0;
            Iterator it = f2321Ep.values().iterator();
            while (true) {
                int i2 = i;
                if (!it.hasNext()) {
                    return i2;
                }
                C0614a aVar = (C0614a) it.next();
                if (mo4038a(aVar)) {
                    i = mo4039b(aVar).hashCode() + i2 + aVar.mo4051cq();
                } else {
                    i = i2;
                }
            }
        }

        public boolean isDataValid() {
            return true;
        }

        public void writeToParcel(Parcel out, int flags) {
            C0922in inVar = CREATOR;
            C0922in.m2825a(this, out, flags);
        }
    }

    /* renamed from: com.google.android.gms.internal.ig$e */
    public static class C0912e {
        /* renamed from: aB */
        public static int m2784aB(String str) {
            if (str.equals("person")) {
                return 0;
            }
            if (str.equals("page")) {
                return 1;
            }
            throw new IllegalArgumentException("Unknown objectType string: " + str);
        }
    }

    /* renamed from: com.google.android.gms.internal.ig$f */
    public static final class C0913f extends C0613es implements SafeParcelable, Organizations {
        public static final C0923io CREATOR = new C0923io();

        /* renamed from: Ep */
        private static final HashMap<String, C0614a<?, ?>> f2330Ep = new HashMap<>();

        /* renamed from: EO */
        private String f2331EO;

        /* renamed from: Eq */
        private final Set<Integer> f2332Eq;

        /* renamed from: FU */
        private String f2333FU;

        /* renamed from: FV */
        private String f2334FV;

        /* renamed from: FW */
        private boolean f2335FW;

        /* renamed from: Fe */
        private String f2336Fe;

        /* renamed from: kg */
        private final int f2337kg;
        private String mName;

        /* renamed from: os */
        private int f2338os;

        /* renamed from: qL */
        private String f2339qL;

        /* renamed from: sJ */
        private String f2340sJ;

        static {
            f2330Ep.put("department", C0614a.m1615g("department", 2));
            f2330Ep.put(PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_DESCRIPTION, C0614a.m1615g(PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_DESCRIPTION, 3));
            f2330Ep.put("endDate", C0614a.m1615g("endDate", 4));
            f2330Ep.put("location", C0614a.m1615g("location", 5));
            f2330Ep.put("name", C0614a.m1615g("name", 6));
            f2330Ep.put("primary", C0614a.m1614f("primary", 7));
            f2330Ep.put("startDate", C0614a.m1615g("startDate", 8));
            f2330Ep.put(PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE, C0614a.m1615g(PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE, 9));
            f2330Ep.put("type", C0614a.m1608a("type", 10, new C0609ep().mo4015c("work", 0).mo4015c("school", 1), false));
        }

        public C0913f() {
            this.f2337kg = 1;
            this.f2332Eq = new HashSet();
        }

        C0913f(Set<Integer> set, int i, String str, String str2, String str3, String str4, String str5, boolean z, String str6, String str7, int i2) {
            this.f2332Eq = set;
            this.f2337kg = i;
            this.f2333FU = str;
            this.f2340sJ = str2;
            this.f2331EO = str3;
            this.f2334FV = str4;
            this.mName = str5;
            this.f2335FW = z;
            this.f2336Fe = str6;
            this.f2339qL = str7;
            this.f2338os = i2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: V */
        public Object mo4033V(String str) {
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: W */
        public boolean mo4034W(String str) {
            return false;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo4038a(C0614a aVar) {
            return this.f2332Eq.contains(Integer.valueOf(aVar.mo4051cq()));
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public Object mo4039b(C0614a aVar) {
            switch (aVar.mo4051cq()) {
                case 2:
                    return this.f2333FU;
                case 3:
                    return this.f2340sJ;
                case 4:
                    return this.f2331EO;
                case 5:
                    return this.f2334FV;
                case 6:
                    return this.mName;
                case 7:
                    return Boolean.valueOf(this.f2335FW);
                case 8:
                    return this.f2336Fe;
                case 9:
                    return this.f2339qL;
                case 10:
                    return Integer.valueOf(this.f2338os);
                default:
                    throw new IllegalStateException("Unknown safe parcelable id=" + aVar.mo4051cq());
            }
        }

        /* renamed from: cj */
        public HashMap<String, C0614a<?, ?>> mo4040cj() {
            return f2330Ep;
        }

        public int describeContents() {
            C0923io ioVar = CREATOR;
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C0913f)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            C0913f fVar = (C0913f) obj;
            for (C0614a aVar : f2330Ep.values()) {
                if (mo4038a(aVar)) {
                    if (!fVar.mo4038a(aVar)) {
                        return false;
                    }
                    if (!mo4039b(aVar).equals(fVar.mo4039b(aVar))) {
                        return false;
                    }
                } else if (fVar.mo4038a(aVar)) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: fL */
        public C0913f freeze() {
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: fa */
        public Set<Integer> mo5099fa() {
            return this.f2332Eq;
        }

        public String getDepartment() {
            return this.f2333FU;
        }

        public String getDescription() {
            return this.f2340sJ;
        }

        public String getEndDate() {
            return this.f2331EO;
        }

        public String getLocation() {
            return this.f2334FV;
        }

        public String getName() {
            return this.mName;
        }

        public String getStartDate() {
            return this.f2336Fe;
        }

        public String getTitle() {
            return this.f2339qL;
        }

        public int getType() {
            return this.f2338os;
        }

        /* access modifiers changed from: 0000 */
        public int getVersionCode() {
            return this.f2337kg;
        }

        public boolean hasDepartment() {
            return this.f2332Eq.contains(Integer.valueOf(2));
        }

        public boolean hasDescription() {
            return this.f2332Eq.contains(Integer.valueOf(3));
        }

        public boolean hasEndDate() {
            return this.f2332Eq.contains(Integer.valueOf(4));
        }

        public boolean hasLocation() {
            return this.f2332Eq.contains(Integer.valueOf(5));
        }

        public boolean hasName() {
            return this.f2332Eq.contains(Integer.valueOf(6));
        }

        public boolean hasPrimary() {
            return this.f2332Eq.contains(Integer.valueOf(7));
        }

        public boolean hasStartDate() {
            return this.f2332Eq.contains(Integer.valueOf(8));
        }

        public boolean hasTitle() {
            return this.f2332Eq.contains(Integer.valueOf(9));
        }

        public boolean hasType() {
            return this.f2332Eq.contains(Integer.valueOf(10));
        }

        public int hashCode() {
            int i = 0;
            Iterator it = f2330Ep.values().iterator();
            while (true) {
                int i2 = i;
                if (!it.hasNext()) {
                    return i2;
                }
                C0614a aVar = (C0614a) it.next();
                if (mo4038a(aVar)) {
                    i = mo4039b(aVar).hashCode() + i2 + aVar.mo4051cq();
                } else {
                    i = i2;
                }
            }
        }

        public boolean isDataValid() {
            return true;
        }

        public boolean isPrimary() {
            return this.f2335FW;
        }

        public void writeToParcel(Parcel out, int flags) {
            C0923io ioVar = CREATOR;
            C0923io.m2828a(this, out, flags);
        }
    }

    /* renamed from: com.google.android.gms.internal.ig$g */
    public static final class C0914g extends C0613es implements SafeParcelable, PlacesLived {
        public static final C0924ip CREATOR = new C0924ip();

        /* renamed from: Ep */
        private static final HashMap<String, C0614a<?, ?>> f2341Ep = new HashMap<>();

        /* renamed from: Eq */
        private final Set<Integer> f2342Eq;

        /* renamed from: FW */
        private boolean f2343FW;

        /* renamed from: kg */
        private final int f2344kg;
        private String mValue;

        static {
            f2341Ep.put("primary", C0614a.m1614f("primary", 2));
            f2341Ep.put("value", C0614a.m1615g("value", 3));
        }

        public C0914g() {
            this.f2344kg = 1;
            this.f2342Eq = new HashSet();
        }

        C0914g(Set<Integer> set, int i, boolean z, String str) {
            this.f2342Eq = set;
            this.f2344kg = i;
            this.f2343FW = z;
            this.mValue = str;
        }

        /* access modifiers changed from: protected */
        /* renamed from: V */
        public Object mo4033V(String str) {
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: W */
        public boolean mo4034W(String str) {
            return false;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo4038a(C0614a aVar) {
            return this.f2342Eq.contains(Integer.valueOf(aVar.mo4051cq()));
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public Object mo4039b(C0614a aVar) {
            switch (aVar.mo4051cq()) {
                case 2:
                    return Boolean.valueOf(this.f2343FW);
                case 3:
                    return this.mValue;
                default:
                    throw new IllegalStateException("Unknown safe parcelable id=" + aVar.mo4051cq());
            }
        }

        /* renamed from: cj */
        public HashMap<String, C0614a<?, ?>> mo4040cj() {
            return f2341Ep;
        }

        public int describeContents() {
            C0924ip ipVar = CREATOR;
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C0914g)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            C0914g gVar = (C0914g) obj;
            for (C0614a aVar : f2341Ep.values()) {
                if (mo4038a(aVar)) {
                    if (!gVar.mo4038a(aVar)) {
                        return false;
                    }
                    if (!mo4039b(aVar).equals(gVar.mo4039b(aVar))) {
                        return false;
                    }
                } else if (gVar.mo4038a(aVar)) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: fM */
        public C0914g freeze() {
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: fa */
        public Set<Integer> mo5124fa() {
            return this.f2342Eq;
        }

        public String getValue() {
            return this.mValue;
        }

        /* access modifiers changed from: 0000 */
        public int getVersionCode() {
            return this.f2344kg;
        }

        public boolean hasPrimary() {
            return this.f2342Eq.contains(Integer.valueOf(2));
        }

        public boolean hasValue() {
            return this.f2342Eq.contains(Integer.valueOf(3));
        }

        public int hashCode() {
            int i = 0;
            Iterator it = f2341Ep.values().iterator();
            while (true) {
                int i2 = i;
                if (!it.hasNext()) {
                    return i2;
                }
                C0614a aVar = (C0614a) it.next();
                if (mo4038a(aVar)) {
                    i = mo4039b(aVar).hashCode() + i2 + aVar.mo4051cq();
                } else {
                    i = i2;
                }
            }
        }

        public boolean isDataValid() {
            return true;
        }

        public boolean isPrimary() {
            return this.f2343FW;
        }

        public void writeToParcel(Parcel out, int flags) {
            C0924ip ipVar = CREATOR;
            C0924ip.m2831a(this, out, flags);
        }
    }

    /* renamed from: com.google.android.gms.internal.ig$h */
    public static final class C0915h extends C0613es implements SafeParcelable, Urls {
        public static final C0925iq CREATOR = new C0925iq();

        /* renamed from: Ep */
        private static final HashMap<String, C0614a<?, ?>> f2345Ep = new HashMap<>();

        /* renamed from: Eq */
        private final Set<Integer> f2346Eq;

        /* renamed from: FX */
        private String f2347FX;

        /* renamed from: FY */
        private final int f2348FY;

        /* renamed from: kg */
        private final int f2349kg;
        private String mValue;

        /* renamed from: os */
        private int f2350os;

        static {
            f2345Ep.put(PlusShare.KEY_CALL_TO_ACTION_LABEL, C0614a.m1615g(PlusShare.KEY_CALL_TO_ACTION_LABEL, 5));
            f2345Ep.put("type", C0614a.m1608a("type", 6, new C0609ep().mo4015c("home", 0).mo4015c("work", 1).mo4015c("blog", 2).mo4015c(Scopes.PROFILE, 3).mo4015c("other", 4).mo4015c("otherProfile", 5).mo4015c("contributor", 6).mo4015c("website", 7), false));
            f2345Ep.put("value", C0614a.m1615g("value", 4));
        }

        public C0915h() {
            this.f2348FY = 4;
            this.f2349kg = 2;
            this.f2346Eq = new HashSet();
        }

        C0915h(Set<Integer> set, int i, String str, int i2, String str2, int i3) {
            this.f2348FY = 4;
            this.f2346Eq = set;
            this.f2349kg = i;
            this.f2347FX = str;
            this.f2350os = i2;
            this.mValue = str2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: V */
        public Object mo4033V(String str) {
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: W */
        public boolean mo4034W(String str) {
            return false;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo4038a(C0614a aVar) {
            return this.f2346Eq.contains(Integer.valueOf(aVar.mo4051cq()));
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public Object mo4039b(C0614a aVar) {
            switch (aVar.mo4051cq()) {
                case 4:
                    return this.mValue;
                case 5:
                    return this.f2347FX;
                case 6:
                    return Integer.valueOf(this.f2350os);
                default:
                    throw new IllegalStateException("Unknown safe parcelable id=" + aVar.mo4051cq());
            }
        }

        /* renamed from: cj */
        public HashMap<String, C0614a<?, ?>> mo4040cj() {
            return f2345Ep;
        }

        public int describeContents() {
            C0925iq iqVar = CREATOR;
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C0915h)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            C0915h hVar = (C0915h) obj;
            for (C0614a aVar : f2345Ep.values()) {
                if (mo4038a(aVar)) {
                    if (!hVar.mo4038a(aVar)) {
                        return false;
                    }
                    if (!mo4039b(aVar).equals(hVar.mo4039b(aVar))) {
                        return false;
                    }
                } else if (hVar.mo4038a(aVar)) {
                    return false;
                }
            }
            return true;
        }

        @Deprecated
        /* renamed from: fN */
        public int mo5134fN() {
            return 4;
        }

        /* renamed from: fO */
        public C0915h freeze() {
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: fa */
        public Set<Integer> mo5136fa() {
            return this.f2346Eq;
        }

        public String getLabel() {
            return this.f2347FX;
        }

        public int getType() {
            return this.f2350os;
        }

        public String getValue() {
            return this.mValue;
        }

        /* access modifiers changed from: 0000 */
        public int getVersionCode() {
            return this.f2349kg;
        }

        public boolean hasLabel() {
            return this.f2346Eq.contains(Integer.valueOf(5));
        }

        public boolean hasType() {
            return this.f2346Eq.contains(Integer.valueOf(6));
        }

        public boolean hasValue() {
            return this.f2346Eq.contains(Integer.valueOf(4));
        }

        public int hashCode() {
            int i = 0;
            Iterator it = f2345Ep.values().iterator();
            while (true) {
                int i2 = i;
                if (!it.hasNext()) {
                    return i2;
                }
                C0614a aVar = (C0614a) it.next();
                if (mo4038a(aVar)) {
                    i = mo4039b(aVar).hashCode() + i2 + aVar.mo4051cq();
                } else {
                    i = i2;
                }
            }
        }

        public boolean isDataValid() {
            return true;
        }

        public void writeToParcel(Parcel out, int flags) {
            C0925iq iqVar = CREATOR;
            C0925iq.m2834a(this, out, flags);
        }
    }

    static {
        f2268Ep.put("aboutMe", C0614a.m1615g("aboutMe", 2));
        f2268Ep.put("ageRange", C0614a.m1609a("ageRange", 3, C0906a.class));
        f2268Ep.put("birthday", C0614a.m1615g("birthday", 4));
        f2268Ep.put("braggingRights", C0614a.m1615g("braggingRights", 5));
        f2268Ep.put("circledByCount", C0614a.m1612d("circledByCount", 6));
        f2268Ep.put("cover", C0614a.m1609a("cover", 7, C0907b.class));
        f2268Ep.put("currentLocation", C0614a.m1615g("currentLocation", 8));
        f2268Ep.put("displayName", C0614a.m1615g("displayName", 9));
        f2268Ep.put("gender", C0614a.m1608a("gender", 12, new C0609ep().mo4015c("male", 0).mo4015c("female", 1).mo4015c("other", 2), false));
        f2268Ep.put("id", C0614a.m1615g("id", 14));
        f2268Ep.put("image", C0614a.m1609a("image", 15, C0910c.class));
        f2268Ep.put("isPlusUser", C0614a.m1614f("isPlusUser", 16));
        f2268Ep.put("language", C0614a.m1615g("language", 18));
        f2268Ep.put("name", C0614a.m1609a("name", 19, C0911d.class));
        f2268Ep.put("nickname", C0614a.m1615g("nickname", 20));
        f2268Ep.put("objectType", C0614a.m1608a("objectType", 21, new C0609ep().mo4015c("person", 0).mo4015c("page", 1), false));
        f2268Ep.put("organizations", C0614a.m1610b("organizations", 22, C0913f.class));
        f2268Ep.put("placesLived", C0614a.m1610b("placesLived", 23, C0914g.class));
        f2268Ep.put("plusOneCount", C0614a.m1612d("plusOneCount", 24));
        f2268Ep.put("relationshipStatus", C0614a.m1608a("relationshipStatus", 25, new C0609ep().mo4015c("single", 0).mo4015c("in_a_relationship", 1).mo4015c("engaged", 2).mo4015c("married", 3).mo4015c("its_complicated", 4).mo4015c("open_relationship", 5).mo4015c("widowed", 6).mo4015c("in_domestic_partnership", 7).mo4015c("in_civil_union", 8), false));
        f2268Ep.put("tagline", C0614a.m1615g("tagline", 26));
        f2268Ep.put(PlusShare.KEY_CALL_TO_ACTION_URL, C0614a.m1615g(PlusShare.KEY_CALL_TO_ACTION_URL, 27));
        f2268Ep.put("urls", C0614a.m1610b("urls", 28, C0915h.class));
        f2268Ep.put("verified", C0614a.m1614f("verified", 29));
    }

    public C0905ig() {
        this.f2292kg = 2;
        this.f2269Eq = new HashSet();
    }

    public C0905ig(String str, String str2, C0910c cVar, int i, String str3) {
        this.f2292kg = 2;
        this.f2269Eq = new HashSet();
        this.f2293qa = str;
        this.f2269Eq.add(Integer.valueOf(9));
        this.f2294uS = str2;
        this.f2269Eq.add(Integer.valueOf(14));
        this.f2286Fw = cVar;
        this.f2269Eq.add(Integer.valueOf(15));
        this.f2271FB = i;
        this.f2269Eq.add(Integer.valueOf(21));
        this.f2291iH = str3;
        this.f2269Eq.add(Integer.valueOf(27));
    }

    C0905ig(Set<Integer> set, int i, String str, C0906a aVar, String str2, String str3, int i2, C0907b bVar, String str4, String str5, int i3, String str6, C0910c cVar, boolean z, String str7, C0911d dVar, String str8, int i4, List<C0913f> list, List<C0914g> list2, int i5, int i6, String str9, String str10, List<C0915h> list3, boolean z2) {
        this.f2269Eq = set;
        this.f2292kg = i;
        this.f2279Fp = str;
        this.f2280Fq = aVar;
        this.f2281Fr = str2;
        this.f2282Fs = str3;
        this.f2283Ft = i2;
        this.f2284Fu = bVar;
        this.f2285Fv = str4;
        this.f2293qa = str5;
        this.f2290eL = i3;
        this.f2294uS = str6;
        this.f2286Fw = cVar;
        this.f2287Fx = z;
        this.f2288Fy = str7;
        this.f2289Fz = dVar;
        this.f2270FA = str8;
        this.f2271FB = i4;
        this.f2272FC = list;
        this.f2273FD = list2;
        this.f2274FE = i5;
        this.f2275FF = i6;
        this.f2276FG = str9;
        this.f2291iH = str10;
        this.f2277FH = list3;
        this.f2278FI = z2;
    }

    /* renamed from: g */
    public static C0905ig m2725g(byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        C0905ig au = CREATOR.createFromParcel(obtain);
        obtain.recycle();
        return au;
    }

    /* access modifiers changed from: protected */
    /* renamed from: V */
    public Object mo4033V(String str) {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: W */
    public boolean mo4034W(String str) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo4038a(C0614a aVar) {
        return this.f2269Eq.contains(Integer.valueOf(aVar.mo4051cq()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Object mo4039b(C0614a aVar) {
        switch (aVar.mo4051cq()) {
            case 2:
                return this.f2279Fp;
            case 3:
                return this.f2280Fq;
            case 4:
                return this.f2281Fr;
            case 5:
                return this.f2282Fs;
            case 6:
                return Integer.valueOf(this.f2283Ft);
            case 7:
                return this.f2284Fu;
            case 8:
                return this.f2285Fv;
            case 9:
                return this.f2293qa;
            case 12:
                return Integer.valueOf(this.f2290eL);
            case 14:
                return this.f2294uS;
            case 15:
                return this.f2286Fw;
            case 16:
                return Boolean.valueOf(this.f2287Fx);
            case 18:
                return this.f2288Fy;
            case TimeUtils.HUNDRED_DAY_FIELD_LEN /*19*/:
                return this.f2289Fz;
            case 20:
                return this.f2270FA;
            case 21:
                return Integer.valueOf(this.f2271FB);
            case 22:
                return this.f2272FC;
            case 23:
                return this.f2273FD;
            case 24:
                return Integer.valueOf(this.f2274FE);
            case 25:
                return Integer.valueOf(this.f2275FF);
            case 26:
                return this.f2276FG;
            case 27:
                return this.f2291iH;
            case 28:
                return this.f2277FH;
            case 29:
                return Boolean.valueOf(this.f2278FI);
            default:
                throw new IllegalStateException("Unknown safe parcelable id=" + aVar.mo4051cq());
        }
    }

    /* renamed from: cj */
    public HashMap<String, C0614a<?, ?>> mo4040cj() {
        return f2268Ep;
    }

    public int describeContents() {
        C0916ih ihVar = CREATOR;
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0905ig)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        C0905ig igVar = (C0905ig) obj;
        for (C0614a aVar : f2268Ep.values()) {
            if (mo4038a(aVar)) {
                if (!igVar.mo4038a(aVar)) {
                    return false;
                }
                if (!mo4039b(aVar).equals(igVar.mo4039b(aVar))) {
                    return false;
                }
            } else if (igVar.mo4038a(aVar)) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: fA */
    public List<C0914g> mo4958fA() {
        return this.f2273FD;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: fB */
    public List<C0915h> mo4959fB() {
        return this.f2277FH;
    }

    /* renamed from: fC */
    public C0905ig freeze() {
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: fa */
    public Set<Integer> mo4961fa() {
        return this.f2269Eq;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: fv */
    public C0906a mo4962fv() {
        return this.f2280Fq;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: fw */
    public C0907b mo4963fw() {
        return this.f2284Fu;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: fx */
    public C0910c mo4964fx() {
        return this.f2286Fw;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: fy */
    public C0911d mo4965fy() {
        return this.f2289Fz;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: fz */
    public List<C0913f> mo4966fz() {
        return this.f2272FC;
    }

    public String getAboutMe() {
        return this.f2279Fp;
    }

    public AgeRange getAgeRange() {
        return this.f2280Fq;
    }

    public String getBirthday() {
        return this.f2281Fr;
    }

    public String getBraggingRights() {
        return this.f2282Fs;
    }

    public int getCircledByCount() {
        return this.f2283Ft;
    }

    public Cover getCover() {
        return this.f2284Fu;
    }

    public String getCurrentLocation() {
        return this.f2285Fv;
    }

    public String getDisplayName() {
        return this.f2293qa;
    }

    public int getGender() {
        return this.f2290eL;
    }

    public String getId() {
        return this.f2294uS;
    }

    public Image getImage() {
        return this.f2286Fw;
    }

    public String getLanguage() {
        return this.f2288Fy;
    }

    public Name getName() {
        return this.f2289Fz;
    }

    public String getNickname() {
        return this.f2270FA;
    }

    public int getObjectType() {
        return this.f2271FB;
    }

    public List<Organizations> getOrganizations() {
        return (ArrayList) this.f2272FC;
    }

    public List<PlacesLived> getPlacesLived() {
        return (ArrayList) this.f2273FD;
    }

    public int getPlusOneCount() {
        return this.f2274FE;
    }

    public int getRelationshipStatus() {
        return this.f2275FF;
    }

    public String getTagline() {
        return this.f2276FG;
    }

    public String getUrl() {
        return this.f2291iH;
    }

    public List<Urls> getUrls() {
        return (ArrayList) this.f2277FH;
    }

    /* access modifiers changed from: 0000 */
    public int getVersionCode() {
        return this.f2292kg;
    }

    public boolean hasAboutMe() {
        return this.f2269Eq.contains(Integer.valueOf(2));
    }

    public boolean hasAgeRange() {
        return this.f2269Eq.contains(Integer.valueOf(3));
    }

    public boolean hasBirthday() {
        return this.f2269Eq.contains(Integer.valueOf(4));
    }

    public boolean hasBraggingRights() {
        return this.f2269Eq.contains(Integer.valueOf(5));
    }

    public boolean hasCircledByCount() {
        return this.f2269Eq.contains(Integer.valueOf(6));
    }

    public boolean hasCover() {
        return this.f2269Eq.contains(Integer.valueOf(7));
    }

    public boolean hasCurrentLocation() {
        return this.f2269Eq.contains(Integer.valueOf(8));
    }

    public boolean hasDisplayName() {
        return this.f2269Eq.contains(Integer.valueOf(9));
    }

    public boolean hasGender() {
        return this.f2269Eq.contains(Integer.valueOf(12));
    }

    public boolean hasId() {
        return this.f2269Eq.contains(Integer.valueOf(14));
    }

    public boolean hasImage() {
        return this.f2269Eq.contains(Integer.valueOf(15));
    }

    public boolean hasIsPlusUser() {
        return this.f2269Eq.contains(Integer.valueOf(16));
    }

    public boolean hasLanguage() {
        return this.f2269Eq.contains(Integer.valueOf(18));
    }

    public boolean hasName() {
        return this.f2269Eq.contains(Integer.valueOf(19));
    }

    public boolean hasNickname() {
        return this.f2269Eq.contains(Integer.valueOf(20));
    }

    public boolean hasObjectType() {
        return this.f2269Eq.contains(Integer.valueOf(21));
    }

    public boolean hasOrganizations() {
        return this.f2269Eq.contains(Integer.valueOf(22));
    }

    public boolean hasPlacesLived() {
        return this.f2269Eq.contains(Integer.valueOf(23));
    }

    public boolean hasPlusOneCount() {
        return this.f2269Eq.contains(Integer.valueOf(24));
    }

    public boolean hasRelationshipStatus() {
        return this.f2269Eq.contains(Integer.valueOf(25));
    }

    public boolean hasTagline() {
        return this.f2269Eq.contains(Integer.valueOf(26));
    }

    public boolean hasUrl() {
        return this.f2269Eq.contains(Integer.valueOf(27));
    }

    public boolean hasUrls() {
        return this.f2269Eq.contains(Integer.valueOf(28));
    }

    public boolean hasVerified() {
        return this.f2269Eq.contains(Integer.valueOf(29));
    }

    public int hashCode() {
        int i = 0;
        Iterator it = f2268Ep.values().iterator();
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                return i2;
            }
            C0614a aVar = (C0614a) it.next();
            if (mo4038a(aVar)) {
                i = mo4039b(aVar).hashCode() + i2 + aVar.mo4051cq();
            } else {
                i = i2;
            }
        }
    }

    public boolean isDataValid() {
        return true;
    }

    public boolean isPlusUser() {
        return this.f2287Fx;
    }

    public boolean isVerified() {
        return this.f2278FI;
    }

    public void writeToParcel(Parcel out, int flags) {
        C0916ih ihVar = CREATOR;
        C0916ih.m2807a(this, out, flags);
    }
}
