package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C0600eg;

public final class NotifyTransactionStatusRequest implements SafeParcelable {
    public static final Creator<NotifyTransactionStatusRequest> CREATOR = new C1137j();

    /* renamed from: GV */
    String f2817GV;

    /* renamed from: Gn */
    String f2818Gn;

    /* renamed from: kg */
    final int f2819kg;
    int status;

    public final class Builder {
        private Builder() {
        }

        public NotifyTransactionStatusRequest build() {
            boolean z = true;
            C0600eg.m1553b(!TextUtils.isEmpty(NotifyTransactionStatusRequest.this.f2818Gn), (Object) "googleTransactionId is required");
            if (NotifyTransactionStatusRequest.this.status < 1 || NotifyTransactionStatusRequest.this.status > 8) {
                z = false;
            }
            C0600eg.m1553b(z, (Object) "status is an unrecognized value");
            return NotifyTransactionStatusRequest.this;
        }

        public Builder setDetailedReason(String detailedReason) {
            NotifyTransactionStatusRequest.this.f2817GV = detailedReason;
            return this;
        }

        public Builder setGoogleTransactionId(String googleTransactionId) {
            NotifyTransactionStatusRequest.this.f2818Gn = googleTransactionId;
            return this;
        }

        public Builder setStatus(int status) {
            NotifyTransactionStatusRequest.this.status = status;
            return this;
        }
    }

    public interface Status {
        public static final int SUCCESS = 1;

        public interface Error {
            public static final int AVS_DECLINE = 7;
            public static final int BAD_CARD = 4;
            public static final int BAD_CVC = 3;
            public static final int DECLINED = 5;
            public static final int FRAUD_DECLINE = 8;
            public static final int OTHER = 6;
            public static final int UNKNOWN = 2;
        }
    }

    NotifyTransactionStatusRequest() {
        this.f2819kg = 1;
    }

    NotifyTransactionStatusRequest(int versionCode, String googleTransactionId, int status2, String detailedReason) {
        this.f2819kg = versionCode;
        this.f2818Gn = googleTransactionId;
        this.status = status2;
        this.f2817GV = detailedReason;
    }

    public static Builder newBuilder() {
        NotifyTransactionStatusRequest notifyTransactionStatusRequest = new NotifyTransactionStatusRequest();
        notifyTransactionStatusRequest.getClass();
        return new Builder();
    }

    public int describeContents() {
        return 0;
    }

    public String getDetailedReason() {
        return this.f2817GV;
    }

    public String getGoogleTransactionId() {
        return this.f2818Gn;
    }

    public int getStatus() {
        return this.status;
    }

    public int getVersionCode() {
        return this.f2819kg;
    }

    public void writeToParcel(Parcel out, int flags) {
        C1137j.m3305a(this, out, flags);
    }
}
