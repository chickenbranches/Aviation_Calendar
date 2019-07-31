package com.google.android.gms.cast;

import android.text.TextUtils;
import com.google.android.gms.internal.C0544dh;
import com.google.android.gms.internal.C0596ee;
import com.google.android.gms.internal.C0631fe;
import org.json.JSONException;
import org.json.JSONObject;

public final class MediaInfo {
    public static final int STREAM_TYPE_BUFFERED = 1;
    public static final int STREAM_TYPE_INVALID = -1;
    public static final int STREAM_TYPE_LIVE = 2;
    public static final int STREAM_TYPE_NONE = 0;

    /* renamed from: kH */
    private final String f170kH;

    /* renamed from: kI */
    private int f171kI;

    /* renamed from: kJ */
    private String f172kJ;

    /* renamed from: kK */
    private MediaMetadata f173kK;

    /* renamed from: kL */
    private long f174kL;

    /* renamed from: kM */
    private JSONObject f175kM;

    public static class Builder {

        /* renamed from: kN */
        private final MediaInfo f176kN;

        public Builder(String contentId) throws IllegalArgumentException {
            if (TextUtils.isEmpty(contentId)) {
                throw new IllegalArgumentException("Content ID cannot be empty");
            }
            this.f176kN = new MediaInfo(contentId);
        }

        public MediaInfo build() throws IllegalArgumentException {
            this.f176kN.mo2172aO();
            return this.f176kN;
        }

        public Builder setContentType(String contentType) throws IllegalArgumentException {
            this.f176kN.setContentType(contentType);
            return this;
        }

        public Builder setCustomData(JSONObject customData) {
            this.f176kN.mo2171a(customData);
            return this;
        }

        public Builder setMetadata(MediaMetadata metadata) {
            this.f176kN.mo2170a(metadata);
            return this;
        }

        public Builder setStreamDuration(long duration) throws IllegalArgumentException {
            this.f176kN.mo2175f(duration);
            return this;
        }

        public Builder setStreamType(int streamType) throws IllegalArgumentException {
            this.f176kN.setStreamType(streamType);
            return this;
        }
    }

    MediaInfo(String contentId) throws IllegalArgumentException {
        if (TextUtils.isEmpty(contentId)) {
            throw new IllegalArgumentException("content ID cannot be null or empty");
        }
        this.f170kH = contentId;
        this.f171kI = -1;
    }

    MediaInfo(JSONObject json) throws JSONException {
        this.f170kH = json.getString("contentId");
        String string = json.getString("streamType");
        if ("NONE".equals(string)) {
            this.f171kI = 0;
        } else if ("BUFFERED".equals(string)) {
            this.f171kI = 1;
        } else if ("LIVE".equals(string)) {
            this.f171kI = 2;
        } else {
            this.f171kI = -1;
        }
        this.f172kJ = json.getString("contentType");
        if (json.has("metadata")) {
            JSONObject jSONObject = json.getJSONObject("metadata");
            this.f173kK = new MediaMetadata(jSONObject.getInt("metadataType"));
            this.f173kK.mo2193b(jSONObject);
        }
        this.f174kL = C0544dh.m1308b(json.optDouble("duration", 0.0d));
        this.f175kM = json.optJSONObject("customData");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2170a(MediaMetadata mediaMetadata) {
        this.f173kK = mediaMetadata;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2171a(JSONObject jSONObject) {
        this.f175kM = jSONObject;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: aO */
    public void mo2172aO() throws IllegalArgumentException {
        if (TextUtils.isEmpty(this.f170kH)) {
            throw new IllegalArgumentException("content ID cannot be null or empty");
        } else if (TextUtils.isEmpty(this.f172kJ)) {
            throw new IllegalArgumentException("content type cannot be null or empty");
        } else if (this.f171kI == -1) {
            throw new IllegalArgumentException("a valid stream type must be specified");
        }
    }

    /* renamed from: aP */
    public JSONObject mo2173aP() {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("contentId", this.f170kH);
            switch (this.f171kI) {
                case 1:
                    str = "BUFFERED";
                    break;
                case 2:
                    str = "LIVE";
                    break;
                default:
                    str = "NONE";
                    break;
            }
            jSONObject.put("streamType", str);
            if (this.f172kJ != null) {
                jSONObject.put("contentType", this.f172kJ);
            }
            if (this.f173kK != null) {
                jSONObject.put("metadata", this.f173kK.mo2191aP());
            }
            jSONObject.put("duration", C0544dh.m1309h(this.f174kL));
            if (this.f175kM != null) {
                jSONObject.put("customData", this.f175kM);
            }
        } catch (JSONException e) {
        }
        return jSONObject;
    }

    public boolean equals(Object other) {
        boolean z = true;
        if (this == other) {
            return true;
        }
        if (!(other instanceof MediaInfo)) {
            return false;
        }
        MediaInfo mediaInfo = (MediaInfo) other;
        if ((this.f175kM == null) != (mediaInfo.f175kM == null)) {
            return false;
        }
        if (this.f175kM != null && mediaInfo.f175kM != null && !C0631fe.m1700d(this.f175kM, mediaInfo.f175kM)) {
            return false;
        }
        if (!C0544dh.m1307a(this.f170kH, mediaInfo.f170kH) || this.f171kI != mediaInfo.f171kI || !C0544dh.m1307a(this.f172kJ, mediaInfo.f172kJ) || !C0544dh.m1307a(this.f173kK, mediaInfo.f173kK) || this.f174kL != mediaInfo.f174kL) {
            z = false;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo2175f(long j) throws IllegalArgumentException {
        if (j < 0) {
            throw new IllegalArgumentException("Stream duration cannot be negative");
        }
        this.f174kL = j;
    }

    public String getContentId() {
        return this.f170kH;
    }

    public String getContentType() {
        return this.f172kJ;
    }

    public JSONObject getCustomData() {
        return this.f175kM;
    }

    public MediaMetadata getMetadata() {
        return this.f173kK;
    }

    public long getStreamDuration() {
        return this.f174kL;
    }

    public int getStreamType() {
        return this.f171kI;
    }

    public int hashCode() {
        return C0596ee.hashCode(this.f170kH, Integer.valueOf(this.f171kI), this.f172kJ, this.f173kK, Long.valueOf(this.f174kL), String.valueOf(this.f175kM));
    }

    /* access modifiers changed from: 0000 */
    public void setContentType(String contentType) throws IllegalArgumentException {
        if (TextUtils.isEmpty(contentType)) {
            throw new IllegalArgumentException("content type cannot be null or empty");
        }
        this.f172kJ = contentType;
    }

    /* access modifiers changed from: 0000 */
    public void setStreamType(int streamType) throws IllegalArgumentException {
        if (streamType < -1 || streamType > 2) {
            throw new IllegalArgumentException("invalid stream type");
        }
        this.f171kI = streamType;
    }
}
