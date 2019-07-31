package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageButton;

/* renamed from: com.google.android.gms.internal.bp */
public final class C0447bp extends FrameLayout implements OnClickListener {

    /* renamed from: gZ */
    private final ImageButton f1209gZ;

    /* renamed from: gs */
    private final Activity f1210gs;

    public C0447bp(Activity activity, int i) {
        super(activity);
        this.f1210gs = activity;
        setOnClickListener(this);
        this.f1209gZ = new ImageButton(activity);
        this.f1209gZ.setImageResource(17301527);
        this.f1209gZ.setBackgroundColor(0);
        this.f1209gZ.setOnClickListener(this);
        this.f1209gZ.setPadding(0, 0, 0, 0);
        int a = C0501cs.m1140a((Context) activity, i);
        addView(this.f1209gZ, new LayoutParams(a, a, 17));
    }

    /* renamed from: g */
    public void mo3612g(boolean z) {
        this.f1209gZ.setVisibility(z ? 4 : 0);
    }

    public void onClick(View view) {
        this.f1210gs.finish();
    }
}
