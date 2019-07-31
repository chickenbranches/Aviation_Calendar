package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C0613es.C0615b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ep */
public final class C0609ep implements SafeParcelable, C0615b<String, Integer> {
    public static final C0611eq CREATOR = new C0611eq();

    /* renamed from: kg */
    private final int f1577kg;

    /* renamed from: qd */
    private final HashMap<String, Integer> f1578qd;

    /* renamed from: qe */
    private final HashMap<Integer, String> f1579qe;

    /* renamed from: qf */
    private final ArrayList<C0610a> f1580qf;

    /* renamed from: com.google.android.gms.internal.ep$a */
    public static final class C0610a implements SafeParcelable {
        public static final C0612er CREATOR = new C0612er();

        /* renamed from: qg */
        final String f1581qg;

        /* renamed from: qh */
        final int f1582qh;
        final int versionCode;

        C0610a(int i, String str, int i2) {
            this.versionCode = i;
            this.f1581qg = str;
            this.f1582qh = i2;
        }

        C0610a(String str, int i) {
            this.versionCode = 1;
            this.f1581qg = str;
            this.f1582qh = i;
        }

        public int describeContents() {
            C0612er erVar = CREATOR;
            return 0;
        }

        public void writeToParcel(Parcel out, int flags) {
            C0612er erVar = CREATOR;
            C0612er.m1593a(this, out, flags);
        }
    }

    public C0609ep() {
        this.f1577kg = 1;
        this.f1578qd = new HashMap<>();
        this.f1579qe = new HashMap<>();
        this.f1580qf = null;
    }

    C0609ep(int i, ArrayList<C0610a> arrayList) {
        this.f1577kg = i;
        this.f1578qd = new HashMap<>();
        this.f1579qe = new HashMap<>();
        this.f1580qf = null;
        m1583a(arrayList);
    }

    /* renamed from: a */
    private void m1583a(ArrayList<C0610a> arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0610a aVar = (C0610a) it.next();
            mo4015c(aVar.f1581qg, aVar.f1582qh);
        }
    }

    /* renamed from: a */
    public String mo4020g(Integer num) {
        String str = (String) this.f1579qe.get(num);
        return (str != null || !this.f1578qd.containsKey("gms_unknown")) ? str : "gms_unknown";
    }

    /* renamed from: c */
    public C0609ep mo4015c(String str, int i) {
        this.f1578qd.put(str, Integer.valueOf(i));
        this.f1579qe.put(Integer.valueOf(i), str);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: cg */
    public ArrayList<C0610a> mo4016cg() {
        ArrayList<C0610a> arrayList = new ArrayList<>();
        for (String str : this.f1578qd.keySet()) {
            arrayList.add(new C0610a(str, ((Integer) this.f1578qd.get(str)).intValue()));
        }
        return arrayList;
    }

    /* renamed from: ch */
    public int mo4017ch() {
        return 7;
    }

    /* renamed from: ci */
    public int mo4018ci() {
        return 0;
    }

    public int describeContents() {
        C0611eq eqVar = CREATOR;
        return 0;
    }

    /* access modifiers changed from: 0000 */
    public int getVersionCode() {
        return this.f1577kg;
    }

    public void writeToParcel(Parcel out, int flags) {
        C0611eq eqVar = CREATOR;
        C0611eq.m1590a(this, out, flags);
    }
}
