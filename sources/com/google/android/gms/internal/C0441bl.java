package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;

/* renamed from: com.google.android.gms.internal.bl */
public class C0441bl implements Creator<C0442bm> {
    /* renamed from: a */
    static void m986a(C0442bm bmVar, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m350c(parcel, 1, bmVar.versionCode);
        C0175b.m337a(parcel, 2, (Parcelable) bmVar.f1187gG, i, false);
        C0175b.m335a(parcel, 3, bmVar.mo3588aa(), false);
        C0175b.m335a(parcel, 4, bmVar.mo3589ab(), false);
        C0175b.m335a(parcel, 5, bmVar.mo3590ac(), false);
        C0175b.m335a(parcel, 6, bmVar.mo3591ad(), false);
        C0175b.m339a(parcel, 7, bmVar.f1192gL, false);
        C0175b.m342a(parcel, 8, bmVar.f1193gM);
        C0175b.m339a(parcel, 9, bmVar.f1194gN, false);
        C0175b.m335a(parcel, 10, bmVar.mo3592ae(), false);
        C0175b.m350c(parcel, 11, bmVar.orientation);
        C0175b.m350c(parcel, 12, bmVar.f1196gP);
        C0175b.m339a(parcel, 13, bmVar.f1197go, false);
        C0175b.m337a(parcel, 14, (Parcelable) bmVar.f1186ej, i, false);
        C0175b.m329D(parcel, o);
    }

    /* renamed from: e */
    public C0442bm createFromParcel(Parcel parcel) {
        int n = C0173a.m313n(parcel);
        int i = 0;
        C0436bj bjVar = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        IBinder iBinder4 = null;
        String str = null;
        boolean z = false;
        String str2 = null;
        IBinder iBinder5 = null;
        int i2 = 0;
        int i3 = 0;
        String str3 = null;
        C0503cu cuVar = null;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            switch (C0173a.m292M(m)) {
                case 1:
                    i = C0173a.m305g(parcel, m);
                    break;
                case 2:
                    bjVar = (C0436bj) C0173a.m294a(parcel, m, (Creator<T>) C0436bj.CREATOR);
                    break;
                case 3:
                    iBinder = C0173a.m314n(parcel, m);
                    break;
                case 4:
                    iBinder2 = C0173a.m314n(parcel, m);
                    break;
                case 5:
                    iBinder3 = C0173a.m314n(parcel, m);
                    break;
                case 6:
                    iBinder4 = C0173a.m314n(parcel, m);
                    break;
                case 7:
                    str = C0173a.m312m(parcel, m);
                    break;
                case 8:
                    z = C0173a.m301c(parcel, m);
                    break;
                case 9:
                    str2 = C0173a.m312m(parcel, m);
                    break;
                case 10:
                    iBinder5 = C0173a.m314n(parcel, m);
                    break;
                case 11:
                    i2 = C0173a.m305g(parcel, m);
                    break;
                case 12:
                    i3 = C0173a.m305g(parcel, m);
                    break;
                case 13:
                    str3 = C0173a.m312m(parcel, m);
                    break;
                case 14:
                    cuVar = (C0503cu) C0173a.m294a(parcel, m, (Creator<T>) C0503cu.CREATOR);
                    break;
                default:
                    C0173a.m298b(parcel, m);
                    break;
            }
        }
        if (parcel.dataPosition() == n) {
            return new C0442bm(i, bjVar, iBinder, iBinder2, iBinder3, iBinder4, str, z, str2, iBinder5, i2, i3, str3, cuVar);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }

    /* renamed from: j */
    public C0442bm[] newArray(int i) {
        return new C0442bm[i];
    }
}
