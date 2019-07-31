package com.google.android.gms.common.data;

import com.google.android.gms.internal.C0600eg;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.common.data.a */
public final class C0160a<T> implements Iterator<T> {
    private final DataBuffer<T> mDataBuffer;

    /* renamed from: nF */
    private int f318nF = -1;

    public C0160a(DataBuffer<T> dataBuffer) {
        this.mDataBuffer = (DataBuffer) C0600eg.m1554f(dataBuffer);
    }

    public boolean hasNext() {
        return this.f318nF < this.mDataBuffer.getCount() + -1;
    }

    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException("Cannot advance the iterator beyond " + this.f318nF);
        }
        DataBuffer<T> dataBuffer = this.mDataBuffer;
        int i = this.f318nF + 1;
        this.f318nF = i;
        return dataBuffer.get(i);
    }

    public void remove() {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}
