package com.google.android.gms.plus.model.people;

import com.google.android.gms.common.data.C0162c;
import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.internal.C0905ig;
import com.google.android.gms.internal.C0926ir;

public final class PersonBuffer extends DataBuffer<Person> {

    /* renamed from: FZ */
    private final C0162c<C0905ig> f2745FZ;

    public PersonBuffer(DataHolder dataHolder) {
        super(dataHolder);
        if (dataHolder.getMetadata() == null || !dataHolder.getMetadata().getBoolean("com.google.android.gms.plus.IsSafeParcelable", false)) {
            this.f2745FZ = null;
        } else {
            this.f2745FZ = new C0162c<>(dataHolder, C0905ig.CREATOR);
        }
    }

    public Person get(int position) {
        return this.f2745FZ != null ? (Person) this.f2745FZ.get(position) : new C0926ir(this.f299nE, position);
    }
}
