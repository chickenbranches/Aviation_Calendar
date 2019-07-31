package com.google.android.gms.internal;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import com.google.android.gms.internal.C0945l.C0946a;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.f */
public abstract class C0625f extends C0585e {

    /* renamed from: dA */
    private static Method f1607dA;

    /* renamed from: dB */
    private static Method f1608dB;

    /* renamed from: dC */
    private static Method f1609dC;

    /* renamed from: dD */
    private static Method f1610dD;

    /* renamed from: dE */
    private static String f1611dE;

    /* renamed from: dF */
    private static C0945l f1612dF;

    /* renamed from: dG */
    static boolean f1613dG = false;

    /* renamed from: dy */
    private static Method f1614dy;

    /* renamed from: dz */
    private static Method f1615dz;
    private static long startTime = 0;

    /* renamed from: com.google.android.gms.internal.f$a */
    static class C0626a extends Exception {
        public C0626a() {
        }

        public C0626a(Throwable th) {
            super(th);
        }
    }

    protected C0625f(Context context, C0941j jVar, C0944k kVar) {
        super(context, jVar, kVar);
    }

    /* renamed from: a */
    static String m1676a(Context context, C0941j jVar) throws C0626a {
        if (f1607dA == null) {
            throw new C0626a();
        }
        try {
            ByteBuffer byteBuffer = (ByteBuffer) f1607dA.invoke(null, new Object[]{context});
            if (byteBuffer != null) {
                return jVar.mo3419a(byteBuffer.array(), true);
            }
            throw new C0626a();
        } catch (IllegalAccessException e) {
            throw new C0626a(e);
        } catch (InvocationTargetException e2) {
            throw new C0626a(e2);
        }
    }

    /* renamed from: a */
    static ArrayList<Long> m1677a(MotionEvent motionEvent, DisplayMetrics displayMetrics) throws C0626a {
        if (f1608dB == null || motionEvent == null) {
            throw new C0626a();
        }
        try {
            return (ArrayList) f1608dB.invoke(null, new Object[]{motionEvent, displayMetrics});
        } catch (IllegalAccessException e) {
            throw new C0626a(e);
        } catch (InvocationTargetException e2) {
            throw new C0626a(e2);
        }
    }

    /* renamed from: a */
    protected static synchronized void m1678a(String str, Context context, C0941j jVar) {
        synchronized (C0625f.class) {
            if (!f1613dG) {
                try {
                    f1612dF = new C0945l(jVar, null);
                    f1611dE = str;
                    m1684e(context);
                    startTime = m1683e().longValue();
                    f1613dG = true;
                } catch (C0626a | UnsupportedOperationException e) {
                }
            }
        }
    }

    /* renamed from: b */
    static String m1679b(Context context, C0941j jVar) throws C0626a {
        if (f1610dD == null) {
            throw new C0626a();
        }
        try {
            ByteBuffer byteBuffer = (ByteBuffer) f1610dD.invoke(null, new Object[]{context});
            if (byteBuffer != null) {
                return jVar.mo3419a(byteBuffer.array(), true);
            }
            throw new C0626a();
        } catch (IllegalAccessException e) {
            throw new C0626a(e);
        } catch (InvocationTargetException e2) {
            throw new C0626a(e2);
        }
    }

    /* renamed from: b */
    private static String m1680b(byte[] bArr, String str) throws C0626a {
        try {
            return new String(f1612dF.mo5247c(bArr, str), "UTF-8");
        } catch (C0946a e) {
            throw new C0626a(e);
        } catch (UnsupportedEncodingException e2) {
            throw new C0626a(e2);
        }
    }

    /* renamed from: d */
    static String m1681d() throws C0626a {
        if (f1611dE != null) {
            return f1611dE;
        }
        throw new C0626a();
    }

    /* renamed from: d */
    static String m1682d(Context context) throws C0626a {
        if (f1609dC == null) {
            throw new C0626a();
        }
        try {
            String str = (String) f1609dC.invoke(null, new Object[]{context});
            if (str != null) {
                return str;
            }
            throw new C0626a();
        } catch (IllegalAccessException e) {
            throw new C0626a(e);
        } catch (InvocationTargetException e2) {
            throw new C0626a(e2);
        }
    }

    /* renamed from: e */
    static Long m1683e() throws C0626a {
        if (f1614dy == null) {
            throw new C0626a();
        }
        try {
            return (Long) f1614dy.invoke(null, new Object[0]);
        } catch (IllegalAccessException e) {
            throw new C0626a(e);
        } catch (InvocationTargetException e2) {
            throw new C0626a(e2);
        }
    }

