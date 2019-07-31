package com.google.android.gms.internal;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

/* renamed from: com.google.android.gms.internal.ck */
public final class C0488ck {

    /* renamed from: hC */
    private static final Object f1326hC = new Object();

    /* renamed from: iu */
    public static final String f1327iu;

    /* renamed from: iv */
    private static BigInteger f1328iv = BigInteger.ONE;

    static {
        UUID randomUUID = UUID.randomUUID();
        byte[] byteArray = BigInteger.valueOf(randomUUID.getLeastSignificantBits()).toByteArray();
        byte[] byteArray2 = BigInteger.valueOf(randomUUID.getMostSignificantBits()).toByteArray();
        String bigInteger = new BigInteger(1, byteArray).toString();
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                instance.update(byteArray);
                instance.update(byteArray2);
                byte[] bArr = new byte[8];
                System.arraycopy(instance.digest(), 0, bArr, 0, 8);
                bigInteger = new BigInteger(1, bArr).toString();
            } catch (NoSuchAlgorithmException e) {
            }
        }
        f1327iu = bigInteger;
    }

    /* renamed from: ar */
    public static String m1100ar() {
        String bigInteger;
        synchronized (f1326hC) {
            bigInteger = f1328iv.toString();
            f1328iv.add(BigInteger.ONE);
        }
        return bigInteger;
    }
}
