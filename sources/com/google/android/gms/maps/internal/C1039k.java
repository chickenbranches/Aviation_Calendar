package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.internal.C1079d;
import com.google.android.gms.maps.model.internal.C1079d.C1080a;

/* renamed from: com.google.android.gms.maps.internal.k */
public interface C1039k extends IInterface {

    /* renamed from: com.google.android.gms.maps.internal.k$a */
    public static abstract class C1040a extends Binder implements C1039k {

        /* renamed from: com.google.android.gms.maps.internal.k$a$a */
        private static class C1041a implements C1039k {

            /* renamed from: dU */
            private IBinder f2539dU;

            C1041a(IBinder iBinder) {
                this.f2539dU = iBinder;
            }

            /* renamed from: a */
            public boolean mo5432a(C1079d dVar) throws RemoteException {
                boolean z = true;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMarkerClickListener");
                    obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
                    this.f2539dU.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f2539dU;
            }
        }

        public C1040a() {
            attachInterface(this, "com.google.android.gms.maps.internal.IOnMarkerClickListener");
        }

        /* renamed from: ac */
        public static C1039k m3119ac(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnMarkerClickListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C1039k)) ? new C1041a(iBinder) : (C1039k) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            switch (code) {
                case 1:
                    data.enforceInterface("com.google.android.gms.maps.internal.IOnMarkerClickListener");
                    boolean a = mo5432a(C1080a.m3210am(data.readStrongBinder()));
                    reply.writeNoException();
                    reply.writeInt(a ? 1 : 0);
                    return true;
                case 1598968902:
                    reply.writeString("com.google.android.gms.maps.internal.IOnMarkerClickListener");
                    return true;
                default:
                    return super.onTransact(code, data, reply, flags);
            }
        }
    }

    /* renamed from: a */
    boolean mo5432a(C1079d dVar) throws RemoteException;
}
