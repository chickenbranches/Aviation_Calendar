package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C0613es.C0614a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ey */
public class C0623ey extends C0613es implements SafeParcelable {
    public static final C0624ez CREATOR = new C0624ez();

    /* renamed from: kg */
    private final int f1601kg;
    private final String mClassName;

    /* renamed from: qA */
    private int f1602qA;

    /* renamed from: qB */
    private int f1603qB;

    /* renamed from: qq */
    private final C0618ev f1604qq;

    /* renamed from: qy */
    private final Parcel f1605qy;

    /* renamed from: qz */
    private final int f1606qz;

    C0623ey(int i, Parcel parcel, C0618ev evVar) {
        this.f1601kg = i;
        this.f1605qy = (Parcel) C0600eg.m1554f(parcel);
        this.f1606qz = 2;
        this.f1604qq = evVar;
        if (this.f1604qq == null) {
            this.mClassName = null;
        } else {
            this.mClassName = this.f1604qq.mo4076cz();
        }
        this.f1602qA = 2;
    }

    private C0623ey(SafeParcelable safeParcelable, C0618ev evVar, String str) {
        this.f1601kg = 1;
        this.f1605qy = Parcel.obtain();
        safeParcelable.writeToParcel(this.f1605qy, 0);
        this.f1606qz = 1;
        this.f1604qq = (C0618ev) C0600eg.m1554f(evVar);
        this.mClassName = (String) C0600eg.m1554f(str);
        this.f1602qA = 2;
    }

    /* renamed from: a */
    public static <T extends C0613es & SafeParcelable> C0623ey m1656a(T t) {
        String canonicalName = t.getClass().getCanonicalName();
        return new C0623ey((SafeParcelable) t, m1662b(t), canonicalName);
    }

