package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.support.p000v4.view.ViewCompat;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.internal.C1056r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class PolylineOptions implements SafeParcelable {
    public static final PolylineOptionsCreator CREATOR = new PolylineOptionsCreator();

    /* renamed from: CB */
    private float f2607CB;

    /* renamed from: CV */
    private final List<LatLng> f2608CV;

    /* renamed from: CX */
    private boolean f2609CX;

    /* renamed from: Cw */
    private float f2610Cw;

    /* renamed from: Cx */
    private boolean f2611Cx;

    /* renamed from: kg */
    private final int f2612kg;

    /* renamed from: mP */
    private int f2613mP;

    public PolylineOptions() {
        this.f2607CB = 10.0f;
        this.f2613mP = ViewCompat.MEASURED_STATE_MASK;
        this.f2610Cw = 0.0f;
        this.f2611Cx = true;
        this.f2609CX = false;
        this.f2612kg = 1;
        this.f2608CV = new ArrayList();
    }

    PolylineOptions(int versionCode, List points, float width, int color, float zIndex, boolean visible, boolean geodesic) {
        this.f2607CB = 10.0f;
        this.f2613mP = ViewCompat.MEASURED_STATE_MASK;
        this.f2610Cw = 0.0f;
        this.f2611Cx = true;
        this.f2609CX = false;
        this.f2612kg = versionCode;
        this.f2608CV = points;
        this.f2607CB = width;
        this.f2613mP = color;
        this.f2610Cw = zIndex;
        this.f2611Cx = visible;
        this.f2609CX = geodesic;
    }

    public PolylineOptions add(LatLng point) {
        this.f2608CV.add(point);
        return this;
    }

    public PolylineOptions add(LatLng... points) {
        this.f2608CV.addAll(Arrays.asList(points));
        return this;
    }

    public PolylineOptions addAll(Iterable<LatLng> points) {
        for (LatLng add : points) {
            this.f2608CV.add(add);
        }
        return this;
    }

    public PolylineOptions color(int color) {
        this.f2613mP = color;
        return this;
    }

    public int describeContents() {
        return 0;
    }

    public PolylineOptions geodesic(boolean geodesic) {
        this.f2609CX = geodesic;
        return this;
    }

    public int getColor() {
        return this.f2613mP;
    }

    public List<LatLng> getPoints() {
        return this.f2608CV;
    }

    /* access modifiers changed from: 0000 */
    public int getVersionCode() {
        return this.f2612kg;
    }

    public float getWidth() {
        return this.f2607CB;
    }

    public float getZIndex() {
        return this.f2610Cw;
    }

    public boolean isGeodesic() {
        return this.f2609CX;
    }

    public boolean isVisible() {
        return this.f2611Cx;
    }

    public PolylineOptions visible(boolean visible) {
        this.f2611Cx = visible;
        return this;
    }

    public PolylineOptions width(float width) {
        this.f2607CB = width;
        return this;
    }

    public void writeToParcel(Parcel out, int flags) {
        if (C1056r.m3143eD()) {
            C1066h.m3180a(this, out, flags);
        } else {
            PolylineOptionsCreator.m3165a(this, out, flags);
        }
    }

    public PolylineOptions zIndex(float zIndex) {
        this.f2610Cw = zIndex;
        return this;
    }
}
