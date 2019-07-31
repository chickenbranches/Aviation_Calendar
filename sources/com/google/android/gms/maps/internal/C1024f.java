package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.internal.C1079d;
import com.google.android.gms.maps.model.internal.C1079d.C1080a;

/* renamed from: com.google.android.gms.maps.internal.f */
public interface C1024f extends IInterface {

    /* renamed from: com.google.android.gms.maps.internal.f$a */
    public static abstract class C1025a extends Binder implements C1024f {

        /* renamed from: com.google.android.gms.maps.internal.f$a$a */
        private static class C1026a implements C1024f {

            /* renamed from: dU */
            private IBinder f2534dU;

            C1026a(IBinder iBinder) {
                this.f2534dU = iBinder;
            }

            public IBinder asBinder() {
                return this.f2534dU;
            }

            /* renamed from: e */
            public void mo5421e(C1079d dVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnInfoWindowClickListener");
                    obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
                    this.f2534dU.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C1025a() {
            attachInterface(this, "com.google.android.gms.maps.internal.IOnInfoWindowClickListener");
        }

        /* renamed from: X */
        public static C1024f m3110X(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnInfoWindowClickListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C1024f)) ? new C1026a(iBinder) : (C1024f) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            switch (code) {
                case 1:
                    data.enforceInterface("com.google.android.gms.maps.internal.IOnInfoWindowClickListener");
                    mo5421e(C1080a.m3210am(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case 1598968902:
                    reply.writeString("com.google.android.gms.maps.internal.IOnInfoWindowClickListener");
                    return true;
                default:
                    return super.onTransact(code, data, reply, flags);
            }
        }
    }

    /* renamed from: e */
    void mo5421e(C1079d dVar) throws RemoteException;
}
