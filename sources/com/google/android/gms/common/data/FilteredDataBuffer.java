package com.google.android.gms.common.data;

import android.os.Bundle;
import com.google.android.gms.internal.C0564ds;

public abstract class FilteredDataBuffer<T> extends DataBuffer<T> {
    protected final DataBuffer<T> mDataBuffer;

    public FilteredDataBuffer(DataBuffer<T> dataBuffer) {
        super(null);
        C0564ds.m1396d(dataBuffer);
        C0564ds.m1395a(!(dataBuffer instanceof FilteredDataBuffer), "Not possible to have nested FilteredDataBuffers.");
        this.mDataBuffer = dataBuffer;
    }

    public void close() {
        this.mDataBuffer.close();
    }

    /* access modifiers changed from: protected */
    public abstract int computeRealPosition(int i);

    public T get(int position) {
        return this.mDataBuffer.get(computeRealPosition(position));
    }

    public Bundle getMetadata() {
        return this.mDataBuffer.getMetadata();
    }

    public boolean isClosed() {
        return this.mDataBuffer.isClosed();
    }
}