    /* renamed from: a */
    private static void m1657a(C0618ev evVar, C0613es esVar) {
        Class cls = esVar.getClass();
        if (!evVar.mo4072b(cls)) {
            HashMap cj = esVar.mo4040cj();
            evVar.mo4071a(cls, esVar.mo4040cj());
            for (String str : cj.keySet()) {
                C0614a aVar = (C0614a) cj.get(str);
                Class cr = aVar.mo4052cr();
                if (cr != null) {
                    try {
                        m1657a(evVar, (C0613es) cr.newInstance());
                    } catch (InstantiationException e) {
                        throw new IllegalStateException("Could not instantiate an object of type " + aVar.mo4052cr().getCanonicalName(), e);
                    } catch (IllegalAccessException e2) {
                        throw new IllegalStateException("Could not access object of type " + aVar.mo4052cr().getCanonicalName(), e2);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m1658a(StringBuilder sb, int i, Object obj) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb.append(obj);
                return;
            case 7:
                sb.append("\"").append(C0631fe.m1699aa(obj.toString())).append("\"");
                return;
            case 8:
                sb.append("\"").append(C0628fb.m1695b((byte[]) obj)).append("\"");
                return;
            case 9:
                sb.append("\"").append(C0628fb.m1696c((byte[]) obj));
                sb.append("\"");
                return;
            case 10:
                C0632ff.m1701a(sb, (HashMap) obj);
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                throw new IllegalArgumentException("Unknown type = " + i);
        }
    }

    /* renamed from: a */
    private void m1659a(StringBuilder sb, C0614a<?, ?> aVar, Parcel parcel, int i) {
        switch (aVar.mo4046ci()) {
            case 0:
                m1664b(sb, aVar, mo4037a(aVar, Integer.valueOf(C0173a.m305g(parcel, i))));
                return;
            case 1:
                m1664b(sb, aVar, mo4037a(aVar, C0173a.m307i(parcel, i)));
                return;
            case 2:
                m1664b(sb, aVar, mo4037a(aVar, Long.valueOf(C0173a.m306h(parcel, i))));
                return;
            case 3:
                m1664b(sb, aVar, mo4037a(aVar, Float.valueOf(C0173a.m308j(parcel, i))));
                return;
            case 4:
                m1664b(sb, aVar, mo4037a(aVar, Double.valueOf(C0173a.m309k(parcel, i))));
                return;
            case 5:
                m1664b(sb, aVar, mo4037a(aVar, C0173a.m310l(parcel, i)));
                return;
            case 6:
                m1664b(sb, aVar, mo4037a(aVar, Boolean.valueOf(C0173a.m301c(parcel, i))));
                return;
            case 7:
                m1664b(sb, aVar, mo4037a(aVar, C0173a.m312m(parcel, i)));
                return;
            case 8:
            case 9:
                m1664b(sb, aVar, mo4037a(aVar, C0173a.m316p(parcel, i)));
                return;
            case 10:
                m1664b(sb, aVar, mo4037a(aVar, m1666c(C0173a.m315o(parcel, i))));
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                throw new IllegalArgumentException("Unknown field out type = " + aVar.mo4046ci());
        }
    }

    /* renamed from: a */
    private void m1660a(StringBuilder sb, String str, C0614a<?, ?> aVar, Parcel parcel, int i) {
        sb.append("\"").append(str).append("\":");
        if (aVar.mo4054ct()) {
            m1659a(sb, aVar, parcel, i);
        } else {
            m1663b(sb, aVar, parcel, i);
        }
    }

    /* renamed from: a */
    private void m1661a(StringBuilder sb, HashMap<String, C0614a<?, ?>> hashMap, Parcel parcel) {
        HashMap c = m1667c(hashMap);
        sb.append('{');
        int n = C0173a.m313n(parcel);
        boolean z = false;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            Entry entry = (Entry) c.get(Integer.valueOf(C0173a.m292M(m)));
            if (entry != null) {
                if (z) {
                    sb.append(",");
                }
                m1660a(sb, (String) entry.getKey(), (C0614a) entry.getValue(), parcel, m);
                z = true;
            }
        }
        if (parcel.dataPosition() != n) {
            throw new C0174a("Overread allowed size end=" + n, parcel);
        }
        sb.append('}');
    }

    /* renamed from: b */
    private static C0618ev m1662b(C0613es esVar) {
        C0618ev evVar = new C0618ev(esVar.getClass());
        m1657a(evVar, esVar);
        evVar.mo4074cx();
        evVar.mo4073cw();
        return evVar;
    }

    /* renamed from: b */
    private void m1663b(StringBuilder sb, C0614a<?, ?> aVar, Parcel parcel, int i) {
        if (aVar.mo4049co()) {
            sb.append("[");
            switch (aVar.mo4046ci()) {
                case 0:
                    C0627fa.m1690a(sb, C0173a.m318r(parcel, i));
                    break;
                case 1:
                    C0627fa.m1692a(sb, (T[]) C0173a.m320t(parcel, i));
                    break;
                case 2:
                    C0627fa.m1691a(sb, C0173a.m319s(parcel, i));
                    break;
                case 3:
                    C0627fa.m1689a(sb, C0173a.m321u(parcel, i));
                    break;
                case 4:
                    C0627fa.m1688a(sb, C0173a.m322v(parcel, i));
                    break;
                case 5:
                    C0627fa.m1692a(sb, (T[]) C0173a.m323w(parcel, i));
                    break;
                case 6:
                    C0627fa.m1694a(sb, C0173a.m317q(parcel, i));
                    break;
                case 7:
                    C0627fa.m1693a(sb, C0173a.m324x(parcel, i));
                    break;
                case 8:
                case 9:
                case 10:
                    throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                case 11:
                    Parcel[] A = C0173a.m291A(parcel, i);
                    int length = A.length;
                    for (int i2 = 0; i2 < length; i2++) {
                        if (i2 > 0) {
                            sb.append(",");
                        }
                        A[i2].setDataPosition(0);
                        m1661a(sb, aVar.mo4056cv(), A[i2]);
                    }
                    break;
                default:
                    throw new IllegalStateException("Unknown field type out.");
            }
            sb.append("]");
            return;
        }
        switch (aVar.mo4046ci()) {
            case 0:
                sb.append(C0173a.m305g(parcel, i));
                return;
            case 1:
                sb.append(C0173a.m307i(parcel, i));
                return;
            case 2:
                sb.append(C0173a.m306h(parcel, i));
                return;
            case 3:
                sb.append(C0173a.m308j(parcel, i));
                return;
            case 4:
                sb.append(C0173a.m309k(parcel, i));
                return;
            case 5:
                sb.append(C0173a.m310l(parcel, i));
                return;
            case 6:
                sb.append(C0173a.m301c(parcel, i));
                return;
            case 7:
                sb.append("\"").append(C0631fe.m1699aa(C0173a.m312m(parcel, i))).append("\"");
                return;
            case 8:
                sb.append("\"").append(C0628fb.m1695b(C0173a.m316p(parcel, i))).append("\"");
                return;
            case 9:
                sb.append("\"").append(C0628fb.m1696c(C0173a.m316p(parcel, i)));
                sb.append("\"");
                return;
            case 10:
                Bundle o = C0173a.m315o(parcel, i);
                Set<String> keySet = o.keySet();
                keySet.size();
                sb.append("{");
                boolean z = true;
                for (String str : keySet) {
                    if (!z) {
                        sb.append(",");
                    }
                    sb.append("\"").append(str).append("\"");
                    sb.append(":");
                    sb.append("\"").append(C0631fe.m1699aa(o.getString(str))).append("\"");
                    z = false;
                }
                sb.append("}");
                return;
            case 11:
                Parcel z2 = C0173a.m326z(parcel, i);
                z2.setDataPosition(0);
                m1661a(sb, aVar.mo4056cv(), z2);
                return;
            default:
                throw new IllegalStateException("Unknown field type out");
        }
    }

    /* renamed from: b */
    private void m1664b(StringBuilder sb, C0614a<?, ?> aVar, Object obj) {
        if (aVar.mo4048cn()) {
            m1665b(sb, aVar, (ArrayList) obj);
        } else {
            m1658a(sb, aVar.mo4045ch(), obj);
        }
    }

    /* renamed from: b */
    private void m1665b(StringBuilder sb, C0614a<?, ?> aVar, ArrayList<?> arrayList) {
        sb.append("[");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (i != 0) {
                sb.append(",");
            }
            m1658a(sb, aVar.mo4045ch(), arrayList.get(i));
        }
        sb.append("]");
    }

    /* renamed from: c */
    public static HashMap<String, String> m1666c(Bundle bundle) {
        HashMap<String, String> hashMap = new HashMap<>();
        for (String str : bundle.keySet()) {
            hashMap.put(str, bundle.getString(str));
        }
        return hashMap;
    }

    /* renamed from: c */
    private static HashMap<Integer, Entry<String, C0614a<?, ?>>> m1667c(HashMap<String, C0614a<?, ?>> hashMap) {
        HashMap<Integer, Entry<String, C0614a<?, ?>>> hashMap2 = new HashMap<>();
        for (Entry entry : hashMap.entrySet()) {
            hashMap2.put(Integer.valueOf(((C0614a) entry.getValue()).mo4051cq()), entry);
        }
        return hashMap2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: V */
    public Object mo4033V(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: W */
    public boolean mo4034W(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    /* renamed from: cB */
    public Parcel mo4094cB() {
        switch (this.f1602qA) {
            case 0:
                this.f1603qB = C0175b.m352o(this.f1605qy);
                C0175b.m329D(this.f1605qy, this.f1603qB);
                this.f1602qA = 2;
                break;
            case 1:
                C0175b.m329D(this.f1605qy, this.f1603qB);
                this.f1602qA = 2;
                break;
        }
        return this.f1605qy;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: cC */
    public C0618ev mo4095cC() {
        switch (this.f1606qz) {
            case 0:
                return null;
            case 1:
                return this.f1604qq;
            case 2:
                return this.f1604qq;
            default:
                throw new IllegalStateException("Invalid creation type: " + this.f1606qz);
        }
    }

    /* renamed from: cj */
    public HashMap<String, C0614a<?, ?>> mo4040cj() {
        if (this.f1604qq == null) {
            return null;
        }
        return this.f1604qq.mo4070Z(this.mClassName);
    }

    public int describeContents() {
        C0624ez ezVar = CREATOR;
        return 0;
    }

    public int getVersionCode() {
        return this.f1601kg;
    }

    public String toString() {
        C0600eg.m1552b(this.f1604qq, (Object) "Cannot convert to JSON on client side.");
        Parcel cB = mo4094cB();
        cB.setDataPosition(0);
        StringBuilder sb = new StringBuilder(100);
        m1661a(sb, this.f1604qq.mo4070Z(this.mClassName), cB);
        return sb.toString();
    }

    public void writeToParcel(Parcel out, int flags) {
        C0624ez ezVar = CREATOR;
        C0624ez.m1673a(this, out, flags);
    }
}
