package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class MaskedWallet implements SafeParcelable {
    public static final Creator<MaskedWallet> CREATOR = new C1135h();

    /* renamed from: GI */
    LoyaltyWalletObject[] f2793GI;

    /* renamed from: GJ */
    OfferWalletObject[] f2794GJ;

    /* renamed from: Gn */
    String f2795Gn;

    /* renamed from: Go */
    String f2796Go;

    /* renamed from: Gq */
    String f2797Gq;

    /* renamed from: Gr */
    Address f2798Gr;

    /* renamed from: Gs */
    Address f2799Gs;

    /* renamed from: Gt */
    String[] f2800Gt;

    /* renamed from: kg */
    private final int f2801kg;

    MaskedWallet() {
        this.f2801kg = 2;
    }

    MaskedWallet(int versionCode, String googleTransactionId, String merchantTransactionId, String[] paymentDescriptions, String email, Address billingAddress, Address shippingAddress, LoyaltyWalletObject[] loyaltyWalletObjects, OfferWalletObject[] offerWalletObjects) {
        this.f2801kg = versionCode;
        this.f2795Gn = googleTransactionId;
        this.f2796Go = merchantTransactionId;
        this.f2800Gt = paymentDescriptions;
        this.f2797Gq = email;
        this.f2798Gr = billingAddress;
        this.f2799Gs = shippingAddress;
        this.f2793GI = loyaltyWalletObjects;
        this.f2794GJ = offerWalletObjects;
    }

    public int describeContents() {
        return 0;
    }

    public Address getBillingAddress() {
        return this.f2798Gr;
    }

    public String getEmail() {
        return this.f2797Gq;
    }

    public String getGoogleTransactionId() {
        return this.f2795Gn;
    }

    public LoyaltyWalletObject[] getLoyaltyWalletObjects() {
        return this.f2793GI;
    }

    public String getMerchantTransactionId() {
        return this.f2796Go;
    }

    public OfferWalletObject[] getOfferWalletObjects() {
        return this.f2794GJ;
    }

    public String[] getPaymentDescriptions() {
        return this.f2800Gt;
    }

    public Address getShippingAddress() {
        return this.f2799Gs;
    }

    public int getVersionCode() {
        return this.f2801kg;
    }

    public void writeToParcel(Parcel dest, int flags) {
        C1135h.m3299a(this, dest, flags);
    }
}
