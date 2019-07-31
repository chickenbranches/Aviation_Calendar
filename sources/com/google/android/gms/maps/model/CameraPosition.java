package com.google.android.gms.maps.model;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.util.AttributeSet;
import com.google.android.gms.C0083R;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C0596ee;
import com.google.android.gms.internal.C0600eg;
import com.google.android.gms.maps.internal.C1056r;

public final class CameraPosition implements SafeParcelable {
    public static final CameraPositionCreator CREATOR = new CameraPositionCreator();
    public final float bearing;

    /* renamed from: kg */
    private final int f2549kg;
    public final LatLng target;
    public final float tilt;
    public final float zoom;

    public static final class Builder {

        /* renamed from: Cm */
        private LatLng f2550Cm;

        /* renamed from: Cn */
        private float f2551Cn;

        /* renamed from: Co */
        private float f2552Co;

        /* renamed from: Cp */
        private float f2553Cp;

        public Builder() {
        }

        public Builder(CameraPosition previous) {
            this.f2550Cm = previous.target;
            this.f2551Cn = previous.zoom;
            this.f2552Co = previous.tilt;
            this.f2553Cp = previous.bearing;
        }

        public Builder bearing(float bearing) {
            this.f2553Cp = bearing;
            return this;
        }

        public CameraPosition build() {
            return new CameraPosition(this.f2550Cm, this.f2551Cn, this.f2552Co, this.f2553Cp);
        }

        public Builder target(LatLng location) {
            this.f2550Cm = location;
            return this;
        }

        public Builder tilt(float tilt) {
            this.f2552Co = tilt;
            return this;
        }

        public Builder zoom(float zoom) {
            this.f2551Cn = zoom;
            return this;
        }
    }

    CameraPosition(int versionCode, LatLng target2, float zoom2, float tilt2, float bearing2) {
        C0600eg.m1552b(target2, (Object) "null camera target");
        C0600eg.m1553b(0.0f <= tilt2 && tilt2 <= 90.0f, (Object) "Tilt needs to be between 0 and 90 inclusive");
        this.f2549kg = versionCode;
        this.target = target2;
        this.zoom = zoom2;
        this.tilt = tilt2 + 0.0f;
        if (((double) bearing2) <= 0.0d) {
            bearing2 = (bearing2 % 360.0f) + 360.0f;
        }
        this.bearing = bearing2 % 360.0f;
    }

    public CameraPosition(LatLng target2, float zoom2, float tilt2, float bearing2) {
        this(1, target2, zoom2, tilt2, bearing2);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CameraPosition camera) {
        return new Builder(camera);
    }

    public static CameraPosition createFromAttributes(Context context, AttributeSet attrs) {
        if (attrs == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attrs, C0083R.styleable.MapAttrs);
        LatLng latLng = new LatLng((double) (obtainAttributes.hasValue(2) ? obtainAttributes.getFloat(2, 0.0f) : 0.0f), (double) (obtainAttributes.hasValue(3) ? obtainAttributes.getFloat(3, 0.0f) : 0.0f));
        Builder builder = builder();
        builder.target(latLng);
        if (obtainAttributes.hasValue(5)) {
            builder.zoom(obtainAttributes.getFloat(5, 0.0f));
        }
        if (obtainAttributes.hasValue(1)) {
            builder.bearing(obtainAttributes.getFloat(1, 0.0f));
        }
        if (obtainAttributes.hasValue(4)) {
            builder.tilt(obtainAttributes.getFloat(4, 0.0f));
        }
        return builder.build();
    }

    public static final CameraPosition fromLatLngZoom(LatLng target2, float zoom2) {
        return new CameraPosition(target2, zoom2, 0.0f, 0.0f);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) o;
        return this.target.equals(cameraPosition.target) && Float.floatToIntBits(this.zoom) == Float.floatToIntBits(cameraPosition.zoom) && Float.floatToIntBits(this.tilt) == Float.floatToIntBits(cameraPosition.tilt) && Float.floatToIntBits(this.bearing) == Float.floatToIntBits(cameraPosition.bearing);
    }

    /* access modifiers changed from: 0000 */
    public int getVersionCode() {
        return this.f2549kg;
    }

    public int hashCode() {
        return C0596ee.hashCode(this.target, Float.valueOf(this.zoom), Float.valueOf(this.tilt), Float.valueOf(this.bearing));
    }

    public String toString() {
        return C0596ee.m1542e(this).mo3971a("target", this.target).mo3971a("zoom", Float.valueOf(this.zoom)).mo3971a("tilt", Float.valueOf(this.tilt)).mo3971a("bearing", Float.valueOf(this.bearing)).toString();
    }

    public void writeToParcel(Parcel out, int flags) {
        if (C1056r.m3143eD()) {
            C1059a.m3173a(this, out, flags);
        } else {
            CameraPositionCreator.m3147a(this, out, flags);
        }
    }
}
