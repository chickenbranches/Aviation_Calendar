package com.google.android.gms.maps.internal;

import android.location.Location;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.p000v4.util.TimeUtils;
import com.google.android.gms.dynamic.C0270b;
import com.google.android.gms.dynamic.C0270b.C0271a;
import com.google.android.gms.maps.internal.C1012b.C1013a;
import com.google.android.gms.maps.internal.C1018d.C1019a;
import com.google.android.gms.maps.internal.C1021e.C1022a;
import com.google.android.gms.maps.internal.C1024f.C1025a;
import com.google.android.gms.maps.internal.C1030h.C1031a;
import com.google.android.gms.maps.internal.C1033i.C1034a;
import com.google.android.gms.maps.internal.C1036j.C1037a;
import com.google.android.gms.maps.internal.C1039k.C1040a;
import com.google.android.gms.maps.internal.C1042l.C1043a;
import com.google.android.gms.maps.internal.C1045m.C1046a;
import com.google.android.gms.maps.internal.C1048n.C1049a;
import com.google.android.gms.maps.internal.C1051o.C1052a;
import com.google.android.gms.maps.internal.ILocationSourceDelegate.C1001a;
import com.google.android.gms.maps.internal.IProjectionDelegate.C1007a;
import com.google.android.gms.maps.internal.IUiSettingsDelegate.C1009a;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.TileOverlayOptions;
import com.google.android.gms.maps.model.internal.C1073b;
import com.google.android.gms.maps.model.internal.C1073b.C1074a;
import com.google.android.gms.maps.model.internal.C1076c;
import com.google.android.gms.maps.model.internal.C1076c.C1077a;
import com.google.android.gms.maps.model.internal.C1079d;
import com.google.android.gms.maps.model.internal.C1079d.C1080a;
import com.google.android.gms.maps.model.internal.C1082e;
import com.google.android.gms.maps.model.internal.C1082e.C1083a;
import com.google.android.gms.maps.model.internal.C1085f;
import com.google.android.gms.maps.model.internal.C1085f.C1086a;
import com.google.android.gms.maps.model.internal.IPolylineDelegate;
import com.google.android.gms.maps.model.internal.IPolylineDelegate.C1068a;

public interface IGoogleMapDelegate extends IInterface {

    /* renamed from: com.google.android.gms.maps.internal.IGoogleMapDelegate$a */
    public static abstract class C0999a extends Binder implements IGoogleMapDelegate {

        /* renamed from: com.google.android.gms.maps.internal.IGoogleMapDelegate$a$a */
        private static class C1000a implements IGoogleMapDelegate {

            /* renamed from: dU */
            private IBinder f2524dU;

            C1000a(IBinder iBinder) {
                this.f2524dU = iBinder;
            }

