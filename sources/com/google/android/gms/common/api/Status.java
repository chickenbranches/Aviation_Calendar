package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender.SendIntentException;
import android.os.Parcel;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C0596ee;

public final class Status implements Result, SafeParcelable {
    public static final StatusCreator CREATOR = new StatusCreator();

    /* renamed from: nA */
    public static final Status f283nA = new Status(0, null, null);

    /* renamed from: nB */
    public static final Status f284nB = new Status(14, null, null);

    /* renamed from: nC */
    public static final Status f285nC = new Status(15, null, null);

    /* renamed from: kg */
    private final int f286kg;

    /* renamed from: mC */
    private final int f287mC;
    private final PendingIntent mPendingIntent;

    /* renamed from: nD */
    private final String f288nD;

    public Status(int statusCode) {
        this(1, statusCode, null, null);
    }

    Status(int versionCode, int statusCode, String statusMessage, PendingIntent pendingIntent) {
        this.f286kg = versionCode;
        this.f287mC = statusCode;
        this.f288nD = statusMessage;
        this.mPendingIntent = pendingIntent;
    }

    public Status(int statusCode, String statusMessage, PendingIntent pendingIntent) {
        this(1, statusCode, statusMessage, pendingIntent);
    }

    /* renamed from: bh */
    private String m213bh() {
        return this.f288nD != null ? this.f288nD : CommonStatusCodes.getStatusCodeString(this.f287mC);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: bs */
    public PendingIntent mo2342bs() {
        return this.mPendingIntent;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: bt */
    public String mo2343bt() {
        return this.f288nD;
    }

    @Deprecated
    /* renamed from: bu */
    public ConnectionResult mo2344bu() {
        return new ConnectionResult(this.f287mC, this.mPendingIntent);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f286kg == status.f286kg && this.f287mC == status.f287mC && C0596ee.equal(this.f288nD, status.f288nD) && C0596ee.equal(this.mPendingIntent, status.mPendingIntent);
    }

    public PendingIntent getResolution() {
        return this.mPendingIntent;
    }

    public Status getStatus() {
        return this;
    }

    public int getStatusCode() {
        return this.f287mC;
    }

    /* access modifiers changed from: 0000 */
    public int getVersionCode() {
        return this.f286kg;
    }

    public boolean hasResolution() {
        return this.mPendingIntent != null;
    }

    public int hashCode() {
        return C0596ee.hashCode(Integer.valueOf(this.f286kg), Integer.valueOf(this.f287mC), this.f288nD, this.mPendingIntent);
    }

    public boolean isInterrupted() {
        return this.f287mC == 14;
    }

    public boolean isSuccess() {
        return this.f287mC <= 0;
    }

    public void startResolutionForResult(Activity activity, int requestCode) throws SendIntentException {
        if (hasResolution()) {
            activity.startIntentSenderForResult(this.mPendingIntent.getIntentSender(), requestCode, null, 0, 0, 0);
        }
    }

    public String toString() {
        return C0596ee.m1542e(this).mo3971a("statusCode", m213bh()).mo3971a("resolution", this.mPendingIntent).toString();
    }

    public void writeToParcel(Parcel out, int flags) {
        StatusCreator.m217a(this, out, flags);
    }
}
