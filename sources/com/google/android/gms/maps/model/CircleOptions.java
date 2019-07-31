package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.support.p000v4.view.ViewCompat;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.internal.C1056r;

public final class CircleOptions implements SafeParcelable {
    public static final CircleOptionsCreator CREATOR = new CircleOptionsCreator();

    /* renamed from: Cr */
    private LatLng f2555Cr;

    /* renamed from: Cs */
    private double f2556Cs;

    /* renamed from: Ct */
    private float f2557Ct;

    /* renamed from: Cu */
    private int f2558Cu;

    /* renamed from: Cv */
    private int f2559Cv;

    /* renamed from: Cw */
    private float f2560Cw;

    /* renamed from: Cx */
    private boolean f2561Cx;

    /* renamed from: kg */
    private final int f2562kg;

    public CircleOptions() {
        this.f2555Cr = null;
        this.f2556Cs = 0.0d;
        this.f2557Ct = 10.0f;
        this.f2558Cu = ViewCompat.MEASURED_STATE_MASK;
        this.f2559Cv = 0;
        this.f2560Cw = 0.0f;
        this.f2561Cx = true;
        this.f2562kg = 1;
    }

    CircleOptions(int versionCode, LatLng center, double radius, float strokeWidth, int strokeColor, int fillColor, float zIndex, boolean visible) {
        this.f2555Cr = null;
        this.f2556Cs = 0.0d;
        this.f2557Ct = 10.0f;
        this.f2558Cu = ViewCompat.MEASURED_STATE_MASK;
        this.f2559Cv = 0;
        this.f2560Cw = 0.0f;
        this.f2561Cx = true;
        this.f2562kg = versionCode;
        this.f2555Cr = center;
        this.f2556Cs = radius;
        this.f2557Ct = strokeWidth;
        this.f2558Cu = strokeColor;
        this.f2559Cv = fillColor;
        this.f2560Cw = zIndex;
        this.f2561Cx = visible;
    }

    public CircleOptions center(LatLng center) {
        this.f2555Cr = center;
        return this;
    }

    public int describeContents() {
        return 0;
    }

    public CircleOptions fillColor(int color) {
        this.f2559Cv = color;
        return this;
    }

    public LatLng getCenter() {
        return this.f2555Cr;
    }

    public int getFillColor() {
        return this.f2559Cv;
    }

    public double getRadius() {
        return this.f2556Cs;
    }

    public int getStrokeColor() {
        return this.f2558Cu;
    }

    public float getStrokeWidth() {
        return this.f2557Ct;
    }

    /* access modifiers changed from: 0000 */
    public int getVersionCode() {
        return this.f2562kg;
    }

    public float getZIndex() {
        return this.f2560Cw;
    }

    public boolean isVisible() {
        return this.f2561Cx;
    }

    public CircleOptions radius(double radius) {
        this.f2556Cs = radius;
        return this;
    }

    public CircleOptions strokeColor(int color) {
        this.f2558Cu = color;
        return this;
    }

    public CircleOptions strokeWidth(float width) {
        this.f2557Ct = width;
        return this;
    }

    public CircleOptions visible(boolean visible) {
        this.f2561Cx = visible;
        return this;
    }

    public void writeToParcel(Parcel out, int flags) {
        if (C1056r.m3143eD()) {
            C1060b.m3174a(this, out, flags);
        } else {
            CircleOptionsCreator.m3148a(this, out, flags);
        }
    }

    public CircleOptions zIndex(float zIndex) {
        this.f2560Cw = zIndex;
        return this;
    }
}
