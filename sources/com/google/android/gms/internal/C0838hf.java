package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* renamed from: com.google.android.gms.internal.hf */
public final class C0838hf implements SafeParcelable {
    public static final C0839hg CREATOR = new C0839hg();

    /* renamed from: Bf */
    public final String f2109Bf;

    /* renamed from: Bg */
    public final String f2110Bg;

    /* renamed from: Bh */
    public final String f2111Bh;

    /* renamed from: Bi */
    public final List<String> f2112Bi;
    public final String name;
    public final int versionCode;

    public C0838hf(int i, String str, String str2, String str3, String str4, List<String> list) {
        this.versionCode = i;
        this.name = str;
        this.f2109Bf = str2;
        this.f2110Bg = str3;
        this.f2111Bh = str4;
        this.f2112Bi = list;
    }

    public int describeContents() {
        C0839hg hgVar = CREATOR;
        return 0;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof C0838hf)) {
            return false;
        }
        C0838hf hfVar = (C0838hf) object;
        return C0596ee.equal(this.name, hfVar.name) && C0596ee.equal(this.f2109Bf, hfVar.f2109Bf) && C0596ee.equal(this.f2110Bg, hfVar.f2110Bg) && C0596ee.equal(this.f2111Bh, hfVar.f2111Bh) && C0596ee.equal(this.f2112Bi, hfVar.f2112Bi);
    }

    public int hashCode() {
        return C0596ee.hashCode(this.name, this.f2109Bf, this.f2110Bg, this.f2111Bh);
    }

    public String toString() {
        return C0596ee.m1542e(this).mo3971a("name", this.name).mo3971a("address", this.f2109Bf).mo3971a("internationalPhoneNumber", this.f2110Bg).mo3971a("regularOpenHours", this.f2111Bh).mo3971a("attributions", this.f2112Bi).toString();
    }

    public void writeToParcel(Parcel parcel, int flags) {
        C0839hg hgVar = CREATOR;
        C0839hg.m2518a(this, parcel, flags);
    }
}
