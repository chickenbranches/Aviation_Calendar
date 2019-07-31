package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;
import com.google.android.gms.internal.C0905ig.C0910c;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.im */
public class C0921im implements Creator<C0910c> {
    /* renamed from: a */
    static void m2822a(C0910c cVar, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        Set fa = cVar.mo5071fa();
        if (fa.contains(Integer.valueOf(1))) {
            C0175b.m350c(parcel, 1, cVar.getVersionCode());
        }
        if (fa.contains(Integer.valueOf(2))) {
            C0175b.m339a(parcel, 2, cVar.getUrl(), true);
        }
        C0175b.m329D(parcel, o);
    }

    /* renamed from: az */
    public C0910c createFromParcel(Parcel parcel) {
        int n = C0173a.m313n(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            switch (C0173a.m292M(m)) {
                case 1:
                    i = C0173a.m305g(parcel, m);
                    hashSet.add(Integer.valueOf(1));
                    break;
                case 2:
                    str = C0173a.m312m(parcel, m);
                    hashSet.add(Integer.valueOf(2));
                    break;
                default:
                    C0173a.m298b(parcel, m);
                    break;
            }
        }
        if (parcel.dataPosition() == n) {
            return new C0910c(hashSet, i, str);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }

    /* renamed from: br */
    public C0910c[] newArray(int i) {
        return new C0910c[i];
    }
}
