package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;
import com.google.android.gms.internal.C0618ev.C0619a;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ew */
public class C0621ew implements Creator<C0618ev> {
    /* renamed from: a */
    static void m1650a(C0618ev evVar, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m350c(parcel, 1, evVar.getVersionCode());
        C0175b.m349b(parcel, 2, evVar.mo4075cy(), false);
        C0175b.m339a(parcel, 3, evVar.mo4076cz(), false);
        C0175b.m329D(parcel, o);
    }

    /* renamed from: T */
    public C0618ev[] newArray(int i) {
        return new C0618ev[i];
    }

    /* renamed from: v */
    public C0618ev createFromParcel(Parcel parcel) {
        String str = null;
        int n = C0173a.m313n(parcel);
        int i = 0;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            switch (C0173a.m292M(m)) {
                case 1:
                    i = C0173a.m305g(parcel, m);
                    break;
                case 2:
                    arrayList = C0173a.m300c(parcel, m, C0619a.CREATOR);
                    break;
                case 3:
                    str = C0173a.m312m(parcel, m);
                    break;
                default:
                    C0173a.m298b(parcel, m);
                    break;
            }
        }
        if (parcel.dataPosition() == n) {
            return new C0618ev(i, arrayList, str);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }
}
