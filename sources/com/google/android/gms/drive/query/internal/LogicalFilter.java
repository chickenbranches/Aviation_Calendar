package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.query.Filter;
import java.util.ArrayList;
import java.util.List;

public class LogicalFilter implements SafeParcelable, Filter {
    public static final Creator<LogicalFilter> CREATOR = new C0259f();

    /* renamed from: kg */
    final int f520kg;

    /* renamed from: rQ */
    private List<Filter> f521rQ;

    /* renamed from: rR */
    final Operator f522rR;

    /* renamed from: sb */
    final List<FilterHolder> f523sb;

    LogicalFilter(int versionCode, Operator operator, List<FilterHolder> filterHolders) {
        this.f520kg = versionCode;
        this.f522rR = operator;
        this.f523sb = filterHolders;
    }

    public LogicalFilter(Operator operator, Filter filter, Filter... additionalFilters) {
        this.f520kg = 1;
        this.f522rR = operator;
        this.f523sb = new ArrayList(additionalFilters.length + 1);
        this.f523sb.add(new FilterHolder(filter));
        this.f521rQ = new ArrayList(additionalFilters.length + 1);
        this.f521rQ.add(filter);
        for (Filter filter2 : additionalFilters) {
            this.f523sb.add(new FilterHolder(filter2));
            this.f521rQ.add(filter2);
        }
    }

    public LogicalFilter(Operator operator, List<Filter> filters) {
        this.f520kg = 1;
        this.f522rR = operator;
        this.f521rQ = filters;
        this.f523sb = new ArrayList(filters.size());
        for (Filter filterHolder : filters) {
            this.f523sb.add(new FilterHolder(filterHolder));
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel out, int flags) {
        C0259f.m607a(this, out, flags);
    }
}
