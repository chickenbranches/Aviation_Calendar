package com.google.android.gms.plus.model.moments;

import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.internal.C0900ib;
import com.google.android.gms.internal.C0902id;
import java.util.HashSet;
import java.util.Set;

public interface Moment extends Freezable<Moment> {

    public static class Builder {

        /* renamed from: AI */
        private String f2739AI;

        /* renamed from: Eq */
        private final Set<Integer> f2740Eq = new HashSet();

        /* renamed from: Fe */
        private String f2741Fe;

        /* renamed from: Fm */
        private C0900ib f2742Fm;

        /* renamed from: Fn */
        private C0900ib f2743Fn;

        /* renamed from: uS */
        private String f2744uS;

        public Moment build() {
            return new C0902id(this.f2740Eq, this.f2744uS, this.f2742Fm, this.f2741Fe, this.f2743Fn, this.f2739AI);
        }

        public Builder setId(String id) {
            this.f2744uS = id;
            this.f2740Eq.add(Integer.valueOf(2));
            return this;
        }

        public Builder setResult(ItemScope result) {
            this.f2742Fm = (C0900ib) result;
            this.f2740Eq.add(Integer.valueOf(4));
            return this;
        }

        public Builder setStartDate(String startDate) {
            this.f2741Fe = startDate;
            this.f2740Eq.add(Integer.valueOf(5));
            return this;
        }

        public Builder setTarget(ItemScope target) {
            this.f2743Fn = (C0900ib) target;
            this.f2740Eq.add(Integer.valueOf(6));
            return this;
        }

        public Builder setType(String type) {
            this.f2739AI = type;
            this.f2740Eq.add(Integer.valueOf(7));
            return this;
        }
    }

    String getId();

    ItemScope getResult();

    String getStartDate();

    ItemScope getTarget();

    String getType();

    boolean hasId();

    boolean hasResult();

    boolean hasStartDate();

    boolean hasTarget();

    boolean hasType();
}
