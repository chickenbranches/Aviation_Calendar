package com.google.android.gms.internal;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.SystemClock;
import android.support.p000v4.view.MotionEventCompat;

/* renamed from: com.google.android.gms.internal.dq */
public final class C0558dq extends Drawable implements Callback {

    /* renamed from: oB */
    private int f1471oB;

    /* renamed from: oC */
    private long f1472oC;

    /* renamed from: oD */
    private int f1473oD;

    /* renamed from: oE */
    private int f1474oE;

    /* renamed from: oF */
    private int f1475oF;

    /* renamed from: oG */
    private int f1476oG;

    /* renamed from: oH */
    private int f1477oH;

    /* renamed from: oI */
    private boolean f1478oI;

    /* renamed from: oJ */
    private C0562b f1479oJ;

    /* renamed from: oK */
    private Drawable f1480oK;

    /* renamed from: oL */
    private Drawable f1481oL;

    /* renamed from: oM */
    private boolean f1482oM;

    /* renamed from: oN */
    private boolean f1483oN;

    /* renamed from: oO */
    private boolean f1484oO;

    /* renamed from: oP */
    private int f1485oP;

    /* renamed from: oy */
    private boolean f1486oy;

    /* renamed from: com.google.android.gms.internal.dq$a */
    private static final class C0560a extends Drawable {
        /* access modifiers changed from: private */

        /* renamed from: oQ */
        public static final C0560a f1487oQ = new C0560a();

        /* renamed from: oR */
        private static final C0561a f1488oR = new C0561a();

        /* renamed from: com.google.android.gms.internal.dq$a$a */
        private static final class C0561a extends ConstantState {
            private C0561a() {
            }

            public int getChangingConfigurations() {
                return 0;
            }

            public Drawable newDrawable() {
                return C0560a.f1487oQ;
            }
        }

        private C0560a() {
        }

        public void draw(Canvas canvas) {
        }

        public ConstantState getConstantState() {
            return f1488oR;
        }

        public int getOpacity() {
            return -2;
        }

        public void setAlpha(int alpha) {
        }

        public void setColorFilter(ColorFilter cf) {
        }
    }

    /* renamed from: com.google.android.gms.internal.dq$b */
    static final class C0562b extends ConstantState {

        /* renamed from: oS */
        int f1489oS;

        /* renamed from: oT */
        int f1490oT;

        C0562b(C0562b bVar) {
            if (bVar != null) {
                this.f1489oS = bVar.f1489oS;
                this.f1490oT = bVar.f1490oT;
            }
        }

        public int getChangingConfigurations() {
            return this.f1489oS;
        }

        public Drawable newDrawable() {
            return new C0558dq(this);
        }
    }

    public C0558dq(Drawable drawable, Drawable drawable2) {
        this(null);
        if (drawable == null) {
            drawable = C0560a.f1487oQ;
        }
        this.f1480oK = drawable;
        drawable.setCallback(this);
        this.f1479oJ.f1490oT |= drawable.getChangingConfigurations();
        if (drawable2 == null) {
            drawable2 = C0560a.f1487oQ;
        }
        this.f1481oL = drawable2;
        drawable2.setCallback(this);
        this.f1479oJ.f1490oT |= drawable2.getChangingConfigurations();
    }

    C0558dq(C0562b bVar) {
        this.f1471oB = 0;
        this.f1475oF = MotionEventCompat.ACTION_MASK;
        this.f1477oH = 0;
        this.f1486oy = true;
        this.f1479oJ = new C0562b(bVar);
    }

    /* renamed from: bC */
    public Drawable mo3840bC() {
        return this.f1481oL;
    }

    public boolean canConstantState() {
        if (!this.f1482oM) {
            this.f1483oN = (this.f1480oK.getConstantState() == null || this.f1481oL.getConstantState() == null) ? false : true;
            this.f1482oM = true;
        }
        return this.f1483oN;
    }