    /* renamed from: e */
    private static void m1684e(Context context) throws C0626a {
        try {
            byte[] d = f1612dF.mo5248d(C0948n.getKey());
            byte[] c = f1612dF.mo5247c(d, C0948n.m2949i());
            File cacheDir = context.getCacheDir();
            if (cacheDir == null) {
                cacheDir = context.getDir("dex", 0);
                if (cacheDir == null) {
                    throw new C0626a();
                }
            }
            File createTempFile = File.createTempFile("ads", ".jar", cacheDir);
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(c, 0, c.length);
            fileOutputStream.close();
            DexClassLoader dexClassLoader = new DexClassLoader(createTempFile.getAbsolutePath(), cacheDir.getAbsolutePath(), null, context.getClassLoader());
            Class loadClass = dexClassLoader.loadClass(m1680b(d, C0948n.m2950j()));
            Class loadClass2 = dexClassLoader.loadClass(m1680b(d, C0948n.m2956p()));
            Class loadClass3 = dexClassLoader.loadClass(m1680b(d, C0948n.m2954n()));
            Class loadClass4 = dexClassLoader.loadClass(m1680b(d, C0948n.m2960t()));
            Class loadClass5 = dexClassLoader.loadClass(m1680b(d, C0948n.m2952l()));
            Class loadClass6 = dexClassLoader.loadClass(m1680b(d, C0948n.m2958r()));
            f1614dy = loadClass.getMethod(m1680b(d, C0948n.m2951k()), new Class[0]);
            f1615dz = loadClass2.getMethod(m1680b(d, C0948n.m2957q()), new Class[0]);
            f1607dA = loadClass3.getMethod(m1680b(d, C0948n.m2955o()), new Class[]{Context.class});
            f1608dB = loadClass4.getMethod(m1680b(d, C0948n.m2961u()), new Class[]{MotionEvent.class, DisplayMetrics.class});
            f1609dC = loadClass5.getMethod(m1680b(d, C0948n.m2953m()), new Class[]{Context.class});
            f1610dD = loadClass6.getMethod(m1680b(d, C0948n.m2959s()), new Class[]{Context.class});
            String name = createTempFile.getName();
            createTempFile.delete();
            new File(cacheDir, name.replace(".jar", ".dex")).delete();
        } catch (FileNotFoundException e) {
            throw new C0626a(e);
        } catch (IOException e2) {
            throw new C0626a(e2);
        } catch (ClassNotFoundException e3) {
            throw new C0626a(e3);
        } catch (C0946a e4) {
            throw new C0626a(e4);
        } catch (NoSuchMethodException e5) {
            throw new C0626a(e5);
        } catch (NullPointerException e6) {
            throw new C0626a(e6);
        }
    }

