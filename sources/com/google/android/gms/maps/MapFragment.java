package com.google.android.gms.maps;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.os.RemoteException;
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

public class MapFragment extends Fragment {

    /* renamed from: BT */
    private final C0991b f2499BT = new C0991b(this);

    /* renamed from: BU */
    private GoogleMap f2500BU;

    /* renamed from: com.google.android.gms.maps.MapFragment$a */
    static class C0990a implements LifecycleDelegate {

        /* renamed from: BV */
        private final Fragment f2501BV;

        /* renamed from: BW */
        private final IMapFragmentDelegate f2502BW;

        public C0990a(Fragment fragment, IMapFragmentDelegate iMapFragmentDelegate) {
            this.f2502BW = (IMapFragmentDelegate) C0600eg.m1554f(iMapFragmentDelegate);
            this.f2501BV = (Fragment) C0600eg.m1554f(fragment);
        }

        /* renamed from: ew */
        public IMapFragmentDelegate mo5503ew() {
            return this.f2502BW;
        }

        public void onCreate(Bundle savedInstanceState) {
            if (savedInstanceState == null) {
                try {
                    savedInstanceState = new Bundle();
                } catch (RemoteException e) {
                    throw new RuntimeRemoteException(e);
                }
            }
            Bundle arguments = this.f2501BV.getArguments();
            if (arguments != null && arguments.containsKey("MapOptions")) {
                C1054p.m3135a(savedInstanceState, "MapOptions", arguments.getParcelable("MapOptions"));
            }
            this.f2502BW.onCreate(savedInstanceState);
        }

        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            try {
                return (View) C0273c.m633b(this.f2502BW.onCreateView(C0273c.m634h(inflater), C0273c.m634h(container), savedInstanceState));
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onDestroy() {
            try {
                this.f2502BW.onDestroy();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onDestroyView() {
            try {
                this.f2502BW.onDestroyView();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onInflate(Activity activity, Bundle attrs, Bundle savedInstanceState) {
            try {
                this.f2502BW.onInflate(C0273c.m634h(activity), (GoogleMapOptions) attrs.getParcelable("MapOptions"), savedInstanceState);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onLowMemory() {
            try {
                this.f2502BW.onLowMemory();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onPause() {
            try {
                this.f2502BW.onPause();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onResume() {
            try {
                this.f2502BW.onResume();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onSaveInstanceState(Bundle outState) {
            try {
                this.f2502BW.onSaveInstanceState(outState);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
    }

    /* renamed from: com.google.android.gms.maps.MapFragment$b */
    static class C0991b extends C0262a<C0990a> {

        /* renamed from: BV */
        private final Fragment f2503BV;

        /* renamed from: BX */
        protected C0274d<C0990a> f2504BX;

        /* renamed from: gs */
        private Activity f2505gs;

        C0991b(Fragment fragment) {
            this.f2503BV = fragment;
        }

        /* access modifiers changed from: private */
        public void setActivity(Activity activity) {
            this.f2505gs = activity;
            mo5504ex();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo2824a(C0274d<C0990a> dVar) {
            this.f2504BX = dVar;
            mo5504ex();
        }

        /* renamed from: ex */
        public void mo5504ex() {
            if (this.f2505gs != null && this.f2504BX != null && mo2825cZ() == null) {
                try {
                    MapsInitializer.initialize(this.f2505gs);
                    this.f2504BX.mo2835a(new C0990a(this.f2503BV, C1055q.m3140u(this.f2505gs).mo5649f(C0273c.m634h(this.f2505gs))));
                } catch (RemoteException e) {
                    throw new RuntimeRemoteException(e);
                } catch (GooglePlayServicesNotAvailableException e2) {
                }
            }
        }
    }

    public static MapFragment newInstance() {
        return new MapFragment();
    }

    public static MapFragment newInstance(GoogleMapOptions options) {
        MapFragment mapFragment = new MapFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("MapOptions", options);
        mapFragment.setArguments(bundle);
        return mapFragment;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ew */
    public IMapFragmentDelegate mo5489ew() {
        this.f2499BT.mo5504ex();
        if (this.f2499BT.mo2825cZ() == null) {
            return null;
        }
        return ((C0990a) this.f2499BT.mo2825cZ()).mo5503ew();
    }

    public final GoogleMap getMap() {
        IMapFragmentDelegate ew = mo5489ew();
        if (ew == null) {
            return null;
        }
        try {
            IGoogleMapDelegate map = ew.getMap();
            if (map == null) {
                return null;
            }
            if (this.f2500BU == null || this.f2500BU.mo5385en().asBinder() != map.asBinder()) {
                this.f2500BU = new GoogleMap(map);
            }
            return this.f2500BU;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void onActivityCreated(Bundle savedInstanceState) {
        if (savedInstanceState != null) {
            savedInstanceState.setClassLoader(MapFragment.class.getClassLoader());
        }
        super.onActivityCreated(savedInstanceState);
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f2499BT.setActivity(activity);
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.f2499BT.onCreate(savedInstanceState);
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return this.f2499BT.onCreateView(inflater, container, savedInstanceState);
    }

    public void onDestroy() {
        this.f2499BT.onDestroy();
        super.onDestroy();
    }

    public void onDestroyView() {
        this.f2499BT.onDestroyView();
        super.onDestroyView();
    }

    public void onInflate(Activity activity, AttributeSet attrs, Bundle savedInstanceState) {
        super.onInflate(activity, attrs, savedInstanceState);
        this.f2499BT.setActivity(activity);
        GoogleMapOptions createFromAttributes = GoogleMapOptions.createFromAttributes(activity, attrs);
        Bundle bundle = new Bundle();
        bundle.putParcelable("MapOptions", createFromAttributes);
        this.f2499BT.onInflate(activity, bundle, savedInstanceState);
    }

    public void onLowMemory() {
        this.f2499BT.onLowMemory();
        super.onLowMemory();
    }

    public void onPause() {
        this.f2499BT.onPause();
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.f2499BT.onResume();
    }

    public void onSaveInstanceState(Bundle outState) {
        if (outState != null) {
            outState.setClassLoader(MapFragment.class.getClassLoader());
        }
        super.onSaveInstanceState(outState);
        this.f2499BT.onSaveInstanceState(outState);
    }

    public void setArguments(Bundle args) {
        super.setArguments(args);
    }
}
