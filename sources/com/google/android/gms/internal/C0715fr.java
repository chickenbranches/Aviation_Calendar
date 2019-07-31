package com.google.android.gms.internal;

import android.net.LocalSocket;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.games.multiplayer.realtime.RealTimeSocket;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.google.android.gms.internal.fr */
final class C0715fr implements RealTimeSocket {

    /* renamed from: om */
    private ParcelFileDescriptor f1766om;

    /* renamed from: uM */
    private final LocalSocket f1767uM;

    /* renamed from: up */
    private final String f1768up;

    C0715fr(LocalSocket localSocket, String str) {
        this.f1767uM = localSocket;
        this.f1768up = str;
    }

    public void close() throws IOException {
        this.f1767uM.close();
    }

    public InputStream getInputStream() throws IOException {
        return this.f1767uM.getInputStream();
    }

    public OutputStream getOutputStream() throws IOException {
        return this.f1767uM.getOutputStream();
    }

    public ParcelFileDescriptor getParcelFileDescriptor() throws IOException {
        if (this.f1766om == null && !isClosed()) {
            Parcel obtain = Parcel.obtain();
            obtain.writeFileDescriptor(this.f1767uM.getFileDescriptor());
            obtain.setDataPosition(0);
            this.f1766om = obtain.readFileDescriptor();
        }
        return this.f1766om;
    }

    public boolean isClosed() {
        return !this.f1767uM.isConnected() && !this.f1767uM.isBound();
    }
}
