package com.google.android.gms.drive.internal;

import com.google.android.gms.internal.C0936iw;
import com.google.android.gms.internal.C0937ix;
import com.google.android.gms.internal.C0939iy;
import com.google.android.gms.internal.C0940iz;
import com.google.android.gms.internal.C0943jb;
import java.io.IOException;

/* renamed from: com.google.android.gms.drive.internal.q */
public final class C0237q extends C0940iz {

    /* renamed from: rs */
    public static final C0237q[] f486rs = new C0237q[0];

    /* renamed from: rt */
    public String f487rt = "";

    /* renamed from: ru */
    public long f488ru = -1;

    /* renamed from: rv */
    public long f489rv = -1;

    /* renamed from: rw */
    private int f490rw = -1;
    public int versionCode = 1;

    /* renamed from: e */
    public static C0237q m509e(byte[] bArr) throws C0939iy {
        return (C0237q) C0940iz.m2921a(new C0237q(), bArr);
    }

    /* renamed from: a */
    public C0237q mo2678b(C0936iw iwVar) throws IOException {
        while (true) {
            int fU = iwVar.mo5214fU();
            switch (fU) {
                case 0:
                    break;
                case 8:
                    this.versionCode = iwVar.mo5216fW();
                    continue;
                case 18:
                    this.f487rt = iwVar.readString();
                    continue;
                case 24:
                    this.f488ru = iwVar.mo5217fX();
                    continue;
                case 32:
                    this.f489rv = iwVar.mo5217fX();
                    continue;
                default:
                    if (!C0943jb.m2936a(iwVar, fU)) {
                        break;
                    } else {
                        continue;
                    }
            }
        }
        return this;
    }

    /* renamed from: a */
    public void mo2677a(C0937ix ixVar) throws IOException {
        ixVar.mo5234d(1, this.versionCode);
        ixVar.mo5228b(2, this.f487rt);
        ixVar.mo5232c(3, this.f488ru);
        ixVar.mo5232c(4, this.f489rv);
    }

    /* renamed from: cP */
    public int mo2679cP() {
        int e = 0 + C0937ix.m2892e(1, this.versionCode) + C0937ix.m2893e(2, this.f487rt) + C0937ix.m2891d(3, this.f488ru) + C0937ix.m2891d(4, this.f489rv);
        this.f490rw = e;
        return e;
    }
}
