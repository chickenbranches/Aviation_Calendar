package com.google.android.gms.internal;

import com.google.ads.AdRequest.ErrorCode;
import com.google.ads.AdRequest.Gender;
import com.google.ads.AdSize;
import com.google.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.C0087a;
import java.util.Date;
import java.util.HashSet;

/* renamed from: com.google.android.gms.internal.bg */
public final class C0432bg {
    /* renamed from: a */
    public static int m963a(ErrorCode errorCode) {
        switch (errorCode) {
            case INVALID_REQUEST:
                return 1;
            case NETWORK_ERROR:
                return 2;
            case NO_FILL:
                return 3;
            default:
                return 0;
        }
    }

    /* renamed from: a */
    public static int m964a(Gender gender) {
        switch (gender) {
            case FEMALE:
                return 2;
            case MALE:
                return 1;
            default:
                return 0;
        }
    }

    /* renamed from: b */
    public static AdSize m965b(C0964x xVar) {
        return new AdSize(C0087a.m18a(xVar.width, xVar.height, xVar.f2418eF));
    }

    /* renamed from: e */
    public static MediationAdRequest m966e(C0962v vVar) {
        return new MediationAdRequest(new Date(vVar.f2415ex), m967g(vVar.f2416ey), vVar.f2417ez != null ? new HashSet(vVar.f2417ez) : null, vVar.f2410eA);
    }

    /* renamed from: g */
    public static Gender m967g(int i) {
        switch (i) {
            case 1:
                return Gender.MALE;
            case 2:
                return Gender.FEMALE;
            default:
                return Gender.UNKNOWN;
        }
    }

    /* renamed from: h */
    public static final ErrorCode m968h(int i) {
        switch (i) {
            case 1:
                return ErrorCode.INVALID_REQUEST;
            case 2:
                return ErrorCode.NETWORK_ERROR;
            case 3:
                return ErrorCode.NO_FILL;
            default:
                return ErrorCode.INTERNAL_ERROR;
        }
    }
}
