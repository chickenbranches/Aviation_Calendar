package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.support.p000v4.view.ViewCompat;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.internal.C1056r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class PolygonOptions implements SafeParcelable {
    public static final PolygonOptionsCreator CREATOR = new PolygonOptionsCreator();

    /* renamed from: CV */
    private final List<LatLng> f2597CV;

    /* renamed from: CW */
    private final List<List<LatLng>> f2598CW;

    /* renamed from: CX */
    private boolean f2599CX;

    /* renamed from: Ct */
    private float f2600Ct;

    /* renamed from: Cu */
    private int f2601Cu;

    /* renamed from: Cv */
    private int f2602Cv;

    /* renamed from: Cw */
    private float f2603Cw;

    /* renamed from: Cx */
    private boolean f2604Cx;

    /* renamed from: kg */
    private final int f2605kg;

    public PolygonOptions() {
        this.f2600Ct = 10.0f;
        this.f2601Cu = ViewCompat.MEASURED_STATE_MASK;
        this.f2602Cv = 0;
        this.f2603Cw = 0.0f;
        this.f2604Cx = true;
        this.f2599CX = false;
        this.f2605kg = 1;
        this.f2597CV = new ArrayList();
        this.f2598CW = new ArrayList();
    }

    PolygonOptions(int versionCode, List<LatLng> points, List holes, float strokeWidth, int strokeColor, int fillColor, float zIndex, boolean visible, boolean geodesic) {
        this.f2600Ct = 10.0f;
        this.f2601Cu = ViewCompat.MEASURED_STATE_MASK;
        this.f2602Cv = 0;
        this.f2603Cw = 0.0f;
        this.f2604Cx = true;
        this.f2599CX = false;
        this.f2605kg = versionCode;
        this.f2597CV = points;
        this.f2598CW = holes;
        this.f2600Ct = strokeWidth;
        this.f2601Cu = strokeColor;
        this.f2602Cv = fillColor;
        this.f2603Cw = zIndex;
        this.f2604Cx = visible;
        this.f2599CX = geodesic;
    }

    public PolygonOptions add(LatLng point) {
        this.f2597CV.add(point);
        return this;
    }

    public PolygonOptions add(LatLng... points) {
        this.f2597CV.addAll(Arrays.asList(points));
        return this;
    }

    public PolygonOptions addAll(Iterable<LatLng> points) {
        for (LatLng add : points) {
            this.f2597CV.add(add);
        }
        return this;
    }

    public PolygonOptions addHole(Iterable<LatLng> points) {
        ArrayList arrayList = new ArrayList();
        for (LatLng add : points) {
            arrayList.add(add);
        }
        this.f2598CW.add(arrayList);
        return this;
    }

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: eH */
    public List mo5888eH() {
        return this.f2598CW;
    }

    public PolygonOptions fillColor(int color) {
        this.f2602Cv = color;
        return this;
    }

    public PolygonOptions geodesic(boolean geodesic) {
        this.f2599CX = geodesic;
        return this;
    }

    public int getFillColor() {
        return this.f2602Cv;
    }

    public List<List<LatLng>> getHoles() {
        return this.f2598CW;
    }

    public List<LatLng> getPoints() {
        return this.f2597CV;
    }

    public int getStrokeColor() {
        return this.f2601Cu;
    }

    public float getStrokeWidth() {
        return this.f2600Ct;
    }

    /* access modifiers changed from: 0000 */
    public int getVersionCode() {
        return this.f2605kg;
    }

    public float getZIndex() {
        return this.f2603Cw;
    }

    public boolean isGeodesic() {
        return this.f2599CX;
    }

    public boolean isVisible() {
        return this.f2604Cx;
    }

    public PolygonOptions strokeColor(int color) {
        this.f2601Cu = color;
        return this;
    }

    public PolygonOptions strokeWidth(float width) {
        this.f2600Ct = width;
        return this;
    }

    public PolygonOptions visible(boolean visible) {
        this.f2604Cx = visible;
        return this;
    }

    public void writeToParcel(Parcel out, int flags) {
        if (C1056r.m3143eD()) {
            C1065g.m3179a(this, out, flags);
        } else {
            PolygonOptionsCreator.m3164a(this, out, flags);
        }
    }

    public PolygonOptions zIndex(float zIndex) {
        this.f2603Cw = zIndex;
        return this;
    }
}
