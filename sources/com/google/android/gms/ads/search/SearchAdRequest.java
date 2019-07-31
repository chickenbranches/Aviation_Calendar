package com.google.android.gms.ads.search;

import android.content.Context;
import android.graphics.Color;
import android.location.Location;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.internal.C0362af;
import com.google.android.gms.internal.C0362af.C0363a;

public final class SearchAdRequest {
    public static final int BORDER_TYPE_DASHED = 1;
    public static final int BORDER_TYPE_DOTTED = 2;
    public static final int BORDER_TYPE_NONE = 0;
    public static final int BORDER_TYPE_SOLID = 3;
    public static final int CALL_BUTTON_COLOR_DARK = 2;
    public static final int CALL_BUTTON_COLOR_LIGHT = 0;
    public static final int CALL_BUTTON_COLOR_MEDIUM = 1;
    public static final String DEVICE_ID_EMULATOR = C0362af.DEVICE_ID_EMULATOR;
    public static final int ERROR_CODE_INTERNAL_ERROR = 0;
    public static final int ERROR_CODE_INVALID_REQUEST = 1;
    public static final int ERROR_CODE_NETWORK_ERROR = 2;
    public static final int ERROR_CODE_NO_FILL = 3;

    /* renamed from: dW */
    private final C0362af f57dW;

    /* renamed from: jj */
    private final int f58jj;

    /* renamed from: jk */
    private final int f59jk;

    /* renamed from: jl */
    private final int f60jl;

    /* renamed from: jm */
    private final int f61jm;

    /* renamed from: jn */
    private final int f62jn;

    /* renamed from: jo */
    private final int f63jo;

    /* renamed from: jp */
    private final int f64jp;

    /* renamed from: jq */
    private final int f65jq;

    /* renamed from: jr */
    private final String f66jr;

    /* renamed from: js */
    private final int f67js;

    /* renamed from: jt */
    private final String f68jt;

    /* renamed from: ju */
    private final int f69ju;

    /* renamed from: jv */
    private final int f70jv;

    /* renamed from: jw */
    private final String f71jw;

    public static final class Builder {
        /* access modifiers changed from: private */

        /* renamed from: dX */
        public final C0363a f72dX = new C0363a();
        /* access modifiers changed from: private */

        /* renamed from: jj */
        public int f73jj;
        /* access modifiers changed from: private */

        /* renamed from: jk */
        public int f74jk;
        /* access modifiers changed from: private */

        /* renamed from: jl */
        public int f75jl;
        /* access modifiers changed from: private */

        /* renamed from: jm */
        public int f76jm;
        /* access modifiers changed from: private */

        /* renamed from: jn */
        public int f77jn;
        /* access modifiers changed from: private */

        /* renamed from: jo */
        public int f78jo;
        /* access modifiers changed from: private */

        /* renamed from: jp */
        public int f79jp = 0;
        /* access modifiers changed from: private */

        /* renamed from: jq */
        public int f80jq;
        /* access modifiers changed from: private */

        /* renamed from: jr */
        public String f81jr;
        /* access modifiers changed from: private */

        /* renamed from: js */
        public int f82js;
        /* access modifiers changed from: private */

        /* renamed from: jt */
        public String f83jt;
        /* access modifiers changed from: private */

        /* renamed from: ju */
        public int f84ju;
        /* access modifiers changed from: private */

        /* renamed from: jv */
        public int f85jv;
        /* access modifiers changed from: private */

        /* renamed from: jw */
        public String f86jw;

        public Builder addNetworkExtras(NetworkExtras networkExtras) {
            this.f72dX.mo3466a(networkExtras);
            return this;
        }

        public Builder addTestDevice(String deviceId) {
            this.f72dX.mo3472h(deviceId);
            return this;
        }

        public SearchAdRequest build() {
            return new SearchAdRequest(this);
        }

        public Builder setAnchorTextColor(int anchorTextColor) {
            this.f73jj = anchorTextColor;
            return this;
        }

