package com.google.android.gms.maps;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.dynamic.C0262a;
import com.google.android.gms.dynamic.C0273c;
import com.google.android.gms.dynamic.C0274d;
import com.google.android.gms.dynamic.LifecycleDelegate;
import com.google.android.gms.internal.C0600eg;
import com.google.android.gms.maps.internal.C1055q;
import com.google.android.gms.maps.internal.IMapViewDelegate;
import com.google.android.gms.maps.model.RuntimeRemoteException;

public class MapView extends FrameLayout {

    /* renamed from: BU */
    private GoogleMap f2506BU;

    /* renamed from: BY */
    private final C0993b f2507BY;

    /* renamed from: com.google.android.gms.maps.MapView$a */
    static class C0992a implements LifecycleDelegate {

        /* renamed from: BZ */
        private final ViewGroup f2508BZ;

        /* renamed from: Ca */
        private final IMapViewDelegate f2509Ca;

        /* renamed from: Cb */
        private View f2510Cb;

        public C0992a(ViewGroup viewGroup, IMapViewDelegate iMapViewDelegate) {
            this.f2509Ca = (IMapViewDelegate) C0600eg.m1554f(iMapViewDelegate);
            this.f2508BZ = (ViewGroup) C0600eg.m1554f(viewGroup);
        }

        /* renamed from: ey */
        public IMapViewDelegate mo5512ey() {
            return this.f2509Ca;
        }

        public void onCreate(Bundle savedInstanceState) {
            try {
                this.f2509Ca.onCreate(savedInstanceState);
                this.f2510Cb = (View) C0273c.m633b(this.f2509Ca.getView());
                this.f2508BZ.removeAllViews();
                this.f2508BZ.addView(this.f2510Cb);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            throw new UnsupportedOperationException("onCreateView not allowed on MapViewDelegate");
        }

        public void onDestroy() {
            try {
                this.f2509Ca.onDestroy();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onDestroyView() {
            throw new UnsupportedOperationException("onDestroyView not allowed on MapViewDelegate");
        }

        public void onInflate(Activity activity, Bundle attrs, Bundle savedInstanceState) {
            throw new UnsupportedOperationException("onInflate not allowed on MapViewDelegate");
        }

        public void onLowMemory() {
            try {
                this.f2509Ca.onLowMemory();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onPause() {
            try {
                this.f2509Ca.onPause();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onResume() {
            try {
                this.f2509Ca.onResume();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onSaveInstanceState(Bundle outState) {
            try {
                this.f2509Ca.onSaveInstanceState(outState);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
    }

    /* renamed from: com.google.android.gms.maps.MapView$b */
    static class C0993b extends C0262a<C0992a> {

        /* renamed from: BX */
        protected C0274d<C0992a> f2511BX;

        /* renamed from: Cc */
        private final ViewGroup f2512Cc;

        /* renamed from: Cd */
        private final GoogleMapOptions f2513Cd;
        private final Context mContext;

        C0993b(ViewGroup viewGroup, Context context, GoogleMapOptions googleMapOptions) {
            this.f2512Cc = viewGroup;
            this.mContext = context;
            this.f2513Cd = googleMapOptions;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo2824a(C0274d<C0992a> dVar) {
            this.f2511BX = dVar;
            mo5513ex();
        }

        /* renamed from: ex */
        public void mo5513ex() {
            if (this.f2511BX != null && mo2825cZ() == null) {
                try {
                    this.f2511BX.mo2835a(new C0992a(this.f2512Cc, C1055q.m3140u(this.mContext).mo5644a(C0273c.m634h(this.mContext), this.f2513Cd)));
                } catch (RemoteException e) {
                    throw new RuntimeRemoteException(e);
                } catch (GooglePlayServicesNotAvailableException e2) {
                }
            }
        }
    }

    public MapView(Context context) {
        super(context);
        this.f2507BY = new C0993b(this, context, null);
    }

    public MapView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f2507BY = new C0993b(this, context, GoogleMapOptions.createFromAttributes(context, attrs));
    }

    public MapView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.f2507BY = new C0993b(this, context, GoogleMapOptions.createFromAttributes(context, attrs));
    }

    public MapView(Context context, GoogleMapOptions options) {
        super(context);
        this.f2507BY = new C0993b(this, context, options);
    }

    public final GoogleMap getMap() {
        if (this.f2506BU != null) {
            return this.f2506BU;
        }
        this.f2507BY.mo5513ex();
        if (this.f2507BY.mo2825cZ() == null) {
            return null;
        }
        try {
            this.f2506BU = new GoogleMap(((C0992a) this.f2507BY.mo2825cZ()).mo5512ey().getMap());
            return this.f2506BU;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void onCreate(Bundle savedInstanceState) {
        this.f2507BY.onCreate(savedInstanceState);
        if (this.f2507BY.mo2825cZ() == null) {
            this.f2507BY.mo2823a((FrameLayout) this);
        }
    }

    public final void onDestroy() {
        this.f2507BY.onDestroy();
    }

    public final void onLowMemory() {
        this.f2507BY.onLowMemory();
    }

    public final void onPause() {
        this.f2507BY.onPause();
    }

    public final void onResume() {
        this.f2507BY.onResume();
    }

    public final void onSaveInstanceState(Bundle outState) {
        this.f2507BY.onSaveInstanceState(outState);
    }
}
