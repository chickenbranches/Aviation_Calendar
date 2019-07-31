package com.google.android.gms.drive;

import android.content.Context;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.C0145b;
import com.google.android.gms.common.api.GoogleApiClient.ApiOptions;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.drive.internal.C0190h;
import com.google.android.gms.drive.internal.C0208j;
import com.google.android.gms.internal.C0565dt;
import java.util.List;

public final class Drive {
    public static final Api API = new Api(f371jO, new Scope[0]);
    public static final DriveApi DriveApi = new C0190h();
    public static final Scope SCOPE_FILE = new Scope(Scopes.DRIVE_FILE);

    /* renamed from: jO */
    public static final C0145b<C0208j> f371jO = new C0145b<C0208j>() {
        /* renamed from: d */
        public C0208j mo2057b(Context context, C0565dt dtVar, ApiOptions apiOptions, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            List bH = dtVar.mo3871bH();
            return new C0208j(context, dtVar, connectionCallbacks, onConnectionFailedListener, (String[]) bH.toArray(new String[bH.size()]));
        }

        public int getPriority() {
            return Integer.MAX_VALUE;
        }
    };

    private Drive() {
    }
}
