package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.gms.C0083R;
import com.google.android.gms.ads.AdSize;

/* renamed from: com.google.android.gms.internal.aa */
public final class C0349aa {

    /* renamed from: eJ */
    private final AdSize[] f837eJ;

    /* renamed from: eK */
    private final String f838eK;

    public C0349aa(Context context, AttributeSet attributeSet) {
        boolean z = true;
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C0083R.styleable.AdsAttrs);
        String string = obtainAttributes.getString(0);
        String string2 = obtainAttributes.getString(1);
        boolean z2 = !TextUtils.isEmpty(string);
        if (TextUtils.isEmpty(string2)) {
            z = false;
        }
        if (z2 && !z) {
            this.f837eJ = m832f(string);
        } else if (!z2 && z) {
            this.f837eJ = m832f(string2);
        } else if (!z2 || !z) {
            throw new IllegalArgumentException("Required XML attribute \"adSize\" was missing.");
        } else {
            throw new IllegalArgumentException("Either XML attribute \"adSize\" or XML attribute \"supportedAdSizes\" should be specified, but not both.");
        }
        this.f838eK = obtainAttributes.getString(2);
        if (TextUtils.isEmpty(this.f838eK)) {
            throw new IllegalArgumentException("Required XML attribute \"adUnitId\" was missing.");
        }
    }

    /* renamed from: f */
    private static AdSize[] m832f(String str) {
        String[] split = str.split("\\s*,\\s*");
        AdSize[] adSizeArr = new AdSize[split.length];
        for (int i = 0; i < split.length; i++) {
            String trim = split[i].trim();
            if (trim.matches("^(\\d+|FULL_WIDTH)\\s*[xX]\\s*(\\d+|AUTO_HEIGHT)$")) {
                String[] split2 = trim.split("[xX]");
                split2[0] = split2[0].trim();
                split2[1] = split2[1].trim();
                try {
                    adSizeArr[i] = new AdSize("FULL_WIDTH".equals(split2[0]) ? -1 : Integer.parseInt(split2[0]), "AUTO_HEIGHT".equals(split2[1]) ? -2 : Integer.parseInt(split2[1]));
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": " + trim);
                }
            } else if ("BANNER".equals(trim)) {
                adSizeArr[i] = AdSize.BANNER;
            } else if ("FULL_BANNER".equals(trim)) {
                adSizeArr[i] = AdSize.FULL_BANNER;
            } else if ("LEADERBOARD".equals(trim)) {
                adSizeArr[i] = AdSize.LEADERBOARD;
            } else if ("MEDIUM_RECTANGLE".equals(trim)) {
                adSizeArr[i] = AdSize.MEDIUM_RECTANGLE;
            } else if ("SMART_BANNER".equals(trim)) {
                adSizeArr[i] = AdSize.SMART_BANNER;
            } else if ("WIDE_SKYSCRAPER".equals(trim)) {
                adSizeArr[i] = AdSize.WIDE_SKYSCRAPER;
            } else {
                throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": " + trim);
            }
        }
        if (adSizeArr.length != 0) {
            return adSizeArr;
        }
        throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": " + str);
    }

    /* renamed from: c */
    public AdSize[] mo3421c(boolean z) {
        if (z || this.f837eJ.length == 1) {
            return this.f837eJ;
        }
        throw new IllegalArgumentException("The adSizes XML attribute is only allowed on PublisherAdViews.");
    }

    public String getAdUnitId() {
        return this.f838eK;
    }
}
