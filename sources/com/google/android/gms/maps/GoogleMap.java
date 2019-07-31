package com.google.android.gms.maps;

import android.graphics.Bitmap;
import android.location.Location;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.C0270b;
import com.google.android.gms.dynamic.C0273c;
import com.google.android.gms.internal.C0600eg;
import com.google.android.gms.maps.LocationSource.OnLocationChangedListener;
import com.google.android.gms.maps.internal.C1012b.C1013a;
import com.google.android.gms.maps.internal.C1018d.C1019a;
import com.google.android.gms.maps.internal.C1021e.C1022a;
import com.google.android.gms.maps.internal.C1024f.C1025a;
import com.google.android.gms.maps.internal.C1027g;
import com.google.android.gms.maps.internal.C1030h.C1031a;
import com.google.android.gms.maps.internal.C1033i.C1034a;
import com.google.android.gms.maps.internal.C1036j.C1037a;
import com.google.android.gms.maps.internal.C1039k.C1040a;
import com.google.android.gms.maps.internal.C1042l.C1043a;
import com.google.android.gms.maps.internal.C1045m.C1046a;
import com.google.android.gms.maps.internal.C1048n.C1049a;
import com.google.android.gms.maps.internal.C1051o.C1052a;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.internal.ILocationSourceDelegate.C1001a;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.GroundOverlay;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.maps.model.TileOverlay;
import com.google.android.gms.maps.model.TileOverlayOptions;
import com.google.android.gms.maps.model.internal.C1076c;
import com.google.android.gms.maps.model.internal.C1079d;
import com.google.android.gms.maps.model.internal.C1085f;

public final class GoogleMap {
    public static final int MAP_TYPE_HYBRID = 4;
    public static final int MAP_TYPE_NONE = 0;
    public static final int MAP_TYPE_NORMAL = 1;
    public static final int MAP_TYPE_SATELLITE = 2;
    public static final int MAP_TYPE_TERRAIN = 3;

    /* renamed from: Br */
    private final IGoogleMapDelegate f2459Br;

    /* renamed from: Bs */
    private UiSettings f2460Bs;

    public interface CancelableCallback {
        void onCancel();

        void onFinish();
    }

    public interface InfoWindowAdapter {
        View getInfoContents(Marker marker);

        View getInfoWindow(Marker marker);
    }

    public interface OnCameraChangeListener {
        void onCameraChange(CameraPosition cameraPosition);
    }

    public interface OnInfoWindowClickListener {
        void onInfoWindowClick(Marker marker);
    }

    public interface OnMapClickListener {
        void onMapClick(LatLng latLng);
    }

    public interface OnMapLoadedCallback {
        void onMapLoaded();
    }

    public interface OnMapLongClickListener {
        void onMapLongClick(LatLng latLng);
    }

    public interface OnMarkerClickListener {
        boolean onMarkerClick(Marker marker);
    }

    public interface OnMarkerDragListener {
        void onMarkerDrag(Marker marker);

        void onMarkerDragEnd(Marker marker);

        void onMarkerDragStart(Marker marker);
    }

    public interface OnMyLocationButtonClickListener {
        boolean onMyLocationButtonClick();
    }

    @Deprecated
    public interface OnMyLocationChangeListener {
        void onMyLocationChange(Location location);
    }

    public interface SnapshotReadyCallback {
        void onSnapshotReady(Bitmap bitmap);
    }

    /* renamed from: com.google.android.gms.maps.GoogleMap$a */
    private static final class C0989a extends C1013a {

        /* renamed from: BI */
        private final CancelableCallback f2487BI;

        C0989a(CancelableCallback cancelableCallback) {
            this.f2487BI = cancelableCallback;
        }

        public void onCancel() {
            this.f2487BI.onCancel();
        }

        public void onFinish() {
            this.f2487BI.onFinish();
        }
    }

    protected GoogleMap(IGoogleMapDelegate map) {
        this.f2459Br = (IGoogleMapDelegate) C0600eg.m1554f(map);
    }

