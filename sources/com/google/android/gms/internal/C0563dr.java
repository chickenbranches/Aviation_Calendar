package com.google.android.gms.internal;

import android.graphics.Canvas;
import android.net.Uri;
import android.widget.ImageView;

/* renamed from: com.google.android.gms.internal.dr */
public final class C0563dr extends ImageView {

    /* renamed from: oU */
    private Uri f1491oU;

    /* renamed from: oV */
    private int f1492oV;

    /* renamed from: oW */
    private int f1493oW;

    /* renamed from: H */
    public void mo3865H(int i) {
        this.f1492oV = i;
    }

    /* renamed from: bE */
    public int mo3866bE() {
        return this.f1492oV;
    }

    /* renamed from: d */
    public void mo3867d(Uri uri) {
        this.f1491oU = uri;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f1493oW != 0) {
            canvas.drawColor(this.f1493oW);
        }
    }
}
