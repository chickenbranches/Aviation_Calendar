package com.google.android.gms.internal;

import android.os.Parcel;
import android.view.View;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.google.android.gms.internal.dt */
public final class C0565dt {

    /* renamed from: nu */
    private final View f1494nu;

    /* renamed from: oX */
    private final C0566a f1495oX;

    /* renamed from: com.google.android.gms.internal.dt$a */
    public static final class C0566a implements SafeParcelable {
        public static final C0599ef CREATOR = new C0599ef();

        /* renamed from: jG */
        private final String f1496jG;

        /* renamed from: kg */
        private final int f1497kg;

        /* renamed from: nt */
        private final int f1498nt;

        /* renamed from: nv */
        private final String f1499nv;

        /* renamed from: oY */
        private final List<String> f1500oY;

        C0566a(int i, String str, List<String> list, int i2, String str2) {
            this.f1500oY = new ArrayList();
            this.f1497kg = i;
            this.f1496jG = str;
            this.f1500oY.addAll(list);
            this.f1498nt = i2;
            this.f1499nv = str2;
        }

        public C0566a(String str, Collection<String> collection, int i, String str2) {
            this(3, str, new ArrayList(collection), i, str2);
        }

        /* renamed from: bF */
        public String mo3876bF() {
            return this.f1496jG != null ? this.f1496jG : "<<default account>>";
        }

        /* renamed from: bG */
        public int mo3877bG() {
            return this.f1498nt;
        }

        /* renamed from: bH */
        public List<String> mo3878bH() {
            return new ArrayList(this.f1500oY);
        }

        /* renamed from: bJ */
        public String mo3879bJ() {
            return this.f1499nv;
        }

        public int describeContents() {
            return 0;
        }

        public String getAccountName() {
            return this.f1496jG;
        }

        public int getVersionCode() {
            return this.f1497kg;
        }

        public void writeToParcel(Parcel out, int flags) {
            C0599ef.m1544a(this, out, flags);
        }
    }

    public C0565dt(String str, Collection<String> collection, int i, View view, String str2) {
        this.f1495oX = new C0566a(str, collection, i, str2);
        this.f1494nu = view;
    }

    /* renamed from: bF */
    public String mo3869bF() {
        return this.f1495oX.mo3876bF();
    }

    /* renamed from: bG */
    public int mo3870bG() {
        return this.f1495oX.mo3877bG();
    }

    /* renamed from: bH */
    public List<String> mo3871bH() {
        return this.f1495oX.mo3878bH();
    }

    /* renamed from: bI */
    public String[] mo3872bI() {
        return (String[]) this.f1495oX.mo3878bH().toArray(new String[0]);
    }

    /* renamed from: bJ */
    public String mo3873bJ() {
        return this.f1495oX.mo3879bJ();
    }

    /* renamed from: bK */
    public View mo3874bK() {
        return this.f1494nu;
    }

    public String getAccountName() {
        return this.f1495oX.getAccountName();
    }
}
