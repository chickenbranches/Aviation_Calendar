package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.p000v4.util.TimeUtils;
import com.google.ads.AdSize;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ic */
public class C0901ic implements Creator<C0900ib> {
    /* renamed from: a */
    static void m2708a(C0900ib ibVar, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        Set fa = ibVar.mo4800fa();
        if (fa.contains(Integer.valueOf(1))) {
            C0175b.m350c(parcel, 1, ibVar.getVersionCode());
        }
        if (fa.contains(Integer.valueOf(2))) {
            C0175b.m337a(parcel, 2, (Parcelable) ibVar.mo4801fb(), i, true);
        }
        if (fa.contains(Integer.valueOf(3))) {
            C0175b.m340a(parcel, 3, ibVar.getAdditionalName(), true);
        }
        if (fa.contains(Integer.valueOf(4))) {
            C0175b.m337a(parcel, 4, (Parcelable) ibVar.mo4802fc(), i, true);
        }
        if (fa.contains(Integer.valueOf(5))) {
            C0175b.m339a(parcel, 5, ibVar.getAddressCountry(), true);
        }
        if (fa.contains(Integer.valueOf(6))) {
            C0175b.m339a(parcel, 6, ibVar.getAddressLocality(), true);
        }
        if (fa.contains(Integer.valueOf(7))) {
            C0175b.m339a(parcel, 7, ibVar.getAddressRegion(), true);
        }
        if (fa.contains(Integer.valueOf(8))) {
            C0175b.m349b(parcel, 8, ibVar.mo4803fd(), true);
        }
        if (fa.contains(Integer.valueOf(9))) {
            C0175b.m350c(parcel, 9, ibVar.getAttendeeCount());
        }
        if (fa.contains(Integer.valueOf(10))) {
            C0175b.m349b(parcel, 10, ibVar.mo4804fe(), true);
        }
        if (fa.contains(Integer.valueOf(11))) {
            C0175b.m337a(parcel, 11, (Parcelable) ibVar.mo4805ff(), i, true);
        }
        if (fa.contains(Integer.valueOf(12))) {
            C0175b.m349b(parcel, 12, ibVar.mo4806fg(), true);
        }
        if (fa.contains(Integer.valueOf(13))) {
            C0175b.m339a(parcel, 13, ibVar.getBestRating(), true);
        }
        if (fa.contains(Integer.valueOf(14))) {
            C0175b.m339a(parcel, 14, ibVar.getBirthDate(), true);
        }
        if (fa.contains(Integer.valueOf(15))) {
            C0175b.m337a(parcel, 15, (Parcelable) ibVar.mo4807fh(), i, true);
        }
        if (fa.contains(Integer.valueOf(17))) {
            C0175b.m339a(parcel, 17, ibVar.getContentSize(), true);
        }
        if (fa.contains(Integer.valueOf(16))) {
            C0175b.m339a(parcel, 16, ibVar.getCaption(), true);
        }
        if (fa.contains(Integer.valueOf(19))) {
            C0175b.m349b(parcel, 19, ibVar.mo4808fi(), true);
        }
        if (fa.contains(Integer.valueOf(18))) {
            C0175b.m339a(parcel, 18, ibVar.getContentUrl(), true);
        }
        if (fa.contains(Integer.valueOf(21))) {
            C0175b.m339a(parcel, 21, ibVar.getDateModified(), true);
        }
        if (fa.contains(Integer.valueOf(20))) {
            C0175b.m339a(parcel, 20, ibVar.getDateCreated(), true);
        }
        if (fa.contains(Integer.valueOf(23))) {
            C0175b.m339a(parcel, 23, ibVar.getDescription(), true);
        }
        if (fa.contains(Integer.valueOf(22))) {
            C0175b.m339a(parcel, 22, ibVar.getDatePublished(), true);
        }
        if (fa.contains(Integer.valueOf(25))) {
            C0175b.m339a(parcel, 25, ibVar.getEmbedUrl(), true);
        }
        if (fa.contains(Integer.valueOf(24))) {
            C0175b.m339a(parcel, 24, ibVar.getDuration(), true);
        }
        if (fa.contains(Integer.valueOf(27))) {
            C0175b.m339a(parcel, 27, ibVar.getFamilyName(), true);
        }
        if (fa.contains(Integer.valueOf(26))) {
            C0175b.m339a(parcel, 26, ibVar.getEndDate(), true);
        }
        if (fa.contains(Integer.valueOf(29))) {
            C0175b.m337a(parcel, 29, (Parcelable) ibVar.mo4809fj(), i, true);
        }
        if (fa.contains(Integer.valueOf(28))) {
            C0175b.m339a(parcel, 28, ibVar.getGender(), true);
        }
        if (fa.contains(Integer.valueOf(31))) {
            C0175b.m339a(parcel, 31, ibVar.getHeight(), true);
        }
        if (fa.contains(Integer.valueOf(30))) {
            C0175b.m339a(parcel, 30, ibVar.getGivenName(), true);
        }
        if (fa.contains(Integer.valueOf(34))) {
            C0175b.m337a(parcel, 34, (Parcelable) ibVar.mo4810fk(), i, true);
        }
        if (fa.contains(Integer.valueOf(32))) {
            C0175b.m339a(parcel, 32, ibVar.getId(), true);
        }
        if (fa.contains(Integer.valueOf(33))) {
            C0175b.m339a(parcel, 33, ibVar.getImage(), true);
        }
        if (fa.contains(Integer.valueOf(38))) {
            C0175b.m331a(parcel, 38, ibVar.getLongitude());
        }
        if (fa.contains(Integer.valueOf(39))) {
            C0175b.m339a(parcel, 39, ibVar.getName(), true);
        }
        if (fa.contains(Integer.valueOf(36))) {
            C0175b.m331a(parcel, 36, ibVar.getLatitude());
        }
        if (fa.contains(Integer.valueOf(37))) {
            C0175b.m337a(parcel, 37, (Parcelable) ibVar.mo4811fl(), i, true);
        }
        if (fa.contains(Integer.valueOf(42))) {
            C0175b.m339a(parcel, 42, ibVar.getPlayerType(), true);
        }
        if (fa.contains(Integer.valueOf(43))) {
            C0175b.m339a(parcel, 43, ibVar.getPostOfficeBoxNumber(), true);
        }
        if (fa.contains(Integer.valueOf(40))) {
            C0175b.m337a(parcel, 40, (Parcelable) ibVar.mo4812fm(), i, true);
        }
        if (fa.contains(Integer.valueOf(41))) {
            C0175b.m349b(parcel, 41, ibVar.mo4813fn(), true);
        }
        if (fa.contains(Integer.valueOf(46))) {
            C0175b.m337a(parcel, 46, (Parcelable) ibVar.mo4814fo(), i, true);
        }
        if (fa.contains(Integer.valueOf(47))) {
            C0175b.m339a(parcel, 47, ibVar.getStartDate(), true);
        }
        if (fa.contains(Integer.valueOf(44))) {
            C0175b.m339a(parcel, 44, ibVar.getPostalCode(), true);
        }
        if (fa.contains(Integer.valueOf(45))) {
            C0175b.m339a(parcel, 45, ibVar.getRatingValue(), true);
        }
        if (fa.contains(Integer.valueOf(51))) {
            C0175b.m339a(parcel, 51, ibVar.getThumbnailUrl(), true);
        }
        if (fa.contains(Integer.valueOf(50))) {
            C0175b.m337a(parcel, 50, (Parcelable) ibVar.mo4815fp(), i, true);
        }
        if (fa.contains(Integer.valueOf(49))) {
            C0175b.m339a(parcel, 49, ibVar.getText(), true);
        }
        if (fa.contains(Integer.valueOf(48))) {
            C0175b.m339a(parcel, 48, ibVar.getStreetAddress(), true);
        }
        if (fa.contains(Integer.valueOf(55))) {
            C0175b.m339a(parcel, 55, ibVar.getWidth(), true);
        }
        if (fa.contains(Integer.valueOf(54))) {
            C0175b.m339a(parcel, 54, ibVar.getUrl(), true);
        }
        if (fa.contains(Integer.valueOf(53))) {
            C0175b.m339a(parcel, 53, ibVar.getType(), true);
        }
        if (fa.contains(Integer.valueOf(52))) {
            C0175b.m339a(parcel, 52, ibVar.getTickerSymbol(), true);
        }
        if (fa.contains(Integer.valueOf(56))) {
            C0175b.m339a(parcel, 56, ibVar.getWorstRating(), true);
        }
        C0175b.m329D(parcel, o);
    }

