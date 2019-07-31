package com.google.android.gms.maps.internal;

import android.graphics.Bitmap;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C0270b;
import com.google.android.gms.dynamic.C0270b.C0271a;

/* renamed from: com.google.android.gms.maps.internal.o */
public interface C1051o extends IInterface {

    /* renamed from: com.google.android.gms.maps.internal.o$a */
    public static abstract class C1052a extends Binder implements C1051o {

        /* renamed from: com.google.android.gms.maps.internal.o$a$a */
        private static class C1053a implements C1051o {

            /* renamed from: dU */
            private IBinder f2543dU;

            C1053a(IBinder iBinder) {
                this.f2543dU = iBinder;
            }

            public IBinder asBinder() {
                return this.f2543dU;
            }

            /* renamed from: c */
            public void mo5427c(C0270b bVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ISnapshotReadyCallback");
                    obtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    this.f2543dU.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void onSnapshotReady(Bitmap snapshot) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ISnapshotReadyCallback");
                    if (snapshot != null) {
                        obtain.writeInt(1);
                        snapshot.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f2543dU.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C1052a() {
            attachInterface(this, "com.google.android.gms.maps.internal.ISnapshotReadyCallback");
        }

        /* renamed from: ah */
        public static C1051o m3133ah(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ISnapshotReadyCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C1051o)) ? new C1053a(iBinder) : (C1051o) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            switch (code) {
                case 1:
                    data.enforceInterface("com.google.android.gms.maps.internal.ISnapshotReadyCallback");
                    onSnapshotReady(data.readInt() != 0 ? (Bitmap) Bitmap.CREATOR.createFromParcel(data) : null);
                    reply.writeNoException();
                    return true;
                case 2:
                    data.enforceInterface("com.google.android.gms.maps.internal.ISnapshotReadyCallback");
                    mo5427c(C0271a.m632E(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case 1598968902:
                    reply.writeString("com.google.android.gms.maps.internal.ISnapshotReadyCallback");
                    return true;
                default:
                    return super.onTransact(code, data, reply, flags);
            }
        }
    }

    /* renamed from: c */
    void mo5427c(C0270b bVar) throws RemoteException;

    void onSnapshotReady(Bitmap bitmap) throws RemoteException;
}
