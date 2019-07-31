package com.google.android.gms.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.C0252f;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.fj */
public class C0637fj extends C0252f<DriveId> {

    /* renamed from: rN */
    public static final C0637fj f1625rN = new C0637fj();

    private C0637fj() {
        super("driveId", Arrays.asList(new String[]{"sqlId", "resourceId"}));
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public DriveId mo2713b(DataHolder dataHolder, int i, int i2) {
        long j = dataHolder.getMetadata().getLong("dbInstanceId");
        String string = dataHolder.getString("resourceId", i, i2);
        if (string != null && string.startsWith("generated-android-")) {
            string = null;
        }
        return new DriveId(string, Long.valueOf(dataHolder.getLong("sqlId", i, i2)).longValue(), j);
    }
}
