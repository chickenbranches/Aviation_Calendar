package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: com.google.android.gms.internal.ho */
public interface C0854ho extends IInterface {

    /* renamed from: com.google.android.gms.internal.ho$a */
    public static abstract class C0855a extends Binder implements C0854ho {

        /* renamed from: com.google.android.gms.internal.ho$a$a */
        private static class C0856a implements C0854ho {

            /* renamed from: dU */
            private IBinder f2132dU;

            C0856a(IBinder iBinder) {
                this.f2132dU = iBinder;
            }

            /* renamed from: a */
            public void mo4682a(int i, Bundle bundle, Bundle bundle2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusCallbacks");
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle2 != null) {
                        obtain.writeInt(1);
                        bundle2.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f2132dU.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo4683a(int i, Bundle bundle, ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusCallbacks");
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (parcelFileDescriptor != null) {
                        obtain.writeInt(1);
                        parcelFileDescriptor.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f2132dU.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo4684a(int i, Bundle bundle, C0623ey eyVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusCallbacks");
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (eyVar != null) {
                        obtain.writeInt(1);
                        eyVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f2132dU.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo4685a(int i, C0905ig igVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusCallbacks");
                    obtain.writeInt(i);
                    if (igVar != null) {
                        obtain.writeInt(1);
                        igVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f2132dU.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo4686a(DataHolder dataHolder, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    this.f2132dU.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo4687a(DataHolder dataHolder, String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f2132dU.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f2132dU;
            }

            /* renamed from: ax */
            public void mo4688ax(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusCallbacks");
                    obtain.writeString(str);
                    this.f2132dU.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: ay */
            public void mo4689ay(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusCallbacks");
                    obtain.writeString(str);
                    this.f2132dU.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public void mo4690b(int i, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusCallbacks");
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f2132dU.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C0855a() {
            attachInterface(this, "com.google.android.gms.plus.internal.IPlusCallbacks");
        }

        /* renamed from: au */
        public static C0854ho m2563au(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C0854ho)) ? new C0856a(iBinder) : (C0854ho) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX WARNING: type inference failed for: r2v0 */
        /* JADX WARNING: type inference failed for: r2v1, types: [com.google.android.gms.internal.ig] */
        /* JADX WARNING: type inference failed for: r2v2, types: [com.google.android.gms.internal.ig] */
        /* JADX WARNING: type inference failed for: r2v3, types: [com.google.android.gms.common.data.DataHolder] */
        /* JADX WARNING: type inference failed for: r2v4, types: [com.google.android.gms.common.data.DataHolder] */
        /* JADX WARNING: type inference failed for: r2v5, types: [com.google.android.gms.internal.ey] */
        /* JADX WARNING: type inference failed for: r2v7, types: [com.google.android.gms.internal.ey] */
        /* JADX WARNING: type inference failed for: r2v8, types: [com.google.android.gms.common.data.DataHolder] */
        /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.gms.common.data.DataHolder] */
        /* JADX WARNING: type inference failed for: r2v10 */
        /* JADX WARNING: type inference failed for: r2v11 */
        /* JADX WARNING: type inference failed for: r2v12 */
        /* JADX WARNING: type inference failed for: r2v13 */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v0
          assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], com.google.android.gms.common.data.DataHolder, com.google.android.gms.internal.ig, com.google.android.gms.internal.ey]
          uses: [com.google.android.gms.internal.ig, com.google.android.gms.common.data.DataHolder, com.google.android.gms.internal.ey]
          mth insns count: 120
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
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 5 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r6, android.os.Parcel r7, android.os.Parcel r8, int r9) throws android.os.RemoteException {
            /*
                r5 = this;
                r2 = 0
                r3 = 1
                switch(r6) {
                    case 1: goto L_0x0011;
                    case 2: goto L_0x0043;
                    case 3: goto L_0x0075;
                    case 4: goto L_0x0086;
                    case 5: goto L_0x00a4;
                    case 6: goto L_0x00d2;
                    case 7: goto L_0x00f4;
                    case 8: goto L_0x0116;
                    case 9: goto L_0x0128;
                    case 1598968902: goto L_0x000a;
                    default: goto L_0x0005;
                }
            L_0x0005:
                boolean r0 = super.onTransact(r6, r7, r8, r9)
            L_0x0009:
                return r0
            L_0x000a:
                java.lang.String r0 = "com.google.android.gms.plus.internal.IPlusCallbacks"
                r8.writeString(r0)
                r0 = r3
                goto L_0x0009
            L_0x0011:
                java.lang.String r0 = "com.google.android.gms.plus.internal.IPlusCallbacks"
                r7.enforceInterface(r0)
                int r4 = r7.readInt()
                int r0 = r7.readInt()
                if (r0 == 0) goto L_0x003f
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r7)
                android.os.Bundle r0 = (android.os.Bundle) r0
                r1 = r0
            L_0x0029:
                int r0 = r7.readInt()
                if (r0 == 0) goto L_0x0041
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r7)
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x0037:
                r5.mo4682a(r4, r1, r0)
                r8.writeNoException()
                r0 = r3
                goto L_0x0009
            L_0x003f:
                r1 = r2
                goto L_0x0029
            L_0x0041:
                r0 = r2
                goto L_0x0037
            L_0x0043:
                java.lang.String r0 = "com.google.android.gms.plus.internal.IPlusCallbacks"
                r7.enforceInterface(r0)
                int r4 = r7.readInt()
                int r0 = r7.readInt()
                if (r0 == 0) goto L_0x0071
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r7)
                android.os.Bundle r0 = (android.os.Bundle) r0
                r1 = r0
            L_0x005b:
                int r0 = r7.readInt()
                if (r0 == 0) goto L_0x0073
                android.os.Parcelable$Creator r0 = android.os.ParcelFileDescriptor.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r7)
                android.os.ParcelFileDescriptor r0 = (android.os.ParcelFileDescriptor) r0
            L_0x0069:
                r5.mo4683a(r4, r1, r0)
                r8.writeNoException()
                r0 = r3
                goto L_0x0009
            L_0x0071:
                r1 = r2
                goto L_0x005b
            L_0x0073:
                r0 = r2
                goto L_0x0069
            L_0x0075:
                java.lang.String r0 = "com.google.android.gms.plus.internal.IPlusCallbacks"
                r7.enforceInterface(r0)
                java.lang.String r0 = r7.readString()
                r5.mo4688ax(r0)
                r8.writeNoException()
                r0 = r3
                goto L_0x0009
            L_0x0086:
                java.lang.String r0 = "com.google.android.gms.plus.internal.IPlusCallbacks"
                r7.enforceInterface(r0)
                int r0 = r7.readInt()
                if (r0 == 0) goto L_0x0097
                com.google.android.gms.common.data.DataHolderCreator r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r2 = r0.createFromParcel(r7)
            L_0x0097:
                java.lang.String r0 = r7.readString()
                r5.mo4686a(r2, r0)
                r8.writeNoException()
                r0 = r3
                goto L_0x0009
            L_0x00a4:
                java.lang.String r0 = "com.google.android.gms.plus.internal.IPlusCallbacks"
                r7.enforceInterface(r0)
                int r1 = r7.readInt()
                int r0 = r7.readInt()
                if (r0 == 0) goto L_0x00d0
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r7)
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x00bb:
                int r4 = r7.readInt()
                if (r4 == 0) goto L_0x00c7
                com.google.android.gms.internal.ez r2 = com.google.android.gms.internal.C0623ey.CREATOR
                com.google.android.gms.internal.ey r2 = r2.createFromParcel(r7)
            L_0x00c7:
                r5.mo4684a(r1, r0, r2)
                r8.writeNoException()
                r0 = r3
                goto L_0x0009
            L_0x00d0:
                r0 = r2
                goto L_0x00bb
            L_0x00d2:
                java.lang.String r0 = "com.google.android.gms.plus.internal.IPlusCallbacks"
                r7.enforceInterface(r0)
                int r0 = r7.readInt()
                if (r0 == 0) goto L_0x00e3
                com.google.android.gms.common.data.DataHolderCreator r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r2 = r0.createFromParcel(r7)
            L_0x00e3:
                java.lang.String r0 = r7.readString()
                java.lang.String r1 = r7.readString()
                r5.mo4687a(r2, r0, r1)
                r8.writeNoException()
                r0 = r3
                goto L_0x0009
            L_0x00f4:
                java.lang.String r0 = "com.google.android.gms.plus.internal.IPlusCallbacks"
                r7.enforceInterface(r0)
                int r1 = r7.readInt()
                int r0 = r7.readInt()
                if (r0 == 0) goto L_0x0114
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r7)
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x010b:
                r5.mo4690b(r1, r0)
                r8.writeNoException()
                r0 = r3
                goto L_0x0009
            L_0x0114:
                r0 = r2
                goto L_0x010b
            L_0x0116:
                java.lang.String r0 = "com.google.android.gms.plus.internal.IPlusCallbacks"
                r7.enforceInterface(r0)
                java.lang.String r0 = r7.readString()
                r5.mo4689ay(r0)
                r8.writeNoException()
                r0 = r3
                goto L_0x0009
            L_0x0128:
                java.lang.String r0 = "com.google.android.gms.plus.internal.IPlusCallbacks"
                r7.enforceInterface(r0)
                int r0 = r7.readInt()
                int r1 = r7.readInt()
                if (r1 == 0) goto L_0x013d
                com.google.android.gms.internal.ih r1 = com.google.android.gms.internal.C0905ig.CREATOR
                com.google.android.gms.internal.ig r2 = r1.createFromParcel(r7)
            L_0x013d:
                r5.mo4685a(r0, r2)
                r8.writeNoException()
                r0 = r3
                goto L_0x0009
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.C0854ho.C0855a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    /* renamed from: a */
    void mo4682a(int i, Bundle bundle, Bundle bundle2) throws RemoteException;

    /* renamed from: a */
    void mo4683a(int i, Bundle bundle, ParcelFileDescriptor parcelFileDescriptor) throws RemoteException;

    /* renamed from: a */
    void mo4684a(int i, Bundle bundle, C0623ey eyVar) throws RemoteException;

    /* renamed from: a */
    void mo4685a(int i, C0905ig igVar) throws RemoteException;

    /* renamed from: a */
    void mo4686a(DataHolder dataHolder, String str) throws RemoteException;

    /* renamed from: a */
    void mo4687a(DataHolder dataHolder, String str, String str2) throws RemoteException;

    /* renamed from: ax */
    void mo4688ax(String str) throws RemoteException;

    /* renamed from: ay */
    void mo4689ay(String str) throws RemoteException;

    /* renamed from: b */
    void mo4690b(int i, Bundle bundle) throws RemoteException;
}
