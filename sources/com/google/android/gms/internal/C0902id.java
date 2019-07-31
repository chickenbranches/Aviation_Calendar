package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C0613es.C0614a;
import com.google.android.gms.plus.model.moments.ItemScope;
import com.google.android.gms.plus.model.moments.Moment;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.id */
public final class C0902id extends C0613es implements SafeParcelable, Moment {
    public static final C0903ie CREATOR = new C0903ie();

    /* renamed from: Ep */
    private static final HashMap<String, C0614a<?, ?>> f2259Ep = new HashMap<>();

    /* renamed from: AI */
    private String f2260AI;

    /* renamed from: Eq */
    private final Set<Integer> f2261Eq;

    /* renamed from: Fe */
    private String f2262Fe;

    /* renamed from: Fm */
    private C0900ib f2263Fm;

    /* renamed from: Fn */
    private C0900ib f2264Fn;

    /* renamed from: kg */
    private final int f2265kg;

    /* renamed from: uS */
    private String f2266uS;

    static {
        f2259Ep.put("id", C0614a.m1615g("id", 2));
        f2259Ep.put("result", C0614a.m1609a("result", 4, C0900ib.class));
        f2259Ep.put("startDate", C0614a.m1615g("startDate", 5));
        f2259Ep.put("target", C0614a.m1609a("target", 6, C0900ib.class));
        f2259Ep.put("type", C0614a.m1615g("type", 7));
    }

    public C0902id() {
        this.f2265kg = 1;
        this.f2261Eq = new HashSet();
    }

    C0902id(Set<Integer> set, int i, String str, C0900ib ibVar, String str2, C0900ib ibVar2, String str3) {
        this.f2261Eq = set;
        this.f2265kg = i;
        this.f2266uS = str;
        this.f2263Fm = ibVar;
        this.f2262Fe = str2;
        this.f2264Fn = ibVar2;
        this.f2260AI = str3;
    }

    public C0902id(Set<Integer> set, String str, C0900ib ibVar, String str2, C0900ib ibVar2, String str3) {
        this.f2261Eq = set;
        this.f2265kg = 1;
        this.f2266uS = str;
        this.f2263Fm = ibVar;
        this.f2262Fe = str2;
        this.f2264Fn = ibVar2;
        this.f2260AI = str3;
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
        return this.f2261Eq.contains(Integer.valueOf(aVar.mo4051cq()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Object mo4039b(C0614a aVar) {
        switch (aVar.mo4051cq()) {
            case 2:
                return this.f2266uS;
            case 4:
                return this.f2263Fm;
            case 5:
                return this.f2262Fe;
            case 6:
                return this.f2264Fn;
            case 7:
                return this.f2260AI;
            default:
                throw new IllegalStateException("Unknown safe parcelable id=" + aVar.mo4051cq());
        }
    }

    /* renamed from: cj */
    public HashMap<String, C0614a<?, ?>> mo4040cj() {
        return f2259Ep;
    }

    public int describeContents() {
        C0903ie ieVar = CREATOR;
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0902id)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        C0902id idVar = (C0902id) obj;
        for (C0614a aVar : f2259Ep.values()) {
            if (mo4038a(aVar)) {
                if (!idVar.mo4038a(aVar)) {
                    return false;
                }
                if (!mo4039b(aVar).equals(idVar.mo4039b(aVar))) {
                    return false;
                }
            } else if (idVar.mo4038a(aVar)) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: fa */
    public Set<Integer> mo4934fa() {
        return this.f2261Eq;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: fr */
    public C0900ib mo4935fr() {
        return this.f2263Fm;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: fs */
    public C0900ib mo4936fs() {
        return this.f2264Fn;
    }

    /* renamed from: ft */
    public C0902id freeze() {
        return this;
    }

    public String getId() {
        return this.f2266uS;
    }

    public ItemScope getResult() {
        return this.f2263Fm;
    }

    public String getStartDate() {
        return this.f2262Fe;
    }

    public ItemScope getTarget() {
        return this.f2264Fn;
    }

    public String getType() {
        return this.f2260AI;
    }

    /* access modifiers changed from: 0000 */
    public int getVersionCode() {
        return this.f2265kg;
    }

    public boolean hasId() {
        return this.f2261Eq.contains(Integer.valueOf(2));
    }

    public boolean hasResult() {
        return this.f2261Eq.contains(Integer.valueOf(4));
    }

    public boolean hasStartDate() {
        return this.f2261Eq.contains(Integer.valueOf(5));
    }

    public boolean hasTarget() {
        return this.f2261Eq.contains(Integer.valueOf(6));
    }

    public boolean hasType() {
        return this.f2261Eq.contains(Integer.valueOf(7));
    }

    public int hashCode() {
        int i = 0;
        Iterator it = f2259Ep.values().iterator();
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
        C0903ie ieVar = CREATOR;
        C0903ie.m2720a(this, out, flags);
    }
}