            public C1073b addCircle(CircleOptions options) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if (options != null) {
                        obtain.writeInt(1);
                        options.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f2524dU.transact(35, obtain, obtain2, 0);
                    obtain2.readException();
                    return C1074a.m3199ak(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public C1076c addGroundOverlay(GroundOverlayOptions options) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if (options != null) {
                        obtain.writeInt(1);
                        options.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f2524dU.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                    return C1077a.m3204al(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public C1079d addMarker(MarkerOptions options) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if (options != null) {
                        obtain.writeInt(1);
                        options.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f2524dU.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                    return C1080a.m3210am(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public C1082e addPolygon(PolygonOptions options) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if (options != null) {
                        obtain.writeInt(1);
                        options.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f2524dU.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    return C1083a.m3214an(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IPolylineDelegate addPolyline(PolylineOptions options) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if (options != null) {
                        obtain.writeInt(1);
                        options.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f2524dU.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    return C1068a.m3182ao(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public C1085f addTileOverlay(TileOverlayOptions options) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if (options != null) {
                        obtain.writeInt(1);
                        options.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f2524dU.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                    return C1086a.m3217ap(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void animateCamera(C0270b update) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(update != null ? update.asBinder() : null);
                    this.f2524dU.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void animateCameraWithCallback(C0270b update, C1012b callback) throws RemoteException {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(update != null ? update.asBinder() : null);
                    if (callback != null) {
                        iBinder = callback.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f2524dU.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void animateCameraWithDurationAndCallback(C0270b update, int durationMs, C1012b callback) throws RemoteException {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(update != null ? update.asBinder() : null);
                    obtain.writeInt(durationMs);
                    if (callback != null) {
                        iBinder = callback.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f2524dU.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f2524dU;
            }

            public void clear() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.f2524dU.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public CameraPosition getCameraPosition() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.f2524dU.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? CameraPosition.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int getMapType() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.f2524dU.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public float getMaxZoomLevel() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.f2524dU.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readFloat();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public float getMinZoomLevel() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.f2524dU.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readFloat();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public Location getMyLocation() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.f2524dU.transact(23, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Location) Location.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IProjectionDelegate getProjection() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.f2524dU.transact(26, obtain, obtain2, 0);
                    obtain2.readException();
                    return C1007a.m3085ag(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public C0270b getTestingHelper() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.f2524dU.transact(34, obtain, obtain2, 0);
                    obtain2.readException();
                    return C0271a.m632E(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IUiSettingsDelegate getUiSettings() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.f2524dU.transact(25, obtain, obtain2, 0);
                    obtain2.readException();
                    return C1009a.m3086ai(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean isBuildingsEnabled() throws RemoteException {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.f2524dU.transact(40, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean isIndoorEnabled() throws RemoteException {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.f2524dU.transact(19, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean isMyLocationEnabled() throws RemoteException {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.f2524dU.transact(21, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean isTrafficEnabled() throws RemoteException {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.f2524dU.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void moveCamera(C0270b update) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(update != null ? update.asBinder() : null);
                    this.f2524dU.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setBuildingsEnabled(boolean enabled) throws RemoteException {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if (enabled) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f2524dU.transact(41, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean setIndoorEnabled(boolean enabled) throws RemoteException {
                boolean z = true;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeInt(enabled ? 1 : 0);
                    this.f2524dU.transact(20, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setInfoWindowAdapter(C1018d adapter) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(adapter != null ? adapter.asBinder() : null);
                    this.f2524dU.transact(33, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setLocationSource(ILocationSourceDelegate source) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(source != null ? source.asBinder() : null);
                    this.f2524dU.transact(24, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setMapType(int type) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeInt(type);
                    this.f2524dU.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setMyLocationEnabled(boolean enabled) throws RemoteException {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if (enabled) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f2524dU.transact(22, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setOnCameraChangeListener(C1021e listener) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(listener != null ? listener.asBinder() : null);
                    this.f2524dU.transact(27, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setOnInfoWindowClickListener(C1024f listener) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(listener != null ? listener.asBinder() : null);
                    this.f2524dU.transact(32, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setOnMapClickListener(C1030h listener) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(listener != null ? listener.asBinder() : null);
                    this.f2524dU.transact(28, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setOnMapLoadedCallback(C1033i callback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(callback != null ? callback.asBinder() : null);
                    this.f2524dU.transact(42, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setOnMapLongClickListener(C1036j listener) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(listener != null ? listener.asBinder() : null);
                    this.f2524dU.transact(29, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setOnMarkerClickListener(C1039k listener) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(listener != null ? listener.asBinder() : null);
                    this.f2524dU.transact(30, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setOnMarkerDragListener(C1042l listener) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(listener != null ? listener.asBinder() : null);
                    this.f2524dU.transact(31, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setOnMyLocationButtonClickListener(C1045m listener) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(listener != null ? listener.asBinder() : null);
                    this.f2524dU.transact(37, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setOnMyLocationChangeListener(C1048n listener) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(listener != null ? listener.asBinder() : null);
                    this.f2524dU.transact(36, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setPadding(int left, int top, int right, int bottom) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeInt(left);
                    obtain.writeInt(top);
                    obtain.writeInt(right);
                    obtain.writeInt(bottom);
                    this.f2524dU.transact(39, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setTrafficEnabled(boolean enabled) throws RemoteException {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if (enabled) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f2524dU.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void snapshot(C1051o callback, C0270b bitmap) throws RemoteException {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(callback != null ? callback.asBinder() : null);
                    if (bitmap != null) {
                        iBinder = bitmap.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f2524dU.transact(38, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void stopAnimation() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.f2524dU.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: R */
        public static IGoogleMapDelegate m3081R(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IGoogleMapDelegate)) ? new C1000a(iBinder) : (IGoogleMapDelegate) queryLocalInterface;
        }

        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            boolean z = false;
            IBinder iBinder = null;
            switch (code) {
                case 1:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    CameraPosition cameraPosition = getCameraPosition();
                    reply.writeNoException();
                    if (cameraPosition != null) {
                        reply.writeInt(1);
                        cameraPosition.writeToParcel(reply, 1);
                        return true;
                    }
                    reply.writeInt(0);
                    return true;
                case 2:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    float maxZoomLevel = getMaxZoomLevel();
                    reply.writeNoException();
                    reply.writeFloat(maxZoomLevel);
                    return true;
                case 3:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    float minZoomLevel = getMinZoomLevel();
                    reply.writeNoException();
                    reply.writeFloat(minZoomLevel);
                    return true;
                case 4:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    moveCamera(C0271a.m632E(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case 5:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    animateCamera(C0271a.m632E(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case 6:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    animateCameraWithCallback(C0271a.m632E(data.readStrongBinder()), C1013a.m3089P(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case 7:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    animateCameraWithDurationAndCallback(C0271a.m632E(data.readStrongBinder()), data.readInt(), C1013a.m3089P(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case 8:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    stopAnimation();
                    reply.writeNoException();
                    return true;
                case 9:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    IPolylineDelegate addPolyline = addPolyline(data.readInt() != 0 ? PolylineOptions.CREATOR.createFromParcel(data) : null);
                    reply.writeNoException();
                    if (addPolyline != null) {
                        iBinder = addPolyline.asBinder();
                    }
                    reply.writeStrongBinder(iBinder);
                    return true;
                case 10:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    C1082e addPolygon = addPolygon(data.readInt() != 0 ? PolygonOptions.CREATOR.createFromParcel(data) : null);
                    reply.writeNoException();
                    if (addPolygon != null) {
                        iBinder = addPolygon.asBinder();
                    }
                    reply.writeStrongBinder(iBinder);
                    return true;
                case 11:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    C1079d addMarker = addMarker(data.readInt() != 0 ? MarkerOptions.CREATOR.createFromParcel(data) : null);
                    reply.writeNoException();
                    if (addMarker != null) {
                        iBinder = addMarker.asBinder();
                    }
                    reply.writeStrongBinder(iBinder);
                    return true;
                case 12:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    C1076c addGroundOverlay = addGroundOverlay(data.readInt() != 0 ? GroundOverlayOptions.CREATOR.createFromParcel(data) : null);
                    reply.writeNoException();
                    if (addGroundOverlay != null) {
                        iBinder = addGroundOverlay.asBinder();
                    }
                    reply.writeStrongBinder(iBinder);
                    return true;
                case 13:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    C1085f addTileOverlay = addTileOverlay(data.readInt() != 0 ? TileOverlayOptions.CREATOR.createFromParcel(data) : null);
                    reply.writeNoException();
                    if (addTileOverlay != null) {
                        iBinder = addTileOverlay.asBinder();
                    }
                    reply.writeStrongBinder(iBinder);
                    return true;
                case 14:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    clear();
                    reply.writeNoException();
                    return true;
                case 15:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    int mapType = getMapType();
                    reply.writeNoException();
                    reply.writeInt(mapType);
                    return true;
                case 16:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    setMapType(data.readInt());
                    reply.writeNoException();
                    return true;
                case 17:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    boolean isTrafficEnabled = isTrafficEnabled();
                    reply.writeNoException();
                    if (isTrafficEnabled) {
                        z = true;
                    }
                    reply.writeInt(z ? 1 : 0);
                    return true;
                case 18:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if (data.readInt() != 0) {
                        z = true;
                    }
                    setTrafficEnabled(z);
                    reply.writeNoException();
                    return true;
                case TimeUtils.HUNDRED_DAY_FIELD_LEN /*19*/:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    boolean isIndoorEnabled = isIndoorEnabled();
                    reply.writeNoException();
                    if (isIndoorEnabled) {
                        z = true;
                    }
                    reply.writeInt(z ? 1 : 0);
                    return true;
                case 20:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    boolean indoorEnabled = setIndoorEnabled(data.readInt() != 0);
                    reply.writeNoException();
                    if (indoorEnabled) {
                        z = true;
                    }
                    reply.writeInt(z ? 1 : 0);
                    return true;
                case 21:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    boolean isMyLocationEnabled = isMyLocationEnabled();
                    reply.writeNoException();
                    if (isMyLocationEnabled) {
                        z = true;
                    }
                    reply.writeInt(z ? 1 : 0);
                    return true;
                case 22:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if (data.readInt() != 0) {
                        z = true;
                    }
                    setMyLocationEnabled(z);
                    reply.writeNoException();
                    return true;
                case 23:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    Location myLocation = getMyLocation();
                    reply.writeNoException();
                    if (myLocation != null) {
                        reply.writeInt(1);
                        myLocation.writeToParcel(reply, 1);
                        return true;
                    }
                    reply.writeInt(0);
                    return true;
                case 24:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    setLocationSource(C1001a.m3082T(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case 25:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    IUiSettingsDelegate uiSettings = getUiSettings();
                    reply.writeNoException();
                    if (uiSettings != null) {
                        iBinder = uiSettings.asBinder();
                    }
                    reply.writeStrongBinder(iBinder);
                    return true;
                case 26:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    IProjectionDelegate projection = getProjection();
                    reply.writeNoException();
                    if (projection != null) {
                        iBinder = projection.asBinder();
                    }
                    reply.writeStrongBinder(iBinder);
                    return true;
                case 27:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    setOnCameraChangeListener(C1022a.m3108W(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case 28:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    setOnMapClickListener(C1031a.m3115Z(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case 29:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    setOnMapLongClickListener(C1037a.m3117ab(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case 30:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    setOnMarkerClickListener(C1040a.m3119ac(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case 31:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    setOnMarkerDragListener(C1043a.m3124ad(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case 32:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    setOnInfoWindowClickListener(C1025a.m3110X(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case 33:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    setInfoWindowAdapter(C1019a.m3105S(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case 34:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    C0270b testingHelper = getTestingHelper();
                    reply.writeNoException();
                    if (testingHelper != null) {
                        iBinder = testingHelper.asBinder();
                    }
                    reply.writeStrongBinder(iBinder);
                    return true;
                case 35:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    C1073b addCircle = addCircle(data.readInt() != 0 ? CircleOptions.CREATOR.createFromParcel(data) : null);
                    reply.writeNoException();
                    if (addCircle != null) {
                        iBinder = addCircle.asBinder();
                    }
                    reply.writeStrongBinder(iBinder);
                    return true;
                case 36:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    setOnMyLocationChangeListener(C1049a.m3130af(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case 37:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    setOnMyLocationButtonClickListener(C1046a.m3128ae(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case 38:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    snapshot(C1052a.m3133ah(data.readStrongBinder()), C0271a.m632E(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case 39:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    setPadding(data.readInt(), data.readInt(), data.readInt(), data.readInt());
                    reply.writeNoException();
                    return true;
                case 40:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    boolean isBuildingsEnabled = isBuildingsEnabled();
                    reply.writeNoException();
                    if (isBuildingsEnabled) {
                        z = true;
                    }
                    reply.writeInt(z ? 1 : 0);
                    return true;
                case 41:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if (data.readInt() != 0) {
                        z = true;
                    }
                    setBuildingsEnabled(z);
                    reply.writeNoException();
                    return true;
                case 42:
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    setOnMapLoadedCallback(C1034a.m3116aa(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case 1598968902:
                    reply.writeString("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    return true;
                default:
                    return super.onTransact(code, data, reply, flags);
            }
        }
    }

    C1073b addCircle(CircleOptions circleOptions) throws RemoteException;

    C1076c addGroundOverlay(GroundOverlayOptions groundOverlayOptions) throws RemoteException;

    C1079d addMarker(MarkerOptions markerOptions) throws RemoteException;

    C1082e addPolygon(PolygonOptions polygonOptions) throws RemoteException;

    IPolylineDelegate addPolyline(PolylineOptions polylineOptions) throws RemoteException;

    C1085f addTileOverlay(TileOverlayOptions tileOverlayOptions) throws RemoteException;

    void animateCamera(C0270b bVar) throws RemoteException;

    void animateCameraWithCallback(C0270b bVar, C1012b bVar2) throws RemoteException;

    void animateCameraWithDurationAndCallback(C0270b bVar, int i, C1012b bVar2) throws RemoteException;

    void clear() throws RemoteException;

    CameraPosition getCameraPosition() throws RemoteException;

    int getMapType() throws RemoteException;

    float getMaxZoomLevel() throws RemoteException;

    float getMinZoomLevel() throws RemoteException;

    Location getMyLocation() throws RemoteException;

    IProjectionDelegate getProjection() throws RemoteException;

    C0270b getTestingHelper() throws RemoteException;

    IUiSettingsDelegate getUiSettings() throws RemoteException;

    boolean isBuildingsEnabled() throws RemoteException;

    boolean isIndoorEnabled() throws RemoteException;

    boolean isMyLocationEnabled() throws RemoteException;

    boolean isTrafficEnabled() throws RemoteException;

    void moveCamera(C0270b bVar) throws RemoteException;

    void setBuildingsEnabled(boolean z) throws RemoteException;

    boolean setIndoorEnabled(boolean z) throws RemoteException;

    void setInfoWindowAdapter(C1018d dVar) throws RemoteException;

    void setLocationSource(ILocationSourceDelegate iLocationSourceDelegate) throws RemoteException;

    void setMapType(int i) throws RemoteException;

    void setMyLocationEnabled(boolean z) throws RemoteException;

    void setOnCameraChangeListener(C1021e eVar) throws RemoteException;

    void setOnInfoWindowClickListener(C1024f fVar) throws RemoteException;

    void setOnMapClickListener(C1030h hVar) throws RemoteException;

    void setOnMapLoadedCallback(C1033i iVar) throws RemoteException;

    void setOnMapLongClickListener(C1036j jVar) throws RemoteException;

    void setOnMarkerClickListener(C1039k kVar) throws RemoteException;

    void setOnMarkerDragListener(C1042l lVar) throws RemoteException;

    void setOnMyLocationButtonClickListener(C1045m mVar) throws RemoteException;

    void setOnMyLocationChangeListener(C1048n nVar) throws RemoteException;

    void setPadding(int i, int i2, int i3, int i4) throws RemoteException;

    void setTrafficEnabled(boolean z) throws RemoteException;

    void snapshot(C1051o oVar, C0270b bVar) throws RemoteException;

    void stopAnimation() throws RemoteException;
}
