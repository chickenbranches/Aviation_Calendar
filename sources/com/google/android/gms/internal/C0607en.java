package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C0613es.C0615b;

/* renamed from: com.google.android.gms.internal.en */
public class C0607en implements SafeParcelable {
    public static final C0608eo CREATOR = new C0608eo();

    /* renamed from: kg */
    private final int f1575kg;

    /* renamed from: qc */
    private final C0609ep f1576qc;

    C0607en(int i, C0609ep epVar) {
        this.f1575kg = i;
        this.f1576qc = epVar;
    }

    private C0607en(C0609ep epVar) {
        this.f1575kg = 1;
        this.f1576qc = epVar;
    }

    /* renamed from: a */
    public static C0607en m1577a(C0615b<?, ?> bVar) {
        if (bVar instanceof C0609ep) {
            return new C0607en((C0609ep) bVar);
        }
        throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ce */
    public C0609ep mo4005ce() {
        return this.f1576qc;
    }

    /* renamed from: cf */
    public C0615b<?, ?> mo4006cf() {
        if (this.f1576qc != null) {
            return this.f1576qc;
        }
        throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
    }

    public int describeContents() {
        C0608eo eoVar = CREATOR;
        return 0;
    }

    /* access modifiers changed from: 0000 */
    public int getVersionCode() {
        return this.f1575kg;
    }

    public void writeToParcel(Parcel out, int flags) {
        C0608eo eoVar = CREATOR;
        C0608eo.m1580a(this, out, flags);
    }
}
