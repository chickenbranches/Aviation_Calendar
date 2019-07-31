package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.C0270b.C0271a;
import com.google.android.gms.maps.internal.C1056r;

public final class MarkerOptions implements SafeParcelable {
    public static final MarkerOptionsCreator CREATOR = new MarkerOptionsCreator();

    /* renamed from: CF */
    private float f2583CF;

    /* renamed from: CG */
    private float f2584CG;

    /* renamed from: CM */
    private LatLng f2585CM;

    /* renamed from: CN */
    private String f2586CN;

    /* renamed from: CO */
    private BitmapDescriptor f2587CO;

    /* renamed from: CP */
    private boolean f2588CP;

    /* renamed from: CQ */
    private boolean f2589CQ;

    /* renamed from: CR */
    private float f2590CR;

    /* renamed from: CS */
    private float f2591CS;

    /* renamed from: CT */
    private float f2592CT;

    /* renamed from: Cx */
    private boolean f2593Cx;

    /* renamed from: kg */
    private final int f2594kg;
    private float mAlpha;

    /* renamed from: qL */
    private String f2595qL;

    public MarkerOptions() {
        this.f2583CF = 0.5f;
        this.f2584CG = 1.0f;
        this.f2593Cx = true;
        this.f2589CQ = false;
        this.f2590CR = 0.0f;
        this.f2591CS = 0.5f;
        this.f2592CT = 0.0f;
        this.mAlpha = 1.0f;
        this.f2594kg = 1;
    }

    MarkerOptions(int versionCode, LatLng position, String title, String snippet, IBinder wrappedIcon, float anchorU, float anchorV, boolean draggable, boolean visible, boolean flat, float rotation, float infoWindowAnchorU, float infoWindowAnchorV, float alpha) {
        this.f2583CF = 0.5f;
        this.f2584CG = 1.0f;
        this.f2593Cx = true;
        this.f2589CQ = false;
        this.f2590CR = 0.0f;
        this.f2591CS = 0.5f;
        this.f2592CT = 0.0f;
        this.mAlpha = 1.0f;
        this.f2594kg = versionCode;
        this.f2585CM = position;
        this.f2595qL = title;
        this.f2586CN = snippet;
        this.f2587CO = wrappedIcon == null ? null : new BitmapDescriptor(C0271a.m632E(wrappedIcon));
        this.f2583CF = anchorU;
        this.f2584CG = anchorV;
        this.f2588CP = draggable;
        this.f2593Cx = visible;
        this.f2589CQ = flat;
        this.f2590CR = rotation;
        this.f2591CS = infoWindowAnchorU;
        this.f2592CT = infoWindowAnchorV;
        this.mAlpha = alpha;
    }

    public MarkerOptions alpha(float alpha) {
        this.mAlpha = alpha;
        return this;
    }

    public MarkerOptions anchor(float u, float v) {
        this.f2583CF = u;
        this.f2584CG = v;
        return this;
    }

    public int describeContents() {
        return 0;
    }

    public MarkerOptions draggable(boolean draggable) {
        this.f2588CP = draggable;
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: eG */
    public IBinder mo5837eG() {
        if (this.f2587CO == null) {
            return null;
        }
        return this.f2587CO.mo5688el().asBinder();
    }

    public MarkerOptions flat(boolean flat) {
        this.f2589CQ = flat;
        return this;
    }

    public float getAlpha() {
        return this.mAlpha;
    }

    public float getAnchorU() {
        return this.f2583CF;
    }

    public float getAnchorV() {
        return this.f2584CG;
    }

    public BitmapDescriptor getIcon() {
        return this.f2587CO;
    }

    public float getInfoWindowAnchorU() {
        return this.f2591CS;
    }

    public float getInfoWindowAnchorV() {
        return this.f2592CT;
    }

    public LatLng getPosition() {
        return this.f2585CM;
    }

    public float getRotation() {
        return this.f2590CR;
    }

    public String getSnippet() {
        return this.f2586CN;
    }

    public String getTitle() {
        return this.f2595qL;
    }

    /* access modifiers changed from: 0000 */
    public int getVersionCode() {
        return this.f2594kg;
    }

    public MarkerOptions icon(BitmapDescriptor icon) {
        this.f2587CO = icon;
        return this;
    }

    public MarkerOptions infoWindowAnchor(float u, float v) {
        this.f2591CS = u;
        this.f2592CT = v;
        return this;
    }

    public boolean isDraggable() {
        return this.f2588CP;
    }

    public boolean isFlat() {
        return this.f2589CQ;
    }

    public boolean isVisible() {
        return this.f2593Cx;
    }

    public MarkerOptions position(LatLng position) {
        this.f2585CM = position;
        return this;
    }

    public MarkerOptions rotation(float rotation) {
        this.f2590CR = rotation;
        return this;
    }

    public MarkerOptions snippet(String snippet) {
        this.f2586CN = snippet;
        return this;
    }

    public MarkerOptions title(String title) {
        this.f2595qL = title;
        return this;
    }

    public MarkerOptions visible(boolean visible) {
        this.f2593Cx = visible;
        return this;
    }

    public void writeToParcel(Parcel out, int flags) {
        if (C1056r.m3143eD()) {
            C1064f.m3178a(this, out, flags);
        } else {
            MarkerOptionsCreator.m3162a(this, out, flags);
        }
    }
}
