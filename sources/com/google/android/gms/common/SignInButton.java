package com.google.android.gms.common;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.C0275e.C0276a;
import com.google.android.gms.internal.C0600eg;
import com.google.android.gms.internal.C0601eh;
import com.google.android.gms.internal.C0602ei;

public final class SignInButton extends FrameLayout implements OnClickListener {
    public static final int COLOR_DARK = 0;
    public static final int COLOR_LIGHT = 1;
    public static final int SIZE_ICON_ONLY = 2;
    public static final int SIZE_STANDARD = 0;
    public static final int SIZE_WIDE = 1;

    /* renamed from: mP */
    private int f248mP;

    /* renamed from: mQ */
    private View f249mQ;

    /* renamed from: mR */
    private OnClickListener f250mR;
    private int mSize;

    public SignInButton(Context context) {
        this(context, null);
    }

    public SignInButton(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public SignInButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.f250mR = null;
        setStyle(0, 0);
    }

    /* renamed from: c */
    private static Button m179c(Context context, int i, int i2) {
        C0602ei eiVar = new C0602ei(context);
        eiVar.mo3978a(context.getResources(), i, i2);
        return eiVar;
    }

    /* renamed from: p */
    private void m180p(Context context) {
        if (this.f249mQ != null) {
            removeView(this.f249mQ);
        }
        try {
            this.f249mQ = C0601eh.m1557d(context, this.mSize, this.f248mP);
        } catch (C0276a e) {
            Log.w("SignInButton", "Sign in button not found, using placeholder instead");
            this.f249mQ = m179c(context, this.mSize, this.f248mP);
        }
        addView(this.f249mQ);
        this.f249mQ.setEnabled(isEnabled());
        this.f249mQ.setOnClickListener(this);
    }

    public void onClick(View view) {
        if (this.f250mR != null && view == this.f249mQ) {
            this.f250mR.onClick(this);
        }
    }

    public void setColorScheme(int colorScheme) {
        setStyle(this.mSize, colorScheme);
    }

    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        this.f249mQ.setEnabled(enabled);
    }

    public void setOnClickListener(OnClickListener listener) {
        this.f250mR = listener;
        if (this.f249mQ != null) {
            this.f249mQ.setOnClickListener(this);
        }
    }

    public void setSize(int buttonSize) {
        setStyle(buttonSize, this.f248mP);
    }

    public void setStyle(int buttonSize, int colorScheme) {
        boolean z = true;
        C0600eg.m1550a(buttonSize >= 0 && buttonSize < 3, "Unknown button size " + buttonSize);
        if (colorScheme < 0 || colorScheme >= 2) {
            z = false;
        }
        C0600eg.m1550a(z, "Unknown color scheme " + colorScheme);
        this.mSize = buttonSize;
        this.f248mP = colorScheme;
        m180p(getContext());
    }
}
