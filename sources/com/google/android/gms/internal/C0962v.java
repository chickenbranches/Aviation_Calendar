package com.google.android.gms.internal;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.ads.mediation.admob.AdMobExtras;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.v */
public final class C0962v implements SafeParcelable {
    public static final C0963w CREATOR = new C0963w();

    /* renamed from: eA */
    public final boolean f2410eA;

    /* renamed from: eB */
    public final boolean f2411eB;

    /* renamed from: eC */
    public final String f2412eC;

    /* renamed from: eD */
    public final C0366ai f2413eD;

    /* renamed from: eE */
    public final Location f2414eE;

    /* renamed from: ex */
    public final long f2415ex;
    public final Bundle extras;

    /* renamed from: ey */
    public final int f2416ey;

    /* renamed from: ez */
    public final List<String> f2417ez;
    public final int tagForChildDirectedTreatment;
    public final int versionCode;

    C0962v(int i, long j, Bundle bundle, int i2, List<String> list, boolean z, int i3, boolean z2, String str, C0366ai aiVar, Location location) {
        this.versionCode = i;
        this.f2415ex = j;
        this.extras = bundle;
        this.f2416ey = i2;
        this.f2417ez = list;
        this.f2410eA = z;
        this.tagForChildDirectedTreatment = i3;
        this.f2411eB = z2;
        this.f2412eC = str;
        this.f2413eD = aiVar;
        this.f2414eE = location;
    }

    public C0962v(Context context, C0362af afVar) {
        C0366ai aiVar = null;
        this.versionCode = 2;
        Date birthday = afVar.getBirthday();
        this.f2415ex = birthday != null ? birthday.getTime() : -1;
        this.f2416ey = afVar.getGender();
        Set keywords = afVar.getKeywords();
        this.f2417ez = !keywords.isEmpty() ? Collections.unmodifiableList(new ArrayList(keywords)) : null;
        this.f2410eA = afVar.isTestDevice(context);
        this.tagForChildDirectedTreatment = afVar.mo3456S();
        this.f2414eE = afVar.getLocation();
        AdMobExtras adMobExtras = (AdMobExtras) afVar.getNetworkExtras(AdMobExtras.class);
        this.extras = adMobExtras != null ? adMobExtras.getExtras() : null;
        this.f2411eB = afVar.getManualImpressionsEnabled();
        this.f2412eC = afVar.getPublisherProvidedId();
        SearchAdRequest Q = afVar.mo3454Q();
        if (Q != null) {
            aiVar = new C0366ai(Q);
        }
        this.f2413eD = aiVar;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel out, int flags) {
        C0963w.m3011a(this, out, flags);
    }
}
