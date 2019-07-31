package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class Address implements SafeParcelable {
    public static final Creator<Address> CREATOR = new C1128a();

    /* renamed from: Ga */
    String f2746Ga;

    /* renamed from: Gb */
    String f2747Gb;

    /* renamed from: Gc */
    String f2748Gc;

    /* renamed from: Gd */
    String f2749Gd;

    /* renamed from: Ge */
    String f2750Ge;

    /* renamed from: Gf */
    String f2751Gf;

    /* renamed from: Gg */
    String f2752Gg;

    /* renamed from: Gh */
    boolean f2753Gh;

    /* renamed from: Gi */
    String f2754Gi;

    /* renamed from: id */
    String f2755id;

    /* renamed from: kg */
    private final int f2756kg;
    String name;

    Address() {
        this.f2756kg = 1;
    }

    Address(int versionCode, String name2, String address1, String address2, String address3, String countryCode, String city, String state, String postalCode, String phoneNumber, boolean isPostBox, String companyName) {
        this.f2756kg = versionCode;
        this.name = name2;
        this.f2746Ga = address1;
        this.f2747Gb = address2;
        this.f2748Gc = address3;
        this.f2755id = countryCode;
        this.f2749Gd = city;
        this.f2750Ge = state;
        this.f2751Gf = postalCode;
        this.f2752Gg = phoneNumber;
        this.f2753Gh = isPostBox;
        this.f2754Gi = companyName;
    }

    public int describeContents() {
        return 0;
    }

    public String getAddress1() {
        return this.f2746Ga;
    }

    public String getAddress2() {
        return this.f2747Gb;
    }

    public String getAddress3() {
        return this.f2748Gc;
    }

    public String getCity() {
        return this.f2749Gd;
    }

    public String getCompanyName() {
        return this.f2754Gi;
    }

    public String getCountryCode() {
        return this.f2755id;
    }

    public String getName() {
        return this.name;
    }

    public String getPhoneNumber() {
        return this.f2752Gg;
    }

    public String getPostalCode() {
        return this.f2751Gf;
    }

    public String getState() {
        return this.f2750Ge;
    }

    public int getVersionCode() {
        return this.f2756kg;
    }

    public boolean isPostBox() {
        return this.f2753Gh;
    }

    public void writeToParcel(Parcel out, int flags) {
        C1128a.m3278a(this, out, flags);
    }
}
