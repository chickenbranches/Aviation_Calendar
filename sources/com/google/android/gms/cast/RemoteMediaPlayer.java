package com.google.android.gms.cast;

import com.google.android.gms.cast.Cast.MessageReceivedCallback;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.C0538dg;
import com.google.android.gms.internal.C0551dl;
import com.google.android.gms.internal.C0554dm;
import com.google.android.gms.internal.C0555dn;
import java.io.IOException;
import org.json.JSONObject;

public class RemoteMediaPlayer implements MessageReceivedCallback {
    public static final int RESUME_STATE_PAUSE = 2;
    public static final int RESUME_STATE_PLAY = 1;
    public static final int RESUME_STATE_UNCHANGED = 0;
    public static final int STATUS_CANCELED = 2;
    public static final int STATUS_FAILED = 1;
    public static final int STATUS_REPLACED = 4;
    public static final int STATUS_SUCCEEDED = 0;
    public static final int STATUS_TIMED_OUT = 3;
    /* access modifiers changed from: private */

    /* renamed from: fx */
    public final Object f195fx = new Object();
    /* access modifiers changed from: private */

    /* renamed from: ld */
    public final C0551dl f196ld = new C0551dl() {
        /* access modifiers changed from: protected */
        public void onMetadataUpdated() {
            RemoteMediaPlayer.this.onMetadataUpdated();
        }

        /* access modifiers changed from: protected */
        public void onStatusUpdated() {
            RemoteMediaPlayer.this.onStatusUpdated();
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: le */
    public final C0135a f197le = new C0135a();

    /* renamed from: lf */
    private OnMetadataUpdatedListener f198lf;

    /* renamed from: lg */
    private OnStatusUpdatedListener f199lg;

    public interface MediaChannelResult extends Result {
    }

    public interface OnMetadataUpdatedListener {
        void onMetadataUpdated();
    }

    public interface OnStatusUpdatedListener {
        void onStatusUpdated();
    }

    /* renamed from: com.google.android.gms.cast.RemoteMediaPlayer$a */
    private class C0135a implements C0554dm {

        /* renamed from: lr */
        private GoogleApiClient f223lr;

        /* renamed from: ls */
        private long f224ls = 0;

        /* renamed from: com.google.android.gms.cast.RemoteMediaPlayer$a$a */
        private final class C0136a implements ResultCallback<Status> {

            /* renamed from: lt */
            private final long f225lt;

            C0136a(long j) {
                this.f225lt = j;
            }

            /* renamed from: j */
            public void onResult(Status status) {
                if (!status.isSuccess()) {
                    RemoteMediaPlayer.this.f196ld.mo3764a(this.f225lt, status.getStatusCode());
                }
            }
        }

        public C0135a() {
        }

        /* renamed from: a */
        public void mo2261a(String str, String str2, long j, String str3) throws IOException {
            if (this.f223lr == null) {
                throw new IOException("No GoogleApiClient available");
            }
            Cast.CastApi.sendMessage(this.f223lr, str, str2).setResultCallback(new C0136a(j));
        }

        /* renamed from: aR */
        public long mo2262aR() {
            long j = this.f224ls + 1;
            this.f224ls = j;
            return j;
        }

        /* renamed from: b */
        public void mo2263b(GoogleApiClient googleApiClient) {
            this.f223lr = googleApiClient;
        }
    }

    /* renamed from: com.google.android.gms.cast.RemoteMediaPlayer$b */
    private static abstract class C0137b extends C0124a<MediaChannelResult> {

        /* renamed from: lv */
        C0555dn f227lv = new C0555dn() {
            /* renamed from: a */
            public void mo2267a(long j, int i, JSONObject jSONObject) {
                C0137b.this.mo2048a(new C0140c(new Status(i), jSONObject));
            }

            /* renamed from: g */
            public void mo2268g(long j) {
                C0137b.this.mo2048a(C0137b.this.mo2067e(new Status(4)));
            }
        };

        C0137b() {
        }

        /* renamed from: k */
        public MediaChannelResult mo2067e(final Status status) {
            return new MediaChannelResult() {
                public Status getStatus() {
                    return status;
                }
            };
        }
    }

    /* renamed from: com.google.android.gms.cast.RemoteMediaPlayer$c */
    private static final class C0140c implements MediaChannelResult {

        /* renamed from: jY */
        private final Status f231jY;

        /* renamed from: kM */
        private final JSONObject f232kM;

        C0140c(Status status, JSONObject jSONObject) {
            this.f231jY = status;
            this.f232kM = jSONObject;
        }

        public Status getStatus() {
            return this.f231jY;
        }
    }

    public RemoteMediaPlayer() {
        this.f196ld.mo3765a(this.f197le);
    }

    /* access modifiers changed from: private */
    public void onMetadataUpdated() {
        if (this.f198lf != null) {
            this.f198lf.onMetadataUpdated();
        }
    }

    /* access modifiers changed from: private */
    public void onStatusUpdated() {
        if (this.f199lg != null) {
            this.f199lg.onStatusUpdated();
        }
    }

    public long getApproximateStreamPosition() {
        long approximateStreamPosition;
        synchronized (this.f195fx) {
            approximateStreamPosition = this.f196ld.getApproximateStreamPosition();
        }
        return approximateStreamPosition;
    }

    public MediaInfo getMediaInfo() {
        MediaInfo mediaInfo;
        synchronized (this.f195fx) {
            mediaInfo = this.f196ld.getMediaInfo();
        }
        return mediaInfo;
    }

    public MediaStatus getMediaStatus() {
        MediaStatus mediaStatus;
        synchronized (this.f195fx) {
            mediaStatus = this.f196ld.getMediaStatus();
        }
        return mediaStatus;
    }

    public String getNamespace() {
        return this.f196ld.getNamespace();
    }

    public long getStreamDuration() {
        long streamDuration;
        synchronized (this.f195fx) {
            streamDuration = this.f196ld.getStreamDuration();
        }
        return streamDuration;
    }

    public PendingResult<MediaChannelResult> load(GoogleApiClient apiClient, MediaInfo mediaInfo) {
        return load(apiClient, mediaInfo, true, 0, null);
    }

    public PendingResult<MediaChannelResult> load(GoogleApiClient apiClient, MediaInfo mediaInfo, boolean autoplay) {
        return load(apiClient, mediaInfo, autoplay, 0, null);
    }

    public PendingResult<MediaChannelResult> load(GoogleApiClient apiClient, MediaInfo mediaInfo, boolean autoplay, long playPosition) {
        return load(apiClient, mediaInfo, autoplay, playPosition, null);
    }

    public PendingResult<MediaChannelResult> load(GoogleApiClient apiClient, MediaInfo mediaInfo, boolean autoplay, long playPosition, JSONObject customData) {
        final GoogleApiClient googleApiClient = apiClient;
        final MediaInfo mediaInfo2 = mediaInfo;
        final boolean z = autoplay;
        final long j = playPosition;
        final JSONObject jSONObject = customData;
        return apiClient.mo2304b(new C0137b() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo2062a(C0538dg dgVar) {
                synchronized (RemoteMediaPlayer.this.f195fx) {
                    RemoteMediaPlayer.this.f197le.mo2263b(googleApiClient);
                    try {
                        RemoteMediaPlayer.this.f196ld.mo3822a(this.f227lv, mediaInfo2, z, j, jSONObject);
                        RemoteMediaPlayer.this.f197le.mo2263b(null);
                    } catch (IOException e) {
                        mo2048a(mo2067e(new Status(1)));
                        RemoteMediaPlayer.this.f197le.mo2263b(null);
                    } catch (Throwable th) {
                        RemoteMediaPlayer.this.f197le.mo2263b(null);
                        throw th;
                    }
                }
            }
        });
    }

    public void onMessageReceived(CastDevice castDevice, String namespace, String message) {
        this.f196ld.mo3763B(message);
    }

    public void pause(GoogleApiClient apiClient) throws IOException {
        pause(apiClient, null);
    }

    public void pause(GoogleApiClient apiClient, JSONObject customData) throws IOException {
        synchronized (this.f195fx) {
            this.f197le.mo2263b(apiClient);
            try {
                this.f196ld.mo3825c(customData);
                this.f197le.mo2263b(null);
            } catch (Throwable th) {
                this.f197le.mo2263b(null);
                throw th;
            }
        }
    }

    public void play(GoogleApiClient apiClient) throws IOException, IllegalStateException {
        play(apiClient, null);
    }

    public void play(GoogleApiClient apiClient, JSONObject customData) throws IOException, IllegalStateException {
        synchronized (this.f195fx) {
            this.f197le.mo2263b(apiClient);
            try {
                this.f196ld.mo3827e(customData);
                this.f197le.mo2263b(null);
            } catch (Throwable th) {
                this.f197le.mo2263b(null);
                throw th;
            }
        }
    }

    public PendingResult<MediaChannelResult> requestStatus(final GoogleApiClient apiClient) {
        return apiClient.mo2304b(new C0137b() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo2062a(C0538dg dgVar) {
                synchronized (RemoteMediaPlayer.this.f195fx) {
                    RemoteMediaPlayer.this.f197le.mo2263b(apiClient);
                    try {
                        RemoteMediaPlayer.this.f196ld.mo3819a(this.f227lv);
                        RemoteMediaPlayer.this.f197le.mo2263b(null);
                    } catch (IOException e) {
                        mo2048a(mo2067e(new Status(1)));
                        RemoteMediaPlayer.this.f197le.mo2263b(null);
                    } catch (Throwable th) {
                        RemoteMediaPlayer.this.f197le.mo2263b(null);
                        throw th;
                    }
                }
            }
        });
    }

