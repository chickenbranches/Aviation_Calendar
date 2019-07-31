package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.internal.C1079d;
import com.google.android.gms.maps.model.internal.C1079d.C1080a;

/* renamed from: com.google.android.gms.maps.internal.l */
public interface C1042l extends IInterface {

    /* renamed from: com.google.android.gms.maps.internal.l$a */
    public static abstract class C1043a extends Binder implements C1042l {

        /* renamed from: com.google.android.gms.maps.internal.l$a$a */
        private static class C1044a implements C1042l {

            /* renamed from: dU */
            private IBinder f2540dU;

            C1044a(IBinder iBinder) {
                this.f2540dU = iBinder;
            }

            public IBinder asBinder() {
                return this.f2540dU;
            }

            /* renamed from: b */
            public void mo5433b(C1079d dVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMarkerDragListener");
                    obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
                    this.f2540dU.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public void mo5434c(C1079d dVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMarkerDragListener");
                    obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
                    this.f2540dU.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public void mo5435d(C1079d dVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMarkerDragListener");
                    obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
                    this.f2540dU.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C1043a() {
            attachInterface(this, "com.google.android.gms.maps.internal.IOnMarkerDragListener");
        }

        /* renamed from: ad */
        public static C1042l m3124ad(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnMarkerDragListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C1042l)) ? new C1044a(iBinder) : (C1042l) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            switch (code) {
                case 1:
                    data.enforceInterface("com.google.android.gms.maps.internal.IOnMarkerDragListener");
                    mo5433b(C1080a.m3210am(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case 2:
                    data.enforceInterface("com.google.android.gms.maps.internal.IOnMarkerDragListener");
                    mo5435d(C1080a.m3210am(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case 3:
                    data.enforceInterface("com.google.android.gms.maps.internal.IOnMarkerDragListener");
                    mo5434c(C1080a.m3210am(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case 1598968902:
                    reply.writeString("com.google.android.gms.maps.internal.IOnMarkerDragListener");
                    return true;
                default:
                    return super.onTransact(code, data, reply, flags);
            }
        }
    }

    /* renamed from: b */
    void mo5433b(C1079d dVar) throws RemoteException;

    /* renamed from: c */
    void mo5434c(C1079d dVar) throws RemoteException;

    /* renamed from: d */
    void mo5435d(C1079d dVar) throws RemoteException;
}
