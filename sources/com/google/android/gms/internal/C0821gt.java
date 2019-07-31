package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.gt */
public final class C0821gt implements SafeParcelable {
    public static final C0822gu CREATOR = new C0822gu();

    /* renamed from: kg */
    final int f1936kg;

    /* renamed from: yf */
    private final int f1937yf;

    /* renamed from: yg */
    final List<C0825gx> f1938yg;

    /* renamed from: yh */
    private final String f1939yh;

    /* renamed from: yi */
    private final String f1940yi;

    /* renamed from: yj */
    private final boolean f1941yj;

    /* renamed from: yk */
    private final Set<C0825gx> f1942yk;

    C0821gt(int i, int i2, List<C0825gx> list, String str, String str2, boolean z) {
        this.f1936kg = i;
        this.f1937yf = i2;
        this.f1938yg = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        if (str == null) {
            str = "";
        }
        this.f1939yh = str;
        if (str2 == null) {
            str2 = "";
        }
        this.f1940yi = str2;
        this.f1941yj = z;
        if (this.f1938yg.isEmpty()) {
            this.f1942yk = Collections.emptySet();
        } else {
            this.f1942yk = Collections.unmodifiableSet(new HashSet(this.f1938yg));
        }
    }

    /* renamed from: dO */
    public int mo4559dO() {
        return this.f1937yf;
    }

    /* renamed from: dP */
    public String mo4560dP() {
        return this.f1939yh;
    }

    /* renamed from: dQ */
    public String mo4561dQ() {
        return this.f1940yi;
    }

    /* renamed from: dR */
    public boolean mo4562dR() {
        return this.f1941yj;
    }

    public int describeContents() {
        C0822gu guVar = CREATOR;
        return 0;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof C0821gt)) {
            return false;
        }
        C0821gt gtVar = (C0821gt) object;
        return this.f1937yf == gtVar.f1937yf && this.f1942yk.equals(gtVar.f1942yk) && this.f1939yh == gtVar.f1939yh && this.f1940yi == gtVar.f1940yi && this.f1941yj == gtVar.f1941yj;
    }

    public int hashCode() {
        return C0596ee.hashCode(Integer.valueOf(this.f1937yf), this.f1942yk, this.f1939yh, this.f1940yi, Boolean.valueOf(this.f1941yj));
    }

    public String toString() {
        return C0596ee.m1542e(this).mo3971a("maxResults", Integer.valueOf(this.f1937yf)).mo3971a("types", this.f1942yk).mo3971a("nameQuery", this.f1939yh).mo3971a("textQuery", this.f1940yi).mo3971a("isOpenNowRequired", Boolean.valueOf(this.f1941yj)).toString();
    }

    public void writeToParcel(Parcel parcel, int flags) {
        C0822gu guVar = CREATOR;
        C0822gu.m2468a(this, parcel, flags);
    }
}