    public void draw(Canvas canvas) {
        boolean z = true;
        boolean z2 = false;
        switch (this.f1471oB) {
            case 1:
                this.f1472oC = SystemClock.uptimeMillis();
                this.f1471oB = 2;
                break;
            case 2:
                if (this.f1472oC >= 0) {
                    float uptimeMillis = ((float) (SystemClock.uptimeMillis() - this.f1472oC)) / ((float) this.f1476oG);
                    if (uptimeMillis < 1.0f) {
                        z = false;
                    }
                    if (z) {
                        this.f1471oB = 0;
                    }
                    float min = Math.min(uptimeMillis, 1.0f);
                    this.f1477oH = (int) ((min * ((float) (this.f1474oE - this.f1473oD))) + ((float) this.f1473oD));
                    break;
                }
                break;
        }
        z2 = z;
        int i = this.f1477oH;
        boolean z3 = this.f1486oy;
        Drawable drawable = this.f1480oK;
        Drawable drawable2 = this.f1481oL;
        if (z2) {
            if (!z3 || i == 0) {
                drawable.draw(canvas);
            }
            if (i == this.f1475oF) {
                drawable2.setAlpha(this.f1475oF);
                drawable2.draw(canvas);
                return;
            }
            return;
        }
        if (z3) {
            drawable.setAlpha(this.f1475oF - i);
        }
        drawable.draw(canvas);
        if (z3) {
            drawable.setAlpha(this.f1475oF);
        }
        if (i > 0) {
            drawable2.setAlpha(i);
            drawable2.draw(canvas);
            drawable2.setAlpha(this.f1475oF);
        }
        invalidateSelf();
    }

    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f1479oJ.f1489oS | this.f1479oJ.f1490oT;
    }

    public ConstantState getConstantState() {
        if (!canConstantState()) {
            return null;
        }
        this.f1479oJ.f1489oS = getChangingConfigurations();
        return this.f1479oJ;
    }

    public int getIntrinsicHeight() {
        return Math.max(this.f1480oK.getIntrinsicHeight(), this.f1481oL.getIntrinsicHeight());
    }

    public int getIntrinsicWidth() {
        return Math.max(this.f1480oK.getIntrinsicWidth(), this.f1481oL.getIntrinsicWidth());
    }

    public int getOpacity() {
        if (!this.f1484oO) {
            this.f1485oP = Drawable.resolveOpacity(this.f1480oK.getOpacity(), this.f1481oL.getOpacity());
            this.f1484oO = true;
        }
        return this.f1485oP;
    }

    public void invalidateDrawable(Drawable who) {
        if (C0633fg.m1703cD()) {
            Callback callback = getCallback();
            if (callback != null) {
                callback.invalidateDrawable(this);
            }
        }
    }

    public Drawable mutate() {
        if (!this.f1478oI && super.mutate() == this) {
            if (!canConstantState()) {
                throw new IllegalStateException("One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.");
            }
            this.f1480oK.mutate();
            this.f1481oL.mutate();
            this.f1478oI = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect bounds) {
        this.f1480oK.setBounds(bounds);
        this.f1481oL.setBounds(bounds);
    }

    public void scheduleDrawable(Drawable who, Runnable what, long when) {
        if (C0633fg.m1703cD()) {
            Callback callback = getCallback();
            if (callback != null) {
                callback.scheduleDrawable(this, what, when);
            }
        }
    }

    public void setAlpha(int alpha) {
        if (this.f1477oH == this.f1475oF) {
            this.f1477oH = alpha;
        }
        this.f1475oF = alpha;
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter cf) {
        this.f1480oK.setColorFilter(cf);
        this.f1481oL.setColorFilter(cf);
    }

    public void startTransition(int durationMillis) {
        this.f1473oD = 0;
        this.f1474oE = this.f1475oF;
        this.f1477oH = 0;
        this.f1476oG = durationMillis;
        this.f1471oB = 1;
        invalidateSelf();
    }

    public void unscheduleDrawable(Drawable who, Runnable what) {
        if (C0633fg.m1703cD()) {
            Callback callback = getCallback();
            if (callback != null) {
                callback.unscheduleDrawable(this, what);
            }
        }
    }
}
