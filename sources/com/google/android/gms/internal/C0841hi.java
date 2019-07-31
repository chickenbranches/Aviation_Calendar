package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.auth.GoogleAuthUtil;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* renamed from: com.google.android.gms.internal.hi */
public class C0841hi implements SafeParcelable {
    public static final C0842hj CREATOR = new C0842hj();

    /* renamed from: Bn */
    public final String f2118Bn;

    /* renamed from: Bo */
    public final String f2119Bo;
    public final int versionCode;

    public C0841hi(int i, String str, String str2) {
        this.versionCode = i;
        this.f2118Bn = str;
        this.f2119Bo = str2;
    }

    public int describeContents() {
        C0842hj hjVar = CREATOR;
        return 0;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || !(object instanceof C0841hi)) {
            return false;
        }
        C0841hi hiVar = (C0841hi) object;
        return this.f2119Bo.equals(hiVar.f2119Bo) && this.f2118Bn.equals(hiVar.f2118Bn);
    }

    public int hashCode() {
        return C0596ee.hashCode(this.f2118Bn, this.f2119Bo);
    }

    public String toString() {
        return C0596ee.m1542e(this).mo3971a(GoogleAuthUtil.KEY_CLIENT_PACKAGE_NAME, this.f2118Bn).mo3971a("locale", this.f2119Bo).toString();
    }

    public void writeToParcel(Parcel out, int flags) {
        C0842hj hjVar = CREATOR;
        C0842hj.m2522a(this, out, flags);
    }
}