    /* renamed from: f */
    static String m1685f() throws C0626a {
        if (f1615dz == null) {
            throw new C0626a();
        }
        try {
            return (String) f1615dz.invoke(null, new Object[0]);
        } catch (IllegalAccessException e) {
            throw new C0626a(e);
        } catch (InvocationTargetException e2) {
            throw new C0626a(e2);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0027 A[ExcHandler: IOException (e java.io.IOException), Splitter:B:1:0x0001] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3936b(android.content.Context r4) {
        /*
            r3 = this;
            r0 = 1
            java.lang.String r1 = m1685f()     // Catch:{ a -> 0x002f, IOException -> 0x0027 }
            r3.mo3934a(r0, r1)     // Catch:{ a -> 0x002f, IOException -> 0x0027 }
        L_0x0008:
            r0 = 2
            java.lang.String r1 = m1681d()     // Catch:{ a -> 0x002d, IOException -> 0x0027 }
            r3.mo3934a(r0, r1)     // Catch:{ a -> 0x002d, IOException -> 0x0027 }
        L_0x0010:
            r0 = 25
            java.lang.Long r1 = m1683e()     // Catch:{ a -> 0x002b, IOException -> 0x0027 }
            long r1 = r1.longValue()     // Catch:{ a -> 0x002b, IOException -> 0x0027 }
            r3.mo3933a(r0, r1)     // Catch:{ a -> 0x002b, IOException -> 0x0027 }
        L_0x001d:
            r0 = 24
            java.lang.String r1 = m1682d(r4)     // Catch:{ a -> 0x0029, IOException -> 0x0027 }
            r3.mo3934a(r0, r1)     // Catch:{ a -> 0x0029, IOException -> 0x0027 }
        L_0x0026:
            return
        L_0x0027:
            r0 = move-exception
            goto L_0x0026
        L_0x0029:
            r0 = move-exception
            goto L_0x0026
        L_0x002b:
            r0 = move-exception
            goto L_0x001d
        L_0x002d:
            r0 = move-exception
            goto L_0x0010
        L_0x002f:
            r0 = move-exception
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.C0625f.mo3936b(android.content.Context):void");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x008a A[ExcHandler: IOException (e java.io.IOException), Splitter:B:6:0x0010] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3937c(android.content.Context r7) {
        /*
            r6 = this;
            r0 = 2
            java.lang.String r1 = m1681d()     // Catch:{ a -> 0x0097, IOException -> 0x008a }
            r6.mo3934a(r0, r1)     // Catch:{ a -> 0x0097, IOException -> 0x008a }
        L_0x0008:
            r0 = 1
            java.lang.String r1 = m1685f()     // Catch:{ a -> 0x0094, IOException -> 0x008a }
            r6.mo3934a(r0, r1)     // Catch:{ a -> 0x0094, IOException -> 0x008a }
        L_0x0010:
            java.lang.Long r0 = m1683e()     // Catch:{ a -> 0x0092, IOException -> 0x008a }
            long r0 = r0.longValue()     // Catch:{ a -> 0x0092, IOException -> 0x008a }
            r2 = 25
            r6.mo3933a(r2, r0)     // Catch:{ a -> 0x0092, IOException -> 0x008a }
            long r2 = startTime     // Catch:{ a -> 0x0092, IOException -> 0x008a }
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x0034
            r2 = 17
            long r3 = startTime     // Catch:{ a -> 0x0092, IOException -> 0x008a }
            long r0 = r0 - r3
            r6.mo3933a(r2, r0)     // Catch:{ a -> 0x0092, IOException -> 0x008a }
            r0 = 23
            long r1 = startTime     // Catch:{ a -> 0x0092, IOException -> 0x008a }
            r6.mo3933a(r0, r1)     // Catch:{ a -> 0x0092, IOException -> 0x008a }
        L_0x0034:
            android.view.MotionEvent r0 = r6.f1549du     // Catch:{ a -> 0x0090, IOException -> 0x008a }
            android.util.DisplayMetrics r1 = r6.f1550dv     // Catch:{ a -> 0x0090, IOException -> 0x008a }
            java.util.ArrayList r1 = m1677a(r0, r1)     // Catch:{ a -> 0x0090, IOException -> 0x008a }
            r2 = 14
            r0 = 0
            java.lang.Object r0 = r1.get(r0)     // Catch:{ a -> 0x0090, IOException -> 0x008a }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ a -> 0x0090, IOException -> 0x008a }
            long r3 = r0.longValue()     // Catch:{ a -> 0x0090, IOException -> 0x008a }
            r6.mo3933a(r2, r3)     // Catch:{ a -> 0x0090, IOException -> 0x008a }
            r2 = 15
            r0 = 1
            java.lang.Object r0 = r1.get(r0)     // Catch:{ a -> 0x0090, IOException -> 0x008a }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ a -> 0x0090, IOException -> 0x008a }
            long r3 = r0.longValue()     // Catch:{ a -> 0x0090, IOException -> 0x008a }
            r6.mo3933a(r2, r3)     // Catch:{ a -> 0x0090, IOException -> 0x008a }
            int r0 = r1.size()     // Catch:{ a -> 0x0090, IOException -> 0x008a }
            r2 = 3
            if (r0 < r2) goto L_0x0073
            r2 = 16
            r0 = 2
            java.lang.Object r0 = r1.get(r0)     // Catch:{ a -> 0x0090, IOException -> 0x008a }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ a -> 0x0090, IOException -> 0x008a }
            long r0 = r0.longValue()     // Catch:{ a -> 0x0090, IOException -> 0x008a }
            r6.mo3933a(r2, r0)     // Catch:{ a -> 0x0090, IOException -> 0x008a }
        L_0x0073:
            r0 = 27
            com.google.android.gms.internal.j r1 = r6.f1551dw     // Catch:{ a -> 0x008e, IOException -> 0x008a }
            java.lang.String r1 = m1676a(r7, r1)     // Catch:{ a -> 0x008e, IOException -> 0x008a }
            r6.mo3934a(r0, r1)     // Catch:{ a -> 0x008e, IOException -> 0x008a }
        L_0x007e:
            r0 = 29
            com.google.android.gms.internal.j r1 = r6.f1551dw     // Catch:{ a -> 0x008c, IOException -> 0x008a }
            java.lang.String r1 = m1679b(r7, r1)     // Catch:{ a -> 0x008c, IOException -> 0x008a }
            r6.mo3934a(r0, r1)     // Catch:{ a -> 0x008c, IOException -> 0x008a }
        L_0x0089:
            return
        L_0x008a:
            r0 = move-exception
            goto L_0x0089
        L_0x008c:
            r0 = move-exception
            goto L_0x0089
        L_0x008e:
            r0 = move-exception
            goto L_0x007e
        L_0x0090:
            r0 = move-exception
            goto L_0x0073
        L_0x0092:
            r0 = move-exception
            goto L_0x0034
        L_0x0094:
            r0 = move-exception
            goto L_0x0010
        L_0x0097:
            r0 = move-exception
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.C0625f.mo3937c(android.content.Context):void");
    }
}
