package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C0596ee;
import com.google.android.gms.maps.internal.C1056r;

public final class VisibleRegion implements SafeParcelable {
    public static final VisibleRegionCreator CREATOR = new VisibleRegionCreator();
    public final LatLng farLeft;
    public final LatLng farRight;

    /* renamed from: kg */
    private final int f2628kg;
    public final LatLngBounds latLngBounds;
    public final LatLng nearLeft;
    public final LatLng nearRight;

    VisibleRegion(int versionCode, LatLng nearLeft2, LatLng nearRight2, LatLng farLeft2, LatLng farRight2, LatLngBounds latLngBounds2) {
        this.f2628kg = versionCode;
        this.nearLeft = nearLeft2;
        this.nearRight = nearRight2;
        this.farLeft = farLeft2;
        this.farRight = farRight2;
        this.latLngBounds = latLngBounds2;
    }

    public VisibleRegion(LatLng nearLeft2, LatLng nearRight2, LatLng farLeft2, LatLng farRight2, LatLngBounds latLngBounds2) {
        this(1, nearLeft2, nearRight2, farLeft2, farRight2, latLngBounds2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VisibleRegion)) {
            return false;
        }
        VisibleRegion visibleRegion = (VisibleRegion) o;
        return this.nearLeft.equals(visibleRegion.nearLeft) && this.nearRight.equals(visibleRegion.nearRight) && this.farLeft.equals(visibleRegion.farLeft) && this.farRight.equals(visibleRegion.farRight) && this.latLngBounds.equals(visibleRegion.latLngBounds);
    }

    /* access modifiers changed from: 0000 */
    public int getVersionCode() {
        return this.f2628kg;
    }

    public int hashCode() {
        return C0596ee.hashCode(this.nearLeft, this.nearRight, this.farLeft, this.farRight, this.latLngBounds);
    }

    public String toString() {
        return C0596ee.m1542e(this).mo3971a("nearLeft", this.nearLeft).mo3971a("nearRight", this.nearRight).mo3971a("farLeft", this.farLeft).mo3971a("farRight", this.farRight).mo3971a("latLngBounds", this.latLngBounds).toString();
    }

    public void writeToParcel(Parcel out, int flags) {
        if (C1056r.m3143eD()) {
            C1092k.m3221a(this, out, flags);
        } else {
            VisibleRegionCreator.m3172a(this, out, flags);
        }
    }
}
