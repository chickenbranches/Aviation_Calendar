package com.google.android.gms.internal;

import android.content.Context;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.MediaController;
import android.widget.VideoView;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.bo */
public final class C0444bo extends FrameLayout implements OnCompletionListener, OnErrorListener, OnPreparedListener {

    /* renamed from: gQ */
    private final MediaController f1198gQ;

    /* renamed from: gR */
    private final C0445a f1199gR = new C0445a(this);

    /* renamed from: gS */
    private final VideoView f1200gS;

    /* renamed from: gT */
    private long f1201gT;

    /* renamed from: gU */
    private String f1202gU;

    /* renamed from: gv */
    private final C0505cw f1203gv;

    /* renamed from: com.google.android.gms.internal.bo$a */
    private static final class C0445a {

        /* renamed from: ep */
        private final Runnable f1204ep;
        /* access modifiers changed from: private */

        /* renamed from: gV */
        public volatile boolean f1205gV = false;

        public C0445a(final C0444bo boVar) {
            this.f1204ep = new Runnable() {

                /* renamed from: gW */
                private final WeakReference<C0444bo> f1206gW = new WeakReference<>(boVar);

                public void run() {
                    C0444bo boVar = (C0444bo) this.f1206gW.get();
                    if (!C0445a.this.f1205gV && boVar != null) {
                        boVar.mo3598ag();
                        C0445a.this.mo3609ah();
                    }
                }
            };
        }

        /* renamed from: ah */
        public void mo3609ah() {
            C0501cs.f1345iI.postDelayed(this.f1204ep, 250);
        }

        public void cancel() {
            this.f1205gV = true;
            C0501cs.f1345iI.removeCallbacks(this.f1204ep);
        }
    }

    public C0444bo(Context context, C0505cw cwVar) {
        super(context);
        this.f1203gv = cwVar;
        this.f1200gS = new VideoView(context);
        addView(this.f1200gS, new LayoutParams(-1, -1, 17));
        this.f1198gQ = new MediaController(context);
        this.f1199gR.mo3609ah();
        this.f1200gS.setOnCompletionListener(this);
        this.f1200gS.setOnPreparedListener(this);
        this.f1200gS.setOnErrorListener(this);
    }

    /* renamed from: a */
    private static void m998a(C0505cw cwVar, String str) {
        m1001a(cwVar, str, (Map<String, String>) new HashMap<String,String>(1));
    }

    /* renamed from: a */
    public static void m999a(C0505cw cwVar, String str, String str2) {
        boolean z = str2 == null;
        HashMap hashMap = new HashMap(z ? 2 : 3);
        hashMap.put("what", str);
        if (!z) {
            hashMap.put("extra", str2);
        }
        m1001a(cwVar, "error", (Map<String, String>) hashMap);
    }

    /* renamed from: a */
    private static void m1000a(C0505cw cwVar, String str, String str2, String str3) {
        HashMap hashMap = new HashMap(2);
        hashMap.put(str2, str3);
        m1001a(cwVar, str, (Map<String, String>) hashMap);
    }

    /* renamed from: a */
    private static void m1001a(C0505cw cwVar, String str, Map<String, String> map) {
        map.put("event", str);
        cwVar.mo3673a("onVideoEvent", map);
    }

    /* renamed from: af */
    public void mo3597af() {
        if (!TextUtils.isEmpty(this.f1202gU)) {
            this.f1200gS.setVideoPath(this.f1202gU);
        } else {
            m999a(this.f1203gv, "no_src", (String) null);
        }
    }

    /* renamed from: ag */
    public void mo3598ag() {
        long currentPosition = (long) this.f1200gS.getCurrentPosition();
        if (this.f1201gT != currentPosition) {
            m1000a(this.f1203gv, "timeupdate", "time", String.valueOf(((float) currentPosition) / 1000.0f));
            this.f1201gT = currentPosition;
        }
    }

    /* renamed from: b */
    public void mo3599b(MotionEvent motionEvent) {
        this.f1200gS.dispatchTouchEvent(motionEvent);
    }

    public void destroy() {
        this.f1199gR.cancel();
        this.f1200gS.stopPlayback();
    }

    /* renamed from: i */
    public void mo3601i(boolean z) {
        if (z) {
            this.f1200gS.setMediaController(this.f1198gQ);
            return;
        }
        this.f1198gQ.hide();
        this.f1200gS.setMediaController(null);
    }

    /* renamed from: n */
    public void mo3602n(String str) {
        this.f1202gU = str;
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        m998a(this.f1203gv, "ended");
    }

    public boolean onError(MediaPlayer mediaPlayer, int what, int extra) {
        m999a(this.f1203gv, String.valueOf(what), String.valueOf(extra));
        return true;
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        m1000a(this.f1203gv, "canplaythrough", "duration", String.valueOf(((float) this.f1200gS.getDuration()) / 1000.0f));
    }

    public void pause() {
        this.f1200gS.pause();
    }

    public void play() {
        this.f1200gS.start();
    }

    public void seekTo(int timeInMilliseconds) {
        this.f1200gS.seekTo(timeInMilliseconds);
    }
}
