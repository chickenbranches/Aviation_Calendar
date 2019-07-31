package com.google.android.gms.maps;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.p000v4.app.Fragment;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.dynamic.C0262a;
import com.google.android.gms.dynamic.C0273c;
import com.google.android.gms.dynamic.C0274d;
import com.google.android.gms.dynamic.LifecycleDelegate;
import com.google.android.gms.internal.C0600eg;
import com.google.android.gms.maps.internal.C1054p;
import com.google.android.gms.maps.internal.C1055q;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.internal.IMapFragmentDelegate;
import com.google.android.gms.maps.model.RuntimeRemoteException;

public class SupportMapFragment extends Fragment {

    /* renamed from: BU */
    private GoogleMap f2515BU;

    /* renamed from: Cf */
    private final C0995b f2516Cf = new C0995b(this);

    /* renamed from: com.google.android.gms.maps.SupportMapFragment$a */
    static class C0994a implements LifecycleDelegate {

        /* renamed from: BW */
        private final IMapFragmentDelegate f2517BW;

        /* renamed from: Cg */
        private final Fragment f2518Cg;

        public C0994a(Fragment fragment, IMapFragmentDelegate iMapFragmentDelegate) {
            this.f2517BW = (IMapFragmentDelegate) C0600eg.m1554f(iMapFragmentDelegate);
            this.f2518Cg = (Fragment) C0600eg.m1554f(fragment);
        }

        /* renamed from: ew */
        public IMapFragmentDelegate mo5519ew() {
            return this.f2517BW;
        }

        public void onCreate(Bundle savedInstanceState) {
            if (savedInstanceState == null) {
                try {
                    savedInstanceState = new Bundle();
                } catch (RemoteException e) {
                    throw new RuntimeRemoteException(e);
                }
            }
            Bundle arguments = this.f2518Cg.getArguments();
            if (arguments != null && arguments.containsKey("MapOptions")) {
                C1054p.m3135a(savedInstanceState, "MapOptions", arguments.getParcelable("MapOptions"));
            }
            this.f2517BW.onCreate(savedInstanceState);
        }

        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            try {
                return (View) C0273c.m633b(this.f2517BW.onCreateView(C0273c.m634h(inflater), C0273c.m634h(container), savedInstanceState));
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onDestroy() {
            try {
                this.f2517BW.onDestroy();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onDestroyView() {
            try {
                this.f2517BW.onDestroyView();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onInflate(Activity activity, Bundle attrs, Bundle savedInstanceState) {
            try {
                this.f2517BW.onInflate(C0273c.m634h(activity), (GoogleMapOptions) attrs.getParcelable("MapOptions"), savedInstanceState);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onLowMemory() {
            try {
                this.f2517BW.onLowMemory();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onPause() {
            try {
                this.f2517BW.onPause();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onResume() {
            try {
                this.f2517BW.onResume();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onSaveInstanceState(Bundle outState) {
            try {
                this.f2517BW.onSaveInstanceState(outState);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
    }

    /* renamed from: com.google.android.gms.maps.SupportMapFragment$b */
    static class C0995b extends C0262a<C0994a> {

        /* renamed from: BX */
        protected C0274d<C0994a> f2519BX;

        /* renamed from: Cg */
        private final Fragment f2520Cg;

        /* renamed from: gs */
        private Activity f2521gs;

        C0995b(Fragment fragment) {
            this.f2520Cg = fragment;
        }

        /* access modifiers changed from: private */
        public void setActivity(Activity activity) {
            this.f2521gs = activity;
            mo5520ex();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo2824a(C0274d<C0994a> dVar) {
            this.f2519BX = dVar;
            mo5520ex();
        }

        /* renamed from: ex */
        public void mo5520ex() {
            if (this.f2521gs != null && this.f2519BX != null && mo2825cZ() == null) {
                try {
                    MapsInitializer.initialize(this.f2521gs);
                    this.f2519BX.mo2835a(new C0994a(this.f2520Cg, C1055q.m3140u(this.f2521gs).mo5649f(C0273c.m634h(this.f2521gs))));
                } catch (RemoteException e) {
                    throw new RuntimeRemoteException(e);
                } catch (GooglePlayServicesNotAvailableException e2) {
                }
            }
        }
    }

    public static SupportMapFragment newInstance() {
        return new SupportMapFragment();
    }

    public static SupportMapFragment newInstance(GoogleMapOptions options) {
        SupportMapFragment supportMapFragment = new SupportMapFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("MapOptions", options);
        supportMapFragment.setArguments(bundle);
        return supportMapFragment;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ew */
    public IMapFragmentDelegate mo5517ew() {
        this.f2516Cf.mo5520ex();
        if (this.f2516Cf.mo2825cZ() == null) {
            return null;
        }
        return ((C0994a) this.f2516Cf.mo2825cZ()).mo5519ew();
    }

    public final GoogleMap getMap() {
        IMapFragmentDelegate ew = mo5517ew();
        if (ew == null) {
            return null;
        }
        try {
            IGoogleMapDelegate map = ew.getMap();
            if (map == null) {
                return null;
            }
            if (this.f2515BU == null || this.f2515BU.mo5385en().asBinder() != map.asBinder()) {
                this.f2515BU = new GoogleMap(map);
            }
            return this.f2515BU;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void onActivityCreated(Bundle savedInstanceState) {
        if (savedInstanceState != null) {
            savedInstanceState.setClassLoader(SupportMapFragment.class.getClassLoader());
        }
        super.onActivityCreated(savedInstanceState);
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f2516Cf.setActivity(activity);
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.f2516Cf.onCreate(savedInstanceState);
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return this.f2516Cf.onCreateView(inflater, container, savedInstanceState);
    }

    public void onDestroy() {
        this.f2516Cf.onDestroy();
        super.onDestroy();
    }

    public void onDestroyView() {
        this.f2516Cf.onDestroyView();
        super.onDestroyView();
    }

    public void onInflate(Activity activity, AttributeSet attrs, Bundle savedInstanceState) {
        super.onInflate(activity, attrs, savedInstanceState);
        this.f2516Cf.setActivity(activity);
        GoogleMapOptions createFromAttributes = GoogleMapOptions.createFromAttributes(activity, attrs);
        Bundle bundle = new Bundle();
        bundle.putParcelable("MapOptions", createFromAttributes);
        this.f2516Cf.onInflate(activity, bundle, savedInstanceState);
    }

    public void onLowMemory() {
        this.f2516Cf.onLowMemory();
        super.onLowMemory();
    }

    public void onPause() {
        this.f2516Cf.onPause();
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.f2516Cf.onResume();
    }

    public void onSaveInstanceState(Bundle outState) {
        if (outState != null) {
            outState.setClassLoader(SupportMapFragment.class.getClassLoader());
        }
        super.onSaveInstanceState(outState);
        this.f2516Cf.onSaveInstanceState(outState);
    }

    public void setArguments(Bundle args) {
        super.setArguments(args);
    }
}
