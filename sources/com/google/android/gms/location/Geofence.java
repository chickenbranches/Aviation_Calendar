package com.google.android.gms.location;

import android.os.SystemClock;
import com.google.android.gms.internal.C0816go;

public interface Geofence {
    public static final int GEOFENCE_TRANSITION_DWELL = 4;
    public static final int GEOFENCE_TRANSITION_ENTER = 1;
    public static final int GEOFENCE_TRANSITION_EXIT = 2;
    public static final long NEVER_EXPIRE = -1;

    public static final class Builder {

        /* renamed from: xA */
        private int f2430xA = -1;

        /* renamed from: xs */
        private String f2431xs = null;

        /* renamed from: xt */
        private int f2432xt = 0;

        /* renamed from: xu */
        private long f2433xu = Long.MIN_VALUE;

        /* renamed from: xv */
        private short f2434xv = -1;

        /* renamed from: xw */
        private double f2435xw;

        /* renamed from: xx */
        private double f2436xx;

        /* renamed from: xy */
        private float f2437xy;

        /* renamed from: xz */
        private int f2438xz = 0;

        public Geofence build() {
            if (this.f2431xs == null) {
                throw new IllegalArgumentException("Request ID not set.");
            } else if (this.f2432xt == 0) {
                throw new IllegalArgumentException("Transitions types not set.");
            } else if ((this.f2432xt & 4) != 0 && this.f2430xA < 0) {
                throw new IllegalArgumentException("Non-negative loitering delay needs to be set when transition types include GEOFENCE_TRANSITION_DWELLING.");
            } else if (this.f2433xu == Long.MIN_VALUE) {
                throw new IllegalArgumentException("Expiration not set.");
            } else if (this.f2434xv == -1) {
                throw new IllegalArgumentException("Geofence region not set.");
            } else if (this.f2438xz >= 0) {
                return new C0816go(this.f2431xs, this.f2432xt, 1, this.f2435xw, this.f2436xx, this.f2437xy, this.f2433xu, this.f2438xz, this.f2430xA);
            } else {
                throw new IllegalArgumentException("Notification responsiveness should be nonnegative.");
            }
        }

        public Builder setCircularRegion(double latitude, double longitude, float radius) {
            this.f2434xv = 1;
            this.f2435xw = latitude;
            this.f2436xx = longitude;
            this.f2437xy = radius;
            return this;
        }

        public Builder setExpirationDuration(long durationMillis) {
            if (durationMillis < 0) {
                this.f2433xu = -1;
            } else {
                this.f2433xu = SystemClock.elapsedRealtime() + durationMillis;
            }
            return this;
        }

        public Builder setLoiteringDelay(int loiteringDelayMs) {
            this.f2430xA = loiteringDelayMs;
            return this;
        }

        public Builder setNotificationResponsiveness(int notificationResponsivenessMs) {
            this.f2438xz = notificationResponsivenessMs;
            return this;
        }

        public Builder setRequestId(String requestId) {
            this.f2431xs = requestId;
            return this;
        }

        public Builder setTransitionTypes(int transitionTypes) {
            this.f2432xt = transitionTypes;
            return this;
        }
    }

    String getRequestId();
}
