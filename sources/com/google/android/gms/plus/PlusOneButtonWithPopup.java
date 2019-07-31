package com.google.android.gms.plus;

import android.app.PendingIntent;
import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.p000v4.widget.ExploreByTouchHelper;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.google.android.gms.internal.C0600eg;
import com.google.android.gms.internal.C0860hq;
import com.google.android.gms.internal.C0860hq.C0861a;
import com.google.android.gms.internal.C0873ht;

public final class PlusOneButtonWithPopup extends ViewGroup {

    /* renamed from: DB */
    private View f2678DB;

    /* renamed from: DC */
    private int f2679DC;

    /* renamed from: DH */
    private OnClickListener f2680DH;

    /* renamed from: iH */
    private String f2681iH;

    /* renamed from: jG */
    private String f2682jG;
    private int mSize;

    public PlusOneButtonWithPopup(Context context) {
        this(context, null);
    }

    public PlusOneButtonWithPopup(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.mSize = PlusOneButton.getSize(context, attrs);
        this.f2679DC = PlusOneButton.getAnnotation(context, attrs);
        this.f2678DB = new PlusOneDummyView(context, this.mSize);
        addView(this.f2678DB);
    }

    /* renamed from: c */
    private int m3255c(int i, int i2) {
        int mode = MeasureSpec.getMode(i);
        switch (mode) {
            case ExploreByTouchHelper.INVALID_ID /*-2147483648*/:
            case 1073741824:
                return MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(i) - i2, mode);
            default:
                return i;
        }
    }

    /* renamed from: eL */
    private void m3256eL() {
        if (this.f2678DB != null) {
            removeView(this.f2678DB);
        }
        this.f2678DB = C0873ht.m2638a(getContext(), this.mSize, this.f2679DC, this.f2681iH, this.f2682jG);
        if (this.f2680DH != null) {
            setOnClickListener(this.f2680DH);
        }
        addView(this.f2678DB);
    }

    /* renamed from: eM */
    private C0860hq m3257eM() throws RemoteException {
        C0860hq aw = C0861a.m2578aw((IBinder) this.f2678DB.getTag());
        if (aw != null) {
            return aw;
        }
        if (Log.isLoggable("PlusOneButtonWithPopup", 5)) {
            Log.w("PlusOneButtonWithPopup", "Failed to get PlusOneDelegate");
        }
        throw new RemoteException();
    }

    public void cancelClick() {
        if (this.f2678DB != null) {
            try {
                m3257eM().cancelClick();
            } catch (RemoteException e) {
            }
        }
    }

    public PendingIntent getResolution() {
        if (this.f2678DB != null) {
            try {
                return m3257eM().getResolution();
            } catch (RemoteException e) {
            }
        }
        return null;
    }

    public void initialize(String url, String accountName) {
        C0600eg.m1552b(url, (Object) "Url must not be null");
        this.f2681iH = url;
        this.f2682jG = accountName;
        m3256eL();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        this.f2678DB.layout(getPaddingLeft(), getPaddingTop(), (right - left) - getPaddingRight(), (bottom - top) - getPaddingBottom());
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        this.f2678DB.measure(m3255c(widthMeasureSpec, paddingLeft), m3255c(heightMeasureSpec, paddingTop));
        setMeasuredDimension(paddingLeft + this.f2678DB.getMeasuredWidth(), paddingTop + this.f2678DB.getMeasuredHeight());
    }

    public void reinitialize() {
        if (this.f2678DB != null) {
            try {
                m3257eM().reinitialize();
            } catch (RemoteException e) {
            }
        }
    }

    public void setAnnotation(int annotation) {
        this.f2679DC = annotation;
        m3256eL();
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.f2680DH = onClickListener;
        this.f2678DB.setOnClickListener(onClickListener);
    }

    public void setSize(int size) {
        this.mSize = size;
        m3256eL();
    }
}
