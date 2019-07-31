package com.google.android.gms.drive.internal;

import android.content.IntentSender;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.drive.internal.o */
public interface C0231o extends IInterface {

    /* renamed from: com.google.android.gms.drive.internal.o$a */
    public static abstract class C0232a extends Binder implements C0231o {

        /* renamed from: com.google.android.gms.drive.internal.o$a$a */
        private static class C0233a implements C0231o {

            /* renamed from: dU */
            private IBinder f484dU;

            C0233a(IBinder iBinder) {
                this.f484dU = iBinder;
            }

            /* renamed from: a */
            public IntentSender mo2660a(CreateFileIntentSenderRequest createFileIntentSenderRequest) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (createFileIntentSenderRequest != null) {
                        obtain.writeInt(1);
                        createFileIntentSenderRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f484dU.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (IntentSender) IntentSender.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public IntentSender mo2661a(OpenFileIntentSenderRequest openFileIntentSenderRequest) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (openFileIntentSenderRequest != null) {
                        obtain.writeInt(1);
                        openFileIntentSenderRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f484dU.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (IntentSender) IntentSender.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo2662a(CloseContentsRequest closeContentsRequest, C0234p pVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (closeContentsRequest != null) {
                        obtain.writeInt(1);
                        closeContentsRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(pVar != null ? pVar.asBinder() : null);
                    this.f484dU.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo2663a(CreateContentsRequest createContentsRequest, C0234p pVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (createContentsRequest != null) {
                        obtain.writeInt(1);
                        createContentsRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(pVar != null ? pVar.asBinder() : null);
                    this.f484dU.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo2664a(CreateFileRequest createFileRequest, C0234p pVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (createFileRequest != null) {
                        obtain.writeInt(1);
                        createFileRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(pVar != null ? pVar.asBinder() : null);
                    this.f484dU.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo2665a(CreateFolderRequest createFolderRequest, C0234p pVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (createFolderRequest != null) {
                        obtain.writeInt(1);
                        createFolderRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(pVar != null ? pVar.asBinder() : null);
                    this.f484dU.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo2666a(GetMetadataRequest getMetadataRequest, C0234p pVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (getMetadataRequest != null) {
                        obtain.writeInt(1);
                        getMetadataRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(pVar != null ? pVar.asBinder() : null);
                    this.f484dU.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo2667a(OpenContentsRequest openContentsRequest, C0234p pVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (openContentsRequest != null) {
                        obtain.writeInt(1);
                        openContentsRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(pVar != null ? pVar.asBinder() : null);
                    this.f484dU.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo2668a(QueryRequest queryRequest, C0234p pVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (queryRequest != null) {
                        obtain.writeInt(1);
                        queryRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(pVar != null ? pVar.asBinder() : null);
                    this.f484dU.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo2669a(UpdateMetadataRequest updateMetadataRequest, C0234p pVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (updateMetadataRequest != null) {
                        obtain.writeInt(1);
                        updateMetadataRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(pVar != null ? pVar.asBinder() : null);
                    this.f484dU.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo2670a(C0234p pVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    obtain.writeStrongBinder(pVar != null ? pVar.asBinder() : null);
                    this.f484dU.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f484dU;
            }
        }

        /* renamed from: C */
        public static C0231o m484C(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.drive.internal.IDriveService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C0231o)) ? new C0233a(iBinder) : (C0231o) queryLocalInterface;
        }

        /* JADX WARNING: type inference failed for: r0v0 */
        /* JADX WARNING: type inference failed for: r0v1, types: [com.google.android.gms.drive.internal.CreateFileIntentSenderRequest] */
        /* JADX WARNING: type inference failed for: r0v6, types: [com.google.android.gms.drive.internal.CreateFileIntentSenderRequest] */
        /* JADX WARNING: type inference failed for: r0v7, types: [com.google.android.gms.drive.internal.OpenFileIntentSenderRequest] */
        /* JADX WARNING: type inference failed for: r0v12, types: [com.google.android.gms.drive.internal.OpenFileIntentSenderRequest] */
        /* JADX WARNING: type inference failed for: r0v17, types: [com.google.android.gms.drive.internal.CloseContentsRequest] */
        /* JADX WARNING: type inference failed for: r0v21, types: [com.google.android.gms.drive.internal.CloseContentsRequest] */
        /* JADX WARNING: type inference failed for: r0v22, types: [com.google.android.gms.drive.internal.OpenContentsRequest] */
        /* JADX WARNING: type inference failed for: r0v26, types: [com.google.android.gms.drive.internal.OpenContentsRequest] */
        /* JADX WARNING: type inference failed for: r0v27, types: [com.google.android.gms.drive.internal.CreateFolderRequest] */
        /* JADX WARNING: type inference failed for: r0v31, types: [com.google.android.gms.drive.internal.CreateFolderRequest] */
        /* JADX WARNING: type inference failed for: r0v32, types: [com.google.android.gms.drive.internal.CreateFileRequest] */
        /* JADX WARNING: type inference failed for: r0v36, types: [com.google.android.gms.drive.internal.CreateFileRequest] */
        /* JADX WARNING: type inference failed for: r0v37, types: [com.google.android.gms.drive.internal.CreateContentsRequest] */
        /* JADX WARNING: type inference failed for: r0v41, types: [com.google.android.gms.drive.internal.CreateContentsRequest] */
        /* JADX WARNING: type inference failed for: r0v42, types: [com.google.android.gms.drive.internal.UpdateMetadataRequest] */
        /* JADX WARNING: type inference failed for: r0v46, types: [com.google.android.gms.drive.internal.UpdateMetadataRequest] */
        /* JADX WARNING: type inference failed for: r0v47, types: [com.google.android.gms.drive.internal.QueryRequest] */
        /* JADX WARNING: type inference failed for: r0v51, types: [com.google.android.gms.drive.internal.QueryRequest] */
        /* JADX WARNING: type inference failed for: r0v52, types: [com.google.android.gms.drive.internal.GetMetadataRequest] */
        /* JADX WARNING: type inference failed for: r0v56, types: [com.google.android.gms.drive.internal.GetMetadataRequest] */
        /* JADX WARNING: type inference failed for: r0v60 */
        /* JADX WARNING: type inference failed for: r0v61 */
        /* JADX WARNING: type inference failed for: r0v62 */
        /* JADX WARNING: type inference failed for: r0v63 */
        /* JADX WARNING: type inference failed for: r0v64 */
        /* JADX WARNING: type inference failed for: r0v65 */
        /* JADX WARNING: type inference failed for: r0v66 */
        /* JADX WARNING: type inference failed for: r0v67 */
        /* JADX WARNING: type inference failed for: r0v68 */
        /* JADX WARNING: type inference failed for: r0v69 */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v0
          assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], com.google.android.gms.drive.internal.OpenFileIntentSenderRequest, com.google.android.gms.drive.internal.CreateFileIntentSenderRequest, com.google.android.gms.drive.internal.CloseContentsRequest, com.google.android.gms.drive.internal.OpenContentsRequest, com.google.android.gms.drive.internal.CreateFolderRequest, com.google.android.gms.drive.internal.CreateFileRequest, com.google.android.gms.drive.internal.CreateContentsRequest, com.google.android.gms.drive.internal.UpdateMetadataRequest, com.google.android.gms.drive.internal.QueryRequest, com.google.android.gms.drive.internal.GetMetadataRequest]
          uses: [com.google.android.gms.drive.internal.CreateFileIntentSenderRequest, com.google.android.gms.drive.internal.OpenFileIntentSenderRequest, com.google.android.gms.drive.internal.CloseContentsRequest, com.google.android.gms.drive.internal.OpenContentsRequest, com.google.android.gms.drive.internal.CreateFolderRequest, com.google.android.gms.drive.internal.CreateFileRequest, com.google.android.gms.drive.internal.CreateContentsRequest, com.google.android.gms.drive.internal.UpdateMetadataRequest, com.google.android.gms.drive.internal.QueryRequest, com.google.android.gms.drive.internal.GetMetadataRequest]
          mth insns count: 148
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
        /* JADX WARNING: Unknown variable types count: 11 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) throws android.os.RemoteException {
            /*
                r4 = this;
                r3 = 0
                r0 = 0
                r1 = 1
                switch(r5) {
                    case 1: goto L_0x0012;
                    case 2: goto L_0x0035;
                    case 3: goto L_0x0058;
                    case 4: goto L_0x007b;
                    case 5: goto L_0x009f;
                    case 6: goto L_0x00c3;
                    case 7: goto L_0x00e7;
                    case 8: goto L_0x010b;
                    case 9: goto L_0x012f;
                    case 10: goto L_0x0145;
                    case 11: goto L_0x016e;
                    case 1598968902: goto L_0x000b;
                    default: goto L_0x0006;
                }
            L_0x0006:
                boolean r0 = super.onTransact(r5, r6, r7, r8)
            L_0x000a:
                return r0
            L_0x000b:
                java.lang.String r0 = "com.google.android.gms.drive.internal.IDriveService"
                r7.writeString(r0)
                r0 = r1
                goto L_0x000a
            L_0x0012:
                java.lang.String r2 = "com.google.android.gms.drive.internal.IDriveService"
                r6.enforceInterface(r2)
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x0025
                android.os.Parcelable$Creator<com.google.android.gms.drive.internal.GetMetadataRequest> r0 = com.google.android.gms.drive.internal.GetMetadataRequest.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r6)
                com.google.android.gms.drive.internal.GetMetadataRequest r0 = (com.google.android.gms.drive.internal.GetMetadataRequest) r0
            L_0x0025:
                android.os.IBinder r2 = r6.readStrongBinder()
                com.google.android.gms.drive.internal.p r2 = com.google.android.gms.drive.internal.C0234p.C0235a.m502D(r2)
                r4.mo2666a(r0, r2)
                r7.writeNoException()
                r0 = r1
                goto L_0x000a
            L_0x0035:
                java.lang.String r2 = "com.google.android.gms.drive.internal.IDriveService"
                r6.enforceInterface(r2)
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x0048
                android.os.Parcelable$Creator<com.google.android.gms.drive.internal.QueryRequest> r0 = com.google.android.gms.drive.internal.QueryRequest.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r6)
                com.google.android.gms.drive.internal.QueryRequest r0 = (com.google.android.gms.drive.internal.QueryRequest) r0
            L_0x0048:
                android.os.IBinder r2 = r6.readStrongBinder()
                com.google.android.gms.drive.internal.p r2 = com.google.android.gms.drive.internal.C0234p.C0235a.m502D(r2)
                r4.mo2668a(r0, r2)
                r7.writeNoException()
                r0 = r1
                goto L_0x000a
            L_0x0058:
                java.lang.String r2 = "com.google.android.gms.drive.internal.IDriveService"
                r6.enforceInterface(r2)
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x006b
                android.os.Parcelable$Creator<com.google.android.gms.drive.internal.UpdateMetadataRequest> r0 = com.google.android.gms.drive.internal.UpdateMetadataRequest.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r6)
                com.google.android.gms.drive.internal.UpdateMetadataRequest r0 = (com.google.android.gms.drive.internal.UpdateMetadataRequest) r0
            L_0x006b:
                android.os.IBinder r2 = r6.readStrongBinder()
                com.google.android.gms.drive.internal.p r2 = com.google.android.gms.drive.internal.C0234p.C0235a.m502D(r2)
                r4.mo2669a(r0, r2)
                r7.writeNoException()
                r0 = r1
                goto L_0x000a
            L_0x007b:
                java.lang.String r2 = "com.google.android.gms.drive.internal.IDriveService"
                r6.enforceInterface(r2)
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x008e
                android.os.Parcelable$Creator<com.google.android.gms.drive.internal.CreateContentsRequest> r0 = com.google.android.gms.drive.internal.CreateContentsRequest.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r6)
                com.google.android.gms.drive.internal.CreateContentsRequest r0 = (com.google.android.gms.drive.internal.CreateContentsRequest) r0
            L_0x008e:
                android.os.IBinder r2 = r6.readStrongBinder()
                com.google.android.gms.drive.internal.p r2 = com.google.android.gms.drive.internal.C0234p.C0235a.m502D(r2)
                r4.mo2663a(r0, r2)
                r7.writeNoException()
                r0 = r1
                goto L_0x000a
            L_0x009f:
                java.lang.String r2 = "com.google.android.gms.drive.internal.IDriveService"
                r6.enforceInterface(r2)
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x00b2
                android.os.Parcelable$Creator<com.google.android.gms.drive.internal.CreateFileRequest> r0 = com.google.android.gms.drive.internal.CreateFileRequest.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r6)
                com.google.android.gms.drive.internal.CreateFileRequest r0 = (com.google.android.gms.drive.internal.CreateFileRequest) r0
            L_0x00b2:
                android.os.IBinder r2 = r6.readStrongBinder()
                com.google.android.gms.drive.internal.p r2 = com.google.android.gms.drive.internal.C0234p.C0235a.m502D(r2)
                r4.mo2664a(r0, r2)
                r7.writeNoException()
                r0 = r1
                goto L_0x000a
            L_0x00c3:
                java.lang.String r2 = "com.google.android.gms.drive.internal.IDriveService"
                r6.enforceInterface(r2)
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x00d6
                android.os.Parcelable$Creator<com.google.android.gms.drive.internal.CreateFolderRequest> r0 = com.google.android.gms.drive.internal.CreateFolderRequest.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r6)
                com.google.android.gms.drive.internal.CreateFolderRequest r0 = (com.google.android.gms.drive.internal.CreateFolderRequest) r0
            L_0x00d6:
                android.os.IBinder r2 = r6.readStrongBinder()
                com.google.android.gms.drive.internal.p r2 = com.google.android.gms.drive.internal.C0234p.C0235a.m502D(r2)
                r4.mo2665a(r0, r2)
                r7.writeNoException()
                r0 = r1
                goto L_0x000a
            L_0x00e7:
                java.lang.String r2 = "com.google.android.gms.drive.internal.IDriveService"
                r6.enforceInterface(r2)
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x00fa
                android.os.Parcelable$Creator<com.google.android.gms.drive.internal.OpenContentsRequest> r0 = com.google.android.gms.drive.internal.OpenContentsRequest.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r6)
                com.google.android.gms.drive.internal.OpenContentsRequest r0 = (com.google.android.gms.drive.internal.OpenContentsRequest) r0
            L_0x00fa:
                android.os.IBinder r2 = r6.readStrongBinder()
                com.google.android.gms.drive.internal.p r2 = com.google.android.gms.drive.internal.C0234p.C0235a.m502D(r2)
                r4.mo2667a(r0, r2)
                r7.writeNoException()
                r0 = r1
                goto L_0x000a
            L_0x010b:
                java.lang.String r2 = "com.google.android.gms.drive.internal.IDriveService"
                r6.enforceInterface(r2)
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x011e
                android.os.Parcelable$Creator<com.google.android.gms.drive.internal.CloseContentsRequest> r0 = com.google.android.gms.drive.internal.CloseContentsRequest.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r6)
                com.google.android.gms.drive.internal.CloseContentsRequest r0 = (com.google.android.gms.drive.internal.CloseContentsRequest) r0
            L_0x011e:
                android.os.IBinder r2 = r6.readStrongBinder()
                com.google.android.gms.drive.internal.p r2 = com.google.android.gms.drive.internal.C0234p.C0235a.m502D(r2)
                r4.mo2662a(r0, r2)
                r7.writeNoException()
                r0 = r1
                goto L_0x000a
            L_0x012f:
                java.lang.String r0 = "com.google.android.gms.drive.internal.IDriveService"
                r6.enforceInterface(r0)
                android.os.IBinder r0 = r6.readStrongBinder()
                com.google.android.gms.drive.internal.p r0 = com.google.android.gms.drive.internal.C0234p.C0235a.m502D(r0)
                r4.mo2670a(r0)
                r7.writeNoException()
                r0 = r1
                goto L_0x000a
            L_0x0145:
                java.lang.String r2 = "com.google.android.gms.drive.internal.IDriveService"
                r6.enforceInterface(r2)
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x0158
                android.os.Parcelable$Creator<com.google.android.gms.drive.internal.OpenFileIntentSenderRequest> r0 = com.google.android.gms.drive.internal.OpenFileIntentSenderRequest.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r6)
                com.google.android.gms.drive.internal.OpenFileIntentSenderRequest r0 = (com.google.android.gms.drive.internal.OpenFileIntentSenderRequest) r0
            L_0x0158:
                android.content.IntentSender r0 = r4.mo2661a(r0)
                r7.writeNoException()
                if (r0 == 0) goto L_0x016a
                r7.writeInt(r1)
                r0.writeToParcel(r7, r1)
            L_0x0167:
                r0 = r1
                goto L_0x000a
            L_0x016a:
                r7.writeInt(r3)
                goto L_0x0167
            L_0x016e:
                java.lang.String r2 = "com.google.android.gms.drive.internal.IDriveService"
                r6.enforceInterface(r2)
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x0181
                android.os.Parcelable$Creator<com.google.android.gms.drive.internal.CreateFileIntentSenderRequest> r0 = com.google.android.gms.drive.internal.CreateFileIntentSenderRequest.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r6)
                com.google.android.gms.drive.internal.CreateFileIntentSenderRequest r0 = (com.google.android.gms.drive.internal.CreateFileIntentSenderRequest) r0
            L_0x0181:
                android.content.IntentSender r0 = r4.mo2660a(r0)
                r7.writeNoException()
                if (r0 == 0) goto L_0x0193
                r7.writeInt(r1)
                r0.writeToParcel(r7, r1)
            L_0x0190:
                r0 = r1
                goto L_0x000a
            L_0x0193:
                r7.writeInt(r3)
                goto L_0x0190
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.drive.internal.C0231o.C0232a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    /* renamed from: a */
    IntentSender mo2660a(CreateFileIntentSenderRequest createFileIntentSenderRequest) throws RemoteException;

    /* renamed from: a */
    IntentSender mo2661a(OpenFileIntentSenderRequest openFileIntentSenderRequest) throws RemoteException;

    /* renamed from: a */
    void mo2662a(CloseContentsRequest closeContentsRequest, C0234p pVar) throws RemoteException;

    /* renamed from: a */
    void mo2663a(CreateContentsRequest createContentsRequest, C0234p pVar) throws RemoteException;

    /* renamed from: a */
    void mo2664a(CreateFileRequest createFileRequest, C0234p pVar) throws RemoteException;

    /* renamed from: a */
    void mo2665a(CreateFolderRequest createFolderRequest, C0234p pVar) throws RemoteException;

    /* renamed from: a */
    void mo2666a(GetMetadataRequest getMetadataRequest, C0234p pVar) throws RemoteException;

    /* renamed from: a */
    void mo2667a(OpenContentsRequest openContentsRequest, C0234p pVar) throws RemoteException;

    /* renamed from: a */
    void mo2668a(QueryRequest queryRequest, C0234p pVar) throws RemoteException;

    /* renamed from: a */
    void mo2669a(UpdateMetadataRequest updateMetadataRequest, C0234p pVar) throws RemoteException;

    /* renamed from: a */
    void mo2670a(C0234p pVar) throws RemoteException;
}
