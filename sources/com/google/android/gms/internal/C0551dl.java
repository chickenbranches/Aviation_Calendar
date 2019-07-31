package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaStatus;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.dl */
public class C0551dl extends C0537df {

    /* renamed from: me */
    private static final long f1448me = TimeUnit.SECONDS.toMillis(3);

    /* renamed from: mf */
    private static final long f1449mf = TimeUnit.HOURS.toMillis(24);

    /* renamed from: mg */
    private static final long f1450mg = TimeUnit.SECONDS.toMillis(5);

    /* renamed from: mh */
    private static final long f1451mh = TimeUnit.SECONDS.toMillis(1);
    private final Handler mHandler = new Handler(Looper.getMainLooper());

    /* renamed from: mi */
    private long f1452mi;

    /* renamed from: mj */
    private MediaStatus f1453mj;
    /* access modifiers changed from: private */

    /* renamed from: mk */
    public final C0556do f1454mk = new C0556do(f1449mf);
    /* access modifiers changed from: private */

    /* renamed from: ml */
    public final C0556do f1455ml = new C0556do(f1450mg);
    /* access modifiers changed from: private */

    /* renamed from: mm */
    public final C0556do f1456mm = new C0556do(f1448me);
    /* access modifiers changed from: private */

    /* renamed from: mn */
    public final C0556do f1457mn = new C0556do(f1448me);
    /* access modifiers changed from: private */

    /* renamed from: mo */
    public final C0556do f1458mo = new C0556do(f1448me);

    /* renamed from: mp */
    private final Runnable f1459mp = new C0553a();
    /* access modifiers changed from: private */

    /* renamed from: mq */
    public boolean f1460mq;

    /* renamed from: com.google.android.gms.internal.dl$a */
    private class C0553a implements Runnable {
        private C0553a() {
        }

        public void run() {
            boolean z = false;
            C0551dl.this.f1460mq = false;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C0551dl.this.f1454mk.mo3838d(elapsedRealtime, 3);
            C0551dl.this.f1455ml.mo3838d(elapsedRealtime, 3);
            C0551dl.this.f1456mm.mo3838d(elapsedRealtime, 3);
            C0551dl.this.f1457mn.mo3838d(elapsedRealtime, 3);
            C0551dl.this.f1458mo.mo3838d(elapsedRealtime, 3);
            synchronized (C0556do.f1463mw) {
                if (C0551dl.this.f1454mk.mo3835bf() || C0551dl.this.f1455ml.mo3835bf() || C0551dl.this.f1456mm.mo3835bf() || C0551dl.this.f1457mn.mo3835bf() || C0551dl.this.f1458mo.mo3835bf()) {
                    z = true;
                }
            }
            C0551dl.this.m1357o(z);
        }
    }

    public C0551dl() {
        super("urn:x-cast:com.google.cast.media", "MediaControlChannel");
        m1353bd();
    }

    /* renamed from: a */
    private void m1349a(long j, JSONObject jSONObject) throws JSONException {
        int i;
        boolean z = true;
        boolean i2 = this.f1454mk.mo3839i(j);
        boolean z2 = this.f1455ml.mo3835bf() && !this.f1455ml.mo3839i(j);
        if ((!this.f1456mm.mo3835bf() || this.f1456mm.mo3839i(j)) && (!this.f1457mn.mo3835bf() || this.f1457mn.mo3839i(j))) {
            z = false;
        }
        int i3 = z2 ? 2 : 0;
        if (z) {
            i3 |= 1;
        }
        if (i2 || this.f1453mj == null) {
            this.f1453mj = new MediaStatus(jSONObject);
            this.f1452mi = SystemClock.elapsedRealtime();
            i = 7;
        } else {
            i = this.f1453mj.mo2216a(jSONObject, i3);
        }
        if ((i & 1) != 0) {
            this.f1452mi = SystemClock.elapsedRealtime();
            onStatusUpdated();
        }
        if ((i & 2) != 0) {
            this.f1452mi = SystemClock.elapsedRealtime();
            onStatusUpdated();
        }
        if ((i & 4) != 0) {
            onMetadataUpdated();
        }
        this.f1454mk.mo3836c(j, 0);
        this.f1455ml.mo3836c(j, 0);
        this.f1456mm.mo3836c(j, 0);
        this.f1457mn.mo3836c(j, 0);
        this.f1458mo.mo3836c(j, 0);
    }

