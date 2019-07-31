package com.google.android.gms.location;

import android.os.Parcel;
import android.os.SystemClock;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C0596ee;

public final class LocationRequest implements SafeParcelable {
    public static final LocationRequestCreator CREATOR = new LocationRequestCreator();
    public static final int PRIORITY_BALANCED_POWER_ACCURACY = 102;
    public static final int PRIORITY_HIGH_ACCURACY = 100;
    public static final int PRIORITY_LOW_POWER = 104;
    public static final int PRIORITY_NO_POWER = 105;

    /* renamed from: kg */
    private final int f2440kg;
    int mPriority;

    /* renamed from: xB */
    long f2441xB;

    /* renamed from: xC */
    long f2442xC;

    /* renamed from: xD */
    boolean f2443xD;

    /* renamed from: xE */
    int f2444xE;

    /* renamed from: xF */
    float f2445xF;

    /* renamed from: xu */
    long f2446xu;

    public LocationRequest() {
        this.f2440kg = 1;
        this.mPriority = PRIORITY_BALANCED_POWER_ACCURACY;
        this.f2441xB = 3600000;
        this.f2442xC = 600000;
        this.f2443xD = false;
        this.f2446xu = Long.MAX_VALUE;
        this.f2444xE = Integer.MAX_VALUE;
        this.f2445xF = 0.0f;
    }

    LocationRequest(int versionCode, int priority, long interval, long fastestInterval, boolean explicitFastestInterval, long expireAt, int numUpdates, float smallestDisplacement) {
        this.f2440kg = versionCode;
        this.mPriority = priority;
        this.f2441xB = interval;
        this.f2442xC = fastestInterval;
        this.f2443xD = explicitFastestInterval;
        this.f2446xu = expireAt;
        this.f2444xE = numUpdates;
        this.f2445xF = smallestDisplacement;
    }

    /* renamed from: a */
    private static void m3024a(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("invalid displacement: " + f);
        }
    }

    /* renamed from: aO */
    private static void m3025aO(int i) {
        switch (i) {
            case 100:
            case PRIORITY_BALANCED_POWER_ACCURACY /*102*/:
            case PRIORITY_LOW_POWER /*104*/:
            case PRIORITY_NO_POWER /*105*/:
                return;
            default:
                throw new IllegalArgumentException("invalid quality: " + i);
        }
    }

    /* renamed from: aP */
    public static String m3026aP(int i) {
        switch (i) {
            case 100:
                return "PRIORITY_HIGH_ACCURACY";
            case PRIORITY_BALANCED_POWER_ACCURACY /*102*/:
                return "PRIORITY_BALANCED_POWER_ACCURACY";
            case PRIORITY_LOW_POWER /*104*/:
                return "PRIORITY_LOW_POWER";
            case PRIORITY_NO_POWER /*105*/:
                return "PRIORITY_NO_POWER";
            default:
                return "???";
        }
    }

    public static LocationRequest create() {
        return new LocationRequest();
    }

    /* renamed from: m */
    private static void m3027m(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("invalid interval: " + j);
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof LocationRequest)) {
            return false;
        }
        LocationRequest locationRequest = (LocationRequest) object;
        return this.mPriority == locationRequest.mPriority && this.f2441xB == locationRequest.f2441xB && this.f2442xC == locationRequest.f2442xC && this.f2443xD == locationRequest.f2443xD && this.f2446xu == locationRequest.f2446xu && this.f2444xE == locationRequest.f2444xE && this.f2445xF == locationRequest.f2445xF;
    }

    public long getExpirationTime() {
        return this.f2446xu;
    }

    public long getFastestInterval() {
        return this.f2442xC;
    }

    public long getInterval() {
        return this.f2441xB;
    }

    public int getNumUpdates() {
        return this.f2444xE;
    }

    public int getPriority() {
        return this.mPriority;
    }

    public float getSmallestDisplacement() {
        return this.f2445xF;
    }

    /* access modifiers changed from: 0000 */
    public int getVersionCode() {
        return this.f2440kg;
    }

    public int hashCode() {
        return C0596ee.hashCode(Integer.valueOf(this.mPriority), Long.valueOf(this.f2441xB), Long.valueOf(this.f2442xC), Boolean.valueOf(this.f2443xD), Long.valueOf(this.f2446xu), Integer.valueOf(this.f2444xE), Float.valueOf(this.f2445xF));
    }

    public LocationRequest setExpirationDuration(long millis) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (millis > Long.MAX_VALUE - elapsedRealtime) {
            this.f2446xu = Long.MAX_VALUE;
        } else {
            this.f2446xu = elapsedRealtime + millis;
        }
        if (this.f2446xu < 0) {
            this.f2446xu = 0;
        }
        return this;
    }

    public LocationRequest setExpirationTime(long millis) {
        this.f2446xu = millis;
        if (this.f2446xu < 0) {
            this.f2446xu = 0;
        }
        return this;
    }

    public LocationRequest setFastestInterval(long millis) {
        m3027m(millis);
        this.f2443xD = true;
        this.f2442xC = millis;
        return this;
    }

    public LocationRequest setInterval(long millis) {
        m3027m(millis);
        this.f2441xB = millis;
        if (!this.f2443xD) {
            this.f2442xC = (long) (((double) this.f2441xB) / 6.0d);
        }
        return this;
    }

    public LocationRequest setNumUpdates(int numUpdates) {
        if (numUpdates <= 0) {
            throw new IllegalArgumentException("invalid numUpdates: " + numUpdates);
        }
        this.f2444xE = numUpdates;
        return this;
    }

    public LocationRequest setPriority(int priority) {
        m3025aO(priority);
        this.mPriority = priority;
        return this;
    }

    public LocationRequest setSmallestDisplacement(float smallestDisplacementMeters) {
        m3024a(smallestDisplacementMeters);
        this.f2445xF = smallestDisplacementMeters;
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request[").append(m3026aP(this.mPriority));
        if (this.mPriority != 105) {
            sb.append(" requested=");
            sb.append(this.f2441xB + "ms");
        }
        sb.append(" fastest=");
        sb.append(this.f2442xC + "ms");
        if (this.f2446xu != Long.MAX_VALUE) {
            long elapsedRealtime = this.f2446xu - SystemClock.elapsedRealtime();
            sb.append(" expireIn=");
            sb.append(elapsedRealtime + "ms");
        }
        if (this.f2444xE != Integer.MAX_VALUE) {
            sb.append(" num=").append(this.f2444xE);
        }
        sb.append(']');
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int flags) {
        LocationRequestCreator.m3028a(this, parcel, flags);
    }
}
