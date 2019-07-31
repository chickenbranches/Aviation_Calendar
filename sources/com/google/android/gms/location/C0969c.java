package com.google.android.gms.location;

import android.location.Location;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.location.c */
public interface C0969c extends IInterface {

    /* renamed from: com.google.android.gms.location.c$a */
    public static abstract class C0970a extends Binder implements C0969c {

        /* renamed from: com.google.android.gms.location.c$a$a */
        private static class C0971a implements C0969c {

            /* renamed from: dU */
            private IBinder f2449dU;

            C0971a(IBinder iBinder) {
                this.f2449dU = iBinder;
            }

            public IBinder asBinder() {
                return this.f2449dU;
            }

            public void onLocationChanged(Location location) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.ILocationListener");
                    if (location != null) {
                        obtain.writeInt(1);
                        location.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f2449dU.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public C0970a() {
            attachInterface(this, "com.google.android.gms.location.ILocationListener");
        }

        /* renamed from: I */
        public static C0969c m3034I(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C0969c)) ? new C0971a(iBinder) : (C0969c) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            switch (code) {
                case 1:
                    data.enforceInterface("com.google.android.gms.location.ILocationListener");
                    onLocationChanged(data.readInt() != 0 ? (Location) Location.CREATOR.createFromParcel(data) : null);
                    return true;
                case 1598968902:
                    reply.writeString("com.google.android.gms.location.ILocationListener");
                    return true;
                default:
                    return super.onTransact(code, data, reply, flags);
            }
        }
    }

    void onLocationChanged(Location location) throws RemoteException;
}
