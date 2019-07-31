package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.es */
public abstract class C0613es {

    /* renamed from: com.google.android.gms.internal.es$a */
    public static class C0614a<I, O> implements SafeParcelable {
        public static final C0616et CREATOR = new C0616et();

        /* renamed from: kg */
        private final int f1583kg;

        /* renamed from: qi */
        protected final int f1584qi;

        /* renamed from: qj */
        protected final boolean f1585qj;

        /* renamed from: qk */
        protected final int f1586qk;

        /* renamed from: ql */
        protected final boolean f1587ql;

        /* renamed from: qm */
        protected final String f1588qm;

        /* renamed from: qn */
        protected final int f1589qn;

        /* renamed from: qo */
        protected final Class<? extends C0613es> f1590qo;

        /* renamed from: qp */
        protected final String f1591qp;

        /* renamed from: qq */
        private C0618ev f1592qq;
        /* access modifiers changed from: private */

        /* renamed from: qr */
        public C0615b<I, O> f1593qr;

        C0614a(int i, int i2, boolean z, int i3, boolean z2, String str, int i4, String str2, C0607en enVar) {
            this.f1583kg = i;
            this.f1584qi = i2;
            this.f1585qj = z;
            this.f1586qk = i3;
            this.f1587ql = z2;
            this.f1588qm = str;
            this.f1589qn = i4;
            if (str2 == null) {
                this.f1590qo = null;
                this.f1591qp = null;
            } else {
                this.f1590qo = C0623ey.class;
                this.f1591qp = str2;
            }
            if (enVar == null) {
                this.f1593qr = null;
            } else {
                this.f1593qr = enVar.mo4006cf();
            }
        }

        protected C0614a(int i, boolean z, int i2, boolean z2, String str, int i3, Class<? extends C0613es> cls, C0615b<I, O> bVar) {
            this.f1583kg = 1;
            this.f1584qi = i;
            this.f1585qj = z;
            this.f1586qk = i2;
            this.f1587ql = z2;
            this.f1588qm = str;
            this.f1589qn = i3;
            this.f1590qo = cls;
            if (cls == null) {
                this.f1591qp = null;
            } else {
                this.f1591qp = cls.getCanonicalName();
            }
            this.f1593qr = bVar;
        }

        /* renamed from: a */
        public static C0614a m1608a(String str, int i, C0615b<?, ?> bVar, boolean z) {
            return new C0614a(bVar.mo4017ch(), z, bVar.mo4018ci(), false, str, i, null, bVar);
        }

        /* renamed from: a */
        public static <T extends C0613es> C0614a<T, T> m1609a(String str, int i, Class<T> cls) {
            return new C0614a<>(11, false, 11, false, str, i, cls, null);
        }

        /* renamed from: b */
        public static <T extends C0613es> C0614a<ArrayList<T>, ArrayList<T>> m1610b(String str, int i, Class<T> cls) {
            return new C0614a<>(11, true, 11, true, str, i, cls, null);
        }

        /* renamed from: d */
        public static C0614a<Integer, Integer> m1612d(String str, int i) {
            return new C0614a<>(0, false, 0, false, str, i, null, null);
        }

        /* renamed from: e */
        public static C0614a<Double, Double> m1613e(String str, int i) {
            return new C0614a<>(4, false, 4, false, str, i, null, null);
        }

        /* renamed from: f */
        public static C0614a<Boolean, Boolean> m1614f(String str, int i) {
            return new C0614a<>(6, false, 6, false, str, i, null, null);
        }

        /* renamed from: g */
        public static C0614a<String, String> m1615g(String str, int i) {
            return new C0614a<>(7, false, 7, false, str, i, null, null);
        }

        /* renamed from: h */
        public static C0614a<ArrayList<String>, ArrayList<String>> m1616h(String str, int i) {
            return new C0614a<>(7, true, 7, true, str, i, null, null);
        }

        /* renamed from: a */
        public void mo4044a(C0618ev evVar) {
            this.f1592qq = evVar;
        }

        /* renamed from: ch */
        public int mo4045ch() {
            return this.f1584qi;
        }

        /* renamed from: ci */
        public int mo4046ci() {
            return this.f1586qk;
        }

        /* renamed from: cm */
        public C0614a<I, O> mo4047cm() {
            return new C0614a<>(this.f1583kg, this.f1584qi, this.f1585qj, this.f1586qk, this.f1587ql, this.f1588qm, this.f1589qn, this.f1591qp, mo4055cu());
        }

        /* renamed from: cn */
        public boolean mo4048cn() {
            return this.f1585qj;
        }

        /* renamed from: co */
        public boolean mo4049co() {
            return this.f1587ql;
        }

        /* renamed from: cp */
        public String mo4050cp() {
            return this.f1588qm;
        }

        /* renamed from: cq */
        public int mo4051cq() {
            return this.f1589qn;
        }

