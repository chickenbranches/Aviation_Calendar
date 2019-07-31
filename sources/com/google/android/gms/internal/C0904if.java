package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.data.C0161b;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.plus.model.moments.ItemScope;
import com.google.android.gms.plus.model.moments.Moment;

/* renamed from: com.google.android.gms.internal.if */
public final class C0904if extends C0161b implements Moment {

    /* renamed from: Fo */
    private C0902id f2267Fo;

    public C0904if(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    /* renamed from: fu */
    private C0902id m2723fu() {
        synchronized (this) {
            if (this.f2267Fo == null) {
                byte[] byteArray = getByteArray("momentImpl");
                Parcel obtain = Parcel.obtain();
                obtain.unmarshall(byteArray, 0, byteArray.length);
                obtain.setDataPosition(0);
                this.f2267Fo = C0902id.CREATOR.createFromParcel(obtain);
                obtain.recycle();
            }
        }
        return this.f2267Fo;
    }

    /* renamed from: ft */
    public C0902id freeze() {
        return m2723fu();
    }

    public String getId() {
        return m2723fu().getId();
    }

    public ItemScope getResult() {
        return m2723fu().getResult();
    }

    public String getStartDate() {
        return m2723fu().getStartDate();
    }

    public ItemScope getTarget() {
        return m2723fu().getTarget();
    }

    public String getType() {
        return m2723fu().getType();
    }

    public boolean hasId() {
        return m2723fu().hasId();
    }

    public boolean hasResult() {
        return m2723fu().hasId();
    }

    public boolean hasStartDate() {
        return m2723fu().hasStartDate();
    }

    public boolean hasTarget() {
        return m2723fu().hasTarget();
    }

    public boolean hasType() {
        return m2723fu().hasType();
    }
}
