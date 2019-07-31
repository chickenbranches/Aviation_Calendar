package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ie */
public class C0903ie implements Creator<C0902id> {
    /* renamed from: a */
    static void m2720a(C0902id idVar, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        Set fa = idVar.mo4934fa();
        if (fa.contains(Integer.valueOf(1))) {
            C0175b.m350c(parcel, 1, idVar.getVersionCode());
        }
        if (fa.contains(Integer.valueOf(2))) {
            C0175b.m339a(parcel, 2, idVar.getId(), true);
        }
        if (fa.contains(Integer.valueOf(4))) {
            C0175b.m337a(parcel, 4, (Parcelable) idVar.mo4935fr(), i, true);
        }
        if (fa.contains(Integer.valueOf(5))) {
            C0175b.m339a(parcel, 5, idVar.getStartDate(), true);
        }
        if (fa.contains(Integer.valueOf(6))) {
            C0175b.m337a(parcel, 6, (Parcelable) idVar.mo4936fs(), i, true);
        }
        if (fa.contains(Integer.valueOf(7))) {
            C0175b.m339a(parcel, 7, idVar.getType(), true);
        }
        C0175b.m329D(parcel, o);
    }

    /* renamed from: at */
    public C0902id createFromParcel(Parcel parcel) {
        String str = null;
        int n = C0173a.m313n(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        C0900ib ibVar = null;
        String str2 = null;
        C0900ib ibVar2 = null;
        String str3 = null;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            switch (C0173a.m292M(m)) {
                case 1:
                    i = C0173a.m305g(parcel, m);
                    hashSet.add(Integer.valueOf(1));
                    break;
                case 2:
                    str3 = C0173a.m312m(parcel, m);
                    hashSet.add(Integer.valueOf(2));
                    break;
                case 4:
                    C0900ib ibVar3 = (C0900ib) C0173a.m294a(parcel, m, (Creator<T>) C0900ib.CREATOR);
                    hashSet.add(Integer.valueOf(4));
                    ibVar2 = ibVar3;
                    break;
                case 5:
                    str2 = C0173a.m312m(parcel, m);
                    hashSet.add(Integer.valueOf(5));
                    break;
                case 6:
                    C0900ib ibVar4 = (C0900ib) C0173a.m294a(parcel, m, (Creator<T>) C0900ib.CREATOR);
                    hashSet.add(Integer.valueOf(6));
                    ibVar = ibVar4;
                    break;
                case 7:
                    str = C0173a.m312m(parcel, m);
                    hashSet.add(Integer.valueOf(7));
                    break;
                default:
                    C0173a.m298b(parcel, m);
                    break;
            }
        }
        if (parcel.dataPosition() == n) {
            return new C0902id(hashSet, i, str3, ibVar2, str2, ibVar, str);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }

    /* renamed from: bl */
    public C0902id[] newArray(int i) {
        return new C0902id[i];
    }
}