    public final Circle addCircle(CircleOptions options) {
        try {
            return new Circle(this.f2459Br.addCircle(options));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final GroundOverlay addGroundOverlay(GroundOverlayOptions options) {
        try {
            C1076c addGroundOverlay = this.f2459Br.addGroundOverlay(options);
            if (addGroundOverlay != null) {
                return new GroundOverlay(addGroundOverlay);
            }
            return null;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final Marker addMarker(MarkerOptions options) {
        try {
            C1079d addMarker = this.f2459Br.addMarker(options);
            if (addMarker != null) {
                return new Marker(addMarker);
            }
            return null;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final Polygon addPolygon(PolygonOptions options) {
        try {
            return new Polygon(this.f2459Br.addPolygon(options));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final Polyline addPolyline(PolylineOptions options) {
        try {
            return new Polyline(this.f2459Br.addPolyline(options));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final TileOverlay addTileOverlay(TileOverlayOptions options) {
        try {
            C1085f addTileOverlay = this.f2459Br.addTileOverlay(options);
            if (addTileOverlay != null) {
                return new TileOverlay(addTileOverlay);
            }
            return null;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void animateCamera(CameraUpdate update) {
        try {
            this.f2459Br.animateCamera(update.mo5374el());
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void animateCamera(CameraUpdate update, int durationMs, CancelableCallback callback) {
        try {
            this.f2459Br.animateCameraWithDurationAndCallback(update.mo5374el(), durationMs, callback == null ? null : new C0989a(callback));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void animateCamera(CameraUpdate update, CancelableCallback callback) {
        try {
            this.f2459Br.animateCameraWithCallback(update.mo5374el(), callback == null ? null : new C0989a(callback));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void clear() {
        try {
            this.f2459Br.clear();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: en */
    public IGoogleMapDelegate mo5385en() {
        return this.f2459Br;
    }

    public final CameraPosition getCameraPosition() {
        try {
            return this.f2459Br.getCameraPosition();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final int getMapType() {
        try {
            return this.f2459Br.getMapType();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final float getMaxZoomLevel() {
        try {
            return this.f2459Br.getMaxZoomLevel();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final float getMinZoomLevel() {
        try {
            return this.f2459Br.getMinZoomLevel();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Deprecated
    public final Location getMyLocation() {
        try {
            return this.f2459Br.getMyLocation();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final Projection getProjection() {
        try {
            return new Projection(this.f2459Br.getProjection());
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final UiSettings getUiSettings() {
        try {
            if (this.f2460Bs == null) {
                this.f2460Bs = new UiSettings(this.f2459Br.getUiSettings());
            }
            return this.f2460Bs;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final boolean isBuildingsEnabled() {
        try {
            return this.f2459Br.isBuildingsEnabled();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final boolean isIndoorEnabled() {
        try {
            return this.f2459Br.isIndoorEnabled();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final boolean isMyLocationEnabled() {
        try {
            return this.f2459Br.isMyLocationEnabled();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final boolean isTrafficEnabled() {
        try {
            return this.f2459Br.isTrafficEnabled();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void moveCamera(CameraUpdate update) {
        try {
            this.f2459Br.moveCamera(update.mo5374el());
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setBuildingsEnabled(boolean enabled) {
        try {
            this.f2459Br.setBuildingsEnabled(enabled);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final boolean setIndoorEnabled(boolean enabled) {
        try {
            return this.f2459Br.setIndoorEnabled(enabled);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setInfoWindowAdapter(final InfoWindowAdapter adapter) {
        if (adapter == null) {
            try {
                this.f2459Br.setInfoWindowAdapter(null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.f2459Br.setInfoWindowAdapter(new C1019a() {
                /* renamed from: f */
                public C0270b mo5422f(C1079d dVar) {
                    return C0273c.m634h(adapter.getInfoWindow(new Marker(dVar)));
                }

                /* renamed from: g */
                public C0270b mo5423g(C1079d dVar) {
                    return C0273c.m634h(adapter.getInfoContents(new Marker(dVar)));
                }
            });
        }
    }

    public final void setLocationSource(final LocationSource source) {
        if (source == null) {
            try {
                this.f2459Br.setLocationSource(null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.f2459Br.setLocationSource(new C1001a() {
                public void activate(final C1027g listener) {
                    source.activate(new OnLocationChangedListener() {
                        public void onLocationChanged(Location location) {
                            try {
                                listener.mo5661g(C0273c.m634h(location));
                            } catch (RemoteException e) {
                                throw new RuntimeRemoteException(e);
                            }
                        }
                    });
                }

                public void deactivate() {
                    source.deactivate();
                }
            });
        }
    }

    public final void setMapType(int type) {
        try {
            this.f2459Br.setMapType(type);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setMyLocationEnabled(boolean enabled) {
        try {
            this.f2459Br.setMyLocationEnabled(enabled);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setOnCameraChangeListener(final OnCameraChangeListener listener) {
        if (listener == null) {
            try {
                this.f2459Br.setOnCameraChangeListener(null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.f2459Br.setOnCameraChangeListener(new C1022a() {
                public void onCameraChange(CameraPosition position) {
                    listener.onCameraChange(position);
                }
            });
        }
    }

    public final void setOnInfoWindowClickListener(final OnInfoWindowClickListener listener) {
        if (listener == null) {
            try {
                this.f2459Br.setOnInfoWindowClickListener(null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.f2459Br.setOnInfoWindowClickListener(new C1025a() {
                /* renamed from: e */
                public void mo5421e(C1079d dVar) {
                    listener.onInfoWindowClick(new Marker(dVar));
                }
            });
        }
    }

    public final void setOnMapClickListener(final OnMapClickListener listener) {
        if (listener == null) {
            try {
                this.f2459Br.setOnMapClickListener(null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.f2459Br.setOnMapClickListener(new C1031a() {
                public void onMapClick(LatLng point) {
                    listener.onMapClick(point);
                }
            });
        }
    }

    public void setOnMapLoadedCallback(final OnMapLoadedCallback callback) {
        if (callback == null) {
            try {
                this.f2459Br.setOnMapLoadedCallback(null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.f2459Br.setOnMapLoadedCallback(new C1034a() {
                public void onMapLoaded() throws RemoteException {
                    callback.onMapLoaded();
                }
            });
        }
    }

    public final void setOnMapLongClickListener(final OnMapLongClickListener listener) {
        if (listener == null) {
            try {
                this.f2459Br.setOnMapLongClickListener(null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.f2459Br.setOnMapLongClickListener(new C1037a() {
                public void onMapLongClick(LatLng point) {
                    listener.onMapLongClick(point);
                }
            });
        }
    }

    public final void setOnMarkerClickListener(final OnMarkerClickListener listener) {
        if (listener == null) {
            try {
                this.f2459Br.setOnMarkerClickListener(null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.f2459Br.setOnMarkerClickListener(new C1040a() {
                /* renamed from: a */
                public boolean mo5432a(C1079d dVar) {
                    return listener.onMarkerClick(new Marker(dVar));
                }
            });
        }
    }

    public final void setOnMarkerDragListener(final OnMarkerDragListener listener) {
        if (listener == null) {
            try {
                this.f2459Br.setOnMarkerDragListener(null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.f2459Br.setOnMarkerDragListener(new C1043a() {
                /* renamed from: b */
                public void mo5433b(C1079d dVar) {
                    listener.onMarkerDragStart(new Marker(dVar));
                }

                /* renamed from: c */
                public void mo5434c(C1079d dVar) {
                    listener.onMarkerDragEnd(new Marker(dVar));
                }

                /* renamed from: d */
                public void mo5435d(C1079d dVar) {
                    listener.onMarkerDrag(new Marker(dVar));
                }
            });
        }
    }

    public final void setOnMyLocationButtonClickListener(final OnMyLocationButtonClickListener listener) {
        if (listener == null) {
            try {
                this.f2459Br.setOnMyLocationButtonClickListener(null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.f2459Br.setOnMyLocationButtonClickListener(new C1046a() {
                public boolean onMyLocationButtonClick() throws RemoteException {
                    return listener.onMyLocationButtonClick();
                }
            });
        }
    }

    @Deprecated
    public final void setOnMyLocationChangeListener(final OnMyLocationChangeListener listener) {
        if (listener == null) {
            try {
                this.f2459Br.setOnMyLocationChangeListener(null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.f2459Br.setOnMyLocationChangeListener(new C1049a() {
                /* renamed from: d */
                public void mo5424d(C0270b bVar) {
                    listener.onMyLocationChange((Location) C0273c.m633b(bVar));
                }
            });
        }
    }

    public final void setPadding(int left, int top, int right, int bottom) {
        try {
            this.f2459Br.setPadding(left, top, right, bottom);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setTrafficEnabled(boolean enabled) {
        try {
            this.f2459Br.setTrafficEnabled(enabled);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void snapshot(SnapshotReadyCallback callback) {
        snapshot(callback, null);
    }

    public final void snapshot(final SnapshotReadyCallback callback, Bitmap bitmap) {
        try {
            this.f2459Br.snapshot(new C1052a() {
                /* renamed from: c */
                public void mo5427c(C0270b bVar) throws RemoteException {
                    callback.onSnapshotReady((Bitmap) C0273c.m633b(bVar));
                }

                public void onSnapshotReady(Bitmap snapshot) throws RemoteException {
                    callback.onSnapshotReady(snapshot);
                }
            }, (C0273c) (bitmap != null ? C0273c.m634h(bitmap) : null));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void stopAnimation() {
        try {
            this.f2459Br.stopAnimation();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
