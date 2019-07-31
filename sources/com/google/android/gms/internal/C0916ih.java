package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.p000v4.util.TimeUtils;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;
import com.google.android.gms.internal.C0905ig.C0906a;
import com.google.android.gms.internal.C0905ig.C0907b;
import com.google.android.gms.internal.C0905ig.C0910c;
import com.google.android.gms.internal.C0905ig.C0911d;
import com.google.android.gms.internal.C0905ig.C0913f;
import com.google.android.gms.internal.C0905ig.C0914g;
import com.google.android.gms.internal.C0905ig.C0915h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ih */
public class C0916ih implements Creator<C0905ig> {
    /* renamed from: a */
    static void m2807a(C0905ig igVar, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        Set fa = igVar.mo4961fa();
        if (fa.contains(Integer.valueOf(1))) {
            C0175b.m350c(parcel, 1, igVar.getVersionCode());
        }
        if (fa.contains(Integer.valueOf(2))) {
            C0175b.m339a(parcel, 2, igVar.getAboutMe(), true);
        }
        if (fa.contains(Integer.valueOf(3))) {
            C0175b.m337a(parcel, 3, (Parcelable) igVar.mo4962fv(), i, true);
        }
        if (fa.contains(Integer.valueOf(4))) {
            C0175b.m339a(parcel, 4, igVar.getBirthday(), true);
        }
        if (fa.contains(Integer.valueOf(5))) {
            C0175b.m339a(parcel, 5, igVar.getBraggingRights(), true);
        }
        if (fa.contains(Integer.valueOf(6))) {
            C0175b.m350c(parcel, 6, igVar.getCircledByCount());
        }
        if (fa.contains(Integer.valueOf(7))) {
            C0175b.m337a(parcel, 7, (Parcelable) igVar.mo4963fw(), i, true);
        }
        if (fa.contains(Integer.valueOf(8))) {
            C0175b.m339a(parcel, 8, igVar.getCurrentLocation(), true);
        }
        if (fa.contains(Integer.valueOf(9))) {
            C0175b.m339a(parcel, 9, igVar.getDisplayName(), true);
        }
        if (fa.contains(Integer.valueOf(12))) {
            C0175b.m350c(parcel, 12, igVar.getGender());
        }
        if (fa.contains(Integer.valueOf(14))) {
            C0175b.m339a(parcel, 14, igVar.getId(), true);
        }
        if (fa.contains(Integer.valueOf(15))) {
            C0175b.m337a(parcel, 15, (Parcelable) igVar.mo4964fx(), i, true);
        }
        if (fa.contains(Integer.valueOf(16))) {
            C0175b.m342a(parcel, 16, igVar.isPlusUser());
        }
        if (fa.contains(Integer.valueOf(19))) {
            C0175b.m337a(parcel, 19, (Parcelable) igVar.mo4965fy(), i, true);
        }
        if (fa.contains(Integer.valueOf(18))) {
            C0175b.m339a(parcel, 18, igVar.getLanguage(), true);
        }
        if (fa.contains(Integer.valueOf(21))) {
            C0175b.m350c(parcel, 21, igVar.getObjectType());
        }
        if (fa.contains(Integer.valueOf(20))) {
            C0175b.m339a(parcel, 20, igVar.getNickname(), true);
        }
        if (fa.contains(Integer.valueOf(23))) {
            C0175b.m349b(parcel, 23, igVar.mo4958fA(), true);
        }
        if (fa.contains(Integer.valueOf(22))) {
            C0175b.m349b(parcel, 22, igVar.mo4966fz(), true);
        }
        if (fa.contains(Integer.valueOf(25))) {
            C0175b.m350c(parcel, 25, igVar.getRelationshipStatus());
        }
        if (fa.contains(Integer.valueOf(24))) {
            C0175b.m350c(parcel, 24, igVar.getPlusOneCount());
        }
        if (fa.contains(Integer.valueOf(27))) {
            C0175b.m339a(parcel, 27, igVar.getUrl(), true);
        }
        if (fa.contains(Integer.valueOf(26))) {
            C0175b.m339a(parcel, 26, igVar.getTagline(), true);
        }
        if (fa.contains(Integer.valueOf(29))) {
            C0175b.m342a(parcel, 29, igVar.isVerified());
        }
        if (fa.contains(Integer.valueOf(28))) {
            C0175b.m349b(parcel, 28, igVar.mo4959fB(), true);
        }
        C0175b.m329D(parcel, o);
    }

