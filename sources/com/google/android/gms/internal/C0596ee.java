package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ee */
public final class C0596ee {

    /* renamed from: com.google.android.gms.internal.ee$a */
    public static final class C0598a {

        /* renamed from: pN */
        private final List<String> f1557pN;

        /* renamed from: pO */
        private final Object f1558pO;

        private C0598a(Object obj) {
            this.f1558pO = C0600eg.m1554f(obj);
            this.f1557pN = new ArrayList();
        }

        /* renamed from: a */
        public C0598a mo3971a(String str, Object obj) {
            this.f1557pN.add(((String) C0600eg.m1554f(str)) + "=" + String.valueOf(obj));
            return this;
        }

        public String toString() {
            StringBuilder append = new StringBuilder(100).append(this.f1558pO.getClass().getSimpleName()).append('{');
            int size = this.f1557pN.size();
            for (int i = 0; i < size; i++) {
                append.append((String) this.f1557pN.get(i));
                if (i < size - 1) {
                    append.append(", ");
                }
            }
            return append.append('}').toString();
        }
    }

    /* renamed from: e */
    public static C0598a m1542e(Object obj) {
        return new C0598a(obj);
    }

    public static boolean equal(Object a, Object b) {
        return a == b || (a != null && a.equals(b));
    }

    public static int hashCode(Object... objects) {
        return Arrays.hashCode(objects);
    }
}
