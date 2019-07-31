package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C0613es.C0614a;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ev */
public class C0618ev implements SafeParcelable {
    public static final C0621ew CREATOR = new C0621ew();

    /* renamed from: kg */
    private final int f1594kg;

    /* renamed from: qs */
    private final HashMap<String, HashMap<String, C0614a<?, ?>>> f1595qs;

    /* renamed from: qt */
    private final ArrayList<C0619a> f1596qt;

    /* renamed from: qu */
    private final String f1597qu;

    /* renamed from: com.google.android.gms.internal.ev$a */
    public static class C0619a implements SafeParcelable {
        public static final C0622ex CREATOR = new C0622ex();
        final String className;

        /* renamed from: qv */
        final ArrayList<C0620b> f1598qv;
        final int versionCode;

        C0619a(int i, String str, ArrayList<C0620b> arrayList) {
            this.versionCode = i;
            this.className = str;
            this.f1598qv = arrayList;
        }

        C0619a(String str, HashMap<String, C0614a<?, ?>> hashMap) {
            this.versionCode = 1;
            this.className = str;
            this.f1598qv = m1648b(hashMap);
        }

        /* renamed from: b */
        private static ArrayList<C0620b> m1648b(HashMap<String, C0614a<?, ?>> hashMap) {
            if (hashMap == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (String str : hashMap.keySet()) {
                arrayList.add(new C0620b(str, (C0614a) hashMap.get(str)));
            }
            return arrayList;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: cA */
        public HashMap<String, C0614a<?, ?>> mo4081cA() {
            HashMap<String, C0614a<?, ?>> hashMap = new HashMap<>();
            int size = this.f1598qv.size();
            for (int i = 0; i < size; i++) {
                C0620b bVar = (C0620b) this.f1598qv.get(i);
                hashMap.put(bVar.f1599qw, bVar.f1600qx);
            }
            return hashMap;
        }

        public int describeContents() {
            C0622ex exVar = CREATOR;
            return 0;
        }

        public void writeToParcel(Parcel out, int flags) {
            C0622ex exVar = CREATOR;
            C0622ex.m1653a(this, out, flags);
        }
    }

    /* renamed from: com.google.android.gms.internal.ev$b */
    public static class C0620b implements SafeParcelable {
        public static final C0617eu CREATOR = new C0617eu();

        /* renamed from: qw */
        final String f1599qw;

        /* renamed from: qx */
        final C0614a<?, ?> f1600qx;
        final int versionCode;

        C0620b(int i, String str, C0614a<?, ?> aVar) {
            this.versionCode = i;
            this.f1599qw = str;
            this.f1600qx = aVar;
        }

        C0620b(String str, C0614a<?, ?> aVar) {
            this.versionCode = 1;
            this.f1599qw = str;
            this.f1600qx = aVar;
        }

        public int describeContents() {
            C0617eu euVar = CREATOR;
            return 0;
        }

        public void writeToParcel(Parcel out, int flags) {
            C0617eu euVar = CREATOR;
            C0617eu.m1637a(this, out, flags);
        }
    }

    C0618ev(int i, ArrayList<C0619a> arrayList, String str) {
        this.f1594kg = i;
        this.f1596qt = null;
        this.f1595qs = m1640b(arrayList);
        this.f1597qu = (String) C0600eg.m1554f(str);
        mo4073cw();
    }

    public C0618ev(Class<? extends C0613es> cls) {
        this.f1594kg = 1;
        this.f1596qt = null;
        this.f1595qs = new HashMap<>();
        this.f1597qu = cls.getCanonicalName();
    }

    /* renamed from: b */
    private static HashMap<String, HashMap<String, C0614a<?, ?>>> m1640b(ArrayList<C0619a> arrayList) {
        HashMap<String, HashMap<String, C0614a<?, ?>>> hashMap = new HashMap<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0619a aVar = (C0619a) arrayList.get(i);
            hashMap.put(aVar.className, aVar.mo4081cA());
        }
        return hashMap;
    }

    /* renamed from: Z */
    public HashMap<String, C0614a<?, ?>> mo4070Z(String str) {
        return (HashMap) this.f1595qs.get(str);
    }

    /* renamed from: a */
    public void mo4071a(Class<? extends C0613es> cls, HashMap<String, C0614a<?, ?>> hashMap) {
        this.f1595qs.put(cls.getCanonicalName(), hashMap);
    }

    /* renamed from: b */
    public boolean mo4072b(Class<? extends C0613es> cls) {
        return this.f1595qs.containsKey(cls.getCanonicalName());
    }

    /* renamed from: cw */
    public void mo4073cw() {
        for (String str : this.f1595qs.keySet()) {
            HashMap hashMap = (HashMap) this.f1595qs.get(str);
            for (String str2 : hashMap.keySet()) {
                ((C0614a) hashMap.get(str2)).mo4044a(this);
            }
        }
    }

    /* renamed from: cx */
    public void mo4074cx() {
        for (String str : this.f1595qs.keySet()) {
            HashMap hashMap = (HashMap) this.f1595qs.get(str);
            HashMap hashMap2 = new HashMap();
            for (String str2 : hashMap.keySet()) {
                hashMap2.put(str2, ((C0614a) hashMap.get(str2)).mo4047cm());
            }
            this.f1595qs.put(str, hashMap2);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: cy */
    public ArrayList<C0619a> mo4075cy() {
        ArrayList<C0619a> arrayList = new ArrayList<>();
        for (String str : this.f1595qs.keySet()) {
            arrayList.add(new C0619a(str, (HashMap) this.f1595qs.get(str)));
        }
        return arrayList;
    }

    /* renamed from: cz */
    public String mo4076cz() {
        return this.f1597qu;
    }

    public int describeContents() {
        C0621ew ewVar = CREATOR;
        return 0;
    }

    /* access modifiers changed from: 0000 */
    public int getVersionCode() {
        return this.f1594kg;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String str : this.f1595qs.keySet()) {
            sb.append(str).append(":\n");
            HashMap hashMap = (HashMap) this.f1595qs.get(str);
            for (String str2 : hashMap.keySet()) {
                sb.append("  ").append(str2).append(": ");
                sb.append(hashMap.get(str2));
            }
        }
        return sb.toString();
    }

    public void writeToParcel(Parcel out, int flags) {
        C0621ew ewVar = CREATOR;
        C0621ew.m1650a(this, out, flags);
    }
}
