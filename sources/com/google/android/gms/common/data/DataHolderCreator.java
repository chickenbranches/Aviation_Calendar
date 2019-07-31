package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C0173a;
import com.google.android.gms.common.internal.safeparcel.C0173a.C0174a;
import com.google.android.gms.common.internal.safeparcel.C0175b;

public class DataHolderCreator implements Creator<DataHolder> {
    public static final int CONTENT_DESCRIPTION = 0;

    /* renamed from: a */
    static void m242a(DataHolder dataHolder, Parcel parcel, int i) {
        int o = C0175b.m352o(parcel);
        C0175b.m346a(parcel, 1, dataHolder.mo2372bv(), false);
        C0175b.m350c(parcel, 1000, dataHolder.getVersionCode());
        C0175b.m345a(parcel, 2, (T[]) dataHolder.mo2373bw(), i, false);
        C0175b.m350c(parcel, 3, dataHolder.getStatusCode());
        C0175b.m334a(parcel, 4, dataHolder.getMetadata(), false);
        C0175b.m329D(parcel, o);
    }

    public DataHolder createFromParcel(Parcel parcel) {
        int i = 0;
        Bundle bundle = null;
        int n = C0173a.m313n(parcel);
        CursorWindow[] cursorWindowArr = null;
        String[] strArr = null;
        int i2 = 0;
        while (parcel.dataPosition() < n) {
            int m = C0173a.m311m(parcel);
            switch (C0173a.m292M(m)) {
                case 1:
                    strArr = C0173a.m324x(parcel, m);
                    break;
                case 2:
                    cursorWindowArr = (CursorWindow[]) C0173a.m299b(parcel, m, CursorWindow.CREATOR);
                    break;
                case 3:
                    i = C0173a.m305g(parcel, m);
                    break;
                case 4:
                    bundle = C0173a.m315o(parcel, m);
                    break;
                case 1000:
                    i2 = C0173a.m305g(parcel, m);
                    break;
                default:
                    C0173a.m298b(parcel, m);
                    break;
            }
        }
        if (parcel.dataPosition() != n) {
            throw new C0174a("Overread allowed size end=" + n, parcel);
        }
        DataHolder dataHolder = new DataHolder(i2, strArr, cursorWindowArr, i, bundle);
        dataHolder.validateContents();
        return dataHolder;
    }

    public DataHolder[] newArray(int size) {
        return new DataHolder[size];
    }
}
