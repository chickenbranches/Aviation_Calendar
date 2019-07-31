package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.p000v4.internal.view.SupportMenu;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.common.internal.safeparcel.a */
public class C0173a {

    /* renamed from: com.google.android.gms.common.internal.safeparcel.a$a */
    public static class C0174a extends RuntimeException {
        public C0174a(String str, Parcel parcel) {
            super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
        }
    }

    /* renamed from: A */
    public static Parcel[] m291A(Parcel parcel, int i) {
        int a = m293a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        Parcel[] parcelArr = new Parcel[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            int readInt2 = parcel.readInt();
            if (readInt2 != 0) {
                int dataPosition2 = parcel.dataPosition();
                Parcel obtain = Parcel.obtain();
                obtain.appendFrom(parcel, dataPosition2, readInt2);
                parcelArr[i2] = obtain;
                parcel.setDataPosition(readInt2 + dataPosition2);
            } else {
                parcelArr[i2] = null;
            }
        }
        parcel.setDataPosition(dataPosition + a);
        return parcelArr;
    }

    /* renamed from: M */
    public static int m292M(int i) {
        return 65535 & i;
    }

    /* renamed from: a */
    public static int m293a(Parcel parcel, int i) {
        return (i & SupportMenu.CATEGORY_MASK) != -65536 ? (i >> 16) & SupportMenu.USER_MASK : parcel.readInt();
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m294a(Parcel parcel, int i, Creator<T> creator) {
        int a = m293a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        T t = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(a + dataPosition);
        return t;
    }

    /* renamed from: a */
    private static void m295a(Parcel parcel, int i, int i2) {
        int a = m293a(parcel, i);
        if (a != i2) {
            throw new C0174a("Expected size " + i2 + " got " + a + " (0x" + Integer.toHexString(a) + ")", parcel);
        }
    }

    /* renamed from: a */
    private static void m296a(Parcel parcel, int i, int i2, int i3) {
        if (i2 != i3) {
            throw new C0174a("Expected size " + i3 + " got " + i2 + " (0x" + Integer.toHexString(i2) + ")", parcel);
        }
    }

    /* renamed from: a */
    public static void m297a(Parcel parcel, int i, List list, ClassLoader classLoader) {
        int a = m293a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a != 0) {
            parcel.readList(list, classLoader);
            parcel.setDataPosition(a + dataPosition);
        }
    }

    /* renamed from: b */
    public static void m298b(Parcel parcel, int i) {
        parcel.setDataPosition(m293a(parcel, i) + parcel.dataPosition());
    }

