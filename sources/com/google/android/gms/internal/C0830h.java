package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;

/* renamed from: com.google.android.gms.internal.h */
public class C0830h {

    /* renamed from: dK */
    private String f2074dK = "googleads.g.doubleclick.net";

    /* renamed from: dL */
    private String f2075dL = "/pagead/ads";

    /* renamed from: dM */
    private String[] f2076dM = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};

    /* renamed from: dN */
    private C0519d f2077dN;

    /* renamed from: dO */
    private final C0472c f2078dO = new C0472c();

    public C0830h(C0519d dVar) {
        this.f2077dN = dVar;
    }

    /* renamed from: a */
    private Uri m2483a(Uri uri, Context context, String str, boolean z) throws C0891i {
        try {
            if (uri.getQueryParameter("ms") != null) {
                throw new C0891i("Query parameter already exists: ms");
            }
            return m2484a(uri, "ms", z ? this.f2077dN.mo3723a(context, str) : this.f2077dN.mo3722a(context));
        } catch (UnsupportedOperationException e) {
            throw new C0891i("Provided Uri is not in a valid state");
        }
    }

    /* renamed from: a */
    private Uri m2484a(Uri uri, String str, String str2) throws UnsupportedOperationException {
        String uri2 = uri.toString();
        int indexOf = uri2.indexOf("&adurl");
        if (indexOf == -1) {
            indexOf = uri2.indexOf("?adurl");
        }
        return indexOf != -1 ? Uri.parse(new StringBuilder(uri2.substring(0, indexOf + 1)).append(str).append("=").append(str2).append("&").append(uri2.substring(indexOf + 1)).toString()) : uri.buildUpon().appendQueryParameter(str, str2).build();
    }

    /* renamed from: a */
    public Uri mo4596a(Uri uri, Context context) throws C0891i {
        try {
            return m2483a(uri, context, uri.getQueryParameter("ai"), true);
        } catch (UnsupportedOperationException e) {
            throw new C0891i("Provided Uri is not in a valid state");
        }
    }

    /* renamed from: a */
    public void mo4597a(MotionEvent motionEvent) {
        this.f2077dN.mo3725a(motionEvent);
    }

    /* renamed from: a */
    public boolean mo4598a(Uri uri) {
        if (uri == null) {
            throw new NullPointerException();
        }
        try {
            String host = uri.getHost();
            for (String endsWith : this.f2076dM) {
                if (host.endsWith(endsWith)) {
                    return true;
                }
            }
            return false;
        } catch (NullPointerException e) {
            return false;
        }
    }

    /* renamed from: g */
    public C0519d mo4599g() {
        return this.f2077dN;
    }
}
