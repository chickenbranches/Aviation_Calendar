package com.google.android.gms.internal;

import com.google.android.gms.common.data.C0161b;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.internal.C0905ig.C0910c;
import com.google.android.gms.internal.C0905ig.C0912e;
import com.google.android.gms.plus.PlusShare;
import com.google.android.gms.plus.model.people.Person;
import com.google.android.gms.plus.model.people.Person.AgeRange;
import com.google.android.gms.plus.model.people.Person.Cover;
import com.google.android.gms.plus.model.people.Person.Image;
import com.google.android.gms.plus.model.people.Person.Name;
import com.google.android.gms.plus.model.people.Person.Organizations;
import com.google.android.gms.plus.model.people.Person.PlacesLived;
import com.google.android.gms.plus.model.people.Person.Urls;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ir */
public final class C0926ir extends C0161b implements Person {
    public C0926ir(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    /* renamed from: fP */
    public ArrayList<Organizations> getOrganizations() {
        return null;
    }

    /* renamed from: fQ */
    public ArrayList<PlacesLived> getPlacesLived() {
        return null;
    }

    /* renamed from: fR */
    public ArrayList<Urls> getUrls() {
        return null;
    }

    /* renamed from: fS */
    public Person freeze() {
        return new C0905ig(getDisplayName(), getId(), (C0910c) getImage(), getObjectType(), getUrl());
    }

    public String getAboutMe() {
        return null;
    }

    public AgeRange getAgeRange() {
        return null;
    }

    public String getBirthday() {
        return null;
    }

    public String getBraggingRights() {
        return null;
    }

    public int getCircledByCount() {
        return 0;
    }

    public Cover getCover() {
        return null;
    }

    public String getCurrentLocation() {
        return null;
    }

    public String getDisplayName() {
        return getString("displayName");
    }

    public int getGender() {
        return 0;
    }

    public String getId() {
        return getString("personId");
    }

    public Image getImage() {
        return new C0910c(getString("image"));
    }

    public String getLanguage() {
        return null;
    }

    public Name getName() {
        return null;
    }

    public String getNickname() {
        return null;
    }

    public int getObjectType() {
        return C0912e.m2784aB(getString("objectType"));
    }

    public int getPlusOneCount() {
        return 0;
    }

    public int getRelationshipStatus() {
        return 0;
    }

    public String getTagline() {
        return null;
    }

    public String getUrl() {
        return getString(PlusShare.KEY_CALL_TO_ACTION_URL);
    }

    public boolean hasAboutMe() {
        return false;
    }

    public boolean hasAgeRange() {
        return false;
    }

    public boolean hasBirthday() {
        return false;
    }

    public boolean hasBraggingRights() {
        return false;
    }

    public boolean hasCircledByCount() {
        return false;
    }

    public boolean hasCover() {
        return false;
    }

    public boolean hasCurrentLocation() {
        return false;
    }

    public boolean hasDisplayName() {
        return true;
    }

    public boolean hasGender() {
        return false;
    }

    public boolean hasId() {
        return true;
    }

    public boolean hasImage() {
        return true;
    }

    public boolean hasIsPlusUser() {
        return false;
    }

    public boolean hasLanguage() {
        return false;
    }

    public boolean hasName() {
        return false;
    }

    public boolean hasNickname() {
        return false;
    }

    public boolean hasObjectType() {
        return true;
    }

    public boolean hasOrganizations() {
        return false;
    }

    public boolean hasPlacesLived() {
        return false;
    }

    public boolean hasPlusOneCount() {
        return false;
    }

    public boolean hasRelationshipStatus() {
        return false;
    }

    public boolean hasTagline() {
        return false;
    }

    public boolean hasUrl() {
        return true;
    }

    public boolean hasUrls() {
        return false;
    }

    public boolean hasVerified() {
        return false;
    }

    public boolean isPlusUser() {
        return false;
    }

    public boolean isVerified() {
        return false;
    }
}
