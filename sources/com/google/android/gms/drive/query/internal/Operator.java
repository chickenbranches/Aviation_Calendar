package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class Operator implements SafeParcelable {
    public static final Creator<Operator> CREATOR = new C0261h();

    /* renamed from: sd */
    public static final Operator f526sd = new Operator("=");

    /* renamed from: se */
    public static final Operator f527se = new Operator("<");

    /* renamed from: sf */
    public static final Operator f528sf = new Operator("<=");

    /* renamed from: sg */
    public static final Operator f529sg = new Operator(">");

    /* renamed from: sh */
    public static final Operator f530sh = new Operator(">=");

    /* renamed from: si */
    public static final Operator f531si = new Operator("and");

    /* renamed from: sj */
    public static final Operator f532sj = new Operator("or");

    /* renamed from: sk */
    public static final Operator f533sk = new Operator("not");

    /* renamed from: sl */
    public static final Operator f534sl = new Operator("contains");

    /* renamed from: kg */
    final int f535kg;
    final String mTag;

    Operator(int versionCode, String tag) {
        this.f535kg = versionCode;
        this.mTag = tag;
    }

    private Operator(String tag) {
        this(1, tag);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Operator operator = (Operator) obj;
        return this.mTag == null ? operator.mTag == null : this.mTag.equals(operator.mTag);
    }

    public int hashCode() {
        return (this.mTag == null ? 0 : this.mTag.hashCode()) + 31;
    }

    public void writeToParcel(Parcel out, int flags) {
        C0261h.m613a(this, out, flags);
    }
}