        public Builder setBackgroundColor(int backgroundColor) {
            this.f74jk = backgroundColor;
            this.f75jl = Color.argb(0, 0, 0, 0);
            this.f76jm = Color.argb(0, 0, 0, 0);
            return this;
        }

        public Builder setBackgroundGradient(int top, int bottom) {
            this.f74jk = Color.argb(0, 0, 0, 0);
            this.f75jl = bottom;
            this.f76jm = top;
            return this;
        }

        public Builder setBorderColor(int borderColor) {
            this.f77jn = borderColor;
            return this;
        }

        public Builder setBorderThickness(int borderThickness) {
            this.f78jo = borderThickness;
            return this;
        }

        public Builder setBorderType(int borderType) {
            this.f79jp = borderType;
            return this;
        }

        public Builder setCallButtonColor(int callButtonColor) {
            this.f80jq = callButtonColor;
            return this;
        }

        public Builder setCustomChannels(String channelIds) {
            this.f81jr = channelIds;
            return this;
        }

        public Builder setDescriptionTextColor(int descriptionTextColor) {
            this.f82js = descriptionTextColor;
            return this;
        }

        public Builder setFontFace(String fontFace) {
            this.f83jt = fontFace;
            return this;
        }

        public Builder setHeaderTextColor(int headerTextColor) {
            this.f84ju = headerTextColor;
            return this;
        }

        public Builder setHeaderTextSize(int headerTextSize) {
            this.f85jv = headerTextSize;
            return this;
        }

        public Builder setLocation(Location location) {
            this.f72dX.mo3465a(location);
            return this;
        }

        public Builder setQuery(String query) {
            this.f86jw = query;
            return this;
        }

        public Builder tagForChildDirectedTreatment(boolean tagForChildDirectedTreatment) {
            this.f72dX.mo3470e(tagForChildDirectedTreatment);
            return this;
        }
    }

    private SearchAdRequest(Builder builder) {
        this.f58jj = builder.f73jj;
        this.f59jk = builder.f74jk;
        this.f60jl = builder.f75jl;
        this.f61jm = builder.f76jm;
        this.f62jn = builder.f77jn;
        this.f63jo = builder.f78jo;
        this.f64jp = builder.f79jp;
        this.f65jq = builder.f80jq;
        this.f66jr = builder.f81jr;
        this.f67js = builder.f82js;
        this.f68jt = builder.f83jt;
        this.f69ju = builder.f84ju;
        this.f70jv = builder.f85jv;
        this.f71jw = builder.f86jw;
        this.f57dW = new C0362af(builder.f72dX, this);
    }

    public int getAnchorTextColor() {
        return this.f58jj;
    }

    public int getBackgroundColor() {
        return this.f59jk;
    }

    public int getBackgroundGradientBottom() {
        return this.f60jl;
    }

    public int getBackgroundGradientTop() {
        return this.f61jm;
    }

    public int getBorderColor() {
        return this.f62jn;
    }

    public int getBorderThickness() {
        return this.f63jo;
    }

    public int getBorderType() {
        return this.f64jp;
    }

    public int getCallButtonColor() {
        return this.f65jq;
    }

    public String getCustomChannels() {
        return this.f66jr;
    }

    public int getDescriptionTextColor() {
        return this.f67js;
    }

    public String getFontFace() {
        return this.f68jt;
    }

    public int getHeaderTextColor() {
        return this.f69ju;
    }

    public int getHeaderTextSize() {
        return this.f70jv;
    }

    public Location getLocation() {
        return this.f57dW.getLocation();
    }

    public <T extends NetworkExtras> T getNetworkExtras(Class<T> networkExtrasClass) {
        return this.f57dW.getNetworkExtras(networkExtrasClass);
    }

    public String getQuery() {
        return this.f71jw;
    }

    public boolean isTestDevice(Context context) {
        return this.f57dW.isTestDevice(context);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: v */
    public C0362af mo1988v() {
        return this.f57dW;
    }
}
