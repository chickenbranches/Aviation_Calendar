package com.google.android.gms.internal;

import android.content.Context;
import android.os.Parcel;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.C0087a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* renamed from: com.google.android.gms.internal.x */
public final class C0964x implements SafeParcelable {
    public static final C0965y CREATOR = new C0965y();

    /* renamed from: eF */
    public final String f2418eF;

    /* renamed from: eG */
    public final boolean f2419eG;

    /* renamed from: eH */
    public final C0964x[] f2420eH;
    public final int height;
    public final int heightPixels;
    public final int versionCode;
    public final int width;
    public final int widthPixels;

    public C0964x() {
        this(2, "interstitial_mb", 0, 0, true, 0, 0, null);
    }

    C0964x(int i, String str, int i2, int i3, boolean z, int i4, int i5, C0964x[] xVarArr) {
        this.versionCode = i;
        this.f2418eF = str;
        this.height = i2;
        this.heightPixels = i3;
        this.f2419eG = z;
        this.width = i4;
        this.widthPixels = i5;
        this.f2420eH = xVarArr;
    }

    public C0964x(Context context, AdSize adSize) {
        this(context, new AdSize[]{adSize});
    }

    public C0964x(Context context, AdSize[] adSizeArr) {
        int i;
        AdSize adSize = adSizeArr[0];
        this.versionCode = 2;
        this.f2419eG = false;
        this.width = adSize.getWidth();
        this.height = adSize.getHeight();
        boolean z = this.width == -1;
        boolean z2 = this.height == -2;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (z) {
            this.widthPixels = m3014a(displayMetrics);
            i = (int) (((float) this.widthPixels) / displayMetrics.density);
        } else {
            int i2 = this.width;
            this.widthPixels = C0501cs.m1141a(displayMetrics, this.width);
            i = i2;
        }
        int i3 = z2 ? m3016c(displayMetrics) : this.height;
        this.heightPixels = C0501cs.m1141a(displayMetrics, i3);
        if (z || z2) {
            this.f2418eF = i + "x" + i3 + "_as";
        } else {
            this.f2418eF = adSize.toString();
        }
        if (adSizeArr.length > 1) {
            this.f2420eH = new C0964x[adSizeArr.length];
            for (int i4 = 0; i4 < adSizeArr.length; i4++) {
                this.f2420eH[i4] = new C0964x(context, adSizeArr[i4]);
            }
            return;
        }
        this.f2420eH = null;
    }

    public C0964x(C0964x xVar, C0964x[] xVarArr) {
        this(2, xVar.f2418eF, xVar.height, xVar.heightPixels, xVar.f2419eG, xVar.width, xVar.widthPixels, xVarArr);
    }

    /* renamed from: a */
    public static int m3014a(DisplayMetrics displayMetrics) {
        return displayMetrics.widthPixels;
    }

    /* renamed from: b */
    public static int m3015b(DisplayMetrics displayMetrics) {
        return (int) (((float) m3016c(displayMetrics)) * displayMetrics.density);
    }

    /* renamed from: c */
    private static int m3016c(DisplayMetrics displayMetrics) {
        int i = (int) (((float) displayMetrics.heightPixels) / displayMetrics.density);
        if (i <= 400) {
            return 32;
        }
        return i <= 720 ? 50 : 90;
    }

    /* renamed from: P */
    public AdSize mo5271P() {
        return C0087a.m18a(this.width, this.height, this.f2418eF);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel out, int flags) {
        C0965y.m3018a(this, out, flags);
    }
}
