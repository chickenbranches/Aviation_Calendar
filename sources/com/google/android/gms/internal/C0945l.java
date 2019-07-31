package com.google.android.gms.internal;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.l */
public class C0945l {

    /* renamed from: dP */
    private final SecureRandom f2382dP;

    /* renamed from: dw */
    private final C0941j f2383dw;

    /* renamed from: com.google.android.gms.internal.l$a */
    public class C0946a extends Exception {
        public C0946a() {
        }

        public C0946a(Throwable th) {
            super(th);
        }
    }

    public C0945l(C0941j jVar, SecureRandom secureRandom) {
        this.f2383dw = jVar;
        this.f2382dP = secureRandom;
    }

    /* renamed from: a */
    static void m2943a(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            bArr[i] = (byte) (bArr[i] ^ 68);
        }
    }

    /* renamed from: c */
    public byte[] mo5247c(byte[] bArr, String str) throws C0946a {
        if (bArr.length != 16) {
            throw new C0946a();
        }
        try {
            byte[] a = this.f2383dw.mo3420a(str, false);
            if (a.length <= 16) {
                throw new C0946a();
            }
            ByteBuffer allocate = ByteBuffer.allocate(a.length);
            allocate.put(a);
            allocate.flip();
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[(a.length - 16)];
            allocate.get(bArr2);
            allocate.get(bArr3);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(2, secretKeySpec, new IvParameterSpec(bArr2));
            return instance.doFinal(bArr3);
        } catch (NoSuchAlgorithmException e) {
            throw new C0946a(e);
        } catch (InvalidKeyException e2) {
            throw new C0946a(e2);
        } catch (IllegalBlockSizeException e3) {
            throw new C0946a(e3);
        } catch (NoSuchPaddingException e4) {
            throw new C0946a(e4);
        } catch (BadPaddingException e5) {
            throw new C0946a(e5);
        } catch (InvalidAlgorithmParameterException e6) {
            throw new C0946a(e6);
        } catch (IllegalArgumentException e7) {
            throw new C0946a(e7);
        }
    }

    /* renamed from: d */
    public byte[] mo5248d(String str) throws C0946a {
        try {
            byte[] a = this.f2383dw.mo3420a(str, false);
            if (a.length != 32) {
                throw new C0946a();
            }
            byte[] bArr = new byte[16];
            ByteBuffer.wrap(a, 4, 16).get(bArr);
            m2943a(bArr);
            return bArr;
        } catch (IllegalArgumentException e) {
            throw new C0946a(e);
        }
    }
}
