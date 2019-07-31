package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C0544dh;
import com.google.android.gms.internal.C0596ee;
import com.google.android.gms.plus.PlusShare;
import org.json.JSONException;
import org.json.JSONObject;

public final class WebImage implements SafeParcelable {
    public static final Creator<WebImage> CREATOR = new C0172b();

    /* renamed from: kg */
    private final int f345kg;

    /* renamed from: oA */
    private final Uri f346oA;

    /* renamed from: v */
    private final int f347v;

    /* renamed from: w */
    private final int f348w;

    WebImage(int versionCode, Uri url, int width, int height) {
        this.f345kg = versionCode;
        this.f346oA = url;
        this.f348w = width;
        this.f347v = height;
    }

    public WebImage(Uri url) throws IllegalArgumentException {
        this(url, 0, 0);
    }

    public WebImage(Uri url, int width, int height) throws IllegalArgumentException {
        this(1, url, width, height);
        if (url == null) {
            throw new IllegalArgumentException("url cannot be null");
        } else if (width < 0 || height < 0) {
            throw new IllegalArgumentException("width and height must not be negative");
        }
    }

    public WebImage(JSONObject json) throws IllegalArgumentException {
        this(m275f(json), json.optInt("width", 0), json.optInt("height", 0));
    }

    /* renamed from: f */
    private static Uri m275f(JSONObject jSONObject) {
        Uri uri = null;
        if (!jSONObject.has(PlusShare.KEY_CALL_TO_ACTION_URL)) {
            return uri;
        }
        try {
            return Uri.parse(jSONObject.getString(PlusShare.KEY_CALL_TO_ACTION_URL));
        } catch (JSONException e) {
            return uri;
        }
    }

    /* renamed from: aP */
    public JSONObject mo2445aP() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(PlusShare.KEY_CALL_TO_ACTION_URL, this.f346oA.toString());
            jSONObject.put("width", this.f348w);
            jSONObject.put("height", this.f347v);
        } catch (JSONException e) {
        }
        return jSONObject;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof WebImage)) {
            return false;
        }
        WebImage webImage = (WebImage) other;
        return C0544dh.m1307a(this.f346oA, webImage.f346oA) && this.f348w == webImage.f348w && this.f347v == webImage.f347v;
    }

    public int getHeight() {
        return this.f347v;
    }

    public Uri getUrl() {
        return this.f346oA;
    }

    /* access modifiers changed from: 0000 */
    public int getVersionCode() {
        return this.f345kg;
    }

    public int getWidth() {
        return this.f348w;
    }

    public int hashCode() {
        return C0596ee.hashCode(this.f346oA, Integer.valueOf(this.f348w), Integer.valueOf(this.f347v));
    }

    public String toString() {
        return String.format("Image %dx%d %s", new Object[]{Integer.valueOf(this.f348w), Integer.valueOf(this.f347v), this.f346oA.toString()});
    }

    public void writeToParcel(Parcel out, int flags) {
        C0172b.m288a(this, out, flags);
    }
}