    /* renamed from: as */
    public C0900ib createFromParcel(Parcel parcel) {
        int n = C0173a.m313n(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        C0900ib ibVar = null;
        ArrayList arrayList = null;
        C0900ib ibVar2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        ArrayList arrayList2 = null;
        int i2 = 0;
        ArrayList arrayList3 = null;
        C0900ib ibVar3 = null;
        ArrayList arrayList4 = null;
        String str4 = null;
        String str5 = null;
        C0900ib ibVar4 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        ArrayList arrayList5 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        String str15 = null;
        String str16 = null;
        String str17 = null;
        C0900ib ibVar5 = null;
        String str18 = null;
        String str19 = null;
        String str20 = null;
        String str21 = null;
        C0900ib ibVar6 = null;
        double d = 0.0d;
        C0900ib ibVar7 = null;
        double d2 = 0.0d;
        String str22 = null;
        C0900ib ibVar8 = null;
        ArrayList arrayList6 = null;
        String str23 = null;
        String str24 = null;
        String str25 = null;
        String str26 = null;
        C0900ib ibVar9 = null;
        String str27 = null;
        String str28 = null;
        String str29 = null;
        C0900ib ibVar10 = null;
        String str30 = null;
        String str31 = null;
        String str32 = null;
        String str33 = null;
        String str34 = null;
        String str35 = null;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            switch (C0173a.m292M(m)) {
                case 1:
                    i = C0173a.m305g(parcel, m);
                    hashSet.add(Integer.valueOf(1));
                    break;
                case 2:
                    C0900ib ibVar11 = (C0900ib) C0173a.m294a(parcel, m, (Creator<T>) C0900ib.CREATOR);
                    hashSet.add(Integer.valueOf(2));
                    ibVar = ibVar11;
                    break;
                case 3:
                    arrayList = C0173a.m325y(parcel, m);
                    hashSet.add(Integer.valueOf(3));
                    break;
                case 4:
                    C0900ib ibVar12 = (C0900ib) C0173a.m294a(parcel, m, (Creator<T>) C0900ib.CREATOR);
                    hashSet.add(Integer.valueOf(4));
                    ibVar2 = ibVar12;
                    break;
                case 5:
                    str = C0173a.m312m(parcel, m);
                    hashSet.add(Integer.valueOf(5));
                    break;
                case 6:
                    str2 = C0173a.m312m(parcel, m);
                    hashSet.add(Integer.valueOf(6));
                    break;
                case 7:
                    str3 = C0173a.m312m(parcel, m);
                    hashSet.add(Integer.valueOf(7));
                    break;
                case 8:
                    arrayList2 = C0173a.m300c(parcel, m, C0900ib.CREATOR);
                    hashSet.add(Integer.valueOf(8));
                    break;
                case 9:
                    i2 = C0173a.m305g(parcel, m);
                    hashSet.add(Integer.valueOf(9));
                    break;
                case 10:
                    arrayList3 = C0173a.m300c(parcel, m, C0900ib.CREATOR);
                    hashSet.add(Integer.valueOf(10));
                    break;
                case 11:
                    C0900ib ibVar13 = (C0900ib) C0173a.m294a(parcel, m, (Creator<T>) C0900ib.CREATOR);
                    hashSet.add(Integer.valueOf(11));
                    ibVar3 = ibVar13;
                    break;
                case 12:
                    arrayList4 = C0173a.m300c(parcel, m, C0900ib.CREATOR);
                    hashSet.add(Integer.valueOf(12));
                    break;
                case 13:
                    str4 = C0173a.m312m(parcel, m);
                    hashSet.add(Integer.valueOf(13));
                    break;
                case 14:
                    str5 = C0173a.m312m(parcel, m);
                    hashSet.add(Integer.valueOf(14));
                    break;
                case 15:
                    C0900ib ibVar14 = (C0900ib) C0173a.m294a(parcel, m, (Creator<T>) C0900ib.CREATOR);
                    hashSet.add(Integer.valueOf(15));
                    ibVar4 = ibVar14;
                    break;
                case 16:
                    str6 = C0173a.m312m(parcel, m);
                    hashSet.add(Integer.valueOf(16));
                    break;
                case 17:
                    str7 = C0173a.m312m(parcel, m);
                    hashSet.add(Integer.valueOf(17));
                    break;
                case 18:
                    str8 = C0173a.m312m(parcel, m);
                    hashSet.add(Integer.valueOf(18));
                    break;
                case TimeUtils.HUNDRED_DAY_FIELD_LEN /*19*/:
                    arrayList5 = C0173a.m300c(parcel, m, C0900ib.CREATOR);
                    hashSet.add(Integer.valueOf(19));
                    break;
                case 20:
                    str9 = C0173a.m312m(parcel, m);
                    hashSet.add(Integer.valueOf(20));
                    break;
                case 21:
                    str10 = C0173a.m312m(parcel, m);
                    hashSet.add(Integer.valueOf(21));
                    break;
                case 22:
                    str11 = C0173a.m312m(parcel, m);
                    hashSet.add(Integer.valueOf(22));
                    break;
                case 23:
                    str12 = C0173a.m312m(parcel, m);
                    hashSet.add(Integer.valueOf(23));
                    break;
                case 24:
                    str13 = C0173a.m312m(parcel, m);
                    hashSet.add(Integer.valueOf(24));
                    break;
                case 25:
                    str14 = C0173a.m312m(parcel, m);
                    hashSet.add(Integer.valueOf(25));
                    break;
                case 26:
                    str15 = C0173a.m312m(parcel, m);
                    hashSet.add(Integer.valueOf(26));
                    break;
                case 27:
                    str16 = C0173a.m312m(parcel, m);
                    hashSet.add(Integer.valueOf(27));
                    break;
                case 28:
                    str17 = C0173a.m312m(parcel, m);
                    hashSet.add(Integer.valueOf(28));
                    break;
                case 29:
                    C0900ib ibVar15 = (C0900ib) C0173a.m294a(parcel, m, (Creator<T>) C0900ib.CREATOR);
                    hashSet.add(Integer.valueOf(29));
                    ibVar5 = ibVar15;
                    break;
                case 30:
                    str18 = C0173a.m312m(parcel, m);
                    hashSet.add(Integer.valueOf(30));
                    break;
                case 31:
                    str19 = C0173a.m312m(parcel, m);
                    hashSet.add(Integer.valueOf(31));
                    break;
                case 32:
                    str20 = C0173a.m312m(parcel, m);
                    hashSet.add(Integer.valueOf(32));
                    break;
                case 33:
                    str21 = C0173a.m312m(parcel, m);
                    hashSet.add(Integer.valueOf(33));
                    break;
                case 34:
                    C0900ib ibVar16 = (C0900ib) C0173a.m294a(parcel, m, (Creator<T>) C0900ib.CREATOR);
                    hashSet.add(Integer.valueOf(34));
                    ibVar6 = ibVar16;
                    break;
                case 36:
                    d = C0173a.m309k(parcel, m);
                    hashSet.add(Integer.valueOf(36));
                    break;
                case 37:
                    C0900ib ibVar17 = (C0900ib) C0173a.m294a(parcel, m, (Creator<T>) C0900ib.CREATOR);
                    hashSet.add(Integer.valueOf(37));
                    ibVar7 = ibVar17;
                    break;
                case 38:
                    d2 = C0173a.m309k(parcel, m);
                    hashSet.add(Integer.valueOf(38));
                    break;
                case 39:
                    str22 = C0173a.m312m(parcel, m);
                    hashSet.add(Integer.valueOf(39));
                    break;
                case 40:
                    C0900ib ibVar18 = (C0900ib) C0173a.m294a(parcel, m, (Creator<T>) C0900ib.CREATOR);
                    hashSet.add(Integer.valueOf(40));
                    ibVar8 = ibVar18;
                    break;
                case 41:
                    arrayList6 = C0173a.m300c(parcel, m, C0900ib.CREATOR);
                    hashSet.add(Integer.valueOf(41));
                    break;
                case 42:
                    str23 = C0173a.m312m(parcel, m);
                    hashSet.add(Integer.valueOf(42));
                    break;
                case 43:
                    str24 = C0173a.m312m(parcel, m);
                    hashSet.add(Integer.valueOf(43));
                    break;
                case 44:
                    str25 = C0173a.m312m(parcel, m);
                    hashSet.add(Integer.valueOf(44));
                    break;
                case 45:
                    str26 = C0173a.m312m(parcel, m);
                    hashSet.add(Integer.valueOf(45));
                    break;
                case 46:
                    C0900ib ibVar19 = (C0900ib) C0173a.m294a(parcel, m, (Creator<T>) C0900ib.CREATOR);
                    hashSet.add(Integer.valueOf(46));
                    ibVar9 = ibVar19;
                    break;
                case 47:
                    str27 = C0173a.m312m(parcel, m);
                    hashSet.add(Integer.valueOf(47));
                    break;
                case 48:
                    str28 = C0173a.m312m(parcel, m);
                    hashSet.add(Integer.valueOf(48));
                    break;
                case 49:
                    str29 = C0173a.m312m(parcel, m);
                    hashSet.add(Integer.valueOf(49));
                    break;
                case AdSize.PORTRAIT_AD_HEIGHT /*50*/:
                    C0900ib ibVar20 = (C0900ib) C0173a.m294a(parcel, m, (Creator<T>) C0900ib.CREATOR);
                    hashSet.add(Integer.valueOf(50));
                    ibVar10 = ibVar20;
                    break;
                case 51:
                    str30 = C0173a.m312m(parcel, m);
                    hashSet.add(Integer.valueOf(51));
                    break;
                case 52:
                    str31 = C0173a.m312m(parcel, m);
                    hashSet.add(Integer.valueOf(52));
                    break;
                case 53:
                    str32 = C0173a.m312m(parcel, m);
                    hashSet.add(Integer.valueOf(53));
                    break;
                case 54:
                    str33 = C0173a.m312m(parcel, m);
                    hashSet.add(Integer.valueOf(54));
                    break;
                case 55:
                    str34 = C0173a.m312m(parcel, m);
                    hashSet.add(Integer.valueOf(55));
                    break;
                case 56:
                    str35 = C0173a.m312m(parcel, m);
                    hashSet.add(Integer.valueOf(56));
                    break;
                default:
                    C0173a.m298b(parcel, m);
                    break;
            }
        }
        if (parcel.dataPosition() == n) {
            return new C0900ib(hashSet, i, ibVar, arrayList, ibVar2, str, str2, str3, arrayList2, i2, arrayList3, ibVar3, arrayList4, str4, str5, ibVar4, str6, str7, str8, arrayList5, str9, str10, str11, str12, str13, str14, str15, str16, str17, ibVar5, str18, str19, str20, str21, ibVar6, d, ibVar7, d2, str22, ibVar8, arrayList6, str23, str24, str25, str26, ibVar9, str27, str28, str29, ibVar10, str30, str31, str32, str33, str34, str35);
        }
        throw new C0174a("Overread allowed size end=" + n, parcel);
    }

    /* renamed from: bk */
    public C0900ib[] newArray(int i) {
        return new C0900ib[i];
    }
}
