package com.google.android.gms.maps.model;

import android.graphics.Bitmap;
import android.os.RemoteException;
import com.google.android.gms.internal.C0600eg;
import com.google.android.gms.maps.model.internal.C1070a;

public final class BitmapDescriptorFactory {

    /* renamed from: Cl */
    private static C1070a f2548Cl = null;
    public static final float HUE_AZURE = 210.0f;
    public static final float HUE_BLUE = 240.0f;
    public static final float HUE_CYAN = 180.0f;
    public static final float HUE_GREEN = 120.0f;
    public static final float HUE_MAGENTA = 300.0f;
    public static final float HUE_ORANGE = 30.0f;
    public static final float HUE_RED = 0.0f;
    public static final float HUE_ROSE = 330.0f;
    public static final float HUE_VIOLET = 270.0f;
    public static final float HUE_YELLOW = 60.0f;

    private BitmapDescriptorFactory() {
    }

    /* renamed from: a */
    public static void m3145a(C1070a aVar) {
        if (f2548Cl == null) {
            f2548Cl = (C1070a) C0600eg.m1554f(aVar);
        }
    }

    public static BitmapDescriptor defaultMarker() {
        try {
            return new BitmapDescriptor(m3146eE().mo6007eJ());
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public static BitmapDescriptor defaultMarker(float hue) {
        try {
            return new BitmapDescriptor(m3146eE().mo6006c(hue));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: eE */
    private static C1070a m3146eE() {
        return (C1070a) C0600eg.m1552b(f2548Cl, (Object) "IBitmapDescriptorFactory is not initialized");
    }

    public static BitmapDescriptor fromAsset(String assetName) {
        try {
            return new BitmapDescriptor(m3146eE().mo6002at(assetName));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public static BitmapDescriptor fromBitmap(Bitmap image) {
        try {
            return new BitmapDescriptor(m3146eE().mo6001a(image));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public static BitmapDescriptor fromFile(String fileName) {
        try {
            return new BitmapDescriptor(m3146eE().mo6003au(fileName));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public static BitmapDescriptor fromPath(String absolutePath) {
        try {
            return new BitmapDescriptor(m3146eE().mo6004av(absolutePath));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public static BitmapDescriptor fromResource(int resourceId) {
        try {
            return new BitmapDescriptor(m3146eE().mo6005bh(resourceId));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
