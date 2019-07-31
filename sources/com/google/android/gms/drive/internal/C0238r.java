package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;
import com.google.android.gms.drive.Contents;

/* renamed from: com.google.android.gms.drive.internal.r */
public class C0238r implements Creator<OnContentsResponse> {
    /* renamed from: a */
    static void m514a(OnContentsResponse onContentsResponse, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m350c(parcel, 1, onContentsResponse.f406kg);
        C0175b.m337a(parcel, 2, (Parcelable) onContentsResponse.f407qK, i, false);
        C0175b.m329D(parcel, o);
    }

    /* renamed from: G */
    public OnContentsResponse createFromParcel(Parcel parcel) {
        int n = C0173a.m313n(parcel);
        int i = 0;
        Contents contents = null;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            switch (C0173a.m292M(m)) {
                case 1:
                    i = C0173a.m305g(parcel, m);
                    break;
                case 2:
                    contents = (Contents) C0173a.m294a(parcel, m, Contents.CREATOR);
                    break;
                default:
                    C0173a.m298b(parcel, m);
                    break;
            }
        }
        if (parcel.dataPosition() == n) {
            return new OnContentsResponse(i, contents);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }

    /* renamed from: ag */
    public OnContentsResponse[] newArray(int i) {
        return new OnContentsResponse[i];
    }
}
