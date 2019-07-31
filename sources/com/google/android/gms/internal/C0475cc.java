package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.cc */
public class C0475cc implements Creator<C0474cb> {
    /* renamed from: a */
    static void m1057a(C0474cb cbVar, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m350c(parcel, 1, cbVar.versionCode);
        C0175b.m339a(parcel, 2, cbVar.f1256gL, false);
        C0175b.m339a(parcel, 3, cbVar.f1259hw, false);
        C0175b.m340a(parcel, 4, cbVar.f1253fK, false);
        C0175b.m350c(parcel, 5, cbVar.errorCode);
        C0175b.m340a(parcel, 6, cbVar.f1254fL, false);
        C0175b.m333a(parcel, 7, cbVar.f1260hx);
        C0175b.m342a(parcel, 8, cbVar.f1261hy);
        C0175b.m333a(parcel, 9, cbVar.f1262hz);
        C0175b.m340a(parcel, 10, cbVar.f1257hA, false);
        C0175b.m333a(parcel, 11, cbVar.f1255fO);
        C0175b.m350c(parcel, 12, cbVar.orientation);
        C0175b.m339a(parcel, 13, cbVar.f1258hB, false);
        C0175b.m329D(parcel, o);
    }

    /* renamed from: g */
    public C0474cb createFromParcel(Parcel parcel) {
        int n = C0173a.m313n(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        ArrayList arrayList = null;
        int i2 = 0;
        ArrayList arrayList2 = null;
        long j = 0;
        boolean z = false;
        long j2 = 0;
        ArrayList arrayList3 = null;
        long j3 = 0;
        int i3 = 0;
        String str3 = null;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            switch (C0173a.m292M(m)) {
                case 1:
                    i = C0173a.m305g(parcel, m);
                    break;
                case 2:
                    str = C0173a.m312m(parcel, m);
                    break;
                case 3:
                    str2 = C0173a.m312m(parcel, m);
                    break;
                case 4:
                    arrayList = C0173a.m325y(parcel, m);
                    break;
                case 5:
                    i2 = C0173a.m305g(parcel, m);
                    break;
                case 6:
                    arrayList2 = C0173a.m325y(parcel, m);
                    break;
                case 7:
                    j = C0173a.m306h(parcel, m);
                    break;
                case 8:
                    z = C0173a.m301c(parcel, m);
                    break;
                case 9:
                    j2 = C0173a.m306h(parcel, m);
                    break;
                case 10:
                    arrayList3 = C0173a.m325y(parcel, m);
                    break;
                case 11:
                    j3 = C0173a.m306h(parcel, m);
                    break;
                case 12:
                    i3 = C0173a.m305g(parcel, m);
                    break;
                case 13:
                    str3 = C0173a.m312m(parcel, m);
                    break;
                default:
                    C0173a.m298b(parcel, m);
                    break;
            }
        }
        if (parcel.dataPosition() == n) {
            return new C0474cb(i, str, str2, arrayList, i2, arrayList2, j, z, j2, arrayList3, j3, i3, str3);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }

    /* renamed from: l */
    public C0474cb[] newArray(int i) {
        return new C0474cb[i];
    }
}
