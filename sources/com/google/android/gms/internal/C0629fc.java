package com.google.android.gms.internal;

import android.database.CharArrayBuffer;

/* renamed from: com.google.android.gms.internal.fc */
public final class C0629fc {
    /* renamed from: b */
    public static void m1697b(String str, CharArrayBuffer charArrayBuffer) {
        if (charArrayBuffer.data == null || charArrayBuffer.data.length < str.length()) {
            charArrayBuffer.data = str.toCharArray();
        } else {
            str.getChars(0, str.length(), charArrayBuffer.data, 0);
        }
        charArrayBuffer.sizeCopied = str.length();
    }
}
