package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.eb */
public interface C0587eb extends IInterface {

    /* renamed from: com.google.android.gms.internal.eb$a */
    public static abstract class C0588a extends Binder implements C0587eb {

        /* renamed from: com.google.android.gms.internal.eb$a$a */
        private static class C0589a implements C0587eb {

            /* renamed from: dU */
            private IBinder f1554dU;

            C0589a(IBinder iBinder) {
                this.f1554dU = iBinder;
            }

            public IBinder asBinder() {
                return this.f1554dU;
            }

            /* renamed from: b */
            public void mo3900b(int i, IBinder iBinder, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsCallbacks");
                    obtain.writeInt(i);
                    obtain.writeStrongBinder(iBinder);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1554dU.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C0588a() {
            attachInterface(this, "com.google.android.gms.common.internal.IGmsCallbacks");
        }

        /* renamed from: x */
        public static C0587eb m1494x(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsCallbacks");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C0587eb)) ? new C0589a(iBinder) : (C0587eb) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            switch (code) {
                case 1:
                    data.enforceInterface("com.google.android.gms.common.internal.IGmsCallbacks");
                    mo3900b(data.readInt(), data.readStrongBinder(), data.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(data) : null);
                    reply.writeNoException();
                    return true;
                case 1598968902:
                    reply.writeString("com.google.android.gms.common.internal.IGmsCallbacks");
                    return true;
                default:
                    return super.onTransact(code, data, reply, flags);
            }
        }
    }

    /* renamed from: b */
    void mo3900b(int i, IBinder iBinder, Bundle bundle) throws RemoteException;
}
