package com.google.android.gms.cast;

import com.google.android.gms.internal.C0544dh;
import org.json.JSONException;
import org.json.JSONObject;

public final class MediaStatus {
    public static final long COMMAND_PAUSE = 1;
    public static final long COMMAND_SEEK = 2;
    public static final long COMMAND_SET_VOLUME = 4;
    public static final long COMMAND_SKIP_BACKWARD = 32;
    public static final long COMMAND_SKIP_FORWARD = 16;
    public static final long COMMAND_TOGGLE_MUTE = 8;
    public static final int IDLE_REASON_CANCELED = 2;
    public static final int IDLE_REASON_ERROR = 4;
    public static final int IDLE_REASON_FINISHED = 1;
    public static final int IDLE_REASON_INTERRUPTED = 3;
    public static final int IDLE_REASON_NONE = 0;
    public static final int PLAYER_STATE_BUFFERING = 4;
    public static final int PLAYER_STATE_IDLE = 1;
    public static final int PLAYER_STATE_PAUSED = 3;
    public static final int PLAYER_STATE_PLAYING = 2;
    public static final int PLAYER_STATE_UNKNOWN = 0;

    /* renamed from: kM */
    private JSONObject f185kM;

    /* renamed from: kN */
    private MediaInfo f186kN;

    /* renamed from: kV */
    private long f187kV;

    /* renamed from: kW */
    private double f188kW;

    /* renamed from: kX */
    private int f189kX;

    /* renamed from: kY */
    private int f190kY;

    /* renamed from: kZ */
    private long f191kZ;

    /* renamed from: la */
    private long f192la;

    /* renamed from: lb */
    private double f193lb;

    /* renamed from: lc */
    private boolean f194lc;

    public MediaStatus(JSONObject json) throws JSONException {
        mo2216a(json, 0);
    }

    /* renamed from: a */
    public int mo2216a(JSONObject jSONObject, int i) throws JSONException {
        int i2;
        int i3 = 2;
        long j = jSONObject.getLong("mediaSessionId");
        if (j != this.f187kV) {
            this.f187kV = j;
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (jSONObject.has("playerState")) {
            String string = jSONObject.getString("playerState");
            int i4 = string.equals("IDLE") ? 1 : string.equals("PLAYING") ? 2 : string.equals("PAUSED") ? 3 : string.equals("BUFFERING") ? 4 : 0;
            if (i4 != this.f189kX) {
                this.f189kX = i4;
                i2 |= 2;
            }
            if (i4 == 1 && jSONObject.has("idleReason")) {
                String string2 = jSONObject.getString("idleReason");
                if (!string2.equals("CANCELLED")) {
                    i3 = string2.equals("INTERRUPTED") ? 3 : string2.equals("FINISHED") ? 1 : string2.equals("ERROR") ? 4 : 0;
                }
                if (i3 != this.f190kY) {
                    this.f190kY = i3;
                    i2 |= 2;
                }
            }
        }
        if (jSONObject.has("playbackRate")) {
            double d = jSONObject.getDouble("playbackRate");
            if (this.f188kW != d) {
                this.f188kW = d;
                i2 |= 2;
            }
        }
        if (jSONObject.has("currentTime") && (i & 2) == 0) {
            long b = C0544dh.m1308b(jSONObject.getDouble("currentTime"));
            if (b != this.f191kZ) {
                this.f191kZ = b;
                i2 |= 2;
            }
        }
        if (jSONObject.has("supportedMediaCommands")) {
            long j2 = jSONObject.getLong("supportedMediaCommands");
            if (j2 != this.f192la) {
                this.f192la = j2;
                i2 |= 2;
            }
        }
        if (jSONObject.has("volume") && (i & 1) == 0) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("volume");
            double d2 = jSONObject2.getDouble("level");
            if (d2 != this.f193lb) {
                this.f193lb = d2;
                i2 |= 2;
            }
            boolean z = jSONObject2.getBoolean("muted");
            if (z != this.f194lc) {
                this.f194lc = z;
                i2 |= 2;
            }
        }
        if (jSONObject.has("customData")) {
            this.f185kM = jSONObject.getJSONObject("customData");
            i2 |= 2;
        }
        if (!jSONObject.has("media")) {
            return i2;
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("media");
        this.f186kN = new MediaInfo(jSONObject3);
        int i5 = i2 | 2;
        return jSONObject3.has("metadata") ? i5 | 4 : i5;
    }

    /* renamed from: aQ */
    public long mo2217aQ() {
        return this.f187kV;
    }

    public JSONObject getCustomData() {
        return this.f185kM;
    }

    public int getIdleReason() {
        return this.f190kY;
    }

    public MediaInfo getMediaInfo() {
        return this.f186kN;
    }

    public double getPlaybackRate() {
        return this.f188kW;
    }

    public int getPlayerState() {
        return this.f189kX;
    }

    public long getStreamPosition() {
        return this.f191kZ;
    }

    public double getStreamVolume() {
        return this.f193lb;
    }

    public boolean isMediaCommandSupported(long mediaCommand) {
        return (this.f192la & mediaCommand) != 0;
    }

    public boolean isMute() {
        return this.f194lc;
    }
}
