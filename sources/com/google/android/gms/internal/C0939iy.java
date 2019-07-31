package com.google.android.gms.internal;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.iy */
public class C0939iy extends IOException {
    public C0939iy(String str) {
        super(str);
    }

    /* renamed from: gg */
    static C0939iy m2915gg() {
        return new C0939iy("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: gh */
    static C0939iy m2916gh() {
        return new C0939iy("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: gi */
    static C0939iy m2917gi() {
        return new C0939iy("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: gj */
    static C0939iy m2918gj() {
        return new C0939iy("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: gk */
    static C0939iy m2919gk() {
        return new C0939iy("Protocol message end-group tag did not match expected tag.");
    }

    /* renamed from: gl */
    static C0939iy m2920gl() {
        return new C0939iy("Protocol message tag had invalid wire type.");
    }
}
