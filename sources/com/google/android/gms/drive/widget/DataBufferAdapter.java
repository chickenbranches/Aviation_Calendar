package com.google.android.gms.drive.widget;

import android.content.Context;
import android.database.CursorIndexOutOfBoundsException;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.gms.common.data.DataBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DataBufferAdapter<T> extends BaseAdapter {
    private final Context mContext;

    /* renamed from: sm */
    private final int f536sm;

    /* renamed from: sn */
    private int f537sn;

    /* renamed from: so */
    private final int f538so;

    /* renamed from: sp */
    private final List<DataBuffer<T>> f539sp;

    /* renamed from: sq */
    private final LayoutInflater f540sq;

    /* renamed from: sr */
    private boolean f541sr;

    public DataBufferAdapter(Context context, int resource) {
        this(context, resource, 0, (List<DataBuffer<T>>) new ArrayList<DataBuffer<T>>());
    }

    public DataBufferAdapter(Context context, int resource, int textViewResourceId) {
        this(context, resource, textViewResourceId, (List<DataBuffer<T>>) new ArrayList<DataBuffer<T>>());
    }

    public DataBufferAdapter(Context context, int resource, int textViewResourceId, List<DataBuffer<T>> objects) {
        this.f541sr = true;
        this.mContext = context;
        this.f537sn = resource;
        this.f536sm = resource;
        this.f538so = textViewResourceId;
        this.f539sp = objects;
        this.f540sq = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public DataBufferAdapter(Context context, int resource, int textViewResourceId, DataBuffer<T>... buffers) {
        this(context, resource, textViewResourceId, Arrays.asList(buffers));
    }

    public DataBufferAdapter(Context context, int resource, List<DataBuffer<T>> objects) {
        this(context, resource, 0, objects);
    }

    public DataBufferAdapter(Context context, int resource, DataBuffer<T>... buffers) {
        this(context, resource, 0, Arrays.asList(buffers));
    }

    /* renamed from: a */
    private View m616a(int i, View view, ViewGroup viewGroup, int i2) {
        View view2 = view == null ? this.f540sq.inflate(i2, viewGroup, false) : view;
        try {
            TextView textView = this.f538so == 0 ? (TextView) view2 : (TextView) view2.findViewById(this.f538so);
            Object item = getItem(i);
            if (item instanceof CharSequence) {
                textView.setText((CharSequence) item);
            } else {
                textView.setText(item.toString());
            }
            return view2;
        } catch (ClassCastException e) {
            Log.e("DataBufferAdapter", "You must supply a resource ID for a TextView");
            throw new IllegalStateException("DataBufferAdapter requires the resource ID to be a TextView", e);
        }
    }

    public void append(DataBuffer<T> buffer) {
        this.f539sp.add(buffer);
        if (this.f541sr) {
            notifyDataSetChanged();
        }
    }

    public void clear() {
        for (DataBuffer close : this.f539sp) {
            close.close();
        }
        this.f539sp.clear();
        if (this.f541sr) {
            notifyDataSetChanged();
        }
    }

    public Context getContext() {
        return this.mContext;
    }

    public int getCount() {
        int i = 0;
        Iterator it = this.f539sp.iterator();
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                return i2;
            }
            i = ((DataBuffer) it.next()).getCount() + i2;
        }
    }

    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        return m616a(position, convertView, parent, this.f537sn);
    }

    public T getItem(int position) throws CursorIndexOutOfBoundsException {
        int i = position;
        for (DataBuffer dataBuffer : this.f539sp) {
            int count = dataBuffer.getCount();
            if (count <= i) {
                i -= count;
            } else {
                try {
                    return dataBuffer.get(i);
                } catch (CursorIndexOutOfBoundsException e) {
                    throw new CursorIndexOutOfBoundsException(position, getCount());
                }
            }
        }
        throw new CursorIndexOutOfBoundsException(position, getCount());
    }

    public long getItemId(int position) {
        return (long) position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        return m616a(position, convertView, parent, this.f536sm);
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        this.f541sr = true;
    }

    public void setDropDownViewResource(int resource) {
        this.f537sn = resource;
    }

    public void setNotifyOnChange(boolean notifyOnChange) {
        this.f541sr = notifyOnChange;
    }
}
