package com.google.ads.mediation;

import android.location.Location;
import com.google.ads.AdRequest.Gender;
import java.util.Date;
import java.util.Set;

@Deprecated
public final class MediationAdRequest {

    /* renamed from: d */
    private final Date f5d;

    /* renamed from: e */
    private final Gender f6e;

    /* renamed from: f */
    private final Set<String> f7f;

    /* renamed from: g */
    private final boolean f8g;

    public MediationAdRequest(Date birthday, Gender gender, Set<String> keywords, boolean isTesting) {
        this.f5d = birthday;
        this.f6e = gender;
        this.f7f = keywords;
        this.f8g = isTesting;
    }

    public Integer getAgeInYears() {
        return null;
    }

    public Date getBirthday() {
        return this.f5d;
    }

    public Gender getGender() {
        return this.f6e;
    }

    public Set<String> getKeywords() {
        return this.f7f;
    }

    public Location getLocation() {
        return null;
    }

    public boolean isTesting() {
        return this.f8g;
    }
}
