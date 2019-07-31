package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C0270b;
import com.google.android.gms.dynamic.C0270b.C0271a;

/* renamed from: com.google.android.gms.internal.hp */
public interface C0857hp extends IInterface {

    /* renamed from: com.google.android.gms.internal.hp$a */
    public static abstract class C0858a extends Binder implements C0857hp {

        /* renamed from: com.google.android.gms.internal.hp$a$a */
        private static class C0859a implements C0857hp {

            /* renamed from: dU */
            private IBinder f2133dU;

            C0859a(IBinder iBinder) {
                this.f2133dU = iBinder;
            }

            /* renamed from: a */
            public C0270b mo4694a(C0270b bVar, int i, int i2, String str, int i3) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusOneButtonCreator");
                    obtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeString(str);
                    obtain.writeInt(i3);
                    this.f2133dU.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return C0271a.m632E(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public C0270b mo4695a(C0270b bVar, int i, int i2, String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusOneButtonCreator");
                    obtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f2133dU.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return C0271a.m632E(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f2133dU;
            }
        }

        /* renamed from: av */
        public static C0857hp m2575av(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.plus.internal.IPlusOneButtonCreator");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C0857hp)) ? new C0859a(iBinder) : (C0857hp) queryLocalInterface;
        }

        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            IBinder iBinder = null;
            switch (code) {
                case 1:
                    data.enforceInterface("com.google.android.gms.plus.internal.IPlusOneButtonCreator");
                    C0270b a = mo4694a(C0271a.m632E(data.readStrongBinder()), data.readInt(), data.readInt(), data.readString(), data.readInt());
                    reply.writeNoException();
                    reply.writeStrongBinder(a != null ? a.asBinder() : null);
                    return true;
                case 2:
                    data.enforceInterface("com.google.android.gms.plus.internal.IPlusOneButtonCreator");
                    C0270b a2 = mo4695a(C0271a.m632E(data.readStrongBinder()), data.readInt(), data.readInt(), data.readString(), data.readString());
                    reply.writeNoException();
                    if (a2 != null) {
                        iBinder = a2.asBinder();
                    }
                    reply.writeStrongBinder(iBinder);
                    return true;
                case 1598968902:
                    reply.writeString("com.google.android.gms.plus.internal.IPlusOneButtonCreator");
                    return true;
                default:
                    return super.onTransact(code, data, reply, flags);
            }
        }
    }

    /* renamed from: a */
    C0270b mo4694a(C0270b bVar, int i, int i2, String str, int i3) throws RemoteException;

    /* renamed from: a */
    C0270b mo4695a(C0270b bVar, int i, int i2, String str, String str2) throws RemoteException;
}
