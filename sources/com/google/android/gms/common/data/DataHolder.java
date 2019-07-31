package com.google.android.gms.common.data;

import android.content.ContentValues;
import android.database.AbstractWindowedCursor;
import android.database.CharArrayBuffer;
import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C0564ds;
import com.google.android.gms.internal.C0596ee;
import com.google.android.gms.internal.C0600eg;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class DataHolder implements SafeParcelable {
    public static final DataHolderCreator CREATOR = new DataHolderCreator();

    /* renamed from: nS */
    private static final Builder f300nS = new Builder(new String[0], null) {
        public Builder withRow(ContentValues values) {
            throw new UnsupportedOperationException("Cannot add data to empty builder");
        }

        public Builder withRow(HashMap<String, Object> hashMap) {
            throw new UnsupportedOperationException("Cannot add data to empty builder");
        }
    };

    /* renamed from: kg */
    private final int f301kg;

    /* renamed from: mC */
    private final int f302mC;
    boolean mClosed;

    /* renamed from: nK */
    private final String[] f303nK;

    /* renamed from: nL */
    Bundle f304nL;

    /* renamed from: nM */
    private final CursorWindow[] f305nM;

    /* renamed from: nN */
    private final Bundle f306nN;

    /* renamed from: nO */
    int[] f307nO;

    /* renamed from: nP */
    int f308nP;

    /* renamed from: nQ */
    private Object f309nQ;

    /* renamed from: nR */
    private boolean f310nR;

    public static class Builder {
        /* access modifiers changed from: private */

        /* renamed from: nK */
        public final String[] f311nK;
        /* access modifiers changed from: private */

        /* renamed from: nT */
        public final ArrayList<HashMap<String, Object>> f312nT;

        /* renamed from: nU */
        private final String f313nU;

        /* renamed from: nV */
        private final HashMap<Object, Integer> f314nV;

        /* renamed from: nW */
        private boolean f315nW;

        /* renamed from: nX */
        private String f316nX;

        private Builder(String[] columns, String uniqueColumn) {
            this.f311nK = (String[]) C0600eg.m1554f(columns);
            this.f312nT = new ArrayList<>();
            this.f313nU = uniqueColumn;
            this.f314nV = new HashMap<>();
            this.f315nW = false;
            this.f316nX = null;
        }

        /* renamed from: a */
        private void m237a(HashMap<String, Object> hashMap) {
            Object obj = hashMap.get(this.f313nU);
            if (obj != null) {
                Integer num = (Integer) this.f314nV.remove(obj);
                if (num != null) {
                    this.f312nT.remove(num.intValue());
                }
                this.f314nV.put(obj, Integer.valueOf(this.f312nT.size()));
            }
        }

        /* renamed from: bx */
        private void m240bx() {
            if (this.f313nU != null) {
                this.f314nV.clear();
                int size = this.f312nT.size();
                for (int i = 0; i < size; i++) {
                    Object obj = ((HashMap) this.f312nT.get(i)).get(this.f313nU);
                    if (obj != null) {
                        this.f314nV.put(obj, Integer.valueOf(i));
                    }
                }
            }
        }

        public DataHolder build(int statusCode) {
            return new DataHolder(this, statusCode, (Bundle) null);
        }

        public DataHolder build(int statusCode, Bundle metadata) {
            return new DataHolder(this, statusCode, metadata, -1);
        }

        public DataHolder build(int statusCode, Bundle metadata, int maxResults) {
            return new DataHolder(this, statusCode, metadata, maxResults);
        }

        public int getCount() {
            return this.f312nT.size();
        }

        public Builder removeRowsWithValue(String column, Object value) {
            for (int size = this.f312nT.size() - 1; size >= 0; size--) {
                if (C0596ee.equal(((HashMap) this.f312nT.get(size)).get(column), value)) {
                    this.f312nT.remove(size);
                }
            }
            return this;
        }

        public Builder sort(String sortColumn) {
            C0564ds.m1396d(sortColumn);
            if (!this.f315nW || !sortColumn.equals(this.f316nX)) {
                Collections.sort(this.f312nT, new C0159a(sortColumn));
                m240bx();
                this.f315nW = true;
                this.f316nX = sortColumn;
            }
            return this;
        }

        public Builder withRow(ContentValues values) {
            C0564ds.m1396d(values);
            HashMap hashMap = new HashMap(values.size());
            for (Entry entry : values.valueSet()) {
                hashMap.put(entry.getKey(), entry.getValue());
            }
            return withRow(hashMap);
        }

        public Builder withRow(HashMap<String, Object> row) {
            C0564ds.m1396d(row);
            if (this.f313nU != null) {
                m237a(row);
            }
            this.f312nT.add(row);
            this.f315nW = false;
            return this;
        }
    }

    /* renamed from: com.google.android.gms.common.data.DataHolder$a */
    private static final class C0159a implements Comparator<HashMap<String, Object>> {

        /* renamed from: nY */
        private final String f317nY;

        C0159a(String str) {
            this.f317nY = (String) C0600eg.m1554f(str);
        }

        /* renamed from: a */
        public int compare(HashMap<String, Object> hashMap, HashMap<String, Object> hashMap2) {
            Object f = C0600eg.m1554f(hashMap.get(this.f317nY));
            Object f2 = C0600eg.m1554f(hashMap2.get(this.f317nY));
            if (f.equals(f2)) {
                return 0;
            }
            if (f instanceof Boolean) {
                return ((Boolean) f).compareTo((Boolean) f2);
            }
            if (f instanceof Long) {
                return ((Long) f).compareTo((Long) f2);
            }
            if (f instanceof Integer) {
                return ((Integer) f).compareTo((Integer) f2);
            }
            if (f instanceof String) {
                return ((String) f).compareTo((String) f2);
            }
            throw new IllegalArgumentException("Unknown type for lValue " + f);
        }
    }

    DataHolder(int versionCode, String[] columns, CursorWindow[] windows, int statusCode, Bundle metadata) {
        this.mClosed = false;
        this.f310nR = true;
        this.f301kg = versionCode;
        this.f303nK = columns;
        this.f305nM = windows;
        this.f302mC = statusCode;
        this.f306nN = metadata;
    }

    public DataHolder(AbstractWindowedCursor cursor, int statusCode, Bundle metadata) {
        this(cursor.getColumnNames(), m230a(cursor), statusCode, metadata);
    }

    private DataHolder(Builder builder, int statusCode, Bundle metadata) {
        this(builder.f311nK, m231a(builder, -1), statusCode, metadata);
    }

    private DataHolder(Builder builder, int statusCode, Bundle metadata, int maxResults) {
        this(builder.f311nK, m231a(builder, maxResults), statusCode, metadata);
    }

    public DataHolder(String[] columns, CursorWindow[] windows, int statusCode, Bundle metadata) {
        this.mClosed = false;
        this.f310nR = true;
        this.f301kg = 1;
        this.f303nK = (String[]) C0600eg.m1554f(columns);
        this.f305nM = (CursorWindow[]) C0600eg.m1554f(windows);
        this.f302mC = statusCode;
        this.f306nN = metadata;
        validateContents();
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    private static CursorWindow[] m230a(AbstractWindowedCursor abstractWindowedCursor) {
        int i;
        ArrayList arrayList = new ArrayList();
        try {
            int count = abstractWindowedCursor.getCount();
            CursorWindow window = abstractWindowedCursor.getWindow();
            if (window == null || window.getStartPosition() != 0) {
                i = 0;
            } else {
                window.acquireReference();
                abstractWindowedCursor.setWindow(null);
                arrayList.add(window);
                i = window.getNumRows();
            }
            while (i < count && abstractWindowedCursor.moveToPosition(i)) {
                CursorWindow window2 = abstractWindowedCursor.getWindow();
                if (window2 != null) {
                    window2.acquireReference();
                    abstractWindowedCursor.setWindow(null);
                } else {
                    window2 = new CursorWindow(false);
                    window2.setStartPosition(i);
                    abstractWindowedCursor.fillWindow(i, window2);
                }
                if (window2.getNumRows() == 0) {
                    break;
                }
                arrayList.add(window2);
                i = window2.getNumRows() + window2.getStartPosition();
            }
            abstractWindowedCursor.close();
            return (CursorWindow[]) arrayList.toArray(new CursorWindow[arrayList.size()]);
        } catch (Throwable th) {
            abstractWindowedCursor.close();
            throw th;
        }
    }

    /* renamed from: a */
    private static CursorWindow[] m231a(Builder builder, int i) {
        int i2;
        int i3;
        int i4;
        CursorWindow cursorWindow;
        if (builder.f311nK.length == 0) {
            return new CursorWindow[0];
        }
        List b = (i < 0 || i >= builder.f312nT.size()) ? builder.f312nT : builder.f312nT.subList(0, i);
        int size = b.size();
        CursorWindow cursorWindow2 = new CursorWindow(false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(cursorWindow2);
        cursorWindow2.setNumColumns(builder.f311nK.length);
        int i5 = 0;
        int i6 = 0;
        while (i5 < size) {
            try {
                if (!cursorWindow2.allocRow()) {
                    Log.d("DataHolder", "Allocating additional cursor window for large data set (row " + i5 + ")");
                    cursorWindow2 = new CursorWindow(false);
                    cursorWindow2.setStartPosition(i5);
                    cursorWindow2.setNumColumns(builder.f311nK.length);
                    arrayList.add(cursorWindow2);
                    if (!cursorWindow2.allocRow()) {
                        Log.e("DataHolder", "Unable to allocate row to hold data.");
                        arrayList.remove(cursorWindow2);
                        return (CursorWindow[]) arrayList.toArray(new CursorWindow[arrayList.size()]);
                    }
                    i2 = 0;
                } else {
                    i2 = i6;
                }
                Map map = (Map) b.get(i5);
                boolean z = true;
                for (int i7 = 0; i7 < builder.f311nK.length && z; i7++) {
                    String str = builder.f311nK[i7];
                    Object obj = map.get(str);
                    if (obj == null) {
                        z = cursorWindow2.putNull(i2, i7);
                    } else if (obj instanceof String) {
                        z = cursorWindow2.putString((String) obj, i2, i7);
                    } else if (obj instanceof Long) {
                        z = cursorWindow2.putLong(((Long) obj).longValue(), i2, i7);
                    } else if (obj instanceof Integer) {
                        z = cursorWindow2.putLong((long) ((Integer) obj).intValue(), i2, i7);
                    } else if (obj instanceof Boolean) {
                        z = cursorWindow2.putLong(((Boolean) obj).booleanValue() ? 1 : 0, i2, i7);
                    } else if (obj instanceof byte[]) {
                        z = cursorWindow2.putBlob((byte[]) obj, i2, i7);
                    } else {
                        throw new IllegalArgumentException("Unsupported object for column " + str + ": " + obj);
                    }
                }
                if (!z) {
                    Log.d("DataHolder", "Couldn't populate window data for row " + i5 + " - allocating new window.");
                    cursorWindow2.freeLastRow();
                    CursorWindow cursorWindow3 = new CursorWindow(false);
                    cursorWindow3.setNumColumns(builder.f311nK.length);
                    arrayList.add(cursorWindow3);
                    i4 = i5 - 1;
                    cursorWindow = cursorWindow3;
                    i3 = 0;
                } else {
                    i3 = i2 + 1;
                    i4 = i5;
                    cursorWindow = cursorWindow2;
                }
                cursorWindow2 = cursorWindow;
                i5 = i4 + 1;
                i6 = i3;
            } catch (RuntimeException e) {
                RuntimeException runtimeException = e;
                int size2 = arrayList.size();
                for (int i8 = 0; i8 < size2; i8++) {
                    ((CursorWindow) arrayList.get(i8)).close();
                }
                throw runtimeException;
            }
        }
        return (CursorWindow[]) arrayList.toArray(new CursorWindow[arrayList.size()]);
    }

    /* renamed from: b */
    private void m232b(String str, int i) {
        if (this.f304nL == null || !this.f304nL.containsKey(str)) {
            throw new IllegalArgumentException("No such column: " + str);
        } else if (isClosed()) {
            throw new IllegalArgumentException("Buffer is closed.");
        } else if (i < 0 || i >= this.f308nP) {
            throw new CursorIndexOutOfBoundsException(i, this.f308nP);
        }
    }

    public static Builder builder(String[] columns) {
        return new Builder(columns, null);
    }

    public static Builder builder(String[] columns, String uniqueColumn) {
        C0600eg.m1554f(uniqueColumn);
        return new Builder(columns, uniqueColumn);
    }

    public static DataHolder empty(int statusCode) {
        return empty(statusCode, null);
    }

    public static DataHolder empty(int statusCode, Bundle metadata) {
        return new DataHolder(f300nS, statusCode, metadata);
    }

    /* renamed from: C */
    public int mo2371C(int i) {
        int i2 = 0;
        C0600eg.m1555p(i >= 0 && i < this.f308nP);
        while (true) {
            if (i2 >= this.f307nO.length) {
                break;
            } else if (i < this.f307nO[i2]) {
                i2--;
                break;
            } else {
                i2++;
            }
        }
        return i2 == this.f307nO.length ? i2 - 1 : i2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: bv */
    public String[] mo2372bv() {
        return this.f303nK;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: bw */
    public CursorWindow[] mo2373bw() {
        return this.f305nM;
    }

    /* renamed from: c */
    public void mo2374c(Object obj) {
        this.f309nQ = obj;
    }

    public void close() {
        synchronized (this) {
            if (!this.mClosed) {
                this.mClosed = true;
                for (CursorWindow close : this.f305nM) {
                    close.close();
                }
            }
        }
    }

    public void copyToBuffer(String column, int row, int windowIndex, CharArrayBuffer dataOut) {
        m232b(column, row);
        this.f305nM[windowIndex].copyStringToBuffer(row, this.f304nL.getInt(column), dataOut);
    }

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        try {
            if (this.f310nR && this.f305nM.length > 0 && !isClosed()) {
                Log.e("DataBuffer", "Internal data leak within a DataBuffer object detected!  Be sure to explicitly call close() on all DataBuffer extending objects when you are done with them. (" + (this.f309nQ == null ? "internal object: " + toString() : this.f309nQ.toString()) + ")");
                close();
            }
        } finally {
            super.finalize();
        }
    }

    public boolean getBoolean(String column, int row, int windowIndex) {
        m232b(column, row);
        return Long.valueOf(this.f305nM[windowIndex].getLong(row, this.f304nL.getInt(column))).longValue() == 1;
    }

    public byte[] getByteArray(String column, int row, int windowIndex) {
        m232b(column, row);
        return this.f305nM[windowIndex].getBlob(row, this.f304nL.getInt(column));
    }

    public int getCount() {
        return this.f308nP;
    }

    public int getInteger(String column, int row, int windowIndex) {
        m232b(column, row);
        return this.f305nM[windowIndex].getInt(row, this.f304nL.getInt(column));
    }

    public long getLong(String column, int row, int windowIndex) {
        m232b(column, row);
        return this.f305nM[windowIndex].getLong(row, this.f304nL.getInt(column));
    }

    public Bundle getMetadata() {
        return this.f306nN;
    }

    public int getStatusCode() {
        return this.f302mC;
    }

    public String getString(String column, int row, int windowIndex) {
        m232b(column, row);
        return this.f305nM[windowIndex].getString(row, this.f304nL.getInt(column));
    }

    /* access modifiers changed from: 0000 */
    public int getVersionCode() {
        return this.f301kg;
    }

    public boolean hasColumn(String column) {
        return this.f304nL.containsKey(column);
    }

    public boolean hasNull(String column, int row, int windowIndex) {
        m232b(column, row);
        return this.f305nM[windowIndex].isNull(row, this.f304nL.getInt(column));
    }

    public boolean isClosed() {
        boolean z;
        synchronized (this) {
            z = this.mClosed;
        }
        return z;
    }

    public Uri parseUri(String column, int row, int windowIndex) {
        String string = getString(column, row, windowIndex);
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public void validateContents() {
        this.f304nL = new Bundle();
        for (int i = 0; i < this.f303nK.length; i++) {
            this.f304nL.putInt(this.f303nK[i], i);
        }
        this.f307nO = new int[this.f305nM.length];
        int i2 = 0;
        for (int i3 = 0; i3 < this.f305nM.length; i3++) {
            this.f307nO[i3] = i2;
            i2 += this.f305nM[i3].getNumRows() - (i2 - this.f305nM[i3].getStartPosition());
        }
        this.f308nP = i2;
    }

    public void writeToParcel(Parcel dest, int flags) {
        DataHolderCreator.m242a(this, dest, flags);
    }
}
