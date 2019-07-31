package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.internal.C0501cs;
import com.google.android.gms.internal.C0964x;

public final class AdSize {
    public static final int AUTO_HEIGHT = -2;
    public static final AdSize BANNER = new AdSize(320, 50, "320x50_mb");
    public static final AdSize FULL_BANNER = new AdSize(468, 60, "468x60_as");
    public static final int FULL_WIDTH = -1;
    public static final AdSize LEADERBOARD = new AdSize(728, 90, "728x90_as");
    public static final AdSize MEDIUM_RECTANGLE = new AdSize(300, 250, "300x250_as");
    public static final AdSize SMART_BANNER = new AdSize(-1, -2, "smart_banner");
    public static final AdSize WIDE_SKYSCRAPER = new AdSize(160, 600, "160x600_as");

    /* renamed from: dY */
    private final String f44dY;

    /* renamed from: v */
    private final int f45v;

    /* renamed from: w */
    private final int f46w;

    public AdSize(int width, int height) {
        this(width, height, (width == -1 ? "FULL" : String.valueOf(width)) + "x" + (height == -2 ? "AUTO" : String.valueOf(height)) + "_as");
    }

    AdSize(int width, int height, String formatString) {
        if (width < 0 && width != -1) {
            throw new IllegalArgumentException("Invalid width for AdSize: " + width);
        } else if (height >= 0 || height == -2) {
            this.f46w = width;
            this.f45v = height;
            this.f44dY = formatString;
        } else {
            throw new IllegalArgumentException("Invalid height for AdSize: " + height);
        }
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof AdSize)) {
            return false;
        }
        AdSize adSize = (AdSize) other;
        return this.f46w == adSize.f46w && this.f45v == adSize.f45v && this.f44dY.equals(adSize.f44dY);
    }

    public int getHeight() {
        return this.f45v;
    }

    public int getHeightInPixels(Context context) {
        return this.f45v == -2 ? C0964x.m3015b(context.getResources().getDisplayMetrics()) : C0501cs.m1140a(context, this.f45v);
    }

    public int getWidth() {
        return this.f46w;
    }

    public int getWidthInPixels(Context context) {
        return this.f46w == -1 ? C0964x.m3014a(context.getResources().getDisplayMetrics()) : C0501cs.m1140a(context, this.f46w);
    }

    public int hashCode() {
        return this.f44dY.hashCode();
    }

    public boolean isAutoHeight() {
        return this.f45v == -2;
    }

    public boolean isFullWidth() {
        return this.f46w == -1;
    }

    public String toString() {
        return this.f44dY;
    }
}
