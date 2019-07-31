package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Result;
import java.util.concurrent.TimeUnit;

public interface PendingResult<R extends Result> {

    /* renamed from: com.google.android.gms.common.api.PendingResult$a */
    public interface C0152a {
        /* renamed from: l */
        void mo2339l(Status status);
    }

    R await();

    R await(long j, TimeUnit timeUnit);

    /* renamed from: e */
    R mo2067e(Status status);

    void setResultCallback(ResultCallback<R> resultCallback);
}
