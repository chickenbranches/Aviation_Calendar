package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.cast.b */
public class C0142b implements Creator<CastDevice> {
    /* renamed from: a */
    static void m158a(CastDevice castDevice, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m350c(parcel, 1, castDevice.getVersionCode());
        C0175b.m339a(parcel, 2, castDevice.getDeviceId(), false);
        C0175b.m339a(parcel, 3, castDevice.f161kA, false);
        C0175b.m339a(parcel, 4, castDevice.getFriendlyName(), false);
        C0175b.m339a(parcel, 5, castDevice.getModelName(), false);
        C0175b.m339a(parcel, 6, castDevice.getDeviceVersion(), false);
        C0175b.m350c(parcel, 7, castDevice.getServicePort());
        C0175b.m349b(parcel, 8, castDevice.getIcons(), false);
        C0175b.m329D(parcel, o);
    }

    /* renamed from: j */
    public CastDevice createFromParcel(Parcel parcel) {
        int i = 0;
        ArrayList arrayList = null;
        int n = C0173a.m313n(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        int i2 = 0;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            switch (C0173a.m292M(m)) {
                case 1:
                    i2 = C0173a.m305g(parcel, m);
                    break;
                case 2:
                    str5 = C0173a.m312m(parcel, m);
                    break;
                case 3:
                    str4 = C0173a.m312m(parcel, m);
                    break;
                case 4:
                    str3 = C0173a.m312m(parcel, m);
                    break;
                case 5:
                    str2 = C0173a.m312m(parcel, m);
                    break;
                case 6:
                    str = C0173a.m312m(parcel, m);
                    break;
                case 7:
                    i = C0173a.m305g(parcel, m);
                    break;
                case 8:
                    arrayList = C0173a.m300c(parcel, m, WebImage.CREATOR);
                    break;
                default:
                    C0173a.m298b(parcel, m);
                    break;
            }
        }
        if (parcel.dataPosition() == n) {
            return new CastDevice(i2, str5, str4, str3, str2, str, i, arrayList);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }

    /* renamed from: s */
    public CastDevice[] newArray(int i) {
        return new CastDevice[i];
    }
}
