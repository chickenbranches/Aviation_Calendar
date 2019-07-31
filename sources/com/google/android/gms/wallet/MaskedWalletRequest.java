package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class MaskedWalletRequest implements SafeParcelable {
    public static final Creator<MaskedWalletRequest> CREATOR = new C1136i();

    /* renamed from: GK */
    boolean f2802GK;

    /* renamed from: GL */
    boolean f2803GL;

    /* renamed from: GM */
    boolean f2804GM;

    /* renamed from: GN */
    String f2805GN;

    /* renamed from: GO */
    String f2806GO;

    /* renamed from: GP */
    boolean f2807GP;

    /* renamed from: GQ */
    boolean f2808GQ;

    /* renamed from: GR */
    CountrySpecification[] f2809GR;

    /* renamed from: GS */
    boolean f2810GS;

    /* renamed from: GT */
    boolean f2811GT;

    /* renamed from: Gk */
    String f2812Gk;

    /* renamed from: Go */
    String f2813Go;

    /* renamed from: Gu */
    Cart f2814Gu;

    /* renamed from: kg */
    private final int f2815kg;

    public final class Builder {
        private Builder() {
        }

        public MaskedWalletRequest build() {
            return MaskedWalletRequest.this;
        }

        public Builder setAllowDebitCard(boolean allowDebitCard) {
            MaskedWalletRequest.this.f2811GT = allowDebitCard;
            return this;
        }

        public Builder setAllowPrepaidCard(boolean allowPrepaidCard) {
            MaskedWalletRequest.this.f2810GS = allowPrepaidCard;
            return this;
        }

        public Builder setAllowedShippingCountrySpecifications(CountrySpecification[] allowedShippingCountrySpecifications) {
            MaskedWalletRequest.this.f2809GR = allowedShippingCountrySpecifications;
            return this;
        }

        public Builder setCart(Cart cart) {
            MaskedWalletRequest.this.f2814Gu = cart;
            return this;
        }

        public Builder setCurrencyCode(String currencyCode) {
            MaskedWalletRequest.this.f2812Gk = currencyCode;
            return this;
        }

        public Builder setEstimatedTotalPrice(String estimatedTotalPrice) {
            MaskedWalletRequest.this.f2805GN = estimatedTotalPrice;
            return this;
        }

        public Builder setIsBillingAgreement(boolean isBillingAgreement) {
            MaskedWalletRequest.this.f2808GQ = isBillingAgreement;
            return this;
        }

        public Builder setMerchantName(String merchantName) {
            MaskedWalletRequest.this.f2806GO = merchantName;
            return this;
        }

        public Builder setMerchantTransactionId(String merchantTransactionId) {
            MaskedWalletRequest.this.f2813Go = merchantTransactionId;
            return this;
        }

        public Builder setPhoneNumberRequired(boolean phoneNumberRequired) {
            MaskedWalletRequest.this.f2802GK = phoneNumberRequired;
            return this;
        }

        public Builder setShippingAddressRequired(boolean shippingAddressRequired) {
            MaskedWalletRequest.this.f2803GL = shippingAddressRequired;
            return this;
        }

        public Builder setShouldRetrieveWalletObjects(boolean shouldRetrieveWalletObjects) {
            MaskedWalletRequest.this.f2807GP = shouldRetrieveWalletObjects;
            return this;
        }

        public Builder setUseMinimalBillingAddress(boolean useMinimalBillingAddress) {
            MaskedWalletRequest.this.f2804GM = useMinimalBillingAddress;
            return this;
        }
    }

    MaskedWalletRequest() {
        this.f2815kg = 3;
        this.f2810GS = true;
        this.f2811GT = true;
    }

    MaskedWalletRequest(int versionCode, String merchantTransactionId, boolean phoneNumberRequired, boolean shippingAddressRequired, boolean useMinimalBillingAddress, String estimatedTotalPrice, String currencyCode, String merchantName, Cart cart, boolean shouldRetrieveWalletObjects, boolean isBillingAgreement, CountrySpecification[] allowedShippingCountrySpecifications, boolean allowPrepaidCard, boolean allowDebitCard) {
        this.f2815kg = versionCode;
        this.f2813Go = merchantTransactionId;
        this.f2802GK = phoneNumberRequired;
        this.f2803GL = shippingAddressRequired;
        this.f2804GM = useMinimalBillingAddress;
        this.f2805GN = estimatedTotalPrice;
        this.f2812Gk = currencyCode;
        this.f2806GO = merchantName;
        this.f2814Gu = cart;
        this.f2807GP = shouldRetrieveWalletObjects;
        this.f2808GQ = isBillingAgreement;
        this.f2809GR = allowedShippingCountrySpecifications;
        this.f2810GS = allowPrepaidCard;
        this.f2811GT = allowDebitCard;
    }

    public static Builder newBuilder() {
        MaskedWalletRequest maskedWalletRequest = new MaskedWalletRequest();
        maskedWalletRequest.getClass();
        return new Builder();
    }

    public boolean allowDebitCard() {
        return this.f2811GT;
    }

    public boolean allowPrepaidCard() {
        return this.f2810GS;
    }

    public int describeContents() {
        return 0;
    }

    public CountrySpecification[] getAllowedShippingCountrySpecifications() {
        return this.f2809GR;
    }

    public Cart getCart() {
        return this.f2814Gu;
    }

    public String getCurrencyCode() {
        return this.f2812Gk;
    }

    public String getEstimatedTotalPrice() {
        return this.f2805GN;
    }

    public String getMerchantName() {
        return this.f2806GO;
    }

    public String getMerchantTransactionId() {
        return this.f2813Go;
    }

    public int getVersionCode() {
        return this.f2815kg;
    }

    public boolean isBillingAgreement() {
        return this.f2808GQ;
    }

    public boolean isPhoneNumberRequired() {
        return this.f2802GK;
    }

    public boolean isShippingAddressRequired() {
        return this.f2803GL;
    }

    public boolean shouldRetrieveWalletObjects() {
        return this.f2807GP;
    }

    public boolean useMinimalBillingAddress() {
        return this.f2804GM;
    }

    public void writeToParcel(Parcel dest, int flags) {
        C1136i.m3302a(this, dest, flags);
    }
}
