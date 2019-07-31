package com.google.android.gms.common.data;

import android.os.Bundle;
import java.util.Iterator;

public abstract class DataBuffer<T> implements Iterable<T> {

    /* renamed from: nE */
    protected final DataHolder f299nE;

    protected DataBuffer(DataHolder dataHolder) {
        this.f299nE = dataHolder;
        if (this.f299nE != null) {
            this.f299nE.mo2374c(this);
        }
    }

    public void close() {
        if (this.f299nE != null) {
            this.f299nE.close();
        }
    }

    public int describeContents() {
        return 0;
    }

    public abstract T get(int i);

    public int getCount() {
        if (this.f299nE == null) {
            return 0;
        }
        return this.f299nE.getCount();
    }

    public Bundle getMetadata() {
        return this.f299nE.getMetadata();
    }

    public boolean isClosed() {
        if (this.f299nE == null) {
            return true;
        }
        return this.f299nE.isClosed();
    }

    public Iterator<T> iterator() {
        return new C0160a(this);
    }
}
