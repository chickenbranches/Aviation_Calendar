package com.google.android.gms.cast;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C0544dh;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CastDevice implements SafeParcelable {
    public static final Creator<CastDevice> CREATOR = new C0142b();

    /* renamed from: kA */
    String f161kA;

    /* renamed from: kB */
    private Inet4Address f162kB;

    /* renamed from: kC */
    private String f163kC;

    /* renamed from: kD */
    private String f164kD;

    /* renamed from: kE */
    private String f165kE;

    /* renamed from: kF */
    private int f166kF;

    /* renamed from: kG */
    private List<WebImage> f167kG;

    /* renamed from: kg */
    private final int f168kg;

    /* renamed from: kz */
    private String f169kz;

    private CastDevice() {
        this(1, null, null, null, null, null, -1, new ArrayList());
    }

    CastDevice(int versionCode, String deviceId, String hostAddress, String friendlyName, String modelName, String deviceVersion, int servicePort, List<WebImage> icons) {
        this.f168kg = versionCode;
        this.f169kz = deviceId;
        this.f161kA = hostAddress;
        if (this.f161kA != null) {
            try {
                InetAddress byName = InetAddress.getByName(this.f161kA);
                if (byName instanceof Inet4Address) {
                    this.f162kB = (Inet4Address) byName;
                }
            } catch (UnknownHostException e) {
                this.f162kB = null;
            }
        }
        this.f163kC = friendlyName;
        this.f164kD = modelName;
        this.f165kE = deviceVersion;
        this.f166kF = servicePort;
        this.f167kG = icons;
    }

    public static CastDevice getFromBundle(Bundle extras) {
        if (extras == null) {
            return null;
        }
        extras.setClassLoader(CastDevice.class.getClassLoader());
        return (CastDevice) extras.getParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE");
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CastDevice)) {
            return false;
        }
        CastDevice castDevice = (CastDevice) obj;
        return getDeviceId() == null ? castDevice.getDeviceId() == null : C0544dh.m1307a(this.f169kz, castDevice.f169kz) && C0544dh.m1307a(this.f162kB, castDevice.f162kB) && C0544dh.m1307a(this.f164kD, castDevice.f164kD) && C0544dh.m1307a(this.f163kC, castDevice.f163kC) && C0544dh.m1307a(this.f165kE, castDevice.f165kE) && this.f166kF == castDevice.f166kF && C0544dh.m1307a(this.f167kG, castDevice.f167kG);
    }

    public String getDeviceId() {
        return this.f169kz;
    }

    public String getDeviceVersion() {
        return this.f165kE;
    }

    public String getFriendlyName() {
        return this.f163kC;
    }

    public WebImage getIcon(int preferredWidth, int preferredHeight) {
        WebImage webImage;
        WebImage webImage2 = null;
        if (this.f167kG.isEmpty()) {
            return null;
        }
        if (preferredWidth <= 0 || preferredHeight <= 0) {
            return (WebImage) this.f167kG.get(0);
        }
        WebImage webImage3 = null;
        for (WebImage webImage4 : this.f167kG) {
            int width = webImage4.getWidth();
            int height = webImage4.getHeight();
            if (width < preferredWidth || height < preferredHeight) {
                if (width < preferredWidth && height < preferredHeight && (webImage2 == null || (webImage2.getWidth() < width && webImage2.getHeight() < height))) {
                    webImage = webImage3;
                }
                webImage4 = webImage2;
                webImage = webImage3;
            } else {
                if (webImage3 == null || (webImage3.getWidth() > width && webImage3.getHeight() > height)) {
                    WebImage webImage5 = webImage2;
                    webImage = webImage4;
                    webImage4 = webImage5;
                }
                webImage4 = webImage2;
                webImage = webImage3;
            }
            webImage3 = webImage;
            webImage2 = webImage4;
        }
        if (webImage3 == null) {
            webImage3 = webImage2 != null ? webImage2 : (WebImage) this.f167kG.get(0);
        }
        return webImage3;
    }

    public List<WebImage> getIcons() {
        return Collections.unmodifiableList(this.f167kG);
    }

    public Inet4Address getIpAddress() {
        return this.f162kB;
    }

    public String getModelName() {
        return this.f164kD;
    }

    public int getServicePort() {
        return this.f166kF;
    }

    /* access modifiers changed from: 0000 */
    public int getVersionCode() {
        return this.f168kg;
    }

    public boolean hasIcons() {
        return !this.f167kG.isEmpty();
    }

    public int hashCode() {
        if (this.f169kz == null) {
            return 0;
        }
        return this.f169kz.hashCode();
    }

    public boolean isSameDevice(CastDevice castDevice) {
        if (castDevice == null) {
            return false;
        }
        if (getDeviceId() == null) {
            return castDevice.getDeviceId() == null;
        }
        return C0544dh.m1307a(getDeviceId(), castDevice.getDeviceId());
    }

    public void putInBundle(Bundle bundle) {
        if (bundle != null) {
            bundle.putParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE", this);
        }
    }

    public String toString() {
        return String.format("\"%s\" (%s)", new Object[]{this.f163kC, this.f169kz});
    }

    public void writeToParcel(Parcel out, int flags) {
        C0142b.m158a(this, out, flags);
    }
}
