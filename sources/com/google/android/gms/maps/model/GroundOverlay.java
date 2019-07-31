package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.internal.C0600eg;
import com.google.android.gms.maps.model.internal.C1076c;

public final class GroundOverlay {

    /* renamed from: Cy */
    private final C1076c f2563Cy;

    public GroundOverlay(C1076c delegate) {
        this.f2563Cy = (C1076c) C0600eg.m1554f(delegate);
    }

    public boolean equals(Object other) {
        if (!(other instanceof GroundOverlay)) {
            return false;
        }
        try {
            return this.f2563Cy.mo6031a(((GroundOverlay) other).f2563Cy);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public float getBearing() {
        try {
            return this.f2563Cy.getBearing();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public LatLngBounds getBounds() {
        try {
            return this.f2563Cy.getBounds();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public float getHeight() {
        try {
            return this.f2563Cy.getHeight();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public String getId() {
        try {
            return this.f2563Cy.getId();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public LatLng getPosition() {
        try {
            return this.f2563Cy.getPosition();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public float getTransparency() {
        try {
            return this.f2563Cy.getTransparency();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public float getWidth() {
        try {
            return this.f2563Cy.getWidth();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public float getZIndex() {
        try {
            return this.f2563Cy.getZIndex();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public int hashCode() {
        try {
            return this.f2563Cy.hashCodeRemote();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public boolean isVisible() {
        try {
            return this.f2563Cy.isVisible();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void remove() {
        try {
            this.f2563Cy.remove();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void setBearing(float bearing) {
        try {
            this.f2563Cy.setBearing(bearing);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void setDimensions(float width) {
        try {
            this.f2563Cy.setDimensions(width);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void setDimensions(float width, float height) {
        try {
            this.f2563Cy.mo6030a(width, height);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void setImage(BitmapDescriptor image) {
        try {
            this.f2563Cy.mo6040h(image.mo5688el());
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void setPosition(LatLng latLng) {
        try {
            this.f2563Cy.setPosition(latLng);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void setPositionFromBounds(LatLngBounds bounds) {
        try {
            this.f2563Cy.setPositionFromBounds(bounds);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void setTransparency(float transparency) {
        try {
            this.f2563Cy.setTransparency(transparency);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void setVisible(boolean visible) {
        try {
            this.f2563Cy.setVisible(visible);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void setZIndex(float zIndex) {
        try {
            this.f2563Cy.setZIndex(zIndex);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
