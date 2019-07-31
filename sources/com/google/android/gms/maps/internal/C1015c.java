package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C0270b;
import com.google.android.gms.dynamic.C0270b.C0271a;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate.C0997a;
import com.google.android.gms.maps.internal.IMapFragmentDelegate.C1003a;
import com.google.android.gms.maps.internal.IMapViewDelegate.C1005a;
import com.google.android.gms.maps.model.internal.C1070a;
import com.google.android.gms.maps.model.internal.C1070a.C1071a;

/* renamed from: com.google.android.gms.maps.internal.c */
public interface C1015c extends IInterface {

    /* renamed from: com.google.android.gms.maps.internal.c$a */
    public static abstract class C1016a extends Binder implements C1015c {

        /* renamed from: com.google.android.gms.maps.internal.c$a$a */
        private static class C1017a implements C1015c {

            /* renamed from: dU */
            private IBinder f2531dU;

            C1017a(IBinder iBinder) {
                this.f2531dU = iBinder;
            }

            /* renamed from: a */
            public IMapViewDelegate mo5644a(C0270b bVar, GoogleMapOptions googleMapOptions) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
                    obtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    if (googleMapOptions != null) {
                        obtain.writeInt(1);
                        googleMapOptions.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f2531dU.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return C1005a.m3084V(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo5645a(C0270b bVar, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
                    obtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    obtain.writeInt(i);
                    this.f2531dU.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f2531dU;
            }

            /* renamed from: e */
            public void mo5646e(C0270b bVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
                    obtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    this.f2531dU.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: eA */
            public C1070a mo5647eA() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
                    this.f2531dU.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return C1071a.m3190aj(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: ez */
            public ICameraUpdateFactoryDelegate mo5648ez() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
                    this.f2531dU.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return C0997a.m3080O(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: f */
            public IMapFragmentDelegate mo5649f(C0270b bVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
                    obtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    this.f2531dU.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return C1003a.m3083U(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: Q */
        public static C1015c m3096Q(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C1015c)) ? new C1017a(iBinder) : (C1015c) queryLocalInterface;
        }

        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            IBinder iBinder = null;
            switch (code) {
                case 1:
                    data.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                    mo5646e(C0271a.m632E(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case 2:
                    data.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                    IMapFragmentDelegate f = mo5649f(C0271a.m632E(data.readStrongBinder()));
                    reply.writeNoException();
                    if (f != null) {
                        iBinder = f.asBinder();
                    }
                    reply.writeStrongBinder(iBinder);
                    return true;
                case 3:
                    data.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                    IMapViewDelegate a = mo5644a(C0271a.m632E(data.readStrongBinder()), data.readInt() != 0 ? GoogleMapOptions.CREATOR.createFromParcel(data) : null);
                    reply.writeNoException();
                    if (a != null) {
                        iBinder = a.asBinder();
                    }
                    reply.writeStrongBinder(iBinder);
                    return true;
                case 4:
                    data.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                    ICameraUpdateFactoryDelegate ez = mo5648ez();
                    reply.writeNoException();
                    if (ez != null) {
                        iBinder = ez.asBinder();
                    }
                    reply.writeStrongBinder(iBinder);
                    return true;
                case 5:
                    data.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                    C1070a eA = mo5647eA();
                    reply.writeNoException();
                    if (eA != null) {
                        iBinder = eA.asBinder();
                    }
                    reply.writeStrongBinder(iBinder);
                    return true;
                case 6:
                    data.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                    mo5645a(C0271a.m632E(data.readStrongBinder()), data.readInt());
                    reply.writeNoException();
                    return true;
                case 1598968902:
                    reply.writeString("com.google.android.gms.maps.internal.ICreator");
                    return true;
                default:
                    return super.onTransact(code, data, reply, flags);
            }
        }
    }

    /* renamed from: a */
    IMapViewDelegate mo5644a(C0270b bVar, GoogleMapOptions googleMapOptions) throws RemoteException;

    /* renamed from: a */
    void mo5645a(C0270b bVar, int i) throws RemoteException;

    /* renamed from: e */
    void mo5646e(C0270b bVar) throws RemoteException;

    /* renamed from: eA */
    C1070a mo5647eA() throws RemoteException;

    /* renamed from: ez */
    ICameraUpdateFactoryDelegate mo5648ez() throws RemoteException;

    /* renamed from: f */
    IMapFragmentDelegate mo5649f(C0270b bVar) throws RemoteException;
}
