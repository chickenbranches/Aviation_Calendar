package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.Scopes;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.hv */
public class C0876hv {

    /* renamed from: DT */
    private String[] f2166DT;

    /* renamed from: DU */
    private String f2167DU;

    /* renamed from: DV */
    private String f2168DV;

    /* renamed from: DW */
    private String f2169DW;

    /* renamed from: DY */
    private ArrayList<String> f2170DY = new ArrayList<>();

    /* renamed from: DZ */
    private String[] f2171DZ;

    /* renamed from: jG */
    private String f2172jG;

    public C0876hv(Context context) {
        this.f2168DV = context.getPackageName();
        this.f2167DU = context.getPackageName();
        this.f2170DY.add(Scopes.PLUS_LOGIN);
    }

    /* renamed from: aA */
    public C0876hv mo4761aA(String str) {
        this.f2172jG = str;
        return this;
    }

    /* renamed from: d */
    public C0876hv mo4762d(String... strArr) {
        this.f2170DY.clear();
        this.f2170DY.addAll(Arrays.asList(strArr));
        return this;
    }

    /* renamed from: e */
    public C0876hv mo4763e(String... strArr) {
        this.f2171DZ = strArr;
        return this;
    }

    /* renamed from: eY */
    public C0876hv mo4764eY() {
        this.f2170DY.clear();
        return this;
    }

    /* renamed from: eZ */
    public C0875hu mo4765eZ() {
        if (this.f2172jG == null) {
            this.f2172jG = "<<default account>>";
        }
        return new C0875hu(this.f2172jG, (String[]) this.f2170DY.toArray(new String[this.f2170DY.size()]), this.f2171DZ, this.f2166DT, this.f2167DU, this.f2168DV, this.f2169DW);
    }
}
