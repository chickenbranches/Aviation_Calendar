package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.Button;
import com.google.android.gms.C0083R;

/* renamed from: com.google.android.gms.internal.ei */
public final class C0602ei extends Button {
    public C0602ei(Context context) {
        this(context, null);
    }

    public C0602ei(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 16842824);
    }

    /* renamed from: b */
    private int m1561b(int i, int i2, int i3) {
        switch (i) {
            case 0:
                return i2;
            case 1:
                return i3;
            default:
                throw new IllegalStateException("Unknown color scheme: " + i);
        }
    }

    /* renamed from: b */
    private void m1562b(Resources resources, int i, int i2) {
        int b;
        switch (i) {
            case 0:
            case 1:
                b = m1561b(i2, C0083R.C0084drawable.common_signin_btn_text_dark, C0083R.C0084drawable.common_signin_btn_text_light);
                break;
            case 2:
                b = m1561b(i2, C0083R.C0084drawable.common_signin_btn_icon_dark, C0083R.C0084drawable.common_signin_btn_icon_light);
                break;
            default:
                throw new IllegalStateException("Unknown button size: " + i);
        }
        if (b == -1) {
            throw new IllegalStateException("Could not find background resource!");
        }
        setBackgroundDrawable(resources.getDrawable(b));
    }

    /* renamed from: c */
    private void m1563c(Resources resources) {
        setTypeface(Typeface.DEFAULT_BOLD);
        setTextSize(14.0f);
        float f = resources.getDisplayMetrics().density;
        setMinHeight((int) ((f * 48.0f) + 0.5f));
        setMinWidth((int) ((f * 48.0f) + 0.5f));
    }

    /* renamed from: c */
    private void m1564c(Resources resources, int i, int i2) {
        setTextColor(resources.getColorStateList(m1561b(i2, C0083R.color.common_signin_btn_text_dark, C0083R.color.common_signin_btn_text_light)));
        switch (i) {
            case 0:
                setText(resources.getString(C0083R.string.common_signin_button_text));
                return;
            case 1:
                setText(resources.getString(C0083R.string.common_signin_button_text_long));
                return;
            case 2:
                setText(null);
                return;
            default:
                throw new IllegalStateException("Unknown button size: " + i);
        }
    }

    /* renamed from: a */
    public void mo3978a(Resources resources, int i, int i2) {
        boolean z = true;
        C0600eg.m1550a(i >= 0 && i < 3, "Unknown button size " + i);
        if (i2 < 0 || i2 >= 2) {
            z = false;
        }
        C0600eg.m1550a(z, "Unknown color scheme " + i2);
        m1563c(resources);
        m1562b(resources, i, i2);
        m1564c(resources, i, i2);
    }
}
