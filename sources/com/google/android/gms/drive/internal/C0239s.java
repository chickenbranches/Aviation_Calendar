package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;

/* renamed from: com.google.android.gms.drive.internal.s */
public class C0239s implements Creator<OnDownloadProgressResponse> {
    /* renamed from: a */
    static void m517a(OnDownloadProgressResponse onDownloadProgressResponse, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m350c(parcel, 1, onDownloadProgressResponse.f408kg);
        C0175b.m333a(parcel, 2, onDownloadProgressResponse.f409rx);
        C0175b.m333a(parcel, 3, onDownloadProgressResponse.f410ry);
        C0175b.m329D(parcel, o);
    }

    /* renamed from: H */
    public OnDownloadProgressResponse createFromParcel(Parcel parcel) {
        long j = 0;
        int n = C0173a.m313n(parcel);
        int i = 0;
        long j2 = 0;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            switch (C0173a.m292M(m)) {
                case 1:
                    i = C0173a.m305g(parcel, m);
                    break;
                case 2:
                    j2 = C0173a.m306h(parcel, m);
                    break;
                case 3:
                    j = C0173a.m306h(parcel, m);
                    break;
                default:
                    C0173a.m298b(parcel, m);
                    break;
            }
        }
        if (parcel.dataPosition() == n) {
            return new OnDownloadProgressResponse(i, j2, j);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }

    /* renamed from: ah */
    public OnDownloadProgressResponse[] newArray(int i) {
        return new OnDownloadProgressResponse[i];
    }
}
