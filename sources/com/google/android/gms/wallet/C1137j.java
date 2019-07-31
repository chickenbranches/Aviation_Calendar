package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;

/* renamed from: com.google.android.gms.wallet.j */
public class C1137j implements Creator<NotifyTransactionStatusRequest> {
    /* renamed from: a */
    static void m3305a(NotifyTransactionStatusRequest notifyTransactionStatusRequest, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m350c(parcel, 1, notifyTransactionStatusRequest.f2819kg);
        C0175b.m339a(parcel, 2, notifyTransactionStatusRequest.f2818Gn, false);
        C0175b.m350c(parcel, 3, notifyTransactionStatusRequest.status);
        C0175b.m339a(parcel, 4, notifyTransactionStatusRequest.f2817GV, false);
        C0175b.m329D(parcel, o);
    }

    /* renamed from: aN */
    public NotifyTransactionStatusRequest createFromParcel(Parcel parcel) {
        String str = null;
        int i = 0;
        int n = C0173a.m313n(parcel);
        String str2 = null;
        int i2 = 0;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            switch (C0173a.m292M(m)) {
                case 1:
                    i2 = C0173a.m305g(parcel, m);
                    break;
                case 2:
                    str2 = C0173a.m312m(parcel, m);
                    break;
                case 3:
                    i = C0173a.m305g(parcel, m);
                    break;
                case 4:
                    str = C0173a.m312m(parcel, m);
                    break;
                default:
                    C0173a.m298b(parcel, m);
                    break;
            }
        }
        if (parcel.dataPosition() == n) {
            return new NotifyTransactionStatusRequest(i2, str2, i, str);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }

    /* renamed from: bF */
    public NotifyTransactionStatusRequest[] newArray(int i) {
        return new NotifyTransactionStatusRequest[i];
    }
}
