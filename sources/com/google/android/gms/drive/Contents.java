package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Contents implements SafeParcelable {
    public static final Creator<Contents> CREATOR = new C0179a();

    /* renamed from: kg */
    final int f360kg;
    private boolean mClosed = false;

    /* renamed from: om */
    final ParcelFileDescriptor f361om;

    /* renamed from: qE */
    final int f362qE;

    /* renamed from: qF */
    final int f363qF;

    /* renamed from: qG */
    final DriveId f364qG;

    /* renamed from: qH */
    private boolean f365qH = false;

    /* renamed from: qI */
    private boolean f366qI = false;

    Contents(int versionCode, ParcelFileDescriptor parcelFileDescriptor, int requestId, int mode, DriveId driveId) {
        this.f360kg = versionCode;
        this.f361om = parcelFileDescriptor;
        this.f362qE = requestId;
        this.f363qF = mode;
        this.f364qG = driveId;
    }

    /* renamed from: cJ */
    public int mo2469cJ() {
        return this.f362qE;
    }

    public void close() {
        this.mClosed = true;
    }

    public int describeContents() {
        return 0;
    }

    public DriveId getDriveId() {
        return this.f364qG;
    }

    public InputStream getInputStream() {
        if (this.mClosed) {
            throw new IllegalStateException("Contents have been closed, cannot access the input stream.");
        } else if (this.f363qF != 268435456) {
            throw new IllegalStateException("getInputStream() can only be used with contents opened with MODE_READ_ONLY.");
        } else if (this.f365qH) {
            throw new IllegalStateException("getInputStream() can only be called once per Contents instance.");
        } else {
            this.f365qH = true;
            return new FileInputStream(this.f361om.getFileDescriptor());
        }
    }

    public int getMode() {
        return this.f363qF;
    }

    public OutputStream getOutputStream() {
        if (this.mClosed) {
            throw new IllegalStateException("Contents have been closed, cannot access the output stream.");
        } else if (this.f363qF != 536870912) {
            throw new IllegalStateException("getOutputStream() can only be used with contents opened with MODE_WRITE_ONLY.");
        } else if (this.f366qI) {
            throw new IllegalStateException("getOutputStream() can only be called once per Contents instance.");
        } else {
            this.f366qI = true;
            return new FileOutputStream(this.f361om.getFileDescriptor());
        }
    }

    public ParcelFileDescriptor getParcelFileDescriptor() {
        if (!this.mClosed) {
            return this.f361om;
        }
        throw new IllegalStateException("Contents have been closed, cannot access the output stream.");
    }

    public void writeToParcel(Parcel dest, int flags) {
        C0179a.m363a(this, dest, flags);
    }
}
