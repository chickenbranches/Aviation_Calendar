package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.internal.C0600eg;
import com.google.android.gms.maps.model.internal.C1079d;

public final class Marker {

    /* renamed from: CL */
    private final C1079d f2582CL;

    public Marker(C1079d delegate) {
        this.f2582CL = (C1079d) C0600eg.m1554f(delegate);
    }

    public boolean equals(Object other) {
        if (!(other instanceof Marker)) {
            return false;
        }
        try {
            return this.f2582CL.mo6059h(((Marker) other).f2582CL);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public float getAlpha() {
        try {
            return this.f2582CL.getAlpha();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public String getId() {
        try {
            return this.f2582CL.getId();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public LatLng getPosition() {
        try {
            return this.f2582CL.getPosition();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public float getRotation() {
        try {
            return this.f2582CL.getRotation();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public String getSnippet() {
        try {
            return this.f2582CL.getSnippet();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public String getTitle() {
        try {
            return this.f2582CL.getTitle();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public int hashCode() {
        try {
            return this.f2582CL.hashCodeRemote();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void hideInfoWindow() {
        try {
            this.f2582CL.hideInfoWindow();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public boolean isDraggable() {
        try {
            return this.f2582CL.isDraggable();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public boolean isFlat() {
        try {
            return this.f2582CL.isFlat();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public boolean isInfoWindowShown() {
        try {
            return this.f2582CL.isInfoWindowShown();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public boolean isVisible() {
        try {
            return this.f2582CL.isVisible();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void remove() {
        try {
            this.f2582CL.remove();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void setAlpha(float alpha) {
        try {
            this.f2582CL.setAlpha(alpha);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void setAnchor(float anchorU, float anchorV) {
        try {
            this.f2582CL.setAnchor(anchorU, anchorV);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void setDraggable(boolean draggable) {
        try {
            this.f2582CL.setDraggable(draggable);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void setFlat(boolean flat) {
        try {
            this.f2582CL.setFlat(flat);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void setIcon(BitmapDescriptor icon) {
        try {
            this.f2582CL.mo6062i(icon.mo5688el());
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void setInfoWindowAnchor(float anchorU, float anchorV) {
        try {
            this.f2582CL.setInfoWindowAnchor(anchorU, anchorV);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void setPosition(LatLng latlng) {
        try {
            this.f2582CL.setPosition(latlng);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void setRotation(float rotation) {
        try {
            this.f2582CL.setRotation(rotation);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void setSnippet(String snippet) {
        try {
            this.f2582CL.setSnippet(snippet);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void setTitle(String title) {
        try {
            this.f2582CL.setTitle(title);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void setVisible(boolean visible) {
        try {
            this.f2582CL.setVisible(visible);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void showInfoWindow() {
        try {
            this.f2582CL.showInfoWindow();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
