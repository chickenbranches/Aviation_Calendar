package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.cd */
public interface C0476cd extends IInterface {

    /* renamed from: com.google.android.gms.internal.cd$a */
    public static abstract class C0477a extends Binder implements C0476cd {

        /* renamed from: com.google.android.gms.internal.cd$a$a */
        private static class C0478a implements C0476cd {

            /* renamed from: dU */
            private IBinder f1263dU;

            C0478a(IBinder iBinder) {
                this.f1263dU = iBinder;
            }

            public IBinder asBinder() {
                return this.f1263dU;
            }

            /* renamed from: b */
            public C0474cb mo3646b(C0470bz bzVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.request.IAdRequestService");
                    if (bzVar != null) {
                        obtain.writeInt(1);
                        bzVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1263dU.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? C0474cb.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C0477a() {
            attachInterface(this, "com.google.android.gms.ads.internal.request.IAdRequestService");
        }

        /* renamed from: q */
        public static C0476cd m1061q(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C0476cd)) ? new C0478a(iBinder) : (C0476cd) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            switch (code) {
                case 1:
                    data.enforceInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
                    C0474cb b = mo3646b(data.readInt() != 0 ? C0470bz.CREATOR.createFromParcel(data) : null);
                    reply.writeNoException();
                    if (b != null) {
                        reply.writeInt(1);
                        b.writeToParcel(reply, 1);
                    } else {
                        reply.writeInt(0);
                    }
                    return true;
                case 1598968902:
                    reply.writeString("com.google.android.gms.ads.internal.request.IAdRequestService");
                    return true;
                default:
                    return super.onTransact(code, data, reply, flags);
            }
        }
    }

    /* renamed from: b */
    C0474cb mo3646b(C0470bz bzVar) throws RemoteException;
}
