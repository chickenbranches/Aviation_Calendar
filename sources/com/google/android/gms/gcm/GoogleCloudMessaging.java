package com.google.android.gms.gcm;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import com.google.android.gms.common.GooglePlayServicesUtil;
import java.io.IOException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class GoogleCloudMessaging {
    public static final String ERROR_MAIN_THREAD = "MAIN_THREAD";
    public static final String ERROR_SERVICE_NOT_AVAILABLE = "SERVICE_NOT_AVAILABLE";
    public static final String MESSAGE_TYPE_DELETED = "deleted_messages";
    public static final String MESSAGE_TYPE_MESSAGE = "gcm";
    public static final String MESSAGE_TYPE_SEND_ERROR = "send_error";

    /* renamed from: xf */
    static GoogleCloudMessaging f830xf;

    /* renamed from: eh */
    private Context f831eh;

    /* renamed from: xg */
    private PendingIntent f832xg;

    /* renamed from: xh */
    final BlockingQueue<Intent> f833xh = new LinkedBlockingQueue();

    /* renamed from: xi */
    private Handler f834xi = new Handler(Looper.getMainLooper()) {
        public void handleMessage(Message msg) {
            GoogleCloudMessaging.this.f833xh.add((Intent) msg.obj);
        }
    };

    /* renamed from: xj */
    private Messenger f835xj = new Messenger(this.f834xi);

    /* renamed from: b */
    private void m825b(String... strArr) {
        String c = mo3409c(strArr);
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage(GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_PACKAGE);
        intent.putExtra("google.messenger", this.f835xj);
        mo3410c(intent);
        intent.putExtra("sender", c);
        this.f831eh.startService(intent);
    }

    /* renamed from: dz */
    private void m826dz() {
        Intent intent = new Intent("com.google.android.c2dm.intent.UNREGISTER");
        intent.setPackage(GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_PACKAGE);
        this.f833xh.clear();
        intent.putExtra("google.messenger", this.f835xj);
        mo3410c(intent);
        this.f831eh.startService(intent);
    }

    public static synchronized GoogleCloudMessaging getInstance(Context context) {
        GoogleCloudMessaging googleCloudMessaging;
        synchronized (GoogleCloudMessaging.class) {
            if (f830xf == null) {
                f830xf = new GoogleCloudMessaging();
                f830xf.f831eh = context;
            }
            googleCloudMessaging = f830xf;
        }
        return googleCloudMessaging;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public String mo3409c(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            throw new IllegalArgumentException("No senderIds");
        }
        StringBuilder sb = new StringBuilder(strArr[0]);
        for (int i = 1; i < strArr.length; i++) {
            sb.append(',').append(strArr[i]);
        }
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public synchronized void mo3410c(Intent intent) {
        if (this.f832xg == null) {
            this.f832xg = PendingIntent.getBroadcast(this.f831eh, 0, new Intent(), 0);
        }
        intent.putExtra("app", this.f832xg);
    }

    public void close() {
        mo3412dA();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: dA */
    public synchronized void mo3412dA() {
        if (this.f832xg != null) {
            this.f832xg.cancel();
            this.f832xg = null;
        }
    }

    public String getMessageType(Intent intent) {
        if (!"com.google.android.c2dm.intent.RECEIVE".equals(intent.getAction())) {
            return null;
        }
        String stringExtra = intent.getStringExtra("message_type");
        return stringExtra == null ? MESSAGE_TYPE_MESSAGE : stringExtra;
    }

    public String register(String... senderIds) throws IOException {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IOException(ERROR_MAIN_THREAD);
        }
        this.f833xh.clear();
        m825b(senderIds);
        try {
            Intent intent = (Intent) this.f833xh.poll(5000, TimeUnit.MILLISECONDS);
            if (intent == null) {
                throw new IOException(ERROR_SERVICE_NOT_AVAILABLE);
            }
            String stringExtra = intent.getStringExtra("registration_id");
            if (stringExtra != null) {
                return stringExtra;
            }
            intent.getStringExtra("error");
            String stringExtra2 = intent.getStringExtra("error");
            if (stringExtra2 != null) {
                throw new IOException(stringExtra2);
            }
            throw new IOException(ERROR_SERVICE_NOT_AVAILABLE);
        } catch (InterruptedException e) {
            throw new IOException(e.getMessage());
        }
    }

    public void send(String to, String msgId, long timeToLive, Bundle data) throws IOException {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IOException(ERROR_MAIN_THREAD);
        } else if (to == null) {
            throw new IllegalArgumentException("Missing 'to'");
        } else {
            Intent intent = new Intent("com.google.android.gcm.intent.SEND");
            intent.putExtras(data);
            mo3410c(intent);
            intent.putExtra("google.to", to);
            intent.putExtra("google.message_id", msgId);
            intent.putExtra("google.ttl", Long.toString(timeToLive));
            this.f831eh.sendOrderedBroadcast(intent, null);
        }
    }

    public void send(String to, String msgId, Bundle data) throws IOException {
        send(to, msgId, -1, data);
    }

    public void unregister() throws IOException {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IOException(ERROR_MAIN_THREAD);
        }
        m826dz();
        try {
            Intent intent = (Intent) this.f833xh.poll(5000, TimeUnit.MILLISECONDS);
            if (intent == null) {
                throw new IOException(ERROR_SERVICE_NOT_AVAILABLE);
            } else if (intent.getStringExtra("unregistered") == null) {
                String stringExtra = intent.getStringExtra("error");
                if (stringExtra != null) {
                    throw new IOException(stringExtra);
                }
                throw new IOException(ERROR_SERVICE_NOT_AVAILABLE);
            }
        } catch (InterruptedException e) {
            throw new IOException(e.getMessage());
        }
    }
}
