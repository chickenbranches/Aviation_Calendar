package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.maps.internal.b */
public interface C1012b extends IInterface {

    /* renamed from: com.google.android.gms.maps.internal.b$a */
    public static abstract class C1013a extends Binder implements C1012b {

        /* renamed from: com.google.android.gms.maps.internal.b$a$a */
        private static class C1014a implements C1012b {

            /* renamed from: dU */
            private IBinder f2530dU;

            C1014a(IBinder iBinder) {
                this.f2530dU = iBinder;
            }

            public IBinder asBinder() {
                return this.f2530dU;
            }

            public void onCancel() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICancelableCallback");
                    this.f2530dU.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void onFinish() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICancelableCallback");
                    this.f2530dU.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C1013a() {
            attachInterface(this, "com.google.android.gms.maps.internal.ICancelableCallback");
        }

        /* renamed from: P */
        public static C1012b m3089P(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICancelableCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C1012b)) ? new C1014a(iBinder) : (C1012b) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            switch (code) {
                case 1:
                    data.enforceInterface("com.google.android.gms.maps.internal.ICancelableCallback");
                    onFinish();
                    reply.writeNoException();
                    return true;
                case 2:
                    data.enforceInterface("com.google.android.gms.maps.internal.ICancelableCallback");
                    onCancel();
                    reply.writeNoException();
                    return true;
                case 1598968902:
                    reply.writeString("com.google.android.gms.maps.internal.ICancelableCallback");
                    return true;
                default:
                    return super.onTransact(code, data, reply, flags);
            }
        }
    }

    void onCancel() throws RemoteException;

    void onFinish() throws RemoteException;
}