    /* renamed from: bd */
    private void m1353bd() {
        m1357o(false);
        this.f1452mi = 0;
        this.f1453mj = null;
        this.f1454mk.clear();
        this.f1455ml.clear();
        this.f1456mm.clear();
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public void m1357o(boolean z) {
        if (this.f1460mq != z) {
            this.f1460mq = z;
            if (z) {
                this.mHandler.postDelayed(this.f1459mp, f1451mh);
            } else {
                this.mHandler.removeCallbacks(this.f1459mp);
            }
        }
    }

    /* renamed from: B */
    public final void mo3763B(String str) {
        this.f1405lx.mo3816b("message received: %s", str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("type");
            long optLong = jSONObject.optLong("requestId", -1);
            if (string.equals("MEDIA_STATUS")) {
                JSONArray jSONArray = jSONObject.getJSONArray("status");
                if (jSONArray.length() > 0) {
                    m1349a(optLong, jSONArray.getJSONObject(0));
                    return;
                }
                this.f1453mj = null;
                onStatusUpdated();
                onMetadataUpdated();
                this.f1458mo.mo3836c(optLong, 0);
            } else if (string.equals("INVALID_PLAYER_STATE")) {
                this.f1405lx.mo3818d("received unexpected error: Invalid Player State.", new Object[0]);
                JSONObject optJSONObject = jSONObject.optJSONObject("customData");
                this.f1454mk.mo3834b(optLong, 1, optJSONObject);
                this.f1455ml.mo3834b(optLong, 1, optJSONObject);
                this.f1456mm.mo3834b(optLong, 1, optJSONObject);
                this.f1457mn.mo3834b(optLong, 1, optJSONObject);
                this.f1458mo.mo3834b(optLong, 1, optJSONObject);
            } else if (string.equals("LOAD_FAILED")) {
                this.f1454mk.mo3834b(optLong, 1, jSONObject.optJSONObject("customData"));
            } else if (string.equals("LOAD_CANCELLED")) {
                this.f1454mk.mo3834b(optLong, 2, jSONObject.optJSONObject("customData"));
            } else if (string.equals("INVALID_REQUEST")) {
                this.f1405lx.mo3818d("received unexpected error: Invalid Request.", new Object[0]);
                JSONObject optJSONObject2 = jSONObject.optJSONObject("customData");
                this.f1454mk.mo3834b(optLong, 1, optJSONObject2);
                this.f1455ml.mo3834b(optLong, 1, optJSONObject2);
                this.f1456mm.mo3834b(optLong, 1, optJSONObject2);
                this.f1457mn.mo3834b(optLong, 1, optJSONObject2);
                this.f1458mo.mo3834b(optLong, 1, optJSONObject2);
            }
        } catch (JSONException e) {
            this.f1405lx.mo3818d("Message is malformed (%s); ignoring: %s", e.getMessage(), str);
        }
    }

    /* renamed from: a */
    public long mo3819a(C0555dn dnVar) throws IOException {
        JSONObject jSONObject = new JSONObject();
        long aS = mo3767aS();
        this.f1458mo.mo3833a(aS, dnVar);
        m1357o(true);
        try {
            jSONObject.put("requestId", aS);
            jSONObject.put("type", "GET_STATUS");
            if (this.f1453mj != null) {
                jSONObject.put("mediaSessionId", this.f1453mj.mo2217aQ());
            }
        } catch (JSONException e) {
        }
        mo3766a(jSONObject.toString(), aS, null);
        return aS;
    }

    /* renamed from: a */
    public long mo3820a(C0555dn dnVar, double d, JSONObject jSONObject) throws IOException, IllegalStateException, IllegalArgumentException {
        if (Double.isInfinite(d) || Double.isNaN(d)) {
            throw new IllegalArgumentException("Volume cannot be " + d);
        }
        JSONObject jSONObject2 = new JSONObject();
        long aS = mo3767aS();
        this.f1456mm.mo3833a(aS, dnVar);
        m1357o(true);
        try {
            jSONObject2.put("requestId", aS);
            jSONObject2.put("type", "SET_VOLUME");
            jSONObject2.put("mediaSessionId", mo3824aQ());
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("level", d);
            jSONObject2.put("volume", jSONObject3);
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException e) {
        }
        mo3766a(jSONObject2.toString(), aS, null);
        return aS;
    }

    /* renamed from: a */
    public long mo3821a(C0555dn dnVar, long j, int i, JSONObject jSONObject) throws IOException, IllegalStateException {
        JSONObject jSONObject2 = new JSONObject();
        long aS = mo3767aS();
        this.f1455ml.mo3833a(aS, dnVar);
        m1357o(true);
        try {
            jSONObject2.put("requestId", aS);
            jSONObject2.put("type", "SEEK");
            jSONObject2.put("mediaSessionId", mo3824aQ());
            jSONObject2.put("currentTime", C0544dh.m1309h(j));
            if (i == 1) {
                jSONObject2.put("resumeState", "PLAYBACK_START");
            } else if (i == 2) {
                jSONObject2.put("resumeState", "PLAYBACK_PAUSE");
            }
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException e) {
        }
        mo3766a(jSONObject2.toString(), aS, null);
        return aS;
    }

    /* renamed from: a */
    public long mo3822a(C0555dn dnVar, MediaInfo mediaInfo, boolean z, long j, JSONObject jSONObject) throws IOException {
        JSONObject jSONObject2 = new JSONObject();
        long aS = mo3767aS();
        this.f1454mk.mo3833a(aS, dnVar);
        m1357o(true);
        try {
            jSONObject2.put("requestId", aS);
            jSONObject2.put("type", "LOAD");
            jSONObject2.put("media", mediaInfo.mo2173aP());
            jSONObject2.put("autoplay", z);
            jSONObject2.put("currentTime", C0544dh.m1309h(j));
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException e) {
        }
        mo3766a(jSONObject2.toString(), aS, null);
        return aS;
    }

    /* renamed from: a */
    public long mo3823a(C0555dn dnVar, boolean z, JSONObject jSONObject) throws IOException, IllegalStateException {
        JSONObject jSONObject2 = new JSONObject();
        long aS = mo3767aS();
        this.f1457mn.mo3833a(aS, dnVar);
        m1357o(true);
        try {
            jSONObject2.put("requestId", aS);
            jSONObject2.put("type", "SET_VOLUME");
            jSONObject2.put("mediaSessionId", mo3824aQ());
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("muted", z);
            jSONObject2.put("volume", jSONObject3);
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException e) {
        }
        mo3766a(jSONObject2.toString(), aS, null);
        return aS;
    }

    /* renamed from: a */
    public void mo3764a(long j, int i) {
        this.f1454mk.mo3836c(j, i);
        this.f1455ml.mo3836c(j, i);
        this.f1456mm.mo3836c(j, i);
        this.f1457mn.mo3836c(j, i);
        this.f1458mo.mo3836c(j, i);
    }

    /* renamed from: aQ */
    public long mo3824aQ() throws IllegalStateException {
        if (this.f1453mj != null) {
            return this.f1453mj.mo2217aQ();
        }
        throw new IllegalStateException("No current media session");
    }

    /* renamed from: aT */
    public void mo3768aT() {
        m1353bd();
    }

    /* renamed from: c */
    public void mo3825c(JSONObject jSONObject) throws IOException {
        JSONObject jSONObject2 = new JSONObject();
        long aS = mo3767aS();
        try {
            jSONObject2.put("requestId", aS);
            jSONObject2.put("type", "PAUSE");
            jSONObject2.put("mediaSessionId", mo3824aQ());
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException e) {
        }
        mo3766a(jSONObject2.toString(), aS, null);
    }

    /* renamed from: d */
    public void mo3826d(JSONObject jSONObject) throws IOException {
        JSONObject jSONObject2 = new JSONObject();
        long aS = mo3767aS();
        try {
            jSONObject2.put("requestId", aS);
            jSONObject2.put("type", "STOP");
            jSONObject2.put("mediaSessionId", mo3824aQ());
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException e) {
        }
        mo3766a(jSONObject2.toString(), aS, null);
    }

    /* renamed from: e */
    public void mo3827e(JSONObject jSONObject) throws IOException, IllegalStateException {
        JSONObject jSONObject2 = new JSONObject();
        long aS = mo3767aS();
        try {
            jSONObject2.put("requestId", aS);
            jSONObject2.put("type", "PLAY");
            jSONObject2.put("mediaSessionId", mo3824aQ());
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException e) {
        }
        mo3766a(jSONObject2.toString(), aS, null);
    }

    public long getApproximateStreamPosition() {
        MediaInfo mediaInfo = getMediaInfo();
        if (mediaInfo == null || this.f1452mi == 0) {
            return 0;
        }
        double playbackRate = this.f1453mj.getPlaybackRate();
        long streamPosition = this.f1453mj.getStreamPosition();
        int playerState = this.f1453mj.getPlayerState();
        if (playbackRate == 0.0d || playerState != 2) {
            return streamPosition;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f1452mi;
        long j = elapsedRealtime < 0 ? 0 : elapsedRealtime;
        if (j == 0) {
            return streamPosition;
        }
        long streamDuration = mediaInfo.getStreamDuration();
        long j2 = streamPosition + ((long) (((double) j) * playbackRate));
        if (j2 <= streamDuration) {
            streamDuration = j2 < 0 ? 0 : j2;
        }
        return streamDuration;
    }

    public MediaInfo getMediaInfo() {
        if (this.f1453mj == null) {
            return null;
        }
        return this.f1453mj.getMediaInfo();
    }

    public MediaStatus getMediaStatus() {
        return this.f1453mj;
    }

    public long getStreamDuration() {
        MediaInfo mediaInfo = getMediaInfo();
        if (mediaInfo != null) {
            return mediaInfo.getStreamDuration();
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public void onMetadataUpdated() {
    }

    /* access modifiers changed from: protected */
    public void onStatusUpdated() {
    }
}
