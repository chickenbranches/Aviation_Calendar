package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;

/* renamed from: com.google.android.gms.drive.internal.u */
public class C0241u implements Creator<OnListEntriesResponse> {
    /* renamed from: a */
    static void m523a(OnListEntriesResponse onListEntriesResponse, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m350c(parcel, 1, onListEntriesResponse.f413kg);
        C0175b.m337a(parcel, 2, (Parcelable) onListEntriesResponse.f414rz, i, false);
        C0175b.m329D(parcel, o);
    }

    /* renamed from: J */
    public OnListEntriesResponse createFromParcel(Parcel parcel) {
        int n = C0173a.m313n(parcel);
        int i = 0;
        DataHolder dataHolder = null;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            switch (C0173a.m292M(m)) {
                case 1:
                    i = C0173a.m305g(parcel, m);
                    break;
                case 2:
                    dataHolder = (DataHolder) C0173a.m294a(parcel, m, (Creator<T>) DataHolder.CREATOR);
                    break;
                default:
                    C0173a.m298b(parcel, m);
                    break;
            }
        }
        if (parcel.dataPosition() == n) {
            return new OnListEntriesResponse(i, dataHolder);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }

    /* renamed from: aj */
    public OnListEntriesResponse[] newArray(int i) {
        return new OnListEntriesResponse[i];
    }
}
