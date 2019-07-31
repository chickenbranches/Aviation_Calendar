package com.google.android.gms.common.data;

import java.util.ArrayList;

/* renamed from: com.google.android.gms.common.data.d */
public abstract class C0163d<T> extends DataBuffer<T> {

    /* renamed from: nZ */
    private boolean f324nZ = false;

    /* renamed from: oa */
    private ArrayList<Integer> f325oa;

    protected C0163d(DataHolder dataHolder) {
        super(dataHolder);
    }

    /* renamed from: E */
    private int m247E(int i) {
        if (i < 0 || i == this.f325oa.size()) {
            return 0;
        }
        return i == this.f325oa.size() + -1 ? this.f299nE.getCount() - ((Integer) this.f325oa.get(i)).intValue() : ((Integer) this.f325oa.get(i + 1)).intValue() - ((Integer) this.f325oa.get(i)).intValue();
    }

    /* renamed from: by */
    private void m248by() {
        synchronized (this) {
            if (!this.f324nZ) {
                int count = this.f299nE.getCount();
                this.f325oa = new ArrayList<>();
                if (count > 0) {
                    this.f325oa.add(Integer.valueOf(0));
                    String primaryDataMarkerColumn = getPrimaryDataMarkerColumn();
                    String string = this.f299nE.getString(primaryDataMarkerColumn, 0, this.f299nE.mo2371C(0));
                    int i = 1;
                    while (i < count) {
                        String string2 = this.f299nE.getString(primaryDataMarkerColumn, i, this.f299nE.mo2371C(i));
                        if (!string2.equals(string)) {
                            this.f325oa.add(Integer.valueOf(i));
                        } else {
                            string2 = string;
                        }
                        i++;
                        string = string2;
                    }
                }
                this.f324nZ = true;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: D */
    public int mo2421D(int i) {
        if (i >= 0 && i < this.f325oa.size()) {
            return ((Integer) this.f325oa.get(i)).intValue();
        }
        throw new IllegalArgumentException("Position " + i + " is out of bounds for this buffer");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo2422a(int i, int i2);

    public final T get(int position) {
        m248by();
        return mo2422a(mo2421D(position), m247E(position));
    }

    public int getCount() {
        m248by();
        return this.f325oa.size();
    }

    /* access modifiers changed from: protected */
    public abstract String getPrimaryDataMarkerColumn();
}
