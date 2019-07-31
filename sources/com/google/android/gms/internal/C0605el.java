package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* renamed from: com.google.android.gms.internal.el */
public final class C0605el implements SafeParcelable {
    public static final C0606em CREATOR = new C0606em();

    /* renamed from: kg */
    private final int f1567kg;
    @Deprecated

    /* renamed from: nN */
    private final Bundle f1568nN;

    /* renamed from: os */
    private final int f1569os;

    /* renamed from: pX */
    private final int f1570pX;

    /* renamed from: pY */
    private final String f1571pY;

    /* renamed from: pZ */
    private final String f1572pZ;

    /* renamed from: qa */
    private final String f1573qa;

    /* renamed from: qb */
    private final String f1574qb;

    C0605el(int i, int i2, int i3, String str, String str2, String str3, String str4, Bundle bundle) {
        this.f1567kg = i;
        this.f1569os = i2;
        this.f1570pX = i3;
        this.f1571pY = str;
        this.f1572pZ = str2;
        this.f1573qa = str3;
        this.f1574qb = str4;
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.f1568nN = bundle;
    }

    /* renamed from: bY */
    public int mo3986bY() {
        return this.f1570pX;
    }

    /* renamed from: bZ */
    public String mo3987bZ() {
        return this.f1571pY;
    }

    /* renamed from: ca */
    public String mo3988ca() {
        return this.f1572pZ;
    }

    /* renamed from: cb */
    public String mo3989cb() {
        return this.f1574qb;
    }

    /* renamed from: cc */
    public boolean mo3990cc() {
        return this.f1569os == 1 && this.f1570pX == -1;
    }

    /* renamed from: cd */
    public boolean mo3991cd() {
        return this.f1569os == 2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0605el)) {
            return false;
        }
        C0605el elVar = (C0605el) obj;
        return this.f1567kg == elVar.f1567kg && this.f1569os == elVar.f1569os && this.f1570pX == elVar.f1570pX && C0596ee.equal(this.f1571pY, elVar.f1571pY) && C0596ee.equal(this.f1572pZ, elVar.f1572pZ);
    }

    public String getDisplayName() {
        return this.f1573qa;
    }

    @Deprecated
    public Bundle getMetadata() {
        return this.f1568nN;
    }

    public int getType() {
        return this.f1569os;
    }

    public int getVersionCode() {
        return this.f1567kg;
    }

    public int hashCode() {
        return C0596ee.hashCode(Integer.valueOf(this.f1567kg), Integer.valueOf(this.f1569os), Integer.valueOf(this.f1570pX), this.f1571pY, this.f1572pZ);
    }

    public String toString() {
        if (mo3991cd()) {
            return String.format("Person [%s] %s", new Object[]{mo3988ca(), getDisplayName()});
        } else if (mo3990cc()) {
            return String.format("Circle [%s] %s", new Object[]{mo3987bZ(), getDisplayName()});
        } else {
            return String.format("Group [%s] %s", new Object[]{mo3987bZ(), getDisplayName()});
        }
    }

    public void writeToParcel(Parcel out, int flags) {
        C0606em.m1574a(this, out, flags);
    }
}
