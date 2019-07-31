package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C0270b;
import com.google.android.gms.dynamic.C0270b.C0271a;
import com.google.android.gms.internal.C0410bb.C0411a;

/* renamed from: com.google.android.gms.internal.ad */
public interface C0356ad extends IInterface {

    /* renamed from: com.google.android.gms.internal.ad$a */
    public static abstract class C0357a extends Binder implements C0356ad {

        /* renamed from: com.google.android.gms.internal.ad$a$a */
        private static class C0358a implements C0356ad {

            /* renamed from: dU */
            private IBinder f841dU;

            C0358a(IBinder iBinder) {
                this.f841dU = iBinder;
            }

            /* renamed from: a */
            public IBinder mo3447a(C0270b bVar, C0964x xVar, String str, C0410bb bbVar, int i) throws RemoteException {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                    obtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    if (xVar != null) {
                        obtain.writeInt(1);
                        xVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    if (bbVar != null) {
                        iBinder = bbVar.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeInt(i);
                    this.f841dU.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readStrongBinder();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f841dU;
            }
        }

        /* renamed from: g */
        public static C0356ad m851g(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C0356ad)) ? new C0358a(iBinder) : (C0356ad) queryLocalInterface;
        }

        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            switch (code) {
                case 1:
                    data.enforceInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                    IBinder a = mo3447a(C0271a.m632E(data.readStrongBinder()), data.readInt() != 0 ? C0964x.CREATOR.createFromParcel(data) : null, data.readString(), C0411a.m943i(data.readStrongBinder()), data.readInt());
                    reply.writeNoException();
                    reply.writeStrongBinder(a);
                    return true;
                case 1598968902:
                    reply.writeString("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                    return true;
                default:
                    return super.onTransact(code, data, reply, flags);
            }
        }
    }

    /* renamed from: a */
    IBinder mo3447a(C0270b bVar, C0964x xVar, String str, C0410bb bbVar, int i) throws RemoteException;
}
