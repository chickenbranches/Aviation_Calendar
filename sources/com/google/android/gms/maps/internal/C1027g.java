package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C0270b;
import com.google.android.gms.dynamic.C0270b.C0271a;

/* renamed from: com.google.android.gms.maps.internal.g */
public interface C1027g extends IInterface {

    /* renamed from: com.google.android.gms.maps.internal.g$a */
    public static abstract class C1028a extends Binder implements C1027g {

        /* renamed from: com.google.android.gms.maps.internal.g$a$a */
        private static class C1029a implements C1027g {

            /* renamed from: dU */
            private IBinder f2535dU;

            C1029a(IBinder iBinder) {
                this.f2535dU = iBinder;
            }

            public IBinder asBinder() {
                return this.f2535dU;
            }

            /* renamed from: g */
            public void mo5661g(C0270b bVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnLocationChangeListener");
                    obtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    this.f2535dU.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: Y */
        public static C1027g m3113Y(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnLocationChangeListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C1027g)) ? new C1029a(iBinder) : (C1027g) queryLocalInterface;
        }

        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            switch (code) {
                case 1:
                    data.enforceInterface("com.google.android.gms.maps.internal.IOnLocationChangeListener");
                    mo5661g(C0271a.m632E(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case 1598968902:
                    reply.writeString("com.google.android.gms.maps.internal.IOnLocationChangeListener");
                    return true;
                default:
                    return super.onTransact(code, data, reply, flags);
            }
        }
    }

    /* renamed from: g */
    void mo5661g(C0270b bVar) throws RemoteException;
}