    public PendingResult<MediaChannelResult> seek(GoogleApiClient apiClient, long position) {
        return seek(apiClient, position, 0, null);
    }

    public PendingResult<MediaChannelResult> seek(GoogleApiClient apiClient, long position, int resumeState) {
        return seek(apiClient, position, resumeState, null);
    }

    public PendingResult<MediaChannelResult> seek(GoogleApiClient apiClient, long position, int resumeState, JSONObject customData) {
        final GoogleApiClient googleApiClient = apiClient;
        final long j = position;
        final int i = resumeState;
        final JSONObject jSONObject = customData;
        return apiClient.mo2304b(new C0137b() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo2062a(C0538dg dgVar) {
                synchronized (RemoteMediaPlayer.this.f195fx) {
                    RemoteMediaPlayer.this.f197le.mo2263b(googleApiClient);
                    try {
                        RemoteMediaPlayer.this.f196ld.mo3821a(this.f227lv, j, i, jSONObject);
                        RemoteMediaPlayer.this.f197le.mo2263b(null);
                    } catch (IOException e) {
                        mo2048a(mo2067e(new Status(1)));
                        RemoteMediaPlayer.this.f197le.mo2263b(null);
                    } catch (Throwable th) {
                        RemoteMediaPlayer.this.f197le.mo2263b(null);
                        throw th;
                    }
                }
            }
        });
    }

    public void setOnMetadataUpdatedListener(OnMetadataUpdatedListener listener) {
        this.f198lf = listener;
    }

    public void setOnStatusUpdatedListener(OnStatusUpdatedListener listener) {
        this.f199lg = listener;
    }

    public PendingResult<MediaChannelResult> setStreamMute(GoogleApiClient apiClient, boolean muteState) {
        return setStreamMute(apiClient, muteState, null);
    }

    public PendingResult<MediaChannelResult> setStreamMute(final GoogleApiClient apiClient, final boolean muteState, final JSONObject customData) {
        return apiClient.mo2304b(new C0137b() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo2062a(C0538dg dgVar) {
                synchronized (RemoteMediaPlayer.this.f195fx) {
                    RemoteMediaPlayer.this.f197le.mo2263b(apiClient);
                    try {
                        RemoteMediaPlayer.this.f196ld.mo3823a(this.f227lv, muteState, customData);
                        RemoteMediaPlayer.this.f197le.mo2263b(null);
                    } catch (IllegalStateException e) {
                        mo2048a(mo2067e(new Status(1)));
                        RemoteMediaPlayer.this.f197le.mo2263b(null);
                    } catch (IOException e2) {
                        mo2048a(mo2067e(new Status(1)));
                        RemoteMediaPlayer.this.f197le.mo2263b(null);
                    } catch (Throwable th) {
                        RemoteMediaPlayer.this.f197le.mo2263b(null);
                        throw th;
                    }
                }
            }
        });
    }

    public PendingResult<MediaChannelResult> setStreamVolume(GoogleApiClient apiClient, double volume) throws IllegalArgumentException {
        return setStreamVolume(apiClient, volume, null);
    }

    public PendingResult<MediaChannelResult> setStreamVolume(GoogleApiClient apiClient, double volume, JSONObject customData) throws IllegalArgumentException {
        if (Double.isInfinite(volume) || Double.isNaN(volume)) {
            throw new IllegalArgumentException("Volume cannot be " + volume);
        }
        final GoogleApiClient googleApiClient = apiClient;
        final double d = volume;
        final JSONObject jSONObject = customData;
        return apiClient.mo2304b(new C0137b() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo2062a(C0538dg dgVar) {
                synchronized (RemoteMediaPlayer.this.f195fx) {
                    RemoteMediaPlayer.this.f197le.mo2263b(googleApiClient);
                    try {
                        RemoteMediaPlayer.this.f196ld.mo3820a(this.f227lv, d, jSONObject);
                        RemoteMediaPlayer.this.f197le.mo2263b(null);
                    } catch (IllegalStateException e) {
                        mo2048a(mo2067e(new Status(1)));
                        RemoteMediaPlayer.this.f197le.mo2263b(null);
                    } catch (IllegalArgumentException e2) {
                        mo2048a(mo2067e(new Status(1)));
                        RemoteMediaPlayer.this.f197le.mo2263b(null);
                    } catch (IOException e3) {
                        mo2048a(mo2067e(new Status(1)));
                        RemoteMediaPlayer.this.f197le.mo2263b(null);
                    } catch (Throwable th) {
                        RemoteMediaPlayer.this.f197le.mo2263b(null);
                        throw th;
                    }
                }
                return;
            }
        });
    }

    public void stop(GoogleApiClient apiClient) throws IOException {
        stop(apiClient, null);
    }

    public void stop(GoogleApiClient apiClient, JSONObject customData) throws IOException {
        synchronized (this.f195fx) {
            this.f197le.mo2263b(apiClient);
            try {
                this.f196ld.mo3826d(customData);
                this.f197le.mo2263b(null);
            } catch (Throwable th) {
                this.f197le.mo2263b(null);
                throw th;
            }
        }
    }
}
