package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C0270b;
import com.google.android.gms.dynamic.C0270b.C0271a;

/* renamed from: com.google.android.gms.maps.internal.n */
public interface C1048n extends IInterface {

    /* renamed from: com.google.android.gms.maps.internal.n$a */
    public static abstract class C1049a extends Binder implements C1048n {

        /* renamed from: com.google.android.gms.maps.internal.n$a$a */
        private static class C1050a implements C1048n {

            /* renamed from: dU */
            private IBinder f2542dU;

            C1050a(IBinder iBinder) {
                this.f2542dU = iBinder;
            }

            public IBinder asBinder() {
                return this.f2542dU;
            }

            /* renamed from: d */
            public void mo5424d(C0270b bVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMyLocationChangeListener");
                    obtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    this.f2542dU.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C1049a() {
            attachInterface(this, "com.google.android.gms.maps.internal.IOnMyLocationChangeListener");
        }

        /* renamed from: af */
        public static C1048n m3130af(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnMyLocationChangeListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C1048n)) ? new C1050a(iBinder) : (C1048n) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            switch (code) {
                case 1:
                    data.enforceInterface("com.google.android.gms.maps.internal.IOnMyLocationChangeListener");
                    mo5424d(C0271a.m632E(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case 1598968902:
                    reply.writeString("com.google.android.gms.maps.internal.IOnMyLocationChangeListener");
                    return true;
                default:
                    return super.onTransact(code, data, reply, flags);
            }
        }
    }

    /* renamed from: d */
    void mo5424d(C0270b bVar) throws RemoteException;
}
