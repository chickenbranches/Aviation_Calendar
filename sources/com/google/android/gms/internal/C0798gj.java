package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.gj */
public interface C0798gj extends IInterface {

    /* renamed from: com.google.android.gms.internal.gj$a */
    public static abstract class C0799a extends Binder implements C0798gj {

        /* renamed from: com.google.android.gms.internal.gj$a$a */
        private static class C0800a implements C0798gj {

            /* renamed from: dU */
            private IBinder f1901dU;

            C0800a(IBinder iBinder) {
                this.f1901dU = iBinder;
            }

            /* renamed from: I */
            public void mo4462I(Status status) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.ICopresenceCallbacks");
                    if (status != null) {
                        obtain.writeInt(1);
                        status.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1901dU.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo4463a(int i, C0796gh ghVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.ICopresenceCallbacks");
                    obtain.writeInt(i);
                    if (ghVar != null) {
                        obtain.writeInt(1);
                        ghVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1901dU.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo4464a(int i, boolean z) throws RemoteException {
                int i2 = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.ICopresenceCallbacks");
                    obtain.writeInt(i);
                    if (z) {
                        i2 = 1;
                    }
                    obtain.writeInt(i2);
                    this.f1901dU.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f1901dU;
            }

            /* renamed from: b */
            public void mo4465b(int i, C0796gh ghVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.ICopresenceCallbacks");
                    obtain.writeInt(i);
                    if (ghVar != null) {
                        obtain.writeInt(1);
                        ghVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1901dU.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: J */
        public static C0798gj m2367J(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.ICopresenceCallbacks");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C0798gj)) ? new C0800a(iBinder) : (C0798gj) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX WARNING: type inference failed for: r0v0 */
        /* JADX WARNING: type inference failed for: r0v6, types: [com.google.android.gms.internal.gh] */
        /* JADX WARNING: type inference failed for: r0v8, types: [com.google.android.gms.internal.gh] */
        /* JADX WARNING: type inference failed for: r0v9, types: [com.google.android.gms.internal.gh] */
        /* JADX WARNING: type inference failed for: r0v11, types: [com.google.android.gms.internal.gh] */
        /* JADX WARNING: type inference failed for: r0v12, types: [com.google.android.gms.common.api.Status] */
        /* JADX WARNING: type inference failed for: r0v14, types: [com.google.android.gms.common.api.Status] */
        /* JADX WARNING: type inference failed for: r0v16 */
        /* JADX WARNING: type inference failed for: r0v17 */
        /* JADX WARNING: type inference failed for: r0v18 */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v0
          assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], com.google.android.gms.internal.gh, com.google.android.gms.common.api.Status]
          uses: [com.google.android.gms.internal.gh, com.google.android.gms.common.api.Status]
          mth insns count: 49
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 4 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) throws android.os.RemoteException {
            /*
                r4 = this;
                r0 = 0
                r1 = 1
                switch(r5) {
                    case 3: goto L_0x0010;
                    case 4: goto L_0x0028;
                    case 5: goto L_0x0044;
                    case 6: goto L_0x0060;
                    case 1598968902: goto L_0x000a;
                    default: goto L_0x0005;
                }
            L_0x0005:
                boolean r1 = super.onTransact(r5, r6, r7, r8)
            L_0x0009:
                return r1
            L_0x000a:
                java.lang.String r0 = "com.google.android.gms.location.internal.ICopresenceCallbacks"
                r7.writeString(r0)
                goto L_0x0009
            L_0x0010:
                java.lang.String r2 = "com.google.android.gms.location.internal.ICopresenceCallbacks"
                r6.enforceInterface(r2)
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x0021
                com.google.android.gms.common.api.StatusCreator r0 = com.google.android.gms.common.api.Status.CREATOR
                com.google.android.gms.common.api.Status r0 = r0.createFromParcel(r6)
            L_0x0021:
                r4.mo4462I(r0)
                r7.writeNoException()
                goto L_0x0009
            L_0x0028:
                java.lang.String r2 = "com.google.android.gms.location.internal.ICopresenceCallbacks"
                r6.enforceInterface(r2)
                int r2 = r6.readInt()
                int r3 = r6.readInt()
                if (r3 == 0) goto L_0x003d
                com.google.android.gms.internal.gi r0 = com.google.android.gms.internal.C0796gh.CREATOR
                com.google.android.gms.internal.gh r0 = r0.createFromParcel(r6)
            L_0x003d:
                r4.mo4463a(r2, r0)
                r7.writeNoException()
                goto L_0x0009
            L_0x0044:
                java.lang.String r2 = "com.google.android.gms.location.internal.ICopresenceCallbacks"
                r6.enforceInterface(r2)
                int r2 = r6.readInt()
                int r3 = r6.readInt()
                if (r3 == 0) goto L_0x0059
                com.google.android.gms.internal.gi r0 = com.google.android.gms.internal.C0796gh.CREATOR
                com.google.android.gms.internal.gh r0 = r0.createFromParcel(r6)
            L_0x0059:
                r4.mo4465b(r2, r0)
                r7.writeNoException()
                goto L_0x0009
            L_0x0060:
                java.lang.String r0 = "com.google.android.gms.location.internal.ICopresenceCallbacks"
                r6.enforceInterface(r0)
                int r2 = r6.readInt()
                int r0 = r6.readInt()
                if (r0 == 0) goto L_0x0077
                r0 = r1
            L_0x0070:
                r4.mo4464a(r2, r0)
                r7.writeNoException()
                goto L_0x0009
            L_0x0077:
                r0 = 0
                goto L_0x0070
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.C0798gj.C0799a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    /* renamed from: I */
    void mo4462I(Status status) throws RemoteException;

    /* renamed from: a */
    void mo4463a(int i, C0796gh ghVar) throws RemoteException;

    /* renamed from: a */
    void mo4464a(int i, boolean z) throws RemoteException;

    /* renamed from: b */
    void mo4465b(int i, C0796gh ghVar) throws RemoteException;
}
