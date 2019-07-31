package com.google.android.gms.ads;

import android.content.Context;
import android.location.Location;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.internal.C0362af;
import com.google.android.gms.internal.C0362af.C0363a;
import java.util.Date;
import java.util.Set;

public final class AdRequest {
    public static final String DEVICE_ID_EMULATOR = C0362af.DEVICE_ID_EMULATOR;
    public static final int ERROR_CODE_INTERNAL_ERROR = 0;
    public static final int ERROR_CODE_INVALID_REQUEST = 1;
    public static final int ERROR_CODE_NETWORK_ERROR = 2;
    public static final int ERROR_CODE_NO_FILL = 3;
    public static final int GENDER_FEMALE = 2;
    public static final int GENDER_MALE = 1;
    public static final int GENDER_UNKNOWN = 0;

    /* renamed from: dW */
    private final C0362af f42dW;

    public static final class Builder {
        /* access modifiers changed from: private */

        /* renamed from: dX */
        public final C0363a f43dX = new C0363a();

        public Builder addKeyword(String keyword) {
            this.f43dX.mo3471g(keyword);
            return this;
        }

        public Builder addNetworkExtras(NetworkExtras networkExtras) {
            this.f43dX.mo3466a(networkExtras);
            return this;
        }

        public Builder addTestDevice(String deviceId) {
            this.f43dX.mo3472h(deviceId);
            return this;
        }

        public AdRequest build() {
            return new AdRequest(this);
        }

        public Builder setBirthday(Date birthday) {
            this.f43dX.mo3467a(birthday);
            return this;
        }

        public Builder setGender(int gender) {
            this.f43dX.mo3468d(gender);
            return this;
        }

        public Builder setLocation(Location location) {
            this.f43dX.mo3465a(location);
            return this;
        }

        public Builder tagForChildDirectedTreatment(boolean tagForChildDirectedTreatment) {
            this.f43dX.mo3470e(tagForChildDirectedTreatment);
            return this;
        }
    }

    private AdRequest(Builder builder) {
        this.f42dW = new C0362af(builder.f43dX);
    }

    public Date getBirthday() {
        return this.f42dW.getBirthday();
    }

    public int getGender() {
        return this.f42dW.getGender();
    }

    public Set<String> getKeywords() {
        return this.f42dW.getKeywords();
    }

    public Location getLocation() {
        return this.f42dW.getLocation();
    }

    public <T extends NetworkExtras> T getNetworkExtras(Class<T> networkExtrasClass) {
        return this.f42dW.getNetworkExtras(networkExtrasClass);
    }

    public boolean isTestDevice(Context context) {
        return this.f42dW.isTestDevice(context);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: v */
    public C0362af mo1884v() {
        return this.f42dW;
    }
}
