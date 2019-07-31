package com.google.android.gms.internal;

import android.util.Base64;

/* renamed from: com.google.android.gms.internal.a */
class C0348a implements C0941j {
    C0348a() {
    }

    /* renamed from: a */
    public String mo3419a(byte[] bArr, boolean z) {
        return Base64.encodeToString(bArr, z ? 11 : 2);
    }

    /* renamed from: a */
    public byte[] mo3420a(String str, boolean z) throws IllegalArgumentException {
        return Base64.decode(str, z ? 11 : 2);
    }
}
