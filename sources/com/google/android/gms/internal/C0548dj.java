package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.cast.ApplicationMetadata;

/* renamed from: com.google.android.gms.internal.dj */
public interface C0548dj extends IInterface {

    /* renamed from: com.google.android.gms.internal.dj$a */
    public static abstract class C0549a extends Binder implements C0548dj {
        public C0549a() {
            attachInterface(this, "com.google.android.gms.cast.internal.ICastDeviceControllerListener");
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            boolean z = false;
            switch (code) {
                case 1:
                    data.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
                    mo3792t(data.readInt());
                    return true;
                case 2:
                    data.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
                    ApplicationMetadata applicationMetadata = data.readInt() != 0 ? (ApplicationMetadata) ApplicationMetadata.CREATOR.createFromParcel(data) : null;
                    String readString = data.readString();
                    String readString2 = data.readString();
                    if (data.readInt() != 0) {
                        z = true;
                    }
                    mo3785a(applicationMetadata, readString, readString2, z);
                    return true;
                case 3:
                    data.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
                    mo3793u(data.readInt());
                    return true;
                case 4:
                    data.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
                    String readString3 = data.readString();
                    double readDouble = data.readDouble();
                    if (data.readInt() != 0) {
                        z = true;
                    }
                    mo3789b(readString3, readDouble, z);
                    return true;
                case 5:
                    data.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
                    mo3788a(data.readString(), data.readString());
                    return true;
                case 6:
                    data.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
                    mo3790b(data.readString(), data.createByteArray());
                    return true;
                case 7:
                    data.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
                    mo3795w(data.readInt());
                    return true;
                case 8:
                    data.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
                    mo3794v(data.readInt());
                    return true;
                case 9:
                    data.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
                    onApplicationDisconnected(data.readInt());
                    return true;
                case 10:
                    data.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
                    mo3787a(data.readString(), data.readLong(), data.readInt());
                    return true;
                case 11:
                    data.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
                    mo3786a(data.readString(), data.readLong());
                    return true;
                case 1598968902:
                    reply.writeString("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
                    return true;
                default:
                    return super.onTransact(code, data, reply, flags);
            }
        }
    }

    /* renamed from: a */
    void mo3785a(ApplicationMetadata applicationMetadata, String str, String str2, boolean z) throws RemoteException;

    /* renamed from: a */
    void mo3786a(String str, long j) throws RemoteException;

    /* renamed from: a */
    void mo3787a(String str, long j, int i) throws RemoteException;

    /* renamed from: a */
    void mo3788a(String str, String str2) throws RemoteException;

    /* renamed from: b */
    void mo3789b(String str, double d, boolean z) throws RemoteException;

    /* renamed from: b */
    void mo3790b(String str, byte[] bArr) throws RemoteException;

    void onApplicationDisconnected(int i) throws RemoteException;

    /* renamed from: t */
    void mo3792t(int i) throws RemoteException;

    /* renamed from: u */
    void mo3793u(int i) throws RemoteException;

    /* renamed from: v */
    void mo3794v(int i) throws RemoteException;

    /* renamed from: w */
    void mo3795w(int i) throws RemoteException;
}
