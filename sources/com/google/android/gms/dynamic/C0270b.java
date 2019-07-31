package com.google.android.gms.dynamic;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.dynamic.b */
public interface C0270b extends IInterface {

    /* renamed from: com.google.android.gms.dynamic.b$a */
    public static abstract class C0271a extends Binder implements C0270b {

        /* renamed from: com.google.android.gms.dynamic.b$a$a */
        private static class C0272a implements C0270b {

            /* renamed from: dU */
            private IBinder f562dU;

            C0272a(IBinder iBinder) {
                this.f562dU = iBinder;
            }

            public IBinder asBinder() {
                return this.f562dU;
            }
        }

        public C0271a() {
            attachInterface(this, "com.google.android.gms.dynamic.IObjectWrapper");
        }

        /* renamed from: E */
        public static C0270b m632E(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C0270b)) ? new C0272a(iBinder) : (C0270b) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            switch (code) {
                case 1598968902:
                    reply.writeString("com.google.android.gms.dynamic.IObjectWrapper");
                    return true;
                default:
                    return super.onTransact(code, data, reply, flags);
            }
        }
    }
}
