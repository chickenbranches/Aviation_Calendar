package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* renamed from: com.google.android.gms.internal.hd */
public final class C0834hd extends C0819gr implements SafeParcelable {
    public static final C0837he CREATOR = new C0837he();

    /* renamed from: AM */
    private final Bundle f2084AM;

    /* renamed from: AN */
    private final C0838hf f2085AN;

    /* renamed from: AO */
    private final LatLng f2086AO;

    /* renamed from: AP */
    private final float f2087AP;

    /* renamed from: AQ */
    private final LatLngBounds f2088AQ;

    /* renamed from: AR */
    private final String f2089AR;

    /* renamed from: AS */
    private final Uri f2090AS;

    /* renamed from: AT */
    private final boolean f2091AT;

    /* renamed from: AU */
    private final float f2092AU;

    /* renamed from: AV */
    private final int f2093AV;

    /* renamed from: AW */
    private final long f2094AW;

    /* renamed from: AX */
    private final List<C0825gx> f2095AX;

    /* renamed from: AY */
    private final Map<C0825gx, String> f2096AY;

    /* renamed from: AZ */
    private final TimeZone f2097AZ;

    /* renamed from: Ba */
    private Locale f2098Ba;

    /* renamed from: Bb */
    private C0840hh f2099Bb;

    /* renamed from: kg */
    final int f2100kg;

    /* renamed from: uS */
    private final String f2101uS;

    /* renamed from: com.google.android.gms.internal.hd$a */
    public static final class C0835a implements SafeParcelable {
        public static final C0831ha CREATOR = new C0831ha();

        /* renamed from: Bc */
        private final String f2102Bc;

        /* renamed from: Bd */
        private final String f2103Bd;

        /* renamed from: Be */
        private final int f2104Be;

        /* renamed from: kg */
        final int f2105kg;
        private final String mTag;

        /* renamed from: com.google.android.gms.internal.hd$a$a */
        public static class C0836a {

            /* renamed from: Bc */
            private final String f2106Bc;

            /* renamed from: Bd */
            private String f2107Bd;

            /* renamed from: Be */
            private int f2108Be;
            private final String mTag;

            public C0836a(String str, String str2) {
                this.f2106Bc = str;
                this.mTag = str2;
            }

            /* renamed from: as */
            public C0836a mo4643as(String str) {
                this.f2107Bd = str;
                return this;
            }

            /* renamed from: bd */
            public C0836a mo4644bd(int i) {
                this.f2108Be = i;
                return this;
            }

            /* renamed from: ek */
            public C0835a mo4645ek() {
                return new C0835a(0, this.f2106Bc, this.mTag, this.f2107Bd, this.f2108Be);
            }
        }

        C0835a(int i, String str, String str2, String str3, int i2) {
            this.f2105kg = i;
            this.f2102Bc = str;
            this.mTag = str2;
            this.f2103Bd = str3;
            this.f2104Be = i2;
        }

        public int describeContents() {
            C0831ha haVar = CREATOR;
            return 0;
        }

        /* renamed from: eh */
        public String mo4635eh() {
            return this.f2102Bc;
        }

        /* renamed from: ei */
        public String mo4636ei() {
            return this.f2103Bd;
        }

