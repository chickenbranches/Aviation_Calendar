package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.C0413bc.C0414a;

/* renamed from: com.google.android.gms.internal.bb */
public interface C0410bb extends IInterface {

    /* renamed from: com.google.android.gms.internal.bb$a */
    public static abstract class C0411a extends Binder implements C0410bb {

        /* renamed from: com.google.android.gms.internal.bb$a$a */
        private static class C0412a implements C0410bb {

            /* renamed from: dU */
            private IBinder f1146dU;

            C0412a(IBinder iBinder) {
                this.f1146dU = iBinder;
            }

            public IBinder asBinder() {
                return this.f1146dU;
            }

            /* renamed from: l */
            public C0413bc mo3531l(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
                    obtain.writeString(str);
                    this.f1146dU.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return C0414a.m949j(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C0411a() {
            attachInterface(this, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        }

        /* renamed from: i */
        public static C0410bb m943i(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C0410bb)) ? new C0412a(iBinder) : (C0410bb) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            switch (code) {
                case 1:
                    data.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
                    C0413bc l = mo3531l(data.readString());
                    reply.writeNoException();
                    reply.writeStrongBinder(l != null ? l.asBinder() : null);
                    return true;
                case 1598968902:
                    reply.writeString("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
                    return true;
                default:
                    return super.onTransact(code, data, reply, flags);
            }
        }
    }

    /* renamed from: l */
    C0413bc mo3531l(String str) throws RemoteException;
}
