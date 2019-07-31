package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.gz */
public interface C0827gz extends IInterface {

    /* renamed from: com.google.android.gms.internal.gz$a */
    public static abstract class C0828a extends Binder implements C0827gz {

        /* renamed from: com.google.android.gms.internal.gz$a$a */
        private static class C0829a implements C0827gz {

            /* renamed from: dU */
            private IBinder f2073dU;

            C0829a(IBinder iBinder) {
                this.f2073dU = iBinder;
            }

            /* renamed from: a */
            public void mo4592a(int i, C0832hb hbVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.places.internal.IPlacesCallbacks");
                    obtain.writeInt(i);
                    if (hbVar != null) {
                        obtain.writeInt(1);
                        hbVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f2073dU.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f2073dU;
            }
        }

        /* renamed from: N */
        public static C0827gz m2481N(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.places.internal.IPlacesCallbacks");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C0827gz)) ? new C0829a(iBinder) : (C0827gz) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            switch (code) {
                case 1:
                    data.enforceInterface("com.google.android.gms.location.places.internal.IPlacesCallbacks");
                    mo4592a(data.readInt(), data.readInt() != 0 ? C0832hb.CREATOR.createFromParcel(data) : null);
                    return true;
                case 1598968902:
                    reply.writeString("com.google.android.gms.location.places.internal.IPlacesCallbacks");
                    return true;
                default:
                    return super.onTransact(code, data, reply, flags);
            }
        }
    }

    /* renamed from: a */
    void mo4592a(int i, C0832hb hbVar) throws RemoteException;
}
