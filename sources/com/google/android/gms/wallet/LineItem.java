package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class LineItem implements SafeParcelable {
    public static final Creator<LineItem> CREATOR = new C1133f();

    /* renamed from: Gj */
    String f2777Gj;

    /* renamed from: Gk */
    String f2778Gk;

    /* renamed from: Gw */
    String f2779Gw;

    /* renamed from: Gx */
    String f2780Gx;

    /* renamed from: Gy */
    int f2781Gy;
    String description;

    /* renamed from: kg */
    private final int f2782kg;

    public final class Builder {
        private Builder() {
        }

        public LineItem build() {
            return LineItem.this;
        }

        public Builder setCurrencyCode(String currencyCode) {
            LineItem.this.f2778Gk = currencyCode;
            return this;
        }

        public Builder setDescription(String description) {
            LineItem.this.description = description;
            return this;
        }

        public Builder setQuantity(String quantity) {
            LineItem.this.f2779Gw = quantity;
            return this;
        }

        public Builder setRole(int role) {
            LineItem.this.f2781Gy = role;
            return this;
        }

        public Builder setTotalPrice(String totalPrice) {
            LineItem.this.f2777Gj = totalPrice;
            return this;
        }

        public Builder setUnitPrice(String unitPrice) {
            LineItem.this.f2780Gx = unitPrice;
            return this;
        }
    }

    public interface Role {
        public static final int REGULAR = 0;
        public static final int SHIPPING = 2;
        public static final int TAX = 1;
    }

    LineItem() {
        this.f2782kg = 1;
        this.f2781Gy = 0;
    }

    LineItem(int versionCode, String description2, String quantity, String unitPrice, String totalPrice, int role, String currencyCode) {
        this.f2782kg = versionCode;
        this.description = description2;
        this.f2779Gw = quantity;
        this.f2780Gx = unitPrice;
        this.f2777Gj = totalPrice;
        this.f2781Gy = role;
        this.f2778Gk = currencyCode;
    }

    public static Builder newBuilder() {
        LineItem lineItem = new LineItem();
        lineItem.getClass();
        return new Builder();
    }

    public int describeContents() {
        return 0;
    }

    public String getCurrencyCode() {
        return this.f2778Gk;
    }

    public String getDescription() {
        return this.description;
    }

    public String getQuantity() {
        return this.f2779Gw;
    }

    public int getRole() {
        return this.f2781Gy;
    }

    public String getTotalPrice() {
        return this.f2777Gj;
    }

    public String getUnitPrice() {
        return this.f2780Gx;
    }

    public int getVersionCode() {
        return this.f2782kg;
    }

    public void writeToParcel(Parcel dest, int flags) {
        C1133f.m3293a(this, dest, flags);
    }
}