    /* renamed from: b */
    public static <T> T[] m299b(Parcel parcel, int i, Creator<T> creator) {
        int a = m293a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        T[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(a + dataPosition);
        return createTypedArray;
    }

    /* renamed from: c */
    public static <T> ArrayList<T> m300c(Parcel parcel, int i, Creator<T> creator) {
        int a = m293a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(a + dataPosition);
        return createTypedArrayList;
    }

    /* renamed from: c */
    public static boolean m301c(Parcel parcel, int i) {
        m295a(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    /* renamed from: d */
    public static Boolean m302d(Parcel parcel, int i) {
        int a = m293a(parcel, i);
        if (a == 0) {
            return null;
        }
        m296a(parcel, i, a, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    /* renamed from: e */
    public static byte m303e(Parcel parcel, int i) {
        m295a(parcel, i, 4);
        return (byte) parcel.readInt();
    }

    /* renamed from: f */
    public static short m304f(Parcel parcel, int i) {
        m295a(parcel, i, 4);
        return (short) parcel.readInt();
    }

    /* renamed from: g */
    public static int m305g(Parcel parcel, int i) {
        m295a(parcel, i, 4);
        return parcel.readInt();
    }

    /* renamed from: h */
    public static long m306h(Parcel parcel, int i) {
        m295a(parcel, i, 8);
        return parcel.readLong();
    }

    /* renamed from: i */
    public static BigInteger m307i(Parcel parcel, int i) {
        int a = m293a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(a + dataPosition);
        return new BigInteger(createByteArray);
    }

    /* renamed from: j */
    public static float m308j(Parcel parcel, int i) {
        m295a(parcel, i, 4);
        return parcel.readFloat();
    }

    /* renamed from: k */
    public static double m309k(Parcel parcel, int i) {
        m295a(parcel, i, 8);
        return parcel.readDouble();
    }

    /* renamed from: l */
    public static BigDecimal m310l(Parcel parcel, int i) {
        int a = m293a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        int readInt = parcel.readInt();
        parcel.setDataPosition(a + dataPosition);
        return new BigDecimal(new BigInteger(createByteArray), readInt);
    }

    /* renamed from: m */
    public static int m311m(Parcel parcel) {
        return parcel.readInt();
    }

    /* renamed from: m */
    public static String m312m(Parcel parcel, int i) {
        int a = m293a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(a + dataPosition);
        return readString;
    }

    /* renamed from: n */
    public static int m313n(Parcel parcel) {
        int m = m311m(parcel);
        int a = m293a(parcel, m);
        int dataPosition = parcel.dataPosition();
        if (m292M(m) != 20293) {
            throw new C0174a("Expected object header. Got 0x" + Integer.toHexString(m), parcel);
        }
        int i = dataPosition + a;
        if (i >= dataPosition && i <= parcel.dataSize()) {
            return i;
        }
        throw new C0174a("Size read is invalid start=" + dataPosition + " end=" + i, parcel);
    }

    /* renamed from: n */
    public static IBinder m314n(Parcel parcel, int i) {
        int a = m293a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(a + dataPosition);
        return readStrongBinder;
    }

    /* renamed from: o */
    public static Bundle m315o(Parcel parcel, int i) {
        int a = m293a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(a + dataPosition);
        return readBundle;
    }

    /* renamed from: p */
    public static byte[] m316p(Parcel parcel, int i) {
        int a = m293a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(a + dataPosition);
        return createByteArray;
    }

    /* renamed from: q */
    public static boolean[] m317q(Parcel parcel, int i) {
        int a = m293a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        boolean[] createBooleanArray = parcel.createBooleanArray();
        parcel.setDataPosition(a + dataPosition);
        return createBooleanArray;
    }

    /* renamed from: r */
    public static int[] m318r(Parcel parcel, int i) {
        int a = m293a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(a + dataPosition);
        return createIntArray;
    }

    /* renamed from: s */
    public static long[] m319s(Parcel parcel, int i) {
        int a = m293a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        long[] createLongArray = parcel.createLongArray();
        parcel.setDataPosition(a + dataPosition);
        return createLongArray;
    }

    /* renamed from: t */
    public static BigInteger[] m320t(Parcel parcel, int i) {
        int a = m293a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigInteger[] bigIntegerArr = new BigInteger[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            bigIntegerArr[i2] = new BigInteger(parcel.createByteArray());
        }
        parcel.setDataPosition(dataPosition + a);
        return bigIntegerArr;
    }

    /* renamed from: u */
    public static float[] m321u(Parcel parcel, int i) {
        int a = m293a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        float[] createFloatArray = parcel.createFloatArray();
        parcel.setDataPosition(a + dataPosition);
        return createFloatArray;
    }

    /* renamed from: v */
    public static double[] m322v(Parcel parcel, int i) {
        int a = m293a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        double[] createDoubleArray = parcel.createDoubleArray();
        parcel.setDataPosition(a + dataPosition);
        return createDoubleArray;
    }

    /* renamed from: w */
    public static BigDecimal[] m323w(Parcel parcel, int i) {
        int a = m293a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigDecimal[] bigDecimalArr = new BigDecimal[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            byte[] createByteArray = parcel.createByteArray();
            bigDecimalArr[i2] = new BigDecimal(new BigInteger(createByteArray), parcel.readInt());
        }
        parcel.setDataPosition(dataPosition + a);
        return bigDecimalArr;
    }

    /* renamed from: x */
    public static String[] m324x(Parcel parcel, int i) {
        int a = m293a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(a + dataPosition);
        return createStringArray;
    }

    /* renamed from: y */
    public static ArrayList<String> m325y(Parcel parcel, int i) {
        int a = m293a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(a + dataPosition);
        return createStringArrayList;
    }

    /* renamed from: z */
    public static Parcel m326z(Parcel parcel, int i) {
        int a = m293a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        obtain.appendFrom(parcel, dataPosition, a);
        parcel.setDataPosition(a + dataPosition);
        return obtain;
    }
}
