package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class FullWallet implements SafeParcelable {
    public static final Creator<FullWallet> CREATOR = new C1131d();

    /* renamed from: Gn */
    String f2764Gn;

    /* renamed from: Go */
    String f2765Go;

    /* renamed from: Gp */
    ProxyCard f2766Gp;

    /* renamed from: Gq */
    String f2767Gq;

    /* renamed from: Gr */
    Address f2768Gr;

    /* renamed from: Gs */
    Address f2769Gs;

    /* renamed from: Gt */
    String[] f2770Gt;

    /* renamed from: kg */
    private final int f2771kg;

    FullWallet() {
        this.f2771kg = 1;
    }

    FullWallet(int versionCode, String googleTransactionId, String merchantTransactionId, ProxyCard proxyCard, String email, Address billingAddress, Address shippingAddress, String[] paymentDescriptions) {
        this.f2771kg = versionCode;
        this.f2764Gn = googleTransactionId;
        this.f2765Go = merchantTransactionId;
        this.f2766Gp = proxyCard;
        this.f2767Gq = email;
        this.f2768Gr = billingAddress;
        this.f2769Gs = shippingAddress;
        this.f2770Gt = paymentDescriptions;
    }

    public int describeContents() {
        return 0;
    }

    public Address getBillingAddress() {
        return this.f2768Gr;
    }

    public String getEmail() {
        return this.f2767Gq;
    }

    public String getGoogleTransactionId() {
        return this.f2764Gn;
    }

    public String getMerchantTransactionId() {
        return this.f2765Go;
    }

    public String[] getPaymentDescriptions() {
        return this.f2770Gt;
    }

    public ProxyCard getProxyCard() {
        return this.f2766Gp;
    }

    public Address getShippingAddress() {
        return this.f2769Gs;
    }

    public int getVersionCode() {
        return this.f2771kg;
    }

    public void writeToParcel(Parcel out, int flags) {
        C1131d.m3287a(this, out, flags);
    }
}
