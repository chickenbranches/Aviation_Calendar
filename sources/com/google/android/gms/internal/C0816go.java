package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.Geofence;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.go */
public class C0816go implements SafeParcelable, Geofence {
    public static final C0817gp CREATOR = new C0817gp();

    /* renamed from: kg */
    private final int f1926kg;

    /* renamed from: xA */
    private final int f1927xA;

    /* renamed from: xs */
    private final String f1928xs;

    /* renamed from: xt */
    private final int f1929xt;

    /* renamed from: xv */
    private final short f1930xv;

    /* renamed from: xw */
    private final double f1931xw;

    /* renamed from: xx */
    private final double f1932xx;

    /* renamed from: xy */
    private final float f1933xy;

    /* renamed from: xz */
    private final int f1934xz;

    /* renamed from: ye */
    private final long f1935ye;

    public C0816go(int i, String str, int i2, short s, double d, double d2, float f, long j, int i3, int i4) {
        m2452ap(str);
        m2453b(f);
        m2449a(d, d2);
        int aV = m2450aV(i2);
        this.f1926kg = i;
        this.f1930xv = s;
        this.f1928xs = str;
        this.f1931xw = d;
        this.f1932xx = d2;
        this.f1933xy = f;
        this.f1935ye = j;
        this.f1929xt = aV;
        this.f1934xz = i3;
        this.f1927xA = i4;
    }

    public C0816go(String str, int i, short s, double d, double d2, float f, long j, int i2, int i3) {
        this(1, str, i, s, d, d2, f, j, i2, i3);
    }

    /* renamed from: a */
    private static void m2449a(double d, double d2) {
        if (d > 90.0d || d < -90.0d) {
            throw new IllegalArgumentException("invalid latitude: " + d);
        } else if (d2 > 180.0d || d2 < -180.0d) {
            throw new IllegalArgumentException("invalid longitude: " + d2);
        }
    }

    /* renamed from: aV */
    private static int m2450aV(int i) {
        int i2 = i & 7;
        if (i2 != 0) {
            return i2;
        }
        throw new IllegalArgumentException("No supported transition specified: " + i);
    }

    /* renamed from: aW */
    private static String m2451aW(int i) {
        switch (i) {
            case 1:
                return "CIRCLE";
            default:
                return null;
        }
    }

    /* renamed from: ap */
    private static void m2452ap(String str) {
        if (str == null || str.length() > 100) {
            throw new IllegalArgumentException("requestId is null or too long: " + str);
        }
    }

    /* renamed from: b */
    private static void m2453b(float f) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("invalid radius: " + f);
        }
    }

    /* renamed from: f */
    public static C0816go m2454f(byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        C0816go ai = CREATOR.createFromParcel(obtain);
        obtain.recycle();
        return ai;
    }

    /* renamed from: dK */
    public short mo4540dK() {
        return this.f1930xv;
    }

    /* renamed from: dL */
    public float mo4541dL() {
        return this.f1933xy;
    }

    /* renamed from: dM */
    public int mo4542dM() {
        return this.f1929xt;
    }

    /* renamed from: dN */
    public int mo4543dN() {
        return this.f1927xA;
    }

    public int describeContents() {
        C0817gp gpVar = CREATOR;
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof C0816go)) {
            return false;
        }
        C0816go goVar = (C0816go) obj;
        if (this.f1933xy != goVar.f1933xy) {
            return false;
        }
        if (this.f1931xw != goVar.f1931xw) {
            return false;
        }
        if (this.f1932xx != goVar.f1932xx) {
            return false;
        }
        return this.f1930xv == goVar.f1930xv;
    }

    public long getExpirationTime() {
        return this.f1935ye;
    }

    public double getLatitude() {
        return this.f1931xw;
    }

    public double getLongitude() {
        return this.f1932xx;
    }

    public int getNotificationResponsiveness() {
        return this.f1934xz;
    }

    public String getRequestId() {
        return this.f1928xs;
    }

    public int getVersionCode() {
        return this.f1926kg;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f1931xw);
        int i = ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31;
        long doubleToLongBits2 = Double.doubleToLongBits(this.f1932xx);
        return (((((((i * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + Float.floatToIntBits(this.f1933xy)) * 31) + this.f1930xv) * 31) + this.f1929xt;
    }

    public String toString() {
        return String.format(Locale.US, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", new Object[]{m2451aW(this.f1930xv), this.f1928xs, Integer.valueOf(this.f1929xt), Double.valueOf(this.f1931xw), Double.valueOf(this.f1932xx), Float.valueOf(this.f1933xy), Integer.valueOf(this.f1934xz / 1000), Integer.valueOf(this.f1927xA), Long.valueOf(this.f1935ye)});
    }

    public void writeToParcel(Parcel parcel, int flags) {
        C0817gp gpVar = CREATOR;
        C0817gp.m2459a(this, parcel, flags);
    }
}
