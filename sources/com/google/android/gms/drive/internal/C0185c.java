package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;

/* renamed from: com.google.android.gms.drive.internal.c */
public class C0185c implements Creator<CreateContentsRequest> {
    /* renamed from: a */
    static void m388a(CreateContentsRequest createContentsRequest, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m350c(parcel, 1, createContentsRequest.f391kg);
        C0175b.m329D(parcel, o);
    }

    /* renamed from: B */
    public CreateContentsRequest createFromParcel(Parcel parcel) {
        int n = C0173a.m313n(parcel);
        int i = 0;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            switch (C0173a.m292M(m)) {
                case 1:
                    i = C0173a.m305g(parcel, m);
                    break;
                default:
                    C0173a.m298b(parcel, m);
                    break;
            }
        }
        if (parcel.dataPosition() == n) {
            return new CreateContentsRequest(i);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }

    /* renamed from: ab */
    public CreateContentsRequest[] newArray(int i) {
        return new CreateContentsRequest[i];
    }
}
