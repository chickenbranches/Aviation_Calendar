package com.google.android.gms.common.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* renamed from: com.google.android.gms.common.data.c */
public class C0162c<T extends SafeParcelable> extends DataBuffer<T> {

    /* renamed from: nI */
    private static final String[] f322nI = {"data"};

    /* renamed from: nJ */
    private final Creator<T> f323nJ;

    public C0162c(DataHolder dataHolder, Creator<T> creator) {
        super(dataHolder);
        this.f323nJ = creator;
    }

    /* renamed from: B */
    public T get(int i) {
        byte[] byteArray = this.f299nE.getByteArray("data", i, 0);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(byteArray, 0, byteArray.length);
        obtain.setDataPosition(0);
        T t = (SafeParcelable) this.f323nJ.createFromParcel(obtain);
        obtain.recycle();
        return t;
    }
}
