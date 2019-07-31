package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.C0843hk.C0844a;

/* renamed from: com.google.android.gms.internal.hl */
public interface C0846hl extends IInterface {

    /* renamed from: com.google.android.gms.internal.hl$a */
    public static abstract class C0847a extends Binder implements C0846hl {

        /* renamed from: com.google.android.gms.internal.hl$a$a */
        private static class C0848a implements C0846hl {

            /* renamed from: dU */
            private IBinder f2121dU;

            C0848a(IBinder iBinder) {
                this.f2121dU = iBinder;
            }

            /* renamed from: a */
            public void mo4673a(C0843hk hkVar, Uri uri, Bundle bundle, boolean z) throws RemoteException {
                IBinder iBinder = null;
                int i = 1;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.panorama.internal.IPanoramaService");
                    if (hkVar != null) {
                        iBinder = hkVar.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!z) {
                        i = 0;
                    }
                    obtain.writeInt(i);
                    this.f2121dU.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f2121dU;
            }
        }

        /* renamed from: as */
        public static C0846hl m2529as(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.panorama.internal.IPanoramaService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C0846hl)) ? new C0848a(iBinder) : (C0846hl) queryLocalInterface;
        }

        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            switch (code) {
                case 1:
                    data.enforceInterface("com.google.android.gms.panorama.internal.IPanoramaService");
                    mo4673a(C0844a.m2526ar(data.readStrongBinder()), data.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(data) : null, data.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(data) : null, data.readInt() != 0);
                    return true;
                case 1598968902:
                    reply.writeString("com.google.android.gms.panorama.internal.IPanoramaService");
                    return true;
                default:
                    return super.onTransact(code, data, reply, flags);
            }
        }
    }

    /* renamed from: a */
    void mo4673a(C0843hk hkVar, Uri uri, Bundle bundle, boolean z) throws RemoteException;
}
