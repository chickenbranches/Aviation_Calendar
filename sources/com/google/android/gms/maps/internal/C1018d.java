package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C0270b;
import com.google.android.gms.dynamic.C0270b.C0271a;
import com.google.android.gms.maps.model.internal.C1079d;
import com.google.android.gms.maps.model.internal.C1079d.C1080a;

/* renamed from: com.google.android.gms.maps.internal.d */
public interface C1018d extends IInterface {

    /* renamed from: com.google.android.gms.maps.internal.d$a */
    public static abstract class C1019a extends Binder implements C1018d {

        /* renamed from: com.google.android.gms.maps.internal.d$a$a */
        private static class C1020a implements C1018d {

            /* renamed from: dU */
            private IBinder f2532dU;

            C1020a(IBinder iBinder) {
                this.f2532dU = iBinder;
            }

            public IBinder asBinder() {
                return this.f2532dU;
            }

            /* renamed from: f */
            public C0270b mo5422f(C1079d dVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IInfoWindowAdapter");
                    obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
                    this.f2532dU.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return C0271a.m632E(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: g */
            public C0270b mo5423g(C1079d dVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IInfoWindowAdapter");
                    obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
                    this.f2532dU.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return C0271a.m632E(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C1019a() {
            attachInterface(this, "com.google.android.gms.maps.internal.IInfoWindowAdapter");
        }

        /* renamed from: S */
        public static C1018d m3105S(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IInfoWindowAdapter");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C1018d)) ? new C1020a(iBinder) : (C1018d) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            IBinder iBinder = null;
            switch (code) {
                case 1:
                    data.enforceInterface("com.google.android.gms.maps.internal.IInfoWindowAdapter");
                    C0270b f = mo5422f(C1080a.m3210am(data.readStrongBinder()));
                    reply.writeNoException();
                    if (f != null) {
                        iBinder = f.asBinder();
                    }
                    reply.writeStrongBinder(iBinder);
                    return true;
                case 2:
                    data.enforceInterface("com.google.android.gms.maps.internal.IInfoWindowAdapter");
                    C0270b g = mo5423g(C1080a.m3210am(data.readStrongBinder()));
                    reply.writeNoException();
                    if (g != null) {
                        iBinder = g.asBinder();
                    }
                    reply.writeStrongBinder(iBinder);
                    return true;
                case 1598968902:
                    reply.writeString("com.google.android.gms.maps.internal.IInfoWindowAdapter");
                    return true;
                default:
                    return super.onTransact(code, data, reply, flags);
            }
        }
    }

    /* renamed from: f */
    C0270b mo5422f(C1079d dVar) throws RemoteException;

    /* renamed from: g */
    C0270b mo5423g(C1079d dVar) throws RemoteException;
}
