package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class FullWalletRequest implements SafeParcelable {
    public static final Creator<FullWalletRequest> CREATOR = new C1132e();

    /* renamed from: Gn */
    String f2772Gn;

    /* renamed from: Go */
    String f2773Go;

    /* renamed from: Gu */
    Cart f2774Gu;

    /* renamed from: kg */
    private final int f2775kg;

    public final class Builder {
        private Builder() {
        }

        public FullWalletRequest build() {
            return FullWalletRequest.this;
        }

        public Builder setCart(Cart cart) {
            FullWalletRequest.this.f2774Gu = cart;
            return this;
        }

        public Builder setGoogleTransactionId(String googleTransactionId) {
            FullWalletRequest.this.f2772Gn = googleTransactionId;
            return this;
        }

        public Builder setMerchantTransactionId(String merchantTransactionId) {
            FullWalletRequest.this.f2773Go = merchantTransactionId;
            return this;
        }
    }

    FullWalletRequest() {
        this.f2775kg = 1;
    }

    FullWalletRequest(int versionCode, String googleTransactionId, String merchantTransactionId, Cart cart) {
        this.f2775kg = versionCode;
        this.f2772Gn = googleTransactionId;
        this.f2773Go = merchantTransactionId;
        this.f2774Gu = cart;
    }

    public static Builder newBuilder() {
        FullWalletRequest fullWalletRequest = new FullWalletRequest();
        fullWalletRequest.getClass();
        return new Builder();
    }

    public int describeContents() {
        return 0;
    }

    public Cart getCart() {
        return this.f2774Gu;
    }

    public String getGoogleTransactionId() {
        return this.f2772Gn;
    }

    public String getMerchantTransactionId() {
        return this.f2773Go;
    }

    public int getVersionCode() {
        return this.f2775kg;
    }

    public void writeToParcel(Parcel dest, int flags) {
        C1132e.m3290a(this, dest, flags);
    }
}
