package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.maps.internal.i */
public interface C1033i extends IInterface {

    /* renamed from: com.google.android.gms.maps.internal.i$a */
    public static abstract class C1034a extends Binder implements C1033i {

        /* renamed from: com.google.android.gms.maps.internal.i$a$a */
        private static class C1035a implements C1033i {

            /* renamed from: dU */
            private IBinder f2537dU;

            C1035a(IBinder iBinder) {
                this.f2537dU = iBinder;
            }

            public IBinder asBinder() {
                return this.f2537dU;
            }

            public void onMapLoaded() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMapLoadedCallback");
                    this.f2537dU.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C1034a() {
            attachInterface(this, "com.google.android.gms.maps.internal.IOnMapLoadedCallback");
        }

        /* renamed from: aa */
        public static C1033i m3116aa(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnMapLoadedCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C1033i)) ? new C1035a(iBinder) : (C1033i) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            switch (code) {
                case 1:
                    data.enforceInterface("com.google.android.gms.maps.internal.IOnMapLoadedCallback");
                    onMapLoaded();
                    reply.writeNoException();
                    return true;
                case 1598968902:
                    reply.writeString("com.google.android.gms.maps.internal.IOnMapLoadedCallback");
                    return true;
                default:
                    return super.onTransact(code, data, reply, flags);
            }
        }
    }

    void onMapLoaded() throws RemoteException;
}
