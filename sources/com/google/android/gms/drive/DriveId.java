package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.internal.C0237q;
import com.google.android.gms.internal.C0600eg;
import com.google.android.gms.internal.C0939iy;
import com.google.android.gms.internal.C0940iz;

public class DriveId implements SafeParcelable {
    public static final Creator<DriveId> CREATOR = new C0181c();

    /* renamed from: kg */
    final int f372kg;

    /* renamed from: qO */
    final String f373qO;

    /* renamed from: qP */
    final long f374qP;

    /* renamed from: qQ */
    final long f375qQ;

    /* renamed from: qR */
    private volatile String f376qR;

    DriveId(int versionCode, String resourceId, long sqlId, long databaseInstanceId) {
        boolean z = false;
        this.f376qR = null;
        this.f372kg = versionCode;
        this.f373qO = resourceId;
        C0600eg.m1556r(!"".equals(resourceId));
        if (!(resourceId == null && sqlId == -1)) {
            z = true;
        }
        C0600eg.m1556r(z);
        this.f374qP = sqlId;
        this.f375qQ = databaseInstanceId;
    }

    public DriveId(String resourceId, long sqlId, long databaseInstanceId) {
        this(1, resourceId, sqlId, databaseInstanceId);
    }

    /* renamed from: ab */
    public static DriveId m356ab(String str) {
        C0600eg.m1554f(str);
        return new DriveId(str, -1, -1);
    }

    /* renamed from: d */
    static DriveId m357d(byte[] bArr) {
        try {
            C0237q e = C0237q.m509e(bArr);
            return new DriveId(e.versionCode, "".equals(e.f487rt) ? null : e.f487rt, e.f488ru, e.f489rv);
        } catch (C0939iy e2) {
            throw new IllegalArgumentException();
        }
    }

    public static DriveId decodeFromString(String s) {
        C0600eg.m1553b(s.startsWith("DriveId:"), (Object) "Invalid DriveId: " + s);
        return m357d(Base64.decode(s.substring("DriveId:".length()), 10));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: cL */
    public final byte[] mo2509cL() {
        C0237q qVar = new C0237q();
        qVar.versionCode = this.f372kg;
        qVar.f487rt = this.f373qO == null ? "" : this.f373qO;
        qVar.f488ru = this.f374qP;
        qVar.f489rv = this.f375qQ;
        return C0940iz.m2923a((C0940iz) qVar);
    }

    public int describeContents() {
        return 0;
    }

    public final String encodeToString() {
        if (this.f376qR == null) {
            this.f376qR = "DriveId:" + Base64.encodeToString(mo2509cL(), 10);
        }
        return this.f376qR;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DriveId)) {
            return false;
        }
        DriveId driveId = (DriveId) obj;
        if (driveId.f375qQ != this.f375qQ) {
            Log.w("DriveId", "Attempt to compare invalid DriveId detected. Has local storage been cleared?");
            return false;
        } else if (driveId.f374qP == -1 && this.f374qP == -1) {
            return driveId.f373qO.equals(this.f373qO);
        } else {
            return driveId.f374qP == this.f374qP;
        }
    }

    public String getResourceId() {
        return this.f373qO;
    }

    public int hashCode() {
        return this.f374qP == -1 ? this.f373qO.hashCode() : (String.valueOf(this.f375qQ) + String.valueOf(this.f374qP)).hashCode();
    }

    public String toString() {
        return encodeToString();
    }

    public void writeToParcel(Parcel out, int flags) {
        C0181c.m368a(this, out, flags);
    }
}
