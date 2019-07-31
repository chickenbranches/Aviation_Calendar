package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;

/* renamed from: com.google.android.gms.internal.ez */
public class C0624ez implements Creator<C0623ey> {
    /* renamed from: a */
    static void m1673a(C0623ey eyVar, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m350c(parcel, 1, eyVar.getVersionCode());
        C0175b.m336a(parcel, 2, eyVar.mo4094cB(), false);
        C0175b.m337a(parcel, 3, (Parcelable) eyVar.mo4095cC(), i, false);
        C0175b.m329D(parcel, o);
    }

    /* renamed from: V */
    public C0623ey[] newArray(int i) {
        return new C0623ey[i];
    }

    /* renamed from: x */
    public C0623ey createFromParcel(Parcel parcel) {
        C0618ev evVar = null;
        int n = C0173a.m313n(parcel);
        int i = 0;
        Parcel parcel2 = null;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            switch (C0173a.m292M(m)) {
                case 1:
                    i = C0173a.m305g(parcel, m);
                    break;
                case 2:
                    parcel2 = C0173a.m326z(parcel, m);
                    break;
                case 3:
                    evVar = (C0618ev) C0173a.m294a(parcel, m, (Creator<T>) C0618ev.CREATOR);
                    break;
                default:
                    C0173a.m298b(parcel, m);
                    break;
            }
        }
        if (parcel.dataPosition() == n) {
            return new C0623ey(i, parcel2, evVar);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }
}
