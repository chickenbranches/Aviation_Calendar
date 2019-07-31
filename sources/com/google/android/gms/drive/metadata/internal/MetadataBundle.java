package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.internal.C0596ee;
import com.google.android.gms.internal.C0600eg;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class MetadataBundle implements SafeParcelable {
    public static final Creator<MetadataBundle> CREATOR = new C0250d();

    /* renamed from: kg */
    final int f494kg;

    /* renamed from: rF */
    final Bundle f495rF;

    MetadataBundle(int versionCode, Bundle valueBundle) {
        this.f494kg = versionCode;
        this.f495rF = (Bundle) C0600eg.m1554f(valueBundle);
        this.f495rF.setClassLoader(getClass().getClassLoader());
        ArrayList<String> arrayList = new ArrayList<>();
        for (String str : this.f495rF.keySet()) {
            if (C0249c.m573ac(str) == null) {
                arrayList.add(str);
                Log.w("MetadataBundle", "Ignored unknown metadata field in bundle: " + str);
            }
        }
        for (String remove : arrayList) {
            this.f495rF.remove(remove);
        }
    }

    private MetadataBundle(Bundle valueBundle) {
        this(1, valueBundle);
    }

    /* renamed from: a */
    public static <T> MetadataBundle m555a(MetadataField<T> metadataField, T t) {
        MetadataBundle cX = m557cX();
        cX.mo2727b(metadataField, t);
        return cX;
    }

    /* renamed from: a */
    public static MetadataBundle m556a(MetadataBundle metadataBundle) {
        return new MetadataBundle(new Bundle(metadataBundle.f495rF));
    }

    /* renamed from: cX */
    public static MetadataBundle m557cX() {
        return new MetadataBundle(new Bundle());
    }

    /* renamed from: a */
    public <T> T mo2726a(MetadataField<T> metadataField) {
        return metadataField.mo2719d(this.f495rF);
    }

    /* renamed from: b */
    public <T> void mo2727b(MetadataField<T> metadataField, T t) {
        if (C0249c.m573ac(metadataField.getName()) == null) {
            throw new IllegalArgumentException("Unregistered field: " + metadataField.getName());
        }
        metadataField.mo2716a(t, this.f495rF);
    }

    /* renamed from: cY */
    public Set<MetadataField<?>> mo2728cY() {
        HashSet hashSet = new HashSet();
        for (String ac : this.f495rF.keySet()) {
            hashSet.add(C0249c.m573ac(ac));
        }
        return hashSet;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MetadataBundle)) {
            return false;
        }
        MetadataBundle metadataBundle = (MetadataBundle) obj;
        Set<String> keySet = this.f495rF.keySet();
        if (!keySet.equals(metadataBundle.f495rF.keySet())) {
            return false;
        }
        for (String str : keySet) {
            if (!C0596ee.equal(this.f495rF.get(str), metadataBundle.f495rF.get(str))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 1;
        Iterator it = this.f495rF.keySet().iterator();
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                return i2;
            }
            int i3 = i2 * 31;
            i = this.f495rF.get((String) it.next()).hashCode() + i3;
        }
    }

    public String toString() {
        return "MetadataBundle [values=" + this.f495rF + "]";
    }

    public void writeToParcel(Parcel dest, int flags) {
        C0250d.m576a(this, dest, flags);
    }
}
