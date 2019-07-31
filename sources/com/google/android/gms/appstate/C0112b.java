package com.google.android.gms.appstate;

import com.google.android.gms.common.data.C0161b;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: com.google.android.gms.appstate.b */
public final class C0112b extends C0161b implements AppState {
    C0112b(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    /* renamed from: aK */
    public AppState freeze() {
        return new C0111a(this);
    }

    public boolean equals(Object obj) {
        return C0111a.m76a(this, obj);
    }

    public byte[] getConflictData() {
        return getByteArray("conflict_data");
    }

    public String getConflictVersion() {
        return getString("conflict_version");
    }

    public int getKey() {
        return getInteger("key");
    }

    public byte[] getLocalData() {
        return getByteArray("local_data");
    }

    public String getLocalVersion() {
        return getString("local_version");
    }

    public boolean hasConflict() {
        return !mo2411M("conflict_version");
    }

    public int hashCode() {
        return C0111a.m75a(this);
    }

    public String toString() {
        return C0111a.m77b(this);
    }
}
