package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;

public final class Cart implements SafeParcelable {
    public static final Creator<Cart> CREATOR = new C1129b();

    /* renamed from: Gj */
    String f2757Gj;

    /* renamed from: Gk */
    String f2758Gk;

    /* renamed from: Gl */
    ArrayList<LineItem> f2759Gl;

    /* renamed from: kg */
    private final int f2760kg;

    public final class Builder {
        private Builder() {
        }

        public Builder addLineItem(LineItem lineItem) {
            Cart.this.f2759Gl.add(lineItem);
            return this;
        }

        public Cart build() {
            return Cart.this;
        }

        public Builder setCurrencyCode(String currencyCode) {
            Cart.this.f2758Gk = currencyCode;
            return this;
        }

        public Builder setLineItems(List<LineItem> lineItems) {
            Cart.this.f2759Gl.clear();
            Cart.this.f2759Gl.addAll(lineItems);
            return this;
        }

        public Builder setTotalPrice(String totalPrice) {
            Cart.this.f2757Gj = totalPrice;
            return this;
        }
    }

    Cart() {
        this.f2760kg = 1;
        this.f2759Gl = new ArrayList<>();
    }

    Cart(int versionCode, String totalPrice, String currencyCode, ArrayList<LineItem> lineItems) {
        this.f2760kg = versionCode;
        this.f2757Gj = totalPrice;
        this.f2758Gk = currencyCode;
        this.f2759Gl = lineItems;
    }

    public static Builder newBuilder() {
        Cart cart = new Cart();
        cart.getClass();
        return new Builder();
    }

    public int describeContents() {
        return 0;
    }

    public String getCurrencyCode() {
        return this.f2758Gk;
    }

    public ArrayList<LineItem> getLineItems() {
        return this.f2759Gl;
    }

    public String getTotalPrice() {
        return this.f2757Gj;
    }

    public int getVersionCode() {
        return this.f2760kg;
    }

    public void writeToParcel(Parcel dest, int flags) {
        C1129b.m3281a(this, dest, flags);
    }
}
