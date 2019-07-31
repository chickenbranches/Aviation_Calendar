package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.C0270b.C0271a;
import com.google.android.gms.internal.C0600eg;
import com.google.android.gms.maps.internal.C1056r;

public final class GroundOverlayOptions implements SafeParcelable {
    public static final GroundOverlayOptionsCreator CREATOR = new GroundOverlayOptionsCreator();
    public static final float NO_DIMENSION = -1.0f;

    /* renamed from: CA */
    private LatLng f2564CA;

    /* renamed from: CB */
    private float f2565CB;

    /* renamed from: CC */
    private float f2566CC;

    /* renamed from: CD */
    private LatLngBounds f2567CD;

    /* renamed from: CE */
    private float f2568CE;

    /* renamed from: CF */
    private float f2569CF;

    /* renamed from: CG */
    private float f2570CG;

    /* renamed from: Cp */
    private float f2571Cp;

    /* renamed from: Cw */
    private float f2572Cw;

    /* renamed from: Cx */
    private boolean f2573Cx;

    /* renamed from: Cz */
    private BitmapDescriptor f2574Cz;

    /* renamed from: kg */
    private final int f2575kg;

    public GroundOverlayOptions() {
        this.f2573Cx = true;
        this.f2568CE = 0.0f;
        this.f2569CF = 0.5f;
        this.f2570CG = 0.5f;
        this.f2575kg = 1;
    }

    GroundOverlayOptions(int versionCode, IBinder wrappedImage, LatLng location, float width, float height, LatLngBounds bounds, float bearing, float zIndex, boolean visible, float transparency, float anchorU, float anchorV) {
        this.f2573Cx = true;
        this.f2568CE = 0.0f;
        this.f2569CF = 0.5f;
        this.f2570CG = 0.5f;
        this.f2575kg = versionCode;
        this.f2574Cz = new BitmapDescriptor(C0271a.m632E(wrappedImage));
        this.f2564CA = location;
        this.f2565CB = width;
        this.f2566CC = height;
        this.f2567CD = bounds;
        this.f2571Cp = bearing;
        this.f2572Cw = zIndex;
        this.f2573Cx = visible;
        this.f2568CE = transparency;
        this.f2569CF = anchorU;
        this.f2570CG = anchorV;
    }

    /* renamed from: a */
    private GroundOverlayOptions m3149a(LatLng latLng, float f, float f2) {
        this.f2564CA = latLng;
        this.f2565CB = f;
        this.f2566CC = f2;
        return this;
    }

    public GroundOverlayOptions anchor(float u, float v) {
        this.f2569CF = u;
        this.f2570CG = v;
        return this;
    }

    public GroundOverlayOptions bearing(float bearing) {
        this.f2571Cp = ((bearing % 360.0f) + 360.0f) % 360.0f;
        return this;
    }

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: eF */
    public IBinder mo5763eF() {
        return this.f2574Cz.mo5688el().asBinder();
    }

    public float getAnchorU() {
        return this.f2569CF;
    }

    public float getAnchorV() {
        return this.f2570CG;
    }

    public float getBearing() {
        return this.f2571Cp;
    }

    public LatLngBounds getBounds() {
        return this.f2567CD;
    }

    public float getHeight() {
        return this.f2566CC;
    }

    public BitmapDescriptor getImage() {
        return this.f2574Cz;
    }

    public LatLng getLocation() {
        return this.f2564CA;
    }

    public float getTransparency() {
        return this.f2568CE;
    }

    /* access modifiers changed from: 0000 */
    public int getVersionCode() {
        return this.f2575kg;
    }

    public float getWidth() {
        return this.f2565CB;
    }

    public float getZIndex() {
        return this.f2572Cw;
    }

    public GroundOverlayOptions image(BitmapDescriptor image) {
        this.f2574Cz = image;
        return this;
    }

    public boolean isVisible() {
        return this.f2573Cx;
    }

    public GroundOverlayOptions position(LatLng location, float width) {
        boolean z = true;
        C0600eg.m1550a(this.f2567CD == null, "Position has already been set using positionFromBounds");
        C0600eg.m1553b(location != null, (Object) "Location must be specified");
        if (width < 0.0f) {
            z = false;
        }
        C0600eg.m1553b(z, (Object) "Width must be non-negative");
        return m3149a(location, width, -1.0f);
    }

    public GroundOverlayOptions position(LatLng location, float width, float height) {
        boolean z = true;
        C0600eg.m1550a(this.f2567CD == null, "Position has already been set using positionFromBounds");
        C0600eg.m1553b(location != null, (Object) "Location must be specified");
        C0600eg.m1553b(width >= 0.0f, (Object) "Width must be non-negative");
        if (height < 0.0f) {
            z = false;
        }
        C0600eg.m1553b(z, (Object) "Height must be non-negative");
        return m3149a(location, width, height);
    }

    public GroundOverlayOptions positionFromBounds(LatLngBounds bounds) {
        C0600eg.m1550a(this.f2564CA == null, "Position has already been set using position: " + this.f2564CA);
        this.f2567CD = bounds;
        return this;
    }

    public GroundOverlayOptions transparency(float transparency) {
        C0600eg.m1553b(transparency >= 0.0f && transparency <= 1.0f, (Object) "Transparency must be in the range [0..1]");
        this.f2568CE = transparency;
        return this;
    }

    public GroundOverlayOptions visible(boolean visible) {
        this.f2573Cx = visible;
        return this;
    }

    public void writeToParcel(Parcel out, int flags) {
        if (C1056r.m3143eD()) {
            C1061c.m3175a(this, out, flags);
        } else {
            GroundOverlayOptionsCreator.m3151a(this, out, flags);
        }
    }

    public GroundOverlayOptions zIndex(float zIndex) {
        this.f2572Cw = zIndex;
        return this;
    }
}
