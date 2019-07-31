package com.google.android.gms.location;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* renamed from: com.google.android.gms.location.f */
public class C0974f implements SafeParcelable {
    public static final C0975g CREATOR = new C0975g();

    /* renamed from: kg */
    private final int f2454kg;

    /* renamed from: xJ */
    private final String f2455xJ;

    /* renamed from: xr */
    private final PendingIntent f2456xr;

    public C0974f(int i, PendingIntent pendingIntent, String str) {
        this.f2454kg = i;
        this.f2456xr = pendingIntent;
        this.f2455xJ = str;
    }

    /* renamed from: dB */
    public PendingIntent mo5363dB() {
        return this.f2456xr;
    }

    /* renamed from: dC */
    public String mo5364dC() {
        return this.f2455xJ;
    }

    public int describeContents() {
        C0975g gVar = CREATOR;
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        C0974f fVar = (C0974f) obj;
        if (this.f2456xr == null) {
            if (fVar.f2456xr != null) {
                return false;
            }
        } else if (!this.f2456xr.equals(fVar.f2456xr)) {
            return false;
        }
        return this.f2455xJ == null ? fVar.f2455xJ == null : this.f2455xJ.equals(fVar.f2455xJ);
    }

    public int getVersionCode() {
        return this.f2454kg;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((this.f2456xr == null ? 0 : this.f2456xr.hashCode()) + 31) * 31;
        if (this.f2455xJ != null) {
            i = this.f2455xJ.hashCode();
        }
        return hashCode + i;
    }

    public void writeToParcel(Parcel dest, int flags) {
        C0975g gVar = CREATOR;
        C0975g.m3041a(this, dest, flags);
    }
}
