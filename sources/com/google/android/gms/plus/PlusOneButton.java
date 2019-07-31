package com.google.android.gms.plus;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import com.google.android.gms.internal.C0600eg;
import com.google.android.gms.internal.C0603ej;
import com.google.android.gms.internal.C0873ht;

public final class PlusOneButton extends FrameLayout {
    public static final int ANNOTATION_BUBBLE = 1;
    public static final int ANNOTATION_INLINE = 2;
    public static final int ANNOTATION_NONE = 0;
    public static final int DEFAULT_ACTIVITY_REQUEST_CODE = -1;
    public static final int SIZE_MEDIUM = 1;
    public static final int SIZE_SMALL = 0;
    public static final int SIZE_STANDARD = 3;
    public static final int SIZE_TALL = 2;
    /* access modifiers changed from: private */

    /* renamed from: DB */
    public View f2671DB;

    /* renamed from: DC */
    private int f2672DC;
    /* access modifiers changed from: private */

    /* renamed from: DD */
    public int f2673DD;

    /* renamed from: DE */
    private OnPlusOneClickListener f2674DE;

    /* renamed from: iH */
    private String f2675iH;
    private int mSize;

    protected class DefaultOnPlusOneClickListener implements OnClickListener, OnPlusOneClickListener {

        /* renamed from: DF */
        private final OnPlusOneClickListener f2676DF;

        public DefaultOnPlusOneClickListener(OnPlusOneClickListener proxy) {
            this.f2676DF = proxy;
        }

        public void onClick(View view) {
            Intent intent = (Intent) PlusOneButton.this.f2671DB.getTag();
            if (this.f2676DF != null) {
                this.f2676DF.onPlusOneClick(intent);
            } else {
                onPlusOneClick(intent);
            }
        }

        public void onPlusOneClick(Intent intent) {
            Context context = PlusOneButton.this.getContext();
            if ((context instanceof Activity) && intent != null) {
                ((Activity) context).startActivityForResult(intent, PlusOneButton.this.f2673DD);
            }
        }
    }

    public interface OnPlusOneClickListener {
        void onPlusOneClick(Intent intent);
    }

    public PlusOneButton(Context context) {
        this(context, null);
    }

    public PlusOneButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.mSize = getSize(context, attrs);
        this.f2672DC = getAnnotation(context, attrs);
        this.f2673DD = -1;
        m3254p(getContext());
        if (isInEditMode()) {
        }
    }

    protected static int getAnnotation(Context context, AttributeSet attrs) {
        String a = C0603ej.m1566a("http://schemas.android.com/apk/lib/com.google.android.gms.plus", "annotation", context, attrs, true, false, "PlusOneButton");
        if ("INLINE".equalsIgnoreCase(a)) {
            return 2;
        }
        return !"NONE".equalsIgnoreCase(a) ? 1 : 0;
    }

    protected static int getSize(Context context, AttributeSet attrs) {
        String a = C0603ej.m1566a("http://schemas.android.com/apk/lib/com.google.android.gms.plus", "size", context, attrs, true, false, "PlusOneButton");
        if ("SMALL".equalsIgnoreCase(a)) {
            return 0;
        }
        if ("MEDIUM".equalsIgnoreCase(a)) {
            return 1;
        }
        return "TALL".equalsIgnoreCase(a) ? 2 : 3;
    }

    /* renamed from: p */
    private void m3254p(Context context) {
        if (this.f2671DB != null) {
            removeView(this.f2671DB);
        }
        this.f2671DB = C0873ht.m2637a(context, this.mSize, this.f2672DC, this.f2675iH, this.f2673DD);
        setOnPlusOneClickListener(this.f2674DE);
        addView(this.f2671DB);
    }

    public void initialize(String url, int activityRequestCode) {
        C0600eg.m1550a(getContext() instanceof Activity, "To use this method, the PlusOneButton must be placed in an Activity. Use initialize(PlusClient, String, OnPlusOneClickListener).");
        this.f2675iH = url;
        this.f2673DD = activityRequestCode;
        m3254p(getContext());
    }

    public void initialize(String url, OnPlusOneClickListener plusOneClickListener) {
        this.f2675iH = url;
        this.f2673DD = 0;
        m3254p(getContext());
        setOnPlusOneClickListener(plusOneClickListener);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        this.f2671DB.layout(0, 0, right - left, bottom - top);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        View view = this.f2671DB;
        measureChild(view, widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public void setAnnotation(int annotation) {
        this.f2672DC = annotation;
        m3254p(getContext());
    }

    public void setOnPlusOneClickListener(OnPlusOneClickListener listener) {
        this.f2674DE = listener;
        this.f2671DB.setOnClickListener(new DefaultOnPlusOneClickListener(listener));
    }

    public void setSize(int size) {
        this.mSize = size;
        m3254p(getContext());
    }
}
