package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.view.View;
import com.google.android.gms.dynamic.C0273c;
import com.google.android.gms.dynamic.C0275e;
import com.google.android.gms.dynamic.C0275e.C0276a;
import com.google.android.gms.internal.C0593ed.C0594a;

/* renamed from: com.google.android.gms.internal.eh */
public final class C0601eh extends C0275e<C0593ed> {

    /* renamed from: pP */
    private static final C0601eh f1559pP = new C0601eh();

    private C0601eh() {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }

    /* renamed from: d */
    public static View m1557d(Context context, int i, int i2) throws C0276a {
        return f1559pP.m1558e(context, i, i2);
    }

    /* renamed from: e */
    private View m1558e(Context context, int i, int i2) throws C0276a {
        try {
            return (View) C0273c.m633b(((C0593ed) mo2843t(context)).mo3968a(C0273c.m634h(context), i, i2));
        } catch (Exception e) {
            throw new C0276a("Could not get button with size " + i + " and color " + i2, e);
        }
    }

    /* renamed from: A */
    public C0593ed mo2842d(IBinder iBinder) {
        return C0594a.m1540z(iBinder);
    }
}