    /* renamed from: au */
    public C0905ig createFromParcel(Parcel parcel) {
        int n = C0173a.m313n(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        String str = null;
        C0906a aVar = null;
        String str2 = null;
        String str3 = null;
        int i2 = 0;
        C0907b bVar = null;
        String str4 = null;
        String str5 = null;
        int i3 = 0;
        String str6 = null;
        C0910c cVar = null;
        boolean z = false;
        String str7 = null;
        C0911d dVar = null;
        String str8 = null;
        int i4 = 0;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        int i5 = 0;
        int i6 = 0;
        String str9 = null;
        String str10 = null;
        ArrayList arrayList3 = null;
        boolean z2 = false;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            switch (C0173a.m292M(m)) {
                case 1:
                    i = C0173a.m305g(parcel, m);
                    hashSet.add(Integer.valueOf(1));
                    break;
                case 2:
                    str = C0173a.m312m(parcel, m);
                    hashSet.add(Integer.valueOf(2));
                    break;
                case 3:
                    C0906a aVar2 = (C0906a) C0173a.m294a(parcel, m, (Creator<T>) C0906a.CREATOR);
                    hashSet.add(Integer.valueOf(3));
                    aVar = aVar2;
                    break;
                case 4:
                    str2 = C0173a.m312m(parcel, m);
                    hashSet.add(Integer.valueOf(4));
                    break;
                case 5:
                    str3 = C0173a.m312m(parcel, m);
                    hashSet.add(Integer.valueOf(5));
                    break;
                case 6:
                    i2 = C0173a.m305g(parcel, m);
                    hashSet.add(Integer.valueOf(6));
                    break;
                case 7:
                    C0907b bVar2 = (C0907b) C0173a.m294a(parcel, m, (Creator<T>) C0907b.CREATOR);
                    hashSet.add(Integer.valueOf(7));
                    bVar = bVar2;
                    break;
                case 8:
                    str4 = C0173a.m312m(parcel, m);
                    hashSet.add(Integer.valueOf(8));
                    break;
                case 9:
                    str5 = C0173a.m312m(parcel, m);
                    hashSet.add(Integer.valueOf(9));
                    break;
                case 12:
                    i3 = C0173a.m305g(parcel, m);
                    hashSet.add(Integer.valueOf(12));
                    break;
                case 14:
                    str6 = C0173a.m312m(parcel, m);
                    hashSet.add(Integer.valueOf(14));
                    break;
                case 15:
                    C0910c cVar2 = (C0910c) C0173a.m294a(parcel, m, (Creator<T>) C0910c.CREATOR);
                    hashSet.add(Integer.valueOf(15));
                    cVar = cVar2;
                    break;
                case 16:
                    z = C0173a.m301c(parcel, m);
                    hashSet.add(Integer.valueOf(16));
                    break;
                case 18:
                    str7 = C0173a.m312m(parcel, m);
                    hashSet.add(Integer.valueOf(18));
                    break;
                case TimeUtils.HUNDRED_DAY_FIELD_LEN /*19*/:
                    C0911d dVar2 = (C0911d) C0173a.m294a(parcel, m, (Creator<T>) C0911d.CREATOR);
                    hashSet.add(Integer.valueOf(19));
                    dVar = dVar2;
                    break;
                case 20:
                    str8 = C0173a.m312m(parcel, m);
                    hashSet.add(Integer.valueOf(20));
                    break;
                case 21:
                    i4 = C0173a.m305g(parcel, m);
                    hashSet.add(Integer.valueOf(21));
                    break;
                case 22:
                    arrayList = C0173a.m300c(parcel, m, C0913f.CREATOR);
                    hashSet.add(Integer.valueOf(22));
                    break;
                case 23:
                    arrayList2 = C0173a.m300c(parcel, m, C0914g.CREATOR);
                    hashSet.add(Integer.valueOf(23));
                    break;
                case 24:
                    i5 = C0173a.m305g(parcel, m);
                    hashSet.add(Integer.valueOf(24));
                    break;
                case 25:
                    i6 = C0173a.m305g(parcel, m);
                    hashSet.add(Integer.valueOf(25));
                    break;
                case 26:
                    str9 = C0173a.m312m(parcel, m);
                    hashSet.add(Integer.valueOf(26));
                    break;
                case 27:
                    str10 = C0173a.m312m(parcel, m);
                    hashSet.add(Integer.valueOf(27));
                    break;
                case 28:
                    arrayList3 = C0173a.m300c(parcel, m, C0915h.CREATOR);
                    hashSet.add(Integer.valueOf(28));
                    break;
                case 29:
                    z2 = C0173a.m301c(parcel, m);
                    hashSet.add(Integer.valueOf(29));
                    break;
                default:
                    C0173a.m298b(parcel, m);
                    break;
            }
        }
        if (parcel.dataPosition() == n) {
            return new C0905ig(hashSet, i, str, aVar, str2, str3, i2, bVar, str4, str5, i3, str6, cVar, z, str7, dVar, str8, i4, arrayList, arrayList2, i5, i6, str9, str10, arrayList3, z2);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }

    /* renamed from: bm */
    public C0905ig[] newArray(int i) {
        return new C0905ig[i];
    }
}