        /* renamed from: cr */
        public Class<? extends C0613es> mo4052cr() {
            return this.f1590qo;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: cs */
        public String mo4053cs() {
            if (this.f1591qp == null) {
                return null;
            }
            return this.f1591qp;
        }

        /* renamed from: ct */
        public boolean mo4054ct() {
            return this.f1593qr != null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: cu */
        public C0607en mo4055cu() {
            if (this.f1593qr == null) {
                return null;
            }
            return C0607en.m1577a(this.f1593qr);
        }

        /* renamed from: cv */
        public HashMap<String, C0614a<?, ?>> mo4056cv() {
            C0600eg.m1554f(this.f1591qp);
            C0600eg.m1554f(this.f1592qq);
            return this.f1592qq.mo4070Z(this.f1591qp);
        }

        public int describeContents() {
            C0616et etVar = CREATOR;
            return 0;
        }

        /* renamed from: g */
        public I mo4058g(O o) {
            return this.f1593qr.mo4020g(o);
        }

        public int getVersionCode() {
            return this.f1583kg;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Field\n");
            sb.append("            versionCode=").append(this.f1583kg).append(10);
            sb.append("                 typeIn=").append(this.f1584qi).append(10);
            sb.append("            typeInArray=").append(this.f1585qj).append(10);
            sb.append("                typeOut=").append(this.f1586qk).append(10);
            sb.append("           typeOutArray=").append(this.f1587ql).append(10);
            sb.append("        outputFieldName=").append(this.f1588qm).append(10);
            sb.append("      safeParcelFieldId=").append(this.f1589qn).append(10);
            sb.append("       concreteTypeName=").append(mo4053cs()).append(10);
            if (mo4052cr() != null) {
                sb.append("     concreteType.class=").append(mo4052cr().getCanonicalName()).append(10);
            }
            sb.append("          converterName=").append(this.f1593qr == null ? "null" : this.f1593qr.getClass().getCanonicalName()).append(10);
            return sb.toString();
        }

        public void writeToParcel(Parcel out, int flags) {
            C0616et etVar = CREATOR;
            C0616et.m1634a(this, out, flags);
        }
    }

    /* renamed from: com.google.android.gms.internal.es$b */
    public interface C0615b<I, O> {
        /* renamed from: ch */
        int mo4017ch();

        /* renamed from: ci */
        int mo4018ci();

        /* renamed from: g */
        I mo4020g(O o);
    }

    /* renamed from: a */
    private void m1596a(StringBuilder sb, C0614a aVar, Object obj) {
        if (aVar.mo4045ch() == 11) {
            sb.append(((C0613es) aVar.mo4052cr().cast(obj)).toString());
        } else if (aVar.mo4045ch() == 7) {
            sb.append("\"");
            sb.append(C0631fe.m1699aa((String) obj));
            sb.append("\"");
        } else {
            sb.append(obj);
        }
    }

    /* renamed from: a */
    private void m1597a(StringBuilder sb, C0614a aVar, ArrayList<Object> arrayList) {
        sb.append("[");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                sb.append(",");
            }
            Object obj = arrayList.get(i);
            if (obj != null) {
                m1596a(sb, aVar, obj);
            }
        }
        sb.append("]");
    }

    /* access modifiers changed from: protected */
    /* renamed from: V */
    public abstract Object mo4033V(String str);

    /* access modifiers changed from: protected */
    /* renamed from: W */
    public abstract boolean mo4034W(String str);

    /* access modifiers changed from: protected */
    /* renamed from: X */
    public boolean mo4035X(String str) {
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y */
    public boolean mo4036Y(String str) {
        throw new UnsupportedOperationException("Concrete type arrays not supported");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public <O, I> I mo4037a(C0614a<I, O> aVar, Object obj) {
        return aVar.f1593qr != null ? aVar.mo4058g(obj) : obj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo4038a(C0614a aVar) {
        return aVar.mo4046ci() == 11 ? aVar.mo4049co() ? mo4036Y(aVar.mo4050cp()) : mo4035X(aVar.mo4050cp()) : mo4034W(aVar.mo4050cp());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Object mo4039b(C0614a aVar) {
        boolean z = true;
        String cp = aVar.mo4050cp();
        if (aVar.mo4052cr() == null) {
            return mo4033V(aVar.mo4050cp());
        }
        if (mo4033V(aVar.mo4050cp()) != null) {
            z = false;
        }
        C0600eg.m1550a(z, "Concrete field shouldn't be value object: " + aVar.mo4050cp());
        HashMap ck = aVar.mo4049co() ? mo4042cl() : mo4041ck();
        if (ck != null) {
            return ck.get(cp);
        }
        try {
            return getClass().getMethod("get" + Character.toUpperCase(cp.charAt(0)) + cp.substring(1), new Class[0]).invoke(this, new Object[0]);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: cj */
    public abstract HashMap<String, C0614a<?, ?>> mo4040cj();

    /* renamed from: ck */
    public HashMap<String, Object> mo4041ck() {
        return null;
    }

    /* renamed from: cl */
    public HashMap<String, Object> mo4042cl() {
        return null;
    }

    public String toString() {
        HashMap cj = mo4040cj();
        StringBuilder sb = new StringBuilder(100);
        for (String str : cj.keySet()) {
            C0614a aVar = (C0614a) cj.get(str);
            if (mo4038a(aVar)) {
                Object a = mo4037a(aVar, mo4039b(aVar));
                if (sb.length() == 0) {
                    sb.append("{");
                } else {
                    sb.append(",");
                }
                sb.append("\"").append(str).append("\":");
                if (a != null) {
                    switch (aVar.mo4046ci()) {
                        case 8:
                            sb.append("\"").append(C0628fb.m1695b((byte[]) a)).append("\"");
                            break;
                        case 9:
                            sb.append("\"").append(C0628fb.m1696c((byte[]) a)).append("\"");
                            break;
                        case 10:
                            C0632ff.m1701a(sb, (HashMap) a);
                            break;
                        default:
                            if (!aVar.mo4048cn()) {
                                m1596a(sb, aVar, a);
                                break;
                            } else {
                                m1597a(sb, aVar, (ArrayList) a);
                                break;
                            }
                    }
                } else {
                    sb.append("null");
                }
            }
        }
        if (sb.length() > 0) {
            sb.append("}");
        } else {
            sb.append("{}");
        }
        return sb.toString();
    }
}
