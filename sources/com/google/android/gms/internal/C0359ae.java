package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ae */
public interface C0359ae extends IInterface {

    /* renamed from: com.google.android.gms.internal.ae$a */
    public static abstract class C0360a extends Binder implements C0359ae {

        /* renamed from: com.google.android.gms.internal.ae$a$a */
        private static class C0361a implements C0359ae {

            /* renamed from: dU */
            private IBinder f842dU;

            C0361a(IBinder iBinder) {
                this.f842dU = iBinder;
            }

            public IBinder asBinder() {
                return this.f842dU;
            }

            public void onAppEvent(String name, String info) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAppEventListener");
                    obtain.writeString(name);
                    obtain.writeString(info);
                    this.f842dU.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C0360a() {
            attachInterface(this, "com.google.android.gms.ads.internal.client.IAppEventListener");
        }

        /* renamed from: h */
        public static C0359ae m853h(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C0359ae)) ? new C0361a(iBinder) : (C0359ae) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            switch (code) {
                case 1:
                    data.enforceInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    onAppEvent(data.readString(), data.readString());
                    reply.writeNoException();
                    return true;
                case 1598968902:
                    reply.writeString("com.google.android.gms.ads.internal.client.IAppEventListener");
                    return true;
                default:
                    return super.onTransact(code, data, reply, flags);
            }
        }
    }

    void onAppEvent(String str, String str2) throws RemoteException;
}
