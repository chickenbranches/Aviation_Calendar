package com.google.android.gms.dynamic;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.dynamic.LifecycleDelegate;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.google.android.gms.dynamic.a */
public abstract class C0262a<T extends LifecycleDelegate> {
    /* access modifiers changed from: private */

    /* renamed from: ss */
    public T f542ss;
    /* access modifiers changed from: private */

    /* renamed from: st */
    public Bundle f543st;
    /* access modifiers changed from: private */

    /* renamed from: su */
    public LinkedList<C0269a> f544su;

    /* renamed from: sv */
    private final C0274d<T> f545sv = new C0274d<T>() {
        /* renamed from: a */
        public void mo2835a(T t) {
            C0262a.this.f542ss = t;
            Iterator it = C0262a.this.f544su.iterator();
            while (it.hasNext()) {
                ((C0269a) it.next()).mo2836b(C0262a.this.f542ss);
            }
            C0262a.this.f544su.clear();
            C0262a.this.f543st = null;
        }
    };

    /* renamed from: com.google.android.gms.dynamic.a$a */
    private interface C0269a {
        /* renamed from: b */
        void mo2836b(LifecycleDelegate lifecycleDelegate);

        int getState();
    }

    /* renamed from: a */
    private void m620a(Bundle bundle, C0269a aVar) {
        if (this.f542ss != null) {
            aVar.mo2836b(this.f542ss);
            return;
        }
        if (this.f544su == null) {
            this.f544su = new LinkedList<>();
        }
        this.f544su.add(aVar);
        if (bundle != null) {
            if (this.f543st == null) {
                this.f543st = (Bundle) bundle.clone();
            } else {
                this.f543st.putAll(bundle);
            }
        }
        mo2824a(this.f545sv);
    }

    /* renamed from: ay */
    private void m621ay(int i) {
        while (!this.f544su.isEmpty() && ((C0269a) this.f544su.getLast()).getState() >= i) {
            this.f544su.removeLast();
        }
    }

    /* renamed from: a */
    public void mo2823a(FrameLayout frameLayout) {
        final Context context = frameLayout.getContext();
        final int isGooglePlayServicesAvailable = GooglePlayServicesUtil.isGooglePlayServicesAvailable(context);
        String b = GooglePlayServicesUtil.m171b(context, isGooglePlayServicesAvailable, -1);
        String b2 = GooglePlayServicesUtil.m170b(context, isGooglePlayServicesAvailable);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        TextView textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams(new LayoutParams(-2, -2));
        textView.setText(b);
        linearLayout.addView(textView);
        if (b2 != null) {
            Button button = new Button(context);
            button.setLayoutParams(new LayoutParams(-2, -2));
            button.setText(b2);
            linearLayout.addView(button);
            button.setOnClickListener(new OnClickListener() {
                public void onClick(View v) {
                    context.startActivity(GooglePlayServicesUtil.m166a(context, isGooglePlayServicesAvailable, -1));
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo2824a(C0274d<T> dVar);

    /* renamed from: cZ */
    public T mo2825cZ() {
        return this.f542ss;
    }

    public void onCreate(final Bundle savedInstanceState) {
        m620a(savedInstanceState, (C0269a) new C0269a() {
            /* renamed from: b */
            public void mo2836b(LifecycleDelegate lifecycleDelegate) {
                C0262a.this.f542ss.onCreate(savedInstanceState);
            }

            public int getState() {
                return 1;
            }
        });
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final FrameLayout frameLayout = new FrameLayout(inflater.getContext());
        final LayoutInflater layoutInflater = inflater;
        final ViewGroup viewGroup = container;
        final Bundle bundle = savedInstanceState;
        m620a(savedInstanceState, (C0269a) new C0269a() {
            /* renamed from: b */
            public void mo2836b(LifecycleDelegate lifecycleDelegate) {
                frameLayout.removeAllViews();
                frameLayout.addView(C0262a.this.f542ss.onCreateView(layoutInflater, viewGroup, bundle));
            }

            public int getState() {
                return 2;
            }
        });
        if (this.f542ss == null) {
            mo2823a(frameLayout);
        }
        return frameLayout;
    }

    public void onDestroy() {
        if (this.f542ss != null) {
            this.f542ss.onDestroy();
        } else {
            m621ay(1);
        }
    }

    public void onDestroyView() {
        if (this.f542ss != null) {
            this.f542ss.onDestroyView();
        } else {
            m621ay(2);
        }
    }

    public void onInflate(final Activity activity, final Bundle attrs, final Bundle savedInstanceState) {
        m620a(savedInstanceState, (C0269a) new C0269a() {
            /* renamed from: b */
            public void mo2836b(LifecycleDelegate lifecycleDelegate) {
                C0262a.this.f542ss.onInflate(activity, attrs, savedInstanceState);
            }

            public int getState() {
                return 0;
            }
        });
    }

    public void onLowMemory() {
        if (this.f542ss != null) {
            this.f542ss.onLowMemory();
        }
    }

    public void onPause() {
        if (this.f542ss != null) {
            this.f542ss.onPause();
        } else {
            m621ay(3);
        }
    }

    public void onResume() {
        m620a((Bundle) null, (C0269a) new C0269a() {
            /* renamed from: b */
            public void mo2836b(LifecycleDelegate lifecycleDelegate) {
                C0262a.this.f542ss.onResume();
            }

            public int getState() {
                return 3;
            }
        });
    }

    public void onSaveInstanceState(Bundle outState) {
        if (this.f542ss != null) {
            this.f542ss.onSaveInstanceState(outState);
        } else if (this.f543st != null) {
            outState.putAll(this.f543st);
        }
    }
}