        /* renamed from: ej */
        public int mo4637ej() {
            return this.f2104Be;
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof C0835a)) {
                return false;
            }
            C0835a aVar = (C0835a) object;
            return this.f2102Bc.equals(aVar.f2102Bc) && C0596ee.equal(this.mTag, aVar.mTag);
        }

        public String getTag() {
            return this.mTag;
        }

        public int hashCode() {
            return C0596ee.hashCode(this.f2102Bc, this.mTag, this.f2103Bd, Integer.valueOf(this.f2104Be));
        }

        public String toString() {
            return C0596ee.m1542e(this).mo3971a("placeId", this.f2102Bc).mo3971a("tag", this.mTag).mo3971a("callingAppPackageName", this.f2103Bd).mo3971a("callingAppVersionCode", Integer.valueOf(this.f2104Be)).toString();
        }

        public void writeToParcel(Parcel parcel, int flags) {
            C0831ha haVar = CREATOR;
            C0831ha.m2489a(this, parcel, flags);
        }
    }

    C0834hd(int i, String str, List<C0825gx> list, Bundle bundle, C0838hf hfVar, LatLng latLng, float f, LatLngBounds latLngBounds, String str2, Uri uri, boolean z, float f2, int i2, long j) {
        this.f2100kg = i;
        this.f2101uS = str;
        this.f2095AX = Collections.unmodifiableList(list);
        this.f2084AM = bundle;
        this.f2085AN = hfVar;
        this.f2086AO = latLng;
        this.f2087AP = f;
        this.f2088AQ = latLngBounds;
        this.f2089AR = str2;
        this.f2090AS = uri;
        this.f2091AT = z;
        this.f2092AU = f2;
        this.f2093AV = i2;
        this.f2094AW = j;
        HashMap hashMap = new HashMap();
        for (String str3 : bundle.keySet()) {
            hashMap.put(C0825gx.m2476aq(str3), bundle.getString(str3));
        }
        this.f2096AY = Collections.unmodifiableMap(hashMap);
        this.f2097AZ = TimeZone.getTimeZone(this.f2089AR);
        this.f2098Ba = null;
        this.f2099Bb = null;
    }

    /* renamed from: ar */
    private void m2497ar(String str) {
        if (this.f2099Bb != null) {
            this.f2099Bb.mo4659a(new C0836a(this.f2101uS, str));
        }
    }

    /* renamed from: dW */
    public List<C0825gx> mo4616dW() {
        m2497ar("getTypes");
        return this.f2095AX;
    }

    /* renamed from: dX */
    public LatLng mo4617dX() {
        m2497ar("getLatLng");
        return this.f2086AO;
    }

    /* renamed from: dY */
    public float mo4618dY() {
        m2497ar("getLevelNumber");
        return this.f2087AP;
    }

    /* renamed from: dZ */
    public LatLngBounds mo4619dZ() {
        m2497ar("getViewport");
        return this.f2088AQ;
    }

    public int describeContents() {
        C0837he heVar = CREATOR;
        return 0;
    }

    /* renamed from: ea */
    public Uri mo4621ea() {
        m2497ar("getWebsiteUri");
        return this.f2090AS;
    }

    /* renamed from: eb */
    public boolean mo4622eb() {
        m2497ar("isPermanentlyClosed");
        return this.f2091AT;
    }

    /* renamed from: ec */
    public int mo4623ec() {
        m2497ar("getPriceLevel");
        return this.f2093AV;
    }

    /* renamed from: ed */
    public long mo4624ed() {
        return this.f2094AW;
    }

    /* renamed from: ee */
    public Bundle mo4625ee() {
        return this.f2084AM;
    }

    /* renamed from: ef */
    public C0838hf mo4626ef() {
        return this.f2085AN;
    }

    /* renamed from: eg */
    public String mo4627eg() {
        return this.f2089AR;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof C0834hd)) {
            return false;
        }
        C0834hd hdVar = (C0834hd) object;
        return this.f2101uS.equals(hdVar.f2101uS) && C0596ee.equal(this.f2098Ba, hdVar.f2098Ba) && this.f2094AW == hdVar.f2094AW;
    }

    public String getId() {
        m2497ar("getId");
        return this.f2101uS;
    }

    public float getRating() {
        m2497ar("getRating");
        return this.f2092AU;
    }

    public int hashCode() {
        return C0596ee.hashCode(this.f2101uS, this.f2098Ba, Long.valueOf(this.f2094AW));
    }

    public String toString() {
        return C0596ee.m1542e(this).mo3971a("id", this.f2101uS).mo3971a("localization", this.f2085AN).mo3971a("locale", this.f2098Ba).mo3971a("latlng", this.f2086AO).mo3971a("levelNumber", Float.valueOf(this.f2087AP)).mo3971a("viewport", this.f2088AQ).mo3971a("timeZone", this.f2089AR).mo3971a("websiteUri", this.f2090AS).mo3971a("isPermanentlyClosed", Boolean.valueOf(this.f2091AT)).mo3971a("priceLevel", Integer.valueOf(this.f2093AV)).mo3971a("timestampSecs", Long.valueOf(this.f2094AW)).toString();
    }

    public void writeToParcel(Parcel parcel, int flags) {
        C0837he heVar = CREATOR;
        C0837he.m2515a(this, parcel, flags);
    }
}
