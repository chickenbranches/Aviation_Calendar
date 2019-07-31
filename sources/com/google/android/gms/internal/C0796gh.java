package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.gh */
public class C0796gh implements SafeParcelable, Cloneable {
    public static final C0797gi CREATOR = new C0797gi();

    /* renamed from: kg */
    private final int f1895kg;

    /* renamed from: xK */
    private final boolean f1896xK;

    /* renamed from: xL */
    private final boolean f1897xL;

    /* renamed from: xM */
    private final boolean f1898xM;

    /* renamed from: xN */
    private final boolean f1899xN;

    /* renamed from: xO */
    private final ArrayList<C0605el> f1900xO;

    public C0796gh(int i, boolean z, boolean z2, boolean z3, boolean z4, ArrayList<C0605el> arrayList) {
        this.f1895kg = i;
        this.f1896xK = z;
        this.f1897xL = z2;
        this.f1898xM = z3;
        this.f1899xN = z4;
        this.f1900xO = arrayList;
    }

    public Object clone() {
        return new C0796gh(this.f1895kg, this.f1896xK, this.f1897xL, this.f1898xM, this.f1899xN, this.f1900xO == null ? null : (ArrayList) this.f1900xO.clone());
    }

    /* renamed from: dD */
    public boolean mo4447dD() {
        return this.f1897xL;
    }

    /* renamed from: dE */
    public boolean mo4448dE() {
        return this.f1898xM;
    }

    /* renamed from: dF */
    public boolean mo4449dF() {
        return this.f1899xN;
    }

    /* renamed from: dG */
    public List<C0605el> mo4450dG() {
        return this.f1900xO;
    }

    public int describeContents() {
        C0797gi giVar = CREATOR;
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
        C0796gh ghVar = (C0796gh) obj;
        if (this.f1900xO == null) {
            if (ghVar.f1900xO != null) {
                return false;
            }
        } else if (!this.f1900xO.equals(ghVar.f1900xO)) {
            return false;
        }
        if (this.f1896xK != ghVar.f1896xK) {
            return false;
        }
        if (this.f1897xL != ghVar.f1897xL) {
            return false;
        }
        if (this.f1899xN != ghVar.f1899xN) {
            return false;
        }
        if (this.f1898xM != ghVar.f1898xM) {
            return false;
        }
        return this.f1895kg == ghVar.f1895kg;
    }

    public int getVersionCode() {
        return this.f1895kg;
    }

    public int hashCode() {
        int i = 1231;
        int hashCode = ((this.f1899xN ? 1231 : 1237) + (((this.f1897xL ? 1231 : 1237) + (((this.f1896xK ? 1231 : 1237) + (((this.f1900xO == null ? 0 : this.f1900xO.hashCode()) + 31) * 31)) * 31)) * 31)) * 31;
        if (!this.f1898xM) {
            i = 1237;
        }
        return ((hashCode + i) * 31) + this.f1895kg;
    }

    public boolean isEnabled() {
        return this.f1896xK;
    }

    public String toString() {
        return "CopresenceSettings [mVersionCode=" + this.f1895kg + ", mEnabled=" + this.f1896xK + "," + "mAcl={" + this.f1900xO.toArray() + "}," + ", mNotifiedForNonAcl=" + this.f1898xM + "]";
    }

    public void writeToParcel(Parcel dest, int flags) {
        C0797gi giVar = CREATOR;
        C0797gi.m2360a(this, dest, flags);
    }
}
