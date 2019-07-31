package com.google.android.gms.ads.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.internal.C0364ag;

public final class SearchAdView extends ViewGroup {

    /* renamed from: dZ */
    private final C0364ag f87dZ;

    public SearchAdView(Context context) {
        super(context);
        this.f87dZ = new C0364ag(this);
    }

    public SearchAdView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f87dZ = new C0364ag(this, attrs, false);
    }

    public SearchAdView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.f87dZ = new C0364ag(this, attrs, false);
    }

    public void destroy() {
        this.f87dZ.destroy();
    }

    public AdListener getAdListener() {
        return this.f87dZ.getAdListener();
    }

    public AdSize getAdSize() {
        return this.f87dZ.getAdSize();
    }

    public String getAdUnitId() {
        return this.f87dZ.getAdUnitId();
    }

    public void loadAd(SearchAdRequest searchAdRequest) {
        this.f87dZ.mo3474a(searchAdRequest.mo1988v());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        View childAt = getChildAt(0);
        if (childAt != null && childAt.getVisibility() != 8) {
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i = ((right - left) - measuredWidth) / 2;
            int i2 = ((bottom - top) - measuredHeight) / 2;
            childAt.layout(i, i2, measuredWidth + i, measuredHeight + i2);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int i;
        int i2 = 0;
        View childAt = getChildAt(0);
        AdSize adSize = getAdSize();
        if (childAt != null && childAt.getVisibility() != 8) {
            measureChild(childAt, widthMeasureSpec, heightMeasureSpec);
            i = childAt.getMeasuredWidth();
            i2 = childAt.getMeasuredHeight();
        } else if (adSize != null) {
            Context context = getContext();
            i = adSize.getWidthInPixels(context);
            i2 = adSize.getHeightInPixels(context);
        } else {
            i = 0;
        }
        setMeasuredDimension(View.resolveSize(Math.max(i, getSuggestedMinimumWidth()), widthMeasureSpec), View.resolveSize(Math.max(i2, getSuggestedMinimumHeight()), heightMeasureSpec));
    }

    public void pause() {
        this.f87dZ.pause();
    }

    public void resume() {
        this.f87dZ.resume();
    }

    public void setAdListener(AdListener adListener) {
        this.f87dZ.setAdListener(adListener);
    }

    public void setAdSize(AdSize adSize) {
        this.f87dZ.setAdSizes(adSize);
    }

    public void setAdUnitId(String adUnitId) {
        this.f87dZ.setAdUnitId(adUnitId);
    }
}
