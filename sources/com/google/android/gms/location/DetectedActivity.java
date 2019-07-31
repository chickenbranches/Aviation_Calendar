package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class DetectedActivity implements SafeParcelable {
    public static final DetectedActivityCreator CREATOR = new DetectedActivityCreator();
    public static final int IN_VEHICLE = 0;
    public static final int ON_BICYCLE = 1;
    public static final int ON_FOOT = 2;
    public static final int STILL = 3;
    public static final int TILTING = 5;
    public static final int UNKNOWN = 4;

    /* renamed from: kg */
    private final int f2427kg;

    /* renamed from: xp */
    int f2428xp;

    /* renamed from: xq */
    int f2429xq;

    public DetectedActivity(int activityType, int confidence) {
        this.f2427kg = 1;
        this.f2428xp = activityType;
        this.f2429xq = confidence;
    }

    public DetectedActivity(int versionCode, int activityType, int confidence) {
        this.f2427kg = versionCode;
        this.f2428xp = activityType;
        this.f2429xq = confidence;
    }

    /* renamed from: aM */
    private int m3022aM(int i) {
        if (i > 6) {
            return 4;
        }
        return i;
    }

    public int describeContents() {
        return 0;
    }

    public int getConfidence() {
        return this.f2429xq;
    }

    public int getType() {
        return m3022aM(this.f2428xp);
    }

    public int getVersionCode() {
        return this.f2427kg;
    }

    public String toString() {
        return "DetectedActivity [type=" + getType() + ", confidence=" + this.f2429xq + "]";
    }

    public void writeToParcel(Parcel out, int flags) {
        DetectedActivityCreator.m3023a(this, out, flags);
    }
}
