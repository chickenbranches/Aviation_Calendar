package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;
import com.google.android.gms.drive.Contents;

/* renamed from: com.google.android.gms.drive.internal.b */
public class C0184b implements Creator<CloseContentsRequest> {
    /* renamed from: a */
    static void m385a(CloseContentsRequest closeContentsRequest, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m350c(parcel, 1, closeContentsRequest.f388kg);
        C0175b.m337a(parcel, 2, (Parcelable) closeContentsRequest.f389qX, i, false);
        C0175b.m338a(parcel, 3, closeContentsRequest.f390qY, false);
        C0175b.m329D(parcel, o);
    }

    /* renamed from: A */
    public CloseContentsRequest createFromParcel(Parcel parcel) {
        Boolean d;
        Contents contents;
        int i;
        Boolean bool = null;
        int n = C0173a.m313n(parcel);
        int i2 = 0;
        Contents contents2 = null;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            switch (C0173a.m292M(m)) {
                case 1:
                    Boolean bool2 = bool;
                    contents = contents2;
                    i = C0173a.m305g(parcel, m);
                    d = bool2;
                    break;
                case 2:
                    i = i2;
                    Contents contents3 = (Contents) C0173a.m294a(parcel, m, Contents.CREATOR);
                    d = bool;
                    contents = contents3;
                    break;
                case 3:
                    d = C0173a.m302d(parcel, m);
                    contents = contents2;
                    i = i2;
                    break;
                default:
                    C0173a.m298b(parcel, m);
                    d = bool;
                    contents = contents2;
                    i = i2;
                    break;
            }
            i2 = i;
            contents2 = contents;
            bool = d;
        }
        if (parcel.dataPosition() == n) {
            return new CloseContentsRequest(i2, contents2, bool);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }

    /* renamed from: aa */
    public CloseContentsRequest[] newArray(int i) {
        return new CloseContentsRequest[i];
    }
}
