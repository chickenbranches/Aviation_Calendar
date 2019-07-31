package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.LocationRequest;

/* renamed from: com.google.android.gms.internal.gv */
public final class C0823gv implements SafeParcelable {
    public static final C0824gw CREATOR = new C0824gw();

    /* renamed from: kg */
    final int f1943kg;

    /* renamed from: yl */
    private final LocationRequest f1944yl;

    /* renamed from: ym */
    private final C0821gt f1945ym;

    public C0823gv(int i, LocationRequest locationRequest, C0821gt gtVar) {
        this.f1943kg = i;
        this.f1944yl = locationRequest;
        this.f1945ym = gtVar;
    }

    /* renamed from: dS */
    public LocationRequest mo4572dS() {
        return this.f1944yl;
    }

    /* renamed from: dT */
    public C0821gt mo4573dT() {
        return this.f1945ym;
    }

    public int describeContents() {
        C0824gw gwVar = CREATOR;
        return 0;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof C0823gv)) {
            return false;
        }
        C0823gv gvVar = (C0823gv) object;
        return this.f1944yl.equals(gvVar.f1944yl) && this.f1945ym.equals(gvVar.f1945ym);
    }

    public int hashCode() {
        return C0596ee.hashCode(this.f1944yl, this.f1945ym);
    }

    public String toString() {
        return C0596ee.m1542e(this).mo3971a("locationRequest", this.f1944yl).mo3971a("filter", this.f1945ym).toString();
    }

    public void writeToParcel(Parcel parcel, int flags) {
        C0824gw gwVar = CREATOR;
        C0824gw.m2473a(this, parcel, flags);
    }
}
