package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.google.android.gms.common.a */
public class C0143a implements ServiceConnection {

    /* renamed from: mA */
    private final BlockingQueue<IBinder> f251mA = new LinkedBlockingQueue();

    /* renamed from: mz */
    boolean f252mz = false;

    /* renamed from: bg */
    public IBinder mo2294bg() throws InterruptedException {
        if (this.f252mz) {
            throw new IllegalStateException();
        }
        this.f252mz = true;
        return (IBinder) this.f251mA.take();
    }

    public void onServiceConnected(ComponentName name, IBinder service) {
        try {
            this.f251mA.put(service);
        } catch (InterruptedException e) {
        }
    }

    public void onServiceDisconnected(ComponentName name) {
    }
}
