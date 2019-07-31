package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.internal.C1056r;
import com.google.android.gms.maps.model.internal.C1088g;
import com.google.android.gms.maps.model.internal.C1088g.C1089a;

public final class TileOverlayOptions implements SafeParcelable {
    public static final TileOverlayOptionsCreator CREATOR = new TileOverlayOptionsCreator();

    /* renamed from: Cw */
    private float f2616Cw;

    /* renamed from: Cx */
    private boolean f2617Cx;
    /* access modifiers changed from: private */

    /* renamed from: Da */
    public C1088g f2618Da;

    /* renamed from: Db */
    private TileProvider f2619Db;

    /* renamed from: Dc */
    private boolean f2620Dc;

    /* renamed from: kg */
    private final int f2621kg;

    public TileOverlayOptions() {
        this.f2617Cx = true;
        this.f2620Dc = true;
        this.f2621kg = 1;
    }

    TileOverlayOptions(int versionCode, IBinder delegate, boolean visible, float zIndex, boolean fadeIn) {
        this.f2617Cx = true;
        this.f2620Dc = true;
        this.f2621kg = versionCode;
        this.f2618Da = C1089a.m3219aq(delegate);
        this.f2619Db = this.f2618Da == null ? null : new TileProvider() {

            /* renamed from: Dd */
            private final C1088g f2622Dd = TileOverlayOptions.this.f2618Da;

            public Tile getTile(int x, int y, int zoom) {
                try {
                    return this.f2622Dd.getTile(x, y, zoom);
                } catch (RemoteException e) {
                    return null;
                }
            }
        };
        this.f2617Cx = visible;
        this.f2616Cw = zIndex;
        this.f2620Dc = fadeIn;
    }

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: eI */
    public IBinder mo5959eI() {
        return this.f2618Da.asBinder();
    }

    public TileOverlayOptions fadeIn(boolean fadeIn) {
        this.f2620Dc = fadeIn;
        return this;
    }

    public boolean getFadeIn() {
        return this.f2620Dc;
    }

    public TileProvider getTileProvider() {
        return this.f2619Db;
    }

    /* access modifiers changed from: 0000 */
    public int getVersionCode() {
        return this.f2621kg;
    }

    public float getZIndex() {
        return this.f2616Cw;
    }

    public boolean isVisible() {
        return this.f2617Cx;
    }

    public TileOverlayOptions tileProvider(final TileProvider tileProvider) {
        this.f2619Db = tileProvider;
        this.f2618Da = this.f2619Db == null ? null : new C1089a() {
            public Tile getTile(int x, int y, int zoom) {
                return tileProvider.getTile(x, y, zoom);
            }
        };
        return this;
    }

    public TileOverlayOptions visible(boolean visible) {
        this.f2617Cx = visible;
        return this;
    }

    public void writeToParcel(Parcel out, int flags) {
        if (C1056r.m3143eD()) {
            C1091j.m3220a(this, out, flags);
        } else {
            TileOverlayOptionsCreator.m3169a(this, out, flags);
        }
    }

    public TileOverlayOptions zIndex(float zIndex) {
        this.f2616Cw = zIndex;
        return this;
    }
}
