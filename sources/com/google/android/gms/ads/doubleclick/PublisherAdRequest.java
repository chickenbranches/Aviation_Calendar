package com.google.android.gms.ads.doubleclick;

import android.content.Context;
import android.location.Location;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.internal.C0362af;
import com.google.android.gms.internal.C0362af.C0363a;
import java.util.Date;
import java.util.Set;

public final class PublisherAdRequest {
    public static final String DEVICE_ID_EMULATOR = C0362af.DEVICE_ID_EMULATOR;
    public static final int ERROR_CODE_INTERNAL_ERROR = 0;
    public static final int ERROR_CODE_INVALID_REQUEST = 1;
    public static final int ERROR_CODE_NETWORK_ERROR = 2;
    public static final int ERROR_CODE_NO_FILL = 3;
    public static final int GENDER_FEMALE = 2;
    public static final int GENDER_MALE = 1;
    public static final int GENDER_UNKNOWN = 0;

    /* renamed from: dW */
    private final C0362af f49dW;

    public static final class Builder {
        /* access modifiers changed from: private */

        /* renamed from: dX */
        public final C0363a f50dX = new C0363a();

        public Builder addKeyword(String keyword) {
            this.f50dX.mo3471g(keyword);
            return this;
        }

        public Builder addNetworkExtras(NetworkExtras networkExtras) {
            this.f50dX.mo3466a(networkExtras);
            return this;
        }

        public Builder addTestDevice(String deviceId) {
            this.f50dX.mo3472h(deviceId);
            return this;
        }

        public PublisherAdRequest build() {
            return new PublisherAdRequest(this);
        }

        public Builder setBirthday(Date birthday) {
            this.f50dX.mo3467a(birthday);
            return this;
        }

        public Builder setGender(int gender) {
            this.f50dX.mo3468d(gender);
            return this;
        }

        public Builder setLocation(Location location) {
            this.f50dX.mo3465a(location);
            return this;
        }

        public Builder setManualImpressionsEnabled(boolean manualImpressionsEnabled) {
            this.f50dX.mo3469d(manualImpressionsEnabled);
            return this;
        }

        public Builder setPublisherProvidedId(String publisherProvidedId) {
            this.f50dX.mo3473i(publisherProvidedId);
            return this;
        }

        public Builder tagForChildDirectedTreatment(boolean tagForChildDirectedTreatment) {
            this.f50dX.mo3470e(tagForChildDirectedTreatment);
            return this;
        }
    }

    private PublisherAdRequest(Builder builder) {
        this.f49dW = new C0362af(builder.f50dX);
    }

    public Date getBirthday() {
        return this.f49dW.getBirthday();
    }

    public int getGender() {
        return this.f49dW.getGender();
    }

    public Set<String> getKeywords() {
        return this.f49dW.getKeywords();
    }

    public Location getLocation() {
        return this.f49dW.getLocation();
    }

    public boolean getManualImpressionsEnabled() {
        return this.f49dW.getManualImpressionsEnabled();
    }

    public <T extends NetworkExtras> T getNetworkExtras(Class<T> networkExtrasClass) {
        return this.f49dW.getNetworkExtras(networkExtrasClass);
    }

    public String getPublisherProvidedId() {
        return this.f49dW.getPublisherProvidedId();
    }

    public boolean isTestDevice(Context context) {
        return this.f49dW.isTestDevice(context);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: v */
    public C0362af mo1930v() {
        return this.f49dW;
    }
}
