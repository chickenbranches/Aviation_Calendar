package com.google.android.gms.internal;

import android.os.Process;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.cn */
public final class C0492cn {

    /* renamed from: iA */
    private static final ThreadPoolExecutor f1334iA = new ThreadPoolExecutor(0, 10, 65, TimeUnit.SECONDS, new SynchronousQueue(true), f1335iz);

    /* renamed from: iz */
    private static final ThreadFactory f1335iz = new ThreadFactory() {

        /* renamed from: iC */
        private final AtomicInteger f1337iC = new AtomicInteger(1);

        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "AdWorker #" + this.f1337iC.getAndIncrement());
        }
    };

    public static void execute(final Runnable task) {
        try {
            f1334iA.execute(new Runnable() {
                public void run() {
                    Process.setThreadPriority(10);
                    task.run();
                }
            });
        } catch (RejectedExecutionException e) {
            C0502ct.m1150b("Too many background threads already running. Aborting task.", e);
        }
    }
}
