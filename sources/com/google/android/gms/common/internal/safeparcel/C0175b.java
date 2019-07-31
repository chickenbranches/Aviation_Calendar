package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: com.google.android.gms.common.internal.safeparcel.b */
public class C0175b {
    /* renamed from: B */
    private static int m327B(Parcel parcel, int i) {
        parcel.writeInt(-65536 | i);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    /* renamed from: C */
    private static void m328C(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        int i2 = dataPosition - i;
        parcel.setDataPosition(i - 4);
        parcel.writeInt(i2);
        parcel.setDataPosition(dataPosition);
    }

    /* renamed from: D */
    public static void m329D(Parcel parcel, int i) {
        m328C(parcel, i);
    }

    /* renamed from: a */
    public static void m330a(Parcel parcel, int i, byte b) {
        m348b(parcel, i, 4);
        parcel.writeInt(b);
    }

    /* renamed from: a */
    public static void m331a(Parcel parcel, int i, double d) {
        m348b(parcel, i, 8);
        parcel.writeDouble(d);
    }

    /* renamed from: a */
    public static void m332a(Parcel parcel, int i, float f) {
        m348b(parcel, i, 4);
        parcel.writeFloat(f);
    }

    /* renamed from: a */
    public static void m333a(Parcel parcel, int i, long j) {
        m348b(parcel, i, 8);
        parcel.writeLong(j);
    }

    /* renamed from: a */
    public static void m334a(Parcel parcel, int i, Bundle bundle, boolean z) {
        if (bundle != null) {
            int B = m327B(parcel, i);
            parcel.writeBundle(bundle);
            m328C(parcel, B);
        } else if (z) {
            m348b(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static void m335a(Parcel parcel, int i, IBinder iBinder, boolean z) {
        if (iBinder != null) {
            int B = m327B(parcel, i);
            parcel.writeStrongBinder(iBinder);
            m328C(parcel, B);
        } else if (z) {
            m348b(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static void m336a(Parcel parcel, int i, Parcel parcel2, boolean z) {
        if (parcel2 != null) {
            int B = m327B(parcel, i);
            parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            m328C(parcel, B);
        } else if (z) {
            m348b(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static void m337a(Parcel parcel, int i, Parcelable parcelable, int i2, boolean z) {
        if (parcelable != null) {
            int B = m327B(parcel, i);
            parcelable.writeToParcel(parcel, i2);
            m328C(parcel, B);
        } else if (z) {
            m348b(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static void m338a(Parcel parcel, int i, Boolean bool, boolean z) {
        int i2 = 0;
        if (bool != null) {
            m348b(parcel, i, 4);
            if (bool.booleanValue()) {
                i2 = 1;
            }
            parcel.writeInt(i2);
        } else if (z) {
            m348b(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static void m339a(Parcel parcel, int i, String str, boolean z) {
        if (str != null) {
            int B = m327B(parcel, i);
            parcel.writeString(str);
            m328C(parcel, B);
        } else if (z) {
            m348b(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static void m340a(Parcel parcel, int i, List<String> list, boolean z) {
        if (list != null) {
            int B = m327B(parcel, i);
            parcel.writeStringList(list);
            m328C(parcel, B);
        } else if (z) {
            m348b(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static void m341a(Parcel parcel, int i, short s) {
        m348b(parcel, i, 4);
        parcel.writeInt(s);
    }

    /* renamed from: a */
    public static void m342a(Parcel parcel, int i, boolean z) {
        m348b(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: a */
    public static void m343a(Parcel parcel, int i, byte[] bArr, boolean z) {
        if (bArr != null) {
            int B = m327B(parcel, i);
            parcel.writeByteArray(bArr);
            m328C(parcel, B);
        } else if (z) {
            m348b(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static void m344a(Parcel parcel, int i, float[] fArr, boolean z) {
        if (fArr != null) {
            int B = m327B(parcel, i);
            parcel.writeFloatArray(fArr);
            m328C(parcel, B);
        } else if (z) {
            m348b(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static <T extends Parcelable> void m345a(Parcel parcel, int i, T[] tArr, int i2, boolean z) {
        if (tArr != null) {
            int B = m327B(parcel, i);
            parcel.writeInt(r3);
            for (T t : tArr) {
                if (t == null) {
                    parcel.writeInt(0);
                } else {
                    m347a(parcel, t, i2);
                }
            }
            m328C(parcel, B);
        } else if (z) {
            m348b(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static void m346a(Parcel parcel, int i, String[] strArr, boolean z) {
        if (strArr != null) {
            int B = m327B(parcel, i);
            parcel.writeStringArray(strArr);
            m328C(parcel, B);
        } else if (z) {
            m348b(parcel, i, 0);
        }
    }

    /* renamed from: a */
    private static <T extends Parcelable> void m347a(Parcel parcel, T t, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        t.writeToParcel(parcel, i);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    /* renamed from: b */
    private static void m348b(Parcel parcel, int i, int i2) {
        if (i2 >= 65535) {
            parcel.writeInt(-65536 | i);
            parcel.writeInt(i2);
            return;
        }
        parcel.writeInt((i2 << 16) | i);
    }

    /* renamed from: b */
    public static <T extends Parcelable> void m349b(Parcel parcel, int i, List<T> list, boolean z) {
        if (list != null) {
            int B = m327B(parcel, i);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                Parcelable parcelable = (Parcelable) list.get(i2);
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    m347a(parcel, (T) parcelable, 0);
                }
            }
            m328C(parcel, B);
        } else if (z) {
            m348b(parcel, i, 0);
        }
    }

    /* renamed from: c */
    public static void m350c(Parcel parcel, int i, int i2) {
        m348b(parcel, i, 4);
        parcel.writeInt(i2);
    }

    /* renamed from: c */
    public static void m351c(Parcel parcel, int i, List list, boolean z) {
        if (list != null) {
            int B = m327B(parcel, i);
            parcel.writeList(list);
            m328C(parcel, B);
        } else if (z) {
            m348b(parcel, i, 0);
        }
    }

    /* renamed from: o */
    public static int m352o(Parcel parcel) {
        return m327B(parcel, 20293);
    }
}
