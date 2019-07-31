package com.google.android.gms.maps;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.util.AttributeSet;
import com.google.android.gms.C0083R;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.internal.C1011a;
import com.google.android.gms.maps.internal.C1056r;
import com.google.android.gms.maps.model.CameraPosition;

public final class GoogleMapOptions implements SafeParcelable {
    public static final GoogleMapOptionsCreator CREATOR = new GoogleMapOptionsCreator();

    /* renamed from: BJ */
    private Boolean f2488BJ;

    /* renamed from: BK */
    private Boolean f2489BK;

    /* renamed from: BL */
    private int f2490BL;

    /* renamed from: BM */
    private CameraPosition f2491BM;

    /* renamed from: BN */
    private Boolean f2492BN;

    /* renamed from: BO */
    private Boolean f2493BO;

    /* renamed from: BP */
    private Boolean f2494BP;

    /* renamed from: BQ */
    private Boolean f2495BQ;

    /* renamed from: BR */
    private Boolean f2496BR;

    /* renamed from: BS */
    private Boolean f2497BS;

    /* renamed from: kg */
    private final int f2498kg;

    public GoogleMapOptions() {
        this.f2490BL = -1;
        this.f2498kg = 1;
    }

    GoogleMapOptions(int versionCode, byte zOrderOnTop, byte useViewLifecycleInFragment, int mapType, CameraPosition camera, byte zoomControlsEnabled, byte compassEnabled, byte scrollGesturesEnabled, byte zoomGesturesEnabled, byte tiltGesturesEnabled, byte rotateGesturesEnabled) {
        this.f2490BL = -1;
        this.f2498kg = versionCode;
        this.f2488BJ = C1011a.m3087a(zOrderOnTop);
        this.f2489BK = C1011a.m3087a(useViewLifecycleInFragment);
        this.f2490BL = mapType;
        this.f2491BM = camera;
        this.f2492BN = C1011a.m3087a(zoomControlsEnabled);
        this.f2493BO = C1011a.m3087a(compassEnabled);
        this.f2494BP = C1011a.m3087a(scrollGesturesEnabled);
        this.f2495BQ = C1011a.m3087a(zoomGesturesEnabled);
        this.f2496BR = C1011a.m3087a(tiltGesturesEnabled);
        this.f2497BS = C1011a.m3087a(rotateGesturesEnabled);
    }

    public static GoogleMapOptions createFromAttributes(Context context, AttributeSet attrs) {
        if (attrs == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attrs, C0083R.styleable.MapAttrs);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        if (obtainAttributes.hasValue(0)) {
            googleMapOptions.mapType(obtainAttributes.getInt(0, -1));
        }
        if (obtainAttributes.hasValue(13)) {
            googleMapOptions.zOrderOnTop(obtainAttributes.getBoolean(13, false));
        }
        if (obtainAttributes.hasValue(12)) {
            googleMapOptions.useViewLifecycleInFragment(obtainAttributes.getBoolean(12, false));
        }
        if (obtainAttributes.hasValue(6)) {
            googleMapOptions.compassEnabled(obtainAttributes.getBoolean(6, true));
        }
        if (obtainAttributes.hasValue(7)) {
            googleMapOptions.rotateGesturesEnabled(obtainAttributes.getBoolean(7, true));
        }
        if (obtainAttributes.hasValue(8)) {
            googleMapOptions.scrollGesturesEnabled(obtainAttributes.getBoolean(8, true));
        }
        if (obtainAttributes.hasValue(9)) {
            googleMapOptions.tiltGesturesEnabled(obtainAttributes.getBoolean(9, true));
        }
        if (obtainAttributes.hasValue(11)) {
            googleMapOptions.zoomGesturesEnabled(obtainAttributes.getBoolean(11, true));
        }
        if (obtainAttributes.hasValue(10)) {
            googleMapOptions.zoomControlsEnabled(obtainAttributes.getBoolean(10, true));
        }
        googleMapOptions.camera(CameraPosition.createFromAttributes(context, attrs));
        obtainAttributes.recycle();
        return googleMapOptions;
    }

    public GoogleMapOptions camera(CameraPosition camera) {
        this.f2491BM = camera;
        return this;
    }

    public GoogleMapOptions compassEnabled(boolean enabled) {
        this.f2493BO = Boolean.valueOf(enabled);
        return this;
    }

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: eo */
    public byte mo5457eo() {
        return C1011a.m3088c(this.f2488BJ);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ep */
    public byte mo5458ep() {
        return C1011a.m3088c(this.f2489BK);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: eq */
    public byte mo5459eq() {
        return C1011a.m3088c(this.f2492BN);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: er */
    public byte mo5460er() {
        return C1011a.m3088c(this.f2493BO);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: es */
    public byte mo5461es() {
        return C1011a.m3088c(this.f2494BP);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: et */
    public byte mo5462et() {
        return C1011a.m3088c(this.f2495BQ);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: eu */
    public byte mo5463eu() {
        return C1011a.m3088c(this.f2496BR);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ev */
    public byte mo5464ev() {
        return C1011a.m3088c(this.f2497BS);
    }

    public CameraPosition getCamera() {
        return this.f2491BM;
    }

    public Boolean getCompassEnabled() {
        return this.f2493BO;
    }

    public int getMapType() {
        return this.f2490BL;
    }

    public Boolean getRotateGesturesEnabled() {
        return this.f2497BS;
    }

    public Boolean getScrollGesturesEnabled() {
        return this.f2494BP;
    }

    public Boolean getTiltGesturesEnabled() {
        return this.f2496BR;
    }

    public Boolean getUseViewLifecycleInFragment() {
        return this.f2489BK;
    }

    /* access modifiers changed from: 0000 */
    public int getVersionCode() {
        return this.f2498kg;
    }

    public Boolean getZOrderOnTop() {
        return this.f2488BJ;
    }

    public Boolean getZoomControlsEnabled() {
        return this.f2492BN;
    }

    public Boolean getZoomGesturesEnabled() {
        return this.f2495BQ;
    }

    public GoogleMapOptions mapType(int mapType) {
        this.f2490BL = mapType;
        return this;
    }

    public GoogleMapOptions rotateGesturesEnabled(boolean enabled) {
        this.f2497BS = Boolean.valueOf(enabled);
        return this;
    }

    public GoogleMapOptions scrollGesturesEnabled(boolean enabled) {
        this.f2494BP = Boolean.valueOf(enabled);
        return this;
    }

    public GoogleMapOptions tiltGesturesEnabled(boolean enabled) {
        this.f2496BR = Boolean.valueOf(enabled);
        return this;
    }

    public GoogleMapOptions useViewLifecycleInFragment(boolean useViewLifecycleInFragment) {
        this.f2489BK = Boolean.valueOf(useViewLifecycleInFragment);
        return this;
    }

    public void writeToParcel(Parcel out, int flags) {
        if (C1056r.m3143eD()) {
            C0996a.m3079a(this, out, flags);
        } else {
            GoogleMapOptionsCreator.m3065a(this, out, flags);
        }
    }

    public GoogleMapOptions zOrderOnTop(boolean zOrderOnTop) {
        this.f2488BJ = Boolean.valueOf(zOrderOnTop);
        return this;
    }

    public GoogleMapOptions zoomControlsEnabled(boolean enabled) {
        this.f2492BN = Boolean.valueOf(enabled);
        return this;
    }

    public GoogleMapOptions zoomGesturesEnabled(boolean enabled) {
        this.f2495BQ = Boolean.valueOf(enabled);
        return this;
    }
}
