package com.google.android.gms.cast;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;

public final class ApplicationMetadata implements SafeParcelable {
    public static final Creator<ApplicationMetadata> CREATOR = new C0141a();

    /* renamed from: kg */
    private final int f128kg;

    /* renamed from: kh */
    String f129kh;

    /* renamed from: ki */
    List<WebImage> f130ki;

    /* renamed from: kj */
    List<String> f131kj;

    /* renamed from: kk */
    String f132kk;

    /* renamed from: kl */
    Uri f133kl;
    String mName;

    private ApplicationMetadata() {
        this.f128kg = 1;
        this.f130ki = new ArrayList();
        this.f131kj = new ArrayList();
    }

    ApplicationMetadata(int versionCode, String applicationId, String name, List<WebImage> images, List<String> namespaces, String senderAppIdentifier, Uri senderAppLaunchUrl) {
        this.f128kg = versionCode;
        this.f129kh = applicationId;
        this.mName = name;
        this.f130ki = images;
        this.f131kj = namespaces;
        this.f132kk = senderAppIdentifier;
        this.f133kl = senderAppLaunchUrl;
    }

    /* renamed from: aN */
    public Uri mo2100aN() {
        return this.f133kl;
    }

    public boolean areNamespacesSupported(List<String> namespaces) {
        return this.f131kj != null && this.f131kj.containsAll(namespaces);
    }

    public int describeContents() {
        return 0;
    }

    public String getApplicationId() {
        return this.f129kh;
    }

    public List<WebImage> getImages() {
        return this.f130ki;
    }

    public String getName() {
        return this.mName;
    }

    public String getSenderAppIdentifier() {
        return this.f132kk;
    }

    /* access modifiers changed from: 0000 */
    public int getVersionCode() {
        return this.f128kg;
    }

    public boolean isNamespaceSupported(String namespace) {
        return this.f131kj != null && this.f131kj.contains(namespace);
    }

    public String toString() {
        return this.mName;
    }

    public void writeToParcel(Parcel out, int flags) {
        C0141a.m155a(this, out, flags);
    }
}
