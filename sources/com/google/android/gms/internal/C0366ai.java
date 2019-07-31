package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* renamed from: com.google.android.gms.internal.ai */
public final class C0366ai implements SafeParcelable {
    public static final C0367aj CREATOR = new C0367aj();
    public final int backgroundColor;

    /* renamed from: eZ */
    public final int f874eZ;

    /* renamed from: fa */
    public final int f875fa;

    /* renamed from: fb */
    public final int f876fb;

    /* renamed from: fc */
    public final int f877fc;

    /* renamed from: fd */
    public final int f878fd;

    /* renamed from: fe */
    public final int f879fe;

    /* renamed from: ff */
    public final int f880ff;

    /* renamed from: fg */
    public final String f881fg;

    /* renamed from: fh */
    public final int f882fh;

    /* renamed from: fi */
    public final String f883fi;

    /* renamed from: fj */
    public final int f884fj;

    /* renamed from: fk */
    public final int f885fk;

    /* renamed from: fl */
    public final String f886fl;
    public final int versionCode;

    C0366ai(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, String str, int i10, String str2, int i11, int i12, String str3) {
        this.versionCode = i;
        this.f874eZ = i2;
        this.backgroundColor = i3;
        this.f875fa = i4;
        this.f876fb = i5;
        this.f877fc = i6;
        this.f878fd = i7;
        this.f879fe = i8;
        this.f880ff = i9;
        this.f881fg = str;
        this.f882fh = i10;
        this.f883fi = str2;
        this.f884fj = i11;
        this.f885fk = i12;
        this.f886fl = str3;
    }

    public C0366ai(SearchAdRequest searchAdRequest) {
        this.versionCode = 1;
        this.f874eZ = searchAdRequest.getAnchorTextColor();
        this.backgroundColor = searchAdRequest.getBackgroundColor();
        this.f875fa = searchAdRequest.getBackgroundGradientBottom();
        this.f876fb = searchAdRequest.getBackgroundGradientTop();
        this.f877fc = searchAdRequest.getBorderColor();
        this.f878fd = searchAdRequest.getBorderThickness();
        this.f879fe = searchAdRequest.getBorderType();
        this.f880ff = searchAdRequest.getCallButtonColor();
        this.f881fg = searchAdRequest.getCustomChannels();
        this.f882fh = searchAdRequest.getDescriptionTextColor();
        this.f883fi = searchAdRequest.getFontFace();
        this.f884fj = searchAdRequest.getHeaderTextColor();
        this.f885fk = searchAdRequest.getHeaderTextSize();
        this.f886fl = searchAdRequest.getQuery();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel out, int flags) {
        C0367aj.m882a(this, out, flags);
    }
}
