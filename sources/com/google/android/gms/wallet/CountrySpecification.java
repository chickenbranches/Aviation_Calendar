package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class CountrySpecification implements SafeParcelable {
    public static final Creator<CountrySpecification> CREATOR = new C1130c();

    /* renamed from: id */
    String f2762id;

    /* renamed from: kg */
    private final int f2763kg;

    CountrySpecification(int versionCode, String countryCode) {
        this.f2763kg = versionCode;
        this.f2762id = countryCode;
    }

    public CountrySpecification(String countryCode) {
        this.f2763kg = 1;
        this.f2762id = countryCode;
    }

    public int describeContents() {
        return 0;
    }

    public String getCountryCode() {
        return this.f2762id;
    }

    public int getVersionCode() {
        return this.f2763kg;
    }

    public void writeToParcel(Parcel dest, int flags) {
        C1130c.m3284a(this, dest, flags);
    }
}
