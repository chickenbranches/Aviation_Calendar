package com.google.android.gms.appstate;

import com.google.android.gms.internal.C0596ee;

/* renamed from: com.google.android.gms.appstate.a */
public final class C0111a implements AppState {

    /* renamed from: jI */
    private final int f117jI;

    /* renamed from: jJ */
    private final String f118jJ;

    /* renamed from: jK */
    private final byte[] f119jK;

    /* renamed from: jL */
    private final boolean f120jL;

    /* renamed from: jM */
    private final String f121jM;

    /* renamed from: jN */
    private final byte[] f122jN;

    public C0111a(AppState appState) {
        this.f117jI = appState.getKey();
        this.f118jJ = appState.getLocalVersion();
        this.f119jK = appState.getLocalData();
        this.f120jL = appState.hasConflict();
        this.f121jM = appState.getConflictVersion();
        this.f122jN = appState.getConflictData();
    }

    /* renamed from: a */
    static int m75a(AppState appState) {
        return C0596ee.hashCode(Integer.valueOf(appState.getKey()), appState.getLocalVersion(), appState.getLocalData(), Boolean.valueOf(appState.hasConflict()), appState.getConflictVersion(), appState.getConflictData());
    }

    /* renamed from: a */
    static boolean m76a(AppState appState, Object obj) {
        if (!(obj instanceof AppState)) {
            return false;
        }
        if (appState == obj) {
            return true;
        }
        AppState appState2 = (AppState) obj;
        return C0596ee.equal(Integer.valueOf(appState2.getKey()), Integer.valueOf(appState.getKey())) && C0596ee.equal(appState2.getLocalVersion(), appState.getLocalVersion()) && C0596ee.equal(appState2.getLocalData(), appState.getLocalData()) && C0596ee.equal(Boolean.valueOf(appState2.hasConflict()), Boolean.valueOf(appState.hasConflict())) && C0596ee.equal(appState2.getConflictVersion(), appState.getConflictVersion()) && C0596ee.equal(appState2.getConflictData(), appState.getConflictData());
    }

    /* renamed from: b */
    static String m77b(AppState appState) {
        return C0596ee.m1542e(appState).mo3971a("Key", Integer.valueOf(appState.getKey())).mo3971a("LocalVersion", appState.getLocalVersion()).mo3971a("LocalData", appState.getLocalData()).mo3971a("HasConflict", Boolean.valueOf(appState.hasConflict())).mo3971a("ConflictVersion", appState.getConflictVersion()).mo3971a("ConflictData", appState.getConflictData()).toString();
    }

    /* renamed from: aK */
    public AppState freeze() {
        return this;
    }

    public boolean equals(Object obj) {
        return m76a(this, obj);
    }

    public byte[] getConflictData() {
        return this.f122jN;
    }

    public String getConflictVersion() {
        return this.f121jM;
    }

    public int getKey() {
        return this.f117jI;
    }

    public byte[] getLocalData() {
        return this.f119jK;
    }

    public String getLocalVersion() {
        return this.f118jJ;
    }

    public boolean hasConflict() {
        return this.f120jL;
    }

    public int hashCode() {
        return m75a(this);
    }

    public boolean isDataValid() {
        return true;
    }

    public String toString() {
        return m77b(this);
    }
}
