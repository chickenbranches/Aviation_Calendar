package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.gk */
public interface C0801gk extends IInterface {

    /* renamed from: com.google.android.gms.internal.gk$a */
    public static abstract class C0802a extends Binder implements C0801gk {

        /* renamed from: com.google.android.gms.internal.gk$a$a */
        private static class C0803a implements C0801gk {

            /* renamed from: dU */
            private IBinder f1902dU;

            C0803a(IBinder iBinder) {
                this.f1902dU = iBinder;
            }

            public IBinder asBinder() {
                return this.f1902dU;
            }

            public void onAddGeofencesResult(int statusCode, String[] geofenceRequestIds) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGeofencerCallbacks");
                    obtain.writeInt(statusCode);
                    obtain.writeStringArray(geofenceRequestIds);
                    this.f1902dU.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void onRemoveGeofencesByPendingIntentResult(int statusCode, PendingIntent pendingIntent) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGeofencerCallbacks");
                    obtain.writeInt(statusCode);
                    if (pendingIntent != null) {
                        obtain.writeInt(1);
                        pendingIntent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1902dU.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void onRemoveGeofencesByRequestIdsResult(int statusCode, String[] geofenceRequestIds) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGeofencerCallbacks");
                    obtain.writeInt(statusCode);
                    obtain.writeStringArray(geofenceRequestIds);
                    this.f1902dU.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C0802a() {
            attachInterface(this, "com.google.android.gms.location.internal.IGeofencerCallbacks");
        }

        /* renamed from: K */
        public static C0801gk m2372K(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGeofencerCallbacks");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C0801gk)) ? new C0803a(iBinder) : (C0801gk) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            switch (code) {
                case 1:
                    data.enforceInterface("com.google.android.gms.location.internal.IGeofencerCallbacks");
                    onAddGeofencesResult(data.readInt(), data.createStringArray());
                    reply.writeNoException();
                    return true;
                case 2:
                    data.enforceInterface("com.google.android.gms.location.internal.IGeofencerCallbacks");
                    onRemoveGeofencesByRequestIdsResult(data.readInt(), data.createStringArray());
                    reply.writeNoException();
                    return true;
                case 3:
                    data.enforceInterface("com.google.android.gms.location.internal.IGeofencerCallbacks");
                    onRemoveGeofencesByPendingIntentResult(data.readInt(), data.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(data) : null);
                    reply.writeNoException();
                    return true;
                case 1598968902:
                    reply.writeString("com.google.android.gms.location.internal.IGeofencerCallbacks");
                    return true;
                default:
                    return super.onTransact(code, data, reply, flags);
            }
        }
    }

    void onAddGeofencesResult(int i, String[] strArr) throws RemoteException;

    void onRemoveGeofencesByPendingIntentResult(int i, PendingIntent pendingIntent) throws RemoteException;

    void onRemoveGeofencesByRequestIdsResult(int i, String[] strArr) throws RemoteException;
}
