package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C0596ee;
import com.google.android.gms.internal.C0600eg;
import com.google.android.gms.maps.internal.C1056r;

public final class LatLngBounds implements SafeParcelable {
    public static final LatLngBoundsCreator CREATOR = new LatLngBoundsCreator();

    /* renamed from: kg */
    private final int f2577kg;
    public final LatLng northeast;
    public final LatLng southwest;

    public static final class Builder {

        /* renamed from: CH */
        private double f2578CH = Double.POSITIVE_INFINITY;

        /* renamed from: CI */
        private double f2579CI = Double.NEGATIVE_INFINITY;

        /* renamed from: CJ */
        private double f2580CJ = Double.NaN;

        /* renamed from: CK */
        private double f2581CK = Double.NaN;

        /* renamed from: d */
        private boolean m3158d(double d) {
            boolean z = false;
            if (this.f2580CJ <= this.f2581CK) {
                return this.f2580CJ <= d && d <= this.f2581CK;
            }
            if (this.f2580CJ <= d || d <= this.f2581CK) {
                z = true;
            }
            return z;
        }

        public LatLngBounds build() {
            C0600eg.m1550a(!Double.isNaN(this.f2580CJ), "no included points");
            return new LatLngBounds(new LatLng(this.f2578CH, this.f2580CJ), new LatLng(this.f2579CI, this.f2581CK));
        }

        public Builder include(LatLng point) {
            this.f2578CH = Math.min(this.f2578CH, point.latitude);
            this.f2579CI = Math.max(this.f2579CI, point.latitude);
            double d = point.longitude;
            if (Double.isNaN(this.f2580CJ)) {
                this.f2580CJ = d;
                this.f2581CK = d;
            } else if (!m3158d(d)) {
                if (LatLngBounds.m3152b(this.f2580CJ, d) < LatLngBounds.m3153c(this.f2581CK, d)) {
                    this.f2580CJ = d;
                } else {
                    this.f2581CK = d;
                }
            }
            return this;
        }
    }

    LatLngBounds(int versionCode, LatLng southwest2, LatLng northeast2) {
        C0600eg.m1552b(southwest2, (Object) "null southwest");
        C0600eg.m1552b(northeast2, (Object) "null northeast");
        C0600eg.m1551a(northeast2.latitude >= southwest2.latitude, "southern latitude exceeds northern latitude (%s > %s)", Double.valueOf(southwest2.latitude), Double.valueOf(northeast2.latitude));
        this.f2577kg = versionCode;
        this.southwest = southwest2;
        this.northeast = northeast2;
    }

    public LatLngBounds(LatLng southwest2, LatLng northeast2) {
        this(1, southwest2, northeast2);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static double m3152b(double d, double d2) {
        return ((d - d2) + 360.0d) % 360.0d;
    }

    public static Builder builder() {
        return new Builder();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static double m3153c(double d, double d2) {
        return ((d2 - d) + 360.0d) % 360.0d;
    }

    /* renamed from: c */
    private boolean m3154c(double d) {
        return this.southwest.latitude <= d && d <= this.northeast.latitude;
    }

    /* renamed from: d */
    private boolean m3156d(double d) {
        boolean z = false;
        if (this.southwest.longitude <= this.northeast.longitude) {
            return this.southwest.longitude <= d && d <= this.northeast.longitude;
        }
        if (this.southwest.longitude <= d || d <= this.northeast.longitude) {
            z = true;
        }
        return z;
    }

    public boolean contains(LatLng point) {
        return m3154c(point.latitude) && m3156d(point.longitude);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) o;
        return this.southwest.equals(latLngBounds.southwest) && this.northeast.equals(latLngBounds.northeast);
    }

    public LatLng getCenter() {
        double d = (this.southwest.latitude + this.northeast.latitude) / 2.0d;
        double d2 = this.northeast.longitude;
        double d3 = this.southwest.longitude;
        return new LatLng(d, d3 <= d2 ? (d2 + d3) / 2.0d : ((d2 + 360.0d) + d3) / 2.0d);
    }

    /* access modifiers changed from: 0000 */
    public int getVersionCode() {
        return this.f2577kg;
    }

    public int hashCode() {
        return C0596ee.hashCode(this.southwest, this.northeast);
    }

    public LatLngBounds including(LatLng point) {
        double d;
        double min = Math.min(this.southwest.latitude, point.latitude);
        double max = Math.max(this.northeast.latitude, point.latitude);
        double d2 = this.northeast.longitude;
        double d3 = this.southwest.longitude;
        double d4 = point.longitude;
        if (m3156d(d4)) {
            d4 = d3;
            d = d2;
        } else if (m3152b(d3, d4) < m3153c(d2, d4)) {
            d = d2;
        } else {
            double d5 = d3;
            d = d4;
            d4 = d5;
        }
        return new LatLngBounds(new LatLng(min, d4), new LatLng(max, d));
    }

    public String toString() {
        return C0596ee.m1542e(this).mo3971a("southwest", this.southwest).mo3971a("northeast", this.northeast).toString();
    }

    public void writeToParcel(Parcel out, int flags) {
        if (C1056r.m3143eD()) {
            C1062d.m3176a(this, out, flags);
        } else {
            LatLngBoundsCreator.m3159a(this, out, flags);
        }
    }
}
