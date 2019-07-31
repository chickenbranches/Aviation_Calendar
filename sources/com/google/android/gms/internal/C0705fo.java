package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMessage;

/* renamed from: com.google.android.gms.internal.fo */
public interface C0705fo extends IInterface {

    /* renamed from: com.google.android.gms.internal.fo$a */
    public static abstract class C0706a extends Binder implements C0705fo {

        /* renamed from: com.google.android.gms.internal.fo$a$a */
        private static class C0707a implements C0705fo {

            /* renamed from: dU */
            private IBinder f1758dU;

            C0707a(IBinder iBinder) {
                this.f1758dU = iBinder;
            }

            /* renamed from: A */
            public void mo4104A(DataHolder dataHolder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1758dU.transact(5038, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: B */
            public void mo4105B(DataHolder dataHolder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1758dU.transact(5035, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: C */
            public void mo4106C(DataHolder dataHolder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1758dU.transact(5039, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: D */
            public void mo4107D(DataHolder dataHolder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1758dU.transact(8001, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo4108a(int i, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1758dU.transact(8002, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo4109a(int i, String str, boolean z) throws RemoteException {
                int i2 = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    if (z) {
                        i2 = 1;
                    }
                    obtain.writeInt(i2);
                    this.f1758dU.transact(5034, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo4110a(DataHolder dataHolder, DataHolder dataHolder2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (dataHolder2 != null) {
                        obtain.writeInt(1);
                        dataHolder2.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1758dU.transact(5005, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo4111a(DataHolder dataHolder, String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStringArray(strArr);
                    this.f1758dU.transact(5026, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: aB */
            public void mo4112aB(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    obtain.writeInt(i);
                    this.f1758dU.transact(5013, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: aC */
            public void mo4113aC(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    obtain.writeInt(i);
                    this.f1758dU.transact(5015, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: aD */
            public void mo4114aD(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    obtain.writeInt(i);
                    this.f1758dU.transact(5036, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: aE */
            public void mo4115aE(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    obtain.writeInt(i);
                    this.f1758dU.transact(5040, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f1758dU;
            }

            /* renamed from: b */
            public void mo4116b(int i, int i2, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeString(str);
                    this.f1758dU.transact(5033, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public void mo4117b(DataHolder dataHolder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1758dU.transact(5002, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public void mo4118b(DataHolder dataHolder, String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStringArray(strArr);
                    this.f1758dU.transact(5027, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public void mo4119c(DataHolder dataHolder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1758dU.transact(5004, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public void mo4120c(DataHolder dataHolder, String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStringArray(strArr);
                    this.f1758dU.transact(5028, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public void mo4121d(int i, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    this.f1758dU.transact(5001, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public void mo4122d(DataHolder dataHolder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1758dU.transact(5006, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public void mo4123d(DataHolder dataHolder, String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStringArray(strArr);
                    this.f1758dU.transact(5029, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: e */
            public void mo4124e(DataHolder dataHolder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1758dU.transact(5007, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: e */
            public void mo4125e(DataHolder dataHolder, String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStringArray(strArr);
                    this.f1758dU.transact(5030, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: f */
            public void mo4126f(DataHolder dataHolder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1758dU.transact(5008, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: f */
            public void mo4127f(DataHolder dataHolder, String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStringArray(strArr);
                    this.f1758dU.transact(5031, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: g */
            public void mo4128g(DataHolder dataHolder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1758dU.transact(5009, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: h */
            public void mo4129h(DataHolder dataHolder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1758dU.transact(5010, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: i */
            public void mo4130i(DataHolder dataHolder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1758dU.transact(5011, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: j */
            public void mo4131j(DataHolder dataHolder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1758dU.transact(9001, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: k */
            public void mo4132k(DataHolder dataHolder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1758dU.transact(5017, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: l */
            public void mo4133l(DataHolder dataHolder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1758dU.transact(5037, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: m */
            public void mo4134m(DataHolder dataHolder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1758dU.transact(8003, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: n */
            public void mo4135n(DataHolder dataHolder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1758dU.transact(8004, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: o */
            public void mo4136o(DataHolder dataHolder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1758dU.transact(8005, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void onAchievementUpdated(int statusCode, String achievementId) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    obtain.writeInt(statusCode);
                    obtain.writeString(achievementId);
                    this.f1758dU.transact(5003, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void onInvitationRemoved(String invitationId) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    obtain.writeString(invitationId);
                    this.f1758dU.transact(8010, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void onLeftRoom(int statusCode, String roomId) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    obtain.writeInt(statusCode);
                    obtain.writeString(roomId);
                    this.f1758dU.transact(5020, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void onP2PConnected(String participantId) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    obtain.writeString(participantId);
                    this.f1758dU.transact(6001, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void onP2PDisconnected(String participantId) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    obtain.writeString(participantId);
                    this.f1758dU.transact(6002, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void onRealTimeMessageReceived(RealTimeMessage message) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (message != null) {
                        obtain.writeInt(1);
                        message.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1758dU.transact(5032, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void onSignOutComplete() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    this.f1758dU.transact(5016, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void onTurnBasedMatchCanceled(int statusCode, String matchId) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    obtain.writeInt(statusCode);
                    obtain.writeString(matchId);
                    this.f1758dU.transact(8007, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void onTurnBasedMatchRemoved(String matchId) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    obtain.writeString(matchId);
                    this.f1758dU.transact(8009, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: p */
            public void mo4146p(DataHolder dataHolder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1758dU.transact(8006, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: q */
            public void mo4147q(DataHolder dataHolder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1758dU.transact(8008, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: r */
            public void mo4148r(DataHolder dataHolder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1758dU.transact(5012, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: s */
            public void mo4149s(DataHolder dataHolder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1758dU.transact(5014, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: t */
            public void mo4150t(DataHolder dataHolder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1758dU.transact(5018, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: u */
            public void mo4151u(DataHolder dataHolder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1758dU.transact(5019, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: v */
            public void mo4152v(DataHolder dataHolder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1758dU.transact(5021, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: w */
            public void mo4153w(DataHolder dataHolder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1758dU.transact(5022, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: x */
            public void mo4154x(DataHolder dataHolder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1758dU.transact(5023, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: y */
            public void mo4155y(DataHolder dataHolder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1758dU.transact(5024, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: z */
            public void mo4156z(DataHolder dataHolder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1758dU.transact(5025, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C0706a() {
            attachInterface(this, "com.google.android.gms.games.internal.IGamesCallbacks");
        }

        /* renamed from: G */
        public static C0705fo m1965G(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C0705fo)) ? new C0707a(iBinder) : (C0705fo) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX WARNING: type inference failed for: r0v0 */
        /* JADX WARNING: type inference failed for: r0v1, types: [com.google.android.gms.common.data.DataHolder] */
        /* JADX WARNING: type inference failed for: r0v3, types: [com.google.android.gms.common.data.DataHolder] */
        /* JADX WARNING: type inference failed for: r0v8, types: [com.google.android.gms.common.data.DataHolder] */
        /* JADX WARNING: type inference failed for: r0v10, types: [com.google.android.gms.common.data.DataHolder] */
        /* JADX WARNING: type inference failed for: r0v13, types: [com.google.android.gms.common.data.DataHolder] */
        /* JADX WARNING: type inference failed for: r0v15, types: [com.google.android.gms.common.data.DataHolder] */
        /* JADX WARNING: type inference failed for: r0v16, types: [com.google.android.gms.common.data.DataHolder] */
        /* JADX WARNING: type inference failed for: r0v18, types: [com.google.android.gms.common.data.DataHolder] */
        /* JADX WARNING: type inference failed for: r0v19, types: [com.google.android.gms.common.data.DataHolder] */
        /* JADX WARNING: type inference failed for: r0v21, types: [com.google.android.gms.common.data.DataHolder] */
        /* JADX WARNING: type inference failed for: r0v22, types: [com.google.android.gms.common.data.DataHolder] */
        /* JADX WARNING: type inference failed for: r0v24, types: [com.google.android.gms.common.data.DataHolder] */
        /* JADX WARNING: type inference failed for: r0v25, types: [android.os.Bundle] */
        /* JADX WARNING: type inference failed for: r0v28, types: [android.os.Bundle] */
        /* JADX WARNING: type inference failed for: r0v29, types: [com.google.android.gms.common.data.DataHolder] */
        /* JADX WARNING: type inference failed for: r0v31, types: [com.google.android.gms.common.data.DataHolder] */
        /* JADX WARNING: type inference failed for: r0v38, types: [com.google.android.gms.common.data.DataHolder] */
        /* JADX WARNING: type inference failed for: r0v40, types: [com.google.android.gms.common.data.DataHolder] */
        /* JADX WARNING: type inference failed for: r0v43, types: [com.google.android.gms.common.data.DataHolder] */
        /* JADX WARNING: type inference failed for: r0v45, types: [com.google.android.gms.common.data.DataHolder] */
        /* JADX WARNING: type inference failed for: r0v46, types: [com.google.android.gms.common.data.DataHolder] */
        /* JADX WARNING: type inference failed for: r0v48, types: [com.google.android.gms.common.data.DataHolder] */
        /* JADX WARNING: type inference failed for: r0v56, types: [com.google.android.gms.games.multiplayer.realtime.RealTimeMessage] */
        /* JADX WARNING: type inference failed for: r0v59, types: [com.google.android.gms.games.multiplayer.realtime.RealTimeMessage] */
        /* JADX WARNING: type inference failed for: r0v60, types: [com.google.android.gms.common.data.DataHolder] */
        /* JADX WARNING: type inference failed for: r0v62, types: [com.google.android.gms.common.data.DataHolder] */
        /* JADX WARNING: type inference failed for: r0v63, types: [com.google.android.gms.common.data.DataHolder] */
        /* JADX WARNING: type inference failed for: r0v65, types: [com.google.android.gms.common.data.DataHolder] */
        /* JADX WARNING: type inference failed for: r0v66, types: [com.google.android.gms.common.data.DataHolder] */
        /* JADX WARNING: type inference failed for: r0v68, types: [com.google.android.gms.common.data.DataHolder] */
        /* JADX WARNING: type inference failed for: r0v69, types: [com.google.android.gms.common.data.DataHolder] */
        /* JADX WARNING: type inference failed for: r0v71, types: [com.google.android.gms.common.data.DataHolder] */
        /* JADX WARNING: type inference failed for: r0v72, types: [com.google.android.gms.common.data.DataHolder] */
        /* JADX WARNING: type inference failed for: r0v74, types: [com.google.android.gms.common.data.DataHolder] */
        /* JADX WARNING: type inference failed for: r0v75, types: [com.google.android.gms.common.data.DataHolder] */
        /* JADX WARNING: type inference failed for: r0v77, types: [com.google.android.gms.common.data.DataHolder] */
        /* JADX WARNING: type inference failed for: r0v78, types: [com.google.android.gms.common.data.DataHolder] */
        /* JADX WARNING: type inference failed for: r0v80, types: [com.google.android.gms.common.data.DataHolder] */
        /* JADX WARNING: type inference failed for: r0v81, types: [com.google.android.gms.common.data.DataHolder] */
        /* JADX WARNING: type inference failed for: r0v83, types: [com.google.android.gms.common.data.DataHolder] */
        /* JADX WARNING: type inference failed for: r0v84, types: [com.google.android.gms.common.data.DataHolder] */
        /* JADX WARNING: type inference failed for: r0v86, types: [com.google.android.gms.common.data.DataHolder] */
        /* JADX WARNING: type inference failed for: r0v87, types: [com.google.android.gms.common.data.DataHolder] */
        /* JADX WARNING: type inference failed for: r0v89, types: [com.google.android.gms.common.data.DataHolder] */
        /* JADX WARNING: type inference failed for: r0v90, types: [com.google.android.gms.common.data.DataHolder] */
        /* JADX WARNING: type inference failed for: r0v92, types: [com.google.android.gms.common.data.DataHolder] */
        /* JADX WARNING: type inference failed for: r0v95, types: [com.google.android.gms.common.data.DataHolder] */
        /* JADX WARNING: type inference failed for: r0v97, types: [com.google.android.gms.common.data.DataHolder] */
        /* JADX WARNING: type inference failed for: r0v98, types: [com.google.android.gms.common.data.DataHolder] */
        /* JADX WARNING: type inference failed for: r0v100, types: [com.google.android.gms.common.data.DataHolder] */
        /* JADX WARNING: type inference failed for: r0v101, types: [com.google.android.gms.common.data.DataHolder] */
        /* JADX WARNING: type inference failed for: r0v103, types: [com.google.android.gms.common.data.DataHolder] */
        /* JADX WARNING: type inference failed for: r0v104, types: [com.google.android.gms.common.data.DataHolder] */
        /* JADX WARNING: type inference failed for: r0v106, types: [com.google.android.gms.common.data.DataHolder] */
        /* JADX WARNING: type inference failed for: r0v110, types: [com.google.android.gms.common.data.DataHolder] */
        /* JADX WARNING: type inference failed for: r0v112, types: [com.google.android.gms.common.data.DataHolder] */
        /* JADX WARNING: type inference failed for: r0v115, types: [com.google.android.gms.common.data.DataHolder] */
        /* JADX WARNING: type inference failed for: r0v117, types: [com.google.android.gms.common.data.DataHolder] */
        /* JADX WARNING: type inference failed for: r0v118, types: [com.google.android.gms.common.data.DataHolder] */
        /* JADX WARNING: type inference failed for: r0v120, types: [com.google.android.gms.common.data.DataHolder] */
        /* JADX WARNING: type inference failed for: r0v121, types: [com.google.android.gms.common.data.DataHolder] */
        /* JADX WARNING: type inference failed for: r0v123, types: [com.google.android.gms.common.data.DataHolder] */
        /* JADX WARNING: type inference failed for: r0v124, types: [com.google.android.gms.common.data.DataHolder] */
        /* JADX WARNING: type inference failed for: r0v126, types: [com.google.android.gms.common.data.DataHolder] */
        /* JADX WARNING: type inference failed for: r0v127, types: [com.google.android.gms.common.data.DataHolder] */
        /* JADX WARNING: type inference failed for: r0v129, types: [com.google.android.gms.common.data.DataHolder] */
        /* JADX WARNING: type inference failed for: r0v130, types: [com.google.android.gms.common.data.DataHolder] */
        /* JADX WARNING: type inference failed for: r0v132, types: [com.google.android.gms.common.data.DataHolder] */
        /* JADX WARNING: type inference failed for: r0v133, types: [com.google.android.gms.common.data.DataHolder] */
        /* JADX WARNING: type inference failed for: r0v135, types: [com.google.android.gms.common.data.DataHolder] */
        /* JADX WARNING: type inference failed for: r0v136, types: [com.google.android.gms.common.data.DataHolder] */
        /* JADX WARNING: type inference failed for: r0v138, types: [com.google.android.gms.common.data.DataHolder] */
        /* JADX WARNING: type inference failed for: r0v139, types: [com.google.android.gms.common.data.DataHolder] */
        /* JADX WARNING: type inference failed for: r0v141, types: [com.google.android.gms.common.data.DataHolder] */
        /* JADX WARNING: type inference failed for: r0v144, types: [com.google.android.gms.common.data.DataHolder] */
        /* JADX WARNING: type inference failed for: r0v146, types: [com.google.android.gms.common.data.DataHolder] */
        /* JADX WARNING: type inference failed for: r0v150 */
        /* JADX WARNING: type inference failed for: r0v151 */
        /* JADX WARNING: type inference failed for: r0v152 */
        /* JADX WARNING: type inference failed for: r0v153 */
        /* JADX WARNING: type inference failed for: r0v154 */
        /* JADX WARNING: type inference failed for: r0v155 */
        /* JADX WARNING: type inference failed for: r0v156 */
        /* JADX WARNING: type inference failed for: r0v157 */
        /* JADX WARNING: type inference failed for: r0v158 */
        /* JADX WARNING: type inference failed for: r0v159 */
        /* JADX WARNING: type inference failed for: r0v160 */
        /* JADX WARNING: type inference failed for: r0v161 */
        /* JADX WARNING: type inference failed for: r0v162 */
        /* JADX WARNING: type inference failed for: r0v163 */
        /* JADX WARNING: type inference failed for: r0v164 */
        /* JADX WARNING: type inference failed for: r0v165 */
        /* JADX WARNING: type inference failed for: r0v166 */
        /* JADX WARNING: type inference failed for: r0v167 */
        /* JADX WARNING: type inference failed for: r0v168 */
        /* JADX WARNING: type inference failed for: r0v169 */
        /* JADX WARNING: type inference failed for: r0v170 */
        /* JADX WARNING: type inference failed for: r0v171 */
        /* JADX WARNING: type inference failed for: r0v172 */
        /* JADX WARNING: type inference failed for: r0v173 */
        /* JADX WARNING: type inference failed for: r0v174 */
        /* JADX WARNING: type inference failed for: r0v175 */
        /* JADX WARNING: type inference failed for: r0v176 */
        /* JADX WARNING: type inference failed for: r0v177 */
        /* JADX WARNING: type inference failed for: r0v178 */
        /* JADX WARNING: type inference failed for: r0v179 */
        /* JADX WARNING: type inference failed for: r0v180 */
        /* JADX WARNING: type inference failed for: r0v181 */
        /* JADX WARNING: type inference failed for: r0v182 */
        /* JADX WARNING: type inference failed for: r0v183 */
        /* JADX WARNING: type inference failed for: r0v184 */
        /* JADX WARNING: type inference failed for: r0v185 */
        /* JADX WARNING: type inference failed for: r0v186 */
        /* JADX WARNING: type inference failed for: r0v187 */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v0
          assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], com.google.android.gms.common.data.DataHolder, android.os.Bundle, com.google.android.gms.games.multiplayer.realtime.RealTimeMessage]
          uses: [com.google.android.gms.common.data.DataHolder, android.os.Bundle, com.google.android.gms.games.multiplayer.realtime.RealTimeMessage]
          mth insns count: 501
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 39 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) throws android.os.RemoteException {
            /*
                r4 = this;
                r0 = 0
                r2 = 1
                switch(r5) {
                    case 5001: goto L_0x0010;
                    case 5002: goto L_0x0024;
                    case 5003: goto L_0x003c;
                    case 5004: goto L_0x0050;
                    case 5005: goto L_0x0068;
                    case 5006: goto L_0x008f;
                    case 5007: goto L_0x00a8;
                    case 5008: goto L_0x00c1;
                    case 5009: goto L_0x00da;
                    case 5010: goto L_0x00f3;
                    case 5011: goto L_0x010c;
                    case 5012: goto L_0x0125;
                    case 5013: goto L_0x013e;
                    case 5014: goto L_0x014f;
                    case 5015: goto L_0x0168;
                    case 5016: goto L_0x0179;
                    case 5017: goto L_0x0186;
                    case 5018: goto L_0x01b8;
                    case 5019: goto L_0x01d1;
                    case 5020: goto L_0x01ea;
                    case 5021: goto L_0x01ff;
                    case 5022: goto L_0x0218;
                    case 5023: goto L_0x0231;
                    case 5024: goto L_0x024a;
                    case 5025: goto L_0x0263;
                    case 5026: goto L_0x027c;
                    case 5027: goto L_0x0299;
                    case 5028: goto L_0x02b6;
                    case 5029: goto L_0x02d3;
                    case 5030: goto L_0x02f0;
                    case 5031: goto L_0x030d;
                    case 5032: goto L_0x032a;
                    case 5033: goto L_0x0345;
                    case 5034: goto L_0x035e;
                    case 5035: goto L_0x0395;
                    case 5036: goto L_0x03ae;
                    case 5037: goto L_0x019f;
                    case 5038: goto L_0x037c;
                    case 5039: goto L_0x03bf;
                    case 5040: goto L_0x03d8;
                    case 6001: goto L_0x03e9;
                    case 6002: goto L_0x03fa;
                    case 8001: goto L_0x040b;
                    case 8002: goto L_0x0424;
                    case 8003: goto L_0x0443;
                    case 8004: goto L_0x045c;
                    case 8005: goto L_0x0475;
                    case 8006: goto L_0x048e;
                    case 8007: goto L_0x04a7;
                    case 8008: goto L_0x04bc;
                    case 8009: goto L_0x04d5;
                    case 8010: goto L_0x04e6;
                    case 9001: goto L_0x04f7;
                    case 1598968902: goto L_0x000a;
                    default: goto L_0x0005;
                }
            L_0x0005:
                boolean r2 = super.onTransact(r5, r6, r7, r8)
            L_0x0009:
                return r2
            L_0x000a:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r7.writeString(r0)
                goto L_0x0009
            L_0x0010:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r0)
                int r0 = r6.readInt()
                java.lang.String r1 = r6.readString()
                r4.mo4121d(r0, r1)
                r7.writeNoException()
                goto L_0x0009
            L_0x0024:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r1)
                int r1 = r6.readInt()
                if (r1 == 0) goto L_0x0035
                com.google.android.gms.common.data.DataHolderCreator r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r6)
            L_0x0035:
                r4.mo4117b(r0)
                r7.writeNoException()
                goto L_0x0009
            L_0x003c:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r0)
                int r0 = r6.readInt()
                java.lang.String r1 = r6.readString()
                r4.onAchievementUpdated(r0, r1)
                r7.writeNoException()
                goto L_0x0009
            L_0x0050:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r1)
                int r1 = r6.readInt()
                if (r1 == 0) goto L_0x0061
                com.google.android.gms.common.data.DataHolderCreator r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r6)
            L_0x0061:
                r4.mo4119c(r0)
                r7.writeNoException()
                goto L_0x0009
            L_0x0068:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r1)
                int r1 = r6.readInt()
                if (r1 == 0) goto L_0x008d
                com.google.android.gms.common.data.DataHolderCreator r1 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r1 = r1.createFromParcel(r6)
            L_0x0079:
                int r3 = r6.readInt()
                if (r3 == 0) goto L_0x0085
                com.google.android.gms.common.data.DataHolderCreator r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r6)
            L_0x0085:
                r4.mo4110a(r1, r0)
                r7.writeNoException()
                goto L_0x0009
            L_0x008d:
                r1 = r0
                goto L_0x0079
            L_0x008f:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r1)
                int r1 = r6.readInt()
                if (r1 == 0) goto L_0x00a0
                com.google.android.gms.common.data.DataHolderCreator r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r6)
            L_0x00a0:
                r4.mo4122d(r0)
                r7.writeNoException()
                goto L_0x0009
            L_0x00a8:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r1)
                int r1 = r6.readInt()
                if (r1 == 0) goto L_0x00b9
                com.google.android.gms.common.data.DataHolderCreator r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r6)
            L_0x00b9:
                r4.mo4124e(r0)
                r7.writeNoException()
                goto L_0x0009
            L_0x00c1:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r1)
                int r1 = r6.readInt()
                if (r1 == 0) goto L_0x00d2
                com.google.android.gms.common.data.DataHolderCreator r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r6)
            L_0x00d2:
                r4.mo4126f(r0)
                r7.writeNoException()
                goto L_0x0009
            L_0x00da:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r1)
                int r1 = r6.readInt()
                if (r1 == 0) goto L_0x00eb
                com.google.android.gms.common.data.DataHolderCreator r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r6)
            L_0x00eb:
                r4.mo4128g(r0)
                r7.writeNoException()
                goto L_0x0009
            L_0x00f3:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r1)
                int r1 = r6.readInt()
                if (r1 == 0) goto L_0x0104
                com.google.android.gms.common.data.DataHolderCreator r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r6)
            L_0x0104:
                r4.mo4129h(r0)
                r7.writeNoException()
                goto L_0x0009
            L_0x010c:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r1)
                int r1 = r6.readInt()
                if (r1 == 0) goto L_0x011d
                com.google.android.gms.common.data.DataHolderCreator r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r6)
            L_0x011d:
                r4.mo4130i(r0)
                r7.writeNoException()
                goto L_0x0009
            L_0x0125:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r1)
                int r1 = r6.readInt()
                if (r1 == 0) goto L_0x0136
                com.google.android.gms.common.data.DataHolderCreator r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r6)
            L_0x0136:
                r4.mo4148r(r0)
                r7.writeNoException()
                goto L_0x0009
            L_0x013e:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r0)
                int r0 = r6.readInt()
                r4.mo4112aB(r0)
                r7.writeNoException()
                goto L_0x0009
            L_0x014f:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r1)
                int r1 = r6.readInt()
                if (r1 == 0) goto L_0x0160
                com.google.android.gms.common.data.DataHolderCreator r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r6)
            L_0x0160:
                r4.mo4149s(r0)
                r7.writeNoException()
                goto L_0x0009
            L_0x0168:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r0)
                int r0 = r6.readInt()
                r4.mo4113aC(r0)
                r7.writeNoException()
                goto L_0x0009
            L_0x0179:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r0)
                r4.onSignOutComplete()
                r7.writeNoException()
                goto L_0x0009
            L_0x0186:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r1)
                int r1 = r6.readInt()
                if (r1 == 0) goto L_0x0197
                com.google.android.gms.common.data.DataHolderCreator r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r6)
            L_0x0197:
                r4.mo4132k(r0)
                r7.writeNoException()
                goto L_0x0009
            L_0x019f:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r1)
                int r1 = r6.readInt()
                if (r1 == 0) goto L_0x01b0
                com.google.android.gms.common.data.DataHolderCreator r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r6)
            L_0x01b0:
                r4.mo4133l(r0)
                r7.writeNoException()
                goto L_0x0009
            L_0x01b8:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r1)
                int r1 = r6.readInt()
                if (r1 == 0) goto L_0x01c9
                com.google.android.gms.common.data.DataHolderCreator r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r6)
            L_0x01c9:
                r4.mo4150t(r0)
                r7.writeNoException()
                goto L_0x0009
            L_0x01d1:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r1)
                int r1 = r6.readInt()
                if (r1 == 0) goto L_0x01e2
                com.google.android.gms.common.data.DataHolderCreator r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r6)
            L_0x01e2:
                r4.mo4151u(r0)
                r7.writeNoException()
                goto L_0x0009
            L_0x01ea:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r0)
                int r0 = r6.readInt()
                java.lang.String r1 = r6.readString()
                r4.onLeftRoom(r0, r1)
                r7.writeNoException()
                goto L_0x0009
            L_0x01ff:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r1)
                int r1 = r6.readInt()
                if (r1 == 0) goto L_0x0210
                com.google.android.gms.common.data.DataHolderCreator r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r6)
            L_0x0210:
                r4.mo4152v(r0)
                r7.writeNoException()
                goto L_0x0009
            L_0x0218:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r1)
                int r1 = r6.readInt()
                if (r1 == 0) goto L_0x0229
                com.google.android.gms.common.data.DataHolderCreator r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r6)
            L_0x0229:
                r4.mo4153w(r0)
                r7.writeNoException()
                goto L_0x0009
            L_0x0231:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r1)
                int r1 = r6.readInt()
                if (r1 == 0) goto L_0x0242
                com.google.android.gms.common.data.DataHolderCreator r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r6)
            L_0x0242:
                r4.mo4154x(r0)
                r7.writeNoException()
                goto L_0x0009
            L_0x024a:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r1)
                int r1 = r6.readInt()
                if (r1 == 0) goto L_0x025b
                com.google.android.gms.common.data.DataHolderCreator r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r6)
            L_0x025b:
                r4.mo4155y(r0)
                r7.writeNoException()
                goto L_0x0009
            L_0x0263:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r1)
                int r1 = r6.readInt()
                if (r1 == 0) goto L_0x0274
                com.google.android.gms.common.data.DataHolderCreator r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r6)
            L_0x0274:
                r4.mo4156z(r0)
                r7.writeNoException()
                goto L_0x0009
            L_0x027c:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r1)
                int r1 = r6.readInt()
                if (r1 == 0) goto L_0x028d
                com.google.android.gms.common.data.DataHolderCreator r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r6)
            L_0x028d:
                java.lang.String[] r1 = r6.createStringArray()
                r4.mo4111a(r0, r1)
                r7.writeNoException()
                goto L_0x0009
            L_0x0299:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r1)
                int r1 = r6.readInt()
                if (r1 == 0) goto L_0x02aa
                com.google.android.gms.common.data.DataHolderCreator r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r6)
            L_0x02aa:
                java.lang.String[] r1 = r6.createStringArray()
                r4.mo4118b(r0, r1)
                r7.writeNoException()
                goto L_0x0009
            L_0x02b6:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r1)
                int r1 = r6.readInt()
                if (r1 == 0) goto L_0x02c7
                com.google.android.gms.common.data.DataHolderCreator r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r6)
            L_0x02c7:
                java.lang.String[] r1 = r6.createStringArray()
                r4.mo4120c(r0, r1)
                r7.writeNoException()
                goto L_0x0009
            L_0x02d3:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r1)
                int r1 = r6.readInt()
                if (r1 == 0) goto L_0x02e4
                com.google.android.gms.common.data.DataHolderCreator r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r6)
            L_0x02e4:
                java.lang.String[] r1 = r6.createStringArray()
                r4.mo4123d(r0, r1)
                r7.writeNoException()
                goto L_0x0009
            L_0x02f0:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r1)
                int r1 = r6.readInt()
                if (r1 == 0) goto L_0x0301
                com.google.android.gms.common.data.DataHolderCreator r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r6)
            L_0x0301:
                java.lang.String[] r1 = r6.createStringArray()
                r4.mo4125e(r0, r1)
                r7.writeNoException()
                goto L_0x0009
            L_0x030d:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r1)
                int r1 = r6.readInt()
                if (r1 == 0) goto L_0x031e
                com.google.android.gms.common.data.DataHolderCreator r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r6)
            L_0x031e:
                java.lang.String[] r1 = r6.createStringArray()
                r4.mo4127f(r0, r1)
                r7.writeNoException()
                goto L_0x0009
            L_0x032a:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r1)
                int r1 = r6.readInt()
                if (r1 == 0) goto L_0x033d
                android.os.Parcelable$Creator<com.google.android.gms.games.multiplayer.realtime.RealTimeMessage> r0 = com.google.android.gms.games.multiplayer.realtime.RealTimeMessage.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r6)
                com.google.android.gms.games.multiplayer.realtime.RealTimeMessage r0 = (com.google.android.gms.games.multiplayer.realtime.RealTimeMessage) r0
            L_0x033d:
                r4.onRealTimeMessageReceived(r0)
                r7.writeNoException()
                goto L_0x0009
            L_0x0345:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r0)
                int r0 = r6.readInt()
                int r1 = r6.readInt()
                java.lang.String r3 = r6.readString()
                r4.mo4116b(r0, r1, r3)
                r7.writeNoException()
                goto L_0x0009
            L_0x035e:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r0)
                int r1 = r6.readInt()
                java.lang.String r3 = r6.readString()
                int r0 = r6.readInt()
                if (r0 == 0) goto L_0x037a
                r0 = r2
            L_0x0372:
                r4.mo4109a(r1, r3, r0)
                r7.writeNoException()
                goto L_0x0009
            L_0x037a:
                r0 = 0
                goto L_0x0372
            L_0x037c:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r1)
                int r1 = r6.readInt()
                if (r1 == 0) goto L_0x038d
                com.google.android.gms.common.data.DataHolderCreator r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r6)
            L_0x038d:
                r4.mo4104A(r0)
                r7.writeNoException()
                goto L_0x0009
            L_0x0395:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r1)
                int r1 = r6.readInt()
                if (r1 == 0) goto L_0x03a6
                com.google.android.gms.common.data.DataHolderCreator r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r6)
            L_0x03a6:
                r4.mo4105B(r0)
                r7.writeNoException()
                goto L_0x0009
            L_0x03ae:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r0)
                int r0 = r6.readInt()
                r4.mo4114aD(r0)
                r7.writeNoException()
                goto L_0x0009
            L_0x03bf:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r1)
                int r1 = r6.readInt()
                if (r1 == 0) goto L_0x03d0
                com.google.android.gms.common.data.DataHolderCreator r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r6)
            L_0x03d0:
                r4.mo4106C(r0)
                r7.writeNoException()
                goto L_0x0009
            L_0x03d8:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r0)
                int r0 = r6.readInt()
                r4.mo4115aE(r0)
                r7.writeNoException()
                goto L_0x0009
            L_0x03e9:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r0)
                java.lang.String r0 = r6.readString()
                r4.onP2PConnected(r0)
                r7.writeNoException()
                goto L_0x0009
            L_0x03fa:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r0)
                java.lang.String r0 = r6.readString()
                r4.onP2PDisconnected(r0)
                r7.writeNoException()
                goto L_0x0009
            L_0x040b:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r1)
                int r1 = r6.readInt()
                if (r1 == 0) goto L_0x041c
                com.google.android.gms.common.data.DataHolderCreator r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r6)
            L_0x041c:
                r4.mo4107D(r0)
                r7.writeNoException()
                goto L_0x0009
            L_0x0424:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r1)
                int r1 = r6.readInt()
                int r3 = r6.readInt()
                if (r3 == 0) goto L_0x043b
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r6)
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x043b:
                r4.mo4108a(r1, r0)
                r7.writeNoException()
                goto L_0x0009
            L_0x0443:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r1)
                int r1 = r6.readInt()
                if (r1 == 0) goto L_0x0454
                com.google.android.gms.common.data.DataHolderCreator r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r6)
            L_0x0454:
                r4.mo4134m(r0)
                r7.writeNoException()
                goto L_0x0009
            L_0x045c:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r1)
                int r1 = r6.readInt()
                if (r1 == 0) goto L_0x046d
                com.google.android.gms.common.data.DataHolderCreator r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r6)
            L_0x046d:
                r4.mo4135n(r0)
                r7.writeNoException()
                goto L_0x0009
            L_0x0475:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r1)
                int r1 = r6.readInt()
                if (r1 == 0) goto L_0x0486
                com.google.android.gms.common.data.DataHolderCreator r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r6)
            L_0x0486:
                r4.mo4136o(r0)
                r7.writeNoException()
                goto L_0x0009
            L_0x048e:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r1)
                int r1 = r6.readInt()
                if (r1 == 0) goto L_0x049f
                com.google.android.gms.common.data.DataHolderCreator r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r6)
            L_0x049f:
                r4.mo4146p(r0)
                r7.writeNoException()
                goto L_0x0009
            L_0x04a7:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r0)
                int r0 = r6.readInt()
                java.lang.String r1 = r6.readString()
                r4.onTurnBasedMatchCanceled(r0, r1)
                r7.writeNoException()
                goto L_0x0009
            L_0x04bc:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r1)
                int r1 = r6.readInt()
                if (r1 == 0) goto L_0x04cd
                com.google.android.gms.common.data.DataHolderCreator r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r6)
            L_0x04cd:
                r4.mo4147q(r0)
                r7.writeNoException()
                goto L_0x0009
            L_0x04d5:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r0)
                java.lang.String r0 = r6.readString()
                r4.onTurnBasedMatchRemoved(r0)
                r7.writeNoException()
                goto L_0x0009
            L_0x04e6:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r0)
                java.lang.String r0 = r6.readString()
                r4.onInvitationRemoved(r0)
                r7.writeNoException()
                goto L_0x0009
            L_0x04f7:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r1)
                int r1 = r6.readInt()
                if (r1 == 0) goto L_0x0508
                com.google.android.gms.common.data.DataHolderCreator r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r6)
            L_0x0508:
                r4.mo4131j(r0)
                r7.writeNoException()
                goto L_0x0009
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.C0705fo.C0706a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    /* renamed from: A */
    void mo4104A(DataHolder dataHolder) throws RemoteException;

    /* renamed from: B */
    void mo4105B(DataHolder dataHolder) throws RemoteException;

    /* renamed from: C */
    void mo4106C(DataHolder dataHolder) throws RemoteException;

    /* renamed from: D */
    void mo4107D(DataHolder dataHolder) throws RemoteException;

    /* renamed from: a */
    void mo4108a(int i, Bundle bundle) throws RemoteException;

    /* renamed from: a */
    void mo4109a(int i, String str, boolean z) throws RemoteException;

    /* renamed from: a */
    void mo4110a(DataHolder dataHolder, DataHolder dataHolder2) throws RemoteException;

    /* renamed from: a */
    void mo4111a(DataHolder dataHolder, String[] strArr) throws RemoteException;

    /* renamed from: aB */
    void mo4112aB(int i) throws RemoteException;

    /* renamed from: aC */
    void mo4113aC(int i) throws RemoteException;

    /* renamed from: aD */
    void mo4114aD(int i) throws RemoteException;

    /* renamed from: aE */
    void mo4115aE(int i) throws RemoteException;

    /* renamed from: b */
    void mo4116b(int i, int i2, String str) throws RemoteException;

    /* renamed from: b */
    void mo4117b(DataHolder dataHolder) throws RemoteException;

    /* renamed from: b */
    void mo4118b(DataHolder dataHolder, String[] strArr) throws RemoteException;

    /* renamed from: c */
    void mo4119c(DataHolder dataHolder) throws RemoteException;

    /* renamed from: c */
    void mo4120c(DataHolder dataHolder, String[] strArr) throws RemoteException;

    /* renamed from: d */
    void mo4121d(int i, String str) throws RemoteException;

    /* renamed from: d */
    void mo4122d(DataHolder dataHolder) throws RemoteException;

    /* renamed from: d */
    void mo4123d(DataHolder dataHolder, String[] strArr) throws RemoteException;

    /* renamed from: e */
    void mo4124e(DataHolder dataHolder) throws RemoteException;

    /* renamed from: e */
    void mo4125e(DataHolder dataHolder, String[] strArr) throws RemoteException;

    /* renamed from: f */
    void mo4126f(DataHolder dataHolder) throws RemoteException;

    /* renamed from: f */
    void mo4127f(DataHolder dataHolder, String[] strArr) throws RemoteException;

    /* renamed from: g */
    void mo4128g(DataHolder dataHolder) throws RemoteException;

    /* renamed from: h */
    void mo4129h(DataHolder dataHolder) throws RemoteException;

    /* renamed from: i */
    void mo4130i(DataHolder dataHolder) throws RemoteException;

    /* renamed from: j */
    void mo4131j(DataHolder dataHolder) throws RemoteException;

    /* renamed from: k */
    void mo4132k(DataHolder dataHolder) throws RemoteException;

    /* renamed from: l */
    void mo4133l(DataHolder dataHolder) throws RemoteException;

    /* renamed from: m */
    void mo4134m(DataHolder dataHolder) throws RemoteException;

    /* renamed from: n */
    void mo4135n(DataHolder dataHolder) throws RemoteException;

    /* renamed from: o */
    void mo4136o(DataHolder dataHolder) throws RemoteException;

    void onAchievementUpdated(int i, String str) throws RemoteException;

    void onInvitationRemoved(String str) throws RemoteException;

    void onLeftRoom(int i, String str) throws RemoteException;

    void onP2PConnected(String str) throws RemoteException;

    void onP2PDisconnected(String str) throws RemoteException;

    void onRealTimeMessageReceived(RealTimeMessage realTimeMessage) throws RemoteException;

    void onSignOutComplete() throws RemoteException;

    void onTurnBasedMatchCanceled(int i, String str) throws RemoteException;

    void onTurnBasedMatchRemoved(String str) throws RemoteException;

    /* renamed from: p */
    void mo4146p(DataHolder dataHolder) throws RemoteException;

    /* renamed from: q */
    void mo4147q(DataHolder dataHolder) throws RemoteException;

    /* renamed from: r */
    void mo4148r(DataHolder dataHolder) throws RemoteException;

    /* renamed from: s */
    void mo4149s(DataHolder dataHolder) throws RemoteException;

    /* renamed from: t */
    void mo4150t(DataHolder dataHolder) throws RemoteException;

    /* renamed from: u */
    void mo4151u(DataHolder dataHolder) throws RemoteException;

    /* renamed from: v */
    void mo4152v(DataHolder dataHolder) throws RemoteException;

    /* renamed from: w */
    void mo4153w(DataHolder dataHolder) throws RemoteException;

    /* renamed from: x */
    void mo4154x(DataHolder dataHolder) throws RemoteException;

    /* renamed from: y */
    void mo4155y(DataHolder dataHolder) throws RemoteException;

    /* renamed from: z */
    void mo4156z(DataHolder dataHolder) throws RemoteException;
}
