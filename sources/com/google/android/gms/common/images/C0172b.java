package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;

/* renamed from: com.google.android.gms.common.images.b */
public class C0172b implements Creator<WebImage> {
    /* renamed from: a */
    static void m288a(WebImage webImage, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m350c(parcel, 1, webImage.getVersionCode());
        C0175b.m337a(parcel, 2, (Parcelable) webImage.getUrl(), i, false);
        C0175b.m350c(parcel, 3, webImage.getWidth());
        C0175b.m350c(parcel, 4, webImage.getHeight());
        C0175b.m329D(parcel, o);
    }

    /* renamed from: G */
    public WebImage[] newArray(int i) {
        return new WebImage[i];
    }

    /* renamed from: k */
    public WebImage createFromParcel(Parcel parcel) {
        int g;
        int i;
        Uri uri;
        int i2;
        int i3 = 0;
        int n = C0173a.m313n(parcel);
        Uri uri2 = null;
        int i4 = 0;
        int i5 = 0;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            switch (C0173a.m292M(m)) {
                case 1:
                    int i6 = i3;
                    i = i4;
                    uri = uri2;
                    i2 = C0173a.m305g(parcel, m);
                    g = i6;
                    break;
                case 2:
                    i2 = i5;
                    int i7 = i4;
                    uri = (Uri) C0173a.m294a(parcel, m, Uri.CREATOR);
                    g = i3;
                    i = i7;
                    break;
                case 3:
                    uri = uri2;
                    i2 = i5;
                    int i8 = i3;
                    i = C0173a.m305g(parcel, m);
                    g = i8;
                    break;
                case 4:
                    g = C0173a.m305g(parcel, m);
                    i = i4;
                    uri = uri2;
                    i2 = i5;
                    break;
                default:
                    C0173a.m298b(parcel, m);
                    g = i3;
                    i = i4;
                    uri = uri2;
                    i2 = i5;
                    break;
            }
            i5 = i2;
            uri2 = uri;
            i4 = i;
            i3 = g;
        }
        if (parcel.dataPosition() == n) {
            return new WebImage(i5, uri2, i4, i3);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }
}
