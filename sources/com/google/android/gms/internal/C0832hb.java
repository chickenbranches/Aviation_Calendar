package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* renamed from: com.google.android.gms.internal.hb */
public final class C0832hb extends C0820gs implements SafeParcelable {

    /* renamed from: AJ */
    private static final C0832hb f2079AJ = new C0832hb(0, new C0834hd[0], new float[0], 0);
    public static final C0833hc CREATOR = new C0833hc();

    /* renamed from: AK */
    private final C0834hd[] f2080AK;

    /* renamed from: AL */
    private final float[] f2081AL;

    /* renamed from: kg */
    final int f2082kg;

    /* renamed from: vO */
    private final long f2083vO;

    C0832hb(int i, C0834hd[] hdVarArr, float[] fArr, long j) {
        C0600eg.m1553b(hdVarArr.length == fArr.length, (Object) "mismatched places to probabilities arrays");
        this.f2082kg = i;
        this.f2080AK = hdVarArr;
        this.f2081AL = fArr;
        this.f2083vO = j;
    }

    /* renamed from: dU */
    public C0834hd[] mo4604dU() {
        return this.f2080AK;
    }

    /* renamed from: dV */
    public float[] mo4605dV() {
        return this.f2081AL;
    }

    public int describeContents() {
        C0833hc hcVar = CREATOR;
        return 0;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof C0832hb)) {
            return false;
        }
        C0832hb hbVar = (C0832hb) object;
        return this.f2080AK.equals(hbVar.f2080AK) && this.f2081AL.equals(hbVar.f2081AL);
    }

    public long getTimestampMillis() {
        return this.f2083vO;
    }

    public int hashCode() {
        return C0596ee.hashCode(this.f2080AK, this.f2081AL);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PlaceEstimate{");
        for (int i = 0; i < this.f2080AK.length; i++) {
            sb.append(String.format("(%f, %s)", new Object[]{Float.valueOf(this.f2081AL[i]), this.f2080AK[i].toString()}));
            if (i != this.f2080AK.length - 1) {
                sb.append(",");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int flags) {
        C0833hc hcVar = CREATOR;
        C0833hc.m2494a(this, parcel, flags);
    }
}
