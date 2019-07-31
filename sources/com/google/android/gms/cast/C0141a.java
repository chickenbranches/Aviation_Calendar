package com.google.android.gms.cast;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;
import java.util.List;

/* renamed from: com.google.android.gms.cast.a */
public class C0141a implements Creator<ApplicationMetadata> {
    /* renamed from: a */
    static void m155a(ApplicationMetadata applicationMetadata, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m350c(parcel, 1, applicationMetadata.getVersionCode());
        C0175b.m339a(parcel, 2, applicationMetadata.getApplicationId(), false);
        C0175b.m339a(parcel, 3, applicationMetadata.getName(), false);
        C0175b.m349b(parcel, 4, applicationMetadata.getImages(), false);
        C0175b.m340a(parcel, 5, applicationMetadata.f131kj, false);
        C0175b.m339a(parcel, 6, applicationMetadata.getSenderAppIdentifier(), false);
        C0175b.m337a(parcel, 7, (Parcelable) applicationMetadata.mo2100aN(), i, false);
        C0175b.m329D(parcel, o);
    }

    /* renamed from: i */
    public ApplicationMetadata createFromParcel(Parcel parcel) {
        Uri uri = null;
        int n = C0173a.m313n(parcel);
        int i = 0;
        String str = null;
        List list = null;
        List list2 = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            switch (C0173a.m292M(m)) {
                case 1:
                    i = C0173a.m305g(parcel, m);
                    break;
                case 2:
                    str3 = C0173a.m312m(parcel, m);
                    break;
                case 3:
                    str2 = C0173a.m312m(parcel, m);
                    break;
                case 4:
                    list2 = C0173a.m300c(parcel, m, WebImage.CREATOR);
                    break;
                case 5:
                    list = C0173a.m325y(parcel, m);
                    break;
                case 6:
                    str = C0173a.m312m(parcel, m);
                    break;
                case 7:
                    uri = (Uri) C0173a.m294a(parcel, m, Uri.CREATOR);
                    break;
                default:
                    C0173a.m298b(parcel, m);
                    break;
            }
        }
        if (parcel.dataPosition() == n) {
            return new ApplicationMetadata(i, str3, str2, list2, list, str, uri);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }

    /* renamed from: q */
    public ApplicationMetadata[] newArray(int i) {
        return new ApplicationMetadata[i];
    }
}
